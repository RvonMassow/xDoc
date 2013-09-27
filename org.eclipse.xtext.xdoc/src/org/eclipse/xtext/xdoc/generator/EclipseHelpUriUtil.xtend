package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.ChapterRef
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.Identifiable
import org.eclipse.xtext.xdoc.xdoc.Part
import org.eclipse.xtext.xdoc.xdoc.PartRef
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Section2Ref
import org.eclipse.xtext.xdoc.xdoc.SectionRef
import static org.eclipse.emf.common.util.URI.*
import static extension org.eclipse.xtext.EcoreUtil2.*

class EclipseHelpUriUtil {

	@Inject extension EclipseNamingExtensions eclipseNamingExtensions

	Map<AbstractSection, AbstractSection> section2fileSection

	Document doc
	
	def initialize(Document doc) {
		section2fileSection = newHashMap()
		this.doc = doc
		populateFileMap(doc)
	}

	def getTargetDocumentName() {
		return doc.targetURI.lastSegment
	}
	
	def getTargetURI(Ref it) {
		val container = ref.getContainerOfType(typeof(AbstractSection))
		val fileSection = section2fileSection.get(container)
		if(fileSection == null) {
			println("error: Cannot resolve reference to " + ref.name + " from " + ref.eResource.URI)
			null as URI
		} else {
			fileSection.targetURI().appendFragment(ref.localId).deresolve(doc.targetURI)
		}
	}
	
	def URI getTargetURI(AbstractSection it) {
		switch(it) {
			PartRef: it.part.getTargetURI()
			ChapterRef: it.chapter.getTargetURI()
			SectionRef: it.section.getTargetURI()
			Section2Ref: it.section2.getTargetURI()
			Document : (it as Identifiable).targetURI()
			default: {
				val container = it.getContainerOfType(typeof(AbstractSection))
				val fileSection = section2fileSection.get(container)
				fileSection.targetURI().appendFragment(it.localId).deresolve(doc.targetURI)
			}
		}
	}
	
	def dispatch void populateFileMap(Document it) {
		section2fileSection.put(it, it)
	 	chapters.forEach([it.populateFileMap])
	 	parts.forEach([it.populateFileMap])
	}
	
	def dispatch void populateFileMap(Chapter it) {
		section2fileSection.put(it, it)
		it.subSections.forEach([section | populateFileMap(section, it)])
	}

	def dispatch void populateFileMap(ChapterRef it) {
		populateFileMap(chapter)
	}
	
	def dispatch void populateFileMap(Part it) {
		section2fileSection.put(it, it)
		chapters.forEach[chapter | populateFileMap(chapter)]
	}

	def dispatch void populateFileMap(PartRef it) {
		populateFileMap(part)
	}
	
	def dispatch void populateFileMap(AbstractSection it, AbstractSection fileSection) {
		section2fileSection.put(it, fileSection)
		eContents.filter(typeof(AbstractSection)).forEach([section | populateFileMap(section, fileSection)])
	}

	def dispatch void populateFileMap(Section2Ref it, AbstractSection fileSection) {
		populateFileMap(section2, fileSection)
	}

	def dispatch void populateFileMap(SectionRef it, AbstractSection fileSection) {
		populateFileMap(section, fileSection)
	}

	def private targetURI(Identifiable it) {
		val resourceURI = eResource.URI
		val fullURL = createURI(it.fullURL)
		resourceURI.trimSegments(resourceURI.segmentCount - 2)
			.appendSegment("contents")
		  	.appendSegments(fullURL.segments)
	}
}
