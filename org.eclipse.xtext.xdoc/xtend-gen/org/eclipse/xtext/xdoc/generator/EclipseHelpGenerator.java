package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;
import org.eclipse.xtext.xdoc.generator.IConfigurableGenerator;
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator;

@SuppressWarnings("all")
public class EclipseHelpGenerator implements IConfigurableGenerator {
  @Inject
  private Provider<StatefulEclipseHelpGenerator> provider;
  
  @Inject
  private HashMap<String,Object> config;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) {
    final StatefulEclipseHelpGenerator generator = this.provider.get();
    generator.doGenerate(res, ((IFileSystemAccessExtension2) access));
  }
  
  public Map<String,Object> getConfiguration() {
    return this.config;
  }
}
