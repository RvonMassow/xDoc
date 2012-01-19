package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
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
  public String getLocalId(final Identifiable identifiable) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (identifiable instanceof ChapterRef) {
        final ChapterRef _chapterRef = (ChapterRef)identifiable;
        matched=true;
        Chapter _chapter = _chapterRef.getChapter();
        String _localId = this.getLocalId(_chapter);
        _switchResult = _localId;
      }
    }
    if (!matched) {
      if (identifiable instanceof SectionRef) {
        final SectionRef _sectionRef = (SectionRef)identifiable;
        matched=true;
        Section _section = _sectionRef.getSection();
        String _localId = this.getLocalId(_section);
        _switchResult = _localId;
      }
    }
    if (!matched) {
      if (identifiable instanceof Section2Ref) {
        final Section2Ref _section2Ref = (Section2Ref)identifiable;
        matched=true;
        Section2 _section2 = _section2Ref.getSection2();
        String _localId = this.getLocalId(_section2);
        _switchResult = _localId;
      }
    }
    if (!matched) {
      {
        String _name = identifiable.getName();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
        if (_operator_notEquals) {
          String _name_1 = identifiable.getName();
          String _encodeFragment = URI.encodeFragment(_name_1, false);
          return _encodeFragment;
        }
        EObject _eContainer = identifiable.eContainer();
        final AbstractSection parent = ((AbstractSection) _eContainer);
        boolean _operator_equals = ObjectExtensions.operator_equals(parent, null);
        if (_operator_equals) {
          return "0";
        } else {
          String _localId = this.getLocalId(parent);
          String _operator_plus = StringExtensions.operator_plus(_localId, "_");
          EList<EObject> _eContents = parent.eContents();
          int _indexOf = _eContents.indexOf(identifiable);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, Integer.valueOf(_indexOf));
          return _operator_plus_1;
        }
      }
    }
    return _switchResult;
  }
  
  public String getFullURL(final Identifiable identifiable) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (identifiable instanceof PartRef) {
        final PartRef _partRef = (PartRef)identifiable;
        matched=true;
        Part _part = _partRef.getPart();
        String _fullURL = this.getFullURL(_part);
        _switchResult = _fullURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof ChapterRef) {
        final ChapterRef _chapterRef = (ChapterRef)identifiable;
        matched=true;
        Chapter _chapter = _chapterRef.getChapter();
        String _fullURL = this.getFullURL(_chapter);
        _switchResult = _fullURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof SectionRef) {
        final SectionRef _sectionRef = (SectionRef)identifiable;
        matched=true;
        Section _section = _sectionRef.getSection();
        String _fullURL = this.getFullURL(_section);
        _switchResult = _fullURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof Section2Ref) {
        final Section2Ref _section2Ref = (Section2Ref)identifiable;
        matched=true;
        Section2 _section2 = _section2Ref.getSection2();
        String _fullURL = this.getFullURL(_section2);
        _switchResult = _fullURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof Chapter) {
        final Chapter _chapter = (Chapter)identifiable;
        matched=true;
        Resource _eResource = _chapter.eResource();
        URI _uRI = _eResource.getURI();
        URI _trimFileExtension = _uRI.trimFileExtension();
        String _lastSegment = _trimFileExtension.lastSegment();
        String _xifexpression = null;
        EObject _eContainer = _chapter.eContainer();
        if ((_eContainer instanceof Part)) {
          String _xifexpression_1 = null;
          EObject _eContainer_1 = _chapter.eContainer();
          EObject _eContainer_2 = _eContainer_1.eContainer();
          if ((_eContainer_2 instanceof Document)) {
            EObject _eContainer_3 = _chapter.eContainer();
            EObject _eContainer_4 = _eContainer_3.eContainer();
            EList<EObject> _eContents = _eContainer_4.eContents();
            EObject _eContainer_5 = _chapter.eContainer();
            int _indexOf = _eContents.indexOf(_eContainer_5);
            String _operator_plus = StringExtensions.operator_plus("_", Integer.valueOf(_indexOf));
            _xifexpression_1 = _operator_plus;
          } else {
            _xifexpression_1 = "";
          }
          String _operator_plus_1 = StringExtensions.operator_plus(_xifexpression_1, "_");
          EObject _eContainer_6 = _chapter.eContainer();
          EList<EObject> _eContents_1 = _eContainer_6.eContents();
          int _indexOf_1 = _eContents_1.indexOf(_chapter);
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, Integer.valueOf(_indexOf_1));
          _xifexpression = _operator_plus_2;
        } else {
          String _xifexpression_2 = null;
          EObject _eContainer_7 = _chapter.eContainer();
          if ((_eContainer_7 instanceof Document)) {
            EObject _eContainer_8 = _chapter.eContainer();
            EList<EObject> _eContents_2 = _eContainer_8.eContents();
            int _indexOf_2 = _eContents_2.indexOf(_chapter);
            String _operator_plus_3 = StringExtensions.operator_plus("_", Integer.valueOf(_indexOf_2));
            _xifexpression_2 = _operator_plus_3;
          } else {
            _xifexpression_2 = "";
          }
          _xifexpression = _xifexpression_2;
        }
        String _operator_plus_4 = StringExtensions.operator_plus(_lastSegment, _xifexpression);
        String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, ".html");
        _switchResult = _operator_plus_5;
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
      if (identifiable instanceof Part) {
        final Part _part = (Part)identifiable;
        matched=true;
        Resource _eResource = _part.eResource();
        URI _uRI = _eResource.getURI();
        URI _trimFileExtension = _uRI.trimFileExtension();
        String _lastSegment = _trimFileExtension.lastSegment();
        String _operator_plus = StringExtensions.operator_plus(_lastSegment, "_");
        EObject _eContainer_1 = _part.eContainer();
        EList<EObject> _eContents = _eContainer_1.eContents();
        int _indexOf = _eContents.indexOf(_part);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, Integer.valueOf(_indexOf));
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".html");
        _switchResult = _operator_plus_2;
      }
    }
    if (!matched) {
      String _resourceURL_1 = this.getResourceURL(identifiable);
      String _operator_plus = StringExtensions.operator_plus(_resourceURL_1, "#");
      String _localId = this.getLocalId(identifiable);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _localId);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".html");
      _switchResult = _operator_plus_2;
    }
    return _switchResult;
  }
  
  public String getResourceURL(final Identifiable identifiable) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (identifiable instanceof PartRef) {
        final PartRef _partRef = (PartRef)identifiable;
        matched=true;
        Part _part = _partRef.getPart();
        String _resourceURL = this.getResourceURL(_part);
        _switchResult = _resourceURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof ChapterRef) {
        final ChapterRef _chapterRef = (ChapterRef)identifiable;
        matched=true;
        Chapter _chapter = _chapterRef.getChapter();
        String _resourceURL = this.getResourceURL(_chapter);
        _switchResult = _resourceURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof SectionRef) {
        final SectionRef _sectionRef = (SectionRef)identifiable;
        matched=true;
        Section _section = _sectionRef.getSection();
        String _resourceURL = this.getResourceURL(_section);
        _switchResult = _resourceURL;
      }
    }
    if (!matched) {
      if (identifiable instanceof Section2Ref) {
        final Section2Ref _section2Ref = (Section2Ref)identifiable;
        matched=true;
        Section2 _section2 = _section2Ref.getSection2();
        String _resourceURL = this.getResourceURL(_section2);
        _switchResult = _resourceURL;
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
