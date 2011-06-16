package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class XdocGenerator implements IGenerator {
	@Inject HtmlGenerator htmlGen
	@Inject EclipseHelpGenerator helpGen
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		helpGen.doGenerate(input, fsa)
		htmlGen.doGenerate(input, fsa)
	}
}