package org.eclipse.xtext.xdoc.resource;

import java.util.Collection;

import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocResourceDescriptionManager extends DefaultResourceDescriptionManager {

	@Override
	public boolean isAffected(Collection<Delta> deltas,
			IResourceDescription candidate, IResourceDescriptions context) {
		;
		return candidate.getExportedObjects(XdocPackage.Literals.DOCUMENT).iterator().hasNext() 
			|| super.isAffected(deltas, candidate, context);
	}
}
