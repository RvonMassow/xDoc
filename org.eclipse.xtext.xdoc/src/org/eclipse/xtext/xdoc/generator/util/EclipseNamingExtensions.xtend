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

	def String getLocalId(Identifiable identifiable) {
		switch identifiable {
			ChapterRef : identifiable.chapter.localId			
			SectionRef : identifiable.section.localId			
			Section2Ref : identifiable.section2.localId			
			default : {
				if (identifiable.name != null)
					return identifiable.name
				val parent = identifiable.eContainer as AbstractSection
				if (parent == null)
					return "0"
				else
					return parent.localId+"_"+parent.eContents.indexOf(identifiable)
			}
		}
	}

	def String getFullURL(Identifiable identifiable) {
		switch identifiable {
			PartRef : identifiable.part.fullURL
			ChapterRef : identifiable.chapter.fullURL
			SectionRef : identifiable.section.fullURL
			Section2Ref : identifiable.section2.fullURL
			case identifiable.eContainer instanceof XdocFile :
				identifiable.resourceURL
			Part:
				identifiable.eResource.URI.trimFileExtension.lastSegment + "_" + identifiable.eContainer.eContents.indexOf(identifiable) + ".html"
			default :
				identifiable.resourceURL + '#' + identifiable.localId
		}
	}
	
	def String getResourceURL(Identifiable identifiable) {
		switch identifiable {
			PartRef : identifiable.part.resourceURL
			ChapterRef : identifiable.chapter.resourceURL			
			SectionRef : identifiable.section.resourceURL			
			Section2Ref : identifiable.section2.resourceURL			
			default : {
				return identifiable.eResource.URI.trimFileExtension.lastSegment+".html"
			}
		}
	}

	def String getFullPHPURL(Identifiable identifiable) {
		val phpURL = getResourceURL(identifiable).replaceAll("\\.html$", ".php")
		switch(identifiable) {
			PartRef : identifiable.part.fullPHPURL
			ChapterRef : identifiable.chapter.fullPHPURL
			SectionRef : identifiable.section.fullPHPURL
			Section2Ref : identifiable.section2.fullPHPURL
			case identifiable.eContainer instanceof XdocFile :
				return identifiable.eResource.URI.trimFileExtension.lastSegment + ".php"
			default :
				return identifiable.eResource.URI.trimFileExtension.lastSegment + '.php#' + identifiable.localId
		}
	}
}
