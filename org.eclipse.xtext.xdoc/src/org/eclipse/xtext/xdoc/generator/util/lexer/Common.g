lexer grammar Common;

@lexer::header {
package org.eclipse.xtext.xdoc.generator.util.lexer;

import org.eclipse.xtext.parser.antlr.Lexer;
}


RICH_TEXT :
	'\'\'\'' IN_RICH_STRING* (
		'\'\'\'' |
		(
			'\'' '\''?
		)? EOF
	)
;

RICH_TEXT_START :
	'\'\'\'' IN_RICH_STRING* (
		'\'' '\''?
	)? '\u00AB'
;

RICH_TEXT_END :
	'\u00BB' IN_RICH_STRING* (
		'\'\'\'' |
		(
			'\'' '\''?
		)? EOF
	)
;

RICH_TEXT_INBETWEEN :
	'\u00BB' IN_RICH_STRING* (
		'\'' '\''?
	)? '\u00AB'
;

COMMENT_RICH_TEXT_INBETWEEN :
	'\u00AB\u00AB' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n' IN_RICH_STRING* (
			'\'' '\''?
		)? '\u00AB'
	)?
;

COMMENT_RICH_TEXT_END :
	'\u00AB\u00AB' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n' IN_RICH_STRING* (
			'\'\'\'' |
			(
				'\'' '\''?
			)? EOF
		) |
		EOF
	)
;

fragment IN_RICH_STRING :
	'\'\'' ~ (
		'\u00AB' |
		'\''
	) |
	'\'' ~ (
		'\u00AB' |
		'\''
	) |
	~ (
		'\u00AB' |
		'\''
	)
;

HEX :
	(
		'0x' |
		'0X'
	) (
		'0' .. '9' |
		'a' .. 'f' |
		'A' .. 'F' |
		'_'
	)+ (
		'#' (
			(
				'b' |
				'B'
			) (
				'i' |
				'I'
			) |
			(
				'l' |
				'L'
			)
		)
	)?
;

INT :
	'0' .. '9' (
		'0' .. '9' |
		'_'
	)*
;

DECIMAL :
	INT (
		(
			'e' |
			'E'
		) (
			'+' |
			'-'
		)? INT
	)? (
		(
			'b' |
			'B'
		) (
			'i' |
			'I' |
			'd' |
			'D'
		) |
		(
			'l' |
			'L' |
			'd' |
			'D' |
			'f' |
			'F'
		)
	)?
;

ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'$' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'$' |
		'_' |
		'0' .. '9'
	)*
;

STRING :
	'"' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/'
;

SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)?
;

WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+
;

ANY_OTHER :
	.
;