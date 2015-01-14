package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.generator.trace.AbstractTraceRegion;
import org.eclipse.xtext.generator.trace.TraceRegionSerializer;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class GitExtensions {
  private final static String XTEXT_BASE_DIR = "https://github.com/eclipse/xtext/blob/v2.7.0/plugins/";
  
  private final static String XTEND_BASE_DIR = GitExtensions.XTEXT_BASE_DIR;
  
  private final static String MWE_BASE_DIR = "https://github.com/eclipse/mwe/blob/v2.7.0/plugins/";
  
  private final static String EMF_BASE_DIR = "https://github.com/eclipse/emf/blob/R2_9_0/plugins/";
  
  private final static String SEVENLANGUAGES_BASEDIR = "https://github.com/xtext-dev/seven-languages-xtext/blob/master/";
  
  private final static Set<String> XTEXT_EMF_CLASSES = IterableExtensions.<String>toSet(ListExtensions.<EClassifier, String>map(XtextPackage.eINSTANCE.getEClassifiers(), new Function1<EClassifier, String>() {
    public String apply(final EClassifier it) {
      return it.getName();
    }
  }));
  
  private final static Set<String> XBASE_EMF_CLASSES = IterableExtensions.<String>toSet(Iterables.<String>concat(ListExtensions.<EClassifier, String>map(XbasePackage.eINSTANCE.getEClassifiers(), new Function1<EClassifier, String>() {
    public String apply(final EClassifier it) {
      return it.getName();
    }
  }), 
    ListExtensions.<EClassifier, String>map(XtypePackage.eINSTANCE.getEClassifiers(), new Function1<EClassifier, String>() {
      public String apply(final EClassifier it) {
        return it.getName();
      }
    })));
  
  private final static Set<String> JVM_EMF_CLASSES = IterableExtensions.<String>toSet(ListExtensions.<EClassifier, String>map(TypesPackage.eINSTANCE.getEClassifiers(), new Function1<EClassifier, String>() {
    public String apply(final EClassifier it) {
      return it.getName();
    }
  }));
  
  private final static HashSet<String> SEVEN_LANGUAGE_PLUGIN_SUFFIXES = CollectionLiterals.<String>newHashSet("ui", "tests", "lib", "examples");
  
  public String gitLink(final JvmIdentifiableElement ie) {
    Object _xblockexpression = null;
    {
      String _switchResult = null;
      String _qualifiedName = ie.getQualifiedName();
      final String name = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(name, null)) {
          _matched=true;
          return ("broken-link in " + ie);
        }
      }
      if (!_matched) {
        boolean _startsWith = name.startsWith("org.eclipse.xtext.common.types.xtext.ui");
        if (_startsWith) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types.ui/src/");
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
          _and = _contains;
        }
        if (_and) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/emf-gen/");
        }
      }
      if (!_matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtext.common.types.");
        if (_startsWith_2) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtext.ui.shared.");
        if (_startsWith_3) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui.shared/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.xtext.xtend2.lib.");
        if (_startsWith_4) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.lib/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.xtext.xtend2.ui.");
        if (_startsWith_5) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_6 = name.startsWith("org.eclipse.xtext.xtend2.");
        if (_startsWith_6) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_7) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_8 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_8) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/");
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
          _and_1 = _contains_1;
        }
        if (_and_1) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/emf-gen/");
        }
      }
      if (!_matched) {
        boolean _startsWith_10 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_10) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/");
        }
      }
      if (!_matched) {
        boolean _and_2 = false;
        boolean _or = false;
        boolean _startsWith_11 = name.startsWith("org.eclipse.xtext.generator.");
        if (_startsWith_11) {
          _or = true;
        } else {
          boolean _startsWith_12 = name.startsWith("org.eclipse.xtext.ui.generator.");
          _or = _startsWith_12;
        }
        if (!_or) {
          _and_2 = false;
        } else {
          String _simpleName_2 = ie.getSimpleName();
          boolean _notEquals = (!Objects.equal("IGenerator", _simpleName_2));
          _and_2 = _notEquals;
        }
        if (_and_2) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.generator/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_13 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_13) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_14 = name.startsWith("org.eclipse.xtext.junit4.");
        if (_startsWith_14) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit4/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_15 = name.startsWith("org.eclipse.xtext.junit.");
        if (_startsWith_15) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_16 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_16) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_17 = name.startsWith("org.eclipse.xtext.util.");
        if (_startsWith_17) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.util/src/");
        }
      }
      if (!_matched) {
        boolean _and_3 = false;
        boolean _startsWith_18 = name.startsWith("org.eclipse.xtext.");
        if (!_startsWith_18) {
          _and_3 = false;
        } else {
          String _simpleName_3 = ie.getSimpleName();
          boolean _contains_2 = GitExtensions.XTEXT_EMF_CLASSES.contains(_simpleName_3);
          _and_3 = _contains_2;
        }
        if (_and_3) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/emf-gen/");
        }
      }
      if (!_matched) {
        boolean _startsWith_19 = name.startsWith("org.eclipse.xtext.");
        if (_startsWith_19) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_20 = name.startsWith("org.eclipse.emf.mwe.utils.");
        if (_startsWith_20) {
          _matched=true;
          _switchResult = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe.utils/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_21 = name.startsWith("org.eclipse.emf.mwe2.runtime.");
        if (_startsWith_21) {
          _matched=true;
          _switchResult = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe2.runtime/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_22 = name.startsWith("org.eclipse.emf.mwe2.launch.");
        if (_startsWith_22) {
          _matched=true;
          _switchResult = (GitExtensions.MWE_BASE_DIR + "org.eclipse.emf.mwe2.launch/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_23 = name.startsWith("org.eclipse.emf.common.");
        if (_startsWith_23) {
          _matched=true;
          _switchResult = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.common/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_24 = name.startsWith("org.eclipse.emf.");
        if (_startsWith_24) {
          _matched=true;
          _switchResult = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.ecore/src/");
        }
      }
      if (!_matched) {
        boolean _or_1 = false;
        boolean _startsWith_25 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_25) {
          _or_1 = true;
        } else {
          boolean _startsWith_26 = name.startsWith("org.eclipse.xtend2.lib.");
          _or_1 = _startsWith_26;
        }
        if (_or_1) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_27 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_27) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_28 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_28) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_29 = name.startsWith("org.eclipse.xtend.lib.macro");
        if (_startsWith_29) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtend.lib.macro/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_30 = name.startsWith("org.eclipse.xtend.lib.");
        if (_startsWith_30) {
          _matched=true;
          _switchResult = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtend.lib/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_31 = name.startsWith("org.eclipse.xtend.ui.");
        if (_startsWith_31) {
          _matched=true;
          _switchResult = (GitExtensions.XTEND_BASE_DIR + "org.eclipse.xtend.ui/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_32 = name.startsWith("org.eclipse.xtend.core.");
        if (_startsWith_32) {
          _matched=true;
          _switchResult = (GitExtensions.XTEND_BASE_DIR + "org.eclipse.xtend.core/src/");
        }
      }
      if (!_matched) {
        boolean _startsWith_33 = name.startsWith("org.xtext.");
        if (_startsWith_33) {
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
            _xblockexpression_1 = _builder.toString();
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        _switchResult = "";
      }
      final String prefix = _switchResult;
      Object _xifexpression = null;
      int _length = prefix.length();
      boolean _notEquals_1 = (_length != 0);
      if (_notEquals_1) {
        EObject _rootContainer = EcoreUtil.getRootContainer(ie);
        String _qualifiedName_1 = ((JvmIdentifiableElement) _rootContainer).getQualifiedName();
        String _findOriginalSource = this.findOriginalSource(_qualifiedName_1);
        return (prefix + _findOriginalSource);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return ((String)_xblockexpression);
  }
  
  public String findOriginalSource(final String qualifiedName) {
    try {
      String _replace = qualifiedName.replace(".", "/");
      final String javaFileName = (_replace + ".class");
      Class<? extends GitExtensions> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      final URL url = _classLoader.getResource(javaFileName);
      boolean _notEquals = (!Objects.equal(url, null));
      if (_notEquals) {
        URL traceFile = this.calculateTraceFileName(url, javaFileName, qualifiedName);
        TraceRegionSerializer _traceRegionSerializer = new TraceRegionSerializer();
        InputStream _openStream = traceFile.openStream();
        final AbstractTraceRegion traceRegion = _traceRegionSerializer.readTraceRegionFrom(_openStream);
        URI _associatedPath = traceRegion.getAssociatedPath();
        return _associatedPath.toString();
      }
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    String _replace_1 = qualifiedName.replace(".", "/");
    return (_replace_1 + ".java");
  }
  
  public URL calculateTraceFileName(final URL classFileURL, final String classFileName, final String qualifiedName) {
    try {
      int _lastIndexOf = qualifiedName.lastIndexOf(".");
      int _plus = (_lastIndexOf + 1);
      final String simpleName = qualifiedName.substring(_plus);
      int _lastIndexOf_1 = qualifiedName.lastIndexOf(".");
      final String packageName = qualifiedName.substring(0, _lastIndexOf_1);
      URL traceFile = null;
      String _string = classFileURL.toString();
      boolean _contains = _string.contains(("bin/" + classFileName));
      if (_contains) {
        String _string_1 = classFileURL.toString();
        String _replace = packageName.replace(".", "/");
        String _plus_1 = ("xtend-gen/" + _replace);
        String _plus_2 = (_plus_1 + "/.");
        String _plus_3 = (_plus_2 + simpleName);
        String _plus_4 = (_plus_3 + ".java._trace");
        String _replace_1 = _string_1.replace(("bin/" + classFileName), _plus_4);
        URL _uRL = new URL(_replace_1);
        traceFile = _uRL;
      } else {
        String _string_2 = classFileURL.toString();
        String _replace_2 = _string_2.replace((simpleName + ".class"), (("." + simpleName) + ".java._trace"));
        URL _uRL_1 = new URL(_replace_2);
        traceFile = _uRL_1;
      }
      return traceFile;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
