package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
    boolean _matched = false;
    if (!_matched) {
      if (identifiable instanceof ChapterRef) {
        _matched=true;
        Chapter _chapter = ((ChapterRef)identifiable).getChapter();
        _switchResult = this.getLocalId(_chapter);
      }
    }
    if (!_matched) {
      if (identifiable instanceof SectionRef) {
        _matched=true;
        Section _section = ((SectionRef)identifiable).getSection();
        _switchResult = this.getLocalId(_section);
      }
    }
    if (!_matched) {
      if (identifiable instanceof Section2Ref) {
        _matched=true;
        Section2 _section2 = ((Section2Ref)identifiable).getSection2();
        _switchResult = this.getLocalId(_section2);
      }
    }
    if (!_matched) {
      {
        String _name = identifiable.getName();
        boolean _notEquals = (!Objects.equal(_name, null));
        if (_notEquals) {
          String _name_1 = identifiable.getName();
          return URI.encodeFragment(_name_1, false);
        }
        EObject _eContainer = identifiable.eContainer();
        final AbstractSection parent = ((AbstractSection) _eContainer);
        boolean _equals = Objects.equal(parent, null);
        if (_equals) {
          return "0";
        } else {
          String _localId = this.getLocalId(parent);
          String _plus = (_localId + "_");
          EList<EObject> _eContents = parent.eContents();
          int _indexOf = _eContents.indexOf(identifiable);
          return (_plus + Integer.valueOf(_indexOf));
        }
      }
    }
    return _switchResult;
  }
  
  public String getFullURL(final Identifiable identifiable) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (identifiable instanceof PartRef) {
        _matched=true;
        Part _part = ((PartRef)identifiable).getPart();
        _switchResult = this.getFullURL(_part);
      }
    }
    if (!_matched) {
      if (identifiable instanceof ChapterRef) {
        _matched=true;
        Chapter _chapter = ((ChapterRef)identifiable).getChapter();
        _switchResult = this.getFullURL(_chapter);
      }
    }
    if (!_matched) {
      if (identifiable instanceof SectionRef) {
        _matched=true;
        Section _section = ((SectionRef)identifiable).getSection();
        _switchResult = this.getFullURL(_section);
      }
    }
    if (!_matched) {
      if (identifiable instanceof Section2Ref) {
        _matched=true;
        Section2 _section2 = ((Section2Ref)identifiable).getSection2();
        _switchResult = this.getFullURL(_section2);
      }
    }
    if (!_matched) {
      if (identifiable instanceof Chapter) {
        _matched=true;
        Resource _eResource = ((Chapter)identifiable).eResource();
        URI _uRI = _eResource.getURI();
        URI _trimFileExtension = _uRI.trimFileExtension();
        String _lastSegment = _trimFileExtension.lastSegment();
        String _xifexpression = null;
        EObject _eContainer = ((Chapter)identifiable).eContainer();
        if ((_eContainer instanceof Part)) {
          String _xifexpression_1 = null;
          EObject _eContainer_1 = ((Chapter)identifiable).eContainer();
          EObject _eContainer_2 = _eContainer_1.eContainer();
          if ((_eContainer_2 instanceof Document)) {
            EObject _eContainer_3 = ((Chapter)identifiable).eContainer();
            EObject _eContainer_4 = _eContainer_3.eContainer();
            EList<EObject> _eContents = _eContainer_4.eContents();
            EObject _eContainer_5 = ((Chapter)identifiable).eContainer();
            int _indexOf = _eContents.indexOf(_eContainer_5);
            _xifexpression_1 = ("_" + Integer.valueOf(_indexOf));
          } else {
            _xifexpression_1 = "";
          }
          String _plus = (_xifexpression_1 + "_");
          EObject _eContainer_6 = ((Chapter)identifiable).eContainer();
          EList<EObject> _eContents_1 = _eContainer_6.eContents();
          int _indexOf_1 = _eContents_1.indexOf(identifiable);
          _xifexpression = (_plus + Integer.valueOf(_indexOf_1));
        } else {
          String _xifexpression_2 = null;
          EObject _eContainer_7 = ((Chapter)identifiable).eContainer();
          if ((_eContainer_7 instanceof Document)) {
            EObject _eContainer_8 = ((Chapter)identifiable).eContainer();
            EList<EObject> _eContents_2 = _eContainer_8.eContents();
            int _indexOf_2 = _eContents_2.indexOf(identifiable);
            _xifexpression_2 = ("_" + Integer.valueOf(_indexOf_2));
          } else {
            _xifexpression_2 = "";
          }
          _xifexpression = _xifexpression_2;
        }
        String _plus_1 = (_lastSegment + _xifexpression);
        _switchResult = (_plus_1 + ".html");
      }
    }
    if (!_matched) {
      EObject _eContainer = identifiable.eContainer();
      if ((_eContainer instanceof XdocFile)) {
        _matched=true;
        _switchResult = this.getResourceURL(identifiable);
      }
    }
    if (!_matched) {
      if (identifiable instanceof Part) {
        _matched=true;
        Resource _eResource = ((Part)identifiable).eResource();
        URI _uRI = _eResource.getURI();
        URI _trimFileExtension = _uRI.trimFileExtension();
        String _lastSegment = _trimFileExtension.lastSegment();
        String _plus = (_lastSegment + "_");
        EObject _eContainer_1 = ((Part)identifiable).eContainer();
        EList<EObject> _eContents = _eContainer_1.eContents();
        int _indexOf = _eContents.indexOf(identifiable);
        String _plus_1 = (_plus + Integer.valueOf(_indexOf));
        _switchResult = (_plus_1 + ".html");
      }
    }
    if (!_matched) {
      String _resourceURL = this.getResourceURL(identifiable);
      String _plus = (_resourceURL + "#");
      String _localId = this.getLocalId(identifiable);
      String _plus_1 = (_plus + _localId);
      _switchResult = (_plus_1 + ".html");
    }
    return _switchResult;
  }
  
  public String getResourceURL(final Identifiable identifiable) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (identifiable instanceof PartRef) {
        _matched=true;
        Part _part = ((PartRef)identifiable).getPart();
        _switchResult = this.getResourceURL(_part);
      }
    }
    if (!_matched) {
      if (identifiable instanceof ChapterRef) {
        _matched=true;
        Chapter _chapter = ((ChapterRef)identifiable).getChapter();
        _switchResult = this.getResourceURL(_chapter);
      }
    }
    if (!_matched) {
      if (identifiable instanceof SectionRef) {
        _matched=true;
        Section _section = ((SectionRef)identifiable).getSection();
        _switchResult = this.getResourceURL(_section);
      }
    }
    if (!_matched) {
      if (identifiable instanceof Section2Ref) {
        _matched=true;
        Section2 _section2 = ((Section2Ref)identifiable).getSection2();
        _switchResult = this.getResourceURL(_section2);
      }
    }
    if (!_matched) {
      Resource _eResource = identifiable.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      return (_lastSegment + ".html");
    }
    return _switchResult;
  }
  
  public String getFullPHPURL(final Identifiable identifiable) {
    String _fullURL = this.getFullURL(identifiable);
    return _fullURL.replace(".html", ".php");
  }
}
