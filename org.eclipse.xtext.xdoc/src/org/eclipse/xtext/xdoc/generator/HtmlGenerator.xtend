package org.eclipse.xtext.xdoc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.lib.IterableExtensions
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions
import java.util.List
import java.util.Map
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.common.util.URI
import java.nio.ByteBuffer
import java.io.File
import java.nio.channels.Channels
import org.eclipse.xtext.xdoc.generator.util.GitExtensions
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension
import org.omg.CORBA.CharSeqHelper
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xdoc.xdoc.XdocFile
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Section
import org.eclipse.xtext.xdoc.xdoc.Section2
import org.eclipse.xtext.xdoc.xdoc.Section3
import org.eclipse.xtext.xdoc.xdoc.Section4
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.CodeRef
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.Code
import org.eclipse.xtext.xdoc.xdoc.LangDef
import org.eclipse.xtext.xdoc.xdoc.TextPart
import org.eclipse.xtext.xdoc.xdoc.Anchor
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.OrderedList
import org.eclipse.xtext.xdoc.xdoc.UnorderedList
import org.eclipse.xtext.xdoc.xdoc.Item
import org.eclipse.xtext.xdoc.xdoc.Table
import org.eclipse.xtext.xdoc.xdoc.TableRow
import org.eclipse.xtext.xdoc.xdoc.TableData
import org.eclipse.xtext.xdoc.xdoc.ImageRef
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode
import org.eclipse.xtext.xdoc.xdoc.Todo
import org.eclipse.xtext.xtend2.lib.ResourceExtensions
import java.net.URLDecoder
import org.eclipse.xtext.xdoc.generator.util.StringUtils
import org.eclipse.xtext.xdoc.xdoc.SectionRef
import org.eclipse.xtext.xdoc.xdoc.ChapterRef
import org.eclipse.xtext.xdoc.xdoc.Section2Ref

class HtmlGenerator implements IGenerator {
	
