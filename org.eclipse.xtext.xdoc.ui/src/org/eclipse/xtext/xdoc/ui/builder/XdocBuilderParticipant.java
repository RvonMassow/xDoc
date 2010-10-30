package org.eclipse.xtext.xdoc.ui.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.VetoException;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;

public class XdocBuilderParticipant implements IXtextBuilderParticipant {

	public void build(final IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		final IFolder folder = context.getBuiltProject().getFolder("contents");
		if (!folder.exists())
			folder.create(true, true, monitor);

		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet() {
			@Override
			public FileHandle createFileHandle(String fileName)
					throws VetoException {
				IFile file = folder.getFile(new Path(fileName));
				return new EclipseBasedFileHandle(file, this);
			}
		};
		output.addOutlet(outlet);
		XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output,
				null, null, null, null);
		ctx.registerMetaModel(new JavaBeansMetaModel());

		for (IResourceDescription.Delta delta : context.getDeltas()) {
			// handle deletion
			if (delta.getUri().fileExtension().equals("xdoc")) {
				if (delta.getNew() == null) {
					IFile file = folder.getFile(delta.getUri().lastSegment()+".html");
					if (file.exists())
						file.delete(true, monitor);
				} else {
					Resource resource = context.getResourceSet().getResource(
							delta.getUri(), true);
					EObject object = resource.getContents().get(0);
					generate(object, ctx, context);
				}
			}
		}

	}

	protected void generate(EObject eObject, XpandExecutionContextImpl ctx,
			IBuildContext context) {
		try {
			XpandFacade.create(ctx).evaluate(
					"templates::eclipsehelp::Main::main", eObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
