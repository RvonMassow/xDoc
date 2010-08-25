package org.eclipse.xtext.xdoc.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;

public class XDocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public String getQualifiedName(EObject obj) {
		if(obj instanceof Identifiable){
			return ((Identifiable)obj).getName();
		}
		return obj instanceof Document ? "name": super.getQualifiedName(obj);
	}

}
