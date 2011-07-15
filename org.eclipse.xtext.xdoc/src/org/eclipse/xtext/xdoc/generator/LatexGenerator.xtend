package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.common.types.*
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.LangDef
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Section
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Section2
import org.eclipse.xtext.xdoc.xdoc.Section3
import org.eclipse.xtext.xdoc.xdoc.Section4
import org.eclipse.xtext.xdoc.xdoc.Table
import org.eclipse.xtext.xdoc.xdoc.TableData
import org.eclipse.xtext.xdoc.xdoc.TableRow
import org.eclipse.xtext.xdoc.generator.testimpl.util.XFloat
import org.eclipse.xtext.xdoc.xdoc.TextPart
import org.eclipse.xtext.xdoc.xdoc.OrderedList
import org.eclipse.xtext.xdoc.xdoc.UnorderedList
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.Item
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Anchor
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.CodeRef
import org.eclipse.xtext.xdoc.xdoc.ImageRef
import org.eclipse.xtext.xdoc.xdoc.Todo
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode
import org.eclipse.xtext.xdoc.xdoc.Code
import org.eclipse.xtext.xdoc.xdoc.ChapterRef
import org.eclipse.xtext.xdoc.xdoc.SectionRef
import org.eclipse.xtext.xdoc.xdoc.Section2Ref
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension org.eclipse.xtext.xdoc.generator.util.LatexUtils.*
import static extension org.eclipse.xtext.xdoc.generator.util.XFloat.*
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.generator.config.GeneratorConfig
import org.eclipse.xtext.xdoc.generator.util.LatexUtils
import org.eclipse.xtext.xdoc.generator.util.XFloat
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*
import java.util.HashSet
import java.io.File
import java.util.Map
import java.util.List
import java.nio.channels.Channels
import org.eclipse.emf.common.util.URI
import java.nio.ByteBuffer
import org.eclipse.xtext.xdoc.xdoc.Part
import org.eclipse.xtext.xdoc.xdoc.PartRef

class LatexGenerator implements IGenerator{

