package org.eclipse.xtext.xdoc.validation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xdoc.generator.util.LatexUtils;
import org.eclipse.xtext.xdoc.resource.XdocResourceDescriptionManager;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class XdocJavaValidator extends AbstractXdocJavaValidator {

	private static int MAX_CHARS_PER_LINE = 74;

	@Inject
	private IResourceDescriptions index;
	@Inject
	private XdocResourceDescriptionManager rdm;

	@Check
	public void checkLineLengthOfCodeSection(Code c) {
		String[] lines = c.getContents().split("\n");
		for (String string : lines) {
			if (string.replaceAll("\t", "    ").length() >= MAX_CHARS_PER_LINE) {
				warning("Longest Line exceeds "+MAX_CHARS_PER_LINE+". Line will be wrapped in PDF output",
						XdocPackage.Literals.CODE__CONTENTS);
			}
		}
	}

	@Check
	public void checkConsistentNumberOfColumns(Table t) {
		int columns = -1;
		EList<TableRow> rows = t.getRows();
		for (TableRow tableRow : rows) {
			if (columns==-1)
				columns = tableRow.getData().size();
			if (tableRow.getData().size()!=columns) {
				error("Each row must have the same number of entries (expected "+columns+" but was "+tableRow.getData().size()+")",
						tableRow,
						XdocPackage.Literals.TABLE_ROW__DATA,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
			}
		}
	}

//	@Check
	public void checkSuspiciousCodeRef(CodeRef codeRef) {
		EList<EObject> contents = codeRef.eContainer().eContents();
		int index = contents.indexOf(codeRef);
		if(contents.size() > index + 1&& contents.get(index + 1) instanceof TextPart){
			ICompositeNode node = NodeModelUtils.findActualNodeFor(codeRef);
			//		if (node.getNextSibling() != null && NodeModelUtils.
			String completeText = node.getRootNode().getText();
			if (node.getTotalEndOffset() < completeText.length() - 1) {
				int endOffset = node.getOffset() + node.getLength();
				char c = completeText.charAt(endOffset);
				if (!Character.isWhitespace(c) && c != ',' && c != '.' && c != ']' && c != ':' && c != '-') {
					warning("Code Reference is followed by a suspicious character.", null);
				}
				if (c == '.' && endOffset + 1 < completeText.length() && Character.isJavaIdentifierStart(completeText.charAt(endOffset + 1))) {
					warning("Code Reference is followed by a suspicious character sequence.", null);
				}
			}
		}
	}

	@Check
	public void checkAbstractSectionHasTitle(AbstractSection section) {
		if(section.getTitle() == null)
			warning("This element should have a title.", null,0);
	}

	@Check
	public void checkNoCodeInTitle(CodeBlock code) {
		if(!LatexUtils.inline(code)) {
			EObject tom = code.eContainer();
			while(!(tom.eContainer() instanceof AbstractSection)){
				tom = tom.eContainer();
			}
			if(tom.eContainer() instanceof AbstractSection) {
				AbstractSection section = (AbstractSection) tom.eContainer();
				if(section.getTitle() == tom) {
					error("Headings can not contain code blocks", null);
				}
			}
		}
	}

//	@Check
//	public void checkSuspiciousEmphasize(Emphasize e) {
//		ICompositeNode node = NodeModelUtils.findActualNodeFor(e);
//		String completeText = node.getRootNode().getText();
//		String nodeText = completeText.substring(node.getOffset(), node.getOffset() + node.getLength());
//		nodeText = nodeText.substring(2, nodeText.length() - 1);
//		if (nodeText.length() > 0) {
//			if (nodeText.endsWith(")"))
//				warning("Suspicious content in emphasize", null);
//		}
//	}

	@Check()
	public void checkReferencedLabelIncluded(Ref ref) {
		IResourceDescription rd = rdm.getResourceDescription(ref.eResource());
		Set<QualifiedName> exportedNames = Sets.newHashSet(Iterables.transform(rd.getExportedObjects(),
				new Function<IEObjectDescription, QualifiedName>(){
			public QualifiedName apply(IEObjectDescription from) {
				return from.getName();
			}
		}));
		boolean included = false;
		for(IResourceDescription rdi: index.getAllResourceDescriptions())
			if(transitivelyIncluded(exportedNames, rdi, index, new HashSet<IResourceDescription>())){
				included = true;
				break;
			}

		if(!included)
			warning("Referenced target does not seem to be included in any document", null);
	}

	@Check
	public void checkImagePath(ImageRef image) {
		URI inPath = URI.createURI(image.eResource().getURI().trimSegments(1).toString() + "/" + image.getPath());
		if(!image.eResource().getResourceSet().getURIConverter().exists(inPath, null))
			error("Cannot find image", XdocPackage.Literals.IMAGE_REF__PATH);
	}



	@Override
	protected List<EPackage> getEPackages() {
		return Collections.singletonList((EPackage)XdocPackage.eINSTANCE);
	}

	private boolean transitivelyIncluded(Set<QualifiedName> exportedNames, IResourceDescription cand, IResourceDescriptions context, Collection<IResourceDescription> checked) {

		checked.add(cand);
		if(!Collections.disjoint(exportedNames, Sets.newHashSet(cand.getImportedNames()))){
			return true;
		} else if(cand.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT).iterator().hasNext()) {
			return false;
		} else {
			for (IReferenceDescription referenceDescription: cand.getReferenceDescriptions()) {
				EReference eReference = referenceDescription.getEReference();
				if(eReference!= null) {
					EClassifier eType = eReference.getEType();
					if(eType == XdocPackage.Literals.CHAPTER_REF || eType == XdocPackage.Literals.SECTION_REF || eType == XdocPackage.Literals.SECTION2_REF
							|| eType == XdocPackage.Literals.CODE_BLOCK) {
						URI targetFile = referenceDescription.getTargetEObjectUri().trimFragment();
						IResourceDescription nextCand = context.getResourceDescription(targetFile);
						if(!checked.contains(nextCand))
							if(transitivelyIncluded(exportedNames, nextCand, context, checked))
								return true;
					}
				}
			}
			return false;
		}
	}
}
