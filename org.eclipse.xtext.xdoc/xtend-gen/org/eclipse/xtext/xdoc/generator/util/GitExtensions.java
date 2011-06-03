package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GitExtensions {
  
  public String gitLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
      String _compilationUnitName = this.compilationUnitName(ie);
      final String compilationUnitName = _compilationUnitName;
      String _switchResult = null;
      String _qualifiedName = ie.getQualifiedName();
      final String name = _qualifiedName;
      boolean matched = false;
      if (!matched) {
        boolean _startsWith = name.startsWith("org.eclipse.xtext.common.types.xtext.ui");
        if (_startsWith) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.common.types.ui/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.ui.shared.");
        if (_startsWith_1) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.ui.shared/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtext.xtend2.lib.");
        if (_startsWith_2) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtend2.lib/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtext.xtend2.ui.");
        if (_startsWith_3) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtend2.ui/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.xtext.xtend2.");
        if (_startsWith_4) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtend2/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_5) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xbase.ui/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_6 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_6) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xbase.lib/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_7) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xbase/src/";
        }
      }
      if (!matched) {
        boolean _operator_or = false;
        boolean _startsWith_8 = name.startsWith("org.eclipse.xtext.generator");
        if (_startsWith_8) {
          _operator_or = true;
        } else {
          boolean _startsWith_9 = name.startsWith("org.eclipse.xtext.ui.generator");
          _operator_or = BooleanExtensions.operator_or(_startsWith_8, _startsWith_9);
        }
        if (_operator_or) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.generator/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_10 = name.startsWith("org.eclipse.xtext.ui");
        if (_startsWith_10) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.ui/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_11 = name.startsWith("org.eclipse.xtext.junit");
        if (_startsWith_11) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.junit/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_12 = name.startsWith("org.eclipse.xtext.xtext");
        if (_startsWith_12) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtext/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_13 = name.startsWith("org.eclipse.xtext.ui");
        if (_startsWith_13) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.ui/src/";
        }
      }
      if (!matched) {
        boolean _startsWith_14 = name.startsWith("org.eclipse.xtext");
        if (_startsWith_14) {
          matched=true;
          _switchResult = "http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext/src/";
        }
      }
      if (!matched) {
        _switchResult = "";
      }
      final String prefix = _switchResult;
      String _xifexpression = null;
      int _length = prefix.length();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_length), ((Integer)0));
      if (_operator_notEquals) {
        String _qualifiedName_1 = ie.getQualifiedName();
        String _replaceAll = _qualifiedName_1.replaceAll("\\.", "/");
        String _replaceAll_1 = _replaceAll.replaceAll("\\$.*$", "");
        String _operator_plus = StringExtensions.operator_plus(prefix, _replaceAll_1);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".java");
        _xifexpression = _operator_plus_1;
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