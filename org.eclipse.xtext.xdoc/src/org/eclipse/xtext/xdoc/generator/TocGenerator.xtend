package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xdoc.generator.util.*
import com.google.inject.Inject

class TocGenerator {

	@Inject extension EclipseNamingExtensions eclipseNamingExtensions
	@Inject extension PlainText plainText
	@Inject extension Utils utils

	def generateToc(Document doc) '''
		<?xml version="1.0" encoding="ISO-8859-1" ?>
		<toc topic="contents/«doc.chapters.head.fileName»" label="«doc.title.genPlainText»" >
			«FOR c:doc.chapters»
				«c.genTocEntry»
			«ENDFOR»
		</toc>
	'''

	def genTocEntry(Chapter c) '''
		<topic href="contents/«c.fileName»«c.urlSuffix»" label="«c.title.genPlainText»" >
			«FOR ss:c.subSections»
				«genTocEntry(ss,c)»
			«ENDFOR»
		</topic>
	'''

	// FIXME: remove exception handling
	def genTocEntry(AbstractSection aS, Chapter container) '''
		<topic href="contents/«container.fileName.urlDecode»«aS.urlSuffix»" label="«aS.title.genPlainText»" >
			«FOR ss:(aS.subSection as Iterable<AbstractSection>)»
				«genTocEntry(ss, container)»
			«ENDFOR»
		</topic>
	'''
}