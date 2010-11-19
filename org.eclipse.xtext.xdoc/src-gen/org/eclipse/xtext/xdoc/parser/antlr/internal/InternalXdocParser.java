package org.eclipse.xtext.xdoc.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.xdoc.services.XdocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'document['", "']'", "'subtitle['", "'authors['", "'chapter:'", "'['", "'chapter['", "'chapter-ref['", "'section:'", "'section['", "'section-ref['", "'section2:'", "'section2['", "'section3:'", "'section3['", "'section4:'", "'section4['", "'\\\\['", "'\\\\]'", "','", "'-'", "'table['", "'tr['", "'td['", "'e['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'img['", "'code['", "'todo['", "'codelanguage-def['"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__13=13;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__17=17;
    public static final int T__27=27;
    public static final int RULE_MULTI_NL=5;
    public static final int T__24=24;
    public static final int T__10=10;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int RULE_ID=6;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__44=44;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__11=11;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_WS=4;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int RULE_SINGLE_NL=7;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__41=41;
    public static final int T__18=18;

    // delegates
    // delegators


        public InternalXdocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXdocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXdocParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g"; }



     	private XdocGrammarAccess grammarAccess;
     	
        public InternalXdocParser(TokenStream input, IAstFactory factory, XdocGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XdocFile";	
       	}
       	
       	@Override
       	protected XdocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXdocFile"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:70:1: entryRuleXdocFile returns [EObject current=null] : iv_ruleXdocFile= ruleXdocFile EOF ;
    public final EObject entryRuleXdocFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXdocFile = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:71:2: (iv_ruleXdocFile= ruleXdocFile EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:72:2: iv_ruleXdocFile= ruleXdocFile EOF
            {
             newCompositeNode(grammarAccess.getXdocFileRule()); 
            pushFollow(FOLLOW_ruleXdocFile_in_entryRuleXdocFile75);
            iv_ruleXdocFile=ruleXdocFile();

            state._fsp--;

             current =iv_ruleXdocFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXdocFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXdocFile"


    // $ANTLR start "ruleXdocFile"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:79:1: ruleXdocFile returns [EObject current=null] : ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) ;
    public final EObject ruleXdocFile() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        EObject lv_mainSection_3_1 = null;

        EObject lv_mainSection_3_2 = null;

        EObject lv_mainSection_3_3 = null;

        EObject lv_mainSection_3_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:82:28: ( ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:83:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:83:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:83:2: () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:83:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:84:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXdocFileAccess().getXdocFileAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:89:2: (this_WS_1= RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:89:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleXdocFile131); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getXdocFileAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:93:3: (this_MULTI_NL_2= RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:93:4: this_MULTI_NL_2= RULE_MULTI_NL
                    {
                    this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144); 
                     
                        newLeafNode(this_MULTI_NL_2, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:3: ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10||LA5_0==14||(LA5_0>=16 && LA5_0<=22)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:98:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:98:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:99:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:99:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 )
                    int alt3=4;
                    switch ( input.LA(1) ) {
                    case 10:
                        {
                        alt3=1;
                        }
                        break;
                    case 14:
                    case 16:
                    case 17:
                        {
                        alt3=2;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                        {
                        alt3=3;
                        }
                        break;
                    case 21:
                    case 22:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:100:3: lv_mainSection_3_1= ruleDocument
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionDocumentParserRuleCall_3_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocument_in_ruleXdocFile169);
                            lv_mainSection_3_1=ruleDocument();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_1, 
                                    		"Document");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:115:8: lv_mainSection_3_2= ruleChapter
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionChapterParserRuleCall_3_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleChapter_in_ruleXdocFile188);
                            lv_mainSection_3_2=ruleChapter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_2, 
                                    		"Chapter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:130:8: lv_mainSection_3_3= ruleSection
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionSectionParserRuleCall_3_0_0_2()); 
                            	    
                            pushFollow(FOLLOW_ruleSection_in_ruleXdocFile207);
                            lv_mainSection_3_3=ruleSection();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_3, 
                                    		"Section");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:145:8: lv_mainSection_3_4= ruleSection2
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionSection2ParserRuleCall_3_0_0_3()); 
                            	    
                            pushFollow(FOLLOW_ruleSection2_in_ruleXdocFile226);
                            lv_mainSection_3_4=ruleSection2();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_4, 
                                    		"Section2");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:163:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_MULTI_NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:163:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile241); 
                             
                                newLeafNode(this_MULTI_NL_4, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXdocFile"


    // $ANTLR start "entryRuleDocument"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:175:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:176:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:177:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument280);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:184:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_MULTI_NL_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_MULTI_NL_11=null;
        Token this_MULTI_NL_13=null;
        EObject lv_title_1_0 = null;

        EObject lv_subtitle_5_0 = null;

        EObject lv_authors_9_0 = null;

        EObject lv_langDefs_12_0 = null;

        EObject lv_chapters_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:187:28: ( (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:188:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:188:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:188:3: otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleDocument327); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDocumentKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:192:1: ( (lv_title_1_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:193:1: (lv_title_1_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:193:1: (lv_title_1_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:194:3: lv_title_1_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument348);
            lv_title_1_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleDocument360); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:214:1: (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_MULTI_NL) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==12) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:214:2: this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']'
                    {
                    this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument372); 
                     
                        newLeafNode(this_MULTI_NL_3, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0()); 
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDocument383); 

                        	newLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getSubtitleKeyword_3_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:222:1: ( (lv_subtitle_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:223:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:223:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:224:3: lv_subtitle_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getSubtitleTextOrMarkupParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument404);
                    lv_subtitle_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"subtitle",
                            		lv_subtitle_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleDocument416); 

                        	newLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:244:3: (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_MULTI_NL) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==13) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:244:4: this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']'
                    {
                    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument430); 
                     
                        newLeafNode(this_MULTI_NL_7, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_4_0()); 
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDocument441); 

                        	newLeafNode(otherlv_8, grammarAccess.getDocumentAccess().getAuthorsKeyword_4_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:252:1: ( (lv_authors_9_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:253:1: (lv_authors_9_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:253:1: (lv_authors_9_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:254:3: lv_authors_9_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getAuthorsTextOrMarkupParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument462);
                    lv_authors_9_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"authors",
                            		lv_authors_9_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleDocument474); 

                        	newLeafNode(otherlv_10, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:274:3: (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_MULTI_NL) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==46) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:274:4: this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) )
            	    {
            	    this_MULTI_NL_11=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument488); 
            	     
            	        newLeafNode(this_MULTI_NL_11, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:278:1: ( (lv_langDefs_12_0= ruleLangDef ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:279:1: (lv_langDefs_12_0= ruleLangDef )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:279:1: (lv_langDefs_12_0= ruleLangDef )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:280:3: lv_langDefs_12_0= ruleLangDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getLangDefsLangDefParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLangDef_in_ruleDocument508);
            	    lv_langDefs_12_0=ruleLangDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"langDefs",
            	            		lv_langDefs_12_0, 
            	            		"LangDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:296:4: (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_MULTI_NL) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==14||(LA9_1>=16 && LA9_1<=17)) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:296:5: this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) )
            	    {
            	    this_MULTI_NL_13=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument522); 
            	     
            	        newLeafNode(this_MULTI_NL_13, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_6_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:300:1: ( (lv_chapters_14_0= ruleChapter ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:301:1: (lv_chapters_14_0= ruleChapter )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:301:1: (lv_chapters_14_0= ruleChapter )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:302:3: lv_chapters_14_0= ruleChapter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument542);
            	    lv_chapters_14_0=ruleChapter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"chapters",
            	            		lv_chapters_14_0, 
            	            		"Chapter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleChapter"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:326:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:327:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:328:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter580);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:335:1: ruleChapter returns [EObject current=null] : (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_ChapterRef_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:338:28: ( (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:339:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:339:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==14||LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:340:5: this_ChapterRef_0= ruleChapterRef
                    {
                     
                            newCompositeNode(grammarAccess.getChapterAccess().getChapterRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChapterRef_in_ruleChapter637);
                    this_ChapterRef_0=ruleChapterRef();

                    state._fsp--;

                     
                            current = this_ChapterRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==14) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==16) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:10: otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleChapter657); 

                                	newLeafNode(otherlv_1, grammarAccess.getChapterAccess().getChapterKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:353:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:354:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:354:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:355:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter674); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChapterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleChapter691); 

                                	newLeafNode(otherlv_3, grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:376:7: otherlv_4= 'chapter['
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleChapter710); 

                                	newLeafNode(otherlv_4, grammarAccess.getChapterAccess().getChapterKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:380:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:381:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:381:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:382:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter732);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleChapter744); 

                        	newLeafNode(otherlv_6, grammarAccess.getChapterAccess().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:402:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_MULTI_NL) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==RULE_WS||(LA11_1>=RULE_ID && LA11_1<=RULE_ANY_OTHER)||(LA11_1>=27 && LA11_1<=31)||(LA11_1>=34 && LA11_1<=38)||(LA11_1>=40 && LA11_1<=45)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:402:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter756); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:406:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:407:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:407:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:408:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter776);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_8_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:424:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_MULTI_NL) ) {
                            int LA12_1 = input.LA(2);

                            if ( ((LA12_1>=18 && LA12_1<=20)) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:424:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter790); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:428:1: ( (lv_subSections_10_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:429:1: (lv_subSections_10_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:429:1: (lv_subSections_10_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:430:3: lv_subSections_10_0= ruleSection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChapterAccess().getSubSectionsSectionParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleChapter810);
                    	    lv_subSections_10_0=ruleSection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
                    	            		"Section");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleChapterRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:454:1: entryRuleChapterRef returns [EObject current=null] : iv_ruleChapterRef= ruleChapterRef EOF ;
    public final EObject entryRuleChapterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:455:2: (iv_ruleChapterRef= ruleChapterRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:456:2: iv_ruleChapterRef= ruleChapterRef EOF
            {
             newCompositeNode(grammarAccess.getChapterRefRule()); 
            pushFollow(FOLLOW_ruleChapterRef_in_entryRuleChapterRef849);
            iv_ruleChapterRef=ruleChapterRef();

            state._fsp--;

             current =iv_ruleChapterRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterRef859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChapterRef"


    // $ANTLR start "ruleChapterRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:463:1: ruleChapterRef returns [EObject current=null] : (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleChapterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:466:28: ( (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:467:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:467:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:467:3: otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleChapterRef896); 

                	newLeafNode(otherlv_0, grammarAccess.getChapterRefAccess().getChapterRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:471:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:472:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:472:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:473:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapterRef916); 

            		newLeafNode(otherlv_1, grammarAccess.getChapterRefAccess().getChapterChapterCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleChapterRef928); 

                	newLeafNode(otherlv_2, grammarAccess.getChapterRefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChapterRef"


    // $ANTLR start "entryRuleSection"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:496:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:497:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:498:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection964);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:505:1: ruleSection returns [EObject current=null] : (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_SectionRef_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:508:28: ( (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:509:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:509:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=18 && LA17_0<=19)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:510:5: this_SectionRef_0= ruleSectionRef
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getSectionRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSectionRef_in_ruleSection1021);
                    this_SectionRef_0=ruleSectionRef();

                    state._fsp--;

                     
                            current = this_SectionRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==18) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==19) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:519:10: otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSection1041); 

                                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:523:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:524:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:524:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:525:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection1058); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSectionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSection1075); 

                                	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:546:7: otherlv_4= 'section['
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSection1094); 

                                	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getSectionKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:550:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:551:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:551:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:552:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection1116);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleSection1128); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:572:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_MULTI_NL) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==RULE_WS||(LA15_1>=RULE_ID && LA15_1<=RULE_ANY_OTHER)||(LA15_1>=27 && LA15_1<=31)||(LA15_1>=34 && LA15_1<=38)||(LA15_1>=40 && LA15_1<=45)) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:572:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1140); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:576:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:577:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:577:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:578:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection1160);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_8_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:594:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_MULTI_NL) ) {
                            int LA16_1 = input.LA(2);

                            if ( ((LA16_1>=21 && LA16_1<=22)) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:594:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1174); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:598:1: ( (lv_subSections_10_0= ruleSection2 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:599:1: (lv_subSections_10_0= ruleSection2 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:599:1: (lv_subSections_10_0= ruleSection2 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:600:3: lv_subSections_10_0= ruleSection2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getSubSectionsSection2ParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection2_in_ruleSection1194);
                    	    lv_subSections_10_0=ruleSection2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
                    	            		"Section2");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:624:1: entryRuleSectionRef returns [EObject current=null] : iv_ruleSectionRef= ruleSectionRef EOF ;
    public final EObject entryRuleSectionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:625:2: (iv_ruleSectionRef= ruleSectionRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:626:2: iv_ruleSectionRef= ruleSectionRef EOF
            {
             newCompositeNode(grammarAccess.getSectionRefRule()); 
            pushFollow(FOLLOW_ruleSectionRef_in_entryRuleSectionRef1233);
            iv_ruleSectionRef=ruleSectionRef();

            state._fsp--;

             current =iv_ruleSectionRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionRef1243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionRef"


    // $ANTLR start "ruleSectionRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:633:1: ruleSectionRef returns [EObject current=null] : (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSectionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:636:28: ( (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:637:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:637:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:637:3: otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSectionRef1280); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionRefAccess().getSectionRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:641:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:642:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:642:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:643:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSectionRef1300); 

            		newLeafNode(otherlv_1, grammarAccess.getSectionRefAccess().getSectionSectionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSectionRef1312); 

                	newLeafNode(otherlv_2, grammarAccess.getSectionRefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionRef"


    // $ANTLR start "entryRuleSection2"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:666:1: entryRuleSection2 returns [EObject current=null] : iv_ruleSection2= ruleSection2 EOF ;
    public final EObject entryRuleSection2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:667:2: (iv_ruleSection2= ruleSection2 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:668:2: iv_ruleSection2= ruleSection2 EOF
            {
             newCompositeNode(grammarAccess.getSection2Rule()); 
            pushFollow(FOLLOW_ruleSection2_in_entryRuleSection21348);
            iv_ruleSection2=ruleSection2();

            state._fsp--;

             current =iv_ruleSection2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection21358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection2"


    // $ANTLR start "ruleSection2"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:675:1: ruleSection2 returns [EObject current=null] : ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSection2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        Token this_MULTI_NL_8=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_subSections_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:678:28: ( ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:1: ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:1: ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:2: ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:2: ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:3: (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:3: (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:5: otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSection21397); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection2Access().getSection2Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:683:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:684:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:684:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:685:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection21414); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSection2Access().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSection2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection21431); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection2Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:706:7: otherlv_3= 'section2['
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSection21450); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection2Access().getSection2Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:710:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:711:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:711:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:712:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21472);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSection2Rule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection21484); 

                	newLeafNode(otherlv_5, grammarAccess.getSection2Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:732:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MULTI_NL) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_WS||(LA19_1>=RULE_ID && LA19_1<=RULE_ANY_OTHER)||(LA19_1>=27 && LA19_1<=31)||(LA19_1>=34 && LA19_1<=38)||(LA19_1>=40 && LA19_1<=45)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:732:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21496); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:736:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:737:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:737:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:738:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21516);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_7_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:754:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTI_NL) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=23 && LA20_1<=24)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:754:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21530); 
            	     
            	        newLeafNode(this_MULTI_NL_8, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_4_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:758:1: ( (lv_subSections_9_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:759:1: (lv_subSections_9_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:759:1: (lv_subSections_9_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:760:3: lv_subSections_9_0= ruleSection3
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSection21550);
            	    lv_subSections_9_0=ruleSection3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subSections",
            	            		lv_subSections_9_0, 
            	            		"Section3");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection2"


    // $ANTLR start "entryRuleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:784:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:785:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:786:2: iv_ruleSection3= ruleSection3 EOF
            {
             newCompositeNode(grammarAccess.getSection3Rule()); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31588);
            iv_ruleSection3=ruleSection3();

            state._fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection3"


    // $ANTLR start "ruleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:793:1: ruleSection3 returns [EObject current=null] : ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        Token this_MULTI_NL_8=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_subSections_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:796:28: ( ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:797:5: otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSection31637); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection3Access().getSection3Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:801:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:802:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:802:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:803:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31654); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSection3Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection31671); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:824:7: otherlv_3= 'section3['
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSection31690); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection3Access().getSection3Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:828:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:829:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:829:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:830:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31712);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection31724); 

                	newLeafNode(otherlv_5, grammarAccess.getSection3Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:850:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MULTI_NL) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_WS||(LA22_1>=RULE_ID && LA22_1<=RULE_ANY_OTHER)||(LA22_1>=27 && LA22_1<=31)||(LA22_1>=34 && LA22_1<=38)||(LA22_1>=40 && LA22_1<=45)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:850:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31736); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:854:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:855:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:855:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:856:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31756);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_7_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:872:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTI_NL) ) {
                    int LA23_1 = input.LA(2);

                    if ( ((LA23_1>=25 && LA23_1<=26)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:872:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31770); 
            	     
            	        newLeafNode(this_MULTI_NL_8, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:876:1: ( (lv_subSections_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:877:1: (lv_subSections_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:877:1: (lv_subSections_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:878:3: lv_subSections_9_0= ruleSection4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31790);
            	    lv_subSections_9_0=ruleSection4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subSections",
            	            		lv_subSections_9_0, 
            	            		"Section4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection3"


    // $ANTLR start "entryRuleSection4"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:902:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:903:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:904:2: iv_ruleSection4= ruleSection4 EOF
            {
             newCompositeNode(grammarAccess.getSection4Rule()); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41828);
            iv_ruleSection4=ruleSection4();

            state._fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection4"


    // $ANTLR start "ruleSection4"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:911:1: ruleSection4 returns [EObject current=null] : ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:914:28: ( ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            else if ( (LA24_0==26) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:915:5: otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSection41877); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection4Access().getSection4Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:919:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:920:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:920:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:921:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection41894); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSection4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection41911); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:942:7: otherlv_3= 'section4['
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSection41930); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection4Access().getSection4Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:946:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:947:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:947:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41952);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSection4Rule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection41964); 

                	newLeafNode(otherlv_5, grammarAccess.getSection4Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:968:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_WS||(LA25_1>=RULE_ID && LA25_1<=RULE_ANY_OTHER)||(LA25_1>=27 && LA25_1<=31)||(LA25_1>=34 && LA25_1<=38)||(LA25_1>=40 && LA25_1<=45)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:968:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection41976); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:972:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:973:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:973:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:974:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41996);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection4Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_7_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection4"


    // $ANTLR start "entryRuleTextOrMarkup"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:998:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:999:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1000:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             newCompositeNode(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2034);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();

            state._fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup2044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextOrMarkup"


    // $ANTLR start "ruleTextOrMarkup"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1007:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1010:28: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_WS||(LA30_0>=RULE_ID && LA30_0<=RULE_ANY_OTHER)||(LA30_0>=27 && LA30_0<=30)) ) {
                alt30=1;
            }
            else if ( (LA30_0==31||(LA30_0>=34 && LA30_0<=38)||(LA30_0>=40 && LA30_0<=45)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1011:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1012:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1012:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1013:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2091);
                    lv_contents_0_0=ruleTextPart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_0_0, 
                            		"TextPart");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1029:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==31||(LA27_0>=34 && LA27_0<=38)||(LA27_0>=40 && LA27_0<=45)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1029:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1029:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1030:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1030:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1031:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2113);
                    	    lv_contents_1_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_1_0, 
                    	            		"MarkUp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1047:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==RULE_WS||(LA26_0>=RULE_ID && LA26_0<=RULE_ANY_OTHER)||(LA26_0>=27 && LA26_0<=30)) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1048:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1048:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1049:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2134);
                    	            lv_contents_2_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_2_0, 
                    	                    		"TextPart");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==31||(LA29_0>=34 && LA29_0<=38)||(LA29_0>=40 && LA29_0<=45)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1067:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1067:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1068:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2166);
                    	    lv_contents_3_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_3_0, 
                    	            		"MarkUp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1084:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==RULE_WS||(LA28_0>=RULE_ID && LA28_0<=RULE_ANY_OTHER)||(LA28_0>=27 && LA28_0<=30)) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1085:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1085:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1086:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2187);
                    	            lv_contents_4_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_4_0, 
                    	                    		"TextPart");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextOrMarkup"


    // $ANTLR start "entryRuleTextPart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1110:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1111:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1112:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart2226);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart2236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextPart"


    // $ANTLR start "ruleTextPart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1119:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1122:28: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1123:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1123:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1124:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1124:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1125:3: lv_text_0_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart2281);
            lv_text_0_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextPartRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextPart"


    // $ANTLR start "entryRuleText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1149:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1150:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1151:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2317);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1158:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1161:28: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1162:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1162:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt31=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt31=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt31=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt31=4;
                    }
                    break;
                case 27:
                    {
                    alt31=5;
                    }
                    break;
                case 28:
                    {
                    alt31=6;
                    }
                    break;
                case 29:
                    {
                    alt31=7;
                    }
                    break;
                case 30:
                    {
                    alt31=8;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1162:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText2368); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1170:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText2394); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1178:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText2420); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1186:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2446); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_3, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1195:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleText2470); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1202:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleText2489); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1209:2: kw= ','
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleText2508); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getCommaKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1216:2: kw= '-'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleText2527); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getHyphenMinusKeyword_7()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleMarkUp"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1229:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1230:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1231:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             newCompositeNode(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp2568);
            iv_ruleMarkUp=ruleMarkUp();

            state._fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp2578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkUp"


    // $ANTLR start "ruleMarkUp"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1238:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) ;
    public final EObject ruleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_OrderedList_3 = null;

        EObject this_UnorderedList_4 = null;

        EObject this_CodeBlock_5 = null;

        EObject this_CodeRef_6 = null;

        EObject this_Link_7 = null;

        EObject this_ImageRef_8 = null;

        EObject this_Table_9 = null;

        EObject this_Todo_10 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1241:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1242:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1242:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            int alt32=11;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt32=1;
                }
                break;
            case 35:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            case 37:
                {
                alt32=4;
                }
                break;
            case 38:
                {
                alt32=5;
                }
                break;
            case 44:
                {
                alt32=6;
                }
                break;
            case 40:
                {
                alt32=7;
                }
                break;
            case 41:
                {
                alt32=8;
                }
                break;
            case 42:
            case 43:
                {
                alt32=9;
                }
                break;
            case 31:
                {
                alt32=10;
                }
                break;
            case 45:
                {
                alt32=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1243:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2625);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1253:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2652);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1263:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2679);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1273:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2706);
                    this_OrderedList_3=ruleOrderedList();

                    state._fsp--;

                     
                            current = this_OrderedList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1283:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2733);
                    this_UnorderedList_4=ruleUnorderedList();

                    state._fsp--;

                     
                            current = this_UnorderedList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1293:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp2760);
                    this_CodeBlock_5=ruleCodeBlock();

                    state._fsp--;

                     
                            current = this_CodeBlock_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1303:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp2787);
                    this_CodeRef_6=ruleCodeRef();

                    state._fsp--;

                     
                            current = this_CodeRef_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1313:5: this_Link_7= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp2814);
                    this_Link_7=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1323:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp2841);
                    this_ImageRef_8=ruleImageRef();

                    state._fsp--;

                     
                            current = this_ImageRef_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1333:5: this_Table_9= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTableParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTable_in_ruleMarkUp2868);
                    this_Table_9=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1343:5: this_Todo_10= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTodoParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkUp2895);
                    this_Todo_10=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkUp"


    // $ANTLR start "entryRuleTable"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1359:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1360:2: (iv_ruleTable= ruleTable EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1361:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable2930);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable2940); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1368:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1371:28: ( ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1372:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1372:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1372:2: () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1372:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableAccess().getTableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTable2986); 

                	newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1382:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1382:2: ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1382:2: ( ruleANY_WS )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( ((LA33_0>=RULE_WS && LA33_0<=RULE_MULTI_NL)||LA33_0==RULE_SINGLE_NL) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1383:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3004);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1390:3: ( (lv_rows_3_0= ruleTableRow ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1391:1: (lv_rows_3_0= ruleTableRow )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1391:1: (lv_rows_3_0= ruleTableRow )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1392:3: lv_rows_3_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable3026);
            	    lv_rows_3_0=ruleTableRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_3_0, 
            	            		"TableRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1408:4: ( ruleANY_WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_WS && LA35_0<=RULE_MULTI_NL)||LA35_0==RULE_SINGLE_NL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1409:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3045);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTable3058); 

                	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1428:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1429:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1430:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow3094);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow3104); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1437:1: ruleTableRow returns [EObject current=null] : ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_data_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1440:28: ( ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1441:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1441:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1441:2: () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1441:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1442:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableRowAccess().getTableRowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTableRow3150); 

                	newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getTrKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1451:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1451:2: ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1451:2: ( ruleANY_WS )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( ((LA36_0>=RULE_WS && LA36_0<=RULE_MULTI_NL)||LA36_0==RULE_SINGLE_NL) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1452:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3168);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1459:3: ( (lv_data_3_0= ruleTableData ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1460:1: (lv_data_3_0= ruleTableData )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1460:1: (lv_data_3_0= ruleTableData )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1461:3: lv_data_3_0= ruleTableData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getDataTableDataParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableData_in_ruleTableRow3190);
            	    lv_data_3_0=ruleTableData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_3_0, 
            	            		"TableData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1477:4: ( ruleANY_WS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WS && LA38_0<=RULE_MULTI_NL)||LA38_0==RULE_SINGLE_NL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1478:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3209);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTableRow3222); 

                	newLeafNode(otherlv_5, grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableData"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1497:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1498:2: (iv_ruleTableData= ruleTableData EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1499:2: iv_ruleTableData= ruleTableData EOF
            {
             newCompositeNode(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData3258);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData3268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableData"


    // $ANTLR start "ruleTableData"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1506:1: ruleTableData returns [EObject current=null] : ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleTableData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1509:28: ( ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:2: () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1511:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableDataAccess().getTableDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleTableData3314); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDataAccess().getTdKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1520:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_WS && LA41_0<=RULE_ANY_OTHER)||(LA41_0>=27 && LA41_0<=31)||(LA41_0>=34 && LA41_0<=38)||(LA41_0>=40 && LA41_0<=45)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1520:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1520:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_MULTI_NL) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1520:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3327); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1524:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1525:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1525:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1526:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3349);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1542:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_MULTI_NL) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1542:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3361); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1546:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1548:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3381);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_5_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleTableData3397); 

                	newLeafNode(otherlv_6, grammarAccess.getTableDataAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableData"


    // $ANTLR start "entryRuleEmphasize"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1576:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1577:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1578:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             newCompositeNode(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize3433);
            iv_ruleEmphasize=ruleEmphasize();

            state._fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize3443); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmphasize"


    // $ANTLR start "ruleEmphasize"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1585:1: ruleEmphasize returns [EObject current=null] : ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_5=null;
        EObject lv_contents_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1588:28: ( ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1589:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1589:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1589:2: () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1589:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmphasizeAccess().getEmphasizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEmphasize3489); 

                	newLeafNode(otherlv_1, grammarAccess.getEmphasizeAccess().getEKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1599:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_ANY_OTHER)||(LA44_0>=27 && LA44_0<=31)||(LA44_0>=34 && LA44_0<=38)||(LA44_0>=40 && LA44_0<=45)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1599:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1599:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_MULTI_NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1599:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3502); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1603:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1604:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1604:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1605:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3524);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmphasizeRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1621:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_MULTI_NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1621:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3536); 
                             
                                newLeafNode(this_MULTI_NL_4, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_2()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleEmphasize3551); 

                	newLeafNode(otherlv_5, grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmphasize"


    // $ANTLR start "entryRuleAnchor"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1637:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1638:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1639:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor3587);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor3597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1646:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1649:28: ( (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1650:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1650:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1650:3: otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAnchor3634); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1654:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1655:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1655:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1656:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor3651); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleAnchor3668); 

                	newLeafNode(otherlv_2, grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1684:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1685:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1686:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef3704);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef3714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1693:1: ruleRef returns [EObject current=null] : (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_MULTI_NL_3=null;
        Token this_MULTI_NL_5=null;
        Token otherlv_6=null;
        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1696:28: ( (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1697:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1697:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1697:3: otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRef3751); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1701:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1702:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1702:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1703:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef3771); 

            		newLeafNode(otherlv_1, grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            	

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1714:2: (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1714:4: otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRef3784); 

                        	newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1718:1: (this_MULTI_NL_3= RULE_MULTI_NL )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_MULTI_NL) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1718:2: this_MULTI_NL_3= RULE_MULTI_NL
                            {
                            this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef3796); 
                             
                                newLeafNode(this_MULTI_NL_3, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_1()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1722:3: ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_WS||(LA47_0>=RULE_ID && LA47_0<=RULE_ANY_OTHER)||(LA47_0>=27 && LA47_0<=31)||(LA47_0>=34 && LA47_0<=38)||(LA47_0>=40 && LA47_0<=45)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1722:4: ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )?
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1722:4: ( (lv_contents_4_0= ruleTextOrMarkup ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:1: (lv_contents_4_0= ruleTextOrMarkup )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:1: (lv_contents_4_0= ruleTextOrMarkup )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1724:3: lv_contents_4_0= ruleTextOrMarkup
                            {
                             
                            	        newCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef3819);
                            lv_contents_4_0=ruleTextOrMarkup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"contents",
                                    		lv_contents_4_0, 
                                    		"TextOrMarkup");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1740:2: (this_MULTI_NL_5= RULE_MULTI_NL )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==RULE_MULTI_NL) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1740:3: this_MULTI_NL_5= RULE_MULTI_NL
                                    {
                                    this_MULTI_NL_5=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef3831); 
                                     
                                        newLeafNode(this_MULTI_NL_5, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_2_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleRef3846); 

                        	newLeafNode(otherlv_6, grammarAccess.getRefAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleOrderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1756:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1757:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1758:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             newCompositeNode(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList3884);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList3894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderedList"


    // $ANTLR start "ruleOrderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1765:1: ruleOrderedList returns [EObject current=null] : ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1768:28: ( ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1769:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1769:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1769:2: () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1769:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1770:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderedListAccess().getOrderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleOrderedList3940); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderedListAccess().getOlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1779:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1779:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1779:2: ( ruleANY_WS )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( ((LA49_0>=RULE_WS && LA49_0<=RULE_MULTI_NL)||LA49_0==RULE_SINGLE_NL) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1780:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList3958);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1787:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1788:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1788:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1789:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList3980);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1805:4: ( ruleANY_WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_MULTI_NL)||LA51_0==RULE_SINGLE_NL) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1806:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList3999);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleOrderedList4012); 

                	newLeafNode(otherlv_5, grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderedList"


    // $ANTLR start "entryRuleUnorderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1825:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1826:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1827:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4048);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList4058); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnorderedList"


    // $ANTLR start "ruleUnorderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1834:1: ruleUnorderedList returns [EObject current=null] : ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1837:28: ( ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1838:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1838:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1838:2: () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1838:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1839:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnorderedListAccess().getUnorderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUnorderedList4104); 

                	newLeafNode(otherlv_1, grammarAccess.getUnorderedListAccess().getUlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1848:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1848:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1848:2: ( ruleANY_WS )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_MULTI_NL)||LA52_0==RULE_SINGLE_NL) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1849:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4122);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1856:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1857:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1857:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1858:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList4144);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1874:4: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_MULTI_NL)||LA54_0==RULE_SINGLE_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1875:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4163);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleUnorderedList4176); 

                	newLeafNode(otherlv_5, grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedList"


    // $ANTLR start "entryRuleItem"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1894:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1895:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1896:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem4212);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem4222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1903:1: ruleItem returns [EObject current=null] : ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1906:28: ( ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:2: () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getItemAccess().getItemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleItem4268); 

                	newLeafNode(otherlv_1, grammarAccess.getItemAccess().getItemKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1917:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_ANY_OTHER)||(LA57_0>=27 && LA57_0<=31)||(LA57_0>=34 && LA57_0<=38)||(LA57_0>=40 && LA57_0<=45)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1917:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1917:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_MULTI_NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1917:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4281); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1921:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1922:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1922:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1923:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4303);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1939:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_MULTI_NL) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1939:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4315); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1943:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1944:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1944:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1945:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4335);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_5_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleItem4351); 

                	newLeafNode(otherlv_6, grammarAccess.getItemAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleCodeRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1973:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1974:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1975:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             newCompositeNode(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef4387);
            iv_ruleCodeRef=ruleCodeRef();

            state._fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef4397); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeRef"


    // $ANTLR start "ruleCodeRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1982:1: ruleCodeRef returns [EObject current=null] : ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1985:28: ( ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1986:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1986:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1986:2: () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1986:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1987:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeRefAccess().getCodeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCodeRef4443); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeRefAccess().getCodeRefKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1996:1: ( ( ruleText ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS||(LA58_0>=RULE_ID && LA58_0<=RULE_ANY_OTHER)||(LA58_0>=27 && LA58_0<=30)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1997:1: ( ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1997:1: ( ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1998:3: ruleText
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeRefRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmDeclaredTypeCrossReference_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleCodeRef4466);
                    ruleText();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleCodeRef4479); 

                	newLeafNode(otherlv_3, grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeRef"


    // $ANTLR start "entryRuleLink"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2023:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2024:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2025:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4515);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2032:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_text_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2035:28: ( ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2036:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2036:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2036:2: () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2036:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2037:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkAccess().getLinkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLink4571); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2046:1: ( (lv_url_2_0= ruleText ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_WS||(LA59_0>=RULE_ID && LA59_0<=RULE_ANY_OTHER)||(LA59_0>=27 && LA59_0<=30)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2047:1: (lv_url_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2047:1: (lv_url_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2048:3: lv_url_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4592);
                    lv_url_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_2_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleLink4605); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2068:1: ( ruleANY_WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_WS && LA60_0<=RULE_MULTI_NL)||LA60_0==RULE_SINGLE_NL) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2069:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink4622);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLink4635); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_5());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2080:1: ( (lv_text_6_0= ruleText ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_WS||(LA61_0>=RULE_ID && LA61_0<=RULE_ANY_OTHER)||(LA61_0>=27 && LA61_0<=30)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2081:1: (lv_text_6_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2081:1: (lv_text_6_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2082:3: lv_text_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4656);
                    lv_text_6_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_6_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleLink4669); 

                	newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleImageRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2110:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2111:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2112:2: iv_ruleImageRef= ruleImageRef EOF
            {
             newCompositeNode(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef4705);
            iv_ruleImageRef=ruleImageRef();

            state._fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef4715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageRef"


    // $ANTLR start "ruleImageRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2119:1: ruleImageRef returns [EObject current=null] : ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_path_6_0 = null;

        AntlrDatatypeRuleToken lv_caption_10_0 = null;

        AntlrDatatypeRuleToken lv_clazz_14_0 = null;

        AntlrDatatypeRuleToken lv_style_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2122:28: ( ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            else if ( (LA64_0==43) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:5: otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '['
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleImageRef4754); 

                        	newLeafNode(otherlv_0, grammarAccess.getImageRefAccess().getImgKeyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2127:1: ( ruleANY_WS )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=RULE_WS && LA62_0<=RULE_MULTI_NL)||LA62_0==RULE_SINGLE_NL) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2128:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4771);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2135:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2136:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2136:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2137:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef4789); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2153:2: ( ruleANY_WS )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_WS && LA63_0<=RULE_MULTI_NL)||LA63_0==RULE_SINGLE_NL) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2154:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4811);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImageRef4824); 

                        	newLeafNode(otherlv_4, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2166:7: otherlv_5= 'img['
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleImageRef4843); 

                        	newLeafNode(otherlv_5, grammarAccess.getImageRefAccess().getImgKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2170:2: ( (lv_path_6_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2171:1: (lv_path_6_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2171:1: (lv_path_6_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:3: lv_path_6_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef4865);
            lv_path_6_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRefRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_6_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleImageRef4877); 

                	newLeafNode(otherlv_7, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2192:1: ( ruleANY_WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_WS && LA65_0<=RULE_MULTI_NL)||LA65_0==RULE_SINGLE_NL) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2193:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4894);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleImageRef4907); 

                	newLeafNode(otherlv_9, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2204:1: ( (lv_caption_10_0= ruleText ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_WS||(LA66_0>=RULE_ID && LA66_0<=RULE_ANY_OTHER)||(LA66_0>=27 && LA66_0<=30)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2205:1: (lv_caption_10_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2205:1: (lv_caption_10_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2206:3: lv_caption_10_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef4928);
                    lv_caption_10_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"caption",
                            		lv_caption_10_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleImageRef4941); 

                	newLeafNode(otherlv_11, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2226:1: ( ruleANY_WS )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_WS && LA67_0<=RULE_MULTI_NL)||LA67_0==RULE_SINGLE_NL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2227:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4958);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleImageRef4971); 

                	newLeafNode(otherlv_13, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2238:1: ( (lv_clazz_14_0= ruleText ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_WS||(LA68_0>=RULE_ID && LA68_0<=RULE_ANY_OTHER)||(LA68_0>=27 && LA68_0<=30)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2239:1: (lv_clazz_14_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2239:1: (lv_clazz_14_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2240:3: lv_clazz_14_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef4992);
                    lv_clazz_14_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"clazz",
                            		lv_clazz_14_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5005); 

                	newLeafNode(otherlv_15, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2260:1: ( ruleANY_WS )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_WS && LA69_0<=RULE_MULTI_NL)||LA69_0==RULE_SINGLE_NL) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2261:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5022);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleImageRef5035); 

                	newLeafNode(otherlv_17, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2272:1: ( (lv_style_18_0= ruleText ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_WS||(LA70_0>=RULE_ID && LA70_0<=RULE_ANY_OTHER)||(LA70_0>=27 && LA70_0<=30)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2273:1: (lv_style_18_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2273:1: (lv_style_18_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2274:3: lv_style_18_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_13_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5056);
                    lv_style_18_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_18_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5069); 

                	newLeafNode(otherlv_19, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageRef"


    // $ANTLR start "entryRuleCodeBlock"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2302:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2303:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2304:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5105);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock5115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2311:1: ruleCodeBlock returns [EObject current=null] : ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;

        EObject lv_contents_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2314:28: ( ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2315:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2315:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2315:2: () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2315:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeBlockAccess().getCodeBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCodeBlock5161); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getCodeKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2325:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2325:2: ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '['
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2325:2: ( ruleANY_WS )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=RULE_WS && LA71_0<=RULE_MULTI_NL)||LA71_0==RULE_SINGLE_NL) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2326:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5179);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2333:3: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2334:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2334:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2335:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock5200); 

                    		newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getLanguageLangDefCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2346:2: ( ruleANY_WS )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=RULE_WS && LA72_0<=RULE_MULTI_NL)||LA72_0==RULE_SINGLE_NL) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2347:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5217);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5230); 

                        	newLeafNode(otherlv_5, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_3());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2358:1: ( ruleANY_WS )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=RULE_WS && LA73_0<=RULE_MULTI_NL)||LA73_0==RULE_SINGLE_NL) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2359:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_4()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5247);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCodeBlock5260); 

                        	newLeafNode(otherlv_7, grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:3: ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_WS && LA79_0<=RULE_ANY_OTHER)||(LA79_0>=27 && LA79_0<=30)) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=34 && LA79_0<=36)||LA79_0==45) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:5: ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:5: ( (lv_contents_8_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2371:1: (lv_contents_8_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2371:1: (lv_contents_8_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2372:3: lv_contents_8_0= ruleCode
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5285);
                    lv_contents_8_0=ruleCode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_8_0, 
                            		"Code");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2388:2: ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=34 && LA76_0<=36)||LA76_0==45) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2388:3: ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2388:3: ( (lv_contents_9_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2389:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2389:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2390:3: lv_contents_9_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5307);
                    	    lv_contents_9_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_9_0, 
                    	            		"MarkupInCode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2406:2: ( (lv_contents_10_0= ruleCode ) )?
                    	    int alt75=2;
                    	    int LA75_0 = input.LA(1);

                    	    if ( ((LA75_0>=RULE_WS && LA75_0<=RULE_ANY_OTHER)||(LA75_0>=27 && LA75_0<=30)) ) {
                    	        alt75=1;
                    	    }
                    	    switch (alt75) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2407:1: (lv_contents_10_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2407:1: (lv_contents_10_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2408:3: lv_contents_10_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5328);
                    	            lv_contents_10_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_10_0, 
                    	                    		"Code");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2425:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2425:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=34 && LA78_0<=36)||LA78_0==45) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2425:7: ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2425:7: ( (lv_contents_11_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2426:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2426:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2427:3: lv_contents_11_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5360);
                    	    lv_contents_11_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_11_0, 
                    	            		"MarkupInCode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2443:2: ( (lv_contents_12_0= ruleCode ) )?
                    	    int alt77=2;
                    	    int LA77_0 = input.LA(1);

                    	    if ( ((LA77_0>=RULE_WS && LA77_0<=RULE_ANY_OTHER)||(LA77_0>=27 && LA77_0<=30)) ) {
                    	        alt77=1;
                    	    }
                    	    switch (alt77) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2444:1: (lv_contents_12_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2444:1: (lv_contents_12_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2445:3: lv_contents_12_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5381);
                    	            lv_contents_12_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_12_0, 
                    	                    		"Code");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5398); 

                	newLeafNode(otherlv_13, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleTodo"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2473:1: entryRuleTodo returns [EObject current=null] : iv_ruleTodo= ruleTodo EOF ;
    public final EObject entryRuleTodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTodo = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2474:2: (iv_ruleTodo= ruleTodo EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2475:2: iv_ruleTodo= ruleTodo EOF
            {
             newCompositeNode(grammarAccess.getTodoRule()); 
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo5434);
            iv_ruleTodo=ruleTodo();

            state._fsp--;

             current =iv_ruleTodo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo5444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTodo"


    // $ANTLR start "ruleTodo"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2482:1: ruleTodo returns [EObject current=null] : ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2485:28: ( ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2486:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2486:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2486:2: () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2486:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTodoAccess().getTodoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleTodo5490); 

                	newLeafNode(otherlv_1, grammarAccess.getTodoAccess().getTodoKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2496:1: ( (lv_text_2_0= ruleText ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_WS||(LA80_0>=RULE_ID && LA80_0<=RULE_ANY_OTHER)||(LA80_0>=27 && LA80_0<=30)) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2497:1: (lv_text_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2497:1: (lv_text_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:3: lv_text_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getTodoAccess().getTextTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleTodo5511);
                    lv_text_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTodoRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTodo5524); 

                	newLeafNode(otherlv_3, grammarAccess.getTodoAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTodo"


    // $ANTLR start "entryRuleCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2526:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2527:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2528:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode5560);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode5570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2535:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2538:28: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2539:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2539:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2540:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2540:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2541:3: lv_contents_0_0= ruleCodeText
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode5615);
            lv_contents_0_0=ruleCodeText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	        }
                   		set(
                   			current, 
                   			"contents",
                    		lv_contents_0_0, 
                    		"CodeText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleMarkupInCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2565:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2566:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2567:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             newCompositeNode(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5650);
            iv_ruleMarkupInCode=ruleMarkupInCode();

            state._fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode5660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupInCode"


    // $ANTLR start "ruleMarkupInCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2574:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_Todo_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2577:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2578:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2578:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt81=1;
                }
                break;
            case 35:
                {
                alt81=2;
                }
                break;
            case 36:
                {
                alt81=3;
                }
                break;
            case 45:
                {
                alt81=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2579:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode5707);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2589:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode5734);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2599:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode5761);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2609:5: this_Todo_3= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getTodoParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkupInCode5788);
                    this_Todo_3=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupInCode"


    // $ANTLR start "entryRuleLangDef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2625:1: entryRuleLangDef returns [EObject current=null] : iv_ruleLangDef= ruleLangDef EOF ;
    public final EObject entryRuleLangDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangDef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2626:2: (iv_ruleLangDef= ruleLangDef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2627:2: iv_ruleLangDef= ruleLangDef EOF
            {
             newCompositeNode(grammarAccess.getLangDefRule()); 
            pushFollow(FOLLOW_ruleLangDef_in_entryRuleLangDef5823);
            iv_ruleLangDef=ruleLangDef();

            state._fsp--;

             current =iv_ruleLangDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangDef5833); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLangDef"


    // $ANTLR start "ruleLangDef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2634:1: ruleLangDef returns [EObject current=null] : ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) | ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' ) ) ;
    public final EObject ruleLangDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_keywords_15_0=null;
        Token otherlv_16=null;
        Token lv_keywords_18_0=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_keywords_6_0 = null;

        AntlrDatatypeRuleToken lv_keywords_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2637:28: ( ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) | ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) | ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) | ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==46) ) {
                int LA93_1 = input.LA(2);

                if ( ((LA93_1>=RULE_WS && LA93_1<=RULE_MULTI_NL)||LA93_1==RULE_SINGLE_NL||LA93_1==11) ) {
                    alt93=2;
                }
                else if ( (LA93_1==RULE_ID) ) {
                    int LA93_3 = input.LA(3);

                    if ( (LA93_3==11) ) {
                        switch ( input.LA(4) ) {
                        case RULE_MULTI_NL:
                            {
                            int LA93_5 = input.LA(5);

                            if ( (LA93_5==EOF||LA93_5==14||(LA93_5>=16 && LA93_5<=17)||LA93_5==46) ) {
                                alt93=2;
                            }
                            else if ( ((LA93_5>=RULE_WS && LA93_5<=RULE_MULTI_NL)||LA93_5==RULE_SINGLE_NL||LA93_5==15) ) {
                                alt93=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 93, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_WS:
                        case RULE_SINGLE_NL:
                        case 15:
                            {
                            alt93=1;
                            }
                            break;
                        case EOF:
                            {
                            alt93=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 93, 4, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA93_3==29) ) {
                        alt93=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:4: otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_11= ']'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleLangDef5871); 

                        	newLeafNode(otherlv_0, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2642:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2644:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef5888); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getLangDefAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLangDefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleLangDef5905); 

                        	newLeafNode(otherlv_2, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2664:1: ( ruleANY_WS )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( ((LA82_0>=RULE_WS && LA82_0<=RULE_MULTI_NL)||LA82_0==RULE_SINGLE_NL) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2665:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef5922);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleLangDef5935); 

                        	newLeafNode(otherlv_4, grammarAccess.getLangDefAccess().getLeftSquareBracketKeyword_0_4());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:1: ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( ((LA87_0>=RULE_WS && LA87_0<=RULE_SINGLE_NL)||LA87_0==30) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:2: ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:2: ( ruleANY_WS )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( ((LA83_0>=RULE_WS && LA83_0<=RULE_MULTI_NL)||LA83_0==RULE_SINGLE_NL) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2677:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef5953);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2684:3: ( (lv_keywords_6_0= ruleKeyWord ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2685:1: (lv_keywords_6_0= ruleKeyWord )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2685:1: (lv_keywords_6_0= ruleKeyWord )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2686:3: lv_keywords_6_0= ruleKeyWord
                            {
                             
                            	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef5975);
                            lv_keywords_6_0=ruleKeyWord();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"keywords",
                                    		lv_keywords_6_0, 
                                    		"KeyWord");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2702:2: (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==29) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2702:4: otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= ruleKeyWord ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleLangDef5988); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getLangDefAccess().getCommaKeyword_0_5_2_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2706:1: ( ruleANY_WS )*
                            	    loop84:
                            	    do {
                            	        int alt84=2;
                            	        int LA84_0 = input.LA(1);

                            	        if ( ((LA84_0>=RULE_WS && LA84_0<=RULE_MULTI_NL)||LA84_0==RULE_SINGLE_NL) ) {
                            	            alt84=1;
                            	        }


                            	        switch (alt84) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2707:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_2_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6005);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop84;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2714:3: ( (lv_keywords_9_0= ruleKeyWord ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2715:1: (lv_keywords_9_0= ruleKeyWord )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2715:1: (lv_keywords_9_0= ruleKeyWord )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2716:3: lv_keywords_9_0= ruleKeyWord
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_2_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef6027);
                            	    lv_keywords_9_0=ruleKeyWord();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_9_0, 
                            	            		"KeyWord");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2732:2: ( ruleANY_WS )*
                            	    loop85:
                            	    do {
                            	        int alt85=2;
                            	        int LA85_0 = input.LA(1);

                            	        if ( ((LA85_0>=RULE_WS && LA85_0<=RULE_MULTI_NL)||LA85_0==RULE_SINGLE_NL) ) {
                            	            alt85=1;
                            	        }


                            	        switch (alt85) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2733:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_2_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6044);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop85;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6061); 

                        	newLeafNode(otherlv_11, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2745:6: ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2745:6: ( () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2745:7: () otherlv_13= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_20= ']'
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2745:7: ()
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2746:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLangDefAccess().getLangDefAction_1_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleLangDef6090); 

                        	newLeafNode(otherlv_13, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_1_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2755:1: ( ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )* )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=RULE_WS && LA92_0<=RULE_SINGLE_NL)) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2755:2: ( ruleANY_WS )* ( (lv_keywords_15_0= RULE_ID ) ) (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2755:2: ( ruleANY_WS )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( ((LA88_0>=RULE_WS && LA88_0<=RULE_MULTI_NL)||LA88_0==RULE_SINGLE_NL) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2756:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6108);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop88;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2763:3: ( (lv_keywords_15_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2764:1: (lv_keywords_15_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2764:1: (lv_keywords_15_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2765:3: lv_keywords_15_0= RULE_ID
                            {
                            lv_keywords_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6126); 

                            			newLeafNode(lv_keywords_15_0, grammarAccess.getLangDefAccess().getKeywordsIDTerminalRuleCall_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLangDefRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"keywords",
                                    		lv_keywords_15_0, 
                                    		"ID");
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2781:2: (otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )* )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==29) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2781:4: otherlv_16= ',' ( ruleANY_WS )* ( (lv_keywords_18_0= RULE_ID ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleLangDef6144); 

                            	        	newLeafNode(otherlv_16, grammarAccess.getLangDefAccess().getCommaKeyword_1_2_2_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2785:1: ( ruleANY_WS )*
                            	    loop89:
                            	    do {
                            	        int alt89=2;
                            	        int LA89_0 = input.LA(1);

                            	        if ( ((LA89_0>=RULE_WS && LA89_0<=RULE_MULTI_NL)||LA89_0==RULE_SINGLE_NL) ) {
                            	            alt89=1;
                            	        }


                            	        switch (alt89) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2786:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_2_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6161);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop89;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2793:3: ( (lv_keywords_18_0= RULE_ID ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2794:1: (lv_keywords_18_0= RULE_ID )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2794:1: (lv_keywords_18_0= RULE_ID )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2795:3: lv_keywords_18_0= RULE_ID
                            	    {
                            	    lv_keywords_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6179); 

                            	    			newLeafNode(lv_keywords_18_0, grammarAccess.getLangDefAccess().getKeywordsIDTerminalRuleCall_1_2_2_2_0()); 
                            	    		

                            	    	        if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		addWithLastConsumed(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_18_0, 
                            	            		"ID");
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2811:2: ( ruleANY_WS )*
                            	    loop90:
                            	    do {
                            	        int alt90=2;
                            	        int LA90_0 = input.LA(1);

                            	        if ( ((LA90_0>=RULE_WS && LA90_0<=RULE_MULTI_NL)||LA90_0==RULE_SINGLE_NL) ) {
                            	            alt90=1;
                            	        }


                            	        switch (alt90) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_2_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6201);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop90;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6218); 

                        	newLeafNode(otherlv_20, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLangDef"


    // $ANTLR start "entryRuleCodeText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2831:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2832:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2833:2: iv_ruleCodeText= ruleCodeText EOF
            {
             newCompositeNode(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText6256);
            iv_ruleCodeText=ruleCodeText();

            state._fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText6267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeText"


    // $ANTLR start "ruleCodeText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2840:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_SINGLE_NL_3=null;
        Token this_ANY_OTHER_4=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2843:28: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2844:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2844:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt94=0;
            loop94:
            do {
                int alt94=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt94=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt94=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt94=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt94=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt94=5;
                    }
                    break;
                case 27:
                    {
                    alt94=6;
                    }
                    break;
                case 28:
                    {
                    alt94=7;
                    }
                    break;
                case 29:
                    {
                    alt94=8;
                    }
                    break;
                case 30:
                    {
                    alt94=9;
                    }
                    break;

                }

                switch (alt94) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2844:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText6307); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2852:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText6333); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        newLeafNode(this_MULTI_NL_1, grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2860:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText6359); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2868:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6385); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_3, grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2876:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6411); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2885:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleCodeText6435); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2892:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleCodeText6454); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2899:2: kw= ','
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleCodeText6473); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getCommaKeyword_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2906:2: kw= '-'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleCodeText6492); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getHyphenMinusKeyword_8()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeText"


    // $ANTLR start "entryRuleANY_WS"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2919:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2920:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2921:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             newCompositeNode(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS6534);
            iv_ruleANY_WS=ruleANY_WS();

            state._fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS6545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANY_WS"


    // $ANTLR start "ruleANY_WS"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2928:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2931:28: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt95=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt95=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt95=2;
                }
                break;
            case RULE_WS:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6585); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        newLeafNode(this_MULTI_NL_0, grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2940:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6611); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        newLeafNode(this_SINGLE_NL_1, grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2948:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS6637); 

                    		current.merge(this_WS_2);
                        
                     
                        newLeafNode(this_WS_2, grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANY_WS"


    // $ANTLR start "entryRuleKeyWord"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2963:1: entryRuleKeyWord returns [String current=null] : iv_ruleKeyWord= ruleKeyWord EOF ;
    public final String entryRuleKeyWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyWord = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2964:2: (iv_ruleKeyWord= ruleKeyWord EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2965:2: iv_ruleKeyWord= ruleKeyWord EOF
            {
             newCompositeNode(grammarAccess.getKeyWordRule()); 
            pushFollow(FOLLOW_ruleKeyWord_in_entryRuleKeyWord6683);
            iv_ruleKeyWord=ruleKeyWord();

            state._fsp--;

             current =iv_ruleKeyWord.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyWord6694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyWord"


    // $ANTLR start "ruleKeyWord"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2972:1: ruleKeyWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleKeyWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2975:28: ( (this_ID_0= RULE_ID | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2976:1: (this_ID_0= RULE_ID | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2976:1: (this_ID_0= RULE_ID | kw= '-' )+
            int cnt96=0;
            loop96:
            do {
                int alt96=3;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_ID) ) {
                    alt96=1;
                }
                else if ( (LA96_0==30) ) {
                    alt96=2;
                }


                switch (alt96) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2976:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyWord6734); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getKeyWordAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2985:2: kw= '-'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleKeyWord6758); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getKeyWordAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyWord"

    // Delegated rules


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA34_eotS =
        "\6\uffff";
    static final String DFA34_eofS =
        "\6\uffff";
    static final String DFA34_minS =
        "\4\4\2\uffff";
    static final String DFA34_maxS =
        "\4\40\2\uffff";
    static final String DFA34_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA34_specialS =
        "\6\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 1382:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*";
        }
    }
    static final String DFA37_eotS =
        "\6\uffff";
    static final String DFA37_eofS =
        "\6\uffff";
    static final String DFA37_minS =
        "\4\4\2\uffff";
    static final String DFA37_maxS =
        "\4\41\2\uffff";
    static final String DFA37_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA37_specialS =
        "\6\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 1451:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*";
        }
    }
    static final String DFA50_eotS =
        "\6\uffff";
    static final String DFA50_eofS =
        "\6\uffff";
    static final String DFA50_minS =
        "\4\4\2\uffff";
    static final String DFA50_maxS =
        "\4\47\2\uffff";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA50_specialS =
        "\6\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 1779:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA53_eotS =
        "\6\uffff";
    static final String DFA53_eofS =
        "\6\uffff";
    static final String DFA53_minS =
        "\4\4\2\uffff";
    static final String DFA53_maxS =
        "\4\47\2\uffff";
    static final String DFA53_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA53_specialS =
        "\6\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 1848:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA74_eotS =
        "\21\uffff";
    static final String DFA74_eofS =
        "\6\uffff\1\5\3\uffff\3\5\1\uffff\3\5";
    static final String DFA74_minS =
        "\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA74_maxS =
        "\5\55\1\uffff\7\55\1\uffff\3\55";
    static final String DFA74_acceptS =
        "\5\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA74_specialS =
        "\21\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\17\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\17\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\17\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\17\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\10\1\7\1\5\1\11\1\5\2\uffff\1\6\17\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\13\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\10\1\7\1\5\1\11\1\5\2\uffff\1\6\17\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\7\1\5\1\11\1\5\2\uffff\1\6\17\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\7\1\5\1\11\1\5\2\uffff\1\6\17\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\16\1\15\1\5\1\17\1\5\2\uffff\1\5\2\uffff\1\5\1\15\20\5\2"+
            "\uffff\5\5\1\uffff\6\5",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\13\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\13\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\13\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\13\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\5\uffff\1\5\1\15\20\5\2\uffff\5\5\1"+
            "\uffff\6\5"
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "2325:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXdocFile_in_entryRuleXdocFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXdocFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleXdocFile131 = new BitSet(new long[]{0x00000000007F4422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144 = new BitSet(new long[]{0x00000000007F4402L});
    public static final BitSet FOLLOW_ruleDocument_in_ruleXdocFile169 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleXdocFile188 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleXdocFile207 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleXdocFile226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDocument327 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument360 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument372 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDocument383 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument404 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument416 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDocument441 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument474 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument488 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleLangDef_in_ruleDocument508 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument522 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument542 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterRef_in_ruleChapter637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleChapter657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter674 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChapter691 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_16_in_ruleChapter710 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter732 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter744 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter756 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter776 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter790 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter810 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapterRef_in_entryRuleChapterRef849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterRef859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleChapterRef896 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapterRef916 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapterRef928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionRef_in_ruleSection1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSection1041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection1058 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection1075 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_19_in_ruleSection1094 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection1128 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1140 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1160 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1174 = new BitSet(new long[]{0x00000000007F4400L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleSection1194 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSectionRef_in_entryRuleSectionRef1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionRef1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSectionRef1280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSectionRef1300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSectionRef1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_entryRuleSection21348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSection21397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection21414 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection21431 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_22_in_ruleSection21450 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21472 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection21484 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21496 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21516 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21530 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSection21550 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSection31637 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection31671 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_24_in_ruleSection31690 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31712 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31724 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31736 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31756 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31770 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31790 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSection41877 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection41894 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection41911 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_26_in_ruleSection41930 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41952 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection41964 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection41976 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41996 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2091 = new BitSet(new long[]{0x00003F7CF80001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2113 = new BitSet(new long[]{0x00003F7CF80001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2134 = new BitSet(new long[]{0x00003F7CF80001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2166 = new BitSet(new long[]{0x00003F7CF80001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2187 = new BitSet(new long[]{0x00003F7CF80001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText2368 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText2394 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText2420 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2446 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_27_in_ruleText2470 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_28_in_ruleText2489 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_29_in_ruleText2508 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_30_in_ruleText2527 = new BitSet(new long[]{0x00000000780001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleMarkUp2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkUp2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTable2986 = new BitSet(new long[]{0x00000001000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3004 = new BitSet(new long[]{0x00000001000000B0L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable3026 = new BitSet(new long[]{0x00000001000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3045 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTable3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow3094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTableRow3150 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3168 = new BitSet(new long[]{0x00000002000000B0L});
    public static final BitSet FOLLOW_ruleTableData_in_ruleTableRow3190 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3209 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTableRow3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData3258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTableData3314 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3327 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3349 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3361 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3381 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleTableData3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize3433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEmphasize3489 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3502 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3524 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3536 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor3587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAnchor3634 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor3651 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAnchor3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRef3751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef3771 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRef3784 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef3796 = new BitSet(new long[]{0x00003F7CF80009D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef3819 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef3831 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList3884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOrderedList3940 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList3958 = new BitSet(new long[]{0x00000080000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList3980 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList3999 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnorderedList4104 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4122 = new BitSet(new long[]{0x00000080000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList4144 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4163 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem4212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleItem4268 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4281 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4303 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4315 = new BitSet(new long[]{0x00003F7CF80001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4335 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleItem4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef4387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCodeRef4443 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef4466 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLink4571 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4592 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4605 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink4622 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLink4635 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4656 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef4705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImageRef4754 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4771 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef4789 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4811 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef4824 = new BitSet(new long[]{0x00000000780001D0L});
    public static final BitSet FOLLOW_43_in_ruleImageRef4843 = new BitSet(new long[]{0x00000000780001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef4865 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef4877 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4894 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef4907 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef4928 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef4941 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4958 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef4971 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef4992 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5005 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5022 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef5035 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5056 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCodeBlock5161 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5179 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock5200 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5217 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5230 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5247 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleCodeBlock5260 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5285 = new BitSet(new long[]{0x00003F7CF80009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5307 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5328 = new BitSet(new long[]{0x00003F7CF80009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5360 = new BitSet(new long[]{0x00003F7CF80009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5381 = new BitSet(new long[]{0x00003F7CF80009D0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo5434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTodo5490 = new BitSet(new long[]{0x00000000780009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleTodo5511 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTodo5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode5560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkupInCode5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangDef_in_entryRuleLangDef5823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangDef5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLangDef5871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef5888 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLangDef5905 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef5922 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLangDef5935 = new BitSet(new long[]{0x00000000400008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef5953 = new BitSet(new long[]{0x00000000400000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef5975 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_29_in_ruleLangDef5988 = new BitSet(new long[]{0x00000000400000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6005 = new BitSet(new long[]{0x00000000400000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef6027 = new BitSet(new long[]{0x00000000200008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6044 = new BitSet(new long[]{0x00000000200008B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLangDef6090 = new BitSet(new long[]{0x00000000000008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6108 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6126 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_29_in_ruleLangDef6144 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6161 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6179 = new BitSet(new long[]{0x00000000200008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6201 = new BitSet(new long[]{0x00000000200008B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText6256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText6307 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText6333 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText6359 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6385 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6411 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_27_in_ruleCodeText6435 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_28_in_ruleCodeText6454 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_29_in_ruleCodeText6473 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_30_in_ruleCodeText6492 = new BitSet(new long[]{0x00000000780001F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS6534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyWord_in_entryRuleKeyWord6683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyWord6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyWord6734 = new BitSet(new long[]{0x0000000040000042L});
    public static final BitSet FOLLOW_30_in_ruleKeyWord6758 = new BitSet(new long[]{0x0000000040000042L});

}