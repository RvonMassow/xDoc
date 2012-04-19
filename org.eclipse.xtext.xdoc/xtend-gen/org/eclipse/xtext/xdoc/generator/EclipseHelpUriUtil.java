package org.eclipse.xtext.xdoc.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.PartRef;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;

@SuppressWarnings("all")
public class EclipseHelpUriUtil {
  @Inject
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  private Map<AbstractSection,AbstractSection> section2fileSection;
  
  private Document doc;
  
  public void initialize(final Document doc) {
    HashMap<AbstractSection,AbstractSection> _newHashMap = CollectionLiterals.<AbstractSection, AbstractSection>newHashMap();
    this.section2fileSection = _newHashMap;
    this.doc = doc;
    this.populateFileMap(doc);
  }
  
  public URI getAbsoluteTargetURI(final ImageRef img) {
    URI _xblockexpression = null;
    {
      final AbstractSection container = EcoreUtil2.<AbstractSection>getContainerOfType(img, AbstractSection.class);
      final AbstractSection fileSection = this.section2fileSection.get(container);
      URI _relativeTargetURI = this.getRelativeTargetURI(img);
      URI _targetURI = this.targetURI(fileSection);
      URI _resolve = _relativeTargetURI.resolve(_targetURI);
      _xblockexpression = (_resolve);
    }
    return _xblockexpression;
  }
  
  public URI getRelativeTargetURI(final ImageRef img) {
    URI _xblockexpression = null;
    {
      String _path = img.getPath();
      URI _createURI = URI.createURI(_path);
      Resource _eResource = img.eResource();
      URI _uRI = _eResource.getURI();
      final URI imageAbsoluteURI = _createURI.resolve(_uRI);
      Resource _eResource_1 = this.doc.eResource();
      URI _uRI_1 = _eResource_1.getURI();
      URI _deresolve = imageAbsoluteURI.deresolve(_uRI_1);
      _xblockexpression = (_deresolve);
    }
    return _xblockexpression;
  }
  
