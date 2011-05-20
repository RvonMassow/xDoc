package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.xbase.compiler.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.common.types.*
import java.util.*
import static extension java.net.URLDecoder.*
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension lib.IterableExtensions.*
import static extension Collections2.*
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*


import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xdoc.generator.util.*
import org.eclipse.xtext.xdoc.generator.*

import org.eclipse.emf.ecore.EObject
import java.io.UnsupportedEncodingException
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.resource.XdocResourceDescriptionManager
import org.eclipse.xtext.resource.IResourceDescriptions
import com.google.inject.internal.Iterables
import org.eclipse.xtext.xbase.lib.IterableExtensions


class XdocGenerator implements IGenerator {

//	@Inject ArrayList<GlossaryEntry> glossary

	@Inject extension Utils utils

	@Inject extension GlossaryExtensions glossaryExtensions
	
	@Inject extension EclipseNamingExtensions eclipseNamingExtensions

	@Inject extension TocGenerator tocGenerator

	@Inject extension PlainText plainText

	override doGenerate(Resource res, IFileSystemAccess access) {
		try {
			val aS = (res.contents.head as XdocFile)?.mainSection
			if(aS instanceof Document) {
				aS.generate(access)
			}
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e)
		}
	}

	def dispatch generate(Document document, IFileSystemAccess access) {
		access.generateFile("toc.xml", document.generateToc)
		for(c:document.chapters){
			c.generate(access)
		}
		// access.generateFile(document.eResource.URI.lastSegment+".html", generate(document))
	}

	def dispatch generate(Chapter chapter, IFileSystemAccess access) {
		access.generateFile(chapter.fileName.decode, chapter.generate)
	}

	def dispatch generate(Chapter aS) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«aS.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="index.html" title="">
		</head>
		<body>
		<a name="«aS.labelName»"></a>
		<«aS.headtag»>«aS.title.genPlainText»</«aS.headtag»>
		«FOR content:aS.contents»
			«content.generatePar»
		«ENDFOR»
		«FOR ss: aS.subSection»
			«ss.generate»
		«ENDFOR»
		</body>
		</html>
	'''
	
	def headtag(AbstractSection section) {
		switch section {
			Chapter: "h1"
			Section: "h2"
			Section2: "h3"
			Section3: "h4"
			Section4: "h5"
			default: "h1"
		}
	}

	def dispatch generate(AbstractSection aS) '''
		<a name="«aS.labelName»"></a>
		<«aS.headtag»>«aS.title.genPlainText»</«aS.headtag»>
		«FOR c : aS.contents »
			«c.generatePar»
		«ENDFOR»
		«FOR ss : aS.subSection»
			«ss.generate»
		«ENDFOR»
	'''

	def dispatch generate(Section4 aS) '''
		<a name="«aS.labelName»"></a>
		<h5>«aS.title.genNonParContent»</h5>
		«FOR tom : aS.contents»
			«tom.generatePar»
		«ENDFOR»
	'''

	def generatePar(TextOrMarkup tom) '''
		<p>
		«FOR c : tom.contents»«c.generate»«ENDFOR»
		</p>
	'''

	def dispatch generate(Todo todo) '''
		<div class="todo" >
		«todo.text»
		</div>
	'''

	def dispatch generate(Ref ref) '''
		«IF ref.contents.isEmpty »
		<a href="«ref.ref.fileName»#«ref.ref.name»">section «ref.ref.name»</a>
		«ELSE»
		<a href="«ref.ref.fileName»#«ref.ref.name»">
		«FOR tom:ref.contents»
			«tom.genNonParContent»</a>
		«ENDFOR»
		«ENDIF»
	'''

	def dispatch generate(TextOrMarkup tom) '''
		«FOR obj:tom.contents»«obj.generate»«ENDFOR»
	'''
//		tom.contents.fold('''''', [e1, e2 | '''«e2»«e1.generate»'''])

	def dispatch generate(UnorderedList ul) '''
		<ul>
			«FOR i:ul.items»
			  	«i.generate»
			«ENDFOR»
		</ul>
	'''

	def dispatch generate(OrderedList ul) '''
		<ol>
			«FOR i:ul.items»
				«i.generate»
			«ENDFOR»
		</ol>
	'''

	def dispatch generate(Item i) '''
		<li>
			«FOR tom:i.contents»
				«tom.generate»
			«ENDFOR»
		</li>
	'''

	def dispatch generate(Anchor a) 
		'''<a name="«a.name»"></a>'''
	

	def dispatch generate(ImageRef img) '''
		<div class="image" >
		«IF img.name != null»
			«img.name.genLabel»
		«ENDIF»
		«/*copy((String)GLOBALVAR srcDir, this.path, (String) GLOBALVAR dir) */ ""»
		<img src="«img.path.unescapeXdocChars()»" «IF img.clazz != null»class="«img.clazz.unescapeXdocChars»" «ENDIF»
		«IF img.style != null && !(img.style.length==0)» style="«img.style.unescapeXdocChars»" «ENDIF»/>
		«img.caption.unescapeXdocChars.escapeHTMLChars»
		</div>
	'''

	def genLabel(String name) '''
		«IF this != null »
		<a name="«name»"></a>
		«ENDIF»
	'''

	def dispatch generate(TextPart tp) {
		tp.text.unescapeXdocChars.escapeHTMLChars
	}

	def dispatch generate(Table table) '''
		<table>
		«FOR tr:table.rows»
			«tr.generate»
		«ENDFOR»
		</table>
	'''

	def dispatch generate(TableRow tr) '''
		<tr>
		«FOR td:tr.data»
			«td.generate»
		«ENDFOR»
		</tr>
	'''

	def dispatch generate(TableData td) '''
		<td>
		«FOR c:td.contents»
			«c.generate»
		«ENDFOR»
		</td>
	'''

	def dispatch generate(Emphasize em) 
		'''<em>«FOR c:em.contents»«c.generate»«ENDFOR»</em>'''

	def dispatch generate(Link link) 
		'''<a href="«link.url»">«link.text.unescapeXdocChars.escapeHTMLChars»</a>'''
	

	def dispatch generate(CodeRef cRef) 
		'''<em>«cRef.element.qualifiedName.unescapeXdocChars.escapeHTMLChars»</em>'''

	def dispatch generate(CodeBlock cb) {
		if(cb.isInlineCode) {
			'''<span class="inlinecode">«(cb.contents.head as Code).generateCode(cb.language)»</span>'''
		} else {
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

	def dispatch generateCode (Code code, LangDef lang) 
		'''«code.contents.unescapeXdocChars.formatCode(lang) »'''
	
	
	def dispatch generateCode (MarkupInCode code, LangDef lang) 
		'''«code.generate»'''

	def dispatch generateCode (Code code, Void v) 
		'''«code.contents.unescapeXdocChars.formatCode(null) »'''

	def genNonParContent(TextOrMarkup tom) '''
		«FOR obj:tom.contents»
			«obj.generate»
		«ENDFOR»
	'''

}
