package org.eclipse.xtext.xdoc;

import java.io.File;
import javax.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xdoc.XdocUiInjectorProvider;
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator;
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator;
import org.eclipse.xtext.xdoc.util.GeneratorTestConstants;
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions;
import org.eclipse.xtext.xdoc.util.ParserTestConstants;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(XdocUiInjectorProvider.class)
@SuppressWarnings("all")
public class EclipseHelpGeneratorTest {
  @Inject
  @Extension
  private ParseHelperExtensions<XdocFile> _parseHelperExtensions;
  
  @Inject
  @Extension
  private EclipseHelpGenerator _eclipseHelpGenerator;
  
  @Inject
  private StatefulEclipseHelpGenerator stateFullGen;
  
  @Inject
  private JavaIoFileSystemAccess fsa;
  
  @Test
  public void testRef() {
    this.fsa.setOutputPath(GeneratorTestConstants.TARGET_DIR);
    XdocFile _doc = this.getDoc("aRefTest.xdoc");
    Resource _eResource = _doc.eResource();
    this._eclipseHelpGenerator.doGenerate(_eResource, this.fsa);
    File _targetFile = this.getTargetFile("aRefTest.html");
    boolean _exists = _targetFile.exists();
    Assert.assertTrue(_exists);
  }
  
  @Ignore
  public void testGenCode() throws Exception {
    final XdocFile file = this.getDoc("codeTest.xdoc");
    AbstractSection _mainSection = file.getMainSection();
    final Document doc = ((Document) _mainSection);
    this.stateFullGen.generate(doc);
  }
  
  public XdocFile getDoc(final String fileName) {
    try {
      return this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + fileName));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public File getTargetFile(final String fileName) {
    return new File((GeneratorTestConstants.TARGET_DIR + fileName));
  }
}
