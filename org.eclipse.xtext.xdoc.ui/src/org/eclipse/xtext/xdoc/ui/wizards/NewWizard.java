package org.eclipse.xtext.xdoc.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.xdoc.ui.utils.ProjectUtils;

public class NewWizard extends Wizard implements INewWizard {

	private static final String WIZARD_PAGE_DESCRIPTION = org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_DESCRIPTION;
	private WizardNewProjectCreationPage npp;
	@SuppressWarnings("unused")
	private IWorkbench workbench;
	@SuppressWarnings("unused")
	private IStructuredSelection selection;
	
	private Logger logger = Logger.getLogger(this.getClass());
	private ProjectUtils utils = new ProjectUtils();

	public NewWizard() {
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		this.utils.setWorkspace(ResourcesPlugin.getWorkspace());
	}

	@Override
	public boolean performFinish() {
		utils.setName(npp.getProjectName());
		utils.setLocation(null);
		if (!npp.useDefaults()) {
			utils.setLocation(npp.getLocationURI());
		}
		IRunnableWithProgress op = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
            InterruptedException {
				try {
					utils.createProject(monitor);
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
