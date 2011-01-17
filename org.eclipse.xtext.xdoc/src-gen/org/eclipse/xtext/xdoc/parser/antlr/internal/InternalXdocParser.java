package org.eclipse.xtext.xdoc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.xdoc.services.XdocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'document['", "']'", "'subtitle['", "'authors['", "'chapter:'", "'['", "'chapter['", "'chapter-ref['", "'section:'", "'section['", "'section-ref['", "'section2:'", "'section2['", "'section2-ref['", "'section3:'", "'section3['", "'section4:'", "'section4['", "'\\\\['", "'\\\\]'", "','", "'-'", "'table['", "'tr['", "'td['", "'e['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'img['", "'code['", "'todo['", "'codelanguage-def['"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MULTI_NL=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_SINGLE_NL=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=4;

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
     	
        public InternalXdocParser(TokenStream input, XdocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:67:1: entryRuleXdocFile returns [EObject current=null] : iv_ruleXdocFile= ruleXdocFile EOF ;
    public final EObject entryRuleXdocFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXdocFile = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:68:2: (iv_ruleXdocFile= ruleXdocFile EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:69:2: iv_ruleXdocFile= ruleXdocFile EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:76:1: ruleXdocFile returns [EObject current=null] : ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:79:28: ( ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:2: () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXdocFileAccess().getXdocFileAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:2: (this_WS_1= RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleXdocFile131); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getXdocFileAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:90:3: (this_MULTI_NL_2= RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:90:4: this_MULTI_NL_2= RULE_MULTI_NL
                    {
                    this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144); 
                     
                        newLeafNode(this_MULTI_NL_2, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:3: ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10||LA5_0==14||(LA5_0>=16 && LA5_0<=23)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:95:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:95:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:96:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:96:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= ruleChapter | lv_mainSection_3_3= ruleSection | lv_mainSection_3_4= ruleSection2 )
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
                    case 23:
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:3: lv_mainSection_3_1= ruleDocument
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:112:8: lv_mainSection_3_2= ruleChapter
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:127:8: lv_mainSection_3_3= ruleSection
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:142:8: lv_mainSection_3_4= ruleSection2
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:160:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_MULTI_NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:160:3: this_MULTI_NL_4= RULE_MULTI_NL
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:172:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:173:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:174:2: iv_ruleDocument= ruleDocument EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:181:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:184:28: ( (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:185:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:185:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:185:3: otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleDocument327); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDocumentKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:189:1: ( (lv_title_1_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:190:1: (lv_title_1_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:190:1: (lv_title_1_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:191:3: lv_title_1_0= ruleTextOrMarkup
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
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:1: (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:2: this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']'
                    {
                    this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument372); 
                     
                        newLeafNode(this_MULTI_NL_3, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0()); 
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDocument383); 

                        	newLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getSubtitleKeyword_3_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:219:1: ( (lv_subtitle_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:220:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:220:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:221:3: lv_subtitle_5_0= ruleTextOrMarkup
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:241:3: (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )?
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:241:4: this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']'
                    {
                    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument430); 
                     
                        newLeafNode(this_MULTI_NL_7, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_4_0()); 
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDocument441); 

                        	newLeafNode(otherlv_8, grammarAccess.getDocumentAccess().getAuthorsKeyword_4_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:249:1: ( (lv_authors_9_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:250:1: (lv_authors_9_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:250:1: (lv_authors_9_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:251:3: lv_authors_9_0= ruleTextOrMarkup
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:271:3: (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_MULTI_NL) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==47) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:271:4: this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) )
            	    {
            	    this_MULTI_NL_11=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument488); 
            	     
            	        newLeafNode(this_MULTI_NL_11, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:275:1: ( (lv_langDefs_12_0= ruleLangDef ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:276:1: (lv_langDefs_12_0= ruleLangDef )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:276:1: (lv_langDefs_12_0= ruleLangDef )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:277:3: lv_langDefs_12_0= ruleLangDef
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:293:4: (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) ) )*
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
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:293:5: this_MULTI_NL_13= RULE_MULTI_NL ( (lv_chapters_14_0= ruleChapter ) )
            	    {
            	    this_MULTI_NL_13=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument522); 
            	     
            	        newLeafNode(this_MULTI_NL_13, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_6_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:297:1: ( (lv_chapters_14_0= ruleChapter ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:298:1: (lv_chapters_14_0= ruleChapter )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:298:1: (lv_chapters_14_0= ruleChapter )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:299:3: lv_chapters_14_0= ruleChapter
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:323:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:324:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:325:2: iv_ruleChapter= ruleChapter EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:332:1: ruleChapter returns [EObject current=null] : (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:335:28: ( (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:336:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:336:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:337:5: this_ChapterRef_0= ruleChapterRef
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' )
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:346:10: otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleChapter657); 

                                	newLeafNode(otherlv_1, grammarAccess.getChapterAccess().getChapterKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:350:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:351:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:351:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:352:3: lv_name_2_0= RULE_ID
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:373:7: otherlv_4= 'chapter['
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleChapter710); 

                                	newLeafNode(otherlv_4, grammarAccess.getChapterAccess().getChapterKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:377:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:378:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:378:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:379:3: lv_title_5_0= ruleTextOrMarkup
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
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:399:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_MULTI_NL) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==RULE_WS||(LA11_1>=RULE_ID && LA11_1<=RULE_ANY_OTHER)||(LA11_1>=28 && LA11_1<=32)||(LA11_1>=35 && LA11_1<=39)||(LA11_1>=41 && LA11_1<=46)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:399:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter756); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:403:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:404:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:404:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:405:3: lv_contents_8_0= ruleTextOrMarkup
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:421:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
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
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:421:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter790); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:425:1: ( (lv_subSections_10_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:426:1: (lv_subSections_10_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:426:1: (lv_subSections_10_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:427:3: lv_subSections_10_0= ruleSection
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:451:1: entryRuleChapterRef returns [EObject current=null] : iv_ruleChapterRef= ruleChapterRef EOF ;
    public final EObject entryRuleChapterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:452:2: (iv_ruleChapterRef= ruleChapterRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:453:2: iv_ruleChapterRef= ruleChapterRef EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:460:1: ruleChapterRef returns [EObject current=null] : (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleChapterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:463:28: ( (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:464:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:464:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:464:3: otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleChapterRef896); 

                	newLeafNode(otherlv_0, grammarAccess.getChapterRefAccess().getChapterRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:468:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:469:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:469:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:470:3: otherlv_1= RULE_ID
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:493:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:494:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:495:2: iv_ruleSection= ruleSection EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:502:1: ruleSection returns [EObject current=null] : (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:505:28: ( (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:506:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:506:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:507:5: this_SectionRef_0= ruleSectionRef
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
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' )
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:10: otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSection1041); 

                                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:520:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:521:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:521:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:522:3: lv_name_2_0= RULE_ID
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:543:7: otherlv_4= 'section['
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSection1094); 

                                	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getSectionKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:547:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:548:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:548:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:549:3: lv_title_5_0= ruleTextOrMarkup
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
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:569:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_MULTI_NL) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==RULE_WS||(LA15_1>=RULE_ID && LA15_1<=RULE_ANY_OTHER)||(LA15_1>=28 && LA15_1<=32)||(LA15_1>=35 && LA15_1<=39)||(LA15_1>=41 && LA15_1<=46)) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:569:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1140); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:573:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:574:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:574:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:575:3: lv_contents_8_0= ruleTextOrMarkup
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:591:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_MULTI_NL) ) {
                            int LA16_1 = input.LA(2);

                            if ( ((LA16_1>=21 && LA16_1<=23)) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:591:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1174); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:595:1: ( (lv_subSections_10_0= ruleSection2 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:596:1: (lv_subSections_10_0= ruleSection2 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:596:1: (lv_subSections_10_0= ruleSection2 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:597:3: lv_subSections_10_0= ruleSection2
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:621:1: entryRuleSectionRef returns [EObject current=null] : iv_ruleSectionRef= ruleSectionRef EOF ;
    public final EObject entryRuleSectionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:622:2: (iv_ruleSectionRef= ruleSectionRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:623:2: iv_ruleSectionRef= ruleSectionRef EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:630:1: ruleSectionRef returns [EObject current=null] : (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSectionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:633:28: ( (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:634:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:634:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:634:3: otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSectionRef1280); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionRefAccess().getSectionRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:638:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:639:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:639:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:640:3: otherlv_1= RULE_ID
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:663:1: entryRuleSection2 returns [EObject current=null] : iv_ruleSection2= ruleSection2 EOF ;
    public final EObject entryRuleSection2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:664:2: (iv_ruleSection2= ruleSection2 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:665:2: iv_ruleSection2= ruleSection2 EOF
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:672:1: ruleSection2 returns [EObject current=null] : (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) ) ;
    public final EObject ruleSection2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_Section2Ref_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:675:28: ( (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:676:1: (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:676:1: (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=21 && LA21_0<=22)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:677:5: this_Section2Ref_0= ruleSection2Ref
                    {
                     
                            newCompositeNode(grammarAccess.getSection2Access().getSection2RefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSection2Ref_in_ruleSection21405);
                    this_Section2Ref_0=ruleSection2Ref();

                    state._fsp--;

                     
                            current = this_Section2Ref_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:6: ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:6: ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:7: ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:7: ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' )
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
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:8: (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:8: (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:10: otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSection21425); 

                                	newLeafNode(otherlv_1, grammarAccess.getSection2Access().getSection2Keyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:690:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:691:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:691:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:692:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection21442); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getSection2Access().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSection2Rule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSection21459); 

                                	newLeafNode(otherlv_3, grammarAccess.getSection2Access().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:713:7: otherlv_4= 'section2['
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSection21478); 

                                	newLeafNode(otherlv_4, grammarAccess.getSection2Access().getSection2Keyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:717:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:718:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:718:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:719:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21500);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleSection21512); 

                        	newLeafNode(otherlv_6, grammarAccess.getSection2Access().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:739:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_MULTI_NL) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==RULE_WS||(LA19_1>=RULE_ID && LA19_1<=RULE_ANY_OTHER)||(LA19_1>=28 && LA19_1<=32)||(LA19_1>=35 && LA19_1<=39)||(LA19_1>=41 && LA19_1<=46)) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:739:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21524); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:743:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:744:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:744:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:745:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21544);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
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
                    	    break loop19;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:761:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_MULTI_NL) ) {
                            int LA20_1 = input.LA(2);

                            if ( ((LA20_1>=24 && LA20_1<=25)) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:761:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21558); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:765:1: ( (lv_subSections_10_0= ruleSection3 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:766:1: (lv_subSections_10_0= ruleSection3 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:766:1: (lv_subSections_10_0= ruleSection3 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:767:3: lv_subSections_10_0= ruleSection3
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection3_in_ruleSection21578);
                    	    lv_subSections_10_0=ruleSection3();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
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
    // $ANTLR end "ruleSection2"


    // $ANTLR start "entryRuleSection2Ref"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:791:1: entryRuleSection2Ref returns [EObject current=null] : iv_ruleSection2Ref= ruleSection2Ref EOF ;
    public final EObject entryRuleSection2Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2Ref = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:792:2: (iv_ruleSection2Ref= ruleSection2Ref EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:793:2: iv_ruleSection2Ref= ruleSection2Ref EOF
            {
             newCompositeNode(grammarAccess.getSection2RefRule()); 
            pushFollow(FOLLOW_ruleSection2Ref_in_entryRuleSection2Ref1617);
            iv_ruleSection2Ref=ruleSection2Ref();

            state._fsp--;

             current =iv_ruleSection2Ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection2Ref1627); 

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
    // $ANTLR end "entryRuleSection2Ref"


    // $ANTLR start "ruleSection2Ref"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:800:1: ruleSection2Ref returns [EObject current=null] : (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSection2Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:803:28: ( (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:804:1: (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:804:1: (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:804:3: otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSection2Ref1664); 

                	newLeafNode(otherlv_0, grammarAccess.getSection2RefAccess().getSection2RefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:808:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:809:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:809:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:810:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSection2RefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection2Ref1684); 

            		newLeafNode(otherlv_1, grammarAccess.getSection2RefAccess().getSection2Section2CrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSection2Ref1696); 

                	newLeafNode(otherlv_2, grammarAccess.getSection2RefAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleSection2Ref"


    // $ANTLR start "entryRuleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:833:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:834:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:835:2: iv_ruleSection3= ruleSection3 EOF
            {
             newCompositeNode(grammarAccess.getSection3Rule()); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31732);
            iv_ruleSection3=ruleSection3();

            state._fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31742); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:842:1: ruleSection3 returns [EObject current=null] : ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:845:28: ( ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            else if ( (LA22_0==25) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:846:5: otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSection31781); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection3Access().getSection3Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:850:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:851:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:851:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:852:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31798); 

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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection31815); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:873:7: otherlv_3= 'section3['
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleSection31834); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection3Access().getSection3Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:877:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:878:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:878:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:879:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31856);
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

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection31868); 

                	newLeafNode(otherlv_5, grammarAccess.getSection3Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:899:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTI_NL) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_WS||(LA23_1>=RULE_ID && LA23_1<=RULE_ANY_OTHER)||(LA23_1>=28 && LA23_1<=32)||(LA23_1>=35 && LA23_1<=39)||(LA23_1>=41 && LA23_1<=46)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:899:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31880); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:903:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:904:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:904:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:905:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31900);
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
            	    break loop23;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:921:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1>=26 && LA24_1<=27)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:921:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31914); 
            	     
            	        newLeafNode(this_MULTI_NL_8, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:925:1: ( (lv_subSections_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:926:1: (lv_subSections_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:926:1: (lv_subSections_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:927:3: lv_subSections_9_0= ruleSection4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31934);
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
            	    break loop24;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:951:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:952:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:953:2: iv_ruleSection4= ruleSection4 EOF
            {
             newCompositeNode(grammarAccess.getSection4Rule()); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41972);
            iv_ruleSection4=ruleSection4();

            state._fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41982); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:960:1: ruleSection4 returns [EObject current=null] : ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:963:28: ( ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            else if ( (LA25_0==27) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:964:5: otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSection42021); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection4Access().getSection4Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:968:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:969:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:969:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:970:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection42038); 

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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection42055); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:991:7: otherlv_3= 'section4['
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSection42074); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection4Access().getSection4Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:995:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:996:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:996:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:997:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection42096);
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

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection42108); 

                	newLeafNode(otherlv_5, grammarAccess.getSection4Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1017:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_WS||(LA26_1>=RULE_ID && LA26_1<=RULE_ANY_OTHER)||(LA26_1>=28 && LA26_1<=32)||(LA26_1>=35 && LA26_1<=39)||(LA26_1>=41 && LA26_1<=46)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1017:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection42120); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1021:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1022:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1022:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1023:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection42140);
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
            	    break loop26;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1047:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1048:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1049:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             newCompositeNode(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2178);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();

            state._fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup2188); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1056:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1059:28: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS||(LA31_0>=RULE_ID && LA31_0<=RULE_ANY_OTHER)||(LA31_0>=28 && LA31_0<=31)) ) {
                alt31=1;
            }
            else if ( (LA31_0==32||(LA31_0>=35 && LA31_0<=39)||(LA31_0>=41 && LA31_0<=46)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1060:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1061:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1061:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1062:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2235);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1078:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==32||(LA28_0>=35 && LA28_0<=39)||(LA28_0>=41 && LA28_0<=46)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1078:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1078:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1079:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1079:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1080:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2257);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1096:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==RULE_WS||(LA27_0>=RULE_ID && LA27_0<=RULE_ANY_OTHER)||(LA27_0>=28 && LA27_0<=31)) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1097:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1097:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1098:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2278);
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
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1115:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1115:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==32||(LA30_0>=35 && LA30_0<=39)||(LA30_0>=41 && LA30_0<=46)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1115:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1115:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1116:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1116:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1117:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2310);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1133:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==RULE_WS||(LA29_0>=RULE_ID && LA29_0<=RULE_ANY_OTHER)||(LA29_0>=28 && LA29_0<=31)) ) {
                    	        alt29=1;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1134:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1134:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1135:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2331);
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
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1159:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1160:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1161:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart2370);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart2380); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1168:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1171:28: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1172:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1172:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1173:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1173:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1174:3: lv_text_0_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart2425);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1198:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1199:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1200:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2461);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2472); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1207:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1210:28: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1211:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1211:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt32=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt32=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt32=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt32=4;
                    }
                    break;
                case 28:
                    {
                    alt32=5;
                    }
                    break;
                case 29:
                    {
                    alt32=6;
                    }
                    break;
                case 30:
                    {
                    alt32=7;
                    }
                    break;
                case 31:
                    {
                    alt32=8;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1211:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText2512); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1219:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText2538); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1227:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText2564); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1235:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2590); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_3, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1244:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleText2614); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1251:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleText2633); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1258:2: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleText2652); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getCommaKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1265:2: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleText2671); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getHyphenMinusKeyword_7()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1279:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1280:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             newCompositeNode(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp2712);
            iv_ruleMarkUp=ruleMarkUp();

            state._fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp2722); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1287:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1290:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1291:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1291:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            int alt33=11;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt33=1;
                }
                break;
            case 36:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            case 38:
                {
                alt33=4;
                }
                break;
            case 39:
                {
                alt33=5;
                }
                break;
            case 45:
                {
                alt33=6;
                }
                break;
            case 41:
                {
                alt33=7;
                }
                break;
            case 42:
                {
                alt33=8;
                }
                break;
            case 43:
            case 44:
                {
                alt33=9;
                }
                break;
            case 32:
                {
                alt33=10;
                }
                break;
            case 46:
                {
                alt33=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1292:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2769);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1302:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2796);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1312:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2823);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1322:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2850);
                    this_OrderedList_3=ruleOrderedList();

                    state._fsp--;

                     
                            current = this_OrderedList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1332:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2877);
                    this_UnorderedList_4=ruleUnorderedList();

                    state._fsp--;

                     
                            current = this_UnorderedList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1342:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp2904);
                    this_CodeBlock_5=ruleCodeBlock();

                    state._fsp--;

                     
                            current = this_CodeBlock_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1352:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp2931);
                    this_CodeRef_6=ruleCodeRef();

                    state._fsp--;

                     
                            current = this_CodeRef_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1362:5: this_Link_7= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp2958);
                    this_Link_7=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1372:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp2985);
                    this_ImageRef_8=ruleImageRef();

                    state._fsp--;

                     
                            current = this_ImageRef_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1382:5: this_Table_9= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTableParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTable_in_ruleMarkUp3012);
                    this_Table_9=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1392:5: this_Todo_10= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTodoParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkUp3039);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1408:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1409:2: (iv_ruleTable= ruleTable EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1410:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable3074);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable3084); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1417:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1420:28: ( ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1421:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1421:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1421:2: () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1421:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1422:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableAccess().getTableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTable3130); 

                	newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1431:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1431:2: ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1431:2: ( ruleANY_WS )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( ((LA34_0>=RULE_WS && LA34_0<=RULE_MULTI_NL)||LA34_0==RULE_SINGLE_NL) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1432:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3148);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1439:3: ( (lv_rows_3_0= ruleTableRow ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1440:1: (lv_rows_3_0= ruleTableRow )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1440:1: (lv_rows_3_0= ruleTableRow )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1441:3: lv_rows_3_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable3170);
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
            	    break loop35;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1457:4: ( ruleANY_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_WS && LA36_0<=RULE_MULTI_NL)||LA36_0==RULE_SINGLE_NL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1458:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3189);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTable3202); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1477:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1478:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1479:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow3238);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow3248); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1486:1: ruleTableRow returns [EObject current=null] : ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_data_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1489:28: ( ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1490:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1490:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1490:2: () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1490:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1491:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableRowAccess().getTableRowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleTableRow3294); 

                	newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getTrKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1500:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1500:2: ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1500:2: ( ruleANY_WS )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( ((LA37_0>=RULE_WS && LA37_0<=RULE_MULTI_NL)||LA37_0==RULE_SINGLE_NL) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1501:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3312);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1508:3: ( (lv_data_3_0= ruleTableData ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1509:1: (lv_data_3_0= ruleTableData )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1509:1: (lv_data_3_0= ruleTableData )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:3: lv_data_3_0= ruleTableData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getDataTableDataParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableData_in_ruleTableRow3334);
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
            	    break loop38;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1526:4: ( ruleANY_WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_WS && LA39_0<=RULE_MULTI_NL)||LA39_0==RULE_SINGLE_NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1527:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3353);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTableRow3366); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1546:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:2: (iv_ruleTableData= ruleTableData EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1548:2: iv_ruleTableData= ruleTableData EOF
            {
             newCompositeNode(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData3402);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData3412); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1555:1: ruleTableData returns [EObject current=null] : ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1558:28: ( ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1559:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1559:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1559:2: () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1559:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableDataAccess().getTableDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTableData3458); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDataAccess().getTdKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1569:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_WS && LA42_0<=RULE_ANY_OTHER)||(LA42_0>=28 && LA42_0<=32)||(LA42_0>=35 && LA42_0<=39)||(LA42_0>=41 && LA42_0<=46)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1569:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1569:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_MULTI_NL) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1569:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3471); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1573:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1574:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1574:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1575:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3493);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1591:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_MULTI_NL) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1591:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3505); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1595:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1596:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1596:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1597:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3525);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleTableData3541); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1625:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1626:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1627:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             newCompositeNode(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize3577);
            iv_ruleEmphasize=ruleEmphasize();

            state._fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize3587); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1634:1: ruleEmphasize returns [EObject current=null] : ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_5=null;
        EObject lv_contents_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1637:28: ( ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1638:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1638:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1638:2: () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1638:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1639:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmphasizeAccess().getEmphasizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleEmphasize3633); 

                	newLeafNode(otherlv_1, grammarAccess.getEmphasizeAccess().getEKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1648:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_WS && LA45_0<=RULE_ANY_OTHER)||(LA45_0>=28 && LA45_0<=32)||(LA45_0>=35 && LA45_0<=39)||(LA45_0>=41 && LA45_0<=46)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1648:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1648:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_MULTI_NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1648:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3646); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1652:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1653:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1653:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1654:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3668);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1670:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_MULTI_NL) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1670:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3680); 
                             
                                newLeafNode(this_MULTI_NL_4, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_2()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleEmphasize3695); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1686:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1687:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1688:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor3731);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor3741); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1695:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1698:28: ( (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1699:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1699:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1699:3: otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAnchor3778); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1703:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1704:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1704:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1705:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor3795); 

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

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleAnchor3812); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1733:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1734:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1735:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef3848);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef3858); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1742:1: ruleRef returns [EObject current=null] : (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1745:28: ( (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1746:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1746:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1746:3: otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleRef3895); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1750:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1751:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1751:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1752:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef3915); 

            		newLeafNode(otherlv_1, grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            	

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1763:2: (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1763:4: otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRef3928); 

                        	newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1767:1: (this_MULTI_NL_3= RULE_MULTI_NL )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_MULTI_NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1767:2: this_MULTI_NL_3= RULE_MULTI_NL
                            {
                            this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef3940); 
                             
                                newLeafNode(this_MULTI_NL_3, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_1()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1771:3: ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_WS||(LA48_0>=RULE_ID && LA48_0<=RULE_ANY_OTHER)||(LA48_0>=28 && LA48_0<=32)||(LA48_0>=35 && LA48_0<=39)||(LA48_0>=41 && LA48_0<=46)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1771:4: ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )?
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1771:4: ( (lv_contents_4_0= ruleTextOrMarkup ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1772:1: (lv_contents_4_0= ruleTextOrMarkup )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1772:1: (lv_contents_4_0= ruleTextOrMarkup )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1773:3: lv_contents_4_0= ruleTextOrMarkup
                            {
                             
                            	        newCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef3963);
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

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1789:2: (this_MULTI_NL_5= RULE_MULTI_NL )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==RULE_MULTI_NL) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1789:3: this_MULTI_NL_5= RULE_MULTI_NL
                                    {
                                    this_MULTI_NL_5=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef3975); 
                                     
                                        newLeafNode(this_MULTI_NL_5, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_2_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleRef3990); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1805:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1806:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1807:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             newCompositeNode(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList4028);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList4038); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1814:1: ruleOrderedList returns [EObject current=null] : ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1817:28: ( ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1818:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1818:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1818:2: () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1818:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1819:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderedListAccess().getOrderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleOrderedList4084); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderedListAccess().getOlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1828:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1828:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1828:2: ( ruleANY_WS )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_MULTI_NL)||LA50_0==RULE_SINGLE_NL) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1829:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList4102);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1836:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1837:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1837:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1838:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList4124);
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
            	    break loop51;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1854:4: ( ruleANY_WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_MULTI_NL)||LA52_0==RULE_SINGLE_NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1855:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList4143);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleOrderedList4156); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1874:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1875:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1876:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4192);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList4202); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1883:1: ruleUnorderedList returns [EObject current=null] : ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1886:28: ( ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1887:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1887:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1887:2: () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1887:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1888:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnorderedListAccess().getUnorderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleUnorderedList4248); 

                	newLeafNode(otherlv_1, grammarAccess.getUnorderedListAccess().getUlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1897:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1897:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1897:2: ( ruleANY_WS )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_MULTI_NL)||LA53_0==RULE_SINGLE_NL) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1898:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4266);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1905:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1906:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1906:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList4288);
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
            	    break loop54;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1923:4: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_MULTI_NL)||LA55_0==RULE_SINGLE_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1924:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4307);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleUnorderedList4320); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1943:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1944:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1945:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem4356);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem4366); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1952:1: ruleItem returns [EObject current=null] : ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1955:28: ( ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1956:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1956:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1956:2: () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1956:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1957:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getItemAccess().getItemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleItem4412); 

                	newLeafNode(otherlv_1, grammarAccess.getItemAccess().getItemKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1966:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_ANY_OTHER)||(LA58_0>=28 && LA58_0<=32)||(LA58_0>=35 && LA58_0<=39)||(LA58_0>=41 && LA58_0<=46)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1966:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1966:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_MULTI_NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1966:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4425); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1970:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1971:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1971:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1972:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4447);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1988:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_MULTI_NL) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1988:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4459); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1992:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1993:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1993:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1994:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4479);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleItem4495); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2022:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2023:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2024:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             newCompositeNode(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef4531);
            iv_ruleCodeRef=ruleCodeRef();

            state._fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef4541); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2031:1: ruleCodeRef returns [EObject current=null] : ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2034:28: ( ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2035:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2035:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2035:2: () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2035:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeRefAccess().getCodeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleCodeRef4587); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeRefAccess().getCodeRefKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2045:1: ( ( ruleText ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_WS||(LA59_0>=RULE_ID && LA59_0<=RULE_ANY_OTHER)||(LA59_0>=28 && LA59_0<=31)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2046:1: ( ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2046:1: ( ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2047:3: ruleText
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeRefRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmDeclaredTypeCrossReference_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleCodeRef4610);
                    ruleText();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleCodeRef4623); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2072:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2073:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2074:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4659);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4669); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2081:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2084:28: ( ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2085:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2085:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2085:2: () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2085:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2086:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkAccess().getLinkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleLink4715); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2095:1: ( (lv_url_2_0= ruleText ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_WS||(LA60_0>=RULE_ID && LA60_0<=RULE_ANY_OTHER)||(LA60_0>=28 && LA60_0<=31)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2096:1: (lv_url_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2096:1: (lv_url_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2097:3: lv_url_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4736);
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

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleLink4749); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2117:1: ( ruleANY_WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_WS && LA61_0<=RULE_MULTI_NL)||LA61_0==RULE_SINGLE_NL) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2118:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink4766);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLink4779); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_5());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2129:1: ( (lv_text_6_0= ruleText ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_WS||(LA62_0>=RULE_ID && LA62_0<=RULE_ANY_OTHER)||(LA62_0>=28 && LA62_0<=31)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2130:1: (lv_text_6_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2130:1: (lv_text_6_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2131:3: lv_text_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4800);
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

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleLink4813); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2159:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2160:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2161:2: iv_ruleImageRef= ruleImageRef EOF
            {
             newCompositeNode(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef4849);
            iv_ruleImageRef=ruleImageRef();

            state._fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef4859); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2168:1: ruleImageRef returns [EObject current=null] : ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2171:28: ( ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            else if ( (LA65_0==44) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2172:5: otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '['
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleImageRef4898); 

                        	newLeafNode(otherlv_0, grammarAccess.getImageRefAccess().getImgKeyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2176:1: ( ruleANY_WS )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_WS && LA63_0<=RULE_MULTI_NL)||LA63_0==RULE_SINGLE_NL) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2177:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4915);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2184:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2185:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2185:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2186:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef4933); 

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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2202:2: ( ruleANY_WS )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=RULE_WS && LA64_0<=RULE_MULTI_NL)||LA64_0==RULE_SINGLE_NL) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2203:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef4955);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImageRef4968); 

                        	newLeafNode(otherlv_4, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2215:7: otherlv_5= 'img['
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleImageRef4987); 

                        	newLeafNode(otherlv_5, grammarAccess.getImageRefAccess().getImgKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2219:2: ( (lv_path_6_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2220:1: (lv_path_6_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2220:1: (lv_path_6_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2221:3: lv_path_6_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef5009);
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

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5021); 

                	newLeafNode(otherlv_7, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2241:1: ( ruleANY_WS )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_WS && LA66_0<=RULE_MULTI_NL)||LA66_0==RULE_SINGLE_NL) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2242:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5038);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleImageRef5051); 

                	newLeafNode(otherlv_9, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2253:1: ( (lv_caption_10_0= ruleText ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_WS||(LA67_0>=RULE_ID && LA67_0<=RULE_ANY_OTHER)||(LA67_0>=28 && LA67_0<=31)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2254:1: (lv_caption_10_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2254:1: (lv_caption_10_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2255:3: lv_caption_10_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5072);
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

            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5085); 

                	newLeafNode(otherlv_11, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2275:1: ( ruleANY_WS )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_WS && LA68_0<=RULE_MULTI_NL)||LA68_0==RULE_SINGLE_NL) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2276:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5102);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleImageRef5115); 

                	newLeafNode(otherlv_13, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2287:1: ( (lv_clazz_14_0= ruleText ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_WS||(LA69_0>=RULE_ID && LA69_0<=RULE_ANY_OTHER)||(LA69_0>=28 && LA69_0<=31)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2288:1: (lv_clazz_14_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2288:1: (lv_clazz_14_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2289:3: lv_clazz_14_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5136);
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

            otherlv_15=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5149); 

                	newLeafNode(otherlv_15, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2309:1: ( ruleANY_WS )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_WS && LA70_0<=RULE_MULTI_NL)||LA70_0==RULE_SINGLE_NL) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2310:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5166);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleImageRef5179); 

                	newLeafNode(otherlv_17, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2321:1: ( (lv_style_18_0= ruleText ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_WS||(LA71_0>=RULE_ID && LA71_0<=RULE_ANY_OTHER)||(LA71_0>=28 && LA71_0<=31)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2322:1: (lv_style_18_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2322:1: (lv_style_18_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2323:3: lv_style_18_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_13_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5200);
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

            otherlv_19=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5213); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2351:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2352:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2353:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5249);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock5259); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2360:1: ruleCodeBlock returns [EObject current=null] : ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2363:28: ( ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2364:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2364:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2364:2: () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2364:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeBlockAccess().getCodeBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCodeBlock5305); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getCodeKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2374:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2374:2: ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '['
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2374:2: ( ruleANY_WS )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=RULE_WS && LA72_0<=RULE_MULTI_NL)||LA72_0==RULE_SINGLE_NL) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2375:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5323);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2382:3: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2383:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2383:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2384:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock5344); 

                    		newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getLanguageLangDefCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2395:2: ( ruleANY_WS )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=RULE_WS && LA73_0<=RULE_MULTI_NL)||LA73_0==RULE_SINGLE_NL) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2396:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5361);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5374); 

                        	newLeafNode(otherlv_5, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_3());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2407:1: ( ruleANY_WS )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_WS && LA74_0<=RULE_MULTI_NL)||LA74_0==RULE_SINGLE_NL) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2408:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_4()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5391);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCodeBlock5404); 

                        	newLeafNode(otherlv_7, grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:3: ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_WS && LA80_0<=RULE_ANY_OTHER)||(LA80_0>=28 && LA80_0<=31)) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=35 && LA80_0<=37)||LA80_0==46) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:5: ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:5: ( (lv_contents_8_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2420:1: (lv_contents_8_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2420:1: (lv_contents_8_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2421:3: lv_contents_8_0= ruleCode
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5429);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2437:2: ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=35 && LA77_0<=37)||LA77_0==46) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2437:3: ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2437:3: ( (lv_contents_9_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2438:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2438:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2439:3: lv_contents_9_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5451);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2455:2: ( (lv_contents_10_0= ruleCode ) )?
                    	    int alt76=2;
                    	    int LA76_0 = input.LA(1);

                    	    if ( ((LA76_0>=RULE_WS && LA76_0<=RULE_ANY_OTHER)||(LA76_0>=28 && LA76_0<=31)) ) {
                    	        alt76=1;
                    	    }
                    	    switch (alt76) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2456:1: (lv_contents_10_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2456:1: (lv_contents_10_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2457:3: lv_contents_10_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5472);
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
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2474:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2474:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=35 && LA79_0<=37)||LA79_0==46) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2474:7: ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2474:7: ( (lv_contents_11_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2475:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2475:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2476:3: lv_contents_11_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5504);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2492:2: ( (lv_contents_12_0= ruleCode ) )?
                    	    int alt78=2;
                    	    int LA78_0 = input.LA(1);

                    	    if ( ((LA78_0>=RULE_WS && LA78_0<=RULE_ANY_OTHER)||(LA78_0>=28 && LA78_0<=31)) ) {
                    	        alt78=1;
                    	    }
                    	    switch (alt78) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2493:1: (lv_contents_12_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2493:1: (lv_contents_12_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2494:3: lv_contents_12_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5525);
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
                    	    if ( cnt79 >= 1 ) break loop79;
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5542); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2522:1: entryRuleTodo returns [EObject current=null] : iv_ruleTodo= ruleTodo EOF ;
    public final EObject entryRuleTodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTodo = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2523:2: (iv_ruleTodo= ruleTodo EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2524:2: iv_ruleTodo= ruleTodo EOF
            {
             newCompositeNode(grammarAccess.getTodoRule()); 
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo5578);
            iv_ruleTodo=ruleTodo();

            state._fsp--;

             current =iv_ruleTodo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo5588); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2531:1: ruleTodo returns [EObject current=null] : ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2534:28: ( ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2535:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2535:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2535:2: () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2535:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTodoAccess().getTodoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleTodo5634); 

                	newLeafNode(otherlv_1, grammarAccess.getTodoAccess().getTodoKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2545:1: ( (lv_text_2_0= ruleText ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_WS||(LA81_0>=RULE_ID && LA81_0<=RULE_ANY_OTHER)||(LA81_0>=28 && LA81_0<=31)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2546:1: (lv_text_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2546:1: (lv_text_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2547:3: lv_text_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getTodoAccess().getTextTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleTodo5655);
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

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTodo5668); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2575:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2576:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2577:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode5704);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode5714); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2584:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2587:28: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2588:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2588:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2589:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2589:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2590:3: lv_contents_0_0= ruleCodeText
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode5759);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2614:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2615:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2616:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             newCompositeNode(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5794);
            iv_ruleMarkupInCode=ruleMarkupInCode();

            state._fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode5804); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2623:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_Todo_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2626:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2627:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2627:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt82=1;
                }
                break;
            case 36:
                {
                alt82=2;
                }
                break;
            case 37:
                {
                alt82=3;
                }
                break;
            case 46:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2628:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode5851);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2638:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode5878);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2648:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode5905);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2658:5: this_Todo_3= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getTodoParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkupInCode5932);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2674:1: entryRuleLangDef returns [EObject current=null] : iv_ruleLangDef= ruleLangDef EOF ;
    public final EObject entryRuleLangDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangDef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2675:2: (iv_ruleLangDef= ruleLangDef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:2: iv_ruleLangDef= ruleLangDef EOF
            {
             newCompositeNode(grammarAccess.getLangDefRule()); 
            pushFollow(FOLLOW_ruleLangDef_in_entryRuleLangDef5967);
            iv_ruleLangDef=ruleLangDef();

            state._fsp--;

             current =iv_ruleLangDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangDef5977); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2683:1: ruleLangDef returns [EObject current=null] : ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) ) ;
    public final EObject ruleLangDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_keywords_6_0 = null;

        AntlrDatatypeRuleToken lv_keywords_10_0 = null;

        AntlrDatatypeRuleToken lv_keywords_16_0 = null;

        AntlrDatatypeRuleToken lv_keywords_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2686:28: ( ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==47) ) {
                int LA96_1 = input.LA(2);

                if ( ((LA96_1>=RULE_WS && LA96_1<=RULE_MULTI_NL)||LA96_1==RULE_SINGLE_NL||LA96_1==11||LA96_1==31) ) {
                    alt96=2;
                }
                else if ( (LA96_1==RULE_ID) ) {
                    int LA96_3 = input.LA(3);

                    if ( ((LA96_3>=RULE_WS && LA96_3<=RULE_SINGLE_NL)||(LA96_3>=30 && LA96_3<=31)) ) {
                        alt96=2;
                    }
                    else if ( (LA96_3==11) ) {
                        switch ( input.LA(4) ) {
                        case RULE_MULTI_NL:
                            {
                            int LA96_5 = input.LA(5);

                            if ( (LA96_5==EOF||LA96_5==14||(LA96_5>=16 && LA96_5<=17)||LA96_5==47) ) {
                                alt96=2;
                            }
                            else if ( ((LA96_5>=RULE_WS && LA96_5<=RULE_MULTI_NL)||LA96_5==RULE_SINGLE_NL||LA96_5==15) ) {
                                alt96=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 96, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_WS:
                        case RULE_SINGLE_NL:
                        case 15:
                            {
                            alt96=1;
                            }
                            break;
                        case EOF:
                            {
                            alt96=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 96, 4, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:4: otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleLangDef6015); 

                        	newLeafNode(otherlv_0, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2691:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2692:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2692:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2693:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6032); 

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

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6049); 

                        	newLeafNode(otherlv_2, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2713:1: ( ruleANY_WS )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=RULE_WS && LA83_0<=RULE_MULTI_NL)||LA83_0==RULE_SINGLE_NL) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2714:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6066);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleLangDef6079); 

                        	newLeafNode(otherlv_4, grammarAccess.getLangDefAccess().getLeftSquareBracketKeyword_0_4());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2725:1: ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=RULE_WS && LA89_0<=RULE_SINGLE_NL)||LA89_0==31) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2725:2: ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2725:2: ( ruleANY_WS )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( ((LA84_0>=RULE_WS && LA84_0<=RULE_MULTI_NL)||LA84_0==RULE_SINGLE_NL) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2726:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6097);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop84;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2733:3: ( (lv_keywords_6_0= ruleKeyWord ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2734:1: (lv_keywords_6_0= ruleKeyWord )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2734:1: (lv_keywords_6_0= ruleKeyWord )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2735:3: lv_keywords_6_0= ruleKeyWord
                            {
                             
                            	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef6119);
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

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2751:2: ( ruleANY_WS )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( ((LA85_0>=RULE_WS && LA85_0<=RULE_MULTI_NL)||LA85_0==RULE_SINGLE_NL) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2752:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_2()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6136);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop85;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2759:3: (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==30) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2759:5: otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleLangDef6150); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getLangDefAccess().getCommaKeyword_0_5_3_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2763:1: ( ruleANY_WS )*
                            	    loop86:
                            	    do {
                            	        int alt86=2;
                            	        int LA86_0 = input.LA(1);

                            	        if ( ((LA86_0>=RULE_WS && LA86_0<=RULE_MULTI_NL)||LA86_0==RULE_SINGLE_NL) ) {
                            	            alt86=1;
                            	        }


                            	        switch (alt86) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2764:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_3_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6167);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop86;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2771:3: ( (lv_keywords_10_0= ruleKeyWord ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2772:1: (lv_keywords_10_0= ruleKeyWord )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2772:1: (lv_keywords_10_0= ruleKeyWord )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2773:3: lv_keywords_10_0= ruleKeyWord
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_3_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef6189);
                            	    lv_keywords_10_0=ruleKeyWord();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_10_0, 
                            	            		"KeyWord");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2789:2: ( ruleANY_WS )*
                            	    loop87:
                            	    do {
                            	        int alt87=2;
                            	        int LA87_0 = input.LA(1);

                            	        if ( ((LA87_0>=RULE_WS && LA87_0<=RULE_MULTI_NL)||LA87_0==RULE_SINGLE_NL) ) {
                            	            alt87=1;
                            	        }


                            	        switch (alt87) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2790:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_3_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6206);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop87;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop88;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6223); 

                        	newLeafNode(otherlv_12, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2802:6: ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2802:6: ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2802:7: () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']'
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2802:7: ()
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2803:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLangDefAccess().getLangDefAction_1_0(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,47,FOLLOW_47_in_ruleLangDef6252); 

                        	newLeafNode(otherlv_14, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_1_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:1: ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=RULE_WS && LA95_0<=RULE_SINGLE_NL)||LA95_0==31) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:2: ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:2: ( ruleANY_WS )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( ((LA90_0>=RULE_WS && LA90_0<=RULE_MULTI_NL)||LA90_0==RULE_SINGLE_NL) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2813:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6270);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop90;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2820:3: ( (lv_keywords_16_0= ruleKeyWord ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2821:1: (lv_keywords_16_0= ruleKeyWord )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2821:1: (lv_keywords_16_0= ruleKeyWord )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2822:3: lv_keywords_16_0= ruleKeyWord
                            {
                             
                            	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef6292);
                            lv_keywords_16_0=ruleKeyWord();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"keywords",
                                    		lv_keywords_16_0, 
                                    		"KeyWord");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2838:2: ( ruleANY_WS )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( ((LA91_0>=RULE_WS && LA91_0<=RULE_MULTI_NL)||LA91_0==RULE_SINGLE_NL) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2839:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_2()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6309);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2846:3: (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==30) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2846:5: otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_18=(Token)match(input,30,FOLLOW_30_in_ruleLangDef6323); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getLangDefAccess().getCommaKeyword_1_2_3_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2850:1: ( ruleANY_WS )*
                            	    loop92:
                            	    do {
                            	        int alt92=2;
                            	        int LA92_0 = input.LA(1);

                            	        if ( ((LA92_0>=RULE_WS && LA92_0<=RULE_MULTI_NL)||LA92_0==RULE_SINGLE_NL) ) {
                            	            alt92=1;
                            	        }


                            	        switch (alt92) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2851:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_3_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6340);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop92;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2858:3: ( (lv_keywords_20_0= ruleKeyWord ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2859:1: (lv_keywords_20_0= ruleKeyWord )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2859:1: (lv_keywords_20_0= ruleKeyWord )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2860:3: lv_keywords_20_0= ruleKeyWord
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_1_2_3_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef6362);
                            	    lv_keywords_20_0=ruleKeyWord();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_20_0, 
                            	            		"KeyWord");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2876:2: ( ruleANY_WS )*
                            	    loop93:
                            	    do {
                            	        int alt93=2;
                            	        int LA93_0 = input.LA(1);

                            	        if ( ((LA93_0>=RULE_WS && LA93_0<=RULE_MULTI_NL)||LA93_0==RULE_SINGLE_NL) ) {
                            	            alt93=1;
                            	        }


                            	        switch (alt93) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2877:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_3_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6379);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop93;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6396); 

                        	newLeafNode(otherlv_22, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_1_3());
                        

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2896:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2897:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2898:2: iv_ruleCodeText= ruleCodeText EOF
            {
             newCompositeNode(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText6434);
            iv_ruleCodeText=ruleCodeText();

            state._fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText6445); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2905:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2908:28: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2909:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2909:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt97=0;
            loop97:
            do {
                int alt97=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt97=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt97=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt97=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt97=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt97=5;
                    }
                    break;
                case 28:
                    {
                    alt97=6;
                    }
                    break;
                case 29:
                    {
                    alt97=7;
                    }
                    break;
                case 30:
                    {
                    alt97=8;
                    }
                    break;
                case 31:
                    {
                    alt97=9;
                    }
                    break;

                }

                switch (alt97) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2909:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText6485); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2917:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText6511); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        newLeafNode(this_MULTI_NL_1, grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2925:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText6537); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2933:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6563); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_3, grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2941:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6589); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2950:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleCodeText6613); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2957:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleCodeText6632); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2964:2: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleCodeText6651); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getCommaKeyword_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:2: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleCodeText6670); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getHyphenMinusKeyword_8()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2984:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2985:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2986:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             newCompositeNode(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS6712);
            iv_ruleANY_WS=ruleANY_WS();

            state._fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS6723); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2993:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2996:28: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2997:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2997:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt98=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt98=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt98=2;
                }
                break;
            case RULE_WS:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2997:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6763); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        newLeafNode(this_MULTI_NL_0, grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3005:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6789); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        newLeafNode(this_SINGLE_NL_1, grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3013:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS6815); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3028:1: entryRuleKeyWord returns [String current=null] : iv_ruleKeyWord= ruleKeyWord EOF ;
    public final String entryRuleKeyWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyWord = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3029:2: (iv_ruleKeyWord= ruleKeyWord EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3030:2: iv_ruleKeyWord= ruleKeyWord EOF
            {
             newCompositeNode(grammarAccess.getKeyWordRule()); 
            pushFollow(FOLLOW_ruleKeyWord_in_entryRuleKeyWord6861);
            iv_ruleKeyWord=ruleKeyWord();

            state._fsp--;

             current =iv_ruleKeyWord.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyWord6872); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3037:1: ruleKeyWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleKeyWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3040:28: ( (this_ID_0= RULE_ID | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3041:1: (this_ID_0= RULE_ID | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3041:1: (this_ID_0= RULE_ID | kw= '-' )+
            int cnt99=0;
            loop99:
            do {
                int alt99=3;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==RULE_ID) ) {
                    alt99=1;
                }
                else if ( (LA99_0==31) ) {
                    alt99=2;
                }


                switch (alt99) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3041:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyWord6912); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getKeyWordAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3050:2: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleKeyWord6936); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getKeyWordAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
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


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String DFA35_eotS =
        "\6\uffff";
    static final String DFA35_eofS =
        "\6\uffff";
    static final String DFA35_minS =
        "\4\4\2\uffff";
    static final String DFA35_maxS =
        "\4\41\2\uffff";
    static final String DFA35_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA35_specialS =
        "\6\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 1431:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*";
        }
    }
    static final String DFA38_eotS =
        "\6\uffff";
    static final String DFA38_eofS =
        "\6\uffff";
    static final String DFA38_minS =
        "\4\4\2\uffff";
    static final String DFA38_maxS =
        "\4\42\2\uffff";
    static final String DFA38_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA38_specialS =
        "\6\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\26\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\26\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\26\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\26\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 1500:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*";
        }
    }
    static final String DFA51_eotS =
        "\6\uffff";
    static final String DFA51_eofS =
        "\6\uffff";
    static final String DFA51_minS =
        "\4\4\2\uffff";
    static final String DFA51_maxS =
        "\4\50\2\uffff";
    static final String DFA51_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA51_specialS =
        "\6\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()* loopback of 1828:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA54_eotS =
        "\6\uffff";
    static final String DFA54_eofS =
        "\6\uffff";
    static final String DFA54_minS =
        "\4\4\2\uffff";
    static final String DFA54_maxS =
        "\4\50\2\uffff";
    static final String DFA54_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA54_specialS =
        "\6\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\34\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 1897:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA75_eotS =
        "\21\uffff";
    static final String DFA75_eofS =
        "\11\uffff\4\5\1\uffff\3\5";
    static final String DFA75_minS =
        "\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA75_maxS =
        "\5\56\1\uffff\7\56\1\uffff\3\56";
    static final String DFA75_acceptS =
        "\5\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA75_specialS =
        "\21\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\4\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\4\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\14\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\14\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\14\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\2\uffff\1\5\2\uffff\1\5\1\15\21\5\2"+
            "\uffff\5\5\1\uffff\6\5",
            "",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\14\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\14\uffff\5"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\5\uffff\1\5\1\15\21\5\2\uffff\5\5\1"+
            "\uffff\6\5"
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "2374:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXdocFile_in_entryRuleXdocFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXdocFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleXdocFile131 = new BitSet(new long[]{0x0000000000FF4422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144 = new BitSet(new long[]{0x0000000000FF4402L});
    public static final BitSet FOLLOW_ruleDocument_in_ruleXdocFile169 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleXdocFile188 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleXdocFile207 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleXdocFile226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDocument327 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument360 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument372 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDocument383 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument404 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument416 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDocument441 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument474 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument488 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleLangDef_in_ruleDocument508 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument522 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument542 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterRef_in_ruleChapter637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleChapter657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter674 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChapter691 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_16_in_ruleChapter710 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter732 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter744 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter756 = new BitSet(new long[]{0x00007EF9F00001D0L});
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
    public static final BitSet FOLLOW_15_in_ruleSection1075 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_19_in_ruleSection1094 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection1128 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1140 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1160 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1174 = new BitSet(new long[]{0x0000000000FF4400L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleSection1194 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSectionRef_in_entryRuleSectionRef1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionRef1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSectionRef1280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSectionRef1300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSectionRef1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_entryRuleSection21348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2Ref_in_ruleSection21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSection21425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection21442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection21459 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_22_in_ruleSection21478 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection21512 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21524 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21544 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21558 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSection21578 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2Ref_in_entryRuleSection2Ref1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection2Ref1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSection2Ref1664 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection2Ref1684 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection2Ref1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSection31781 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31798 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection31815 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_25_in_ruleSection31834 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31856 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31868 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31880 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31900 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31914 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31934 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSection42021 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection42038 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection42055 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_27_in_ruleSection42074 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection42096 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection42108 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection42120 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection42140 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2235 = new BitSet(new long[]{0x00007EF9F00001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2257 = new BitSet(new long[]{0x00007EF9F00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2278 = new BitSet(new long[]{0x00007EF9F00001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2310 = new BitSet(new long[]{0x00007EF9F00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2331 = new BitSet(new long[]{0x00007EF9F00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText2512 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText2538 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText2564 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2590 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_28_in_ruleText2614 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_29_in_ruleText2633 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_30_in_ruleText2652 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_31_in_ruleText2671 = new BitSet(new long[]{0x00000000F00001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleMarkUp3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkUp3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable3074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTable3130 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3148 = new BitSet(new long[]{0x00000002000000B0L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable3170 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3189 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTable3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTableRow3294 = new BitSet(new long[]{0x00000004000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3312 = new BitSet(new long[]{0x00000004000000B0L});
    public static final BitSet FOLLOW_ruleTableData_in_ruleTableRow3334 = new BitSet(new long[]{0x00000004000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3353 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTableRow3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData3402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTableData3458 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3471 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3493 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3505 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3525 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleTableData3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEmphasize3633 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3646 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3668 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3680 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor3731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAnchor3778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor3795 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAnchor3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef3848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRef3895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef3915 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRef3928 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef3940 = new BitSet(new long[]{0x00007EF9F00009D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef3963 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef3975 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList4028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOrderedList4084 = new BitSet(new long[]{0x00000100000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList4102 = new BitSet(new long[]{0x00000100000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList4124 = new BitSet(new long[]{0x00000100000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList4143 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUnorderedList4248 = new BitSet(new long[]{0x00000100000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4266 = new BitSet(new long[]{0x00000100000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList4288 = new BitSet(new long[]{0x00000100000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4307 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleItem4412 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4425 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4447 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4459 = new BitSet(new long[]{0x00007EF9F00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4479 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleItem4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef4531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCodeRef4587 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef4610 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLink4715 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4736 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4749 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink4766 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLink4779 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4800 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef4849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleImageRef4898 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4915 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef4933 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef4955 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef4968 = new BitSet(new long[]{0x00000000F00001D0L});
    public static final BitSet FOLLOW_44_in_ruleImageRef4987 = new BitSet(new long[]{0x00000000F00001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5009 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5021 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5038 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef5051 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5072 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5085 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5102 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef5115 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5136 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5149 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5166 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef5179 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5200 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCodeBlock5305 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5323 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock5344 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5361 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5374 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5391 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleCodeBlock5404 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5429 = new BitSet(new long[]{0x00007EF9F00009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5451 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5472 = new BitSet(new long[]{0x00007EF9F00009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5504 = new BitSet(new long[]{0x00007EF9F00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5525 = new BitSet(new long[]{0x00007EF9F00009D0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo5578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTodo5634 = new BitSet(new long[]{0x00000000F00009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleTodo5655 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTodo5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode5704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkupInCode5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangDef_in_entryRuleLangDef5967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangDef5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLangDef6015 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6032 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6049 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6066 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLangDef6079 = new BitSet(new long[]{0x00000000800008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6097 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef6119 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6136 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_30_in_ruleLangDef6150 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6167 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef6189 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6206 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLangDef6252 = new BitSet(new long[]{0x00000000800008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6270 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef6292 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6309 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_30_in_ruleLangDef6323 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6340 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef6362 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6379 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText6434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText6485 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText6511 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText6537 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6563 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6589 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_28_in_ruleCodeText6613 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_29_in_ruleCodeText6632 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_30_in_ruleCodeText6651 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_31_in_ruleCodeText6670 = new BitSet(new long[]{0x00000000F00001F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS6712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyWord_in_entryRuleKeyWord6861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyWord6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyWord6912 = new BitSet(new long[]{0x0000000080000042L});
    public static final BitSet FOLLOW_31_in_ruleKeyWord6936 = new BitSet(new long[]{0x0000000080000042L});

}