
package org.eclipse.xtext.xdoc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XdocStandaloneSetup extends XdocStandaloneSetupGenerated{

	public void doSetup() {
		new XdocStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		Registry registry = injector.getInstance(EPackage.Registry.class);
		registry.put(XdocPackage.eINSTANCE.getNsURI(), XdocPackage.eINSTANCE);
		super.register(injector);
	}
}

