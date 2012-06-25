package org.eclipse.xtext.xdoc.validation;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xdoc.generator.util.LatexUtils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocJavaValidator extends AbstractXdocJavaValidator {

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

	@Check
	public void checkImagePath(ImageRef image) {
		URI inPath = URI.createURI(image.eResource().getURI().trimSegments(1).toString() + "/" + image.getPath());
		if(!image.eResource().getResourceSet().getURIConverter().exists(inPath, null))
			error("Cannot find image", XdocPackage.Literals.IMAGE_REF__PATH);
	}

	@Check 
	public void checkNestedLinkElements(EObject linkElement) {
		if(isLinkElement(linkElement)) {
			EObject currentElement = linkElement.eContainer(); 
			while(currentElement != null) {
				if(isLinkElement(currentElement)) {
					error("Cannot nest link element " 
							+ linkElement.eClass().getName() 
							+ " in " 
							+ currentElement.eClass().getName(), 
							null);
				}
				currentElement = currentElement.eContainer();
			}
		}
	}
	
	private boolean isLinkElement(EObject element) {
		return element instanceof Ref || element instanceof CodeRef;
	}
	
	@Override
	protected List<EPackage> getEPackages() {
		return Collections.singletonList((EPackage)XdocPackage.eINSTANCE);
	}
}