  public URI getTargetURI(final Ref it) {
    URI _xblockexpression = null;
    {
      Identifiable _ref = it.getRef();
      final AbstractSection container = EcoreUtil2.<AbstractSection>getContainerOfType(_ref, AbstractSection.class);
      final AbstractSection fileSection = this.section2fileSection.get(container);
      URI _xifexpression = null;
      boolean _equals = Objects.equal(fileSection, null);
      if (_equals) {
        URI _xblockexpression_1 = null;
        {
          Identifiable _ref_1 = it.getRef();
          String _name = _ref_1.getName();
          String _plus = ("error: Cannot resolve reference to " + _name);
          String _plus_1 = (_plus + " from ");
          Identifiable _ref_2 = it.getRef();
          Resource _eResource = _ref_2.eResource();
          URI _uRI = _eResource.getURI();
          String _plus_2 = (_plus_1 + _uRI);
          InputOutput.<String>println(_plus_2);
          _xblockexpression_1 = (((URI) null));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        URI _targetURI = this.targetURI(fileSection);
        Identifiable _ref_1 = it.getRef();
        String _localId = this.eclipseNamingExtensions.getLocalId(_ref_1);
        URI _appendFragment = _targetURI.appendFragment(_localId);
        URI _targetURI_1 = this.targetURI(this.doc);
        URI _deresolve = _appendFragment.deresolve(_targetURI_1);
        _xifexpression = _deresolve;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public URI getTargetURI(final AbstractSection it) {
    URI _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof PartRef) {
        final PartRef _partRef = (PartRef)it;
        _matched=true;
        Part _part = _partRef.getPart();
        URI _targetURI = this.getTargetURI(_part);
        _switchResult = _targetURI;
      }
    }
    if (!_matched) {
      if (it instanceof ChapterRef) {
        final ChapterRef _chapterRef = (ChapterRef)it;
        _matched=true;
        Chapter _chapter = _chapterRef.getChapter();
        URI _targetURI = this.getTargetURI(_chapter);
        _switchResult = _targetURI;
      }
    }
    if (!_matched) {
      if (it instanceof SectionRef) {
        final SectionRef _sectionRef = (SectionRef)it;
        _matched=true;
        Section _section = _sectionRef.getSection();
        URI _targetURI = this.getTargetURI(_section);
        _switchResult = _targetURI;
      }
    }
    if (!_matched) {
      if (it instanceof Section2Ref) {
        final Section2Ref _section2Ref = (Section2Ref)it;
        _matched=true;
        Section2 _section2 = _section2Ref.getSection2();
        URI _targetURI = this.getTargetURI(_section2);
        _switchResult = _targetURI;
      }
    }
    if (!_matched) {
      URI _xblockexpression = null;
      {
        final AbstractSection container = EcoreUtil2.<AbstractSection>getContainerOfType(it, AbstractSection.class);
        final AbstractSection fileSection = this.section2fileSection.get(container);
        URI _targetURI = this.targetURI(fileSection);
        String _localId = this.eclipseNamingExtensions.getLocalId(it);
        URI _appendFragment = _targetURI.appendFragment(_localId);
        URI _targetURI_1 = this.targetURI(this.doc);
        URI _deresolve = _appendFragment.deresolve(_targetURI_1);
        _xblockexpression = (_deresolve);
      }
      _switchResult = _xblockexpression;
    }
    return _switchResult;
  }
  
  protected void _populateFileMap(final Document it) {
    this.section2fileSection.put(it, it);
    EList<Chapter> _chapters = it.getChapters();
    final Procedure1<Chapter> _function = new Procedure1<Chapter>() {
        public void apply(final Chapter it) {
          EclipseHelpUriUtil.this.populateFileMap(it);
        }
      };
    IterableExtensions.<Chapter>forEach(_chapters, _function);
    EList<Part> _parts = it.getParts();
    final Procedure1<Part> _function_1 = new Procedure1<Part>() {
        public void apply(final Part it) {
          EclipseHelpUriUtil.this.populateFileMap(it);
        }
      };
    IterableExtensions.<Part>forEach(_parts, _function_1);
  }
  
  protected void _populateFileMap(final Chapter it) {
    this.section2fileSection.put(it, it);
    EList<Section> _subSections = it.getSubSections();
    final Procedure1<Section> _function = new Procedure1<Section>() {
        public void apply(final Section section) {
          EclipseHelpUriUtil.this.populateFileMap(section, it);
        }
      };
    IterableExtensions.<Section>forEach(_subSections, _function);
  }
  
  protected void _populateFileMap(final ChapterRef it) {
    Chapter _chapter = it.getChapter();
    this.populateFileMap(_chapter);
  }
  
  protected void _populateFileMap(final Part it) {
    this.section2fileSection.put(it, it);
    EList<Chapter> _chapters = it.getChapters();
    final Procedure1<Chapter> _function = new Procedure1<Chapter>() {
        public void apply(final Chapter chapter) {
          EclipseHelpUriUtil.this.populateFileMap(chapter);
        }
      };
    IterableExtensions.<Chapter>forEach(_chapters, _function);
  }
  
  protected void _populateFileMap(final PartRef it) {
    Part _part = it.getPart();
    this.populateFileMap(_part);
  }
  
  protected void _populateFileMap(final AbstractSection it, final AbstractSection fileSection) {
    this.section2fileSection.put(it, fileSection);
    EList<EObject> _eContents = it.eContents();
    Iterable<AbstractSection> _filter = Iterables.<AbstractSection>filter(_eContents, AbstractSection.class);
    final Procedure1<AbstractSection> _function = new Procedure1<AbstractSection>() {
        public void apply(final AbstractSection section) {
          EclipseHelpUriUtil.this.populateFileMap(section, fileSection);
        }
      };
    IterableExtensions.<AbstractSection>forEach(_filter, _function);
  }
  
  protected void _populateFileMap(final Section2Ref it, final AbstractSection fileSection) {
    Section2 _section2 = it.getSection2();
    this.populateFileMap(_section2, fileSection);
  }
  
  protected void _populateFileMap(final SectionRef it, final AbstractSection fileSection) {
    Section _section = it.getSection();
    this.populateFileMap(_section, fileSection);
  }
  
  private URI targetURI(final Identifiable it) {
    URI _xblockexpression = null;
    {
      Resource _eResource = it.eResource();
      final URI resourceURI = _eResource.getURI();
      String _fullURL = this.eclipseNamingExtensions.getFullURL(it);
      final URI fullURL = URI.createURI(_fullURL);
      int _segmentCount = resourceURI.segmentCount();
      int _minus = (_segmentCount - 2);
      URI _trimSegments = resourceURI.trimSegments(_minus);
      URI _appendSegment = _trimSegments.appendSegment("contents");
      String[] _segments = fullURL.segments();
      URI _appendSegments = _appendSegment.appendSegments(_segments);
      _xblockexpression = (_appendSegments);
    }
    return _xblockexpression;
  }
  
  public void populateFileMap(final AbstractSection it) {
    if (it instanceof ChapterRef) {
      _populateFileMap((ChapterRef)it);
      return;
    } else if (it instanceof PartRef) {
      _populateFileMap((PartRef)it);
      return;
    } else if (it instanceof Chapter) {
      _populateFileMap((Chapter)it);
      return;
    } else if (it instanceof Document) {
      _populateFileMap((Document)it);
      return;
    } else if (it instanceof Part) {
      _populateFileMap((Part)it);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public void populateFileMap(final AbstractSection it, final AbstractSection fileSection) {
    if (it instanceof Section2Ref) {
      _populateFileMap((Section2Ref)it, fileSection);
      return;
    } else if (it instanceof SectionRef) {
      _populateFileMap((SectionRef)it, fileSection);
      return;
    } else if (it != null) {
      _populateFileMap(it, fileSection);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, fileSection).toString());
    }
  }
}
