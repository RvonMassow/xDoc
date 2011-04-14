package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import static extension java.net.URLDecoder.*
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*


class Utils {

	dispatch subSection(Document doc){
		doc.chapters
	}

	dispatch subSection(Chapter section){
		section.subSections
	}

	dispatch subSection(Section section){
		section.subSections
	}

	dispatch subSection(Section2 section){
		section.subSections
	}

	dispatch subSection(Section3 section){
		section.subSections
	}

	dispatch Iterable<? extends AbstractSection> subSection(AbstractSection section){
		newArrayList
	}

	urlDecode (String s){
		s.decode("ISO-8859-1")
	}

	boolean isInlineCode (CodeBlock cb) {
		cb.contents.size == 1 && !cb.contents.head.toString.contains("\n")
//		cb.contents.size == 1 && !cb.contents.head.toString.contains("\n")
	}

	escapeLatexChars(String s) {
		s.replaceAll("\\$", "\\\\\\$").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}")
			.replaceAll("\\\\(?![{}$])", "\\\\textbackslash{}")
			.replaceAll("#", "\\\\#").replaceAll("%", "\\\\%")
			.replaceAll("_", "\\\\_").replaceAll("\\^", "\\\\textasciicircum{}")
			.replaceAll("&", "\\\\&").replaceAll("~", "\\\\textasciitilde{}")
	}

	unescapeXdocChars(String s) {
		s.replaceAll("\\\\\\[", "[").replaceAll("\\\\\\]", "]")
	}

	prepareListingsString(String s) {
		s.replaceAll("^\n", "")
	}

	escapeHTMLChars(String s) {
		s.replaceAll("&", "&amp;").replaceAll("'", "&apos;")
			.replaceAll("<", "&lt;").replaceAll(">", "&gt;")
	}

	formatCode(String text, LangDef language) {
		highlightKeywords(text.escapeHTMLChars().replaceAll(" ", "&nbsp;").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll("\n", "<br />\n"), language)
	}
		
}