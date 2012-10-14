package org.eclipse.xtext.xdoc.generator;

import org.eclipse.xtext.xdoc.XdocGeneratorModule;
import org.eclipse.xtext.xdoc.XdocStandaloneSetup;
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator;
import org.eclipse.xtext.xdoc.generator.IConfigurableGenerator;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XdocEclipseHelpGeneratorSetup extends XdocStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new GeneratorModule());
	}
	
	static class GeneratorModule extends XdocGeneratorModule {
		
		public Class<? extends IConfigurableGenerator> bindIConfigurableGenerator() {
			return EclipseHelpGenerator.class;
		}		
		
	}
	
}
