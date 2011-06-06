package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.PlainText
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject

class HTMLNamingExtensions {

	@Inject extension PlainText plainText
	@Inject extension Utils utils

//	def dispatch internalFileName(AbstractSection ^as) {
//		 '''«switch(^as) {
//			Document: "main-"
//			Chapter: "chapter-"
//			Section: "section-"
//		}»«^as.title.genPlainText».html'''.toString
//	}

	def fileName(EObject obj) {
		obj.internalFileName + ".html"
	}

	def dispatch String internalFileName(AbstractSection section) {
		val sec = switch section {
			ChapterRef:
				section.chapter
			SectionRef:
				section.section
			Section2Ref:
				section.section2
			default:
				section
		}
		switch container : sec.eContainer {
			XdocFile :
				sec.eResource.internalFileName
			Section3 :
				container.internalFileName
			Section2 :
				container.internalFileName
			AbstractSection:
				container.internalFileName + "-" //+ container.subSection.indexOf(sec)
		}
	}

	def dispatch String internalFileName(EObject obj) {
		obj.eContainer.internalFileName
	}

	def dispatch internalFileName(Resource res) {
		res.URI.lastSegment.replaceFirst("\\.xdoc$", "")
	}
}