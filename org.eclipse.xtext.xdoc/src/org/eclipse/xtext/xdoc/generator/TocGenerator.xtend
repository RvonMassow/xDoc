package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Document

class TocGenerator {

	@Inject extension AbstractSectionExtension sectionExtension
	@Inject extension EclipseNamingExtensions eclipseNamingExtensions
	@Inject extension PlainText plainText
	@Inject extension Utils utils

	def generateToc(Document doc) '''
		<?xml version="1.0" encoding="ISO-8859-1" ?>
		<toc topic="contents/«doc.fullURL»" label="«doc.title.genPlainText»" >
			«FOR c: doc.chapters»
				«c.genTocEntry»
			«ENDFOR»			
			«FOR p: doc.parts»
				«p.genTocEntry»
			«ENDFOR»
		</toc>
	'''

	def genTocEntry(Chapter c) '''
		<topic href="contents/«c.fullURL»" label="«c.title.genPlainText»" >
			«FOR ss: c.subSections»
				«ss.genTocEntry»
			«ENDFOR»
		</topic>
	'''

	def genTocEntry(AbstractSection section) '''
		<topic href="contents/«section.fullURL»" label="«section.title.genPlainText»" >
			«FOR ss:section.sections»
				«ss.genTocEntry»
			«ENDFOR»
		</topic>
	'''
}