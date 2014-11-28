package org.eclipse.xtext.xdoc.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.EclipseHelpUriUtil;
import org.eclipse.xtext.xdoc.generator.Outlets;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.TocGenerator;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.GitExtensions;
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Anchor;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Item;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode;
import org.eclipse.xtext.xdoc.xdoc.OrderedList;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableData;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.Todo;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

@SuppressWarnings("all")
public class StatefulEclipseHelpGenerator {
  @Inject
  @Extension
  private JavaDocExtension jdoc;
  
  @Inject
  @Extension
  private GitExtensions git;
  
  @Inject
  @Extension
  private Utils utils;
  
  @Inject
  @Extension
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  @Extension
  private TocGenerator tocGenerator;
  
  @Inject
  @Extension
  private PlainText plainText;
  
  @Inject
  @Extension
  private AbstractSectionExtension sectionExtension;
  
  @Inject
  private EclipseHelpUriUtil uriUtil;
  
  private Resource res;
  
  private IFileSystemAccessExtension2 accessExtension2;
  
  private IFileSystemAccess access;
  
  public void doGenerate(final Resource res, final IFileSystemAccessExtension2 accessExtension2) {
    this.res = res;
    this.accessExtension2 = accessExtension2;
    this.access = ((IFileSystemAccess) accessExtension2);
    EList<EObject> _contents = res.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    if ((_head instanceof XdocFile)) {
      EList<EObject> _contents_1 = res.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
      AbstractSection _mainSection = null;
      if (((XdocFile) _head_1)!=null) {
        _mainSection=((XdocFile) _head_1).getMainSection();
      }
      final AbstractSection doc = _mainSection;
      if ((doc instanceof Document)) {
        this.uriUtil.initialize(((Document) doc));
        this.generateDoc(((Document) doc), this.access);
      }
    }
  }
  
  public void generateDoc(final Document document, final IFileSystemAccess access) {
    CharSequence _generateToc = this.tocGenerator.generateToc(document, this.uriUtil);
    access.generateFile("toc.xml", _generateToc);
    String _fullURL = this.eclipseNamingExtensions.getFullURL(document);
    String _decode = URLDecoder.decode(_fullURL);
    CharSequence _generateRootDocument = this.generateRootDocument(document);
    access.generateFile(_decode, _generateRootDocument);
    Resource _eResource = document.eResource();
    URI _uRI = _eResource.getURI();
    String _lastSegment = _uRI.lastSegment();
    final String homeFileName = _lastSegment.replaceAll(".xdoc$", ".html");
    EList<Chapter> _chapters = document.getChapters();
    for (final Chapter c : _chapters) {
      this.generate(c, access, homeFileName);
    }
    EList<Part> _parts = document.getParts();
    for (final Part p : _parts) {
      this.generate(p, access, homeFileName);
    }
  }
  
