package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension lib.IterableExtensions.*
import org.eclipse.xtext.xdoc.xdoc.Document
import com.google.inject.Inject
import java.util.Hashtable
import org.eclipse.xtext.xbase.lib.StringExtensions
import org.eclipse.xtext.xdoc.generator.util.StringUtils
import java.util.Set
import org.eclipse.xtext.xdoc.generator.config.GeneratorConfig
import org.eclipse.xtext.xdoc.xdoc.LangDef

class XdocLatexGenerator implements IGenerator {
	
	@Inject Set<String> links
	@Inject GeneratorConfig config
	
	override doGenerate(Resource res, IFileSystemAccess fsa){
		val doc = res.allContentsIterable.filter(typeof(Document))?.head
		if(doc != null) {
			links.clear()
			fsa.generateFile(res.URI.lastSegment, doc.generate)
		}
	}

	def dispatch generate(Document doc)
		'''
		«preamble»
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
		«genListOfLinks» FOR this-»
		'''

	def genListOfLinks() '''
		\chapter{List of Links}
		«FOR link: links»
		\url{«link»}
		«ENDFOR»
	'''	
	
	def preamble() '''
		\documentclass[a4paper]{scrreprt}
		
		\usepackage[T1]{fontenc}
		\usepackage{ae,aecompl,aeguill} 
		\usepackage[latin1]{inputenc}
		\usepackage{listings}
		\usepackage[american]{babel}
		
		\usepackage{todonotes}
		%% force more space between subsections!
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
		
		\lstset{tabsize=4, basicstyle=\sffamily\small, commentstyle=\textsl, keywordstyle=\bfseries, columns=[r]fullflexible, escapechar={°}}
		
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
		  {morekeywords={«lang.keywords.join(",")»},
		    sensitive=true,
		    morecomment=[l]{//},
		    morecomment=[s]{/*}{* /},
		    morestring=[b]",
		    morestring=[b]',
		  }
	'''

