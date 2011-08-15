package org.eclipse.xtext.xdoc.validation;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocJavaValidator extends AbstractXdocJavaValidator {

	private static int MAX_CHARS_PER_LINE = 74;

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

	@Check
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
					error("Code Reference is followed by a suspicious character.", null);
				}
				if (c == '.' && endOffset + 1 < completeText.length() && Character.isJavaIdentifierStart(completeText.charAt(endOffset + 1))) {
					error("Code Reference is followed by a suspicious character sequence.", null);
				}
			}
		}
	}

	public void checkAbstractSectionHasTitle(AbstractSection section) {
		if(section.getTitle() == null)
			warning("This element should have a title.", null);
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
}