	@Inject extension Utils utils
	@Inject GeneratorConfig config
	@Inject HashSet<String> links

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(element: resource.allContentsIterable) {
			if(element instanceof Document) {
				val doc = element as Document				
				fsa.generateFile(
					doc.name.fileName, 
					doc.generate)
			}
		}
	}

	def doGenerate(EObject obj, IFileSystemAccess fsa) {
		val doc = obj as Document; 
		fsa.generateFile(doc.name.fileName, doc.generate)
	}

	def fileName(String name) {
		// System::getProperty("user.dir") + File::separatorChar + 
		//	"src-gen"+ File::separatorChar + 
		name +".tex"
	}
	
	def dispatch generate(Document doc) '''
		«preamble»
		«FOR lang: doc.langDefs»
			«lang.generate»
		«ENDFOR»
		«configureTodo»
		
		\usepackage{hyperref}
		
		\newlength{\itemindentlen}
		«doc.authorAndTitle»
		
		\begin{document}
		\maketitle
		\tableofcontents
		«FOR chapter: doc.chapters»
			
			«chapter.generate»
		«ENDFOR»
		«FOR part: doc.parts»
			
			«part.generate»
		«ENDFOR»
		«genListOfLinks»
		
		«IF !config.release»
			\listoftodos
		«ENDIF»
		\end{document}
	'''

	def genListOfLinks() {
		if(!links.empty)
			'''
				\chapter{List of External Links}
				«FOR link: links»
					\noindent\url{«link»}
				«ENDFOR»
			'''
	}

	def preamble() '''
		\documentclass[a4paper]{scrreprt}
		
		\usepackage[T1]{fontenc}
		\usepackage{ae,aecompl,aeguill} 
		\usepackage[latin1]{inputenc}
		\usepackage{listings}
		\usepackage[american]{babel}
		
		\usepackage{todonotes}
		
		\makeatletter
		\renewcommand\subsection{\medskip\@startsection{subsection}{2}{\z@}%
		  {-.25ex\@plus -.1ex \@minus -.2ex}%
		  {1.5ex \@plus .2ex \@minus -.4ex}%
		  {\ifnum \scr@compatibility>\@nameuse{scr@v@2.96}\relax
		    \setlength{\parfillskip}{\z@ plus 1fil}\fi
		    \raggedsection\normalfont\sectfont\nobreak\size@subsection
		  }%
		}
		\makeatother
		
		\lstset{tabsize=4, basicstyle=\sffamily\small, commentstyle=\textsl, keywordstyle=\bfseries, columns=[r]fullflexible, escapechar={ß}}
		
	'''

	// TODO: migrate to generate
	def configureTodo() {
		'''
		«IF config.release»
			\renewcommand{\todo}[1]{}
		«ENDIF»
		'''
	}

	def dispatch generate(LangDef lang) '''
		\lstdefinelanguage{«lang.name»}
		  {morekeywords={«lang.keywords.join(", ")»},
		    sensitive=true,
		    morecomment=[l]{//},
		    morecomment=[s]{/*}{*/},
		    morestring=[b]",
		    morestring=[b]',
		  }
	'''

	def authorAndTitle(Document doc) {
		'''
		«IF doc.authors != null && !doc.authors.contents.empty»
			\author{«FOR o : doc.authors.contents»«o.genText»«ENDFOR»}
		«ENDIF»
		
		«IF doc.title != null»
			\title{«FOR o : doc.title?.contents»«o.genText»«ENDFOR»}
		«ENDIF»
		'''
	}

	/**
	 * genContent
	 * 
	 * Generates the content for the single structures. 
	 */
	def dispatch generate(AbstractSection sec){
		'''
		«switch (sec){
			Part :
				'''\part{«sec.title.genContent»}'''
			Chapter :			
				'''\chapter{«sec.title.genContent»}'''
			Section : 
				'''\section{«sec.title.genContent»}'''
			Section2:
				'''\subsection{«sec.title.genContent»}'''
			Section3:
				'''\subsubsection{«sec.title.genContent»}'''	
			Section4:
				'''\paragraph{«sec.title.genContent»}'''	
		}»
		«if(sec.name != null)
			switch (sec) {
				Part:
					sec.genLabel
				Chapter:
					sec.genLabel
				Section:
					sec.genLabel
				default:
					sec.title.genLabel				
			}»
		«sec.genContent»
		'''
	}

	def dispatch genContent(Chapter chap){
		'''
		«FOR c : chap.contents»«c.genContent»«ENDFOR»
		«FOR sub : chap.subSections»«sub.generate»«ENDFOR»
		'''
	}

	def dispatch genContent(Section sec){
		'''
		«FOR c : sec.contents»
			«c.genContent»
		«ENDFOR»
		«FOR sub : sec.subSections»
			«sub.generate»
		«ENDFOR»
		'''
	}

	def dispatch genContent(Section2 sec){
		'''
		«FOR c : sec.contents»
			«c.genContent»
		«ENDFOR»
		«FOR sub : sec.subSections»
			«sub.generate»
		«ENDFOR»
		'''
	}

	def dispatch genContent(Section3 sec){
		'''
		«FOR c : sec.contents»
			«c.generate»
		«ENDFOR»
		«FOR sub : sec.subSections»
			«sub.generate»
		«ENDFOR»
		'''
	}

	def dispatch genContent(Section4 sec){
		'''
		«FOR c : sec.contents»
			«c.genContent»
		«ENDFOR»
		'''
	}

	def dispatch genContent(TextOrMarkup tom){
		'''«FOR e : tom.contents»«e.genText»«ENDFOR»'''
	}

	/**
	 * genNonParContent
	 */
	def genNonParContent(TextOrMarkup tom){
		'''
		«FOR e : tom.contents»
			«e.genText»
		«ENDFOR»
		'''
	}

	/**
	 * genLabel
	 * Generates a label
	 */
	def dispatch genLabel(Part part) '''
		«IF part.name != null»
			\label{«part.name?.toString»}
		«ENDIF»
	'''
	

	def dispatch genLabel(PartRef part) '''
		«IF part.part.name != null»
			\label{«part.part.name?.toString»}
		«ENDIF»
	'''

	def dispatch genLabel(ChapterRef cRef) '''
		«IF cRef.chapter.name != null»
			\label{«cRef.chapter.name?.toString»}
		«ENDIF»
	'''
	

	def dispatch genLabel(Chapter chap) '''
		«IF chap.name != null»
			\label{«chap.name?.toString»}
		«ENDIF»
	'''

	def dispatch genLabel(SectionRef sRef) '''
		«IF sRef.section.name != null»
			\label{«sRef.section.name?.toString»}
		«ENDIF»
	'''

	def dispatch genLabel(Section2Ref sRef) '''
		«IF sRef.section2.name != null»
			\label{«sRef.section2.name?.toString»}
		«ENDIF»
	'''

	def dispatch genLabel(Section sec) '''
		«IF sec.name != null»
			\label{«sec.name?.toString»}
		«ENDIF»
	'''

	def dispatch genLabel(TextOrMarkup tom){
		''''''
	}

	/**
	 * genUrl
	 */
	 def genURL(String str){
	 	'''\noindent\url{«str»}'''
	 }

	/**
	 * genText
	 */
	def dispatch genText(Table tab) '''
		\noindent\begin{tabular}{«tab.rows.head.data.genColumns»}
		«tab.rows.map([e | e.genText]).join("\\\\\n")»
		\end{tabular}
	'''

	def dispatch genText(TableRow row){
		row.data.map([e|e.genText]).join(" & ")
	}

	def dispatch genText(TableData tData){
		tData.contents.map([e|e.genContent]).join
	}

	def dispatch genText(TextPart part){
		part.text.unescapeXdocChars.escapeLatexChars
	}

	def dispatch genText(OrderedList ol) '''
		\setlength{\itemindentlen}{\textwidth}
		\begin{enumerate}
		\addtolength{\itemindentlen}{-2.5em}
		«ol.items.map([e | e.genText]).join»
		\end{enumerate}
		\addtolength{\itemindentlen}{2.5em}
	'''

	def dispatch genText(UnorderedList ul){
		'''
		\setlength{\itemindentlen}{\textwidth}
		\begin{itemize}
		\addtolength{\itemindentlen}{-2.5em}
		«ul.items.map([e | e.genText]).join»
		\end{itemize}
		\addtolength{\itemindentlen}{2.5em}
		'''
	}

	def dispatch genText(Item item){
		'''
		\item \begin{minipage}[t]{\itemindentlen}«IF item.contents.head.block»\vspace*{-\baselineskip}«ENDIF»
		«item.contents.map([e|e.genContent]).join»
		\end{minipage}
		'''	
	}

	def dispatch genText(Emphasize em){
		'''\textit{«em.contents.map([e|e.genContent]).join»}'''
	}

	def dispatch genText(Ref ref){
		'''«IF ref.contents.isEmpty»\autoref{«ref.ref.name»}«ELSE»\hyperref[«ref.ref.name»]{«ref.contents.map([e|e.genContent]).join»~(§\ref*{«ref.ref.name»})}«ENDIF»'''
	}

	def dispatch genText(Anchor anchor) {
		'''\phantomsection\label{«anchor.name»}'''
	}

	def dispatch genText(Link link){
		links.add(link.url)
		'''\href{«link.url»}{«link.text»}'''
	}

	def dispatch genText(CodeBlock block) {
		block.removeIndent.specialGenCode
	}

	def dispatch genText(CodeRef codeRef){
		'''\lstinline°«codeRef.element.qualifiedName.unescapeXdocChars.escapeLatexChars»°'''
	}

	def dispatch genText(ImageRef imgRef){
		'''
		\begin{figure}[!h]
		\centering
		\includegraphics{«copy(imgRef)»}
		«IF imgRef.caption != null && imgRef.caption.matches("^\\s*$")»
		\caption{«imgRef.caption»}
		«ENDIF»
		\end{figure}
		'''
		
	}

	def String copy(ImageRef imgRef) {
		try{
			val res = imgRef.eResource
			val buffer = ByteBuffer::allocateDirect(16 * 1024);
			val uri = res.URI
			var relOutDirRoot = ""
			var inDir = ""
			if(uri.platformResource) {
				val inPath = URI::createURI(uri.trimSegments(1).toString + "/" + imgRef.path)
				val outPath = URI::createURI(uri.trimSegments(uri.segmentCount-2).appendSegment(Outlets::WEB_SITE_PATH_NAME).toString + "/" + imgRef.path.replaceAll("\\.\\.",""))
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
				return outPath.toFileString
			}
		} catch (Exception e) {
			throw new RuntimeException(e)
		}
	}

	def dispatch genText(Todo todo){
		'''\todo[inline]{«todo.text.unescapeXdocChars.escapeLatexChars»}'''
	}

	def dispatch genText(MarkupInCode mic){
		''''''
	}

	def dispatch genText(String str){
		str
	}

	def dispatch genText(EObject o){
		//throw new UnsupportedOperationException("genText")
		''''''
	}

	/**
	 * specialGenCode
	 * 
	 * TODO: block.language != null  should be  language != null  
	 */
	 def specialGenCode(CodeBlock block) {
		if(block.inline)
	 		'''\lstinline«block.language?.langSpec»°«block.contents.map([e|e.genCode]).join»°'''
	 	else
			'''
				
				\begin{lstlisting}«block.language?.langSpec»
				«block.contents.map([e|e.genCode]).join»
				\end{lstlisting}
			'''
	}

	// see Bug 345934
	def langSpec(LangDef lang) {
		'''«IF lang != null»[language=«lang.name»]«ENDIF»'''
	}

	/**
	 * genCode
	 */
	def dispatch genCode(Code code){
		code.contents.unescapeXdocChars.prepareListingsString
	}

	def dispatch genCode(MarkupInCode mic){
		'''«lstEscapeToTex()»«mic.genText»«lstEscapeToTex()»'''
	}

	def dispatch genCode(Object o){
		''''''	  	
	}

	/**
	 * genColumns
	 */
	 def genColumns(List<TableData> tabData){
	 	'''«IF !tabData.empty»|«FOR td: tabData»p{«new XFloat(1)/new XFloat(tabData.size)»\textwidth}|«ENDFOR»«ENDIF»'''
//	 	tabData.join('''p{«new XFloat(1)/new XFloat(tabData.size)»\textwidth}''', "|")
	 }
}
