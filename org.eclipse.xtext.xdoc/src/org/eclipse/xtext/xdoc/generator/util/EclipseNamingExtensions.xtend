package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.emf.ecore.EObject

class EclipseNamingExtensions {

//	dispatch urlSuffix(XdocFile aS){ 
//		""
//	}

	urlSuffix(AbstractSection aS) {
		if(aS.eContainer instanceof XdocFile)
			""
		else
			"#" + labelName(aS)
	}

	dispatch labelName(Object any){
		""
	}

	dispatch String fileName(EObject obj) {
		obj.eResource.URI.lastSegment+".html"
	}

	dispatch String fileName(ChapterRef obj) {
		fileName(obj.chapter)
	}

	dispatch String fileName(SectionRef obj) {
		fileName(obj.section)
	}

	dispatch String fileName(Section2Ref obj) {
		fileName(obj.section2)
	}

	dispatch String labelName(AbstractSection aS){
		if(aS.name!=null)
			aS.name
		else {
			labelName(aS.eContainer())+"-"+ aS.eContainer.eContents.indexOf(aS);
		}
		
	}

}