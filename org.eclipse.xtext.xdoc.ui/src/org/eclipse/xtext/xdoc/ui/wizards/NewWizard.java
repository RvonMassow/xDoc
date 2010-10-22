package org.eclipse.xtext.xdoc.ui.wizards;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.xdoc.ui.nature.XdocNature;

public class NewWizard extends Wizard implements INewWizard {

	private static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";
	private static final String WIZARD_PAGE_DESCRIPTION = org.eclipse.xtext.xdoc.ui.wizards.Messages.XDOC_NEW_PROJECT_WIZARD_DESCRIPTION;
	private WizardNewProjectCreationPage npp;
	@SuppressWarnings("unused")
	private IWorkbench workbench;
	@SuppressWarnings("unused")
	private IStructuredSelection selection;
	
	private IWorkspace workspace;

	private String[] natures = { JavaCore.NATURE_ID,
			XtextProjectHelper.NATURE_ID,
			"org.eclipse.pde.PluginNature",
			XdocNature.NATURE_ID};
	
	private String[] builders = {JavaCore.BUILDER_ID,
			"org.eclipse.pde.SchemaBuilder",
			XtextProjectHelper.BUILDER_ID};
	
	private String[] folders = {"src", "src-gen", "META-INF", "workflow" };
	
	private Logger logger = Logger.getLogger(this.getClass());
	private String name;
	private URI location;

	public NewWizard() {
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
			addBuilders(description);
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

	private void addBuilders(IProjectDescription description) {
		ICommand[] commands = new ICommand[builders.length];
		for (int i = 0; i < commands.length; i++) {
			ICommand cmd = description.newCommand();
			cmd.setBuilderName(builders[i]);
			commands[i] = cmd;
		}
		description.setBuildSpec(commands);
	}

	private void setupProject(IProject project, SubMonitor subMonitor) throws CoreException {
		for (String folderName : folders) {
			IFolder folder = project.getFolder(folderName);
			if(!folder.exists()){
				folder.create(false, true, subMonitor.newChild(1));
			}
		}
		IJavaProject jProject = JavaCore.create(project);
		IClasspathEntry[] cp = new IClasspathEntry[4];
		cp[0] = JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5"));
		cp[1] = JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"));
		IClasspathEntry src = JavaCore.newSourceEntry(project.getFolder("src").getFullPath());
		cp[2] = src;
		cp[3] = JavaCore.newSourceEntry(project.getFolder("workflow").getFullPath());
		jProject.setRawClasspath(cp, subMonitor.newChild(1));
		setupFiles(project, subMonitor);
	}


	private void setupFiles(IProject project, SubMonitor subMonitor) throws CoreException {
		createManifest(project, subMonitor);
		createDocumentAndChapter(project, subMonitor);
		createWorkflow(project, subMonitor);
	}

	private void createManifest(IProject project, SubMonitor monitor) {
		StringBuilder fileContents = new StringBuilder();
		fileContents.append("Manifest-Version: 1.0\n");
		fileContents.append("Bundle-ManifestVersion: 2\n");
		fileContents.append("Bundle-Name: " + project.getName().trim() + "\n");
		fileContents.append("Bundle-SymbolicName: " + project.getName().trim() + "\n");
		fileContents.append("Bundle-Version: 1.0.0.qualifier\n");
		fileContents.append("Bundle-Vendor: Eclipse Modeling\n");
		fileContents.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");
		fileContents.append("Require-Bundle: org.eclipse.xtext.xdoc;bundle-version=\"1.0.0\";resolution:=optional,\n");
		fileContents.append(" org.eclipse.xtext.xdoc.generator;bundle-version=\"1.0.0\";resolution:=optional\n");
		fileContents.append("Import-Package: org.apache.log4j;version=\"1.2.15\",\n");
		fileContents.append(" org.apache.commons.logging;version=\"1.0.4\"\n");
		createFile(project, monitor, fileContents.toString(), MANIFEST_NAME);
	}
	
	private void createDocumentAndChapter(IProject project, SubMonitor monitor) {
		StringBuilder fileContents = new StringBuilder();
		fileContents.append("document[My Document]\n\n");
		fileContents.append("authors[" + System.getProperty("user.name") + "]\n\n");
		fileContents.append("chapter-ref[chapter1]");
		createFile(project, monitor, fileContents.toString(), "src/00-Document.xdoc");
		fileContents = new StringBuilder();
		fileContents.append("chapter:chapter1[First Chapter]\n\n");
		fileContents.append("This is text for the first chapter.");
		createFile(project, monitor, fileContents.toString(), "src/01-Chapter1.xdoc");
	}
	
	private void createWorkflow(IProject project, SubMonitor monitor) {
		StringBuilder fileContents = new StringBuilder();
		fileContents.append("module Generate"+project.getName()+"\n\n");
		fileContents.append("import org.eclipse.emf.mwe.utils.*\n\n");
		fileContents.append("var targetDir = \"src-gen\"\n");
		fileContents.append("var modelPath = \"src\"\n");
		fileContents.append("var texbin = \"/usr/bin/pdflatex\"\n\n");
		fileContents.append("Workflow {\n\n");

		fileContents.append("//\tcomponent = @workflow.XDocGenerator {\n");
		fileContents.append("//\t\t// or define search scope explicitly\n");
		fileContents.append("//\t\tmodelPath = modelPath\n");
		fileContents.append("//\t\ttargetDir = targetDir\n");
		fileContents.append("//\t\tpdfLatex = texbin\n");
		fileContents.append("//\t}\n\n");
		fileContents.append("\tcomponent = @workflow.XdocEclipseHelpGenerator{\n");
		fileContents.append("\t\t// or define search scope explicitly\n");
		fileContents.append("\t\tmodelPath = modelPath\n");
		fileContents.append("\t\ttargetDir = targetDir\n");
		fileContents.append("\t}\n}\n");
		createFile(project, monitor, fileContents.toString(), "workflow/generateDocs.mwe2");
	}

	private void createFile(IProject project, SubMonitor monitor, String string, String fileName) {
		IFile file = project.getFile(fileName);
		if(!file.exists()){
			ByteArrayInputStream stream;
			try {
				stream = new ByteArrayInputStream(string.getBytes(file.getCharset(true)));
				file.create(stream,
						false, monitor.newChild(1));
				stream.close();
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally{
				monitor.done();
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
