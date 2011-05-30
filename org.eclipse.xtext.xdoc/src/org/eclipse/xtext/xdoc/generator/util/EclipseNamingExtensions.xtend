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

class EclipseNamingExtensions {

//	dispatch urlSuffix(XdocFile aS){ 
//		""
//	}

	// lets rocknroll the index!
	@Inject XdocResourceDescriptionManager rdm

	@Inject IBuilderState index

	@Inject extension IQualifiedNameProvider nameProvider

	@Inject extension Utils utils

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
		fileName(obj.eContainer)
	}

	def dispatch String fileName(Chapter obj) {
		val name = obj.eResource.URI.lastSegment
		if(obj.eContainer instanceof Document) {
			name +"-"+ (obj.eContainer as Document).subSection.indexOf(obj)+".html"
		} else {
			name+".html"
		}
	}

	def dispatch String fileName(AbstractSection obj) {
		if(obj.eContainer instanceof XdocFile) {
			// do look up here
			val vCon = obj.virtualContainer
			if (vCon != null)
				fileName(vCon)
			else
				"NullFileName for " + obj?.toString
		} else {
			fileName(obj.eContainer) +"-"+ (obj.eContainer as AbstractSection).subSection.indexOf(obj)
		}
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
		val ^as = switch (aS) {
			ChapterRef:
				aS.chapter
			SectionRef:
				aS.section
			Section2Ref:
				aS.section2
			default:
				aS
		}
		if(^as.name!=null)
			^as.name
		else {
			labelName(^as.eContainer())+"-"+ ^as.eContainer.eContents.indexOf(^as);
		}
	}

	def virtualContainer(AbstractSection obj) {
		val resD = index.allResourceDescriptions.filter(r | r.importedNames.exists(e | e == QualifiedName::^create(obj.name.toLowerCase)))
		//println(resD.map(r | r.importedNames.join(",")).join(";"))
		// this is the IRD for the resource containing the (section[2]?)-ref referring to obj
		val ird = resD.findFirst(r | r.referenceDescriptions.exists(
			ref | (ref.EReference.EReferenceType == XdocPackage$Literals::SECTION2) || (ref.EReference.EReferenceType == XdocPackage$Literals::SECTION)
				&& r.URI.lastSegment.endsWith("xdoc"))
		)
		// lets get the resource and return its mainsection
		obj.eResource.resourceSet.getResource(ird.URI, true)?.contents?.filter(typeof(XdocFile))?.head?.mainSection
		//null as EObject
	}
}