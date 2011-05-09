package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.xdoc.GlossaryEntry;

@SuppressWarnings("all")
public class GlossaryExtensions {
  
  public GlossaryEntry getEntry(final Iterable<GlossaryEntry> glossary, final String aliasOrName) {
    GlossaryEntry _xblockexpression = null;
    {
      final Function1<GlossaryEntry,Boolean> _function = new Function1<GlossaryEntry,Boolean>() {
          public Boolean apply(final GlossaryEntry s) {
            String _name = s.getName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_name, aliasOrName);
            return ((Boolean)_operator_equals);
          }
        };
      GlossaryEntry _findFirst = IterableExtensions.<GlossaryEntry>findFirst(glossary, _function);
      GlossaryEntry matchedEntry = _findFirst;
      GlossaryEntry _xifexpression = null;
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(matchedEntry, null);
      if (_operator_equals_1) {
        final Function1<GlossaryEntry,Boolean> _function_1 = new Function1<GlossaryEntry,Boolean>() {
            public Boolean apply(final GlossaryEntry s_1) {
              EList<String> _alias = s_1.getAlias();
              boolean _contains = _alias.contains(aliasOrName);
              return ((Boolean)_contains);
            }
          };
        GlossaryEntry _findFirst_1 = IterableExtensions.<GlossaryEntry>findFirst(glossary, _function_1);
        _xifexpression = _findFirst_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}