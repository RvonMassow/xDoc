package org.eclipse.xtext.xdoc.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.XtextProjectHelper;

import com.google.inject.Inject;

@SuppressWarnings("unused")
public class NewWizard extends Wizard implements INewWizard {

	private static final String WIZARD_PAGE_DESCRIPTION = org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_DESCRIPTION;
	private WizardNewProjectCreationPage npp;
	private IWorkbench workbench;
	private IStructuredSelection selection;

	private IWorkspace workspace;

	private String[] natures = { JavaCore.NATURE_ID, XtextProjectHelper.NATURE_ID };
	
	private String[] folders = {"src", "src-gen", "META-INF" };

	private Logger logger = Logger.getLogger(this.getClass());
	private String name;
	private URI location;

	public NewWizard() {
		// TODO Auto-generated constructor stub
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		this.workspace = ResourcesPlugin.getWorkspace();
	}

	@Override
	public boolean performFinish() {
		name = npp.getProjectName();
		location = null;
		if (!npp.useDefaults()) {
			location = npp.getLocationURI();
		}
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				try {
					createProject(monitor);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				}finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
			Throwable realException = e.getTargetException();
			MessageDialog
					.openError(
							getShell(),
							org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_ERROR_MSG,
							realException.getMessage());
			return false;
		}
		return true;
	}

	private void createProject(IProgressMonitor monitor) {
		IProject project = null;
		
		try {
			IProjectDescription description = workspace.newProjectDescription(this.name);
			if (location != null) {
				description.setLocationURI(location);
			}
			project = workspace.getRoot().getProject(this.name);
			description.setNatureIds(this.natures);
			SubMonitor subMonitor = SubMonitor.convert(monitor, 10);
			project.create(description, subMonitor.newChild(1));
			project.open(subMonitor.newChild(1));
			project.setDescription(description, subMonitor.newChild(1));
			setupProject(project, subMonitor);
			subMonitor.done();
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		}

	}

	private void setupProject(IProject project, SubMonitor subMonitor) throws CoreException {
		for (String folderName : folders) {
			IFolder folder = project.getFolder(folderName);
			if(!folder.exists()){
				folder.create(false, true, subMonitor.newChild(1));
			}
		}
	}


	@Override
	public void addPages() {
		super.addPages();

		this.npp = new WizardNewProjectCreationPage(
				org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_PAGE_HEAD);
		this.npp.setTitle(org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_PAGE_TITLE);
		this.npp.setDescription(NewWizard.WIZARD_PAGE_DESCRIPTION);
		super.addPage(this.npp);
	}

}
