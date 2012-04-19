package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator;
import org.eclipse.xtext.xdoc.generator.HtmlGenerator;

@SuppressWarnings("all")
public class XdocGenerator implements IGenerator {
  @Inject
  private HtmlGenerator htmlGen;
  
  @Inject
  private EclipseHelpGenerator helpGen;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.helpGen.doGenerate(input, fsa);
    this.htmlGen.doGenerate(input, fsa);
  }
}
