package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import static extension java.net.URLDecoder.*
import static extension java.net.URLEncoder.*
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*
import java.util.List
import org.antlr.runtime.Token
import org.eclipse.xtext.xdoc.generator.util.lexer.Common
import org.antlr.runtime.ANTLRStringStream
import org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl
import java.util.Set
import java.util.Map


class Utils {

	def urlDecode (String s){
		s?.decode("ISO-8859-1")
	}

	def urlEncode (String s){
		s?.encode("UTF-8")
	}

	def boolean isInlineCode (CodeBlock cb) {
		cb.contents.size == 1 && !cb.contents.head.toString.contains("\n")
	}

	def escapeLatexChars(String s) {
		if(s != null)
			s.replaceAll("\\$", "\\\\\\$").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}")
				.replaceAll("\\\\(?![{}$])", "\\\\textbackslash{}")
				.replaceAll("#", "\\\\#").replaceAll("%", "\\\\%")
				.replaceAll("_", "\\\\_").replaceAll("\\^", "\\\\textasciicircum{}")
				.replaceAll("&", "\\\\&").replaceAll("~", "\\\\textasciitilde{}")
		else 
			""
	}

	def unescapeXdocChars(String s) {
		if(s != null)
			s.replaceAll("\\\\\\[", "[").replaceAll("\\\\\\]", "]")
		else
			""
	}

	def prepareListingsString(String s) {
		s?.replaceAll("^\n", "")
	}

	def escapeHTMLChars(String s) {
		if(s != null)
			s.replace("&", "&amp;").replace("'", "&apos;")
				.replace("<", "&lt;").replace(">", "&gt;")
				.replace("«", "&laquo;").replace("»", "&raquo;")
		else
			""
	}

	def formatCode(CharSequence text, LangDef language) {
		if(text != null)
			getHighlightedHtmlCode(text.toString, language)
		else
			""
	}

	def defaultLangKeywords(Set<AbstractSection> sections) {
		val doc = sections.filter(typeof(Document)).head
		val lang = (doc.langDefs.findFirst(e | e.name == "__XdocDefaultLanguage__"));
		if(lang != null)
			lang.keywords
		else
			emptySet as Set<String>
	}

	def getHighlightedHtmlCode(String code, LangDef language) {
		val lexer = new Common()
		lexer.setCharStream(new ANTLRStringStream(code))
		val keywords = if (language !=null) 
							language.keywords.toSet
						else
							emptySet
		var token = lexer.nextToken
		val result = new StringBuilder()
		while (token.type != Token::EOF) {
			switch (token.type) {
				case Common::ID : {
					if (keywords.contains(token.text)) {
						result.append('<span class="keyword">')
							.append(whitespace2Entities(token.text))
							.append('</span>')
					} else {
						result.append(token.text)
					}
				}
				case Common::WS : {
					result.append(whitespace2Entities(token.text))
				}
				case Common::STRING : {
					result.append('<span class="string">')
						.append(whitespace2Entities(token.text))
						.append('</span>')
				} 
				case Common::COMMENT : {
					result.append('<span class="comment">')
						.append(whitespace2Entities(token.text))
						.append('</span>')
				} 
				default :
					result.append(whitespace2Entities(token.text))
			}
			token = lexer.nextToken
		}
		return result.toString
	}

	def String whitespace2Entities(String s) {
		return s.escapeHTMLChars.replace(' ','&nbsp;').replace('\n','<br/>\n').replace('\t','&nbsp;&nbsp;&nbsp;&nbsp;')
	}

	def calcIndent(CodeBlock cb) {
		if(cb.getContents().size() > 0 && cb.getContents().get(0) instanceof Code){
			val code0 = (cb.getContents().get(0) as Code).getContents()
			var indent = code0.length()
			indent = indent - code0.replaceAll("^(\n*)\\s*", "$1").length()
		}
	}

	def create code : XdocFactory::eINSTANCE.createCode correctedCode(String s) {
		code.setContents(s)
	}
	
	def boolean nullOrEmpty(String s) {
		return s == null || s.trim.length==0
	}
}