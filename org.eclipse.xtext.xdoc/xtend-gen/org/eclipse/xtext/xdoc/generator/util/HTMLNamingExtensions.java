package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;
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
    String _xblockexpression = null;
    {
      AbstractSection _switchResult = null;
      final AbstractSection section_1 = section;
      boolean matched = false;
      if (!matched) {
        if (section_1 instanceof ChapterRef) {
          final ChapterRef section_2 = (ChapterRef) section_1;
          matched=true;
          Chapter _chapter = section_2.getChapter();
          _switchResult = _chapter;
        }
      }
      if (!matched) {
        if (section_1 instanceof SectionRef) {
          final SectionRef section_3 = (SectionRef) section_1;
          matched=true;
          Section _section = section_3.getSection();
          _switchResult = _section;
        }
      }
      if (!matched) {
        if (section_1 instanceof Section2Ref) {
          final Section2Ref section_4 = (Section2Ref) section_1;
          matched=true;
          Section2 _section2 = section_4.getSection2();
          _switchResult = _section2;
        }
      }
      if (!matched) {
        _switchResult = section;
      }
      final AbstractSection sec = _switchResult;
      String _switchResult_1 = null;
      EObject _eContainer = sec.eContainer();
      final EObject container = _eContainer;
      boolean matched_1 = false;
      if (!matched_1) {
        if (container instanceof XdocFile) {
          final XdocFile container_1 = (XdocFile) container;
          matched_1=true;
          Resource _eResource = sec.eResource();
          String _internalFileName = this.internalFileName(_eResource);
          _switchResult_1 = _internalFileName;
        }
      }
      if (!matched_1) {
        if (container instanceof Section3) {
          final Section3 container_2 = (Section3) container;
          matched_1=true;
          String _internalFileName_1 = this.internalFileName(container_2);
          _switchResult_1 = _internalFileName_1;
        }
      }
      if (!matched_1) {
        if (container instanceof Section2) {
          final Section2 container_3 = (Section2) container;
          matched_1=true;
          String _internalFileName_2 = this.internalFileName(container_3);
          _switchResult_1 = _internalFileName_2;
        }
      }
      if (!matched_1) {
        if (container instanceof AbstractSection) {
          final AbstractSection container_4 = (AbstractSection) container;
          matched_1=true;
          String _internalFileName_3 = this.internalFileName(container_4);
          String _operator_plus = StringExtensions.operator_plus(_internalFileName_3, "-");
          _switchResult_1 = _operator_plus;
        }
      }
      _xblockexpression = (_switchResult_1);
    }
    return _xblockexpression;
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
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(section).toString());
    }
  }
}