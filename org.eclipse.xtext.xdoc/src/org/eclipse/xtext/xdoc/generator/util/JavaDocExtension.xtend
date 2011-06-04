package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.common.types.JvmIdentifiableElement

class JavaDocExtension {
	
	// http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.0.0/org/eclipse/xtext/ui/editor/contentassist/antlr/AbstractContentAssistParser.html
	// http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.0.0/org/eclipse/xtext/resource/IResourceDescription.Manager.html
	def genJavaDocLink(JvmIdentifiableElement ie) {
		if (ie.qualifiedName == null)
			return null
		val file = ie.qualifiedName.replaceAll("\\.", "/").replaceAll("\\$", ".")
		val prefix = switch name:ie.qualifiedName {
			case name.startsWith("org.eclipse.emf.mwe"):
				""
			case name.startsWith("org.eclipse.xtext."):
				"http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.0.0/"
			case name.startsWith("org.eclipse.emf."):
				"http://download.eclipse.org/modeling/emf/emf/javadoc/2.6.0/"
			case name.startsWith("com.google.inject."):
				"http://google-guice.googlecode.com/svn/trunk/javadoc/"
			case name.startsWith("org.eclipse.jdt."):
				"http://help.eclipse.org/helios/topic/org.eclipse.jdt.doc.isv/reference/api/"
			case name.startsWith("java."):
				"http://download.oracle.com/javase/1.5.0/docs/api/"
			case name.startsWith("org.eclipse."):
				"http://help.eclipse.org/helios/topic/org.eclipse.platform.doc.isv/reference/api/"
			default:
				""
		}
		if(prefix != "") 
			prefix + file + ".html"
		else
			null
	}
}