package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class GitExtensions {
  private final static String XTEXT_BASE_DIR = "https://github.com/eclipse/xtext/blob/v2.4.2/plugins/";
  
  private final static String XTEND_BASE_DIR = GitExtensions.XTEXT_BASE_DIR;
  
  private final static String MWE_BASE_DIR = "https://github.com/eclipse/mwe/blob/v2.3.0/plugins/";
  
  private final static String EMF_BASE_DIR = "https://github.com/eclipse/emf/blob/R2_8_0/plugins/";
  
  private final static String SEVENLANGUAGES_BASEDIR = "https://github.com/xtext-dev/seven-languages-xtext/blob/master/";
  
  private final static Set<String> XTEXT_EMF_CLASSES = new Function0<Set<String>>() {
    public Set<String> apply() {
      EList<EClassifier> _eClassifiers = XtextPackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier,String> _function = new Function1<EClassifier,String>() {
          public String apply(final EClassifier it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
      Set<String> _set = IterableExtensions.<String>toSet(_map);
      return _set;
    }
  }.apply();
  
  private final static Set<String> XBASE_EMF_CLASSES = new Function0<Set<String>>() {
    public Set<String> apply() {
      EList<EClassifier> _eClassifiers = XbasePackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier,String> _function = new Function1<EClassifier,String>() {
          public String apply(final EClassifier it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
      EList<EClassifier> _eClassifiers_1 = XtypePackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier,String> _function_1 = new Function1<EClassifier,String>() {
          public String apply(final EClassifier it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<String> _map_1 = ListExtensions.<EClassifier, String>map(_eClassifiers_1, _function_1);
      Iterable<String> _plus = Iterables.<String>concat(_map, _map_1);
      Set<String> _set = IterableExtensions.<String>toSet(_plus);
      return _set;
    }
  }.apply();
  
  private final static Set<String> JVM_EMF_CLASSES = new Function0<Set<String>>() {
    public Set<String> apply() {
      EList<EClassifier> _eClassifiers = TypesPackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier,String> _function = new Function1<EClassifier,String>() {
          public String apply(final EClassifier it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
      Set<String> _set = IterableExtensions.<String>toSet(_map);
      return _set;
    }
  }.apply();
  
  private final static HashSet<String> SEVEN_LANGUAGE_PLUGIN_SUFFIXES = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("ui", "tests", "lib", "examples");
      return _newHashSet;
    }
  }.apply();
  
  public String gitLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
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
          String _plus = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types.ui/src/");
          _switchResult = _plus;
        }
      }
      if (!_matched) {
        boolean _and = false;
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.common.types.");
        if (!_startsWith_1) {
          _and = false;
        } else {
          String _simpleName = ie.getSimpleName();
          boolean _contains = GitExtensions.JVM_EMF_CLASSES.contains(_simpleName);
          _and = (_startsWith_1 && _contains);
        }
        if (_and) {
          _matched=true;
          String _plus_1 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/emf-gen/");
          _switchResult = _plus_1;
        }
      }
      if (!_matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtext.common.types.");
        if (_startsWith_2) {
          _matched=true;
          String _plus_2 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/src/");
          _switchResult = _plus_2;
        }
      }
      if (!_matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtext.ui.shared.");
        if (_startsWith_3) {
          _matched=true;
          String _plus_3 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui.shared/src/");
          _switchResult = _plus_3;
        }
      }
      if (!_matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.xtext.xtend2.lib.");
        if (_startsWith_4) {
          _matched=true;
          String _plus_4 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.lib/src/");
          _switchResult = _plus_4;
        }
      }
      if (!_matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.xtext.xtend2.ui.");
        if (_startsWith_5) {
          _matched=true;
          String _plus_5 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.ui/src/");
          _switchResult = _plus_5;
        }
      }
      if (!_matched) {
        boolean _startsWith_6 = name.startsWith("org.eclipse.xtext.xtend2.");
        if (_startsWith_6) {
          _matched=true;
          String _plus_6 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2/src/");
          _switchResult = _plus_6;
        }
      }
      if (!_matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_7) {
          _matched=true;
          String _plus_7 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/");
          _switchResult = _plus_7;
        }
      }
      if (!_matched) {
        boolean _startsWith_8 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_8) {
          _matched=true;
          String _plus_8 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/");
          _switchResult = _plus_8;
        }
      }
      if (!_matched) {
        boolean _and_1 = false;
        boolean _startsWith_9 = name.startsWith("org.eclipse.xtext.xbase.");
        if (!_startsWith_9) {
          _and_1 = false;
        } else {
          String _simpleName_1 = ie.getSimpleName();
          boolean _contains_1 = GitExtensions.XBASE_EMF_CLASSES.contains(_simpleName_1);
          _and_1 = (_startsWith_9 && _contains_1);
        }
        if (_and_1) {
          _matched=true;
          String _plus_9 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/emf-gen/");
          _switchResult = _plus_9;
        }
      }
      if (!_matched) {
        boolean _startsWith_10 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_10) {
          _matched=true;
          String _plus_10 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/");
          _switchResult = _plus_10;
        }
      }
      if (!_matched) {
        boolean _or = false;
        boolean _startsWith_11 = name.startsWith("org.eclipse.xtext.generator.");
        if (_startsWith_11) {
          _or = true;
        } else {
          boolean _startsWith_12 = name.startsWith("org.eclipse.xtext.ui.generator.");
          _or = (_startsWith_11 || _startsWith_12);
        }
        if (_or) {
          _matched=true;
          String _plus_11 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.generator/src/");
          _switchResult = _plus_11;
        }
      }
      if (!_matched) {
        boolean _startsWith_13 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_13) {
          _matched=true;
          String _plus_12 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
          _switchResult = _plus_12;
        }
      }
      if (!_matched) {
        boolean _startsWith_14 = name.startsWith("org.eclipse.xtext.junit4.");
        if (_startsWith_14) {
          _matched=true;
          String _plus_13 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit4/src/");
          _switchResult = _plus_13;
        }
      }
      if (!_matched) {
        boolean _startsWith_15 = name.startsWith("org.eclipse.xtext.junit.");
        if (_startsWith_15) {
          _matched=true;
          String _plus_14 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit/src/");
          _switchResult = _plus_14;
        }
      }
      if (!_matched) {
        boolean _startsWith_16 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_16) {
          _matched=true;
          String _plus_15 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
          _switchResult = _plus_15;
        }
      }
      if (!_matched) {
        boolean _startsWith_17 = name.startsWith("org.eclipse.xtext.util.");
        if (_startsWith_17) {
          _matched=true;
          String _plus_16 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.util/src/");
          _switchResult = _plus_16;
        }
      }
      if (!_matched) {
        boolean _and_2 = false;
        boolean _startsWith_18 = name.startsWith("org.eclipse.xtext.");
        if (!_startsWith_18) {
          _and_2 = false;
        } else {
          String _simpleName_2 = ie.getSimpleName();
          boolean _contains_2 = GitExtensions.XTEXT_EMF_CLASSES.contains(_simpleName_2);
          _and_2 = (_startsWith_18 && _contains_2);
        }
        if (_and_2) {
          _matched=true;
          String _plus_17 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/emf-gen/");
          _switchResult = _plus_17;
        }
      }
      if (!_matched) {
        boolean _startsWith_19 = name.startsWith("org.eclipse.xtext.");
        if (_startsWith_19) {
          _matched=true;
          String _plus_18 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/src/");
          _switchResult = _plus_18;
        }
      }
      if (!_matched) {
        boolean _startsWith_20 = name.startsWith("org.eclipse.emf.mwe.utils.");
        if (_startsWith_20) {
          _matched=true;
          String _plus_19 = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe.utils/src/");
          _switchResult = _plus_19;
        }
      }
      if (!_matched) {
        boolean _startsWith_21 = name.startsWith("org.eclipse.emf.mwe2.runtime.");
        if (_startsWith_21) {
          _matched=true;
          String _plus_20 = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe2.runtime/src/");
          _switchResult = _plus_20;
        }
      }
      if (!_matched) {
        boolean _startsWith_22 = name.startsWith("org.eclipse.emf.mwe2.launch.");
        if (_startsWith_22) {
          _matched=true;
          String _plus_21 = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe2.launch/src/");
          _switchResult = _plus_21;
        }
      }
      if (!_matched) {
        boolean _startsWith_23 = name.startsWith("org.eclipse.emf.common.");
        if (_startsWith_23) {
          _matched=true;
          String _plus_22 = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.common/src/");
          _switchResult = _plus_22;
        }
      }
      if (!_matched) {
        boolean _startsWith_24 = name.startsWith("org.eclipse.emf.");
        if (_startsWith_24) {
          _matched=true;
          String _plus_23 = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.ecore/src/");
          _switchResult = _plus_23;
        }
      }
      if (!_matched) {
        boolean _or_1 = false;
        boolean _startsWith_25 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_25) {
          _or_1 = true;
        } else {
          boolean _startsWith_26 = name.startsWith("org.eclipse.xtend2.lib.");
          _or_1 = (_startsWith_25 || _startsWith_26);
        }
        if (_or_1) {
          _matched=true;
          String _plus_24 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/");
          _switchResult = _plus_24;
        }
      }
      if (!_matched) {
        boolean _startsWith_27 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_27) {
          _matched=true;
          String _plus_25 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/");
          _switchResult = _plus_25;
        }
      }
      if (!_matched) {
        boolean _startsWith_28 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_28) {
          _matched=true;
          String _plus_26 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/");
          _switchResult = _plus_26;
        }
      }
      if (!_matched) {
        boolean _startsWith_29 = name.startsWith("org.eclipse.xtend.lib.");
        if (_startsWith_29) {
          _matched=true;
          String _plus_27 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtend.lib/src/");
          _switchResult = _plus_27;
        }
      }
      if (!_matched) {
        boolean _startsWith_30 = name.startsWith("org.eclipse.xtend.ui.");
        if (_startsWith_30) {
          _matched=true;
          String _plus_28 = (GitExtensions.XTEND_BASE_DIR + "org.eclipse.xtend.ui/src/");
          _switchResult = _plus_28;
        }
      }
      if (!_matched) {
        boolean _startsWith_31 = name.startsWith("org.eclipse.xtend.core.");
        if (_startsWith_31) {
          _matched=true;
          String _plus_29 = (GitExtensions.XTEND_BASE_DIR + "org.eclipse.xtend.core/src/");
          _switchResult = _plus_29;
        }
      }
      if (!_matched) {
        boolean _startsWith_32 = name.startsWith("org.xtext.");
        if (_startsWith_32) {
          _matched=true;
          String _xblockexpression_1 = null;
          {
            String[] _split = name.split("\\.");
            final String languageID = _split[2];
            String[] _split_1 = name.split("\\.");
            final String pluginSuffix = _split_1[3];
            String _xifexpression = null;
            boolean _equals = Objects.equal(pluginSuffix, "examples");
            if (_equals) {
              _xifexpression = "examples";
            } else {
              _xifexpression = "languages";
            }
            final String subdir = _xifexpression;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(GitExtensions.SEVENLANGUAGES_BASEDIR, "");
            _builder.append(subdir, "");
            _builder.append("/org.xtext.");
            _builder.append(languageID, "");
            {
              boolean _contains_3 = GitExtensions.SEVEN_LANGUAGE_PLUGIN_SUFFIXES.contains(pluginSuffix);
              if (_contains_3) {
                _builder.append(".");
                _builder.append(pluginSuffix, "");
              }
            }
            _builder.append("/src/");
            _xblockexpression_1 = (_builder.toString());
          }
          _switchResult = _xblockexpression_1;
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
        String _switchResult_1 = null;
        Resource _eResource = null;
        if (ie!=null) {
          _eResource=ie.eResource();
        }
        URI _uRI = null;
        if (_eResource!=null) {
          _uRI=_eResource.getURI();
        }
        final URI uri = _uRI;
        boolean _matched_1 = false;
        if (!_matched_1) {
          String _scheme = uri.scheme();
          boolean _equals = Objects.equal(_scheme, "java");
          if (_equals) {
            _matched_1=true;
            String _qualifiedName_1 = ie.getQualifiedName();
            String _replaceAll = _qualifiedName_1.replaceAll("\\.", "/");
            String _replaceAll_1 = _replaceAll.replaceAll("\\$.*$", "");
            String _plus_30 = (prefix + _replaceAll_1);
            String _plus_31 = (_plus_30 + ".");
            String _plus_32 = (_plus_31 + "java");
            _switchResult_1 = _plus_32;
          }
        }
        if (!_matched_1) {
          String _packageName = ((JvmDeclaredType) ie).getPackageName();
          String _replaceAll_2 = _packageName.replaceAll("\\.", "/");
          String _plus_33 = (prefix + _replaceAll_2);
          String _plus_34 = (_plus_33 + "/");
          String _lastSegment = uri.lastSegment();
          String _plus_35 = (_plus_34 + _lastSegment);
          _switchResult_1 = _plus_35;
        }
        _xifexpression = _switchResult_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
