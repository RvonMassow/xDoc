package org.eclipse.xtext.xdoc.ui.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.xdoc.ui.internal.XdocActivator;

public class ProjectUtils {
	private String name;
	private URI location;
	private Logger logger = Logger.getLogger(this.getClass());

	private String[] folders = {"src", "contents", "website", "META-INF" };

	private String[] natures = { JavaCore.NATURE_ID,
			XtextProjectHelper.NATURE_ID,
			"org.eclipse.pde.PluginNature",
		};
	
	private String[] builders = {JavaCore.BUILDER_ID,
			"org.eclipse.pde.SchemaBuilder",
			XtextProjectHelper.BUILDER_ID};

	private IWorkspace workspace;

	public IWorkspace getWorkspace() {
		return workspace;
	}

	public void setWorkspace(IWorkspace workspace) {
		this.workspace = workspace;
	}

	public ProjectUtils() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URI getLocation() {
		return location;
	}

	public void setLocation(URI location) {
		this.location = location;
	}
	
	public void createFile(IProject project, SubMonitor monitor, String string, String fileName) {
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

	public void createFile(IProject project, SubMonitor monitor, InputStream stream, String fileName) {
		IFile file = project.getFile(fileName);
		if(!file.exists()){
			try {
				file.create(stream,
						false, monitor.newChild(1));
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally{
				monitor.done();
			}
		}
	}

	public void createProject(IProgressMonitor monitor) {
		IProject project = null;
		
		try {
			IProjectDescription description = workspace.newProjectDescription(this.getName());
			if (this.getLocation() != null) {
				description.setLocationURI(this.getLocation());
			}
			project = workspace.getRoot().getProject(this.getName());
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
		IClasspathEntry[] cp = new IClasspathEntry[3];
		cp[0] = JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"));
		cp[1] = JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"));
		IClasspathEntry src = JavaCore.newSourceEntry(project.getFolder("src").getFullPath());
		cp[2] = src;
		jProject.setRawClasspath(cp, subMonitor.newChild(1));
		setupFiles(project, subMonitor);
	}


	private void setupFiles(IProject project, SubMonitor subMonitor) throws CoreException {
		createManifest(project, subMonitor);
		createDocumentAndChapter(project, subMonitor);
//		createWorkflow(project, subMonitor);
		createPluginXML(project, subMonitor);
		createCSSFiles(project, subMonitor);
		createImages(project, subMonitor);
	}

	private void createImages(IProject project, SubMonitor subMonitor) {
		try{
			URL url = XdocActivator.getInstance().getBundle().getResource("resources/triangle.gif");
			this.createFile(project, subMonitor, url.openStream(), "website/triangle.gif");
			url = XdocActivator.getInstance().getBundle().getResource("resources/triangle-90.gif");
			this.createFile(project, subMonitor, url.openStream(), "website/triangle-90.gif");
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} 
	}

	private void createCSSFiles(IProject project, SubMonitor subMonitor) {
		try {
			URL url = XdocActivator.getInstance().getBundle().getResource("resources/code.css");
			this.createFile(project, subMonitor, url.openStream(), "contents/code.css");
			this.createFile(project, subMonitor, url.openStream(), "website/code.css");
			url = XdocActivator.getInstance().getBundle().getResource("resources/book.css");
			this.createFile(project, subMonitor, url.openStream(), "contents/book.css");
			this.createFile(project, subMonitor, url.openStream(), "website/book.css");
			url = XdocActivator.getInstance().getBundle().getResource("resources/novaAddon.css");
			this.createFile(project, subMonitor, url.openStream(), "website/novaAddon.css");
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
	}

	private void createManifest(IProject project, SubMonitor monitor) {
		StringBuilder fileContents = new StringBuilder();
		fileContents.append("Manifest-Version: 1.0\n");
		fileContents.append("Bundle-ManifestVersion: 2\n");
		fileContents.append("Bundle-Name: " + project.getName().trim() + "\n");
		fileContents.append("Bundle-SymbolicName: " + project.getName().trim() + ";singleton:=true\n");
		fileContents.append("Bundle-Version: 1.0.0.qualifier\n");
		fileContents.append("Bundle-Vendor: My Company\n");
		fileContents.append("Require-Bundle: org.eclipse.help");
		this.createFile(project, monitor, fileContents.toString(), "META-INF/MANIFEST.MF");
	}
	
	private void createDocumentAndChapter(IProject project, SubMonitor monitor) {
		try {
			URL url = XdocActivator.getInstance().getBundle().getResource("resources/00-Main.xdoc");
			this.createFile(project, monitor, url.openStream(), "src/00-Main.xdoc");
			url = XdocActivator.getInstance().getBundle().getResource("resources/01-Introduction.xdoc");
			this.createFile(project, monitor, url.openStream(), "src/01-Introduction.xdoc");
			url = XdocActivator.getInstance().getBundle().getResource("resources/02-GettingStarted.xdoc");
			this.createFile(project, monitor, url.openStream(), "src/02-GettingStarted.xdoc");
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
	}
	
//	private void createWorkflow(IProject project, SubMonitor monitor) {
//		StringBuilder fileContents = new StringBuilder();
//		fileContents.append("module GenerateDocs\n\n");
//		fileContents.append("import org.eclipse.emf.mwe.utils.*\n\n");
//		fileContents.append("var targetDir = \"src-gen\"\n");
//		fileContents.append("var modelPath = \"src\"\n");
//		fileContents.append("//var texbin = \"/usr/bin/pdflatex\"\n\n");
//		fileContents.append("Workflow {\n\n");
//
//		fileContents.append("//\tcomponent = @workflow.XDocGenerator {\n");
//		fileContents.append("//\t\t// or define search scope explicitly\n");
//		fileContents.append("//\t\tmodelPath = modelPath\n");
//		fileContents.append("//\t\ttargetDir = targetDir\n");
//		fileContents.append("//\t\tpdfLatex = texbin\n");
//		fileContents.append("//\t}\n\n");
//		fileContents.append("\tcomponent = @workflow.XdocEclipseHelpGenerator{\n");
//		fileContents.append("\t\t// or define search scope explicitly\n");
//		fileContents.append("\t\tmodelPath = modelPath\n");
//		fileContents.append("\t\ttargetDir = targetDir\n");
//		fileContents.append("\t}\n}\n");
//		this.createFile(project, monitor, fileContents.toString(), "workflow/generateDocs.mwe2");
//	}
	
	private void createPluginXML(IProject project, SubMonitor monitor){
		StringBuilder fileContents = new StringBuilder();
		fileContents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		fileContents.append("<?eclipse version=\"3.4\"?>\n");
		fileContents.append("<plugin>\n");
		fileContents.append("   <extension\n");
		fileContents.append("         point=\"org.eclipse.help.toc\">\n");
		fileContents.append("      <toc\n");
		fileContents.append("            file=\"contents/toc.xml\"\n");
		fileContents.append("            primary=\"true\">\n");
		fileContents.append("      </toc>\n");
		fileContents.append("   </extension>\n\n");
		fileContents.append("</plugin>\n");
		this.createFile(project, monitor, fileContents.toString(), "plugin.xml");
	}

}