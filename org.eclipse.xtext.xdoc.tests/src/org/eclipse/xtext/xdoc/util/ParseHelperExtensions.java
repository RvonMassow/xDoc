package org.eclipse.xtext.xdoc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ParseHelperExtensions<T extends EObject> extends ParseHelper<T> {

	public T parse(CharSequence text) throws Exception {
		return super.parse(text.toString());
	}

	public T getDocFromFile(String fileName) throws FileNotFoundException {
		return parse(new FileInputStream(fileName),
				URI.createFileURI(fileName), null, new XtextResourceSet());
	}
}
