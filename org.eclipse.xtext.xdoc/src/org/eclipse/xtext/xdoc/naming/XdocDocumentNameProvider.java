package org.eclipse.xtext.xdoc.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.LangDef;

public class XdocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	QualifiedName qualifiedName(Identifiable identifiable) {
		return QualifiedName.create(identifiable.getName());
	}
	QualifiedName qualifiedName(LangDef languageDefinition) {
		return QualifiedName.create(languageDefinition.getName());
	}
	
}
