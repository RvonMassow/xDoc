package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.PlainText
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension

class HTMLNamingExtensions extends EclipseNamingExtensions {

//	@Inject extension PlainText plainText
//	@Inject extension Utils utils
//	@Inject extension AbstractSectionExtension ase
//
//	
//	override dispatch void computeURLs(Document document, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
//		var name = "index.html"
//		result.put(document, name);
//		val sections = document.sections
//		for(i: 0..(sections.size - 1))
//			sections.get(i).computeURLs(fileName, "", i, result)
//	}
//
//	def dispatch void computeURLs(Section section, String fileName, String prefix, int index, Map<AbstractSection, String> result) {
//		var name = section.eResource.URI.trimFileExtension.lastSegment
//		if (index != -1)
//			name = name +"-"+ index + ".html"
//		else
//			name = name + ".html";
//		result.put(section, name);
//		val sections = section.sections
//		for(i: 0..(sections.size - 1))
//			sections.get(i).computeURLs(name, "", i, result)
//	}
}