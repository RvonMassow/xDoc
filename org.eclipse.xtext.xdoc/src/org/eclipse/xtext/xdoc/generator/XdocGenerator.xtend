package org.eclipse.xtext.xdoc.generator



import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.generator.util.GlossaryExtensions
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xdoc.xdoc.XdocFile
import org.eclipse.xtext.xdoc.xdoc.Document
import java.nio.ByteBuffer
import java.io.File
import org.eclipse.emf.common.util.URI
import java.nio.channels.Channels
import java.util.Map
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Section
import org.eclipse.xtext.xdoc.xdoc.Section2
import org.eclipse.xtext.xdoc.xdoc.Section3
import org.eclipse.xtext.xdoc.xdoc.Section4
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
import org.eclipse.xtext.xdoc.xdoc.Todo
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Anchor
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xdoc.xdoc.UnorderedList
import org.eclipse.xtext.xdoc.xdoc.OrderedList
import org.eclipse.xtext.xdoc.xdoc.Item
import org.eclipse.xtext.xdoc.xdoc.ImageRef
import org.eclipse.xtext.xdoc.xdoc.TextPart
import org.eclipse.xtext.xdoc.xdoc.Table
import org.eclipse.xtext.xdoc.xdoc.TableRow
import org.eclipse.xtext.xdoc.xdoc.TableData
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.CodeRef
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.Code
import org.eclipse.xtext.xdoc.xdoc.LangDef
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode
import static extension java.net.URLDecoder.*
import org.eclipse.xtext.common.types.JvmAnnotationType
import java.util.Collections
import org.eclipse.xtext.xdoc.generator.util.GitExtensions

class XdocGenerator implements IGenerator {

//	@Inject ArrayList<GlossaryEntry> glossary

	@Inject extension JavaDocExtension jdoc

	@Inject extension GitExtensions git

	@Inject extension Utils utils

	@Inject extension GlossaryExtensions glossaryExtensions
	
	@Inject extension EclipseNamingExtensions eclipseNamingExtensions

	@Inject extension TocGenerator tocGenerator

	@Inject extension PlainText plainText
	
	@Inject extension AbstractSectionExtension sectionExtension

	override doGenerate(Resource res, IFileSystemAccess access) {
		val doc = (res.contents.head as XdocFile)?.mainSection
		if(doc instanceof Document) {
			(doc as Document).generate(access)
		}
	}

