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
			s.replaceAll("&", "&amp;").replaceAll("'", "&apos;")
				.replaceAll("<", "&lt;").replaceAll(">", "&gt;")
		else
			""
	}

	def formatCode(String text, LangDef language) {
		if(text != null)
			getHighlightedHtmlCode(text, language)
		else
			""
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
		return s.escapeHTMLChars.replace(' ','&nbsp;').replace('\n','</br>\n').replace('\t','&nbsp;&nbsp;&nbsp;&nbsp;')
	}

	def create codeBlock : XdocFactory::eINSTANCE.createCodeBlock removeIndent(CodeBlock cb) {
		if(cb.getContents().size() > 0 && cb.getContents().get(0) instanceof Code){
			val code0 = (cb.getContents().get(0) as Code).getContents()
			var indent = code0.length()
			indent = indent - code0.replaceAll("^(\n*)\\s*", "$1").length()
			val string = "\n\\s{"+indent+"}"
			var firstRun = true
			for(code : cb.contents()) {
				if (code instanceof Code) {
					var codeString = (code as Code).contents()
					if(code == cb.contents.head) {
						codeString = codeString.replaceAll("^\n*", "").replaceAll("^\\s{"+indent+"}", "")
					}
					if(code == cb.contents.last){
						codeString = codeString.replaceAll("(\\s|\n)*$", "")
					}
					codeString = codeString.replaceAll(string, "\n")
					codeBlock.contents.add(correctedCode(codeString))
				} else
					codeBlock.contents.add(code)
				firstRun = false
			}
			if(codeBlock.getContents().get(codeBlock.getContents().size()-1) instanceof Code) {
				val lastLines =  (codeBlock.getContents().get(codeBlock.getContents().size() - 1) as Code)
				lastLines.setContents(lastLines.getContents().replaceAll("\\s*$", ""))
			}
		}
	}

	def create code : XdocFactory::eINSTANCE.createCode correctedCode(String s) {
		code.setContents(s)
	}
}