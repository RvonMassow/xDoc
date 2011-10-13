package org.eclipse.xtext.xdoc.generator;

import static com.google.common.collect.Lists.*;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.generator.GeneratorComponent;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public class XdocGeneratorComponent extends GeneratorComponent{

	private List<String> slotNames = newArrayList();

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
		IGenerator instance = getCompiler();
		IFileSystemAccess fileSystemAccess = getConfiguredFileSystemAccess();
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalStateException("Slot '"+slot+"' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					if ((object2 instanceof EObject)) {
						instance.doGenerate(((EObject) object2).eResource(), fileSystemAccess);
					}
					else
						throw new IllegalStateException("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
				}
			} else if (object instanceof Resource) {
				instance.doGenerate((Resource) object, fileSystemAccess);
			} else {
				throw new IllegalStateException("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
			}
		}
	}
}
