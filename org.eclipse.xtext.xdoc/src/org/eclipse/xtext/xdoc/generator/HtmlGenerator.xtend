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
import java.util.List
import static extension java.net.URLDecoder.*
import java.util.Map
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.common.util.URI
import java.nio.ByteBuffer
import java.io.File
import java.nio.channels.Channels
import org.eclipse.xtext.xdoc.generator.util.GitExtensions
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension

class HtmlGenerator implements IGenerator {
	
	@Inject extension Utils utils
	@Inject extension PlainText plaintext
	@Inject extension HTMLNamingExtensions naming
	@Inject extension AbstractSectionExtension ase
	@Inject extension GitExtensions git
	@Inject extension JavaDocExtension jdoc
	@Inject XdocGenerator helpGen
	 
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		try{
			for(file: resource.allContentsIterable.filter(typeof(XdocFile))) {
				if(file.mainSection instanceof Document) {
					val fileNames = (file.mainSection as Document).computeURLs;
					(file.mainSection as Document).generate(fsa, fileNames)
				}
			}
		} catch(Exception e) {
			throw new RuntimeException(e)
		}
	}

	def generate(Document doc, IFileSystemAccess fsa, Map<AbstractSection, String> fileNames) {
		fsa.generateFile(fileNames.get(doc).decode, 
		'''
		<html>
		  «header(doc.title)»
		«doc.body(fileNames)»
		</html>
		'''
		)
		// fsa.generateFile("toc.html", )
		''''''
		for(chapter : doc.sections) {
			val index = doc.chapters.indexOf(chapter)
			val prevS = if(index > 0) doc.chapters.get(index - 1) ?.genPrevButton(fileNames)
			val nextS = if(index < doc.chapters.size - 1) doc.chapters.get(index + 1)?.genNextButton(fileNames)
			chapter.generate(fsa, '''«prevS»«nextS»''', fileNames)
		}
		''''''
	}

	def genPrevButton(AbstractSection ^as, Map<AbstractSection, String> fileNames) '''
		<span class="prev_button">
		<a href="«fileNames.get(^as)»" >Previous</a>
		</span>
	'''

	def genNextButton(AbstractSection ^as, Map<AbstractSection, String> fileNames) '''
		<span class="next_button">
		<a href="«fileNames.get(^as)»" >Next</a>
		</span>
	'''

	def dispatch generate(Chapter chap, IFileSystemAccess fsa, CharSequence buttons, Map<AbstractSection, String> fileNames){
		fsa.generateFile(fileNames.get(chap).decode,
		'''
		<html>
		  «chap.title.header»
		
		<body>
		<div class="buttonbar">
		«buttons»
		</div>
		<div style="clear:both;"></div>
		
		<«chap.tag»>«chap.title.genNonParText(fileNames)»</«chap.tag»>«IF chap.name != null»
		<a name="«chap.name»"></a>«ENDIF»
		«chap.toc(fileNames)»
		
		«FOR c : chap.contents »
			«c.genText(fileNames)»
		«ENDFOR»
		<div class="buttonbar">
		«buttons»
		</div>
		<div style="clear:both;"></div>
		</body>
		</html>
		'''
		)
		for(section: chap.sections) {
			val index = chap.sections.indexOf(section)
			val prevS = if(index > 0) chap.sections.get(index - 1)?.genPrevButton(fileNames)
			val nextS = if(index < chap.sections.size - 1) chap.sections.get(index + 1)?.genNextButton(fileNames)
			section.generate(fsa, '''«prevS»«nextS»''', fileNames)
		}
		''''''
	}

	def dispatch generate(Section sec, IFileSystemAccess fsa, CharSequence buttons, Map<AbstractSection, String> fileNames){
		fsa.generateFile(fileNames.get(sec),
		'''
		<html>
		«sec.title.header»
		<body>
		<div class="buttonbar">
		«buttons»
		</div>
		<div style="clear:both;"></div>
		
		«sec.labelName(fileNames).anchor»
		<«sec.tag»>«sec.title.genNonParText(fileNames)»</«sec.tag»>
		«sec.toc(fileNames)»
		«FOR c : sec.contents»
			«c.genText(fileNames)»
		«ENDFOR»
		«FOR sec2: sec.sections»
			«sec2.generate(fileNames)»
		«ENDFOR»
		<div class="buttonbar">
		«buttons»
		</div>
		<div style="clear:both;"></div>
		</body>
		</html>
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

	def dispatch generate(Section2 sec, Map<AbstractSection, String> fileNames){
		'''
		«sec.labelName(fileNames).anchor»
		<«sec.tag»>«sec.title.genNonParText(fileNames)»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText(fileNames)»
		«ENDFOR»
		«FOR sec3: sec.sections»
			«sec3.generate(fileNames)»
		«ENDFOR»
		'''
	}
	def dispatch generate(Section3 sec, Map<AbstractSection, String> fileNames){
		'''
		«sec.labelName(fileNames).anchor»
		<«sec.tag»>«sec.title.genNonParText(fileNames)»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText(fileNames)»
		«ENDFOR»
		«FOR c : sec.sections»
			«c.generate(fileNames)»
		«ENDFOR»
		'''
	}

	def dispatch generate(Section4 sec, Map<AbstractSection, String> fileNames){
		'''
		«sec.labelName(fileNames).anchor»
		<«sec.tag»>«sec.title.genText(fileNames)»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText(fileNames)»
		«ENDFOR»
		'''
	}

	def header (TextOrMarkup title) '''
		<head>
		  <META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		  <title>«title.genPlainText»</title>
		  <link href="book.css" rel="stylesheet" type="text/css">
		  <link href="code.css" rel="stylesheet" type="text/css">
		</head>
	'''

	def body(Document doc, Map<AbstractSection, String> fileNames) '''
		<body>
		«doc.genAuthors(fileNames)»
		«doc.toc(fileNames)»
		</body>
	'''

	def toc(AbstractSection ^as, Map<AbstractSection, String> fileNames) {
		if(!^as.sections.empty)
		'''
			<div class="toc" >
			  «^as.subToc(fileNames)»
			</div>
		'''
	}

	def subToc(AbstractSection ^as, Map<AbstractSection, String> fileNames) '''
		<ol>
		  «FOR ss: ^as.sections»
		    «ss.tocEntry(fileNames)»
		  «ENDFOR»
		</ol>
	'''

	def dispatch tocEntry(Chapter chapter, Map<AbstractSection, String> fileNames) 
	'''<li><a href="«fileNames.get(chapter)»" >«chapter.title.genNonParText(fileNames)»</a>«IF !chapter.sections.empty»
	«chapter.subToc(fileNames)»«ENDIF»</li>
	'''

	def dispatch tocEntry(AbstractSection section, Map<AbstractSection, String> fileNames) '''
		<li><a href="«fileNames.get(section)»" >«section.title.genNonParText(fileNames) »</a></li>
	'''

	def genAuthors(Document doc, Map<AbstractSection, String> fileNames) {
		if(doc.authors != null)
			'''
				<div class="authors">
				«doc.authors.genText(fileNames)»
				</div>
			'''
	}

	def genNonParText(TextOrMarkup tom, Map<AbstractSection, String> fileNames) {
		'''«FOR c: tom.contents»«c.genText(fileNames)»«ENDFOR»'''
	}

	def dispatch genText(TextOrMarkup tom, Map<AbstractSection, String> fileNames) {
		'''
		<p>
		«FOR c: tom.contents»«c.genText(fileNames)»«ENDFOR»
		</p>
		'''
	}

	def dispatch genText(CodeBlock cb, Map<AbstractSection, String> fileNames) {
		if(!cb.contents.empty) {
			if(cb.inlineCode)
				'''<span class="inlinecode">«(cb.contents.head as Code).generateCode(cb.language, fileNames)»</span>'''
			else {
				val block = cb.removeIndent
				'''	
					<div class="literallayout">
					<div class="incode">
					<p class="code">
					«FOR code:block.contents»
						«code.generateCode(cb.language, fileNames)»
					«ENDFOR»
					</p>
					</div>
					</div>
				'''
			}
		}
	}

	def dispatch genText(CodeRef cRef, Map<AbstractSection, String> fileNames) {
		val prefix = if(cRef.element instanceof JvmAnnotationType && cRef.altText == null) "@"
		val jDocLink = cRef.element.genJavaDocLink
		val gitLink = cRef.element.gitLink
		val fqn = cRef.element.getQualifiedName(".".charAt(0)).unescapeXdocChars.escapeHTMLChars
		val text = if(cRef.altText != null) {
						cRef.altText.genText(fileNames)
					} else {
						cRef.element.dottedSimpleName
					}
		var ret = if(jDocLink != null)
			'''<a class="jdoc" href="«cRef.element.genJavaDocLink»" title="View JavaDoc"><abbr title="«fqn
				»" >«prefix»«text»</abbr></a>'''
		else
			'''<abbr title="«fqn
				»" >«prefix»«text»</abbr>'''
		if(gitLink != null) {
			'''«ret» <a class="srcLink" href="«gitLink»" title="View Source Code" >(src)</a>'''
		} else 
			ret
	}

	def String dottedSimpleName(JvmDeclaredType type) {
		if (type.declaringType != null)
			type.declaringType.dottedSimpleName + '.' + type.simpleName
		else
			type.simpleName
	}

	def dispatch genText(Emphasize em, Map<AbstractSection, String> fileNames)
		'''<em>«em.contents.generate(fileNames)»</em>'''

	def dispatch generate(List<TextOrMarkup> tomList, Map<AbstractSection, String> fileNames) {
		if (tomList.size == 1) {
			tomList.head.genNonParText(fileNames)
		} else {
			'''
			
			«FOR tom: tomList»
				«tom.genText(fileNames)»
			«ENDFOR»
			'''
		}
	}

	def dispatch generateCode(Code code, LangDef lang, Map<AbstractSection, String> fileNames)
		'''«code.contents.unescapeXdocChars.formatCode(lang, fileNames)»'''

	def dispatch generateCode(Code code, Void lang, Map<AbstractSection, String> fileNames)
		'''«code.contents.unescapeXdocChars.formatCode(null, fileNames)»'''

	def dispatch generateCode(MarkupInCode mic, LangDef lang, Map<AbstractSection, String> fileNames)
		'''«mic.genText(fileNames)»'''

	def dispatch genText(TextPart tp, Map<AbstractSection, String> fileNames) {
		tp.text.unescapeXdocChars
	}

	def dispatch genText(Anchor a, Map<AbstractSection, String> fileNames) {
		// helpGen.generate(a)
	}

	def dispatch genText(Ref ref, Map<AbstractSection, String> fileNames) {
		val title = if(ref.ref instanceof AbstractSection) {
			'''title="Go to &quot;«(ref.ref as AbstractSection).title.genPlainText»&quot;"'''
		}
		'''«IF ref.contents.isEmpty »<a href="«ref.ref.url(fileNames)»" «title» >section «ref.ref.name»</a>«ELSE
		»<a href="«ref.ref.url(fileNames)»" «title»>«FOR tom:ref.contents
		»«tom.genNonParText(fileNames)»«ENDFOR»</a>«
		ENDIF»'''
	}

	
	def dispatch url(Anchor anchor, Map<AbstractSection, String> fileNames) {
		val section = EcoreUtil2::getContainerOfType(anchor, typeof(AbstractSection))
		val fileName = fileNames.get(section)
		if (fileName == null)
			return null
		val uri = URI::createURI(fileName)
		val result = uri.trimFragment.appendFragment("anchor-" + anchor.name)
		result
	}

	def dispatch url(AbstractSection section, Map<AbstractSection, String> fileNames) {
		fileNames.get(section)
	}

	def dispatch genText(Link link, Map<AbstractSection, String> fileNames) 
		'''<a href="«link.url»" >«IF link.text != null»«link.text»«ELSE»«link.url»«ENDIF»</a>'''

	def dispatch genText(OrderedList ol, Map<AbstractSection, String> fileNames)
		'''
		<ol>
		  «FOR i:ol.items»
		    «i.genText(fileNames)»
		  «ENDFOR»
		</ol>
		'''

	def dispatch genText(UnorderedList ol, Map<AbstractSection, String> fileNames)
		'''
		<ul>
		  «FOR i:ol.items»
		    «i.genText(fileNames)»
		  «ENDFOR»
		</ul>
		'''


	def dispatch genText(Item item, Map<AbstractSection, String> fileNames) '''
		<li>«item.contents.generate(fileNames)»</li>
	'''

	def dispatch genText(Table table, Map<AbstractSection, String> fileNames) '''
		<table>
		  «FOR tr: table.rows»
		    «genRow(tr, fileNames)»
		  «ENDFOR»
		</table>
	'''

	def genRow(TableRow tr, Map<AbstractSection, String> fileNames) '''
		<tr>
		  «FOR td: tr.data»
		    «genData(td, fileNames)»
		  «ENDFOR»
		</tr>
	'''

	def genData(TableData td, Map<AbstractSection, String> fileNames)
	'''<td>«td.contents.generate(fileNames)»</td>'''

	def dispatch genText(ImageRef img, Map<AbstractSection, String> fileNames) {
		copy(img.path, img.eResource)
		'''
			<div class="image" >
			«IF img.name != null»
				<a>«img.name»</a>
			«ENDIF»
			«/*copy((String)GLOBALVAR srcDir, this.path, (String) GLOBALVAR dir) */ ""»
			<img src="«img.path.unescapeXdocChars()»" «IF img.clazz != null»class="«img.clazz.unescapeXdocChars»" «ENDIF»
			«IF img.style != null && !(img.style.length==0)» style="«img.style.unescapeXdocChars»" «ENDIF»/>
			<div class="caption">
			«img.caption.unescapeXdocChars.escapeHTMLChars»
			</div>
			</div>
		'''
	}

	def copy(String fromRelativeFileName, Resource res) {
		try{
			val buffer = ByteBuffer::allocateDirect(16 * 1024);
			val uri = res.URI
			val sepChar = File::separator
			var relOutDirRoot = ""
			var inDir = ""
			if(uri.platformResource) {
				val inPath = URI::createURI(uri.trimSegments(1).toString + "/" + fromRelativeFileName)
				val outPath = URI::createURI(uri.trimSegments(2).appendSegment("contents").toString + "/" + fromRelativeFileName)
				val inChannel = Channels::newChannel(res.resourceSet.URIConverter.createInputStream(inPath))
				val outChannel = Channels::newChannel(res.resourceSet.URIConverter.createOutputStream(outPath))
				while (inChannel.read(buffer) != -1) {
					buffer.flip();
					outChannel.write(buffer);
					buffer.compact();
				}
				buffer.flip();
				while (buffer.hasRemaining()) {
					outChannel.write(buffer);
				}
				outChannel.close()
			}
		} catch (Exception e) {
			throw new RuntimeException(e)
		}
	}

	def anchor(String name)
		'''<a name="«name»" ></a>'''
}