  public void copy(final String fromRelativeFileName, final Resource res) {
    try {
      final ByteBuffer buffer = ByteBuffer.allocateDirect((16 * 1024));
      final URI uri = res.getURI();
      boolean _isPlatformResource = uri.isPlatformResource();
      if (_isPlatformResource) {
        URI _trimSegments = uri.trimSegments(1);
        String _string = _trimSegments.toString();
        String _plus = (_string + "/");
        String _plus_1 = (_plus + fromRelativeFileName);
        final URI inPath = URI.createURI(_plus_1);
        final URI outPath = this.accessExtension2.getURI(fromRelativeFileName, Outlets.ECLIPSE_HELP);
        ResourceSet _resourceSet = res.getResourceSet();
        URIConverter _uRIConverter = _resourceSet.getURIConverter();
        InputStream _createInputStream = _uRIConverter.createInputStream(inPath);
        final ReadableByteChannel inChannel = Channels.newChannel(_createInputStream);
        ResourceSet _resourceSet_1 = res.getResourceSet();
        URIConverter _uRIConverter_1 = _resourceSet_1.getURIConverter();
        OutputStream _createOutputStream = _uRIConverter_1.createOutputStream(outPath);
        final WritableByteChannel outChannel = Channels.newChannel(_createOutputStream);
        while ((inChannel.read(buffer) != (-1))) {
          {
            buffer.flip();
            outChannel.write(buffer);
            buffer.compact();
          }
        }
        buffer.flip();
        while (buffer.hasRemaining()) {
          outChannel.write(buffer);
        }
        outChannel.close();
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public CharSequence generateRootDocument(final Document document) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" >");
    _builder.newLine();
    _builder.append("<title>");
    TextOrMarkup _title = document.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link rel=\"home\" href=\"");
    String _fullURL = this.eclipseNamingExtensions.getFullURL(document);
    _builder.append(_fullURL, "");
    _builder.append("\" title=\"\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<h1>");
    TextOrMarkup _title_1 = document.getTitle();
    CharSequence _genPlainText_1 = this.plainText.genPlainText(_title_1);
    _builder.append(_genPlainText_1, "");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = document.getContents();
      for(final TextOrMarkup content : _contents) {
        CharSequence _generatePar = this.generatePar(content);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(document);
      boolean _hasElements = false;
      for(final AbstractSection ss : _sections) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ol>", "");
        }
        CharSequence _generateEntryInRoot = this.generateEntryInRoot(ss);
        _builder.append(_generateEntryInRoot, "");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("</ol>", "");
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEntryInRoot(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    URI _targetURI = this.uriUtil.getTargetURI(section);
    _builder.append(_targetURI, "");
    _builder.append("\">");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      boolean _hasElements = false;
      for(final AbstractSection ss : _sections) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ol>", "\t");
        }
        _builder.append("\t");
        CharSequence _generateEntryInRoot = this.generateEntryInRoot(ss);
        _builder.append(_generateEntryInRoot, "\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("</ol>", "\t");
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  protected void _generate(final Chapter chapter, final IFileSystemAccess access, final String homeFileName) {
    String _fullURL = this.eclipseNamingExtensions.getFullURL(chapter);
    String _decode = URLDecoder.decode(_fullURL);
    CharSequence _generate = this.generate(chapter, homeFileName);
    access.generateFile(_decode, _generate);
  }
  
  protected void _generate(final Part part, final IFileSystemAccess fsa, final String homeFileName) {
    String _fullURL = this.eclipseNamingExtensions.getFullURL(part);
    String _decode = URLDecoder.decode(_fullURL);
    CharSequence _generate = this.generate(part, homeFileName);
    fsa.generateFile(_decode, _generate);
    EList<Chapter> _chapters = part.getChapters();
    for (final Chapter c : _chapters) {
      this.generate(c, fsa, homeFileName);
    }
  }
  
  protected CharSequence _generate(final Part part, final String homeFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" >");
    _builder.newLine();
    _builder.append("<title>");
    TextOrMarkup _title = part.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link rel=\"home\" href=\"");
    _builder.append(homeFileName, "");
    _builder.append("\" title=\"\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<a name=\"");
    String _localId = this.eclipseNamingExtensions.getLocalId(part);
    _builder.append(_localId, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(part);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title_1 = part.getTitle();
    CharSequence _genPlainText_1 = this.plainText.genPlainText(_title_1);
    _builder.append(_genPlainText_1, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(part);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(part);
      boolean _hasElements = false;
      for(final AbstractSection ss : _sections) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ol>", "");
        }
        CharSequence _generateEntryInRoot = this.generateEntryInRoot(ss);
        _builder.append(_generateEntryInRoot, "");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("</ol>", "");
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Chapter chapter, final String homeFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" >");
    _builder.newLine();
    _builder.append("<title>");
    TextOrMarkup _title = chapter.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link rel=\"home\" href=\"");
    _builder.append(homeFileName, "");
    _builder.append("\" title=\"\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<a name=\"");
    String _localId = this.eclipseNamingExtensions.getLocalId(chapter);
    _builder.append(_localId, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(chapter);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title_1 = chapter.getTitle();
    CharSequence _genPlainText_1 = this.plainText.genPlainText(_title_1);
    _builder.append(_genPlainText_1, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(chapter);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = chapter.getContents();
      for(final TextOrMarkup content : _contents) {
        CharSequence _generatePar = this.generatePar(content);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(chapter);
      for(final AbstractSection ss : _sections) {
        CharSequence _generate = this.generate(ss);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public String headtag(final AbstractSection section) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (section instanceof Part) {
        _matched=true;
        _switchResult = "h1";
      }
    }
    if (!_matched) {
      if (section instanceof Chapter) {
        _matched=true;
        _switchResult = "h1";
      }
    }
    if (!_matched) {
      if (section instanceof Section) {
        _matched=true;
        _switchResult = "h2";
      }
    }
    if (!_matched) {
      if (section instanceof Section2) {
        _matched=true;
        _switchResult = "h3";
      }
    }
    if (!_matched) {
      if (section instanceof Section3) {
        _matched=true;
        _switchResult = "h4";
      }
    }
    if (!_matched) {
      if (section instanceof Section4) {
        _matched=true;
        _switchResult = "h5";
      }
    }
    if (!_matched) {
      _switchResult = "h1";
    }
    return _switchResult;
  }
  
  protected CharSequence _generate(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _localId = this.eclipseNamingExtensions.getLocalId(section);
    _builder.append(_localId, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(section);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(section);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = section.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _generatePar = this.generatePar(c);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      for(final AbstractSection ss : _sections) {
        CharSequence _generate = this.generate(ss);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section4 aS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _localId = this.eclipseNamingExtensions.getLocalId(aS);
    _builder.append(_localId, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h5>");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genNonParContent = this.genNonParContent(_title);
    _builder.append(_genNonParContent, "");
    _builder.append("</h5>");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(final TextOrMarkup tom : _contents) {
        CharSequence _generatePar = this.generatePar(tom);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generatePar(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Todo todo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"todo\" >");
    _builder.newLine();
    String _text = todo.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Ref ref) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      Identifiable _ref = ref.getRef();
      if ((_ref instanceof AbstractSection)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("title=\"Go to &quot;");
        Identifiable _ref_1 = ref.getRef();
        TextOrMarkup _title = ((AbstractSection) _ref_1).getTitle();
        CharSequence _genPlainText = this.plainText.genPlainText(_title);
        _builder.append(_genPlainText, "");
        _builder.append("&quot;\"");
        _xifexpression = _builder.toString();
      }
      final String title = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        EList<TextOrMarkup> _contents = ref.getContents();
        boolean _isEmpty = _contents.isEmpty();
        if (_isEmpty) {
          _builder_1.append("<a href=\"");
          URI _targetURI = this.uriUtil.getTargetURI(ref);
          _builder_1.append(_targetURI, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(" >section ");
          Identifiable _ref_2 = ref.getRef();
          String _name = _ref_2.getName();
          _builder_1.append(_name, "");
          _builder_1.append("</a>");
        } else {
          _builder_1.append("<a href=\"");
          URI _targetURI_1 = this.uriUtil.getTargetURI(ref);
          _builder_1.append(_targetURI_1, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(">");
          {
            EList<TextOrMarkup> _contents_1 = ref.getContents();
            for(final TextOrMarkup tom : _contents_1) {
              CharSequence _genNonParContent = this.genNonParContent(tom);
              _builder_1.append(_genNonParContent, "");
            }
          }
          _builder_1.append("</a>");
        }
      }
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject obj : _contents) {
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final UnorderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(final Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final OrderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(final Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Item i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = i.getContents();
      for(final TextOrMarkup tom : _contents) {
        _builder.append("\t");
        CharSequence _generate = this.generate(tom);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Anchor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"anchor-");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    return _builder;
  }
  
  public Object noop() {
    return null;
  }
  
  public URI collapse(final URI uri) {
    URI _xblockexpression = null;
    {
      final ArrayList<Object> segments = CollectionLiterals.<Object>newArrayList();
      List<String> _segmentsList = uri.segmentsList();
      for (final String s : _segmentsList) {
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(s, ".")) {
            _matched=true;
            this.noop();
          }
        }
        if (!_matched) {
          if (Objects.equal(s, "..")) {
            _matched=true;
            int _size = segments.size();
            int _minus = (_size - 1);
            segments.remove(_minus);
          }
        }
        if (!_matched) {
          segments.add(s);
        }
      }
      String _scheme = uri.scheme();
      String _plus = (_scheme + ":/");
      String _join = IterableExtensions.join(segments, "/");
      String _plus_1 = (_plus + _join);
      _xblockexpression = URI.createURI(_plus_1);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final ImageRef img) {
    CharSequence _xblockexpression = null;
    {
      String _path = img.getPath();
      final String escapedPath = this.utils.unescapeXdocChars(_path);
      URI _uRI = this.accessExtension2.getURI(escapedPath, Outlets.ECLIPSE_HELP);
      final URI absoluteOutputURI = this.collapse(_uRI);
      String _targetDocumentName = this.uriUtil.getTargetDocumentName();
      final URI documentURI = this.accessExtension2.getURI(_targetDocumentName, Outlets.ECLIPSE_HELP);
      final URI imageChapterRelativeURI = absoluteOutputURI.deresolve(documentURI);
      Resource _eResource = img.eResource();
      this.copy(escapedPath, _eResource);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"image\" >");
      _builder.newLine();
      {
        String _name = img.getName();
        boolean _notEquals = (!Objects.equal(_name, null));
        if (_notEquals) {
          String _name_1 = img.getName();
          CharSequence _genLabel = this.genLabel(_name_1);
          _builder.append(_genLabel, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<img src=\"");
      String _string = imageChapterRelativeURI.toString();
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_string);
      _builder.append(_unescapeXdocChars, "");
      _builder.append("\" ");
      {
        String _clazz = img.getClazz();
        boolean _notEquals_1 = (!Objects.equal(_clazz, null));
        if (_notEquals_1) {
          _builder.append("class=\"");
          String _clazz_1 = img.getClazz();
          String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_clazz_1);
          _builder.append(_unescapeXdocChars_1, "");
          _builder.append("\" ");
        }
      }
      _builder.newLineIfNotEmpty();
      {
        boolean _and = false;
        String _style = img.getStyle();
        boolean _notEquals_2 = (!Objects.equal(_style, null));
        if (!_notEquals_2) {
          _and = false;
        } else {
          String _style_1 = img.getStyle();
          int _length = _style_1.length();
          boolean _equals = (_length == 0);
          boolean _not = (!_equals);
          _and = _not;
        }
        if (_and) {
          _builder.append(" style=\"");
          String _style_2 = img.getStyle();
          String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_style_2);
          _builder.append(_unescapeXdocChars_2, "");
          _builder.append("\" ");
        }
      }
      _builder.append("/>");
      _builder.newLineIfNotEmpty();
      _builder.append("<div class=\"caption\">");
      _builder.newLine();
      String _caption = img.getCaption();
      String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_caption);
      String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
      _builder.append(_escapeHTMLChars, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genLabel(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(this, null));
      if (_notEquals) {
        _builder.append("<a name=\"");
        _builder.append(name, "");
        _builder.append("\"></a>");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final TextPart tp) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    return this.utils.escapeHTMLChars(_unescapeXdocChars);
  }
  
  protected CharSequence _generate(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(final TableRow tr : _rows) {
        CharSequence _generate = this.generate(tr);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableRow tr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(final TableData td : _data) {
        CharSequence _generate = this.generate(td);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableData td) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = td.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</td>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Emphasize em) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    {
      EList<TextOrMarkup> _contents = em.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
      }
    }
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _generate(final Link link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    String _url = link.getUrl();
    _builder.append(_url, "");
    _builder.append("\">");
    String _text = link.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    _builder.append(_escapeHTMLChars, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _generate(final CodeRef cRef) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _and = false;
      JvmDeclaredType _element = cRef.getElement();
      if (!(_element instanceof JvmAnnotationType)) {
        _and = false;
      } else {
        TextOrMarkup _altText = cRef.getAltText();
        boolean _equals = Objects.equal(_altText, null);
        _and = _equals;
      }
      if (_and) {
        _xifexpression = "@";
      }
      final String prefix = _xifexpression;
      JvmDeclaredType _element_1 = cRef.getElement();
      final String jDocLink = this.jdoc.genJavaDocLink(_element_1);
      JvmDeclaredType _element_2 = cRef.getElement();
      final String gitLink = this.git.gitLink(_element_2);
      JvmDeclaredType _element_3 = cRef.getElement();
      char _charAt = ".".charAt(0);
      String _qualifiedName = _element_3.getQualifiedName(_charAt);
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
      final String fqn = this.utils.escapeHTMLChars(_unescapeXdocChars);
      CharSequence _xifexpression_1 = null;
      TextOrMarkup _altText_1 = cRef.getAltText();
      boolean _notEquals = (!Objects.equal(_altText_1, null));
      if (_notEquals) {
        TextOrMarkup _altText_2 = cRef.getAltText();
        _xifexpression_1 = this.generate(_altText_2);
      } else {
        JvmDeclaredType _element_4 = cRef.getElement();
        _xifexpression_1 = this.dottedSimpleName(_element_4);
      }
      final CharSequence text = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _notEquals_1 = (!Objects.equal(jDocLink, null));
      if (_notEquals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a class=\"jdoc\" href=\"");
        JvmDeclaredType _element_5 = cRef.getElement();
        String _genJavaDocLink = this.jdoc.genJavaDocLink(_element_5);
        _builder.append(_genJavaDocLink, "");
        _builder.append("\" title=\"View JavaDoc\"><abbr title=\"");
        _builder.append(fqn, "");
        _builder.append("\" >");
        _builder.append(prefix, "");
        _builder.append(text, "");
        _builder.append("</abbr></a>");
        _xifexpression_2 = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<abbr title=\"");
        _builder_1.append(fqn, "");
        _builder_1.append("\" >");
        _builder_1.append(prefix, "");
        _builder_1.append(text, "");
        _builder_1.append("</abbr>");
        _xifexpression_2 = _builder_1.toString();
      }
      String ret = _xifexpression_2;
      CharSequence _xifexpression_3 = null;
      boolean _notEquals_2 = (!Objects.equal(gitLink, null));
      if (_notEquals_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(ret, "");
        _builder_2.append(" <a class=\"srcLink\" href=\"");
        _builder_2.append(gitLink, "");
        _builder_2.append("\" title=\"View Source Code\" >(src)</a>");
        _xifexpression_3 = _builder_2;
      } else {
        _xifexpression_3 = ret;
      }
      _xblockexpression = _xifexpression_3;
    }
    return _xblockexpression;
  }
  
  public String dottedSimpleName(final JvmDeclaredType type) {
    String _xifexpression = null;
    JvmDeclaredType _declaringType = type.getDeclaringType();
    boolean _notEquals = (!Objects.equal(_declaringType, null));
    if (_notEquals) {
      JvmDeclaredType _declaringType_1 = type.getDeclaringType();
      String _dottedSimpleName = this.dottedSimpleName(_declaringType_1);
      String _plus = (_dottedSimpleName + ".");
      String _simpleName = type.getSimpleName();
      _xifexpression = (_plus + _simpleName);
    } else {
      _xifexpression = type.getSimpleName();
    }
    return _xifexpression;
  }
  
  protected CharSequence _generate(final CodeBlock cb) {
    CharSequence _xifexpression = null;
    boolean _isInlineCode = this.utils.isInlineCode(cb);
    if (_isInlineCode) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<span class=\"inlinecode\">");
      EList<EObject> _contents = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      CharSequence _generateCode = this.generateCode(((Code) _head));
      LangDef _language = cb.getLanguage();
      String _formatCode = this.utils.formatCode(_generateCode, _language);
      _builder.append(_formatCode, "");
      _builder.append("</span>");
      _xifexpression = _builder;
    } else {
      CharSequence _xblockexpression = null;
      {
        final int indentToRemove = this.utils.calcIndent(cb);
        Iterable<EObject> _xifexpression_1 = null;
        EList<EObject> _contents_1 = cb.getContents();
        int _size = _contents_1.size();
        boolean _greaterThan = (_size > 2);
        if (_greaterThan) {
          EList<EObject> _contents_2 = cb.getContents();
          Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_2);
          EList<EObject> _contents_3 = cb.getContents();
          int _size_1 = _contents_3.size();
          int _minus = (_size_1 - 2);
          _xifexpression_1 = IterableExtensions.<EObject>take(_tail, _minus);
        } else {
          _xifexpression_1 = Collections.EMPTY_LIST;
        }
        final Iterable<EObject> list = _xifexpression_1;
        EList<EObject> _contents_4 = cb.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_4);
        CharSequence _generateCode_1 = this.generateCode(_head_1);
        String _trimLines = this.trimLines(_generateCode_1, indentToRemove);
        final String first = _trimLines.replaceAll("\\A(\\s*\n)*", "");
        String _xifexpression_2 = null;
        EList<EObject> _contents_5 = cb.getContents();
        EObject _last = IterableExtensions.<EObject>last(_contents_5);
        EList<EObject> _contents_6 = cb.getContents();
        EObject _head_2 = IterableExtensions.<EObject>head(_contents_6);
        boolean _notEquals = (!Objects.equal(_last, _head_2));
        if (_notEquals) {
          EList<EObject> _contents_7 = cb.getContents();
          EObject _last_1 = IterableExtensions.<EObject>last(_contents_7);
          CharSequence _generateCode_2 = this.generateCode(_last_1);
          String _trimLines_1 = this.trimLines(_generateCode_2, indentToRemove);
          _xifexpression_2 = _trimLines_1.replaceAll("(\\s*\n)*\\Z", "");
        } else {
          String _xblockexpression_1 = null;
          {
            first.replaceAll("(\\s*\n)*\\Z", "");
            _xblockexpression_1 = "";
          }
          _xifexpression_2 = _xblockexpression_1;
        }
        final String last = _xifexpression_2;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<div class=\"literallayout\">");
        _builder_1.newLine();
        _builder_1.append("<div class=\"incode\">");
        _builder_1.newLine();
        _builder_1.append("<p class=\"code\">");
        _builder_1.newLine();
        LangDef _language_1 = cb.getLanguage();
        String _formatCode_1 = this.utils.formatCode(first, _language_1);
        _builder_1.append(_formatCode_1, "");
        _builder_1.newLineIfNotEmpty();
        {
          for(final EObject code : list) {
            CharSequence _generateCode_3 = this.generateCode(code);
            String _trimLines_2 = this.trimLines(_generateCode_3, indentToRemove);
            LangDef _language_2 = cb.getLanguage();
            String _formatCode_2 = this.utils.formatCode(_trimLines_2, _language_2);
            _builder_1.append(_formatCode_2, "");
            _builder_1.newLineIfNotEmpty();
          }
        }
        LangDef _language_3 = cb.getLanguage();
        String _formatCode_3 = this.utils.formatCode(last, _language_3);
        _builder_1.append(_formatCode_3, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</p>");
        _builder_1.newLine();
        _builder_1.append("</div>");
        _builder_1.newLine();
        _builder_1.append("</div>");
        _builder_1.newLine();
        _xblockexpression = _builder_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public String trimLines(final CharSequence cs, final int amount) {
    String _string = cs.toString();
    return _string.replaceAll((("\n\\s{" + Integer.valueOf(amount)) + "}"), "\n");
  }
  
  protected CharSequence _generateCode(final Code code) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    _builder.append(_unescapeXdocChars, "");
    return _builder;
  }
  
  protected CharSequence _generateCode(final MarkupInCode code) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generate = this.generate(code);
    _builder.append(_generate, "");
    return _builder;
  }
  
  public CharSequence genNonParContent(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject obj : _contents) {
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  public void generate(final AbstractSection chapter, final IFileSystemAccess access, final String homeFileName) {
    if (chapter instanceof Chapter) {
      _generate((Chapter)chapter, access, homeFileName);
      return;
    } else if (chapter instanceof Part) {
      _generate((Part)chapter, access, homeFileName);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chapter, access, homeFileName).toString());
    }
  }
  
