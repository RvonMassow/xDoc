package org.eclipse.xtext.xdoc.resource;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xdoc.XdocUtil;

public class XdocResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	private final static Logger LOG = Logger.getLogger(XdocResourceDescriptionStrategy.class);

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
			if (qualifiedName != null) {
				Map<String, String> userData = new HashMap<String, String>();
				userData.put("hash", "" + XdocUtil.hash(eObject));
				acceptor.accept(EObjectDescription.create(qualifiedName, eObject, userData));
			}
		}catch (Exception e) {
			LOG.error(e);
		}
		return true;
	}
}
