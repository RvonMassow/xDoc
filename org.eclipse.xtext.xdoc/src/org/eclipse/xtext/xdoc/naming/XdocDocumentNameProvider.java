package org.eclipse.xtext.xdoc.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.LangDef;

public class XdocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	QualifiedName qualifiedName(Identifiable identifiable) {
		if (!Strings.isEmpty(identifiable.getName()))
			return QualifiedName.create(identifiable.getName());
		return null;
	}
	QualifiedName qualifiedName(LangDef languageDefinition) {
		if (!Strings.isEmpty(languageDefinition.getName()))
			return QualifiedName.create(languageDefinition.getName());
		return null;
	}
	
}