  public CharSequence generate(final AbstractSection chapter, final String homeFileName) {
    if (chapter instanceof Chapter) {
      return _generate((Chapter)chapter, homeFileName);
    } else if (chapter instanceof Part) {
      return _generate((Part)chapter, homeFileName);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chapter, homeFileName).toString());
    }
  }
  
  public CharSequence generate(final EObject aS) {
    if (aS instanceof Section4) {
      return _generate((Section4)aS);
    } else if (aS instanceof AbstractSection) {
      return _generate((AbstractSection)aS);
    } else if (aS instanceof Anchor) {
      return _generate((Anchor)aS);
    } else if (aS instanceof CodeBlock) {
      return _generate((CodeBlock)aS);
    } else if (aS instanceof CodeRef) {
      return _generate((CodeRef)aS);
    } else if (aS instanceof Emphasize) {
      return _generate((Emphasize)aS);
    } else if (aS instanceof ImageRef) {
      return _generate((ImageRef)aS);
    } else if (aS instanceof Link) {
      return _generate((Link)aS);
    } else if (aS instanceof OrderedList) {
      return _generate((OrderedList)aS);
    } else if (aS instanceof Ref) {
      return _generate((Ref)aS);
    } else if (aS instanceof Table) {
      return _generate((Table)aS);
    } else if (aS instanceof Todo) {
      return _generate((Todo)aS);
    } else if (aS instanceof UnorderedList) {
      return _generate((UnorderedList)aS);
    } else if (aS instanceof Item) {
      return _generate((Item)aS);
    } else if (aS instanceof TableData) {
      return _generate((TableData)aS);
    } else if (aS instanceof TableRow) {
      return _generate((TableRow)aS);
    } else if (aS instanceof TextOrMarkup) {
      return _generate((TextOrMarkup)aS);
    } else if (aS instanceof TextPart) {
      return _generate((TextPart)aS);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aS).toString());
    }
  }
  
  public CharSequence generateCode(final EObject code) {
    if (code instanceof Code) {
      return _generateCode((Code)code);
    } else if (code instanceof MarkupInCode) {
      return _generateCode((MarkupInCode)code);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(code).toString());
    }
  }
}
