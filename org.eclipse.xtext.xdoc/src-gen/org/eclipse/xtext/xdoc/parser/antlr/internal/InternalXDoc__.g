lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : 'chapter:' ;
T11 : '[' ;
T12 : 'chapter[' ;
T13 : ']' ;
T14 : 'section:' ;
T15 : 'section[' ;
T16 : 'subsection:' ;
T17 : 'subsection[' ;
T18 : 'section3:' ;
T19 : 'section3[' ;
T20 : 'section4:' ;
T21 : 'section4[' ;
T22 : '\\[' ;
T23 : '\\]' ;
T24 : 'emph[' ;
T25 : 'a[' ;
T26 : 'ref:' ;
T27 : 'ol[' ;
T28 : 'ul[' ;
T29 : 'item[' ;
T30 : 'codeRef[' ;
T31 : 'link[' ;
T32 : 'img:' ;
T33 : 'img[' ;
T34 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2568
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2570
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2572
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2574
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2576
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2578
RULE_ANY_OTHER : .;


