package org.eclipse.xtext.xdoc.ui.builder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.resources.OsgiResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.VetoException;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.util.Wrapper;

import com.google.inject.Inject;

public class XdocBuilderParticipant implements IXtextBuilderParticipant {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private AbstractUIPlugin plugin;

	public void build(final IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		final Wrapper<IFolder> folder = Wrapper.wrap(null);

		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet() {
			@Override
			public FileHandle createFileHandle(String fileName)
					throws VetoException {
				IFile file = folder.get().getFile(new Path(fileName));
				return new EclipseBasedFileHandle(file, this);
			}
		};
		output.addOutlet(outlet);
		Map<String, Variable> globalVars = new HashMap<String, Variable>();
		// FIXME resource loading
		try {
			ResourceLoaderFactory.setCurrentThreadResourceLoader(new OsgiResourceLoader(plugin.getBundle().getSymbolicName(), this.getClass().getClassLoader()));
			XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output,
					null, null, null, null);
			ctx.registerMetaModel(new JavaBeansMetaModel());

			String projectName = context.getBuiltProject().getName();
			for (IResourceDescription.Delta delta : context.getDeltas()) {
				// handle deletion
				String projectSegment = delta.getUri().segment(1);
				if (projectName.equals(projectSegment)) {
					if (delta.getUri().fileExtension().equals("xdoc")) {
						IFolder contentsFolder = context.getBuiltProject().getFolder("contents");
						if (folder.get() == null) {
							if (!contentsFolder.exists())
								contentsFolder.create(true, true, monitor);
							folder.set(contentsFolder);
						}
						if (delta.getNew() == null) {
							IFile file = folder.get().getFile(delta.getUri().lastSegment()+".html");
							if (file.exists())
								file.delete(true, monitor);
						} else {
							Resource resource = context.getResourceSet().getResource(
									delta.getUri(), true);
							EObject object = resource.getContents().get(0);
							// set directories for CopyUtil to be able to copy referenced images
							String baseDir = context.getBuiltProject().getLocation() + File.separator +
								concatSegments(2, delta.getUri().segmentCount() - 1, delta.getUri());
							Variable var = new Variable("srcDir", baseDir);
							globalVars.put("srcDir", var);
							var = new Variable("dir", contentsFolder.getLocation().toString());
							globalVars.put("dir", var);
							ctx.getGlobalVariables().putAll(globalVars);
							generate(object, ctx, context);
						}
					}
				}
			}
			if(folder.get() != null ){
				folder.get().refreshLocal(IFolder.DEPTH_INFINITE, monitor);
				if(context.getBuildType().equals(BuildType.CLEAN)) {
					IFile file = folder.get().getFile("toc.xml");
					if (file.exists()) {
						file.delete(true, monitor);
					}
				}
			}
		} finally {
			ResourceLoaderFactory.setCurrentThreadResourceLoader(null);
		}

	}

	private String concatSegments(int i, int segmentCount, URI uri) {
		StringBuilder sb = new StringBuilder();
		for(; i < segmentCount; i++){
			sb.append(uri.segment(i));
			sb.append(File.separatorChar);
		}
		return sb.toString();
	}

	protected void generate(EObject eObject, XpandExecutionContextImpl ctx,
			IBuildContext context) {
		try {
			XpandFacade.create(ctx).evaluate(
					"templates::eclipsehelp::Main::main", eObject);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
	}

}
