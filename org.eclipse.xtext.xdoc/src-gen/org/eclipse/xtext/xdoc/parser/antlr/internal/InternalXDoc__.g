lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : '\\chapter' ;
T11 : ':' ;
T12 : '[' ;
T13 : ']' ;
T14 : '\\section' ;
T15 : '\\subsection' ;
T16 : '\\section3' ;
T17 : '\\section4' ;
T18 : '\\[' ;
T19 : '\\]' ;
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

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2672
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2674
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2676
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2678
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2680
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2682
RULE_ANY_OTHER : .;


