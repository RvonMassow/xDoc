package org.eclipse.xtext.xdoc.ui.builder;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.util.Wrapper;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
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
			List<Delta> deltas = context.getDeltas();
			docTree(deltas);
			for (IResourceDescription.Delta delta : deltas) {
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
							// detectChangeSet(delta, getDocuments(context.getBuiltProject()));
							// IFileSystemAccess access = getFileSystemAccess("contents");
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

	public void docTree(List<Delta> deltas) {
		Iterable<IResourceDescription> descs = Iterables.transform(deltas, new Function<Delta, IResourceDescription>() {
			public IResourceDescription apply(Delta from) {
				return from.getNew() != null? from.getNew() : from.getOld();
			}
		});
		Iterable<Delta> docDeltas = Iterables.filter(deltas, new Predicate<IResourceDescription.Delta>() {

			public boolean apply(IResourceDescription.Delta input) {
				if(input.getNew() != null) {
					return !Iterables.isEmpty(input.getNew().getExportedObjectsByType(XdocPackage.Literals.DOCUMENT));
				}
				return false;
			}
		});
		Iterable<IResourceDescription> docs = Iterables.transform(docDeltas, new Function<Delta, IResourceDescription>() {
			public IResourceDescription apply(Delta from) {
				return from.getNew();
			}
		});
		HashMap<String, String> nameToFileName = new HashMap<String, String>();
		for (IResourceDescription resourceDescription : docs) {
			Iterable<IReferenceDescription> chapterRefs = Iterables.filter(resourceDescription.getReferenceDescriptions(), new Predicate<IReferenceDescription>(){
				public boolean apply(IReferenceDescription input) {
					return input.getEReference().eContainer().equals(XdocPackage.Literals.CHAPTER_REF);
				}
			});
			final Iterable<URI> uris = Iterables.transform(chapterRefs, new Function<IReferenceDescription, URI>() {
				public URI apply(IReferenceDescription from) {
					return from.getTargetEObjectUri().trimFragment();
				}
			});
			Iterable<IResourceDescription> referencedChapterResources = Iterables.filter(descs, new Predicate<IResourceDescription>(){
				public boolean apply(IResourceDescription input) {
					return Iterables.contains(uris, input.getURI());
				}
			});
			for (IResourceDescription referencedChapterDescription : referencedChapterResources) {
				Iterable<IReferenceDescription> sectionRefDescription = Iterables.filter(referencedChapterDescription.getReferenceDescriptions(), new Predicate<IReferenceDescription>(){
					public boolean apply(IReferenceDescription input) {
						return input.getEReference().eContainer().equals(XdocPackage.Literals.SECTION_REF);
					}
				});
			}
		}
	}

	private void addToMap(URI uri, Iterable<IResourceDescription> descs,
			HashMap<String, String> uriToUri, EClass sectionRef) {

	}

	private void addToMap(URI virtualContainerURI, final URI uri, Iterable<IResourceDescription> descs,
			HashMap<String, String> nameToFileName, final EClass clazz) {
		IResourceDescription desc = Iterables.find(descs, new Predicate<IResourceDescription>() {
			public boolean apply(IResourceDescription input) {
				return input.getURI().equals(uri);
			}
		});
		Iterable<IReferenceDescription> subSectionRefs = Iterables.filter(desc.getReferenceDescriptions(), new Predicate<IReferenceDescription>() {
			public boolean apply(IReferenceDescription input) {
				return input.getEReference().eContainer().equals(clazz);
			}
		});
		for (URI referencedUri : Iterables.transform(subSectionRefs, new Function<IReferenceDescription, URI>() {

			public URI apply(IReferenceDescription from) {
				return from.getTargetEObjectUri().trimFragment();
			}
		})) {
			addToMap(referencedUri, descs, nameToFileName, XdocPackage.Literals.SECTION2_REF);
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

//	// Step 1: find all XDocuments
//	private Iterable<IResourceDescription> getDocuments(IProject project) {
//		XdocResourceVisitor visitor = new XdocResourceVisitor();
//		Iterable<IResourceDescription> ret = new ArrayList<IResourceDescription>();
//		try {
//			project.accept(visitor);
//		} catch (CoreException e) {
//			logger.error("Failed to load resources", e);
//		}
//
//		XtextResourceSet set = new XtextResourceSet();
//		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		List<IFile> files = visitor.getList();
//		for (IFile file : files) {
//			Resource res = set.getResource(URI.createURI(file.getLocationURI().toString(), true), true);
//			IResourceDescription resource = resourceDescriptionManager.getResourceDescription(res);
//			ret = Iterables.concat(ret, Collections.singleton(resource));
//		}
//		return ret;
//	}
//
//	// Step 2: detect documents belonging to the changeset
//	private Iterable<IResourceDescription> detectChangeSet(IResourceDescription.Delta delta, Iterable<IResourceDescription> descriptions) {
//		IResourceDescription rd = delta.getNew();
//		Predicate<IResourceDescription> pred = new FilterImported(rd, resourceDescriptionManager);
//
////		Iterable<QualifiedName> uris = Iterables.transform(descriptions, new Function<IResourceDescription, QualifiedName> () {
////			public QualifiedName apply(IResourceDescription from) {
////				return from.getImportedNames();
////			}
////		});
//		Set<IResourceDescription> result = Collections.singleton(delta.getNew());
//		int lastSize;
//		Set<QualifiedName> exportedNames = Sets.newHashSet(Iterables.transform(rd.getExportedObjects(), new Function<IEObjectDescription, QualifiedName>(){
//			public QualifiedName apply(IEObjectDescription from) {
//				return from.getName();
//			}
//		}));
//		Sets.newHashSet(exportedNames);
//		do {
//			lastSize = result.size();
//			Iterable<IResourceDescription> affected = Iterables.filter(descriptions, pred);
//			result = Sets.union(Sets.newHashSet(result), Sets.newHashSet(affected));
//		} while(result.size() != lastSize);
//		return result;
//	}
//	// Step 3: transform (Using the Xtend transformation for now)
//	// Step 1-3: cache! use the calculated hashcodes from the userdata to check if anything changed, if no, reuse
//
//	static class FilterImported implements Predicate<IResourceDescription>  {
//
//		private final IResourceDescription desc;
//		private XdocResourceDescriptionManager rdm;
//
//		public FilterImported(IResourceDescription desc, XdocResourceDescriptionManager rdm) {
//			this.desc = desc;
//			this.rdm = rdm;
//		}
//
//		public boolean apply(IResourceDescription input) {
//			DescriptionUtils descriptionUtils = rdm.getDescriptionUtils();
//			Set<URI> collectOutgoingReferences = descriptionUtils.collectOutgoingReferences(input);
//			URI uri = desc.getURI();
//			return collectOutgoingReferences.contains(uri);
//		}
//
//	}
}