package org.eclipse.xtext.xdoc.resource;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

public class XdocResourceDescriptionManager extends DefaultResourceDescriptionManager {

	@Override
	public boolean isAffected(Collection<Delta> deltas,
			IResourceDescription candidate, IResourceDescriptions context) {
		if(!candidate.getURI().lastSegment().endsWith(".xdoc"))
			return false;
		if(super.isAffected(deltas, candidate, context) || candidate.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT).iterator().hasNext()){
			return true;
		}
		Collection<IResourceDescription> deltaDescriptions = Collections2.transform(deltas, new Function<Delta, IResourceDescription>(){
			public IResourceDescription apply(Delta from) {
				return from.getNew() != null? from.getNew(): from.getOld();
			}
		});
		for (IResourceDescription rd : deltaDescriptions){
			Set<QualifiedName> exportedNames = Sets.newHashSet(Iterables.transform(rd.getExportedObjects(),
					new Function<IEObjectDescription, QualifiedName>(){
				public QualifiedName apply(IEObjectDescription from) {
					return from.getName();
				}
			}));
			if(desc(exportedNames, candidate, context, new HashSet<IResourceDescription>()))
				return true;
		}
		return false;
	}

	@Override
	public boolean isAffected(Delta delta, IResourceDescription candidate)
			throws IllegalArgumentException {
		Iterable<IEObjectDescription> desc = candidate.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT);
		return super.isAffected(delta, candidate) || desc.iterator().hasNext();
	}

	private boolean desc(Set<QualifiedName> exportedNames, IResourceDescription cand, IResourceDescriptions context, Collection<IResourceDescription> checked) {

		checked.add(cand);
		if(!Collections.disjoint(exportedNames, Sets.newHashSet(cand.getImportedNames()))){
			return true;
		} else if(cand.getExportedObjectsByType(XdocPackage.Literals.DOCUMENT).iterator().hasNext()) {
			return false;
		} else {
			for (IReferenceDescription referenceDescription: cand.getReferenceDescriptions()) {
				EReference eReference = referenceDescription.getEReference();
				if(eReference!= null) {
					EClassifier eType = eReference.getEType();
					if(eType == XdocPackage.Literals.CHAPTER_REF || eType == XdocPackage.Literals.SECTION_REF || eType == XdocPackage.Literals.SECTION2_REF
							|| eType == XdocPackage.Literals.CODE_BLOCK) {
						URI targetFile = referenceDescription.getTargetEObjectUri().trimFragment();
						IResourceDescription nextCand = context.getResourceDescription(targetFile);
						if(!checked.contains(nextCand))
							if(desc(exportedNames, nextCand, context, checked))
								return true;
					}
				}
			}
			return false;
		}
	}
}
