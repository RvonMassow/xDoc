// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g 2012-02-10 15:32:54

package org.eclipse.xtext.xdoc.generator.util.lexer;

import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Common extends Lexer {
    public static final int ANY_OTHER=10;
    public static final int WS=9;
    public static final int EOF=-1;
    public static final int STRING=5;
    public static final int COMMENT=8;
    public static final int ML_COMMENT=6;
    public static final int SL_COMMENT=7;
    public static final int ID=4;

    // delegates
    // delegators

    public Common() {;} 
    public Common(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Common(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:4: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )* )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )*
            {
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:30: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:34: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 5 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:38: '\\\\['
                    {
                    match("\\["); 


                    }
                    break;
                case 6 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:44: '\\\\]'
                    {
                    match("\\]"); 


                    }
                    break;
                case 7 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:50: '\\\\:'
                    {
                    match("\\:"); 


                    }
                    break;
                case 8 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:56: '\\\\%'
                    {
                    match("\\%"); 


                    }
                    break;

            }

            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:63: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )*
            loop3:
            do {
                int alt3=10;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:64: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:73: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:82: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:86: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:96: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 6 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:100: '\\\\['
            	    {
            	    match("\\["); 


            	    }
            	    break;
            	case 7 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:106: '\\\\]'
            	    {
            	    match("\\]"); 


            	    }
            	    break;
            	case 8 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:112: '\\\\:'
            	    {
            	    match("\\:"); 


            	    }
            	    break;
            	case 9 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:118: '\\\\%'
            	    {
            	    match("\\%"); 


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) ) )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) )
            {
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:65: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:85: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF )
                    {
                    match('\''); 
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:90: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:91: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | ']' | '[' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:140: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:157: ( '\\'' | EOF )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    else {
                        alt6=2;}
                    switch (alt6) {
                        case 1 :
                            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:158: '\\''
                            {
                            match('\''); 

                            }
                            break;
                        case 2 :
                            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:165: EOF
                            {
                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:9: ( ML_COMMENT | SL_COMMENT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='*') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='/') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:11: ML_COMMENT
                    {
                    mML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:24: SL_COMMENT
                    {
                    mSL_COMMENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:21: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:23: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:28: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:21: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )? )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:23: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:28: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:28: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:42: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: ( '\\r' )? '\\n'
                    {
                    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ANY_OTHER"
    public final void mANY_OTHER() throws RecognitionException {
        try {
            int _type = ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:11: ( . )
            // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:13: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:8: ( ID | STRING | COMMENT | WS | ANY_OTHER )
        int alt14=5;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:10: ID
                {
                mID(); 

                }
                break;
            case 2 :
                // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:13: STRING
                {
                mSTRING(); 

                }
                break;
            case 3 :
                // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:20: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 4 :
                // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:28: WS
                {
                mWS(); 

                }
                break;
            case 5 :
                // /home/skomp/repos/git/xdoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:31: ANY_OTHER
                {
                mANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\55\4\uffff\1\45\4\uffff";
    static final String DFA2_maxS =
        "\1\172\4\uffff\1\135\4\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\23\uffff\32\2\1\uffff\1\5\2\uffff\1\3\1\uffff\32\1",
            "",
            "",
            "",
            "",
            "\1\11\24\uffff\1\10\40\uffff\1\6\1\uffff\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "9:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )";
        }
    }
    static final String DFA3_eotS =
        "\1\1\13\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\55\6\uffff\1\45\4\uffff";
    static final String DFA3_maxS =
        "\1\172\6\uffff\1\135\4\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11";
    static final String DFA3_specialS =
        "\14\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\6\2\uffff\12\5\7\uffff\32\3\1\uffff\1\7\2\uffff\1\4\1\uffff"+
            "\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\24\uffff\1\12\40\uffff\1\10\1\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 9:63: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '\\\\[' | '\\\\]' | '\\\\:' | '\\\\%' )*";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\13\4\uffff\2\13\1\uffff\1\13\6\uffff";
    static final String DFA14_eofS =
        "\20\uffff";
    static final String DFA14_minS =
        "\1\0\1\55\4\uffff\1\45\1\0\1\uffff\1\52\6\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\172\4\uffff\1\135\1\uffff\1\uffff\1\57\6\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\4\1\2\uffff\1\2\1\uffff\1\4\1\5\1\1\1\2\1\3\1\4";
    static final String DFA14_specialS =
        "\1\1\6\uffff\1\0\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\7\4\13\1\10\5\13\1\5"+
            "\1\13\1\11\21\13\32\3\1\13\1\6\1\13\1\1\1\4\1\13\32\2\uff85"+
            "\13",
            "\1\14\23\uffff\32\14\1\uffff\1\14\2\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "",
            "",
            "\1\14\24\uffff\1\14\40\uffff\1\14\1\uffff\1\14",
            "\0\15",
            "",
            "\1\16\4\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ID | STRING | COMMENT | WS | ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_7 = input.LA(1);

                        s = -1;
                        if ( ((LA14_7>='\u0000' && LA14_7<='\uFFFF')) ) {s = 13;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='^') ) {s = 1;}

                        else if ( ((LA14_0>='a' && LA14_0<='z')) ) {s = 2;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 3;}

                        else if ( (LA14_0=='_') ) {s = 4;}

                        else if ( (LA14_0=='-') ) {s = 5;}

                        else if ( (LA14_0=='\\') ) {s = 6;}

                        else if ( (LA14_0=='\"') ) {s = 7;}

                        else if ( (LA14_0=='\'') ) {s = 8;}

                        else if ( (LA14_0=='/') ) {s = 9;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 10;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0=='.'||(LA14_0>='0' && LA14_0<='@')||LA14_0=='['||LA14_0==']'||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}