	def generate(Document document, IFileSystemAccess access) {
		val fileNames = document.computeURLs
		access.generateFile("toc.xml", document.generateToc(fileNames))
		access.generateFile(fileNames.get(document).decode, document.generateRootDocument(fileNames))
		for(c:document.chapters){
			c.generate(fileNames, access)
		}
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
	
	// TODO format root page
	// TODO decide about nesting in toc
	def generateRootDocument(Document document, Map<AbstractSection, String> fileNames) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«document.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="«fileNames.get(document)»" title="">
		</head>
		<body>
		<h1>«document.title.genPlainText»</h1>
		«FOR content:document.contents»
			«content.generatePar(fileNames)»
		«ENDFOR»
		«FOR ss: document.sections BEFORE "<ol>" AFTER "</ol>"»
			«ss.generateEntryInRoot(fileNames)»
		«ENDFOR»
		</body>
		</html>
	'''
	
	def generateEntryInRoot(AbstractSection section, Map<AbstractSection, String> fileNames) '''
		<li><a href="«fileNames.get(section)»">«section.title.genPlainText»</a>
			«FOR ss: section.sections BEFORE "<ol>" AFTER "</ol>"»
				«ss.generateEntryInRoot(fileNames)»
			«ENDFOR»
		</li>
	'''

	def generate(Chapter chapter, Map<AbstractSection, String> fileNames, IFileSystemAccess access) {
		access.generateFile(fileNames.get(chapter).decode, chapter.generate(fileNames))
	}

	def dispatch generate(Chapter chapter, Map<AbstractSection, String> fileNames) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«chapter.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="index.html" title="">
		</head>
		<body>
		«IF chapter.labelName(fileNames) != null»<a name="«chapter.labelName(fileNames)»"></a>«ENDIF»
		<«chapter.headtag»>«chapter.title.genPlainText»</«chapter.headtag»>
		«FOR content:chapter.contents»
			«content.generatePar(fileNames)»
		«ENDFOR»
		«FOR ss: chapter.sections»
			«ss.generate(fileNames)»
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

	def dispatch generate(AbstractSection aS, Map<AbstractSection, String> fileNames) '''
		<a name="«aS.labelName(fileNames)»"></a>
		<«aS.headtag»>«aS.title.genPlainText»</«aS.headtag»>
		«FOR c : aS.contents »
			«c.generatePar(fileNames)»
		«ENDFOR»
		«FOR ss : aS.sections»
			«ss.generate(fileNames)»
		«ENDFOR»
	'''

	def dispatch generate(Section4 aS, Map<AbstractSection, String> fileNames) '''
		<a name="«aS.labelName(fileNames)»"></a>
		<h5>«aS.title.genNonParContent(fileNames)»</h5>
		«FOR tom : aS.contents»
			«tom.generatePar(fileNames)»
		«ENDFOR»
	'''

	def generatePar(TextOrMarkup tom, Map<AbstractSection, String> fileNames) '''
		<p>
		«FOR c : tom.contents»«c.generate(fileNames)»«ENDFOR»
		</p>
	'''

	def dispatch generate(Todo todo, Map<AbstractSection, String> fileNames) '''
		<div class="todo" >
		«todo.text»
		</div>
	'''

	def dispatch generate(Ref ref, Map<AbstractSection, String> fileNames) {
		val title = if(ref.ref instanceof AbstractSection) {
				'''title="go to &quot;«(ref.ref as AbstractSection).title.genPlainText»&quot;"'''
			}
		'''«IF ref.contents.isEmpty »<a href="«ref.ref.url(fileNames)»" «title» >section «ref.ref.name»</a>«ELSE
		»<a href="«ref.ref.url(fileNames)»" «title»>«FOR tom:ref.contents
		»«tom.genNonParContent(fileNames)»«ENDFOR»</a>«
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

	def dispatch generate(TextOrMarkup tom, Map<AbstractSection, String> fileNames) 
		'''«FOR obj:tom.contents»«obj.generate(fileNames)»«ENDFOR»'''
//		tom.contents.fold('''''', [e1, e2 | '''«e2»«e1.generate»'''])

	def dispatch generate(UnorderedList ul, Map<AbstractSection, String> fileNames) '''
		<ul>
			«FOR i:ul.items»
			  	«i.generate(fileNames)»
			«ENDFOR»
		</ul>
	'''

	def dispatch generate(OrderedList ul, Map<AbstractSection, String> fileNames) '''
		<ol>
			«FOR i:ul.items»
				«i.generate(fileNames)»
			«ENDFOR»
		</ol>
	'''

	def dispatch generate(Item i, Map<AbstractSection, String> fileNames) '''
		<li>
			«FOR tom:i.contents»
				«tom.generate(fileNames)»
			«ENDFOR»
		</li>
	'''

	def dispatch generate(Anchor a, Map<AbstractSection, String> fileNames) 
		'''<a name="anchor-«a.name»"></a>'''
	

	def dispatch generate(ImageRef img, Map<AbstractSection, String> fileNames) {
		copy(img.path, img.eResource)
		'''
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
	} 

	def genLabel(String name) '''
		«IF this != null »<a name="«name»"></a>«ENDIF»
	'''

	def dispatch generate(TextPart tp, Map<AbstractSection, String> fileNames) {
		tp.text.unescapeXdocChars.escapeHTMLChars
	}

	def dispatch generate(Table table, Map<AbstractSection, String> fileNames) '''
		<table>
		«FOR tr:table.rows»
			«tr.generate(fileNames)»
		«ENDFOR»
		</table>
	'''

	def dispatch generate(TableRow tr, Map<AbstractSection, String> fileNames) '''
		<tr>
		«FOR td:tr.data»
			«td.generate(fileNames)»
		«ENDFOR»
		</tr>
	'''

	def dispatch generate(TableData td, Map<AbstractSection, String> fileNames) '''
		<td>
		«FOR c:td.contents»
			«c.generate(fileNames)»
		«ENDFOR»
		</td>
	'''

	def dispatch generate(Emphasize em, Map<AbstractSection, String> fileNames) 
		'''<em>«FOR c:em.contents»«c.generate(fileNames)»«ENDFOR»</em>'''

	def dispatch generate(Link link, Map<AbstractSection, String> fileNames) 
		'''<a href="«link.url»">«link.text.unescapeXdocChars.escapeHTMLChars»</a>'''
	
	def dispatch generate(CodeRef cRef, Map<AbstractSection, String> fileNames) {
		val prefix = if(cRef.element instanceof JvmAnnotationType) "@"
		val jDocLink = cRef.element.genJavaDocLink
		val gitLink = cRef.element.gitLink
		val fqn = cRef.element.getQualifiedName(".".charAt(0)).unescapeXdocChars.escapeHTMLChars
		val text = if(cRef.altText != null) {
						cRef.altText.generate(fileNames)
					} else {
						cRef.element.simpleName.unescapeXdocChars.escapeHTMLChars
					}
		var ret = if(jDocLink != null)
			'''<a class="jdoc" href="«cRef.element.genJavaDocLink»" ><abbr title="«fqn
				»" >«prefix»«text»</abbr></a>'''
		else
			'''<abbr title="«fqn
				»" >«prefix»«text»</abbr>'''
		if(gitLink != null) {
			'''«ret» <a class="srcLink" href="«gitLink»" title="show source code" >(src)</a>'''
		} else 
			ret
	}

	def dispatch generate(CodeBlock cb, Map<AbstractSection, String> fileNames) {
		if(cb.isInlineCode) {
			'''<span class="inlinecode">«(cb.contents.head as Code).generateCode(fileNames).formatCode(cb.language)»</span>'''
		} else {
			val indentToRemove = cb.calcIndent
			val list = 
				if(cb.contents.size > 2)
					cb.contents.tail.take(cb.contents.size - 2)
				else
					Collections::EMPTY_LIST
			val first = cb.contents.head.generateCode(fileNames).trimLines(indentToRemove).replaceAll("\\A(\\s*\n)*", "")
			val last = if(cb.contents.last != cb.contents.head) {
					cb.contents.last.generateCode(fileNames).trimLines(indentToRemove).replaceAll("(\\s*\n)*\\Z", "")
				} else{
					first.replaceAll("(\\s*\n)*\\Z", "")
					""
				}
			'''	
				<div class="literallayout">
				<div class="incode">
				<p class="code">
				«first.formatCode(cb.language)»
				«FOR code: list»
					«code.generateCode(fileNames).trimLines(indentToRemove).formatCode(cb.language)»
				«ENDFOR»
				«last.formatCode(cb.language)»
				</p>
				</div>
				</div>
			'''
		}
	}

	def trimLines(CharSequence cs, int amount) {
		cs.toString.replaceAll("\n\\s{" + amount + "}", "\n")
	}

	def dispatch generateCode (Code code, Map<AbstractSection, String> fileNames) 
		'''«code.contents.unescapeXdocChars»'''
	
	
	def dispatch generateCode (MarkupInCode code, Map<AbstractSection, String> fileNames) 
		'''«code.generate(fileNames)»'''

	def genNonParContent(TextOrMarkup tom, Map<AbstractSection, String> fileNames) 
		'''«FOR obj:tom.contents»«obj.generate(fileNames)»«ENDFOR»'''

}
