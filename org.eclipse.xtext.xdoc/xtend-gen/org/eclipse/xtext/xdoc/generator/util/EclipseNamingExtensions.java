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
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class EclipseNamingExtensions {
  
  public String urlSuffix(final AbstractSection aS) {
    String _xifexpression = null;
    EObject _eContainer = aS.eContainer();
    if ((_eContainer instanceof org.eclipse.xtext.xdoc.xdoc.XdocFile)) {
      _xifexpression = "";
    } else {
      String _labelName = this.labelName(aS);
      String _operator_plus = StringExtensions.operator_plus("#", _labelName);
      _xifexpression = _operator_plus;
    }
    return _xifexpression;
  }
  
  public String _labelName(final Object any) {
    return "";
  }
  
  public String _fileName(final EObject obj) {
    Resource _eResource = obj.eResource();
    URI _uRI = _eResource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".html");
    return _operator_plus;
  }
  
  public String _fileName(final ChapterRef obj) {
    Chapter _chapter = obj.getChapter();
    String _fileName = this.fileName(_chapter);
    return _fileName;
  }
  
  public String _fileName(final SectionRef obj) {
    Section _section = obj.getSection();
    String _fileName = this.fileName(_section);
    return _fileName;
  }
  
  public String _fileName(final Section2Ref obj) {
    Section2 _section2 = obj.getSection2();
    String _fileName = this.fileName(_section2);
    return _fileName;
  }
  
  public String _labelName(final AbstractSection aS) {
    String _xifexpression = null;
    String _name = aS.getName();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
    if (_operator_notEquals) {
      String _name_1 = aS.getName();
      _xifexpression = _name_1;
    } else {
      EObject _eContainer = aS.eContainer();
      String _labelName = this.labelName(_eContainer);
      String _operator_plus = StringExtensions.operator_plus(_labelName, "-");
      EObject _eContainer_1 = aS.eContainer();
      EList<EObject> _eContents = _eContainer_1.eContents();
      int _indexOf = _eContents.indexOf(aS);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)_indexOf));
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
  
  public String labelName(final Object aS) {
    if ((aS instanceof AbstractSection)) {
      return _labelName((AbstractSection)aS);
    } else if ((aS instanceof Object)) {
      return _labelName((Object)aS);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public String fileName(final EObject obj) {
    if ((obj instanceof ChapterRef)) {
      return _fileName((ChapterRef)obj);
    } else if ((obj instanceof Section2Ref)) {
      return _fileName((Section2Ref)obj);
    } else if ((obj instanceof SectionRef)) {
      return _fileName((SectionRef)obj);
    } else if ((obj instanceof EObject)) {
      return _fileName((EObject)obj);
    } else {
      throw new IllegalArgumentException();
    }
  }
}