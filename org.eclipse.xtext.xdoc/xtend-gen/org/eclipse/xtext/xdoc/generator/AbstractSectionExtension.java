package org.eclipse.xtext.xdoc.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class AbstractSectionExtension {
  
  protected List<? extends AbstractSection> _sections(final AbstractSection section) {
    List<AbstractSection> _emptyList = CollectionLiterals.<AbstractSection>emptyList();
    return _emptyList;
  }
  
  protected List<? extends AbstractSection> _sections(final Document doc) {
    EList<Chapter> _chapters = doc.getChapters();
    return _chapters;
  }
  
  protected List<? extends AbstractSection> _sections(final Chapter chapter) {
    EList<Section> _subSections = chapter.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final Section section) {
    EList<Section2> _subSections = section.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final Section2 section) {
    EList<Section3> _subSections = section.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final ChapterRef chapter) {
    Chapter _chapter = chapter.getChapter();
    EList<Section> _subSections = _chapter.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final SectionRef section) {
    Section _section = section.getSection();
    EList<Section2> _subSections = _section.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final Section2Ref section) {
    Section2 _section2 = section.getSection2();
    EList<Section3> _subSections = _section2.getSubSections();
    return _subSections;
  }
  
  protected List<? extends AbstractSection> _sections(final Section3 section) {
    EList<Section4> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public List<? extends AbstractSection> sections(final AbstractSection chapter) {
    if ((chapter instanceof ChapterRef)) {
      return _sections((ChapterRef)chapter);
    } else if ((chapter instanceof Section2Ref)) {
      return _sections((Section2Ref)chapter);
    } else if ((chapter instanceof SectionRef)) {
      return _sections((SectionRef)chapter);
    } else if ((chapter instanceof Chapter)) {
      return _sections((Chapter)chapter);
    } else if ((chapter instanceof Document)) {
      return _sections((Document)chapter);
    } else if ((chapter instanceof Section)) {
      return _sections((Section)chapter);
    } else if ((chapter instanceof Section2)) {
      return _sections((Section2)chapter);
    } else if ((chapter instanceof Section3)) {
      return _sections((Section3)chapter);
    } else if ((chapter instanceof AbstractSection)) {
      return _sections((AbstractSection)chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapter).toString());
    }
  }
}