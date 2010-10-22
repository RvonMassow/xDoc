package org.eclipse.xtext.xdoc.ui.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class XdocNature implements IProjectNature {

	private IProject project;
	
	public static String NATURE_ID = "org.eclipse.xtext.xdoc.ui.nature";

	public void configure() throws CoreException {
	}

	public void deconfigure() throws CoreException {
	}

	public IProject getProject() {
		return this.project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

}
