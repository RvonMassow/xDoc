package org.eclipse.xtext.xdoc;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xdoc.generator.LatexGenerator;

public class XdocGeneratorModule extends XdocRuntimeModule {

	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return LatexGenerator.class;
	}
}
