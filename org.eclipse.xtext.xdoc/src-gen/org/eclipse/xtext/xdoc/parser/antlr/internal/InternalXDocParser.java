package org.eclipse.xtext.xdoc.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.xdoc.services.XDocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'chapter:'", "'['", "'chapter['", "']'", "'section:'", "'section['", "'subsection:'", "'subsection['", "'section3:'", "'section3['", "'section4:'", "'section4['", "'\\\\['", "'\\\\]'", "'emph['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'img['", "'code['", "':'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_MULTI_NL=5;
    public static final int RULE_SINGLE_NL=7;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_SL_COMMENT=9;

        public InternalXDocParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g"; }



     	private XDocGrammarAccess grammarAccess;
     	
        public InternalXDocParser(TokenStream input, IAstFactory factory, XDocGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected XDocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDocument
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:77:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:78:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:79:2: iv_ruleDocument= ruleDocument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDocumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();
            _fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end entryRuleDocument


    // $ANTLR start ruleDocument
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:86:1: ruleDocument returns [EObject current=null] : ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_chapters_3_0 = null;

        EObject lv_chapters_5_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_8_0 = null;

        EObject lv_subsections_9_0 = null;

        EObject lv_subsections_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:91:6: ( ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getDocumentAccess().getDocumentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDocumentAccess().getDocumentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:2: ( RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleDocument129); 
                     
                        createLeafNode(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:107:3: ( RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:107:4: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument140); 
                     
                        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:3: ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==10||LA8_0==12||(LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 10:
                    case 12:
                        {
                        alt6=1;
                        }
                        break;
                    case 14:
                    case 15:
                        {
                        alt6=2;
                        }
                        break;
                    case 16:
                    case 17:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) )", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:5: ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:5: ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:6: ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:6: ( (lv_chapters_3_0= ruleChapter ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:112:1: (lv_chapters_3_0= ruleChapter )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:112:1: (lv_chapters_3_0= ruleChapter )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:113:3: lv_chapters_3_0= ruleChapter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleChapter_in_ruleDocument165);
                            lv_chapters_3_0=ruleChapter();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"chapters",
                            	        		lv_chapters_3_0, 
                            	        		"Chapter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:135:2: ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==RULE_MULTI_NL) ) {
                                    int LA3_1 = input.LA(2);

                                    if ( (LA3_1==10||LA3_1==12) ) {
                                        alt3=1;
                                    }


                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:135:3: RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument175); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:139:1: ( (lv_chapters_5_0= ruleChapter ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:140:1: (lv_chapters_5_0= ruleChapter )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:140:1: (lv_chapters_5_0= ruleChapter )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:141:3: lv_chapters_5_0= ruleChapter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument195);
                            	    lv_chapters_5_0=ruleChapter();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"chapters",
                            	    	        		lv_chapters_5_0, 
                            	    	        		"Chapter", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:6: ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:6: ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:7: ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:7: ( (lv_sections_6_0= ruleSection ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:165:1: (lv_sections_6_0= ruleSection )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:165:1: (lv_sections_6_0= ruleSection )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:166:3: lv_sections_6_0= ruleSection
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSection_in_ruleDocument226);
                            lv_sections_6_0=ruleSection();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_6_0, 
                            	        		"Section", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:188:2: ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==RULE_MULTI_NL) ) {
                                    int LA4_1 = input.LA(2);

                                    if ( ((LA4_1>=14 && LA4_1<=15)) ) {
                                        alt4=1;
                                    }


                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:188:3: RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument236); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:192:1: ( (lv_sections_8_0= ruleSection ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:193:1: (lv_sections_8_0= ruleSection )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:193:1: (lv_sections_8_0= ruleSection )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:194:3: lv_sections_8_0= ruleSection
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSection_in_ruleDocument256);
                            	    lv_sections_8_0=ruleSection();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_8_0, 
                            	    	        		"Section", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:6: ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:6: ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:7: ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:7: ( (lv_subsections_9_0= ruleSubSection ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:218:1: (lv_subsections_9_0= ruleSubSection )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:218:1: (lv_subsections_9_0= ruleSubSection )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:219:3: lv_subsections_9_0= ruleSubSection
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSubSection_in_ruleDocument287);
                            lv_subsections_9_0=ruleSubSection();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"subsections",
                            	        		lv_subsections_9_0, 
                            	        		"SubSection", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:241:2: ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_MULTI_NL) ) {
                                    int LA5_1 = input.LA(2);

                                    if ( ((LA5_1>=16 && LA5_1<=17)) ) {
                                        alt5=1;
                                    }


                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:241:3: RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument297); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:245:1: ( (lv_subsections_11_0= ruleSubSection ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:246:1: (lv_subsections_11_0= ruleSubSection )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:246:1: (lv_subsections_11_0= ruleSubSection )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:247:3: lv_subsections_11_0= ruleSubSection
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSubSection_in_ruleDocument317);
                            	    lv_subsections_11_0=ruleSubSection();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"subsections",
                            	    	        		lv_subsections_11_0, 
                            	    	        		"SubSection", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:269:6: ( RULE_MULTI_NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_MULTI_NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:269:7: RULE_MULTI_NL
                            {
                            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument331); 
                             
                                createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDocument


    // $ANTLR start entryRuleChapter
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:281:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:282:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:283:2: iv_ruleChapter= ruleChapter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChapterRule(), currentNode); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter370);
            iv_ruleChapter=ruleChapter();
            _fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter380); 

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
    // $ANTLR end entryRuleChapter


    // $ANTLR start ruleChapter
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:290:1: ruleChapter returns [EObject current=null] : ( ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:295:6: ( ( ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:2: ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:2: ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("296:2: ( ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'chapter[' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:3: ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:3: ( 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:5: 'chapter:' ( (lv_name_1_0= RULE_ID ) ) '['
                    {
                    match(input,10,FOLLOW_10_in_ruleChapter417); 

                            createLeafNode(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:300:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:301:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:301:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:302:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter434); 

                    			createLeafNode(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,11,FOLLOW_11_in_ruleChapter449); 

                            createLeafNode(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:329:7: 'chapter['
                    {
                    match(input,12,FOLLOW_12_in_ruleChapter466); 

                            createLeafNode(grammarAccess.getChapterAccess().getChapterKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:333:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:334:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:334:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:335:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter488);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleChapter498); 

                    createLeafNode(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:361:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_MULTI_NL) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_WS||(LA10_1>=RULE_ID && LA10_1<=RULE_ANY_OTHER)||(LA10_1>=22 && LA10_1<=28)||(LA10_1>=30 && LA10_1<=34)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:361:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter508); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:365:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:366:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:366:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:367:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter528);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:389:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_MULTI_NL) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=14 && LA11_1<=15)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:389:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter540); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:393:1: ( (lv_contents_9_0= ruleSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:394:1: (lv_contents_9_0= ruleSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:394:1: (lv_contents_9_0= ruleSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:395:3: lv_contents_9_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleChapter560);
            	    lv_contents_9_0=ruleSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
            	    	        		"Section", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleChapter


    // $ANTLR start entryRuleSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:425:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:426:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:427:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection598);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection608); 

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
    // $ANTLR end entryRuleSection


    // $ANTLR start ruleSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:434:1: ruleSection returns [EObject current=null] : ( ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:439:6: ( ( ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:1: ( ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:1: ( ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:2: ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:2: ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("440:2: ( ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section[' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:3: ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:3: ( 'section:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:440:5: 'section:' ( (lv_name_1_0= RULE_ID ) ) '['
                    {
                    match(input,14,FOLLOW_14_in_ruleSection645); 

                            createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:444:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:445:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:445:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:446:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection662); 

                    			createLeafNode(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,11,FOLLOW_11_in_ruleSection677); 

                            createLeafNode(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:473:7: 'section['
                    {
                    match(input,15,FOLLOW_15_in_ruleSection694); 

                            createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:477:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:478:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:478:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:479:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection716);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleSection726); 

                    createLeafNode(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:505:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_MULTI_NL) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_WS||(LA13_1>=RULE_ID && LA13_1<=RULE_ANY_OTHER)||(LA13_1>=22 && LA13_1<=28)||(LA13_1>=30 && LA13_1<=34)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:505:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection736); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:509:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:510:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:510:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:511:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection756);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:533:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTI_NL) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=16 && LA14_1<=17)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:533:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection768); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:537:1: ( (lv_contents_9_0= ruleSubSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:538:1: (lv_contents_9_0= ruleSubSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:538:1: (lv_contents_9_0= ruleSubSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:539:3: lv_contents_9_0= ruleSubSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubSection_in_ruleSection788);
            	    lv_contents_9_0=ruleSubSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
            	    	        		"SubSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleSubSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:569:1: entryRuleSubSection returns [EObject current=null] : iv_ruleSubSection= ruleSubSection EOF ;
    public final EObject entryRuleSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:570:2: (iv_ruleSubSection= ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:571:2: iv_ruleSubSection= ruleSubSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection826);
            iv_ruleSubSection=ruleSubSection();
            _fsp--;

             current =iv_ruleSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection836); 

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
    // $ANTLR end entryRuleSubSection


    // $ANTLR start ruleSubSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:578:1: ruleSubSection returns [EObject current=null] : ( ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSubSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:583:6: ( ( ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:1: ( ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:1: ( ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:2: ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:2: ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            else if ( (LA15_0==17) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("584:2: ( ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'subsection[' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:3: ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:3: ( 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:5: 'subsection:' ( (lv_name_1_0= RULE_ID ) ) '['
                    {
                    match(input,16,FOLLOW_16_in_ruleSubSection873); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:588:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:589:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:589:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:590:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSection890); 

                    			createLeafNode(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,11,FOLLOW_11_in_ruleSubSection905); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_0_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:617:7: 'subsection['
                    {
                    match(input,17,FOLLOW_17_in_ruleSubSection922); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:621:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:622:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:622:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:623:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection944);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleSubSection954); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:649:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTI_NL) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_WS||(LA16_1>=RULE_ID && LA16_1<=RULE_ANY_OTHER)||(LA16_1>=22 && LA16_1<=28)||(LA16_1>=30 && LA16_1<=34)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:649:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection964); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:653:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:654:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:654:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:655:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection984);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:677:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_MULTI_NL) ) {
                    int LA17_1 = input.LA(2);

                    if ( ((LA17_1>=18 && LA17_1<=19)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:677:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection996); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:681:1: ( (lv_contents_9_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:682:1: (lv_contents_9_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:682:1: (lv_contents_9_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:683:3: lv_contents_9_0= ruleSection3
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSubSection1016);
            	    lv_contents_9_0=ruleSection3();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
            	    	        		"Section3", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubSection


    // $ANTLR start entryRuleSection3
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:713:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:714:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:715:2: iv_ruleSection3= ruleSection3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection3Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31054);
            iv_ruleSection3=ruleSection3();
            _fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31064); 

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
    // $ANTLR end entryRuleSection3


    // $ANTLR start ruleSection3
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:722:1: ruleSection3 returns [EObject current=null] : ( ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:727:6: ( ( ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:1: ( ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:1: ( ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:2: ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:2: ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==19) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("728:2: ( ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section3[' )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:3: ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:3: ( 'section3:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:5: 'section3:' ( (lv_name_1_0= RULE_ID ) ) '['
                    {
                    match(input,18,FOLLOW_18_in_ruleSection31101); 

                            createLeafNode(grammarAccess.getSection3Access().getSection3Keyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:732:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:733:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:733:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:734:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31118); 

                    			createLeafNode(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,11,FOLLOW_11_in_ruleSection31133); 

                            createLeafNode(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:761:7: 'section3['
                    {
                    match(input,19,FOLLOW_19_in_ruleSection31150); 

                            createLeafNode(grammarAccess.getSection3Access().getSection3Keyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:765:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:766:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:766:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:767:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31172);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleSection31182); 

                    createLeafNode(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:793:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MULTI_NL) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_WS||(LA19_1>=RULE_ID && LA19_1<=RULE_ANY_OTHER)||(LA19_1>=22 && LA19_1<=28)||(LA19_1>=30 && LA19_1<=34)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:793:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31192); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:797:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:798:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:798:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:799:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31212);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:821:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTI_NL) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=20 && LA20_1<=21)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:821:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31224); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:825:1: ( (lv_contents_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:826:1: (lv_contents_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:826:1: (lv_contents_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:827:3: lv_contents_9_0= ruleSection4
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31244);
            	    lv_contents_9_0=ruleSection4();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
            	    	        		"Section4", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSection3


    // $ANTLR start entryRuleSection4
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:857:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:858:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:859:2: iv_ruleSection4= ruleSection4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection4Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41282);
            iv_ruleSection4=ruleSection4();
            _fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41292); 

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
    // $ANTLR end entryRuleSection4


    // $ANTLR start ruleSection4
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:866:1: ruleSection4 returns [EObject current=null] : ( ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:871:6: ( ( ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:1: ( ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:1: ( ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:2: ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:2: ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            else if ( (LA21_0==21) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("872:2: ( ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' ) | 'section4[' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:3: ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:3: ( 'section4:' ( (lv_name_1_0= RULE_ID ) ) '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:5: 'section4:' ( (lv_name_1_0= RULE_ID ) ) '['
                    {
                    match(input,20,FOLLOW_20_in_ruleSection41329); 

                            createLeafNode(grammarAccess.getSection4Access().getSection4Keyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:876:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:878:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection41346); 

                    			createLeafNode(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,11,FOLLOW_11_in_ruleSection41361); 

                            createLeafNode(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:905:7: 'section4['
                    {
                    match(input,21,FOLLOW_21_in_ruleSection41378); 

                            createLeafNode(grammarAccess.getSection4Access().getSection4Keyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:909:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:910:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:910:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:911:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41400);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleSection41410); 

                    createLeafNode(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:937:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MULTI_NL) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_WS||(LA22_1>=RULE_ID && LA22_1<=RULE_ANY_OTHER)||(LA22_1>=22 && LA22_1<=28)||(LA22_1>=30 && LA22_1<=34)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:937:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection41420); 
            	     
            	        createLeafNode(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:941:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:942:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:942:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:943:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41440);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:975:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:976:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:977:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1480);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();
            _fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup1490); 

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
    // $ANTLR end entryRuleTextOrMarkup


    // $ANTLR start ruleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:984:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:989:6: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS||(LA27_0>=RULE_ID && LA27_0<=RULE_ANY_OTHER)||(LA27_0>=22 && LA27_0<=23)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=24 && LA27_0<=28)||(LA27_0>=30 && LA27_0<=34)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("990:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:990:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:991:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:991:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:992:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1537);
                    lv_contents_0_0=ruleTextPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_0_0, 
                    	        		"TextPart", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1014:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=24 && LA24_0<=28)||(LA24_0>=30 && LA24_0<=34)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1014:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1014:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1015:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1015:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1016:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1559);
                    	    lv_contents_1_0=ruleMarkUp();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_1_0, 
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1038:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_WS||(LA23_0>=RULE_ID && LA23_0<=RULE_ANY_OTHER)||(LA23_0>=22 && LA23_0<=23)) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1039:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1039:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1040:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1580);
                    	            lv_contents_2_0=ruleTextPart();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_2_0, 
                    	            	        		"TextPart", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1063:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1063:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=24 && LA26_0<=28)||(LA26_0>=30 && LA26_0<=34)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1063:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1063:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1064:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1064:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1065:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1612);
                    	    lv_contents_3_0=ruleMarkUp();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_3_0, 
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1087:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==RULE_WS||(LA25_0>=RULE_ID && LA25_0<=RULE_ANY_OTHER)||(LA25_0>=22 && LA25_0<=23)) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1088:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1088:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1089:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1633);
                    	            lv_contents_4_0=ruleTextPart();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_4_0, 
                    	            	        		"TextPart", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTextOrMarkup


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1119:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1120:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1121:2: iv_ruleTextPart= ruleTextPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1672);
            iv_ruleTextPart=ruleTextPart();
            _fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1682); 

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
    // $ANTLR end entryRuleTextPart


    // $ANTLR start ruleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1128:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1133:6: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1134:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1134:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1135:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1135:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1136:3: lv_text_0_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart1727);
            lv_text_0_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_0_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTextPart


    // $ANTLR start entryRuleText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1166:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1167:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1168:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1763);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1774); 

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1175:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1180:6: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt28=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt28=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt28=4;
                    }
                    break;
                case 22:
                    {
                    alt28=5;
                    }
                    break;
                case 23:
                    {
                    alt28=6;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1814); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1189:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText1840); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1197:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)input.LT(1);
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText1866); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1205:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText1892); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1214:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleText1916); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1221:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,23,FOLLOW_23_in_ruleText1935); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleText


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1234:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1235:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1236:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkUpRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp1976);
            iv_ruleMarkUp=ruleMarkUp();
            _fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp1986); 

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
    // $ANTLR end entryRuleMarkUp


    // $ANTLR start ruleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1243:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1248:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1249:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1249:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case 26:
                {
                alt29=3;
                }
                break;
            case 27:
                {
                alt29=4;
                }
                break;
            case 28:
                {
                alt29=5;
                }
                break;
            case 34:
                {
                alt29=6;
                }
                break;
            case 30:
                {
                alt29=7;
                }
                break;
            case 31:
                {
                alt29=8;
                }
                break;
            case 32:
            case 33:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1249:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1250:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2033);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1260:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2060);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1270:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2087);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1280:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2114);
                    this_OrderedList_3=ruleOrderedList();
                    _fsp--;

                     
                            current = this_OrderedList_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1290:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2141);
                    this_UnorderedList_4=ruleUnorderedList();
                    _fsp--;

                     
                            current = this_UnorderedList_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1300:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp2168);
                    this_CodeBlock_5=ruleCodeBlock();
                    _fsp--;

                     
                            current = this_CodeBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1310:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp2195);
                    this_CodeRef_6=ruleCodeRef();
                    _fsp--;

                     
                            current = this_CodeRef_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1320:5: this_Link_7= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp2222);
                    this_Link_7=ruleLink();
                    _fsp--;

                     
                            current = this_Link_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1330:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp2249);
                    this_ImageRef_8=ruleImageRef();
                    _fsp--;

                     
                            current = this_ImageRef_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMarkUp


    // $ANTLR start entryRuleEmphasize
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1346:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1347:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1348:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmphasizeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize2284);
            iv_ruleEmphasize=ruleEmphasize();
            _fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize2294); 

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
    // $ANTLR end entryRuleEmphasize


    // $ANTLR start ruleEmphasize
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1355:1: ruleEmphasize returns [EObject current=null] : ( 'emph[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1360:6: ( ( 'emph[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1361:1: ( 'emph[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1361:1: ( 'emph[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1361:3: 'emph[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']'
            {
            match(input,24,FOLLOW_24_in_ruleEmphasize2329); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getEmphKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1365:1: ( RULE_MULTI_NL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_MULTI_NL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1365:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2339); 
                     
                        createLeafNode(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1369:3: ( (lv_contents_2_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1370:1: (lv_contents_2_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1370:1: (lv_contents_2_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1371:3: lv_contents_2_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2361);
            lv_contents_2_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmphasizeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"contents",
            	        		lv_contents_2_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1393:2: ( RULE_MULTI_NL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_MULTI_NL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1393:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2371); 
                     
                        createLeafNode(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleEmphasize2382); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmphasize


    // $ANTLR start entryRuleAnchor
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1409:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1410:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1411:2: iv_ruleAnchor= ruleAnchor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnchorRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor2418);
            iv_ruleAnchor=ruleAnchor();
            _fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor2428); 

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
    // $ANTLR end entryRuleAnchor


    // $ANTLR start ruleAnchor
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1418:1: ruleAnchor returns [EObject current=null] : ( 'a[' ( (lv_name_1_0= RULE_ID ) ) ']' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1423:6: ( ( 'a[' ( (lv_name_1_0= RULE_ID ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1424:1: ( 'a[' ( (lv_name_1_0= RULE_ID ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1424:1: ( 'a[' ( (lv_name_1_0= RULE_ID ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1424:3: 'a[' ( (lv_name_1_0= RULE_ID ) ) ']'
            {
            match(input,25,FOLLOW_25_in_ruleAnchor2463); 

                    createLeafNode(grammarAccess.getAnchorAccess().getAKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1428:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1429:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1429:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1430:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor2480); 

            			createLeafNode(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnchorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleAnchor2495); 

                    createLeafNode(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnchor


    // $ANTLR start entryRuleRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1464:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1465:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1466:2: iv_ruleRef= ruleRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef2531);
            iv_ruleRef=ruleRef();
            _fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef2541); 

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
    // $ANTLR end entryRuleRef


    // $ANTLR start ruleRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:1: ruleRef returns [EObject current=null] : ( 'ref:' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1478:6: ( ( 'ref:' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1479:1: ( 'ref:' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1479:1: ( 'ref:' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1479:3: 'ref:' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']'
            {
            match(input,26,FOLLOW_26_in_ruleRef2576); 

                    createLeafNode(grammarAccess.getRefAccess().getRefKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1483:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1484:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1484:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1485:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef2594); 

            		createLeafNode(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0(), "ref"); 
            	

            }


            }

            match(input,11,FOLLOW_11_in_ruleRef2604); 

                    createLeafNode(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1501:1: ( RULE_MULTI_NL )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_MULTI_NL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1501:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef2614); 
                     
                        createLeafNode(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1505:3: ( (lv_contents_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1506:1: (lv_contents_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1506:1: (lv_contents_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1507:3: lv_contents_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef2636);
            lv_contents_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"contents",
            	        		lv_contents_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1529:2: ( RULE_MULTI_NL )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_MULTI_NL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1529:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef2646); 
                     
                        createLeafNode(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleRef2657); 

                    createLeafNode(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRef


    // $ANTLR start entryRuleOrderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1545:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1546:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1547:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList2693);
            iv_ruleOrderedList=ruleOrderedList();
            _fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList2703); 

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
    // $ANTLR end entryRuleOrderedList


    // $ANTLR start ruleOrderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1554:1: ruleOrderedList returns [EObject current=null] : ( 'ol[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1559:6: ( ( 'ol[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1560:1: ( 'ol[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1560:1: ( 'ol[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1560:3: 'ol[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']'
            {
            match(input,27,FOLLOW_27_in_ruleOrderedList2738); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getOlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1564:1: ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1564:2: ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1564:2: ( ruleANY_WS )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( ((LA34_0>=RULE_WS && LA34_0<=RULE_MULTI_NL)||LA34_0==RULE_SINGLE_NL) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1565:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList2756);
            	    	    ruleANY_WS();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1572:3: ( (lv_items_2_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1573:1: (lv_items_2_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1573:1: (lv_items_2_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1574:3: lv_items_2_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList2778);
            	    lv_items_2_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_2_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1596:4: ( ruleANY_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_WS && LA36_0<=RULE_MULTI_NL)||LA36_0==RULE_SINGLE_NL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1597:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList2797);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleOrderedList2808); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrderedList


    // $ANTLR start entryRuleUnorderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1616:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1617:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1618:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnorderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2844);
            iv_ruleUnorderedList=ruleUnorderedList();
            _fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList2854); 

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
    // $ANTLR end entryRuleUnorderedList


    // $ANTLR start ruleUnorderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1625:1: ruleUnorderedList returns [EObject current=null] : ( 'ul[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1630:6: ( ( 'ul[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1631:1: ( 'ul[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1631:1: ( 'ul[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1631:3: 'ul[' ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+ ( ruleANY_WS )* ']'
            {
            match(input,28,FOLLOW_28_in_ruleUnorderedList2889); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getUlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1635:1: ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1635:2: ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1635:2: ( ruleANY_WS )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( ((LA37_0>=RULE_WS && LA37_0<=RULE_MULTI_NL)||LA37_0==RULE_SINGLE_NL) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1636:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList2907);
            	    	    ruleANY_WS();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1643:3: ( (lv_items_2_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1644:1: (lv_items_2_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1644:1: (lv_items_2_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1645:3: lv_items_2_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList2929);
            	    lv_items_2_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUnorderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_2_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1667:4: ( ruleANY_WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_WS && LA39_0<=RULE_MULTI_NL)||LA39_0==RULE_SINGLE_NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1668:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList2948);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleUnorderedList2959); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnorderedList


    // $ANTLR start entryRuleItem
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1687:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1688:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1689:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem2995);
            iv_ruleItem=ruleItem();
            _fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem3005); 

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
    // $ANTLR end entryRuleItem


    // $ANTLR start ruleItem
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1696:1: ruleItem returns [EObject current=null] : ( 'item[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )* ']' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1701:6: ( ( 'item[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1702:1: ( 'item[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1702:1: ( 'item[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1702:3: 'item[' ( RULE_MULTI_NL )? ( (lv_contents_2_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )* ']'
            {
            match(input,29,FOLLOW_29_in_ruleItem3040); 

                    createLeafNode(grammarAccess.getItemAccess().getItemKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1706:1: ( RULE_MULTI_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_MULTI_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1706:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem3050); 
                     
                        createLeafNode(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1710:3: ( (lv_contents_2_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1711:1: (lv_contents_2_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1711:1: (lv_contents_2_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1712:3: lv_contents_2_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem3072);
            lv_contents_2_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"contents",
            	        		lv_contents_2_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1734:2: ( RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_MULTI_NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1734:3: RULE_MULTI_NL ( (lv_contents_4_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem3082); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1738:1: ( (lv_contents_4_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1739:1: (lv_contents_4_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1739:1: (lv_contents_4_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1740:3: lv_contents_4_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem3102);
            	    lv_contents_4_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_4_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleItem3114); 

                    createLeafNode(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleCodeRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1774:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1775:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1776:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef3150);
            iv_ruleCodeRef=ruleCodeRef();
            _fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef3160); 

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
    // $ANTLR end entryRuleCodeRef


    // $ANTLR start ruleCodeRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1783:1: ruleCodeRef returns [EObject current=null] : ( 'codeRef[' ( ( ruleText ) ) ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:6: ( ( 'codeRef[' ( ( ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1789:1: ( 'codeRef[' ( ( ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1789:1: ( 'codeRef[' ( ( ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1789:3: 'codeRef[' ( ( ruleText ) ) ']'
            {
            match(input,30,FOLLOW_30_in_ruleCodeRef3195); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1793:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1794:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1794:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1795:3: ruleText
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCodeRef3218);
            ruleText();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleCodeRef3228); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCodeRef


    // $ANTLR start entryRuleLink
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1821:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1822:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1823:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3264);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3274); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1830:1: ruleLink returns [EObject current=null] : ( 'link[' ( (lv_url_1_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_5_0= ruleText ) ) ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_1_0 = null;

        AntlrDatatypeRuleToken lv_text_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1835:6: ( ( 'link[' ( (lv_url_1_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_5_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1836:1: ( 'link[' ( (lv_url_1_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_5_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1836:1: ( 'link[' ( (lv_url_1_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_5_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1836:3: 'link[' ( (lv_url_1_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_5_0= ruleText ) ) ']'
            {
            match(input,31,FOLLOW_31_in_ruleLink3309); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1840:1: ( (lv_url_1_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1841:1: (lv_url_1_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1841:1: (lv_url_1_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1842:3: lv_url_1_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3330);
            lv_url_1_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_1_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLink3340); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1868:1: ( ruleANY_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_WS && LA42_0<=RULE_MULTI_NL)||LA42_0==RULE_SINGLE_NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1869:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink3357);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleLink3368); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1880:1: ( (lv_text_5_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1881:1: (lv_text_5_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1881:1: (lv_text_5_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1882:3: lv_text_5_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3389);
            lv_text_5_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLink3399); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleImageRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1916:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1917:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1918:2: iv_ruleImageRef= ruleImageRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef3435);
            iv_ruleImageRef=ruleImageRef();
            _fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef3445); 

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
    // $ANTLR end entryRuleImageRef


    // $ANTLR start ruleImageRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1925:1: ruleImageRef returns [EObject current=null] : ( ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' ) ( (lv_path_6_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_10_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_14_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_18_0= ruleText ) ) ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_path_6_0 = null;

        AntlrDatatypeRuleToken lv_clazz_10_0 = null;

        AntlrDatatypeRuleToken lv_style_14_0 = null;

        AntlrDatatypeRuleToken lv_caption_18_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1930:6: ( ( ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' ) ( (lv_path_6_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_10_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_14_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_18_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:1: ( ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' ) ( (lv_path_6_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_10_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_14_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_18_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:1: ( ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' ) ( (lv_path_6_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_10_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_14_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_18_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:2: ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' ) ( (lv_path_6_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_10_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_14_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_18_0= ruleText ) ) ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:2: ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==32) ) {
                alt45=1;
            }
            else if ( (LA45_0==33) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1931:2: ( ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' ) | 'img[' )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:3: ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:3: ( 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1931:5: 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* '['
                    {
                    match(input,32,FOLLOW_32_in_ruleImageRef3482); 

                            createLeafNode(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1935:1: ( ruleANY_WS )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_WS && LA43_0<=RULE_MULTI_NL)||LA43_0==RULE_SINGLE_NL) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1936:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3499);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1943:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1944:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1944:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1945:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef3517); 

                    			createLeafNode(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1967:2: ( ruleANY_WS )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_MULTI_NL)||LA44_0==RULE_SINGLE_NL) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1968:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3539);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,11,FOLLOW_11_in_ruleImageRef3550); 

                            createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1980:7: 'img['
                    {
                    match(input,33,FOLLOW_33_in_ruleImageRef3567); 

                            createLeafNode(grammarAccess.getImageRefAccess().getImgKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1984:2: ( (lv_path_6_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1985:1: (lv_path_6_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1985:1: (lv_path_6_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1986:3: lv_path_6_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3589);
            lv_path_6_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_6_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3599); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2012:1: ( ruleANY_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WS && LA46_0<=RULE_MULTI_NL)||LA46_0==RULE_SINGLE_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2013:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3616);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleImageRef3627); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2024:1: ( (lv_clazz_10_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2025:1: (lv_clazz_10_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2025:1: (lv_clazz_10_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2026:3: lv_clazz_10_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3648);
            lv_clazz_10_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clazz",
            	        		lv_clazz_10_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3658); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2052:1: ( ruleANY_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_WS && LA47_0<=RULE_MULTI_NL)||LA47_0==RULE_SINGLE_NL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2053:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3675);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleImageRef3686); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2064:1: ( (lv_style_14_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2065:1: (lv_style_14_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2065:1: (lv_style_14_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2066:3: lv_style_14_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3707);
            lv_style_14_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"style",
            	        		lv_style_14_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3717); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2092:1: ( ruleANY_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_WS && LA48_0<=RULE_MULTI_NL)||LA48_0==RULE_SINGLE_NL) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2093:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3734);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleImageRef3745); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2104:1: ( (lv_caption_18_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2105:1: (lv_caption_18_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2105:1: (lv_caption_18_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2106:3: lv_caption_18_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3766);
            lv_caption_18_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"caption",
            	        		lv_caption_18_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3776); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImageRef


    // $ANTLR start entryRuleCodeBlock
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2140:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2141:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2142:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3812);
            iv_ruleCodeBlock=ruleCodeBlock();
            _fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock3822); 

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
    // $ANTLR end entryRuleCodeBlock


    // $ANTLR start ruleCodeBlock
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2149:1: ruleCodeBlock returns [EObject current=null] : ( 'code[' ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )? ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token lv_language_2_0=null;
        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2154:6: ( ( 'code[' ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )? ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2155:1: ( 'code[' ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )? ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2155:1: ( 'code[' ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )? ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2155:3: 'code[' ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )? ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']'
            {
            match(input,34,FOLLOW_34_in_ruleCodeBlock3857); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getCodeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2159:1: ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2159:2: ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '['
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2159:2: ( ruleANY_WS )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=RULE_WS && LA49_0<=RULE_MULTI_NL)||LA49_0==RULE_SINGLE_NL) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2160:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock3875);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2167:3: ( (lv_language_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2168:1: (lv_language_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2168:1: (lv_language_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2169:3: lv_language_2_0= RULE_ID
                    {
                    lv_language_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock3893); 

                    			createLeafNode(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0(), "language"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"language",
                    	        		lv_language_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2191:2: ( ruleANY_WS )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_MULTI_NL)||LA50_0==RULE_SINGLE_NL) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2192:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock3915);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_ruleCodeBlock3926); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2203:1: ( ruleANY_WS )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_MULTI_NL)||LA51_0==RULE_SINGLE_NL) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2204:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock3943);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,11,FOLLOW_11_in_ruleCodeBlock3954); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:3: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_ANY_OTHER)||(LA57_0>=22 && LA57_0<=23)||LA57_0==35) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=24 && LA57_0<=26)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2215:3: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:4: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:4: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:5: ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:5: ( (lv_contents_7_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2216:1: (lv_contents_7_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2216:1: (lv_contents_7_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2217:3: lv_contents_7_0= ruleCode
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock3979);
                    lv_contents_7_0=ruleCode();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_7_0, 
                    	        		"Code", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2239:2: ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=24 && LA54_0<=26)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2239:3: ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2239:3: ( (lv_contents_8_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2240:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2240:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2241:3: lv_contents_8_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4001);
                    	    lv_contents_8_0=ruleMarkupInCode();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_8_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2263:2: ( (lv_contents_9_0= ruleCode ) )?
                    	    int alt53=2;
                    	    int LA53_0 = input.LA(1);

                    	    if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_ANY_OTHER)||(LA53_0>=22 && LA53_0<=23)||LA53_0==35) ) {
                    	        alt53=1;
                    	    }
                    	    switch (alt53) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2264:1: (lv_contents_9_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2264:1: (lv_contents_9_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2265:3: lv_contents_9_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4022);
                    	            lv_contents_9_0=ruleCode();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_9_0, 
                    	            	        		"Code", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2288:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2288:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( ((LA56_0>=24 && LA56_0<=26)) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2288:7: ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2288:7: ( (lv_contents_10_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2289:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2289:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2290:3: lv_contents_10_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4054);
                    	    lv_contents_10_0=ruleMarkupInCode();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_10_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:2: ( (lv_contents_11_0= ruleCode ) )?
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_ANY_OTHER)||(LA55_0>=22 && LA55_0<=23)||LA55_0==35) ) {
                    	        alt55=1;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: (lv_contents_11_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: (lv_contents_11_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2314:3: lv_contents_11_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4075);
                    	            lv_contents_11_0=ruleCode();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_11_0, 
                    	            	        		"Code", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleCodeBlock4089); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCodeBlock


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2348:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2349:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2350:2: iv_ruleCode= ruleCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode4125);
            iv_ruleCode=ruleCode();
            _fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode4135); 

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
    // $ANTLR end entryRuleCode


    // $ANTLR start ruleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2357:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2362:6: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2363:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2363:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2364:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2364:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2365:3: lv_contents_0_0= ruleCodeText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode4180);
            lv_contents_0_0=ruleCodeText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"contents",
            	        		lv_contents_0_0, 
            	        		"CodeText", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCode


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2395:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2396:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2397:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkupInCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4215);
            iv_ruleMarkupInCode=ruleMarkupInCode();
            _fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode4225); 

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
    // $ANTLR end entryRuleMarkupInCode


    // $ANTLR start ruleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2404:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2409:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2410:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2410:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt58=1;
                }
                break;
            case 25:
                {
                alt58=2;
                }
                break;
            case 26:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2410:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2411:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode4272);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2421:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode4299);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2431:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode4326);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMarkupInCode


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2447:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2448:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2449:2: iv_ruleCodeText= ruleCodeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText4362);
            iv_ruleCodeText=ruleCodeText();
            _fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText4373); 

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
    // $ANTLR end entryRuleCodeText


    // $ANTLR start ruleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2456:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_SINGLE_NL_3=null;
        Token this_ANY_OTHER_4=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2461:6: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2462:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2462:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt59=0;
            loop59:
            do {
                int alt59=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt59=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt59=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt59=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt59=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt59=5;
                    }
                    break;
                case 22:
                    {
                    alt59=6;
                    }
                    break;
                case 23:
                    {
                    alt59=7;
                    }
                    break;
                case 35:
                    {
                    alt59=8;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2462:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText4413); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2470:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)input.LT(1);
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText4439); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2478:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText4465); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2486:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)input.LT(1);
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText4491); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2494:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4517); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2503:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleCodeText4541); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2510:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,23,FOLLOW_23_in_ruleCodeText4560); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6(), null); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2517:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_ruleCodeText4579); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getColonKeyword_7(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCodeText


    // $ANTLR start entryRuleANY_WS
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2530:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2531:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2532:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getANY_WSRule(), currentNode); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS4621);
            iv_ruleANY_WS=ruleANY_WS();
            _fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS4632); 

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
    // $ANTLR end entryRuleANY_WS


    // $ANTLR start ruleANY_WS
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2539:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2544:6: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2545:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2545:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt60=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt60=2;
                }
                break;
            case RULE_WS:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2545:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2545:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)input.LT(1);
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS4672); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2553:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)input.LT(1);
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS4698); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2561:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS4724); 

                    		current.merge(this_WS_2);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleANY_WS


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA35_eotS =
        "\6\uffff";
    static final String DFA35_eofS =
        "\6\uffff";
    static final String DFA35_minS =
        "\4\4\2\uffff";
    static final String DFA35_maxS =
        "\4\35\2\uffff";
    static final String DFA35_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA35_specialS =
        "\6\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
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
            return "()+ loopback of 1564:1: ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+";
        }
    }
    static final String DFA38_eotS =
        "\6\uffff";
    static final String DFA38_eofS =
        "\6\uffff";
    static final String DFA38_minS =
        "\4\4\2\uffff";
    static final String DFA38_maxS =
        "\4\35\2\uffff";
    static final String DFA38_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA38_specialS =
        "\6\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\17\uffff\1\5",
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
            return "()+ loopback of 1635:1: ( ( ruleANY_WS )* ( (lv_items_2_0= ruleItem ) ) )+";
        }
    }
    static final String DFA52_eotS =
        "\21\uffff";
    static final String DFA52_eofS =
        "\11\uffff\4\5\1\uffff\3\5";
    static final String DFA52_minS =
        "\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA52_maxS =
        "\5\43\1\uffff\3\43\4\42\1\uffff\3\42";
    static final String DFA52_acceptS =
        "\5\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA52_specialS =
        "\21\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\3\1\1\1\4\1\2\1\5\15\uffff\5\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\4\uffff\1\5\10\uffff\5\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\4\uffff\1\5\10\uffff\5\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\4\uffff\1\5\10\uffff\5\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\4\uffff\1\11\10\uffff\5\5\10\uffff\1\5",
            "",
            "\1\10\1\6\1\5\1\7\1\5\4\uffff\1\11\10\uffff\5\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\4\uffff\1\11\10\uffff\5\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\4\uffff\1\11\10\uffff\5\5\10\uffff\1\5",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\15\1\uffff\1\5\10\uffff\7"+
            "\5\1\uffff\5\5",
            "\1\17\1\15\1\5\1\16\1\5\1\uffff\1\5\1\15\21\5\1\uffff\5\5",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\15\1\uffff\1\5\10\uffff\7"+
            "\5\1\uffff\5\5",
            "\1\14\1\12\1\5\1\13\1\5\2\uffff\1\15\1\uffff\1\5\10\uffff\7"+
            "\5\1\uffff\5\5",
            "",
            "\1\17\1\20\1\5\1\16\1\5\2\uffff\1\15\1\uffff\1\5\10\uffff\7"+
            "\5\1\uffff\5\5",
            "\1\17\1\20\1\5\1\16\1\5\2\uffff\1\15\1\uffff\1\5\10\uffff\7"+
            "\5\1\uffff\5\5",
            "\1\17\1\15\1\5\1\16\1\5\1\uffff\1\5\1\15\1\5\1\uffff\17\5\1"+
            "\uffff\5\5"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "2159:1: ( ( ruleANY_WS )* ( (lv_language_2_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* '[' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleDocument129 = new BitSet(new long[]{0x000000000003D422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument140 = new BitSet(new long[]{0x000000000003D402L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument165 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument175 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument195 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument236 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument256 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument287 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument297 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument317 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleChapter417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter434 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter449 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_12_in_ruleChapter466 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChapter498 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter508 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter528 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter540 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter560 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSection645 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection662 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection677 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_15_in_ruleSection694 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection716 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection726 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection736 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection756 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection768 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleSection788 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubSection873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSection890 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSubSection905 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_17_in_ruleSubSection922 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubSection954 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection964 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection984 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection996 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSubSection1016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSection31101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31118 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31133 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_19_in_ruleSection31150 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection31182 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31192 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31212 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31224 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31244 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSection41329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection41346 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection41361 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_21_in_ruleSection41378 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41400 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection41410 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection41420 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41440 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1537 = new BitSet(new long[]{0x00000007DF000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1559 = new BitSet(new long[]{0x00000007DFC001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1580 = new BitSet(new long[]{0x00000007DF000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1612 = new BitSet(new long[]{0x00000007DFC001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1633 = new BitSet(new long[]{0x00000007DF000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1814 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText1840 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText1866 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText1892 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_22_in_ruleText1916 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_23_in_ruleText1935 = new BitSet(new long[]{0x0000000000C001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp1976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEmphasize2329 = new BitSet(new long[]{0x00000007DFC001F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2339 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2361 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEmphasize2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAnchor2463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor2480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnchor2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef2531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRef2576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef2594 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef2604 = new BitSet(new long[]{0x00000007DFC001F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef2614 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef2636 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef2646 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRef2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOrderedList2738 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList2756 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList2778 = new BitSet(new long[]{0x00000000200020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList2797 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleOrderedList2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUnorderedList2889 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList2907 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList2929 = new BitSet(new long[]{0x00000000200020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList2948 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleUnorderedList2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleItem3040 = new BitSet(new long[]{0x00000007DFC001F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem3050 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem3072 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem3082 = new BitSet(new long[]{0x00000007DFC001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem3102 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13_in_ruleItem3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef3150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCodeRef3195 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef3218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCodeRef3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLink3309 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink3340 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink3357 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleLink3368 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef3435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleImageRef3482 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3499 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef3517 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3539 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3550 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_33_in_ruleImageRef3567 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3589 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3599 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3616 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3627 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3658 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3675 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3686 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3707 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3717 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3734 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3745 = new BitSet(new long[]{0x0000000000C001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3766 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCodeBlock3857 = new BitSet(new long[]{0x0000000807C001F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock3875 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock3893 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock3915 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleCodeBlock3926 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock3943 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock3954 = new BitSet(new long[]{0x0000000807C001F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock3979 = new BitSet(new long[]{0x0000000007002000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4001 = new BitSet(new long[]{0x0000000807C021F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4022 = new BitSet(new long[]{0x0000000007002000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4054 = new BitSet(new long[]{0x0000000807C021F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4075 = new BitSet(new long[]{0x0000000007002000L});
    public static final BitSet FOLLOW_13_in_ruleCodeBlock4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode4125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText4362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText4413 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText4439 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText4465 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText4491 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4517 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_22_in_ruleCodeText4541 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_23_in_ruleCodeText4560 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_35_in_ruleCodeText4579 = new BitSet(new long[]{0x0000000800C001F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS4621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS4724 = new BitSet(new long[]{0x0000000000000002L});

}