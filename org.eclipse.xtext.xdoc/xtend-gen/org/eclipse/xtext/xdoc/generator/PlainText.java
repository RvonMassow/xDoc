package org.eclipse.xtext.xdoc.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;

@SuppressWarnings("all")
public class PlainText {
  protected CharSequence _genPlainText(final TextOrMarkup tom) {
    EList<EObject> _contents = tom.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<String, EObject, String> _function = new Function2<String, EObject, String>() {
      public String apply(final String e1, final EObject e2) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(e1, "");
        CharSequence _genPlainText = PlainText.this.genPlainText(e2);
        _builder.append(_genPlainText, "");
        return _builder.toString();
      }
    };
    return IterableExtensions.<EObject, String>fold(_contents, _builder.toString(), _function);
  }
  
  protected CharSequence _genPlainText(final TextPart tp) {
    return tp.getText();
  }
  
  protected CharSequence _genPlainText(final Emphasize em) {
    EList<TextOrMarkup> _contents = em.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<String, TextOrMarkup, String> _function = new Function2<String, TextOrMarkup, String>() {
      public String apply(final String e1, final TextOrMarkup e2) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(e1, "");
        CharSequence _genPlainText = PlainText.this.genPlainText(e2);
        _builder.append(_genPlainText, "");
        return _builder.toString();
      }
    };
    return IterableExtensions.<TextOrMarkup, String>fold(_contents, _builder.toString(), _function);
  }
  
  protected CharSequence _genPlainText(final Link l) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String _text = l.getText();
      _builder.append(_text, "");
      final String text = _builder.toString();
      CharSequence _xifexpression = null;
      String _string = text.toString();
      boolean _notEquals = (!Objects.equal(_string, text));
      if (_notEquals) {
        _xifexpression = text;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"");
        String _url = l.getUrl();
        _builder_1.append(_url, "");
        _builder_1.append("\"");
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genPlainText(final Ref ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<TextOrMarkup> _contents_1 = ref.getContents();
          for(final TextOrMarkup e : _contents_1) {
            CharSequence _genPlainText = this.genPlainText(e);
            _builder.append(_genPlainText, "");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        Identifiable _ref = ref.getRef();
        String _name = _ref.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genPlainText(final CodeRef cRef) {
    StringConcatenation _builder = new StringConcatenation();
    JvmDeclaredType _element = cRef.getElement();
    String _qualifiedName = _element.getQualifiedName();
    _builder.append(_qualifiedName, "");
    return _builder;
  }
  
  protected CharSequence _genPlainText(final CodeBlock cb) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = cb.getContents();
      for(final EObject c : _contents) {
        CharSequence _genPlainText = this.genPlainText(c);
        _builder.append(_genPlainText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genPlainText(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _genPlainText(final Void v) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence genPlainText(final Object cb) {
    if (cb instanceof CodeBlock) {
      return _genPlainText((CodeBlock)cb);
    } else if (cb instanceof CodeRef) {
      return _genPlainText((CodeRef)cb);
    } else if (cb instanceof Emphasize) {
      return _genPlainText((Emphasize)cb);
    } else if (cb instanceof Link) {
      return _genPlainText((Link)cb);
    } else if (cb instanceof Ref) {
      return _genPlainText((Ref)cb);
    } else if (cb instanceof TextOrMarkup) {
      return _genPlainText((TextOrMarkup)cb);
    } else if (cb instanceof TextPart) {
      return _genPlainText((TextPart)cb);
    } else if (cb == null) {
      return _genPlainText((Void)null);
    } else if (cb != null) {
      return _genPlainText(cb);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cb).toString());
    }
  }
}
