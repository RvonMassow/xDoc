package org.eclipse.xtext.xdoc.ui.builder;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.expression.ResourceManagerDefaultImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.xdoc.ui.internal.XdocActivator;
import org.eclipse.xtext.xdoc.ui.utils.ProjectUtils;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocBuilderParticipant implements IXtextBuilderParticipant {
	
	private static final String EXPAND = "templates::TemplateEclipseHelp::main";
	private Set<IEObjectDescription> build = new HashSet<IEObjectDescription>();
	private ProjectUtils projectUtils = new ProjectUtils();

	public XdocBuilderParticipant() {
	}

	public synchronized void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		final IFolder target = context.getBuiltProject().getFolder("src-gen/");
		if(target == null){
			return;
		}

		Outlet outlet = new Outlet();
		outlet.setAppend(false);
		outlet.setFileEncoding("ISO-8859-1");
		outlet.setOverwrite(true);
		String string = context.getBuiltProject().getLocation().makeAbsolute().toString() + "/src-gen/";
		outlet.setPath(string + "/");

		Output output = new OutputImpl();
		output.addOutlet(outlet);

		ResourceManager rm = new ResourceManagerDefaultImpl();
	    
		XpandExecutionContextImpl xpandContext = new XpandExecutionContextImpl(rm, output, null, Collections.singletonMap("dir",  new Variable("dir", "src-gen/")), null, null, null, null);//new XpandExecutionContextImpl(output, null,null,null,null);
		xpandContext.registerMetaModel(new JavaBeansMetaModel());
		xpandContext.getResourceManager().setFileEncoding("ISO-8859-1");

		List<IResourceDescription.Delta> deltas = context.getDeltas();
		for (IResourceDescription.Delta delta : deltas) {
			if(delta.getNew() == null) {
				for (IEObjectDescription obj : delta.getOld().getExportedObjects(XdocPackage.Literals.DOCUMENT)) {
					generate(obj, xpandContext, context);
				}
			} else {
				if(delta.getOld() != null) {
					for (IEObjectDescription obj : delta.getOld().getExportedObjects(XdocPackage.Literals.DOCUMENT)) {
						generate(obj, xpandContext, context);
					}
				}
				for (IEObjectDescription obj : delta.getNew().getExportedObjects(XdocPackage.Literals.DOCUMENT)) {
					generate(obj, xpandContext, context);
				}
			}
		}
		try {
			URL url = XdocActivator.getInstance().getBundle().getResource("styles/code.css");
			this.projectUtils.createFile(context.getBuiltProject(), null, url.openStream(), "src-gen/code.css");
			url = XdocActivator.getInstance().getBundle().getResource("styles/book.css");
			this.projectUtils.createFile(context.getBuiltProject(), null, url.openStream(), "src-gen/book.css");
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.build.clear();
		target.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	}

	protected void generate(IEObjectDescription desc, XpandExecutionContextImpl ctx, IBuildContext context) {
		if(!this.build.contains(desc)){
			this.build.add(desc);
			EObject eObject = context.getResourceSet().getEObject(desc.getEObjectURI(), true);
			XpandFacade facade = XpandFacade.create(ctx);
			facade.evaluate(EXPAND, eObject);
		}
	}
}
