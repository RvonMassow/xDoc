package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xdoc.generator.util.*
import com.google.inject.Inject
import java.util.Map

class TocGenerator {

	@Inject extension AbstractSectionExtension sectionExtension
	@Inject extension EclipseNamingExtensions eclipseNamingExtensions
	@Inject extension PlainText plainText
	@Inject extension Utils utils

	def generateToc(Document doc, Map<AbstractSection, String> fileNames) '''
		<?xml version="1.0" encoding="ISO-8859-1" ?>
		<toc topic="contents/«fileNames.get(doc)»" label="«doc.title.genPlainText»" >
			«FOR c: doc.chapters»
				«c.genTocEntry(fileNames)»
			«ENDFOR»
		</toc>
	'''

	def genTocEntry(Chapter c, Map<AbstractSection, String> fileNames) '''
		<topic href="contents/«fileNames.get(c)»" label="«c.title.genPlainText»" >
			«FOR ss: c.subSections»
				«ss.genTocEntry(fileNames)»
			«ENDFOR»
		</topic>
	'''

	def genTocEntry(AbstractSection section, Map<AbstractSection, String> fileNames) '''
		<topic href="contents/«fileNames.get(section)»" label="«section.title.genPlainText»" >
			«FOR ss:section.sections»
				«ss.genTocEntry(fileNames)»
			«ENDFOR»
		</topic>
	'''
}