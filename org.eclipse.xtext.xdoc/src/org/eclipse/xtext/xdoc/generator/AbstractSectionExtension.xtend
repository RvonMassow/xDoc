package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Section
import org.eclipse.xtext.xdoc.xdoc.Section2
import org.eclipse.xtext.xdoc.xdoc.Section3
import java.util.List
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.ChapterRef
import org.eclipse.xtext.xdoc.xdoc.SectionRef
import org.eclipse.xtext.xdoc.xdoc.Section2Ref
import org.eclipse.xtext.xdoc.xdoc.Part
import org.eclipse.xtext.xdoc.xdoc.PartRef

class AbstractSectionExtension {
	
	def dispatch List<? extends AbstractSection> sections(AbstractSection section) {
		emptyList
	}

	def dispatch sections(Document doc){
		if(!doc.chapters.empty)
			doc.chapters
		else
			doc.parts
	}

	def dispatch sections(Part part){
		part.chapters
	}

	def dispatch sections(Chapter chapter){
		chapter.subSections
	}

	def dispatch sections(Section section){
		section.subSections
	}

	def dispatch sections(Section2 section){
		section.subSections
	}

	def dispatch sections(PartRef part){
		part.chapters
	}

	def dispatch sections(ChapterRef chapter){
		chapter.chapter.subSections
	}

	def dispatch sections(SectionRef section){
		section.section.subSections
	}

	def dispatch sections(Section2Ref section){
		section.section2.subSections
	}

	def dispatch sections(Section3 section){
		section.subSections
	}

}