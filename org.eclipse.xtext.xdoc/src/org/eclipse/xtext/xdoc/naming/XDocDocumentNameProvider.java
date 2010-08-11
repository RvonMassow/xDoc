package org.eclipse.xtext.xdoc.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.xdoc.xDoc.Document;

public class XDocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public String getQualifiedName(EObject obj) {
		return obj instanceof Document ? "name": super.getQualifiedName(obj);
	}

}
