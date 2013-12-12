package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import java.nio.ByteBuffer
import java.nio.channels.Channels
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension2
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.xtext.xdoc.generator.util.GitExtensions
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Anchor
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Code
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.CodeRef
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.ImageRef
import org.eclipse.xtext.xdoc.xdoc.Item
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode
import org.eclipse.xtext.xdoc.xdoc.OrderedList
import org.eclipse.xtext.xdoc.xdoc.Part
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Section
import org.eclipse.xtext.xdoc.xdoc.Section2
import org.eclipse.xtext.xdoc.xdoc.Section3
import org.eclipse.xtext.xdoc.xdoc.Section4
import org.eclipse.xtext.xdoc.xdoc.Table
import org.eclipse.xtext.xdoc.xdoc.TableData
import org.eclipse.xtext.xdoc.xdoc.TableRow
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
import org.eclipse.xtext.xdoc.xdoc.TextPart
import org.eclipse.xtext.xdoc.xdoc.Todo
import org.eclipse.xtext.xdoc.xdoc.UnorderedList
import org.eclipse.xtext.xdoc.xdoc.XdocFile

import static extension java.net.URLDecoder.*

class StatefulEclipseHelpGenerator {
	
	@Inject extension JavaDocExtension jdoc

	@Inject extension GitExtensions git

	@Inject extension Utils utils

	@Inject extension EclipseNamingExtensions eclipseNamingExtensions

	@Inject extension TocGenerator tocGenerator

	@Inject extension PlainText plainText
	
	@Inject extension AbstractSectionExtension sectionExtension
	
	@Inject EclipseHelpUriUtil uriUtil
	
	Resource res
	
	IFileSystemAccessExtension2 accessExtension2
	
	IFileSystemAccess access
	
	def doGenerate(Resource res, IFileSystemAccessExtension2 accessExtension2) {
		this.res = res
		this.accessExtension2 = accessExtension2
		this.access = accessExtension2 as IFileSystemAccess
		if (res.contents.head instanceof XdocFile) {
			val doc = (res.contents.head as XdocFile)?.mainSection
			if (doc instanceof Document) {
				uriUtil.initialize(doc as Document)
				(doc as Document).generateDoc(this.access)
			}
		}
	}

	def generateDoc(Document document, IFileSystemAccess access) {
		
		access.generateFile("toc.xml", document.generateToc(uriUtil))
		access.generateFile(document.fullURL.decode, document.generateRootDocument)
		val homeFileName = document.eResource.URI.lastSegment.replaceAll(".xdoc$", ".html")
		for(c:document.chapters){
			c.generate(access, homeFileName)
		}
		for(p:document.parts){
			p.generate(access, homeFileName)
		}
	}

