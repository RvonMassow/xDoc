package org.eclipse.xtext.xdoc;

import java.io.File;
import javax.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xdoc.XdocInjectorProvider;
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator;
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator;
import org.eclipse.xtext.xdoc.util.GeneratorTestConstants;
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions;
import org.eclipse.xtext.xdoc.util.ParserTestConstants;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
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
  private EclipseResourceFileSystemAccess2 fsa;
  
  @Test
  public void testRef() {
    XdocFile _doc = this.getDoc("aRefTest.xdoc");
    Resource _eResource = _doc.eResource();
    this._eclipseHelpGenerator.doGenerate(_eResource, this.fsa);
    File _targetFile = this.getTargetFile("aRefTest.html");
    boolean _exists = _targetFile.exists();
    Assert.assertTrue(_exists);
  }
  
  public Pair<String,Integer> testGenCode() throws Exception {
    Pair<String,Integer> _xblockexpression = null;
    {
      final XdocFile file = this.getDoc((ParserTestConstants.TEST_FILE_DIR + "codeTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Document doc = ((Document) _mainSection);
      this.stateFullGen.generate(doc);
      Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("foo", Integer.valueOf(3));
      _xblockexpression = (_mappedTo);
    }
    return _xblockexpression;
  }
  
  public XdocFile getDoc(final String fileName) {
    try {
      XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + fileName));
      return _docFromFile;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public File getTargetFile(final String fileName) {
    File _file = new File((GeneratorTestConstants.TARGET_DIR + fileName));
    return _file;
  }
}
