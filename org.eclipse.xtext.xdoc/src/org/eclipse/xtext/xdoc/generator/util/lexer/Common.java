// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g 2011-05-18 15:25:24

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
    public String getGrammarFileName() { return "/Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:4: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:6: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:9:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) ) )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) )
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:57: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:77: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' | EOF )
                    {
                    match('\''); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:82: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:83: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:124: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:141: ( '\\'' | EOF )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\'') ) {
                        alt5=1;
                    }
                    else {
                        alt5=2;}
                    switch (alt5) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:142: '\\''
                            {
                            match('\''); 

                            }
                            break;
                        case 2 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:149: EOF
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:9: ( ML_COMMENT | SL_COMMENT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='*') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='/') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:11: ML_COMMENT
                    {
                    mML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:24: SL_COMMENT
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:21: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:23: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:28: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:15:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:21: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )? )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:23: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:28: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:28: ~ ( '\\n' | '\\r' )
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
            	    break loop9;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:42: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: ( '\\r' )? '\\n'
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:17:43: '\\r'
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:11: ( . )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:13: .
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
        // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:8: ( ID | STRING | COMMENT | WS | ANY_OTHER )
        int alt13=5;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:10: ID
                {
                mID(); 

                }
                break;
            case 2 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:13: STRING
                {
                mSTRING(); 

                }
                break;
            case 3 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:20: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 4 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:28: WS
                {
                mWS(); 

                }
                break;
            case 5 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:31: ANY_OTHER
                {
                mANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\6\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\1\0\1\101\1\uffff\1\0\1\uffff\1\52\6\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\1\uffff\1\uffff\1\57\6\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\4\1\5\1\1\1\2\1\3\1\4";
    static final String DFA13_specialS =
        "\1\1\2\uffff\1\0\10\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\7\2\6\2\7\1\6\22\7\1\6\1\7\1\3\4\7\1\4\7\7\1\5\21\7\32\2"+
            "\3\7\1\1\1\2\1\7\32\2\uff85\7",
            "\32\10\4\uffff\1\10\1\uffff\32\10",
            "",
            "\0\11",
            "",
            "\1\12\4\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ID | STRING | COMMENT | WS | ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_3 = input.LA(1);

                        s = -1;
                        if ( ((LA13_3>='\u0000' && LA13_3<='\uFFFF')) ) {s = 9;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='^') ) {s = 1;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 2;}

                        else if ( (LA13_0=='\"') ) {s = 3;}

                        else if ( (LA13_0=='\'') ) {s = 4;}

                        else if ( (LA13_0=='/') ) {s = 5;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 6;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>='0' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}