package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension2
import java.util.HashMap

class EclipseHelpGenerator implements IConfigurableGenerator {

	@Inject Provider<StatefulEclipseHelpGenerator> provider
	
	@Inject HashMap<String, Object> config
	
	override doGenerate(Resource res, IFileSystemAccess access) {
		val generator = provider.get()
		generator.doGenerate(res, access as IFileSystemAccessExtension2)
	}

	override getConfiguration() {
		config
	}
}
