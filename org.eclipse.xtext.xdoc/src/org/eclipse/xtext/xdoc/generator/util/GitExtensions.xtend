package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.common.types.JvmIdentifiableElement

class GitExtensions {
	
	static val XTEXT_BASE_DIR = "https://github.com/eclipse/xtext/blob/v2.3.0/plugins/"
	static val XTEND_BASE_DIR = "https://github.com/eclipse/xtend/blob/v2.3.0/plugins/"
	static val EMF_BASE_DIR = "https://github.com/eclipse/emf/blob/R2_8_0/plugins/"
	static val SEVENLANGUAGES_BASEDIR = "https://github.com/xtext-dev/seven-languages-xtext/blob/master/"
	
	def gitLink(JvmIdentifiableElement ie){
		val xtendFiles = newHashSet("org.eclipse.xtext.xbase.compiler.JvmModelGenerator")
		val xtextEmfGen = newHashSet("AbstractElement", "Assignment", "EnumRule", "ParserRule", "UntilToken", "AbstractMetamodelDeclaration", "CharacterRange", "GeneratedMetamodel", "ReferencedMetamodel", "Wildcard", "AbstractNegatedToken", "CompoundElement", "Grammar", "RuleCall", "XtextFactory", "AbstractRule", "CrossReference", "Group", "TerminalRule", "XtextPackage", "Action", "EOF", "Keyword", "TypeRef", "Alternatives", "EnumLiteralDeclaration", "NegatedToken", "UnorderedGroup")
		val ctEmfGen = newHashSet("JvmAnnotationAnnotationValue", "JvmConstraintOwner", "JvmFloatAnnotationValue", "JvmPrimitiveType", "JvmUpperBound", "JvmAnnotationReference", "JvmConstructor", "JvmFormalParameter", "JvmShortAnnotationValue", "JvmVisibility", "JvmAnnotationTarget", "JvmCustomAnnotationValue", "JvmGenericArrayTypeReference", "JvmSpecializedTypeReference", "JvmVoid", "JvmAnnotationType", "JvmDeclaredType", "JvmGenericType", "JvmStringAnnotationValue", "JvmWildcardTypeReference", "JvmAnnotationValue", "JvmDelegateTypeReference", "JvmIdentifiableElement", "JvmSynonymTypeReference", "TypesFactory", "JvmAnyTypeReference", "JvmDoubleAnnotationValue", "JvmIntAnnotationValue", "JvmType", "TypesPackage", "JvmArrayType", "JvmEnumAnnotationValue", "JvmLongAnnotationValue", "JvmTypeAnnotationValue", "JvmBooleanAnnotationValue", "JvmEnumerationLiteral", "JvmLowerBound", "JvmTypeConstraint", "JvmByteAnnotationValue", "JvmEnumerationType", "JvmMember", "JvmTypeParameter", "JvmCharAnnotationValue", "JvmExecutable", "JvmMultiTypeReference", "JvmTypeParameterDeclarator", "JvmComponentType", "JvmFeature", "JvmOperation", "JvmTypeReference", "JvmCompoundTypeReference", "JvmField", "JvmParameterizedTypeReference", "JvmUnknownTypeReference")
		val prefix = 
			switch name: ie.qualifiedName {
				case null :
					return "broken-link in "+ie
				case name.startsWith("org.eclipse.xtext.common.types.xtext.ui"): XTEXT_BASE_DIR + "org.eclipse.xtext.common.types.ui/src/"
				case name.startsWith("org.eclipse.xtext.common.types.") 
				     && ctEmfGen.contains(ie.simpleName):                        XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/emf-gen/"
				case name.startsWith("org.eclipse.xtext.common.types."):         XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/src/"
				case name.startsWith("org.eclipse.xtext.ui.shared."): 	         XTEXT_BASE_DIR + "org.eclipse.xtext.ui.shared/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.lib."):           XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.lib/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.ui."):            XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.ui/src/"
				case name.startsWith("org.eclipse.xtext.xtend2."):               XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2/src/"
				case name.startsWith("org.eclipse.xtext.xbase.ui."):             XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/"
				case name.startsWith("org.eclipse.xtext.xbase.lib."):            XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/"
				case name.startsWith("org.eclipse.xtext.xbase."):                XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/"
				case name.startsWith("org.eclipse.xtext.generator-") ||           
				     name.startsWith("org.eclipse.xtext.ui.generator."):         XTEXT_BASE_DIR + "org.eclipse.xtext.generator/src/"
				case name.startsWith("org.eclipse.xtext.ui."):                   XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/"			
				case name.startsWith("org.eclipse.xtext.junit4."):               XTEXT_BASE_DIR + "org.eclipse.xtext.junit4/src/"
				case name.startsWith("org.eclipse.xtext.junit."):                XTEXT_BASE_DIR + "org.eclipse.xtext.junit/src/"
				case name.startsWith("org.eclipse.xtext.ui."):                   XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/"
				case name.startsWith("org.eclipse.xtext.util."):                 XTEXT_BASE_DIR + "org.eclipse.xtext.util/src/"
				case name.startsWith("org.eclipse.xtext.") 
				     && xtextEmfGen.contains(ie.simpleName):                     XTEXT_BASE_DIR + "org.eclipse.xtext/emf-gen/"
				case name.startsWith("org.eclipse.xtext."):                      XTEXT_BASE_DIR + "org.eclipse.xtext/src/"
				case name.startsWith("org.eclipse.emf.common."):			     EMF_BASE_DIR + "org.eclipse.emf.common/src/"
				case name.startsWith("org.eclipse.emf."):			     		 EMF_BASE_DIR + "org.eclipse.emf.ecore/src/"
				case name.startsWith("com.google.inject."): 					 "http://code.google.com/p/google-guice/source/browse/core/src"
				case name.startsWith("org.xtext."): { 
					val languageID = name.split('\\.').get(2)
					val pluginSuffix = name.split('\\.').get(3)
					'''«SEVENLANGUAGES_BASEDIR»«languageID»/org.xtext.«languageID».«pluginSuffix»/src/''' 
				}
				default:
					""
			}
		if(prefix.length != 0) {
			val ext = if(xtendFiles.contains(ie.qualifiedName)) ".xtend" else ".java"
			prefix + ie.qualifiedName.replaceAll("\\.", "/").replaceAll("\\$.*$", "") + ext
		} else
			null
	}

	def compilationUnitName(JvmIdentifiableElement ie) {
		ie.simpleName
	}
}