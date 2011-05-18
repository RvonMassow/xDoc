lexer grammar Common;

@lexer::header {
package org.eclipse.xtext.xdoc.generator.util.lexer;

}

ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

NUMBER : ('0'..'9')+;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

WS : (' '|'\t'|'\r'|'\n')+;

ANY_OTHER : .;
