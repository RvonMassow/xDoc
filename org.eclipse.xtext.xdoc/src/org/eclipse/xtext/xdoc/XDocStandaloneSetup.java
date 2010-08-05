
package org.eclipse.xtext.xdoc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XDocStandaloneSetup extends XDocStandaloneSetupGenerated{

	public static void doSetup() {
		new XDocStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

