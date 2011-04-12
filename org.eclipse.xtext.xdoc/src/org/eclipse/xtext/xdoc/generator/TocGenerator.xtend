package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xdoc.generator.util.*

class TocGenerator {

	@Inject extension EclipseNamingExtensions
	@Inject extension PlainText
	@Inject extension Utils

	generateToc(Document doc) {
		'''
		<toc topic="contents/«doc.chapters.get(0).fileName».html" label="«doc.title.genPlainText»" >
			«FOR c:doc.chapters»
				«c.genTocEntry»
			«ENDFOR»
		</toc>
		'''
	}

	genTocEntry(Chapter c) {
		'''
		<topic href="contents/«c.fileName».html«c.urlSuffix»" label="«c.title.genPlainText»" >
			«FOR ss:c.subSections»
				«genTocEntry(ss,c)»
			«ENDFOR»
		</topic>
		'''
	}

	// FIXME: remove exception handling
	genTocEntry(AbstractSection aS, Chapter container){
		'''
		<topic href="contents/«try {container.fileName.urlDecode}catch(Exception e){}».html«aS.urlSuffix»" label="«aS.title.genPlainText»" >
			«FOR ss:(aS.subSection as Iterable<AbstractSection>)»
				«genTocEntry(ss, container)»
			«ENDFOR»
		</topic>
		'''
	}
}