	@Inject extension Utils utils
	@Inject extension PlainText plaintext
	@Inject extension HTMLNamingExtensions naming
	@Inject extension AbstractSectionExtension ase
	@Inject extension GitExtensions git
	@Inject extension JavaDocExtension jdoc
	@Inject extension PHPPhoenixGenerator ppg
	 
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		try{
			for(file: ResourceExtensions::allContentsIterable(resource).filter(typeof(XdocFile))) {
				if(file.mainSection instanceof Document) {
					(file.mainSection as Document).generate(fsa)
				}
			}
		} catch(Exception e) {
			throw new RuntimeException(e)
		}
	}

	def void generate(Document doc, IFileSystemAccess fsa) {
		doc.generatePHP(fsa)
		fsa.generateFile("_index.html", Outlets::WEB_SITE,
		'''
			«doc.body»
		'''
		)
		// fsa.generateFile("toc.html", )
		val leftNav = doc.leftNavToc
		for(chapter : doc.chapters) {
			chapter.generate(fsa, leftNav, (chapter as Chapter).elementIdForSubToc)
		}
	}

	def CharSequence genPrevButton(AbstractSection section) '''
		<span class="prev_button">
			<a href="«section.fullURL»" >Previous</a>
		</span>
	'''

	def CharSequence genNextButton(AbstractSection section) '''
		<span class="next_button">
			<a href="«section.fullURL»" >Next</a>
		</span>
	'''

	def void generateFile(AbstractSection section, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId){
		section.generatePHP(fsa)
		fsa.generateFile(URLDecoder::decode(section.resourceURL), Outlets::WEB_SITE, '''
			<br style="clear:both;height:1em;">
				<div id="leftcol">
					«leftNav»
				</div>
				<div id="midcolumn">
					«section.generate(fsa, leftNav, leftNavUnfoldSubTocId)»
				</div>
				<br style="clear:both;height:1em;">
		''')
	}
	
	def dispatch CharSequence generate(ChapterRef chap, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) {
		chap.chapter.generateFile(fsa, leftNav, chap.fullURL)
		
		'''<a href="«chap.fullURL»"><«chap.tag»>«chap.genPlainText»</«chap.tag»></a>'''
	}
	
	def dispatch CharSequence generate(SectionRef section, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) {
		section.section.generateFile(fsa, leftNav, section.fullURL)
		'''<a href="«section.fullURL»"><«section.tag»>«section.genPlainText»</«section.tag»></a>'''
	}
	
	def dispatch CharSequence generate(Section2Ref section2, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) {
		section2.section2.generateFile(fsa, leftNav, section2.fullURL)
		'''<a href="«section2.fullURL»"><«section2.tag»>«section2.genPlainText»</«section2.tag»></a>'''
	}
	
	def dispatch CharSequence generate(Chapter chap, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) '''
		«chap.localId.anchor»
		<«chap.tag»>«chap.title.genNonParText»</«chap.tag»>
				«chap.toc»
				
		«FOR c : chap.contents »
			«c.genText»
		«ENDFOR»
		«FOR sec: chap.sections»
			«sec.generate(fsa, leftNav, leftNavUnfoldSubTocId)»
		«ENDFOR»
	'''
	
	def dispatch CharSequence generate(Section sec, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) '''
		«sec.localId.anchor»
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
			«sec.toc»
		«FOR c : sec.contents»
			«c.genText»
		«ENDFOR»
		«FOR sec2: sec.sections»
			«sec2.generate(fsa, leftNav, leftNavUnfoldSubTocId)»
		«ENDFOR»
	'''

	def dispatch CharSequence generate(Section2 sec, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) '''
		«sec.localId.anchor»
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText»
		«ENDFOR»
		«FOR sec3: sec.sections»
			«sec3.generate(fsa, leftNav, leftNavUnfoldSubTocId)»
		«ENDFOR»
	'''
	
	def dispatch CharSequence generate(Section3 sec, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) '''
		«sec.localId.anchor»
		<«sec.tag»>«sec.title.genNonParText»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText»
		«ENDFOR»
		«FOR c : sec.sections»
			«c.generate(fsa, leftNav, leftNavUnfoldSubTocId)»
		«ENDFOR»
	'''

	def dispatch CharSequence generate(Section4 sec, IFileSystemAccess fsa, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId) '''
		«sec.localId.anchor»
		<«sec.tag»>«sec.title.genText»</«sec.tag»>
		«FOR c : sec.contents»
			«c.genText»
		«ENDFOR»
	'''
	
	def String tag(AbstractSection section) {
		switch (section) {
			Document: "h1"
			Chapter: "h1"
			Section: "h1"
			Section2: "h2"
			Section3: "h3"
			Section4: "h4"
		}
	}

	def CharSequence body(Document doc) '''
		<br style="clear:both;height:1em;">
		<div id="leftcol">
		«generateLogo»
		</div>
		<div id="midcolumn">
			«doc.genAuthors»
			«doc.toc»
		</div>
		<br style="clear:both;height:1em;">
	'''

	def CharSequence toc(AbstractSection section) {
		if(!section.sections.empty)
		'''
			<div class="toc">
			  «section.subToc»
			</div>
		'''
	}

	def CharSequence subToc(AbstractSection section) '''
		<ul>
		  «FOR ss: section.sections»
		    «ss.tocEntry»
		  «ENDFOR»
		</ul>
	'''
	def dispatch CharSequence tocEntry(Chapter chapter) 
	'''<li><a href="«chapter.fullPHPURL»" >«chapter.title.genNonParText»</a>«IF !chapter.sections.empty»
	«chapter.subToc»«ENDIF»</li>
	'''

	def dispatch CharSequence tocEntry(AbstractSection section) '''
		<li><a href="«section.fullPHPURL»" >«section.title.genNonParText »</a></li>
	'''
		
	
	def CharSequence leftNavToc(Document doc) {
		'''
			«generateLogo»
			<ul id="leftnav">
			  «FOR c: doc.sections»
		    	«c.leftNavTocEntry»
		  	  «ENDFOR»
			</ul>
		'''
	}
	def CharSequence leftNavSubToc(Chapter chap) '''
	<ul style="display: none;" id="«chap.elementIdForSubToc»">
	«FOR ss: chap.sections»
	    «ss.leftNavTocEntry»
	«ENDFOR»
	</ul>
	'''
	def dispatch CharSequence leftNavTocEntry(Chapter chapter) '''
		<li class="separator"><div class="separator">
		<img src="triangle.gif" style="height:12px; margin-right: 2px; «IF chapter.sections.empty»display:none«ENDIF»"  /><img src="triangle-90.gif" style="display:none; margin-right: 2px" height="12px" />
		<a href="«chapter.fullPHPURL»">«chapter.title.genNonParText»</a></div>
		«IF !chapter.sections.empty»«chapter.leftNavSubToc»«ENDIF»</li>
	'''

	def dispatch CharSequence leftNavTocEntry(AbstractSection section) '''
		<li id="«section.fullURL»" ><a href="«section.fullPHPURL»" >«section.title.genNonParText »</a></li>
	'''

	def CharSequence genAuthors(Document doc) {
		if(doc.authors != null)
			'''
				<div class="authors">
				«doc.authors.genText»
				</div>
			'''
	}

	def CharSequence genNonParText(TextOrMarkup tom) {
		'''«FOR c: tom.contents»«c.genText»«ENDFOR»'''
	}

	def dispatch CharSequence genText(TextOrMarkup tom) {
		'''
		<p>
		«FOR c: tom.contents»«c.genText»«ENDFOR»
		</p>
		'''
	}

	def dispatch CharSequence genText(CodeBlock cb) {
		if(!cb.contents.empty) {
			if(cb.inlineCode)
				'''<span class="inlinecode">«(cb.contents.head as Code).generateCode(cb.language)»</span>'''
			else {
				val block = StringUtils::removeIndent(cb)
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
	}

	def dispatch CharSequence genText(CodeRef cRef) {
		val prefix = if(cRef.element instanceof JvmAnnotationType && cRef.altText == null) "@"
		val jDocLink = cRef.element.genJavaDocLink
		val gitLink = cRef.element.gitLink
		val fqn = cRef.element.getQualifiedName(".".charAt(0)).unescapeXdocChars.escapeHTMLChars
		val text = if(cRef.altText != null) {
						cRef.altText.genNonParText
					} else {
						cRef.element.dottedSimpleName
					}
		var ret = if(jDocLink != null)
			'''<a class="jdoc" href="«cRef.element.genJavaDocLink»" title="«fqn»">«
			prefix»«text»</abbr></a>'''
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

	def dispatch CharSequence genText(Emphasize em)
		'''<em>«em.contents.generate»</em>'''

	def dispatch CharSequence genText(Todo todo) '''
			<div class="todo" >
			«todo.text»
			</div>
		'''

	def CharSequence generate(List<TextOrMarkup> tomList) {
		if (tomList.size == 1) {
			tomList.head.genNonParText
		} else '''
			«FOR tom: tomList»
				«tom.genText»
			«ENDFOR»
		'''
	}

	def dispatch CharSequence generateCode(Code code, LangDef lang)
		'''«code.contents.unescapeXdocChars.formatCode(lang)»'''

	def dispatch CharSequence generateCode(Code code, Void lang)
		'''«code.contents.unescapeXdocChars.formatCode(null)»'''

	def dispatch CharSequence generateCode(MarkupInCode mic, LangDef lang)
		'''«mic.genText»'''

	def dispatch CharSequence genText(TextPart tp) {
		tp.text.unescapeXdocChars
	}

	def dispatch CharSequence genText(Anchor a) {
		// helpGen.generate(a)
	}

	def dispatch CharSequence genText(Ref ref) {
		val title = if(ref.ref instanceof AbstractSection) {
			'''title="Go to &quot;«(ref.ref as AbstractSection).title.genPlainText»&quot;"'''
		}
		'''«IF ref.contents.isEmpty »<a href="«ref.ref.fullPHPURL»" «title» >section «ref.ref.name»</a>«ELSE
		»<a href="«ref.ref.fullPHPURL»" «title»>«FOR tom:ref.contents
		»«tom.genNonParText»«ENDFOR»</a>«
		ENDIF»'''
	}

	
	def dispatch CharSequence genText(Link link) 
		'''<a href="«link.url»" >«IF link.text != null»«link.text»«ELSE»«link.url»«ENDIF»</a>'''

	def dispatch CharSequence genText(OrderedList ol)
		'''
		<ol>
		  «FOR i:ol.items»
		    «i.genText»
		  «ENDFOR»
		</ol>
		'''

	def dispatch CharSequence genText(UnorderedList ol)
		'''
		<ul>
		  «FOR i:ol.items»
		    «i.genText»
		  «ENDFOR»
		</ul>
		'''


	def dispatch CharSequence genText(Item item) '''
		<li>«item.contents.generate»</li>
	'''

	def dispatch CharSequence genText(Table table) '''
		<table>
		  «FOR tr: table.rows»
		    «genRow(tr)»
		  «ENDFOR»
		</table>
	'''

	def CharSequence genRow(TableRow tr) '''
		<tr>
		  «FOR td: tr.data»
		    «genData(td)»
		  «ENDFOR»
		</tr>
	'''

	def CharSequence genData(TableData td)
	'''<td>«td.contents.generate»</td>'''

	def dispatch CharSequence genText(ImageRef img) {
		copy(img.path.unescapeXdocChars, img.eResource)
		'''
			<div class="image" >
			«IF img.name != null»
				<a>«img.name»</a>
			«ENDIF»
			<img src="«img.path.unescapeXdocChars().replaceAll("\\.\\./","")»" 
				«IF !img.clazz.nullOrEmpty»
					class="«img.clazz.unescapeXdocChars»" 
				«ELSE»
					width="600px"
				«ENDIF»
				«IF !img.style.nullOrEmpty»
					 style="«img.style.unescapeXdocChars»" 
				«ENDIF»
			/>
			<div class="caption">
			«img.caption.unescapeXdocChars.escapeHTMLChars»
			</div>
			</div>
		'''
	}

	def void copy(String fromRelativeFileName, Resource res) {
		try{
			val buffer = ByteBuffer::allocateDirect(16 * 1024);
			val uri = res.URI
			var relOutDirRoot = ""
			var inDir = ""
			if(uri.platformResource) {
				val inPath = URI::createURI(uri.trimSegments(1).toString + "/" + fromRelativeFileName)
				val outPath = URI::createURI(uri.trimSegments(uri.segmentCount-2).appendSegment(Outlets::WEB_SITE_PATH_NAME).toString + "/" + fromRelativeFileName.replaceAll("\\.\\.",""))
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

	def CharSequence anchor(String name)
		'''<a name="«name»" ></a>'''

	def CharSequence elementIdForSubToc(Chapter chap)
		'''subToc_«chap.fullURL»'''
	
	def CharSequence generateLogo() '''
		<div class="nav-logo">
			<a href="index.php"><img src="http://wiki.eclipse.org/images/thumb/d/db/Xtext_logo.png/450px-Xtext_logo.png" style="margin-left:30px; width:125px"/></a>
		</div>'''
	
	def CharSequence javaScriptForNavigation(){
		'''
		 <script type="text/javascript"> 
			function initTocMenu(ActiveSubTocElementId){
				var menu = document.getElementById("leftnav");
				
				var chapters = menu.children;
				addHideSubsectionFunction(chapters);
				
				document.getElementById(ActiveSubTocElementId).style.display = "block";
			}
		
			function addHideSubsectionFunction(items){
				for (var i = 0; i < items.length; i++) {
					if (items[i].firstElementChild ){
						items[i].firstElementChild.onclick = function(){toc_toggle_subsections(this.parentNode);};
						items[i].firstElementChild.style.cursor = "pointer";
					}
				}
			}
			function toc_toggle_subsections(chap){
				if ( chap.children[1].style.display != "none" ) {
					chap.children[1].style.display = "none"
				} else {
					chap.children[1].style.display = "block"
					
				}
			}
			
			function highlightCurrentSection(sec) {
				document.getElementById(sec).style.backgroundColor= "#D0D0D0"
			}
		</script>
		'''
	}
}