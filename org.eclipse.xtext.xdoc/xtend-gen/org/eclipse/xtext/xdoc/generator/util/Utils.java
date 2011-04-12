package org.eclipse.xtext.xdoc.generator.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;

@SuppressWarnings("all")
public class Utils {
  
  public Iterable<Chapter> _subSection(final Document doc) {
    EList<Chapter> _chapters = doc.getChapters();
    return _chapters;
  }
  
  public Iterable<Section> _subSection(final Chapter section) {
    EList<Section> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<Section2> _subSection(final Section section) {
    EList<Section2> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<Section3> _subSection(final Section2 section) {
    EList<Section3> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<Section4> _subSection(final Section3 section) {
    EList<Section4> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<AbstractSection> _subSection(final AbstractSection section) {
    ArrayList<AbstractSection> _newArrayList = CollectionLiterals.<AbstractSection>newArrayList();
    return _newArrayList;
  }
  
  public String urlDecode(final String s) throws UnsupportedEncodingException {
    String _decode = URLDecoder.decode(s, "ISO-8859-1");
    return _decode;
  }
  
  public Boolean isInlineCode(final CodeBlock cb) {
    EList<EObject> _contents = cb.getContents();
    int _size = _contents.size();
    boolean _operator_equals = ObjectExtensions.operator_equals(((Object)_size), 1);
    EList<EObject> _contents_1 = cb.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents_1);
    String _string = _head.toString();
    boolean _contains = _string.contains("\n");
    boolean _operator_not = BooleanExtensions.operator_not(_contains);
    boolean _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_not);
    return ((Boolean)_operator_and);
  }
  
  public Object subSection(final AbstractSection section) {
    if ((section instanceof Chapter)) {
      return _subSection((Chapter)section);
    } else if ((section instanceof Document)) {
      return _subSection((Document)section);
    } else if ((section instanceof Section)) {
      return _subSection((Section)section);
    } else if ((section instanceof Section2)) {
      return _subSection((Section2)section);
    } else if ((section instanceof Section3)) {
      return _subSection((Section3)section);
    } else if ((section instanceof AbstractSection)) {
      return _subSection((AbstractSection)section);
    } else {
      throw new IllegalArgumentException();
    }
  }
}