	def void copy(String fromRelativeFileName, Resource res) {
		try{
			val buffer = ByteBuffer::allocateDirect(16 * 1024);
			val uri = res.URI
			if(uri.platformResource) {
				val inPath = URI::createURI(uri.trimSegments(1).toString + "/" + fromRelativeFileName)
				val outPath = accessExtension2.getURI(fromRelativeFileName, Outlets::ECLIPSE_HELP);
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
	def generateRootDocument(Document document) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«document.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="«document.fullURL»" title="">
		</head>
		<body>
		<h1>«document.title.genPlainText»</h1>
		«FOR content:document.contents»
			«content.generatePar»
		«ENDFOR»
		«FOR ss: document.sections BEFORE "<ol>" AFTER "</ol>"»
			«ss.generateEntryInRoot»
		«ENDFOR»
		</body>
		</html>
	'''
	
	def CharSequence generateEntryInRoot(AbstractSection section) '''
		<li><a href="«uriUtil.getTargetURI(section)»">«section.title.genPlainText»</a>
			«FOR ss: section.sections BEFORE "<ol>" AFTER "</ol>"»
				«ss.generateEntryInRoot»
			«ENDFOR»
		</li>
	'''

	def dispatch void generate(Chapter chapter, IFileSystemAccess access, String homeFileName) {
		access.generateFile(chapter.fullURL.decode, chapter.generate(homeFileName))
	}

	def dispatch void generate(Part part, IFileSystemAccess fsa, String homeFileName) {
		fsa.generateFile(part.fullURL.decode, part.generate(homeFileName))
		for(c:part.chapters) {
			c.generate(fsa, homeFileName)
		}
	}

	def dispatch CharSequence generate(Part part, String homeFileName) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«part.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="«homeFileName»" title="">
		</head>
		<body>
		<a name="«part.localId»"></a>
		<«part.headtag»>«part.title.genPlainText»</«part.headtag»>
		«FOR ss: part.sections BEFORE "<ol>" AFTER "</ol>"»
			«ss.generateEntryInRoot»
		«ENDFOR»
		</body>
		</html>
	'''

	def dispatch CharSequence generate(Chapter chapter, String homeFileName) '''
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
		<title>«chapter.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="«homeFileName»" title="">
		</head>
		<body>
		<a name="«chapter.localId»"></a>
		<«chapter.headtag»>«chapter.title.genPlainText»</«chapter.headtag»>
		«FOR content:chapter.contents»
			«content.generatePar»
		«ENDFOR»
		«FOR ss: chapter.sections»
			«ss.generate»
		«ENDFOR»
		</body>
		</html>
	'''
	
	def headtag(AbstractSection section) {
		switch section {
			Part: "h1"
			Chapter: "h1"
			Section: "h2"
			Section2: "h3"
			Section3: "h4"
			Section4: "h5"
			default: "h1"
		}
	}

	def dispatch CharSequence generate(AbstractSection section) '''
		<a name="«section.localId»"></a>
		<«section.headtag»>«section.title.genPlainText»</«section.headtag»>
		«FOR c : section.contents »
			«c.generatePar»
		«ENDFOR»
		«FOR ss : section.sections»
			«ss.generate»
		«ENDFOR»
	'''

	def dispatch CharSequence generate(Section4 aS) '''
		<a name="«aS.localId»"></a>
		<h5>«aS.title.genNonParContent»</h5>
		«FOR tom : aS.contents»
			«tom.generatePar»
		«ENDFOR»
	'''

	def CharSequence generatePar(TextOrMarkup tom) '''
		<p>
		«FOR c : tom.contents»«c.generate»«ENDFOR»
		</p>
	'''

	def dispatch CharSequence generate(Todo todo) '''
		<div class="todo" >
		«todo.text»
		</div>
	'''

	def dispatch CharSequence generate(Ref ref) {
		val title = if(ref.ref instanceof AbstractSection) {
				'''title="Go to &quot;«(ref.ref as AbstractSection).title.genPlainText»&quot;"'''
			}
		'''«IF ref.contents.isEmpty »<a href="«uriUtil.getTargetURI(ref)»" «title» >section «ref.ref.name»</a>«ELSE
		»<a href="«uriUtil.getTargetURI(ref)»" «title»>«FOR tom:ref.contents
		»«tom.genNonParContent»«ENDFOR»</a>«
		ENDIF»'''	
	}
	
	def dispatch CharSequence generate(TextOrMarkup tom) 
		'''«FOR obj:tom.contents»«obj.generate»«ENDFOR»'''

	def dispatch CharSequence generate(UnorderedList ul) '''
		<ul>
			«FOR i:ul.items»
			  	«i.generate»
			«ENDFOR»
		</ul>
	'''

	def dispatch CharSequence generate(OrderedList ul) '''
		<ol>
			«FOR i:ul.items»
				«i.generate»
			«ENDFOR»
		</ol>
	'''

	def dispatch CharSequence generate(Item i) '''
		<li>
			«FOR tom:i.contents»
				«tom.generate»
			«ENDFOR»
		</li>
	'''

	def dispatch CharSequence generate(Anchor a) 
		'''<a name="anchor-«a.name»"></a>'''
		
	def noop() {
	}
		
	def collapse(URI uri) {
		val segments = newArrayList()
		for (s : uri.segmentsList)
			switch s {
				case ".": noop()
				case "..": segments.remove(segments.size - 1)
				default: segments.add(s)
			}
		URI.createURI(uri.scheme + ":/" + segments.join("/"))
	}

	def dispatch CharSequence generate(ImageRef img) {
		val escapedPath = img.path.unescapeXdocChars
		val absoluteOutputURI = accessExtension2.getURI(escapedPath, Outlets::ECLIPSE_HELP).collapse;
		val documentURI = accessExtension2.getURI(uriUtil.targetDocumentName, Outlets::ECLIPSE_HELP);
		val imageChapterRelativeURI = absoluteOutputURI.deresolve(documentURI)
		copy(escapedPath, img.eResource) //imageAbsoluteURI, imageTargetURI, img.eResource.resourceSet.URIConverter)
		'''
			<div class="image" >
			«IF img.name != null»
				«img.name.genLabel»
			«ENDIF»
			<img src="«imageChapterRelativeURI.toString.unescapeXdocChars()»" «IF img.clazz != null»class="«img.clazz.unescapeXdocChars»" «ENDIF»
			«IF img.style != null && !(img.style.length==0)» style="«img.style.unescapeXdocChars»" «ENDIF»/>
			<div class="caption">
			«img.caption.unescapeXdocChars.escapeHTMLChars»
			</div>
			</div>
		'''
	} 

	def genLabel(String name) '''
		«IF this != null »<a name="«name»"></a>«ENDIF»
	'''

	def dispatch CharSequence generate(TextPart tp) {
		tp.text.unescapeXdocChars.escapeHTMLChars
	}

	def dispatch CharSequence generate(Table table) '''
		<table>
		«FOR tr:table.rows»
			«tr.generate»
		«ENDFOR»
		</table>
	'''

	def dispatch CharSequence generate(TableRow tr) '''
		<tr>
		«FOR td:tr.data»
			«td.generate»
		«ENDFOR»
		</tr>
	'''

	def dispatch CharSequence generate(TableData td) '''
		<td>
		«FOR c:td.contents»
			«c.generate»
		«ENDFOR»
		</td>
	'''

	def dispatch CharSequence generate(Emphasize em) 
		'''<em>«FOR c:em.contents»«c.generate»«ENDFOR»</em>'''

	def dispatch CharSequence generate(Link link) 
		'''<a href="«link.url»">«link.text.unescapeXdocChars.escapeHTMLChars»</a>'''
	
	def dispatch CharSequence generate(CodeRef cRef) {
		val prefix = if(cRef.element instanceof JvmAnnotationType && cRef.altText == null) "@"
		val jDocLink = cRef.element.genJavaDocLink
		val gitLink = cRef.element.gitLink
		val fqn = cRef.element.getQualifiedName(".".charAt(0)).unescapeXdocChars.escapeHTMLChars
		val text = if(cRef.altText != null) {
						cRef.altText.generate
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

	def dispatch CharSequence generate(CodeBlock cb) {
		if(cb.isInlineCode) {
			'''<span class="inlinecode">«(cb.contents.head as Code).generateCode.formatCode(cb.language)»</span>'''
		} else {
			val indentToRemove = cb.calcIndent
			val list = 
				if(cb.contents.size > 2)
					cb.contents.tail.take(cb.contents.size - 2)
				else
					Collections::EMPTY_LIST
			val first = cb.contents.head.generateCode.trimLines(indentToRemove).replaceAll("\\A(\\s*\n)*", "")
			val last = if(cb.contents.last != cb.contents.head) {
					cb.contents.last.generateCode.trimLines(indentToRemove).replaceAll("(\\s*\n)*\\Z", "")
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
					«code.generateCode.trimLines(indentToRemove).formatCode(cb.language)»
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

	def dispatch generateCode(Code code) 
		'''«code.contents.unescapeXdocChars»'''
	
	
	def dispatch generateCode(MarkupInCode code) 
		'''«code.generate»'''

	def genNonParContent(TextOrMarkup tom) 
		'''«FOR obj:tom.contents»«obj.generate»«ENDFOR»'''
	
}