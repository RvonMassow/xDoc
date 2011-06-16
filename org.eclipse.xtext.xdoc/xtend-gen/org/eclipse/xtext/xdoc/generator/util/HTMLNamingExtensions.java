package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class HTMLNamingExtensions extends EclipseNamingExtensions {
  
  @Inject
  private PlainText plainText;
  
  @Inject
  private Utils utils;
  
  @Inject
  private AbstractSectionExtension ase;
  
  protected void _computeURLs(final Document document, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      String name = "index.html";
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      typeConverted_result.put(document, name);
      List<? extends AbstractSection> _sections = this.ase.sections(document);
      final List<? extends AbstractSection> sections = _sections;
      int _size = sections.size();
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
      Iterable<Integer> _operator_upTo = IntegerExtensions.operator_upTo(((Integer)0), ((Integer)_operator_minus));
      for (Integer i : _operator_upTo) {
        final List<? extends AbstractSection> typeConverted_sections = (List<? extends AbstractSection>)sections;
        AbstractSection _get = typeConverted_sections.get(i);
        this.computeURLs(_get, fileName, "", i, result);
      }
    }
  }
  
  protected void _computeURLs(final Section section, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Resource _eResource = section.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      String name = _lastSegment;
      int _operator_minus = IntegerExtensions.operator_minus(1);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)index), ((Integer)_operator_minus));
      if (_operator_notEquals) {
        String _operator_plus = StringExtensions.operator_plus(name, "-");
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)index));
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".html");
        name = _operator_plus_2;
      } else {
        String _operator_plus_3 = StringExtensions.operator_plus(name, ".html");
        name = _operator_plus_3;
      }
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      typeConverted_result.put(section, name);
      List<? extends AbstractSection> _sections = this.ase.sections(section);
      final List<? extends AbstractSection> sections = _sections;
      int _size = sections.size();
      int _operator_minus_1 = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
      Iterable<Integer> _operator_upTo = IntegerExtensions.operator_upTo(((Integer)0), ((Integer)_operator_minus_1));
      for (Integer i : _operator_upTo) {
        final List<? extends AbstractSection> typeConverted_sections = (List<? extends AbstractSection>)sections;
        AbstractSection _get = typeConverted_sections.get(i);
        this.computeURLs(_get, name, "", i, result);
      }
    }
  }
  
  public void computeURLs(final AbstractSection chapterRef, final String fileName, final String prefix, final Integer index, final Map<AbstractSection,String> result) {
    if ((chapterRef instanceof ChapterRef)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((ChapterRef)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof Section2Ref)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((Section2Ref)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof SectionRef)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((SectionRef)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof Chapter)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((Chapter)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof Document)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((Document)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof Section)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((Section)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else if ((chapterRef instanceof AbstractSection)
         && (fileName instanceof String)
         && (prefix instanceof String)
         && (index instanceof Integer)
         && (result instanceof Map)) {
      _computeURLs((AbstractSection)chapterRef, (String)fileName, (String)prefix, (Integer)index, (Map<AbstractSection,String>)result);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapterRef, fileName, prefix, index, result).toString());
    }
  }
}