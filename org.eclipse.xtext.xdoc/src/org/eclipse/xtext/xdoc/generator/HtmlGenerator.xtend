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
		val leftNav = doc.leftNavToc(fileNames)
		''''''
		for(chapter : doc.sections) {
			val index = doc.chapters.indexOf(chapter)
			val prevS = if(index > 0) doc.chapters.get(index - 1) ?.genPrevButton(fileNames)
			val nextS = if(index < doc.chapters.size - 1) doc.chapters.get(index + 1)?.genNextButton(fileNames)
			chapter.generate(fsa, '''«prevS»«nextS»''', fileNames, leftNav, (chapter as Chapter).elementIdForSubToc(fileNames))
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

	def generate(AbstractSection ^as, IFileSystemAccess fsa, CharSequence buttons, Map<AbstractSection, String> fileNames, CharSequence leftNav, CharSequence leftNavUnfoldSubTocId){
		fsa.generateFile(fileNames.get(^as).decode,
		'''
		<html>
		  «^as.title.header»
		
		<body onload="initTocMenu('«leftNavUnfoldSubTocId»');">
		«_copiedPageLayoutTop»
		<div id="novaContent" class="faux">
			<br style="clear:both;height:1em;">
			<div id="leftcol">
				«leftNav»
			</div>
			<div id="midcolumn">
				<div class="buttonbar">
				«buttons»
				</div>
				<div style="clear:both;"></div>
				
				«^as.genContent(fsa, fileNames, leftNav)»
				<div class="buttonbar">
				«buttons»
				</div>
				<div style="clear:both;"></div>
			</div>
			<br style="clear:both;height:1em;">
		</div>
		«_copiedPageLayoutBottom»
		</body>
		</html>
	''')
	''''''
	}
	
	def dispatch genContent(Chapter chap, IFileSystemAccess fsa, Map<AbstractSection, String> fileNames, CharSequence leftNav) {
		for(section: chap.sections) {
			val index = chap.sections.indexOf(section)
			val prevS = if(index > 0) chap.sections.get(index - 1)?.genPrevButton(fileNames)
			val nextS = if(index < chap.sections.size - 1) chap.sections.get(index + 1)?.genNextButton(fileNames)
			section.generate(fsa, '''«prevS»«nextS»''', fileNames, leftNav, chap.elementIdForSubToc(fileNames))
		}
		'''
		<«chap.tag»>«chap.title.genNonParText(fileNames)»</«chap.tag»>«IF chap.name != null»
				<a name="«chap.name»"></a>«ENDIF»
				«chap.toc(fileNames)»
				
				«FOR c : chap.contents »
					«c.genText(fileNames)»
				«ENDFOR»
	'''
	}
	
	
	def dispatch genContent(Section sec, IFileSystemAccess fsa, Map<AbstractSection, String> fileNames, CharSequence leftNav) '''
		«sec.labelName(fileNames).anchor»
			<«sec.tag»>«sec.title.genNonParText(fileNames)»</«sec.tag»>
			«sec.toc(fileNames)»
			«FOR c : sec.contents»
				«c.genText(fileNames)»
			«ENDFOR»
			«FOR sec2: sec.sections»
				«sec2.generate(fileNames)»
			«ENDFOR»
	'''

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
		  <link href="http://www.eclipse.org/Xtext/documentation/1_0_1/book.css" rel="stylesheet" type="text/css">
		  <link href="http://www.eclipse.org/Xtext/documentation/1_0_1/code.css" rel="stylesheet" type="text/css">
		  <link href="http://www.eclipse.org/eclipse.org-common/yui/2.6.0/build/reset-fonts-grids/reset-fonts-grids.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/yui/2.6.0/build/menu/assets/skins/sam/menu.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/reset.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/layout.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/header.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/footer.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/visual.css" rel="stylesheet" type="text/css" media="screen">
		  <link href="http://www.eclipse.org/eclipse.org-common/themes/Nova/css/print.css" rel="stylesheet" type="text/css" media="print">
		  «javaScriptForNavigation»
		</head>
	'''

	def body(Document doc, Map<AbstractSection, String> fileNames) '''
		<body>
			«_copiedPageLayoutTop()»
			<div id="novaContent" class="faux">
				<br style="clear:both;height:1em;">
				<div id="leftcol">
				«generateLogo»
				</div>
				<div id="midcolumn">
					«doc.genAuthors(fileNames)»
					«doc.toc(fileNames)»
				</div>
				<br style="clear:both;height:1em;">
			</div>
			«_copiedPageLayoutBottom()»
		</body>
	'''

	def toc(AbstractSection ^as, Map<AbstractSection, String> fileNames) {
		if(!^as.sections.empty)
		'''
			<div class="toc">
			  «^as.subToc(fileNames)»
			</div>
		'''
	}

	def subToc(AbstractSection ^as, Map<AbstractSection, String> fileNames) '''
		<ul>
		  «FOR ss: ^as.sections»
		    «ss.tocEntry(fileNames)»
		  «ENDFOR»
		</ul>
	'''
	def dispatch tocEntry(Chapter chapter, Map<AbstractSection, String> fileNames) 
	'''<li><a href="«fileNames.get(chapter)»" >«chapter.title.genNonParText(fileNames)»</a>«IF !chapter.sections.empty»
	«chapter.subToc(fileNames)»«ENDIF»</li>
	'''

	def dispatch tocEntry(AbstractSection section, Map<AbstractSection, String> fileNames) '''
		<li><a href="«fileNames.get(section)»" >«section.title.genNonParText(fileNames) »</a></li>
	'''
		
	
	def leftNavToc(Document doc, Map<AbstractSection, String> fileNames) {
		'''
			«generateLogo»
			<ul id="leftnav">
			  «FOR c: doc.sections»
		    	«c.leftNavTocEntry(fileNames)»
		  	  «ENDFOR»
			</ul>
		'''
	}
	def leftNavSubToc(Chapter chap, Map<AbstractSection, String> fileNames) '''
	<ul style="display: none;" id="«chap.elementIdForSubToc(fileNames)»">
	«FOR ss: chap.sections»
	    «ss.leftNavTocEntry(fileNames)»
	«ENDFOR»
	</ul>
	'''
	def dispatch leftNavTocEntry(Chapter chapter, Map<AbstractSection, String> fileNames) 
	'''<li class="separator"><div class="separator">«chapter.title.genNonParText(fileNames)»</div>
	«IF !chapter.sections.empty»«chapter.leftNavSubToc(fileNames)»«ENDIF»</li>
	'''

	def dispatch leftNavTocEntry(AbstractSection section, Map<AbstractSection, String> fileNames) '''
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

	def elementIdForSubToc(Chapter chap,  Map<AbstractSection, String> fileNames)
		'''subToc_«fileNames.get(chap)»'''
	
	def generateLogo() 
		'''<img src="http://wiki.eclipse.org/images/thumb/d/db/Xtext_logo.png/450px-Xtext_logo.png" style="width: 185px;"/>'''
	
	def javaScriptForNavigation(){
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
		</script>
		'''
	}
		
	def _copiedPageLayoutTop()
	'''
	<div id="novaWrapper">		<div id="clearHeader">
			<div id="logo">
					<div id="promotion"><a href="/indigo/friends.php">
		<img src="/home/promotions/indigo/indigo.png" alt="Indigo Is Coming!"/>
	</a>

	</div>

			</div>
			<div id="otherSites">
				<div id="sites">
				<ul id="sitesUL">
					<li><a href='http://marketplace.eclipse.org'><img alt="Eclipse Marketplace" src="http://dev.eclipse.org/custom_icons/marketplace.png"/>&nbsp;<div>Eclipse Marketplace</div></a></li>
					<li><a href='http://live.eclipse.org'><img alt="Eclipse Live" src="http://dev.eclipse.org/custom_icons/audio-input-microphone-bw.png"/>&nbsp;<div>Eclipse Live</div></a></li>

		    		<li><a href='https://bugs.eclipse.org/bugs/'><img alt="Bugzilla" src="http://dev.eclipse.org/custom_icons/system-search-bw.png"/>&nbsp;<div>Bugzilla</div></a></li>
		    		<li><a href='http://www.eclipse.org/forums/'><img alt="Forums" src="http://dev.eclipse.org/large_icons/apps/internet-group-chat.png"/>&nbsp;<div>Eclipse Forums</div></a></li>
		    		<li><a href='http://www.planeteclipse.org/'><img alt="Planet Eclipse" src="http://dev.eclipse.org/large_icons/devices/audio-card.png"/>&nbsp;<div>Planet Eclipse</div></a></li>
		    		<li><a href='http://wiki.eclipse.org/'><img alt="Eclipse Wiki" src="http://dev.eclipse.org/custom_icons/accessories-text-editor-bw.png"/>&nbsp;<div>Eclipse Wiki</div></a></li>
		    		<li><a href='http://portal.eclipse.org'><img alt="MyFoundation Portal" src="http://dev.eclipse.org/custom_icons/preferences-system-network-proxy-bw.png"/><div>My Foundation Portal</div></a></li>
		    	</ul>

		    	</div>
			</div>		
		</div>

	<div id="header">			
		<div id="menu">
			<ul>
			<li><a href="/Xtext" target="_self">Home</a></li> 
			<li><a href="/Xtext/download" target="_self">Download</a></li> 
			<li><a href="xtext.html" target="_self">Documentation</a></li> 
			<li><a href="/Xtext/support" target="_self">Support</a></li> 
			<li><a href="/Xtext/community" target="_self">Community</a></li> 
			<li><a href="/Xtext/developers" target="_self">Developers</a></li> 
				</ul>

		</div>

		<div id="search">
				<form action="http://www.google.com/cse" id="searchbox_017941334893793413703:sqfrdtd112s">
			 	<input type="hidden" name="cx" value="017941334893793413703:sqfrdtd112s" />
		  		<input id="searchBox" type="text" name="q" size="25" />
		  		<input id="searchButton" type="submit" name="sa" value="Search" />
				</form>
			<script type="text/javascript" src="http://www.google.com/coop/cse/brand?form=searchbox_017941334893793413703%3Asqfrdtd112s&lang=en"></script>			
		</div>

	</div>
	'''
	
	def _copiedPageLayoutBottom()
	'''
	<div id="clearFooter"></div>
	<div id="footer">
	<ul id="footernav">
		<li><a href="/">Home</a></li>

		<li><a href="/legal/privacy.php">Privacy Policy</a></li>
		<li><a href="/legal/termsofuse.php">Terms of Use</a></li>
		<li><a href="/legal/copyright.php">Copyright Agent</a></li>
		<li><a href="/legal/">Legal</a></li>
		<li><a href="/org/foundation/contact.php">Contact Us</a></li>
	</ul>

	<span id="copyright">Copyright &copy; 2011 The Eclipse Foundation. All Rights Reserved.</span>
	</div>
	'''
}