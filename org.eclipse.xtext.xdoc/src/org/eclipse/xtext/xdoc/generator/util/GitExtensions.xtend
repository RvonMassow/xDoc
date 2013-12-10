package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.XtextPackage
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xtype.XtypePackage

class GitExtensions {
	
	static val XTEXT_BASE_DIR = "https://github.com/eclipse/xtext/blob/v2.5.0/plugins/"
	static val XTEND_BASE_DIR = XTEXT_BASE_DIR
	static val MWE_BASE_DIR = "https://github.com/eclipse/mwe/blob/v2.4.0/plugins/"
	static val EMF_BASE_DIR = "https://github.com/eclipse/emf/blob/R2_9_0/plugins/"
	static val SEVENLANGUAGES_BASEDIR = "https://github.com/xtext-dev/seven-languages-xtext/blob/master/"
	
	
	static val XTEXT_EMF_CLASSES = XtextPackage::eINSTANCE.EClassifiers.map[name].toSet
	static val XBASE_EMF_CLASSES = (XbasePackage::eINSTANCE.EClassifiers.map[name] + XtypePackage::eINSTANCE.EClassifiers.map[name]).toSet
	static val JVM_EMF_CLASSES = TypesPackage::eINSTANCE.EClassifiers.map[name].toSet
	
	static val SEVEN_LANGUAGE_PLUGIN_SUFFIXES = newHashSet('ui', 'tests', 'lib', 'examples') 
	def gitLink(JvmIdentifiableElement ie){
		val prefix = 
			switch name: ie.qualifiedName {
				case null :
					return "broken-link in "+ie
				case name.startsWith("org.eclipse.xtext.common.types.xtext.ui"): XTEXT_BASE_DIR + "org.eclipse.xtext.common.types.ui/src/"
				case name.startsWith("org.eclipse.xtext.common.types.") 
				    && JVM_EMF_CLASSES.contains(ie.simpleName):                       XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/emf-gen/"
				case name.startsWith("org.eclipse.xtext.common.types."):        XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/src/"
				case name.startsWith("org.eclipse.xtext.ui.shared."): 	        XTEXT_BASE_DIR + "org.eclipse.xtext.ui.shared/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.lib."):          XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.lib/src/"
				case name.startsWith("org.eclipse.xtext.xtend2.ui."):           XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.ui/src/"
				case name.startsWith("org.eclipse.xtext.xtend2."):              XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2/src/"
				case name.startsWith("org.eclipse.xtext.xbase.ui."):            XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/"
				case name.startsWith("org.eclipse.xtext.xbase.lib."):           XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/"
				case name.startsWith("org.eclipse.xtext.xbase.")
					&& XBASE_EMF_CLASSES.contains(ie.simpleName):               XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/emf-gen/"
				case name.startsWith("org.eclipse.xtext.xbase."):               XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/"
				case (name.startsWith("org.eclipse.xtext.generator.") ||           
				     name.startsWith("org.eclipse.xtext.ui.generator.")) && 
				     "IGenerator" != ie.simpleName: 	       					XTEXT_BASE_DIR + "org.eclipse.xtext.generator/src/"
				case name.startsWith("org.eclipse.xtext.ui."):                  XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/"			
				case name.startsWith("org.eclipse.xtext.junit4."):              XTEXT_BASE_DIR + "org.eclipse.xtext.junit4/src/"
				case name.startsWith("org.eclipse.xtext.junit."):               XTEXT_BASE_DIR + "org.eclipse.xtext.junit/src/"
				case name.startsWith("org.eclipse.xtext.ui."):                  XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/"
				case name.startsWith("org.eclipse.xtext.util."):                XTEXT_BASE_DIR + "org.eclipse.xtext.util/src/"
				case name.startsWith("org.eclipse.xtext.") 
				    && XTEXT_EMF_CLASSES.contains(ie.simpleName):				XTEXT_BASE_DIR + "org.eclipse.xtext/emf-gen/"
				case name.startsWith("org.eclipse.xtext."):                     XTEXT_BASE_DIR + "org.eclipse.xtext/src/"
				case name.startsWith("org.eclipse.emf.mwe.utils."):			    MWE_BASE_DIR + "org.eclipse.emf.mwe.utils/src/"
				case name.startsWith("org.eclipse.emf.mwe2.runtime."):			MWE_BASE_DIR + "org.eclipse.emf.mwe2.runtime/src/"
				case name.startsWith("org.eclipse.emf.mwe2.launch."):			MWE_BASE_DIR + "org.eclipse.emf.mwe2.launch/src/"
				case name.startsWith("org.eclipse.emf.common."):			    EMF_BASE_DIR + "org.eclipse.emf.common/src/"
				case name.startsWith("org.eclipse.emf."):			     		EMF_BASE_DIR + "org.eclipse.emf.ecore/src/"
				case name.startsWith("org.eclipse.xtext.xbase.lib.")
					|| name.startsWith("org.eclipse.xtend2.lib."):				XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/"
				case name.startsWith("org.eclipse.xtext.xbase.ui."):			XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/"
				case name.startsWith("org.eclipse.xtext.xbase."):				XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/"
				case name.startsWith("org.eclipse.xtend.lib."):					XTEXT_BASE_DIR + "org.eclipse.xtend.lib/src/"
				case name.startsWith("org.eclipse.xtend.ui."):					XTEND_BASE_DIR + "org.eclipse.xtend.ui/src/"
				case name.startsWith("org.eclipse.xtend.core."):				XTEND_BASE_DIR + "org.eclipse.xtend.core/src/"
				case name.startsWith("org.xtext."): { 
					val languageID = name.split('\\.').get(2)
					val pluginSuffix = name.split('\\.').get(3)
					val subdir = if(pluginSuffix == 'examples') 'examples' else 'languages'
					'''«SEVENLANGUAGES_BASEDIR»«subdir»/org.xtext.«languageID»«IF SEVEN_LANGUAGE_PLUGIN_SUFFIXES.contains(pluginSuffix)».«pluginSuffix»«ENDIF»/src/''' 
				}
				default:
					""
			}
		if(prefix.length != 0) {
			switch uri: ie?.eResource?.URI {
				case uri.scheme=='java':
					prefix + ie.qualifiedName.replaceAll("\\.", "/").replaceAll("\\$.*$", "") + '.' + 'java'
				default: {
					prefix + (ie as JvmDeclaredType).packageName.replaceAll('\\.', '/') + '/' + uri.lastSegment
				}
			}
		} else
			null
	}
	
}