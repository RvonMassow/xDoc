package org.eclipse.xtext.xdoc;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XdocGeneratorSetup extends XdocStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new XdocGeneratorModule());
	}
}
