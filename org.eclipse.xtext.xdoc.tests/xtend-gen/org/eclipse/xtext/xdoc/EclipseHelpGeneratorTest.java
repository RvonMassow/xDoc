package org.eclipse.xtext.xdoc;

import java.io.File;
import javax.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.XdocInjectorProvider;
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator;
import org.eclipse.xtext.xdoc.util.GeneratorTestConstants;
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions;
import org.eclipse.xtext.xdoc.util.ParserTestConstants;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
public class EclipseHelpGeneratorTest {
  @Inject
  private ParseHelperExtensions<XdocFile> _parseHelperExtensions;
  
  @Inject
  private EclipseHelpGenerator _eclipseHelpGenerator;
  
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
  
  public void testGenCode() throws Exception {
      String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "codeTest.xdoc");
      XdocFile _doc = this.getDoc(_operator_plus);
      final XdocFile file = _doc;
      AbstractSection _mainSection = file.getMainSection();
      final Document doc = ((Document) _mainSection);
      this._eclipseHelpGenerator.generate(doc);
      Pair<String,Integer> _operator_mappedTo = ObjectExtensions.<String, Integer>operator_mappedTo("foo", Integer.valueOf(3));
      final Pair<String,Integer> v = _operator_mappedTo;
  }
  
  public XdocFile getDoc(final String fileName) {
    try {
      String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, fileName);
      XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
      return _docFromFile;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public File getTargetFile(final String fileName) {
    String _operator_plus = StringExtensions.operator_plus(GeneratorTestConstants.TARGET_DIR, fileName);
    File _file = new File(_operator_plus);
    return _file;
  }
}
