package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class EclipseNamingExtensions {
  
  @Inject
  private AbstractSectionExtension sectionExtension;
  
  public String labelName(final AbstractSection section, final Map<AbstractSection,String> fileNames) {
    String _xblockexpression = null;
    {
      String _get = fileNames.get(section);
      final String fileName = _get;
      boolean _operator_equals = ObjectExtensions.operator_equals(fileName, null);
      if (_operator_equals) {
        return null;
      }
      URI _createURI = URI.createURI(fileName);
      String _fragment = _createURI.fragment();
      final String result = _fragment;
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public Map<AbstractSection,String> computeURLs(final Document document) {
    Map<AbstractSection,String> _xblockexpression = null;
    {
      HashMap<AbstractSection,String> _newHashMap = CollectionLiterals.<AbstractSection, String>newHashMap();
      final Map<AbstractSection,String> result = _newHashMap;
      int _operator_minus = IntegerExtensions.operator_minus(1);
      this.computeURLs(document, "", "", ((Integer)_operator_minus), result);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  protected void _computeURLs(final Document document, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Resource _eResource = document.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".html");
      String name = _operator_plus;
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      typeConverted_result.put(document, name);
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(document);
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
  
  protected void _computeURLs(final Chapter chapter, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Resource _eResource = chapter.eResource();
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
      typeConverted_result.put(chapter, name);
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(chapter);
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
  
  protected void _computeURLs(final ChapterRef chapterRef, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Chapter _chapter = chapterRef.getChapter();
      int _operator_minus = IntegerExtensions.operator_minus(1);
      this.computeURLs(_chapter, fileName, prefix, ((Integer)_operator_minus), result);
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      Chapter _chapter_1 = chapterRef.getChapter();
      String _get = result.get(_chapter_1);
      typeConverted_result.put(chapterRef, _get);
    }
  }
  
  protected void _computeURLs(final SectionRef sectionRef, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Section _section = sectionRef.getSection();
      this.computeURLs(_section, fileName, prefix, ((Integer)index), result);
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      Section _section_1 = sectionRef.getSection();
      String _get = result.get(_section_1);
      typeConverted_result.put(sectionRef, _get);
    }
  }
  
  protected void _computeURLs(final Section2Ref sectionRef, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      Section2 _section2 = sectionRef.getSection2();
      this.computeURLs(_section2, fileName, prefix, ((Integer)index), result);
      final Map<AbstractSection,String> typeConverted_result = (Map<AbstractSection,String>)result;
      Section2 _section2_1 = sectionRef.getSection2();
      String _get = result.get(_section2_1);
      typeConverted_result.put(sectionRef, _get);
    }
  }
  
  protected void _computeURLs(final AbstractSection section, final String fileName, final String prefix, final int index, final Map<AbstractSection,String> result) {
    {
      String _operator_plus = StringExtensions.operator_plus(fileName, "#");
      Comparable<? extends Object> _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(prefix);
      if (_isNullOrEmpty) {
        _xifexpression = index;
      } else {
        String _operator_plus_1 = StringExtensions.operator_plus(prefix, "-");
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ((Integer)index));
        _xifexpression = _operator_plus_2;
      }
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus, _xifexpression);
      result.put(section, _operator_plus_3);
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(prefix);
      if (_isNullOrEmpty_1) {
        String _string = ((Integer)index).toString();
        _xifexpression_1 = _string;
      } else {
        String _operator_plus_4 = StringExtensions.operator_plus(prefix, "-");
        String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, ((Integer)index));
        _xifexpression_1 = _operator_plus_5;
      }
      final String newPrefix = _xifexpression_1;
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      final List<? extends AbstractSection> subSections = _sections;
      int _size = subSections.size();
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
      Iterable<Integer> _operator_upTo = IntegerExtensions.operator_upTo(((Integer)0), ((Integer)_operator_minus));
      for (Integer i : _operator_upTo) {
        final List<? extends AbstractSection> typeConverted_subSections = (List<? extends AbstractSection>)subSections;
        AbstractSection _get = typeConverted_subSections.get(i);
        this.computeURLs(_get, fileName, newPrefix, i, result);
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