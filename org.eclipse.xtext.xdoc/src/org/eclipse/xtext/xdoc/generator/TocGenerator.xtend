package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Document

class TocGenerator {

	@Inject extension AbstractSectionExtension sectionExtension
	@Inject extension EclipseNamingExtensions eclipseNamingExtensions
	@Inject extension PlainText plainText

	def generateToc(Document doc, EclipseHelpUriUtil uriUtil) '''
		<?xml version="1.0" encoding="ISO-8859-1" ?>
		<toc topic="contents/«doc.fullURL»" label="«doc.title.genPlainText»" >
			«FOR c: doc.chapters»
				«c.genTocEntry(uriUtil)»
			«ENDFOR»			
			«FOR p: doc.parts»
				«p.genTocEntry(uriUtil)»
			«ENDFOR»
		</toc>
	'''

	def CharSequence genTocEntry(Chapter c, EclipseHelpUriUtil uriUtil) '''
		<topic href="contents/«uriUtil.getTargetURI(c)»" label="«c.title.genPlainText»" >
			«FOR ss: c.subSections»
				«ss.genTocEntry(uriUtil)»
			«ENDFOR»
		</topic>
	'''

	def CharSequence genTocEntry(AbstractSection section, EclipseHelpUriUtil uriUtil) '''
		<topic href="contents/«uriUtil.getTargetURI(section)»" label="«section.title.genPlainText»" >
			«FOR ss:section.sections»
				«ss.genTocEntry(uriUtil)»
			«ENDFOR»
		</topic>
	'''
}