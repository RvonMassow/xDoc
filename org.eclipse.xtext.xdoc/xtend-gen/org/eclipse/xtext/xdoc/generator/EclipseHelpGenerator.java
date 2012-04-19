package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator;

@SuppressWarnings("all")
public class EclipseHelpGenerator implements IGenerator {
  @Inject
  private Provider<StatefulEclipseHelpGenerator> provider;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) {
    final StatefulEclipseHelpGenerator generator = this.provider.get();
    generator.doGenerate(res, ((IFileSystemAccessExtension2) access));
  }
}
