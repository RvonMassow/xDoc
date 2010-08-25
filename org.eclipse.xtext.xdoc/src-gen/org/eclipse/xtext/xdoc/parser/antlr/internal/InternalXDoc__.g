lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T9 : '\\chapter' ;
T10 : ':' ;
T11 : '[' ;
T12 : ']' ;
T13 : '\\section' ;
T14 : '\\subsection' ;
T15 : '\\section3' ;
T16 : '\\section4' ;
T17 : '\\emph' ;
T18 : '\\a' ;
T19 : '\\ref' ;
T20 : '\\ol' ;
T21 : '\\ul' ;
T22 : '\\item' ;
T23 : '\\codeRef' ;
T24 : '\\link' ;
T25 : '\\img' ;
T26 : '\\code' ;
T27 : '\\[' ;
T28 : '\\]' ;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2402
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2404
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2406
RULE_MULTI_NL : '\r'? '\n' '\r'? '\n' RULE_WS*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2408
RULE_WS : (' '|'\t'|'\r'|'\n');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2410
RULE_ANY_OTHER : .;


