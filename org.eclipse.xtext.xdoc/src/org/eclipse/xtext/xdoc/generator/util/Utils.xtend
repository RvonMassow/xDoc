package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import static extension java.net.URLDecoder.*
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*


class Utils {

	def dispatch subSection(Document doc){
		doc?.chapters
	}

	def dispatch subSection(Chapter section){
		section?.subSections
	}

	def dispatch subSection(Section section){
		section?.subSections
	}

	def dispatch subSection(Section2 section){
		section?.subSections
	}

	def dispatch subSection(Section3 section){
		section?.subSections
	}

	def dispatch Iterable<? extends AbstractSection> subSection(AbstractSection section){
		newArrayList
	}

	def urlDecode (String s){
		s?.decode("ISO-8859-1")
	}

	def boolean isInlineCode (CodeBlock cb) {
		cb.contents.size == 1 && !cb.contents.head.toString.contains("\n")
//		cb.contents.size == 1 && !cb.contents.head.toString.contains("\n")
	}

	def escapeLatexChars(String s) {
		s?.replaceAll("\\$", "\\\\\\$").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}")
			.replaceAll("\\\\(?![{}$])", "\\\\textbackslash{}")
			.replaceAll("#", "\\\\#").replaceAll("%", "\\\\%")
			.replaceAll("_", "\\\\_").replaceAll("\\^", "\\\\textasciicircum{}")
			.replaceAll("&", "\\\\&").replaceAll("~", "\\\\textasciitilde{}")
	}

	def unescapeXdocChars(String s) {
		s?.replaceAll("\\\\\\[", "[").replaceAll("\\\\\\]", "]")
	}

	def prepareListingsString(String s) {
		s?.replaceAll("^\n", "")
	}

	def escapeHTMLChars(String s) {
		s?.replaceAll("&", "&amp;").replaceAll("'", "&apos;")
			.replaceAll("<", "&lt;").replaceAll(">", "&gt;")
	}

	def formatCode(String text, LangDef language) {
		highlightKeywords(text.escapeHTMLChars().replaceAll(" ", "&nbsp;").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll("\n", "<br />\n"), language)
	}
		
}