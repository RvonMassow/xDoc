lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : '\\[' ;
T11 : '\\]' ;
T12 : ':' ;
T13 : '\\chapter' ;
T14 : '[' ;
T15 : ']' ;
T16 : '\\section' ;
T17 : '\\subsection' ;
T18 : '\\section3' ;
T19 : '\\section4' ;
T20 : '\\emph' ;
T21 : '\\a' ;
T22 : '\\ref' ;
T23 : '\\ol' ;
T24 : '\\ul' ;
T25 : '\\item' ;
T26 : '\\codeRef' ;
T27 : '\\link' ;
T28 : '\\img' ;
T29 : '\\code' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7728
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7730
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7732
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7734
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7736
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7738
RULE_ANY_OTHER : .;


