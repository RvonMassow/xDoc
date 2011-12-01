package org.eclipse.xtext.xdoc.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.PartRef;
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
    EList<? extends AbstractSection> _xifexpression = null;
    EList<Chapter> _chapters = doc.getChapters();
    boolean _isEmpty = _chapters.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      EList<Chapter> _chapters_1 = doc.getChapters();
      _xifexpression = _chapters_1;
    } else {
      EList<Part> _parts = doc.getParts();
      _xifexpression = _parts;
    }
    return _xifexpression;
  }
  
  protected List<? extends AbstractSection> _sections(final Part part) {
    EList<Chapter> _chapters = part.getChapters();
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
  
  protected List<? extends AbstractSection> _sections(final PartRef part) {
    EList<Chapter> _chapters = part.getChapters();
    return _chapters;
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
    if (chapter instanceof ChapterRef) {
      return _sections((ChapterRef)chapter);
    } else if (chapter instanceof PartRef) {
      return _sections((PartRef)chapter);
    } else if (chapter instanceof Section2Ref) {
      return _sections((Section2Ref)chapter);
    } else if (chapter instanceof SectionRef) {
      return _sections((SectionRef)chapter);
    } else if (chapter instanceof Chapter) {
      return _sections((Chapter)chapter);
    } else if (chapter instanceof Document) {
      return _sections((Document)chapter);
    } else if (chapter instanceof Part) {
      return _sections((Part)chapter);
    } else if (chapter instanceof Section) {
      return _sections((Section)chapter);
    } else if (chapter instanceof Section2) {
      return _sections((Section2)chapter);
    } else if (chapter instanceof Section3) {
      return _sections((Section3)chapter);
    } else {
      return _sections(chapter);
    }
  }
}
