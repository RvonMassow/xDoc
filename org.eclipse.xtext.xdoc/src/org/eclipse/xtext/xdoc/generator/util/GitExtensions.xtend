package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.common.types.JvmIdentifiableElement

class GitExtensions {
	
	def gitLink (JvmIdentifiableElement ie){
		val basedir = "https://github.com/eclipse/xtext/blob/v2.2.0/"
		val prefix = 
			switch name: ie.qualifiedName {
				case null :
					return "broken-link in "+ie
				case name.startsWith("org.eclipse.xtext.common.types.xtext.ui"): "plugins/org.eclipse.xtext.common.types.ui/src/"
				case name.startsWith("org.eclipse.xtext.common.types."):         "plugins/org.eclipse.xtext.common.types/src/"
				case name.startsWith("org.eclipse.xtext.ui.shared."): 	         "plugins/org.eclipse.xtext.ui.shared/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.lib."):           "plugins/org.eclipse.xtext.xtend2.lib/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.ui."):            "plugins/org.eclipse.xtext.xtend2.ui/src/"
				case name.startsWith("org.eclipse.xtext.xtend2."):               "plugins/org.eclipse.xtext.xtend2/src/"
				case name.startsWith("org.eclipse.xtext.xbase.ui."):             "plugins/org.eclipse.xtext.xbase.ui/src/"
				case name.startsWith("org.eclipse.xtext.xbase.lib."):            "plugins/org.eclipse.xtext.xbase.lib/src/"
				case name.startsWith("org.eclipse.xtext.xbase."):                "plugins/org.eclipse.xtext.xbase/src/"
				case name.startsWith("org.eclipse.xtext.generator") ||
				     name.startsWith("org.eclipse.xtext.ui.generator"):          "plugins/org.eclipse.xtext.generator/src/"
				case name.startsWith("org.eclipse.xtext.ui"):                    "plugins/org.eclipse.xtext.ui/src/"			
				case name.startsWith("org.eclipse.xtext.junit4"):                "plugins/org.eclipse.xtext.junit4/src/"
				case name.startsWith("org.eclipse.xtext.junit"):                 "plugins/org.eclipse.xtext.junit/src/"
				case name.startsWith("org.eclipse.xtext.ui"):                    "plugins/org.eclipse.xtext.ui/src/"
				case name.startsWith("org.eclipse.xtext.util"):                  "plugins/org.eclipse.xtext.util/src/"
				case name.startsWith("org.eclipse.xtext"):                       "plugins/org.eclipse.xtext/src/"
				default:
					""
			}
		if(prefix.length != 0)
			basedir + prefix + ie.qualifiedName.replaceAll("\\.", "/").replaceAll("\\$.*$", "") + ".java"
		else
			null
	}

	def compilationUnitName(JvmIdentifiableElement ie) {
		ie.simpleName
	}
}