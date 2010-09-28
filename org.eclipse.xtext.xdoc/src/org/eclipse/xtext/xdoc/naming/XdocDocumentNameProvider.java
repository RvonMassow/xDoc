package org.eclipse.xtext.xdoc.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.xdoc.XdocUtil;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;

public class XdocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	String qualifiedName(Identifiable identifiable) {
		return identifiable.getName();
	}
	
	String qualifiedName(Document doc) {
		return doc.getName()==null?XdocUtil.toString(doc.getTitle()):doc.getName();
	}
}
