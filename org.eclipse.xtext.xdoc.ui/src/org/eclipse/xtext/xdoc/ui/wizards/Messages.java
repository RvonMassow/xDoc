package org.eclipse.xtext.xdoc.ui.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.xtext.xdoc.ui.wizards.messages"; //$NON-NLS-1$
	public static String XDOC_NEW_PROJECT_WIZARD_DESCRIPTION;
	public static String XDOC_NEW_PROJECT_WIZARD_ERROR_MSG;
	public static String XDOC_NEW_PROJECT_WIZARD_PAGE_HEAD;
	public static String XDOC_NEW_PROJECT_WIZARD_PAGE_TITLE;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
