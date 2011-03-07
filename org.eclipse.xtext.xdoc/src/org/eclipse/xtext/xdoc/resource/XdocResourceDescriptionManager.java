package org.eclipse.xtext.xdoc.resource;

import java.util.Collection;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocResourceDescriptionManager extends DefaultResourceDescriptionManager {

	@Override
	public boolean isAffected(Collection<Delta> deltas,
			IResourceDescription candidate, IResourceDescriptions context) {
		Iterable<IEObjectDescription> desc = candidate.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT);
		return super.isAffected(deltas, candidate, context) || desc.iterator().hasNext();
	}

	@Override
	public boolean isAffected(Delta delta, IResourceDescription candidate)
			throws IllegalArgumentException {
		Iterable<IEObjectDescription> desc = candidate.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT);

		// TODO check if the candidate maybe even transitively references the resource
		// if yes, rebuild includee

		return super.isAffected(delta, candidate) || desc.iterator().hasNext();
	}
}
