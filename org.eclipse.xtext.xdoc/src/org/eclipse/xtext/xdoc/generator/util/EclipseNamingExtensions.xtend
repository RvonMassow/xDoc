package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.resource.XdocResourceDescriptionManager
import org.eclipse.emf.ecore.resource.Resource
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.*
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.builder.builderState.IBuilderState
import java.util.Map
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension
import org.eclipse.emf.common.util.URI

class EclipseNamingExtensions {

	@Inject extension AbstractSectionExtension sectionExtension

	def labelName(AbstractSection section, Map<AbstractSection, String> fileNames) {
		val fileName = fileNames.get(section);
		if (fileName == null)
			return null
		val result = URI::createURI(fileName).fragment
		result
	}

	def Map<AbstractSection, String> computeURLs(Document document) {
		val Map<AbstractSection, String> result = newHashMap();
		document.computeURLs("", "", -1, result)
		result
	}
	
	def dispatch void computeURLs(Document document, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		var name = document.eResource.URI.trimFileExtension.lastSegment + ".html"
		result.put(document, name);
		val sections = document.sections
		for(i: 0..(sections.size - 1))
			sections.get(i).computeURLs(fileName, "", i, result)
	}
	
	def dispatch void computeURLs(Chapter chapter, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		var name = chapter.eResource.URI.trimFileExtension.lastSegment
		if (index != -1)
			name = name +"-"+ index + ".html"
		else
			name = name + ".html";
		result.put(chapter, name);
		val sections = chapter.sections
		for(i: 0..(sections.size - 1))
			sections.get(i).computeURLs(name, "", i, result)
	}
	
	def dispatch void computeURLs(ChapterRef chapterRef, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		chapterRef.chapter.computeURLs(fileName, prefix, -1, result)
		result.put(chapterRef, result.get(chapterRef.chapter))
	}
	
	def dispatch void computeURLs(SectionRef sectionRef, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		sectionRef.section.computeURLs(fileName, prefix, index, result)
		result.put(sectionRef, result.get(sectionRef.section))
	}
	
	def dispatch void computeURLs(Section2Ref sectionRef, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		sectionRef.section2.computeURLs(fileName, prefix, index, result)
		result.put(sectionRef, result.get(sectionRef.section2))
	}
	
	def dispatch void computeURLs(AbstractSection section, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
		result.put(section, fileName + "#" + if (prefix.nullOrEmpty) index else (prefix + "-" + index));
		val newPrefix = if (prefix.nullOrEmpty) index.toString else (prefix + "-" + index)
		val subSections = section.sections
		for(i: 0..(subSections.size - 1))
			subSections.get(i).computeURLs(fileName, newPrefix, i, result)
	}
	
}
