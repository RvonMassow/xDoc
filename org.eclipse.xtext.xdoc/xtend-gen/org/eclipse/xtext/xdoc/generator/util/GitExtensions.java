package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;

@SuppressWarnings("all")
public class GitExtensions {
  public String gitLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
      final String basedir = "https://github.com/eclipse/xtext/blob/v2.2.0/";
      String _switchResult = null;
      String _qualifiedName = ie.getQualifiedName();
      final String name = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(name,null)) {
          _matched=true;
          return ("broken-link in " + ie);
        }
      }
      if (!_matched) {
        boolean _startsWith = name.startsWith("org.eclipse.xtext.common.types.xtext.ui");
        if (_startsWith) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.common.types.ui/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.common.types.");
        if (_startsWith_1) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.common.types/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtext.ui.shared.");
        if (_startsWith_2) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.ui.shared/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtext.xtend2.lib.");
        if (_startsWith_3) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xtend2.lib/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.xtext.xtend2.ui.");
        if (_startsWith_4) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xtend2.ui/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.xtext.xtend2.");
        if (_startsWith_5) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xtend2/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_6 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_6) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xbase.ui/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_7) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xbase.lib/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_8 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_8) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.xbase/src/";
        }
      }
      if (!_matched) {
        boolean _or = false;
        boolean _startsWith_9 = name.startsWith("org.eclipse.xtext.generator");
        if (_startsWith_9) {
          _or = true;
        } else {
          boolean _startsWith_10 = name.startsWith("org.eclipse.xtext.ui.generator");
          _or = (_startsWith_9 || _startsWith_10);
        }
        if (_or) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.generator/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_11 = name.startsWith("org.eclipse.xtext.ui");
        if (_startsWith_11) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.ui/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_12 = name.startsWith("org.eclipse.xtext.junit4");
        if (_startsWith_12) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.junit4/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_13 = name.startsWith("org.eclipse.xtext.junit");
        if (_startsWith_13) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.junit/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_14 = name.startsWith("org.eclipse.xtext.ui");
        if (_startsWith_14) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.ui/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_15 = name.startsWith("org.eclipse.xtext.util");
        if (_startsWith_15) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext.util/src/";
        }
      }
      if (!_matched) {
        boolean _startsWith_16 = name.startsWith("org.eclipse.xtext");
        if (_startsWith_16) {
          _matched=true;
          _switchResult = "plugins/org.eclipse.xtext/src/";
        }
      }
      if (!_matched) {
        _switchResult = "";
      }
      final String prefix = _switchResult;
      String _xifexpression = null;
      int _length = prefix.length();
      boolean _notEquals = (_length != 0);
      if (_notEquals) {
        String _plus = (basedir + prefix);
        String _qualifiedName_1 = ie.getQualifiedName();
        String _replaceAll = _qualifiedName_1.replaceAll("\\.", "/");
        String _replaceAll_1 = _replaceAll.replaceAll("\\$.*$", "");
        String _plus_1 = (_plus + _replaceAll_1);
        String _plus_2 = (_plus_1 + ".java");
        _xifexpression = _plus_2;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String compilationUnitName(final JvmIdentifiableElement ie) {
    String _simpleName = ie.getSimpleName();
    return _simpleName;
  }
}
