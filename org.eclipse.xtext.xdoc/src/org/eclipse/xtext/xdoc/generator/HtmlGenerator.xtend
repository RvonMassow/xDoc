package org.eclipse.xtext.xdoc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.common.types.*
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.lib.IterableExtensions
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.Utils
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions

class HtmlGenerator implements IGenerator {
	
	@Inject extension Utils utils
	@Inject extension PlainText plaintext
	@Inject extension HTMLNamingExtensions naming
	@Inject XdocGenerator helpGen
	 
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		try{
			for(file: resource.allContentsIterable.filter(typeof(XdocFile))) {
				if(file.mainSection instanceof Document)
					generate(file.mainSection, fsa)
			}
		} catch(Exception e) {
			throw new RuntimeException(e)
		}
	}

	def dispatch generate(Document doc, IFileSystemAccess fsa) {
		fsa.generateFile(doc.fileName, 
		'''
		<html>
		  «header(doc.title)»
		«doc.body»
		</html>
		'''
		)
		// fsa.generateFile("toc.html", )
		''''''
	}

	def dispatch generate(Chapter chap, IFileSystemAccess fsa){
		fsa.generateFile(chap.fileName,
		'''
		<html>
		  «chap.title.header»
		
		<body>
		
		<«chap.tag»>«chap.title.genNonParText»</«chap.tag»>
		«chap.toc»
		
		«FOR c : chap.contents »
			«c.genText»
		«ENDFOR»
		</body>
		</html>
		'''
		)
		''''''
	}

	def dispatch generate(Section sec, IFileSystemAccess fsa){
		fsa.generateFile(sec.fileName,
		'''
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
		«FOR c : sec.contents»
		«ENDFOR»
		'''
		)
		''''''
	}

	def tag(AbstractSection ^as) {
		switch (^as) {
			Document: "h1"
			Chapter: "h1"
			Section: "h1"
			Section2: "h2"
			Section3: "h3"
			Section4: "h4"
		}
	}
	def dispatch generate(Section2 sec){
		'''
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
		«FOR c : sec.contents»
		«ENDFOR»
		'''
	}
	def dispatch generate(Section3 sec){
		'''
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
		«FOR c : sec.contents»
		«ENDFOR»
		'''
	}

	def dispatch generate(Section4 sec){
		'''
		<«sec.tag»>«sec.title.genText»</«sec.tag»>
		«FOR c : sec.contents»
		«ENDFOR»
		'''
	}

	def header (TextOrMarkup title) '''
		<head>
		  <title>«title.genPlainText»</title>
		</head>
	'''

	def body(Document doc) '''
		<body>
		«doc.genAuthors»
		«doc.toc»
		</body>
	'''

	def toc(AbstractSection ^as) {
		if(!^as.subSection.empty)
		'''
			<div class="toc" >
			  «^as.subToc»
			</div>
		'''
	}

	def subToc(AbstractSection ^as) '''
		<ol>
		  «FOR ss: ^as.subSection»
		    «ss.tocEntry»
		  «ENDFOR»
		</ol>
	'''

	def dispatch tocEntry(Chapter chapter) 
	'''<li><a href="«chapter.fileName.urlEncode»" >«chapter.title.genNonParText»</a>«IF !chapter.subSection.empty»
	«chapter.subToc»«ENDIF»</li>
	'''

	def dispatch tocEntry(Section section) '''
		<li><a href="«section.fileName.urlEncode»" >«section.title.genNonParText »</a></li>
	'''

	def genAuthors(Document doc) {
		if(doc.authors != null)
			'''
				<div class="authors">
				«doc.authors.genText»
				</div>
			'''
	}

	def genNonParText(TextOrMarkup tom) {
		'''«FOR c: tom.contents»«c.genText»«ENDFOR»'''
	}

	def dispatch genText(TextOrMarkup tom) {
		'''
		«FOR c: tom.contents»
			<p>
			«c.genText»
			</p>
		«ENDFOR»
		'''
	}

	def dispatch genText(CodeBlock cb) {
		if(cb.inlineCode)
			'''<span class="inlinecode">«(cb.contents.head as Code).generateCode(cb.language)»</span>'''
		else {
			val block = cb.removeIndent
			'''	
				<div class="literallayout">
				<div class="incode">
				<p class="code">
				«FOR code:block.contents»
					«code.generateCode(cb.language)»
				«ENDFOR»
				</p>
				</div>
				</div>
			'''
		}
	}

	def dispatch generateCode(Code code, LangDef lang)
		'''«code.contents.unescapeXdocChars.formatCode(lang)»'''

	def dispatch generateCode(Code code, Void lang)
		'''«code.contents.unescapeXdocChars.formatCode(null)»'''

	def dispatch generateCode(MarkupInCode mic, LangDef lang)
		'''«mic.genText»'''

	def dispatch genText(TextPart tp) {
		tp.text
	}
}