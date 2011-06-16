package org.eclipse.xtext.xdoc.ui.builder;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.builder.JavaProjectBasedBuilderParticipant;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xdoc.generator.Outlets;

public class XdocJavaBasedProjectBuilder extends JavaProjectBasedBuilderParticipant {
	
	@Override
	protected IFolder getSrcGenFolder(IProject builtProject) {
		return builtProject.getFolder("contents");
	}

	@Override
	protected boolean isValidOutputFolder(IJavaProject javaProject,
			IFolder srcGenFolder) {
		return srcGenFolder.exists();
	}
	
	protected IFileSystemAccess getConfiguredFileSystemAccess(IFolder srcGenFolder, IAcceptor<String> newFileAcceptor) {
		EclipseResourceFileSystemAccess access = (EclipseResourceFileSystemAccess) super.getConfiguredFileSystemAccess(srcGenFolder, newFileAcceptor);
		access.setOutputPath(Outlets.WEB_SITE, srcGenFolder.getParent().getFile(new Path(Outlets.WEB_SITE_PATH_NAME)).getFullPath().toString());
		return access;
	}
}
