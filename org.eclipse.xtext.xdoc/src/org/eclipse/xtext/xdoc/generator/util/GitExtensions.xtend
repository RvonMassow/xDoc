package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.common.types.JvmIdentifiableElement

class GitExtensions {
	
	def gitLink (JvmIdentifiableElement ie){
		val compilationUnitName = ie.compilationUnitName
		val basedir = "https://github.com/svenefftinge/Xtext-2.0-released-source-code/tree/master/"
		val prefix = 
			switch name: ie.qualifiedName {
				case null :
					return "broken-link in "+ie
				case name.startsWith("org.eclipse.xtext.common.types.xtext.ui"):
					"plugins/org.eclipse.xtext.common.types.ui/src/"
	//			case name.startsWith("org.eclipse.xtext.common.types"):
	//				"plugins/org.eclipse.xtext.common.types/src/"
				case name.startsWith("org.eclipse.xtext.ui.shared."):
					"plugins/org.eclipse.xtext.ui.shared/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.lib."):
					"plugins/org.eclipse.xtext.xtend2.lib/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.ui."):
					"plugins/org.eclipse.xtext.xtend2.ui/src/"
				case name.startsWith("org.eclipse.xtext.xtend2."):
					"plugins/org.eclipse.xtext.xtend2/src/"
				case name.startsWith("org.eclipse.xtext.xbase.ui."):
					"plugins/org.eclipse.xtext.xbase.ui/src/"
				case name.startsWith("org.eclipse.xtext.xbase.lib."):
					"plugins/org.eclipse.xtext.xbase.lib/src/"
				case name.startsWith("org.eclipse.xtext.xbase."):
					"plugins/org.eclipse.xtext.xbase/src/"
				case name.startsWith("org.eclipse.xtext.generator") ||
						name.startsWith("org.eclipse.xtext.ui.generator"):
					"plugins/org.eclipse.xtext.generator/src/"
				case name.startsWith("org.eclipse.xtext.ui"):
					"plugins/org.eclipse.xtext.ui/src/"			
				case name.startsWith("org.eclipse.xtext.junit"):
					"plugins/org.eclipse.xtext.junit/src/"
				case name.startsWith("org.eclipse.xtext.xtext"):
					"plugins/org.eclipse.xtext.xtext/src/"
				case name.startsWith("org.eclipse.xtext.ui"):// org.eclipse.xtext.common.services.DefaultTerminalConverters
					"plugins/org.eclipse.xtext.ui/src/"
				case name.startsWith("org.eclipse.xtext"):// org.eclipse.xtext.common.services.DefaultTerminalConverters
					"plugins/org.eclipse.xtext/src/"
				default:
					""
			}
		if(prefix.length != 0)
			basedir + prefix + ie.qualifiedName.replaceAll("\\.", "/").replaceAll("\\$.*$", "") + ".java"
		else
			null
	}


//org.eclipse.xtext.mwe.Reader



//org.eclipse.xtext.service.DispatchingProvider$Runtime
/*
org.eclipse.xtext.ui.label.AbstractLabelProvider
org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider
org.eclipse.xtext.ui.shared.internal.SharedModule
org.eclipse.xtext.validation.AbstractDeclarativeValidator
org.eclipse.xtext.validation.Check
org.eclipse.xtext.validation.IConcreteSyntaxDiagnosticProvider
org.eclipse.xtext.validation.IConcreteSyntaxValidator
org.eclipse.xtext.validation.impl.ConcreteSyntaxDiagnosticProvider
org.eclipse.xtext.validation.impl.ConcreteSyntaxEValidator
org.eclipse.xtext.validation.impl.ConcreteSyntaxValidator
*/
	def compilationUnitName(JvmIdentifiableElement ie) {
		ie.simpleName
	}
}