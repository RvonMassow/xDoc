package org.eclipse.xtext.xdoc.ui.builder;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.JavaProjectBasedBuilderParticipant;

public class XdocJavaBasedProjectBuilder extends JavaProjectBasedBuilderParticipant {

	@Override
	protected IFolder getSrcGenFolder(IProject builtProject) {
		return builtProject.getFolder("contents");
	}

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		super.build(context, monitor);
	}
}
