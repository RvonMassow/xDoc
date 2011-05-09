package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.emf.ecore.EObject

class EclipseNamingExtensions {

//	dispatch urlSuffix(XdocFile aS){ 
//		""
//	}

	def urlSuffix(AbstractSection aS) {
		if(aS.eContainer instanceof XdocFile)
			""
		else
			"#" + labelName(aS)
	}

	def dispatch labelName(Object any){
		""
	}

	def dispatch String fileName(EObject obj) {
		obj.eResource.URI.lastSegment+".html"
	}

	def dispatch String fileName(ChapterRef obj) {
		fileName(obj.chapter)
	}

	def dispatch String fileName(SectionRef obj) {
		fileName(obj.section)
	}

	def dispatch String fileName(Section2Ref obj) {
		fileName(obj.section2)
	}

	def dispatch String labelName(AbstractSection aS){
		if(aS.name!=null)
			aS.name
		else {
			labelName(aS.eContainer())+"-"+ aS.eContainer.eContents.indexOf(aS);
		}
		
	}

}