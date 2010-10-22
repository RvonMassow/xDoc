package org.eclipse.xtext.xdoc.ui.builder;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class XdocBuilderParticipant implements IXtextBuilderParticipant {

	private Mwe2Runner runner;

	public XdocBuilderParticipant() {
		this.runner = new Mwe2Runner();
	}

	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		IProject project = context.getBuiltProject();
		
		monitor.done();
	}

}
