package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import static extension java.net.URLDecoder.*

class Utils {

	dispatch Iterable<Chapter> subSection(Document doc){
		doc.chapters
	}

	dispatch Iterable<Section> subSection(Chapter section){
		section.subSections
	}

	dispatch Iterable<Section2> subSection(Section section){
		section.subSections
	}

	dispatch Iterable<Section3> subSection(Section2 section){
		section.subSections
	}

	dispatch Iterable<Section4> subSection(Section3 section){
		section.subSections
	}

	dispatch Iterable<AbstractSection> subSection(AbstractSection section){
		newArrayList
	}

	urlDecode (String s){
		s.decode("ISO-8859-1")
	}

// TODO report Bug
	Boolean isInlineCode (CodeBlock cb) {
		return cb.contents.size == 1 && !cb.contents.head.toString.contains("\n");
	}
}