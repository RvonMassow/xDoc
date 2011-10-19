package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class XdocGenerator implements IGenerator {
	@Inject HtmlGenerator htmlGen
	@Inject EclipseHelpGenerator helpGen
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		helpGen.doGenerate(input, fsa)
		htmlGen.doGenerate(input, fsa)
	}
}