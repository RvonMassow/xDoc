package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

@SuppressWarnings("all")
public class HTMLNamingExtensions {
  
  @Inject
  private PlainText plainText;
  
  @Inject
  private Utils utils;
  
  public String fileName(final EObject obj) {
    String _internalFileName = this.internalFileName(obj);
    String _operator_plus = StringExtensions.operator_plus(_internalFileName, ".html");
    return _operator_plus;
  }
  
  protected String _internalFileName(final AbstractSection section) {
    String _switchResult = null;
    EObject _eContainer = section.eContainer();
    final EObject container = _eContainer;
    boolean matched = false;
    if (!matched) {
      if (container instanceof XdocFile) {
        final XdocFile container_1 = (XdocFile) container;
        matched=true;
        Resource _eResource = section.eResource();
        String _internalFileName = this.internalFileName(_eResource);
        _switchResult = _internalFileName;
      }
    }
    if (!matched) {
      if (container instanceof Section3) {
        final Section3 container_2 = (Section3) container;
        matched=true;
        String _internalFileName_1 = this.internalFileName(container_2);
        _switchResult = _internalFileName_1;
      }
    }
    if (!matched) {
      if (container instanceof Section2) {
        final Section2 container_3 = (Section2) container;
        matched=true;
        String _internalFileName_2 = this.internalFileName(container_3);
        _switchResult = _internalFileName_2;
      }
    }
    if (!matched) {
      if (container instanceof AbstractSection) {
        final AbstractSection container_4 = (AbstractSection) container;
        matched=true;
        String _internalFileName_3 = this.internalFileName(container_4);
        String _operator_plus = StringExtensions.operator_plus(_internalFileName_3, "-");
        List<? extends AbstractSection> _subSection = this.utils.subSection(container_4);
        int _indexOf = _subSection.indexOf(section);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)_indexOf));
        _switchResult = _operator_plus_1;
      }
    }
    return _switchResult;
  }
  
  protected String _internalFileName(final EObject obj) {
    EObject _eContainer = obj.eContainer();
    String _internalFileName = this.internalFileName(_eContainer);
    return _internalFileName;
  }
  
  protected String _internalFileName(final Resource res) {
    URI _uRI = res.getURI();
    String _lastSegment = _uRI.lastSegment();
    String _replaceFirst = _lastSegment.replaceFirst("\\.xdoc$", "");
    return _replaceFirst;
  }
  
  public String internalFileName(final Notifier section) {
    if ((section instanceof AbstractSection)) {
      return _internalFileName((AbstractSection)section);
    } else if ((section instanceof EObject)) {
      return _internalFileName((EObject)section);
    } else if ((section instanceof Resource)) {
      return _internalFileName((Resource)section);
    } else {
      throw new IllegalArgumentException();
    }
  }
}