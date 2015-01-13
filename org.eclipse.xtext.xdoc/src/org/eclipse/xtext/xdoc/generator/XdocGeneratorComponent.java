package org.eclipse.xtext.xdoc.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.generator.GeneratorComponent;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xdoc.generator.config.Config;

import com.google.inject.Injector;

public class XdocGeneratorComponent extends GeneratorComponent{

	protected List<String> slotNames = newArrayList();
	protected Map<String,String> outlets = newHashMap();
	protected Injector injector;

	protected Map<String, Object> config = newHashMap();

	@Override
	public void addSlot(String slot) {
		this.slotNames.add(slot);
	}

	@Override
	public void preInvoke() {
		// Nothing should fail here, the workflow provides all the values checked in super.preInvoke()
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		IConfigurableGenerator instance = injector.getInstance(IConfigurableGenerator.class);
		JavaIoFileSystemAccess fsa = (JavaIoFileSystemAccess)getConfiguredFileSystemAccess();
		config.put(Config.outletPath, fsa.getOutputConfigurations().get(IFileSystemAccess.DEFAULT_OUTPUT).getOutputDirectory());
		config.put(Config.BASE_DIR, System.getProperty("user.dir"));
		initializeConfig(instance);
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalStateException("Slot '"+slot+"' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					if ((object2 instanceof EObject)) {
						instance.doGenerate(((EObject) object2).eResource(), fsa);
					}
					else
						throw new IllegalStateException("Slot contents was not a List<Resource> but a '"+object.getClass().getSimpleName()+"'!");
				}
			} else if (object instanceof Resource) {
				instance.doGenerate((Resource) object, fsa);
			} else {
				throw new IllegalStateException("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
			}
		}
	}

	protected void initializeConfig(IConfigurableGenerator instance) {
		Map<String, Object> generatorConfig = instance.getConfiguration();
		generatorConfig.put(Config.release, false);
		generatorConfig.put(Config.cleanAfterRun, false);
		generatorConfig.putAll(config);
	}

	@Override
	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	@Override
	public void setRegister(ISetup setup) {
		super.setRegister(setup);
		injector = setup.createInjectorAndDoEMFRegistration();
	}

	@Override
	public void addOutlet(Outlet out) {
		outlets.put(out.getOutletName(),out.getPath());
	}

	public boolean isCleanAfterRun() {
		return (Boolean) config.get(Config.cleanAfterRun);
	}

	public void setCleanAfterRun(boolean cleanAfterRun) {
		this.config.put(Config.cleanAfterRun, cleanAfterRun);
	}

	public boolean isRelease() {
		return (Boolean) config.get(Config.release);
	}

	public void setRelease(boolean release) {
		this.config.put(Config.release, release);
	}
}
