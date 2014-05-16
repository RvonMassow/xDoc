package org.eclipse.xtext.xdoc.generator;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class AbstractSectionExtension {
  protected List<? extends AbstractSection> _sections(final AbstractSection section) {
    return CollectionLiterals.<AbstractSection>emptyList();
  }
  
  protected List<? extends AbstractSection> _sections(final Document doc) {
    EList<? extends AbstractSection> _xifexpression = null;
    EList<Chapter> _chapters = doc.getChapters();
    boolean _isEmpty = _chapters.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      _xifexpression = doc.getChapters();
    } else {
      _xifexpression = doc.getParts();
    }
    return _xifexpression;
  }
  
  protected List<? extends AbstractSection> _sections(final Part part) {
    return part.getChapters();
  }
  
  protected List<? extends AbstractSection> _sections(final Chapter chapter) {
    return chapter.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final Section section) {
    return section.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final Section2 section) {
    return section.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final PartRef part) {
    return part.getChapters();
  }
  
  protected List<? extends AbstractSection> _sections(final ChapterRef chapter) {
    Chapter _chapter = chapter.getChapter();
    return _chapter.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final SectionRef section) {
    Section _section = section.getSection();
    return _section.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final Section2Ref section) {
    Section2 _section2 = section.getSection2();
    return _section2.getSubSections();
  }
  
  protected List<? extends AbstractSection> _sections(final Section3 section) {
    return section.getSubSections();
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
    } else if (chapter != null) {
      return _sections(chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chapter).toString());
    }
  }
}
