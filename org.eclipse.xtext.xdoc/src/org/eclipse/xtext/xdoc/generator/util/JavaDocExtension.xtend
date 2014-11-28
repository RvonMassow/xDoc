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
				"http://download.eclipse.org/modeling/emft/mwe/javadoc/2.7/"
			case name.startsWith("org.eclipse.xtext.")
				|| name.startsWith("org.eclipse.xtend2"):
				"http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.7/"
			case name.startsWith("org.eclipse.xtend."):
				"http://www.eclipse.org/xtend/api/2.7.0/"
			case name.startsWith("org.eclipse.emf."):
				"http://download.eclipse.org/modeling/emf/emf/javadoc/2.10.0/"
			case name.startsWith("com.google.inject."):
				"https://google.github.io/guice/api-docs/latest/javadoc/"
			case name.startsWith("com.google.common."):
				"http://docs.guava-libraries.googlecode.com/git-history/v17.0/javadoc/"
			case name.startsWith("org.eclipse.jdt."):
				"http://help.eclipse.org/helios/topic/org.eclipse.jdt.doc.isv/reference/api/"
			case name.startsWith("java."):
				"http://docs.oracle.com/javase/8/docs/api/"
			case name.startsWith("javax.servlet."):
				"http://docs.oracle.com/javaee/5/api/"
			case name.startsWith("com.mongodb."):
				"http://api.mongodb.org/java/2.6/"
			case name.startsWith("org.junit."):
				"http://junit.sourceforge.net/javadoc/"
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