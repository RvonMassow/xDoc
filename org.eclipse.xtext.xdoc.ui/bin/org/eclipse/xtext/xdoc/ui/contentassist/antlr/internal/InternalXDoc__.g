lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T9 : '\\[' ;
T10 : '\\]' ;
T11 : ':' ;
T12 : '\\chapter' ;
T13 : '[' ;
T14 : ']' ;
T15 : '\\section' ;
T16 : '\\subsection' ;
T17 : '\\section3' ;
T18 : '\\section4' ;
T19 : '\\emph' ;
T20 : '\\a' ;
T21 : '\\ref' ;
T22 : '\\ol' ;
T23 : '\\ul' ;
T24 : '\\item' ;
T25 : '\\codeRef' ;
T26 : '\\link' ;
T27 : '\\img' ;
T28 : '\\code' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 6409
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 6411
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 6413
RULE_MULTI_NL : '\r'? '\n' '\r'? '\n' RULE_WS*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 6415
RULE_WS : (' '|'\t'|'\r'|'\n');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 6417
RULE_ANY_OTHER : .;


