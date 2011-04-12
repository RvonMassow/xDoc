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


import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xdoc.generator.util.*
import org.eclipse.xtext.xdoc.generator.*

import org.eclipse.emf.ecore.EObject



class XdocGenerator implements IGenerator {

//	@Inject Iterable<GlossaryEntry> as glossary

	@Inject extension Utils

	@Inject extension GlossaryExtensions
	@Inject extension EclipseNamingExtensions

	@Inject extension TocGenerator

	@Inject extension PlainText

	override doGenerate(Resource res, IFileSystemAccess access) {
//		glossary = {
//			res.allContentsIterable.findFirst(s | s instanceof Glossary) as Glossary
//		}.glossaryEntry
		// 
		//val glossary = res.allContentsIterable.filter(typeof(Glossary)).head.genPlainText
		val Object file = res.contents.get(0)
		switch file:res.contents.get(0) {
			XdocFile:
				if(file.mainSection instanceof Document)
					file.mainSection.generate(access)
			default: 
				null
		}
		// don't want this, rather CharSequence
//		val ArrayList<StringConcatenation> texts = newArrayList();
//		for(elem : res.allContentsIterable) {
//			//texts.add(generate(elem))
//		}
	}

	dispatch generate(Document document, IFileSystemAccess access) {
		access.generateFile("toc.xml", document.generateToc)
		for(c:document.chapters){
			c.generate(access)
		}
	}

	dispatch generate(Chapter chapter, IFileSystemAccess access) {
		access.generateFile(chapter.fileName, chapter.generate)
	}

	dispatch generate(Chapter aS) {
		val headtag = "h1"
		'''
		<html>
		<head>
		<title>«aS.title.genPlainText»</title>
		
		<link href="book.css" rel="stylesheet" type="text/css">
		<link href="code.css" rel="stylesheet" type="text/css">
		<link rel="home" href="index.html" title="">
		</head>
		<body>
		<«headtag»>«aS.title.genPlainText»</«headtag»>
		«FOR ss:(aS.subSection as Iterable<AbstractSection>)»
			«ss.generate»
		«ENDFOR»
		</body>
		</html>
		'''
	}

	dispatch generate(AbstractSection aS) {
		val headtag = switch aS{
			Section: "h2"
			Section2: "h3"
			Section3: "h4"
			Section4: "h5"
			default: "h1"
		}
		'''
		<«headtag»>«aS.title.genPlainText»</«headtag»>
		«FOR c:aS.contents »
			«c.generate»
		«ENDFOR»
		«FOR ss:(aS.subSection as Iterable<AbstractSection>)»
			«ss.generate»
		«ENDFOR»
		'''
	}

	dispatch generate(Section4 aS) {
		'''
		«aS.title.genNonParContent»
		«FOR tom:aS.contents»
		«tom.generate»
		«ENDFOR»
		'''
	}

	dispatch generate(Ref ref) {
		'''
		«IF ref.contents.isEmpty »
		<a href="«ref.ref.fileName».html#«ref.ref.name»">section «ref.ref.name»</a>
		«ELSE»
		<a href="«ref.ref.fileName».html#«ref.ref.name»">
		«FOR tom:ref.contents»
		«tom.genNonParContent»</a>
		«ENDFOR»
		«ENDIF»
		'''
	}

	dispatch generate(TextOrMarkup tom) {
		'''
		«FOR obj:tom.contents»
			<p>
			«obj.generate»
			</p>
		«ENDFOR»
		'''
//		tom.contents.fold('''''', [e1, e2 | '''«e2»«e1.generate»'''])
	}

	dispatch generate(UnorderedList ul) {
		'''
		<ul>
			«FOR i:ul.items»
			
			  	«i.generate»
			«ENDFOR»
		</ul>
		'''
	}

	
	dispatch generate(OrderedList ul) {
		'''
		<ol>
			«FOR i:ul.items»
				«i.generate»
			«ENDFOR»
		</ol>
		'''
	}

	dispatch generate(TextPart tp) {
		tp.text
	}



	dispatch generate(CodeBlock cb) {
		if(cb.isInlineCode) {
			'''<span class="inlinecode">«(cb.contents.head as Code).generate(cb.language)»'''
		} else {
			''''''
		}
	}

	generate (Code code, LangDef lang) {
		''''''
	}

	genNonParContent(TextOrMarkup tom) {
		'''
		«FOR obj:tom.contents»
			«obj.generate»
		«ENDFOR»
		'''
	}

}
