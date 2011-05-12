package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.resource.XdocResourceDescriptionManager
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.emf.ecore.resource.Resource
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.*
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class EclipseNamingExtensions {

//	dispatch urlSuffix(XdocFile aS){ 
//		""
//	}

	// lets rocknroll the index!
	@Inject XdocResourceDescriptionManager rdm

	@Inject IResourceDescriptions index

	@Inject extension IQualifiedNameProvider nameProvider

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
		obj.eResource.URI.lastSegment+".html"
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
			fileName(obj.eContainer)
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
		if(aS.name!=null)
			aS.name
		else {
			labelName(aS.eContainer())+"-"+ aS.eContainer.eContents.indexOf(aS);
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