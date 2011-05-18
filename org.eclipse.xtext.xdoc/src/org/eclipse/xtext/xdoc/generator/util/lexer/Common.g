lexer grammar Common;

@lexer::header {
package org.eclipse.xtext.xdoc.generator.util.lexer;

import org.eclipse.xtext.parser.antlr.Lexer;
}

ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* ('\'' | EOF));

COMMENT : ML_COMMENT | SL_COMMENT;

fragment ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/';

fragment SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')?;

WS : (' '|'\t'|'\r'|'\n')+;

ANY_OTHER : .;
