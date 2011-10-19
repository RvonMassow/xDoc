package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.PartRef;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

@SuppressWarnings("all")
public class EclipseNamingExtensions {
  @Inject
  private AbstractSectionExtension sectionExtension;
  
  public String getLocalId(final Identifiable identifiable) {
    String _switchResult = null;
    final Identifiable identifiable_1 = identifiable;
    boolean matched = false;
    if (!matched) {
      if (identifiable_1 instanceof ChapterRef) {
        final ChapterRef identifiable_2 = (ChapterRef) identifiable_1;
        matched=true;
        Chapter _chapter = identifiable_2.getChapter();
        String _localId = this.getLocalId(_chapter);
        _switchResult = _localId;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof SectionRef) {
        final SectionRef identifiable_3 = (SectionRef) identifiable_1;
        matched=true;
        Section _section = identifiable_3.getSection();
        String _localId_1 = this.getLocalId(_section);
        _switchResult = _localId_1;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof Section2Ref) {
        final Section2Ref identifiable_4 = (Section2Ref) identifiable_1;
        matched=true;
        Section2 _section2 = identifiable_4.getSection2();
        String _localId_2 = this.getLocalId(_section2);
        _switchResult = _localId_2;
      }
    }
    if (!matched) {
      {
        String _name = identifiable.getName();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
        if (_operator_notEquals) {
          String _name_1 = identifiable.getName();
          return _name_1;
        }
        EObject _eContainer = identifiable.eContainer();
        final AbstractSection parent = ((AbstractSection) _eContainer);
        boolean _operator_equals = ObjectExtensions.operator_equals(parent, null);
        if (_operator_equals) {
          return "0";
        } else {
          String _localId_3 = this.getLocalId(parent);
          String _operator_plus = StringExtensions.operator_plus(_localId_3, "_");
          EList<EObject> _eContents = parent.eContents();
          int _indexOf = _eContents.indexOf(identifiable);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)_indexOf));
          return _operator_plus_1;
        }
      }
    }
    return _switchResult;
  }
  
  public String getFullURL(final Identifiable identifiable) {
    String _switchResult = null;
    final Identifiable identifiable_1 = identifiable;
    boolean matched = false;
    if (!matched) {
      if (identifiable_1 instanceof PartRef) {
        final PartRef identifiable_2 = (PartRef) identifiable_1;
        matched=true;
        Part _part = identifiable_2.getPart();
        String _fullURL = this.getFullURL(_part);
        _switchResult = _fullURL;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof ChapterRef) {
        final ChapterRef identifiable_3 = (ChapterRef) identifiable_1;
        matched=true;
        Chapter _chapter = identifiable_3.getChapter();
        String _fullURL_1 = this.getFullURL(_chapter);
        _switchResult = _fullURL_1;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof SectionRef) {
        final SectionRef identifiable_4 = (SectionRef) identifiable_1;
        matched=true;
        Section _section = identifiable_4.getSection();
        String _fullURL_2 = this.getFullURL(_section);
        _switchResult = _fullURL_2;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof Section2Ref) {
        final Section2Ref identifiable_5 = (Section2Ref) identifiable_1;
        matched=true;
        Section2 _section2 = identifiable_5.getSection2();
        String _fullURL_3 = this.getFullURL(_section2);
        _switchResult = _fullURL_3;
      }
    }
    if (!matched) {
      EObject _eContainer = identifiable.eContainer();
      if ((_eContainer instanceof XdocFile)) {
        matched=true;
        String _resourceURL = this.getResourceURL(identifiable);
        _switchResult = _resourceURL;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof Part) {
        final Part identifiable_6 = (Part) identifiable_1;
        matched=true;
        Resource _eResource = identifiable_6.eResource();
        URI _uRI = _eResource.getURI();
        URI _trimFileExtension = _uRI.trimFileExtension();
        String _lastSegment = _trimFileExtension.lastSegment();
        String _operator_plus = StringExtensions.operator_plus(_lastSegment, "_");
        EObject _eContainer_1 = identifiable_6.eContainer();
        EList<EObject> _eContents = _eContainer_1.eContents();
        int _indexOf = _eContents.indexOf(identifiable_6);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)_indexOf));
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".html");
        _switchResult = _operator_plus_2;
      }
    }
    if (!matched) {
      String _resourceURL_1 = this.getResourceURL(identifiable);
      String _operator_plus_3 = StringExtensions.operator_plus(_resourceURL_1, "#");
      String _localId = this.getLocalId(identifiable);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _localId);
      _switchResult = _operator_plus_4;
    }
    return _switchResult;
  }
  
  public String getResourceURL(final Identifiable identifiable) {
    String _switchResult = null;
    final Identifiable identifiable_1 = identifiable;
    boolean matched = false;
    if (!matched) {
      if (identifiable_1 instanceof PartRef) {
        final PartRef identifiable_2 = (PartRef) identifiable_1;
        matched=true;
        Part _part = identifiable_2.getPart();
        String _resourceURL = this.getResourceURL(_part);
        _switchResult = _resourceURL;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof ChapterRef) {
        final ChapterRef identifiable_3 = (ChapterRef) identifiable_1;
        matched=true;
        Chapter _chapter = identifiable_3.getChapter();
        String _resourceURL_1 = this.getResourceURL(_chapter);
        _switchResult = _resourceURL_1;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof SectionRef) {
        final SectionRef identifiable_4 = (SectionRef) identifiable_1;
        matched=true;
        Section _section = identifiable_4.getSection();
        String _resourceURL_2 = this.getResourceURL(_section);
        _switchResult = _resourceURL_2;
      }
    }
    if (!matched) {
      if (identifiable_1 instanceof Section2Ref) {
        final Section2Ref identifiable_5 = (Section2Ref) identifiable_1;
        matched=true;
        Section2 _section2 = identifiable_5.getSection2();
        String _resourceURL_3 = this.getResourceURL(_section2);
        _switchResult = _resourceURL_3;
      }
    }
    if (!matched) {
      Resource _eResource = identifiable.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".html");
      return _operator_plus;
    }
    return _switchResult;
  }
  
  public String getFullPHPURL(final Identifiable identifiable) {
    String _fullURL = this.getFullURL(identifiable);
    String _replace = _fullURL.replace(".html", ".php");
    return _replace;
  }
}