	def authorAndTitle(Document doc) {
		'''
		\author{«FOR o : doc.authors.contents»«o.generate»«ENDFOR»}
		
		\title{«FOR o : doc.title.contents»«o.generate»«ENDFOR»}
		'''
	}
/*	«DEFINE main FOR Document -»

%%\usepackage[english]{babel}

% import this as last package

\author{«EXPAND genContent FOR this.authors»}
\title{«EXPAND genContent FOR this.title»}


\begin{document}
\maketitle
\tableofcontents
«EXPAND genContent FOREACH this.chapters»
«EXPAND genLol FOR this-»
«IF ((String) (GLOBALVAR release)) == "false"»
\listoftodos«
ENDIF»
\end{document}
«ENDFILE-»
«ENDDEFINE»

«DEFINE genLangDef FOR LangDef»
\lstdefinelanguage{«this.name»}
  {morekeywords={«EXPAND genText FOREACH this.keywords SEPARATOR ', '»},
    sensitive=true,
    morecomment=[l]{//},
    morecomment=[s]{/*}{* /},
    morestring=[b]",
    morestring=[b]',
  }
«ENDDEFINE»

«DEFINE genContent FOR Chapter-»
\chapter{«EXPAND genContent FOR this.title»}
«EXPAND genLabel FOR this»
«EXPAND genContent FOREACH contents SEPARATOR "\n\n"-»
«EXPAND genContent FOREACH subSections SEPARATOR "\n"-»
«ENDDEFINE»

«DEFINE genContent FOR Section»
\section{«EXPAND genContent FOR this.title»}
«EXPAND genLabel FOR this»
«EXPAND genContent FOREACH contents SEPARATOR "\n\n"»
«EXPAND genContent FOREACH subSections SEPARATOR "\n"»
«ENDDEFINE»

«DEFINE genContent FOR Section2»
\subsection{«EXPAND genContent FOR this.title»}
«EXPAND genLabel FOR this.name»
«EXPAND genContent FOREACH contents SEPARATOR "\n\n"»
«EXPAND genContent FOREACH subSections SEPARATOR "\n"-»
«ENDDEFINE»

«DEFINE genContent FOR Section3»
\subsubsection{«EXPAND genContent FOR this.title»}
«EXPAND genLabel FOR this.name»
«EXPAND genContent FOREACH contents SEPARATOR "\n\n"»
«EXPAND genContent FOREACH subSections SEPARATOR "\n"-»
«ENDDEFINE»

«DEFINE genContent FOR Section4»
\paragraph{«EXPAND genContent FOR this.title»}
«EXPAND genLabel FOR this.name»
«EXPAND genContent FOREACH contents SEPARATOR "\n\n"»
«ENDDEFINE»

«DEFINE genNonParContent FOR TextOrMarkup»«EXPAND genText FOREACH this.contents»«ENDDEFINE»

«DEFINE genContent FOR TextOrMarkup»«FOREACH this.contents AS par»«EXPAND genText FOR par»«ENDFOREACH»«ENDDEFINE»

«DEFINE genContent FOR Object»«throwUnsupportedOperation("genContent",this)»«ENDDEFINE»

«DEFINE genText FOR Object»«throwUnsupportedOperation("genText",this)»«ENDDEFINE»

«DEFINE genText FOR Table»
\noindent\begin{tabular}{«EXPAND genColumns FOR this.rows.first().data»}
«EXPAND genText FOREACH this.rows SEPARATOR "\\\\\n"»
\end{tabular}
«ENDDEFINE»

«DEFINE genText FOR TableRow»«EXPAND genText FOREACH this.data SEPARATOR " & "»«ENDDEFINE»

«DEFINE genText FOR TableData»«EXPAND genContent FOREACH this.contents»«ENDDEFINE»

«REM»
«DEFINE genColumns FOR List»«ENDDEFINE»
«ENDREM»
«DEFINE genColumns FOR List»«FOREACH ((List[TableData])this).contents AS content»|p{«1.0/this.size»\textwidth}«ENDFOREACH»|«ENDDEFINE»

«DEFINE genText FOR TextPart»«escapeLatexChars(unescapeXdocChars(this.text))»«ENDDEFINE»

«DEFINE genText FOR OrderedList»
\setlength{\itemindentlen}{\textwidth}
\begin{enumerate}
\addtolength{\itemindentlen}{-2.5em}
«EXPAND genText FOREACH items»
\end{enumerate}
\addtolength{\itemindentlen}{2.5em}«ENDDEFINE»

«DEFINE genText FOR UnorderedList-»
\setlength{\itemindentlen}{\textwidth}
\begin{itemize}
\addtolength{\itemindentlen}{-2.5em}
«EXPAND genText FOREACH items SEPARATOR "\n"»
\end{itemize}
\addtolength{\itemindentlen}{2.5em}«ENDDEFINE»

«DEFINE genText FOR Item-»
\item \begin{minipage}[t]{\itemindentlen}«IF block(this.contents.first())»\vspace*{-\baselineskip}«ENDIF»
«EXPAND genContent FOREACH this.contents»
\end{minipage}«ENDDEFINE»

«DEFINE genText FOR Emphasize»\textit{«EXPAND genContent FOREACH this.contents»}«ENDDEFINE»

«DEFINE genText FOR Ref-»
«IF this.contents.isEmpty»\autoref{«this.ref.name»}«ELSE»\hyperref[«this.ref.name»]{«EXPAND genContent FOREACH this.contents»~(§\ref*{«this.ref.name»})}«ENDIF»«
ENDDEFINE»

«DEFINE genText FOR Anchor-»
\phantomsection\label{«this.name»}«
ENDDEFINE»

«DEFINE genText FOR Link»\href{«this.url»}{«this.text»}«storeLink(this)»«ENDDEFINE»

«DEFINE genText FOR CodeBlock»«EXPAND specialGenCode FOR removeIndent(this)»«ENDDEFINE»

«DEFINE specialGenCode FOR CodeBlock»«
 IF inline(this)»\lstinline«IF language!=null»[language=«this.language.name»]«ENDIF»°«EXPAND genCode FOREACH this.contents»°«
 ELSE»\begin{lstlisting}«IF language!=null»[language=«this.language.name»]«
 ENDIF»
«EXPAND genCode FOREACH this.contents SEPARATOR "\n"»
\end{lstlisting}
«ENDIF»«ENDDEFINE»

«DEFINE genText FOR CodeRef»\lstinline°«escapeLatexChars(unescapeXdocChars(this.element.qualifiedName))»°«ENDDEFINE»

«DEFINE genText FOR ImageRef»«copy((String) GLOBALVAR srcDir, this.path, (String) GLOBALVAR dir)»\includegraphics{«this.path»}«ENDDEFINE»

«DEFINE genCode FOR Object»«ENDDEFINE»

«DEFINE genCode FOR Code»«prepareListingsString(unescapeXdocChars(this.contents))»«ENDDEFINE»

«DEFINE genText FOR MarkupInCode»«ENDDEFINE»

«DEFINE genCode FOR MarkupInCode»«lstEscapeToTex()»«EXPAND genText FOR this»«lstEscapeToTex()»«ENDDEFINE»

«DEFINE genText FOR Todo-»
\todo[inline]{«escapeLatexChars(unescapeXdocChars(this.text))»}«
ENDDEFINE»

«DEFINE genLabel FOR ChapterRef-»
«IF this.chapter.name != null-»
\label{«this.chapter.name»}«
ENDIF-»
«ENDDEFINE»

«DEFINE genLabel FOR Chapter-»
«IF this.name != null»\label{«this.name»}«ENDIF»
«ENDDEFINE»

«DEFINE genLabel FOR Section-»
«IF this.name != null-»
\label{«this.name»}«
ENDIF-»
«ENDDEFINE»

«DEFINE genLabel FOR SectionRef-»
«IF this.section.name != null-»
\label{«this.section.name»}«
ENDIF-»
«ENDDEFINE»

«DEFINE genLabel FOR Section2Ref-»
«IF this.section2.name != null-»
\label{«this.section2.name»}«
ENDIF-»
«ENDDEFINE»

«DEFINE genLabel FOR String-»
«IF this != null -»
\label{«this»}«
ENDIF-»
«ENDDEFINE»

«DEFINE genLol FOR Document -»
«IF !getStoredLinks().isEmpty-»
\chapter*{List of External Links}
«EXPAND genURL FOREACH getStoredLinks() SEPARATOR "\n\n"»
«ENDIF-»
«ENDDEFINE»

«DEFINE genURL FOR String -»
\noindent\url{«this»}«
ENDDEFINE»

«DEFINE genText FOR String-»
«this-»
«ENDDEFINE»
*/
}