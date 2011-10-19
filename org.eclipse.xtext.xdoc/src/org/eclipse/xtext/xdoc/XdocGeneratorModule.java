package org.eclipse.xtext.xdoc;

import org.eclipse.xtext.xdoc.generator.IConfigurableGenerator;
import org.eclipse.xtext.xdoc.generator.LatexGenerator;

public class XdocGeneratorModule extends XdocRuntimeModule {

	public Class<? extends IConfigurableGenerator> bindIConfigurableGenerator() {
		return LatexGenerator.class;
	}
}
