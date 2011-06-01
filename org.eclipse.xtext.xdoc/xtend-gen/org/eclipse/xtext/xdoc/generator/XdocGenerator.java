package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.TocGenerator;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.GlossaryExtensions;
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
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XdocGenerator implements IGenerator {
  
  @Inject
  private JavaDocExtension jdoc;
  
  @Inject
  private Utils utils;
  
  @Inject
  private GlossaryExtensions glossaryExtensions;
  
  @Inject
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  private TocGenerator tocGenerator;
  
  @Inject
  private PlainText plainText;
  
  @Inject
  private AbstractSectionExtension sectionExtension;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) throws RuntimeException {
    {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      AbstractSection _mainSection = ((XdocFile) _head)==null?(AbstractSection)null:((XdocFile) _head).getMainSection();
      final AbstractSection doc = _mainSection;
      if ((doc instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
        this.generate(((Document) doc), access);
      }
    }
  }
  
  public void generate(final Document document, final IFileSystemAccess access) throws RuntimeException {
    {
      Map<AbstractSection,String> _computeURLs = this.eclipseNamingExtensions.computeURLs(document);
      final Map<AbstractSection,String> fileNames = _computeURLs;
      StringConcatenation _generateToc = this.tocGenerator.generateToc(document, fileNames);
      access.generateFile("toc.xml", _generateToc);
      String _get = fileNames.get(document);
      String _decode = URLDecoder.decode(_get);
      StringConcatenation _generateRootDocument = this.generateRootDocument(document, fileNames);
      access.generateFile(_decode, _generateRootDocument);
      EList<Chapter> _chapters = document.getChapters();
      for (Chapter c : _chapters) {
        this.generate(c, fileNames, access);
      }
    }
  }
  
  public Object copy(final String fromRelativeFileName, final Resource res) throws RuntimeException {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xblockexpression = null;
      {
        int _operator_multiply = IntegerExtensions.operator_multiply(((Integer)16), ((Integer)1024));
        ByteBuffer _allocateDirect = ByteBuffer.allocateDirect(_operator_multiply);
        final ByteBuffer buffer = _allocateDirect;
        URI _uRI = res.getURI();
        final URI uri = _uRI;
        final String sepChar = File.separator;
        String relOutDirRoot = "";
        String inDir = "";
        Object _xifexpression = null;
        boolean _isPlatformResource = uri.isPlatformResource();
        if (_isPlatformResource) {
          {
            URI _trimSegments = uri.trimSegments(1);
            String _string = _trimSegments.toString();
            String _operator_plus = StringExtensions.operator_plus(_string, "/");
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, fromRelativeFileName);
            URI _createURI = URI.createURI(_operator_plus_1);
            final URI inPath = _createURI;
            URI _trimSegments_1 = uri.trimSegments(2);
            URI _appendSegment = _trimSegments_1.appendSegment("contents");
            String _string_1 = _appendSegment.toString();
            String _operator_plus_2 = StringExtensions.operator_plus(_string_1, "/");
            String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, fromRelativeFileName);
            URI _createURI_1 = URI.createURI(_operator_plus_3);
            final URI outPath = _createURI_1;
            ResourceSet _resourceSet = res.getResourceSet();
            URIConverter _uRIConverter = _resourceSet.getURIConverter();
            InputStream _createInputStream = _uRIConverter.createInputStream(inPath);
            ReadableByteChannel _newChannel = Channels.newChannel(_createInputStream);
            final ReadableByteChannel inChannel = _newChannel;
            ResourceSet _resourceSet_1 = res.getResourceSet();
            URIConverter _uRIConverter_1 = _resourceSet_1.getURIConverter();
            OutputStream _createOutputStream = _uRIConverter_1.createOutputStream(outPath);
            WritableByteChannel _newChannel_1 = Channels.newChannel(_createOutputStream);
            final WritableByteChannel outChannel = _newChannel_1;
            int _read = inChannel.read(buffer);
            int _operator_minus = IntegerExtensions.operator_minus(1);
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_read), ((Integer)_operator_minus));
            Boolean _xwhileexpression = _operator_notEquals;
            while (_xwhileexpression) {
              {
                buffer.flip();
                outChannel.write(buffer);
                buffer.compact();
              }
              int _read_1 = inChannel.read(buffer);
              int _operator_minus_1 = IntegerExtensions.operator_minus(1);
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_read_1), ((Integer)_operator_minus_1));
              _xwhileexpression = _operator_notEquals_1;
            }
            buffer.flip();
            boolean _hasRemaining = buffer.hasRemaining();
            Boolean _xwhileexpression_1 = _hasRemaining;
            while (_xwhileexpression_1) {
              outChannel.write(buffer);
              boolean _hasRemaining_1 = buffer.hasRemaining();
              _xwhileexpression_1 = _hasRemaining_1;
            }
            outChannel.close();
          }
        }
        _xblockexpression = (_xifexpression);
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
    return _xtrycatchfinallyexpression;
  }
  
  public StringConcatenation generateRootDocument(final Document document, final Map<AbstractSection,String> fileNames) throws RuntimeException {
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
    String _get = fileNames.get(document);
    _builder.append(_get, "");
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
      for(TextOrMarkup content : _contents) {
        StringConcatenation _generatePar = this.generatePar(content, fileNames);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(document);
      boolean hasAnyElements = false;
      for(AbstractSection ss : _sections) {
        if (!hasAnyElements) {
          hasAnyElements = true;
          _builder.append("<ol>", "");
        }
        StringConcatenation _generateEntryInRoot = this.generateEntryInRoot(ss, fileNames);
        _builder.append(_generateEntryInRoot, "");
        _builder.newLineIfNotEmpty();
      }
      if (hasAnyElements) {
        _builder.append("</ol>", "");
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateEntryInRoot(final AbstractSection section, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _get = fileNames.get(section);
    _builder.append(_get, "");
    _builder.append("\">");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      boolean hasAnyElements = false;
      for(AbstractSection ss : _sections) {
        if (!hasAnyElements) {
          hasAnyElements = true;
          _builder.append("<ol>", "	");
        }
        _builder.append("\t");
        StringConcatenation _generateEntryInRoot = this.generateEntryInRoot(ss, fileNames);
        _builder.append(_generateEntryInRoot, "	");
        _builder.newLineIfNotEmpty();
      }
      if (hasAnyElements) {
        _builder.append("</ol>", "	");
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  public void generate(final Chapter chapter, final Map<AbstractSection,String> fileNames, final IFileSystemAccess access) throws RuntimeException {
    String _get = fileNames.get(chapter);
    String _decode = URLDecoder.decode(_get);
    CharSequence _generate = this.generate(chapter, fileNames);
    access.generateFile(_decode, _generate);
  }
  
  protected CharSequence _generate(final Chapter chapter, final Map<AbstractSection,String> fileNames) throws RuntimeException {
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
    _builder.append("<link rel=\"home\" href=\"index.html\" title=\"\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    {
      String _labelName = this.eclipseNamingExtensions.labelName(chapter, fileNames);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_labelName, null);
      if (_operator_notEquals) {
        _builder.append("<a name=\"");
        String _labelName_1 = this.eclipseNamingExtensions.labelName(chapter, fileNames);
        _builder.append(_labelName_1, "");
        _builder.append("\"></a>");
      }
    }
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
      for(TextOrMarkup content : _contents) {
        StringConcatenation _generatePar = this.generatePar(content, fileNames);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(chapter);
      for(AbstractSection ss : _sections) {
        CharSequence _generate = this.generate(ss, fileNames);
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
    final AbstractSection section_1 = section;
    boolean matched = false;
    if (!matched) {
      if (section_1 instanceof Chapter) {
        final Chapter section_2 = (Chapter) section_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section) {
        final Section section_3 = (Section) section_1;
        matched=true;
        _switchResult = "h2";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section2) {
        final Section2 section_4 = (Section2) section_1;
        matched=true;
        _switchResult = "h3";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section3) {
        final Section3 section_5 = (Section3) section_1;
        matched=true;
        _switchResult = "h4";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section4) {
        final Section4 section_6 = (Section4) section_1;
        matched=true;
        _switchResult = "h5";
      }
    }
    if (!matched) {
      _switchResult = "h1";
    }
    return _switchResult;
  }
  
  protected CharSequence _generate(final AbstractSection aS, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _labelName = this.eclipseNamingExtensions.labelName(aS, fileNames);
    _builder.append(_labelName, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(aS);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(aS);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(TextOrMarkup c : _contents) {
        StringConcatenation _generatePar = this.generatePar(c, fileNames);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(aS);
      for(AbstractSection ss : _sections) {
        CharSequence _generate = this.generate(ss, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section4 aS, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _labelName = this.eclipseNamingExtensions.labelName(aS, fileNames);
    _builder.append(_labelName, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h5>");
    TextOrMarkup _title = aS.getTitle();
    StringConcatenation _genNonParContent = this.genNonParContent(_title, fileNames);
    _builder.append(_genNonParContent, "");
    _builder.append("</h5>");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(TextOrMarkup tom : _contents) {
        StringConcatenation _generatePar = this.generatePar(tom, fileNames);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generatePar(final TextOrMarkup tom, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _generate = this.generate(c, fileNames);
        _builder.append(_generate, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Todo todo, final Map<AbstractSection,String> fileNames) {
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
  
  protected CharSequence _generate(final Ref ref, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        _builder.append("<a href=\"");
        Identifiable _ref = ref.getRef();
        Object _url = this.url(_ref, fileNames);
        _builder.append(_url, "");
        _builder.append("\">section ");
        Identifiable _ref_1 = ref.getRef();
        String _name = _ref_1.getName();
        _builder.append(_name, "");
        _builder.append("</a>");
        _builder.newLineIfNotEmpty();} else {
        _builder.append("<a href=\"");
        Identifiable _ref_2 = ref.getRef();
        Object _url_1 = this.url(_ref_2, fileNames);
        _builder.append(_url_1, "");
        _builder.append("\">");
        {
          EList<TextOrMarkup> _contents_1 = ref.getContents();
          for(TextOrMarkup tom : _contents_1) {
            StringConcatenation _genNonParContent = this.genNonParContent(tom, fileNames);
            _builder.append(_genNonParContent, "");
          }
        }
        _builder.append("</a>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected Object _url(final Anchor anchor, final Map<AbstractSection,String> fileNames) {
    URI _xblockexpression = null;
    {
      AbstractSection _containerOfType = EcoreUtil2.<AbstractSection>getContainerOfType(anchor, org.eclipse.xtext.xdoc.xdoc.AbstractSection.class);
      final AbstractSection section = _containerOfType;
      String _get = fileNames.get(section);
      final String fileName = _get;
      boolean _operator_equals = ObjectExtensions.operator_equals(fileName, null);
      if (_operator_equals) {
        return null;
      }
      URI _createURI = URI.createURI(fileName);
      final URI uri = _createURI;
      URI _trimFragment = uri.trimFragment();
      String _name = anchor.getName();
      String _operator_plus = StringExtensions.operator_plus("anchor-", _name);
      URI _appendFragment = _trimFragment.appendFragment(_operator_plus);
      final URI result = _appendFragment;
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  protected Object _url(final AbstractSection section, final Map<AbstractSection,String> fileNames) {
    String _get = fileNames.get(section);
    return _get;
  }
  
  protected CharSequence _generate(final TextOrMarkup tom, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        CharSequence _generate = this.generate(obj, fileNames);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final UnorderedList ul, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i, fileNames);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final OrderedList ul, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i, fileNames);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Item i, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = i.getContents();
      for(TextOrMarkup tom : _contents) {
        _builder.append("\t");
        CharSequence _generate = this.generate(tom, fileNames);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Anchor a, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"anchor-");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    return _builder;
  }
  
  protected CharSequence _generate(final ImageRef img, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _path = img.getPath();
      Resource _eResource = img.eResource();
      this.copy(_path, _eResource);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"image\" >");
      _builder.newLine();
      {
        String _name = img.getName();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
        if (_operator_notEquals) {
          String _name_1 = img.getName();
          StringConcatenation _genLabel = this.genLabel(_name_1);
          _builder.append(_genLabel, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("", "");
      _builder.newLineIfNotEmpty();
      _builder.append("<img src=\"");
      String _path_1 = img.getPath();
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_path_1);
      _builder.append(_unescapeXdocChars, "");
      _builder.append("\" ");
      {
        String _clazz = img.getClazz();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_clazz, null);
        if (_operator_notEquals_1) {
          _builder.append("class=\"");
          String _clazz_1 = img.getClazz();
          String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_clazz_1);
          _builder.append(_unescapeXdocChars_1, "");
          _builder.append("\" ");
        }
      }
      _builder.newLineIfNotEmpty();
      {
        boolean _operator_and = false;
        String _style = img.getStyle();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_style, null);
        if (!_operator_notEquals_2) {
          _operator_and = false;
        } else {
          String _style_1 = img.getStyle();
          int _length = _style_1.length();
          boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_length), ((Integer)0));
          boolean _operator_not = BooleanExtensions.operator_not(_operator_equals);
          _operator_and = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_not);
        }
        if (_operator_and) {
          _builder.append(" style=\"");
          String _style_2 = img.getStyle();
          String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_style_2);
          _builder.append(_unescapeXdocChars_2, "");
          _builder.append("\" ");
        }
      }
      _builder.append("/>");
      _builder.newLineIfNotEmpty();
      String _caption = img.getCaption();
      String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_caption);
      String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
      _builder.append(_escapeHTMLChars, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation genLabel(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(this, null);
      if (_operator_notEquals) {
        _builder.append("<a name=\"");
        _builder.append(name, "");
        _builder.append("\"></a>");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final TextPart tp, final Map<AbstractSection,String> fileNames) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    return _escapeHTMLChars;
  }
  
  protected CharSequence _generate(final Table table, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(TableRow tr : _rows) {
        CharSequence _generate = this.generate(tr, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableRow tr, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(TableData td : _data) {
        CharSequence _generate = this.generate(td, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableData td, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = td.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</td>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Emphasize em, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    {
      EList<TextOrMarkup> _contents = em.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c, fileNames);
        _builder.append(_generate, "");
      }
    }
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _generate(final Link link, final Map<AbstractSection,String> fileNames) {
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
  
  protected CharSequence _generate(final CodeRef cRef, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _xblockexpression = null;
    {
      String _xifexpression = null;
      JvmDeclaredType _element = cRef.getElement();
      if ((_element instanceof org.eclipse.xtext.common.types.JvmAnnotationType)) {
        _xifexpression = "@";
      }
      final String prefix = _xifexpression;
      JvmDeclaredType _element_1 = cRef.getElement();
      String _genJavaDocLink = this.jdoc.genJavaDocLink(_element_1);
      final String jDocLink = _genJavaDocLink;
      StringConcatenation _xifexpression_1 = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(jDocLink, null);
      if (_operator_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a href=\"");
        JvmDeclaredType _element_2 = cRef.getElement();
        String _genJavaDocLink_1 = this.jdoc.genJavaDocLink(_element_2);
        _builder.append(_genJavaDocLink_1, "");
        _builder.append("\" ><abbr title=\"");
        JvmDeclaredType _element_3 = cRef.getElement();
        char _charAt = ".".charAt(0);
        String _qualifiedName = _element_3.getQualifiedName(_charAt);
        String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
        String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
        _builder.append(_escapeHTMLChars, "");
        _builder.append("\" >");
        _builder.append(prefix, "");
        JvmDeclaredType _element_4 = cRef.getElement();
        String _simpleName = _element_4.getSimpleName();
        String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_simpleName);
        String _escapeHTMLChars_1 = this.utils.escapeHTMLChars(_unescapeXdocChars_1);
        _builder.append(_escapeHTMLChars_1, "");
        _builder.append("</abbr></a>");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<abbr title=\"");
        JvmDeclaredType _element_5 = cRef.getElement();
        char _charAt_1 = ".".charAt(0);
        String _qualifiedName_1 = _element_5.getQualifiedName(_charAt_1);
        String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_qualifiedName_1);
        String _escapeHTMLChars_2 = this.utils.escapeHTMLChars(_unescapeXdocChars_2);
        _builder_1.append(_escapeHTMLChars_2, "");
        _builder_1.append("\" >");
        _builder_1.append(prefix, "");
        JvmDeclaredType _element_6 = cRef.getElement();
        String _simpleName_1 = _element_6.getSimpleName();
        String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_simpleName_1);
        String _escapeHTMLChars_3 = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
        _builder_1.append(_escapeHTMLChars_3, "");
        _builder_1.append("</abbr>");
        _xifexpression_1 = _builder_1;
      }
      _xblockexpression = (_xifexpression_1);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final CodeBlock cb, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    boolean _isInlineCode = this.utils.isInlineCode(cb);
    if (_isInlineCode) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<span class=\"inlinecode\">");
      EList<EObject> _contents = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      StringConcatenation _generateCode = this.generateCode(((Code) _head), fileNames);
      LangDef _language = cb.getLanguage();
      String _formatCode = this.utils.formatCode(_generateCode, _language);
      _builder.append(_formatCode, "");
      _builder.append("</span>");
      _xifexpression = _builder;
    } else {
      StringConcatenation _xblockexpression = null;
      {
        Integer _calcIndent = this.utils.calcIndent(cb);
        final Integer indentToRemove = _calcIndent;
        Iterable<EObject> _xifexpression_1 = null;
        EList<EObject> _contents_1 = cb.getContents();
        int _size = _contents_1.size();
        boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)2));
        if (_operator_greaterThan) {
          EList<EObject> _contents_2 = cb.getContents();
          Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_2);
          EList<EObject> _contents_3 = cb.getContents();
          int _size_1 = _contents_3.size();
          int _operator_minus = IntegerExtensions.operator_minus(((Integer)_size_1), ((Integer)2));
          Iterable<EObject> _take = IterableExtensions.<EObject>take(_tail, _operator_minus);
          _xifexpression_1 = _take;
        } else {
          _xifexpression_1 = Collections.EMPTY_LIST;
        }
        final Iterable<EObject> list = _xifexpression_1;
        EList<EObject> _contents_4 = cb.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_4);
        StringConcatenation _generateCode_1 = this.generateCode(_head_1, fileNames);
        String _trimLines = this.trimLines(_generateCode_1, indentToRemove);
        String _replaceAll = _trimLines.replaceAll("\\A(\\s*\n)*", "");
        final String first = _replaceAll;
        String _xifexpression_2 = null;
        EList<EObject> _contents_5 = cb.getContents();
        EObject _last = IterableExtensions.<EObject>last(_contents_5);
        EList<EObject> _contents_6 = cb.getContents();
        EObject _head_2 = IterableExtensions.<EObject>head(_contents_6);
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_last, _head_2);
        if (_operator_notEquals) {
          EList<EObject> _contents_7 = cb.getContents();
          EObject _last_1 = IterableExtensions.<EObject>last(_contents_7);
          StringConcatenation _generateCode_2 = this.generateCode(_last_1, fileNames);
          String _trimLines_1 = this.trimLines(_generateCode_2, indentToRemove);
          String _replaceAll_1 = _trimLines_1.replaceAll("(\\s*\n)*\\Z", "");
          _xifexpression_2 = _replaceAll_1;
        } else {
          String _xblockexpression_1 = null;
          {
            first.replaceAll("(\\s*\n)*\\Z", "");
            _xblockexpression_1 = ("");
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
          for(EObject code : list) {
            StringConcatenation _generateCode_3 = this.generateCode(code, fileNames);
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
        _xblockexpression = (_builder_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public String trimLines(final CharSequence cs, final int amount) {
    String _string = cs.toString();
    String _operator_plus = StringExtensions.operator_plus("\n\\s{", ((Integer)amount));
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "}");
    String _replaceAll = _string.replaceAll(_operator_plus_1, "\n");
    return _replaceAll;
  }
  
  protected StringConcatenation _generateCode(final Code code, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    _builder.append(_unescapeXdocChars, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final MarkupInCode code, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generate = this.generate(code, fileNames);
    _builder.append(_generate, "");
    return _builder;
  }
  
  public StringConcatenation genNonParContent(final TextOrMarkup tom, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        CharSequence _generate = this.generate(obj, fileNames);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  public CharSequence generate(final EObject chapter, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((chapter instanceof Chapter)
         && (fileNames instanceof Map)) {
      return _generate((Chapter)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Section4)
         && (fileNames instanceof Map)) {
      return _generate((Section4)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof AbstractSection)
         && (fileNames instanceof Map)) {
      return _generate((AbstractSection)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Anchor)
         && (fileNames instanceof Map)) {
      return _generate((Anchor)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof CodeBlock)
         && (fileNames instanceof Map)) {
      return _generate((CodeBlock)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof CodeRef)
         && (fileNames instanceof Map)) {
      return _generate((CodeRef)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Emphasize)
         && (fileNames instanceof Map)) {
      return _generate((Emphasize)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof ImageRef)
         && (fileNames instanceof Map)) {
      return _generate((ImageRef)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Link)
         && (fileNames instanceof Map)) {
      return _generate((Link)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof OrderedList)
         && (fileNames instanceof Map)) {
      return _generate((OrderedList)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Ref)
         && (fileNames instanceof Map)) {
      return _generate((Ref)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Table)
         && (fileNames instanceof Map)) {
      return _generate((Table)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Todo)
         && (fileNames instanceof Map)) {
      return _generate((Todo)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof UnorderedList)
         && (fileNames instanceof Map)) {
      return _generate((UnorderedList)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof Item)
         && (fileNames instanceof Map)) {
      return _generate((Item)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof TableData)
         && (fileNames instanceof Map)) {
      return _generate((TableData)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof TableRow)
         && (fileNames instanceof Map)) {
      return _generate((TableRow)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof TextOrMarkup)
         && (fileNames instanceof Map)) {
      return _generate((TextOrMarkup)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof TextPart)
         && (fileNames instanceof Map)) {
      return _generate((TextPart)chapter, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapter, fileNames).toString());
    }
  }
  
  public Object url(final Identifiable section, final Map<AbstractSection,String> fileNames) {
    if ((section instanceof AbstractSection)
         && (fileNames instanceof Map)) {
      return _url((AbstractSection)section, (Map<AbstractSection,String>)fileNames);
    } else if ((section instanceof Anchor)
         && (fileNames instanceof Map)) {
      return _url((Anchor)section, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(section, fileNames).toString());
    }
  }
  
  public StringConcatenation generateCode(final EObject code, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((code instanceof Code)
         && (fileNames instanceof Map)) {
      return _generateCode((Code)code, (Map<AbstractSection,String>)fileNames);
    } else if ((code instanceof MarkupInCode)
         && (fileNames instanceof Map)) {
      return _generateCode((MarkupInCode)code, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code, fileNames).toString());
    }
  }
}