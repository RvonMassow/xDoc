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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_MULTI_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'\\\\chapter'", "':'", "'['", "']'", "'\\\\section'", "'\\\\subsection'", "'\\\\section3'", "'\\\\section4'", "'\\\\emph'", "'\\\\a'", "'\\\\ref'", "'\\\\ol'", "'\\\\ul'", "'\\\\item'", "'\\\\codeRef'", "'\\\\link'", "'\\\\img'", "'\\\\code'", "'\\\\['", "'\\\\]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_WS=5;
    public static final int RULE_MULTI_NL=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:86:1: ruleDocument returns [EObject current=null] : ( () ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( (lv_contents_7_0= ruleParBreak ) )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_1_0 = null;

        EObject lv_chapters_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_sections_4_0 = null;

        EObject lv_contents_5_0 = null;

        EObject lv_subsections_6_0 = null;

        EObject lv_contents_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:91:6: ( ( () ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( (lv_contents_7_0= ruleParBreak ) )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( (lv_contents_7_0= ruleParBreak ) )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( (lv_contents_7_0= ruleParBreak ) )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: () ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( (lv_contents_7_0= ruleParBreak ) )?
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:2: ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt7=2;
                    }
                    break;
                case 9:
                    {
                    alt7=1;
                    }
                    break;
                case 14:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("103:2: ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case 9:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("103:2: ( ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: ( ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_MULTI_NL) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==9) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0==9) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:4: ( (lv_contents_1_0= ruleParBreak ) )? ( (lv_chapters_2_0= ruleChapter ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:4: ( (lv_contents_1_0= ruleParBreak ) )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==RULE_MULTI_NL) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:104:1: (lv_contents_1_0= ruleParBreak )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:104:1: (lv_contents_1_0= ruleParBreak )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:105:3: lv_contents_1_0= ruleParBreak
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_0_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleParBreak_in_ruleDocument142);
                    	            lv_contents_1_0=ruleParBreak();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_1_0, 
                    	            	        		"ParBreak", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:127:3: ( (lv_chapters_2_0= ruleChapter ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:128:1: (lv_chapters_2_0= ruleChapter )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:128:1: (lv_chapters_2_0= ruleChapter )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:129:3: lv_chapters_2_0= ruleChapter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument164);
                    	    lv_chapters_2_0=ruleChapter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"chapters",
                    	    	        		lv_chapters_2_0, 
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
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:152:6: ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:152:6: ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_MULTI_NL) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==13) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:152:7: ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_sections_4_0= ruleSection ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:152:7: ( (lv_contents_3_0= ruleParBreak ) )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_MULTI_NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:153:1: (lv_contents_3_0= ruleParBreak )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:153:1: (lv_contents_3_0= ruleParBreak )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:154:3: lv_contents_3_0= ruleParBreak
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleParBreak_in_ruleDocument194);
                    	            lv_contents_3_0=ruleParBreak();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_3_0, 
                    	            	        		"ParBreak", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:176:3: ( (lv_sections_4_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:177:1: (lv_sections_4_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:177:1: (lv_sections_4_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:178:3: lv_sections_4_0= ruleSection
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleDocument216);
                    	    lv_sections_4_0=ruleSection();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"sections",
                    	    	        		lv_sections_4_0, 
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:201:6: ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:201:6: ( ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_MULTI_NL) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==14) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:201:7: ( (lv_contents_5_0= ruleParBreak ) )? ( (lv_subsections_6_0= ruleSubSection ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:201:7: ( (lv_contents_5_0= ruleParBreak ) )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==RULE_MULTI_NL) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:202:1: (lv_contents_5_0= ruleParBreak )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:202:1: (lv_contents_5_0= ruleParBreak )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:203:3: lv_contents_5_0= ruleParBreak
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_2_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleParBreak_in_ruleDocument246);
                    	            lv_contents_5_0=ruleParBreak();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_5_0, 
                    	            	        		"ParBreak", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:225:3: ( (lv_subsections_6_0= ruleSubSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:226:1: (lv_subsections_6_0= ruleSubSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:226:1: (lv_subsections_6_0= ruleSubSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:227:3: lv_subsections_6_0= ruleSubSection
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubSection_in_ruleDocument268);
                    	    lv_subsections_6_0=ruleSubSection();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subsections",
                    	    	        		lv_subsections_6_0, 
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:249:5: ( (lv_contents_7_0= ruleParBreak ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_MULTI_NL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:250:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:250:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:251:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleDocument292);
                    lv_contents_7_0=ruleParBreak();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_7_0, 
                    	        		"ParBreak", 
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
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter329);
            iv_ruleChapter=ruleChapter();
            _fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter339); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:290:1: ruleChapter returns [EObject current=null] : ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )* ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:295:6: ( ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:3: '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )*
            {
            match(input,9,FOLLOW_9_in_ruleChapter374); 

                    createLeafNode(grammarAccess.getChapterAccess().getChapterKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:300:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:300:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleChapter385); 

                            createLeafNode(grammarAccess.getChapterAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:304:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:305:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:305:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:306:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter402); 

                    			createLeafNode(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleChapter419); 

                    createLeafNode(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:332:1: ( (lv_title_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:333:1: (lv_title_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:333:1: (lv_title_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:334:3: lv_title_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupLineParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleChapter440);
            lv_title_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleChapter450); 

                    createLeafNode(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:360:1: ( RULE_WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:360:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChapter460); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:3: ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_MULTI_NL) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=RULE_ID && LA12_1<=RULE_WS)||LA12_1==RULE_ANY_OTHER||LA12_1==10||(LA12_1>=17 && LA12_1<=21)||(LA12_1>=23 && LA12_1<=28)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:5: ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:5: ( (lv_contents_7_0= ruleParBreak ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:365:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:365:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:366:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_6_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleChapter484);
                    lv_contents_7_0=ruleParBreak();
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
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:388:2: ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:389:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:389:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:390:3: lv_contents_8_0= ruleTextOrMarkupLine
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleChapter505);
                    lv_contents_8_0=ruleTextOrMarkupLine();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"TextOrMarkupLine", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:412:3: ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_MULTI_NL) ) {
                            int LA11_1 = input.LA(2);

                            if ( ((LA11_1>=RULE_ID && LA11_1<=RULE_WS)||LA11_1==RULE_ANY_OTHER||LA11_1==10||(LA11_1>=17 && LA11_1<=21)||(LA11_1>=23 && LA11_1<=28)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:413:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:413:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:414:3: lv_contents_9_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter527);
                    	    lv_contents_9_0=ruleTextOrMarkup();
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
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:436:5: ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTI_NL) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==13) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:436:6: ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:436:6: ( (lv_contents_10_0= ruleParBreak ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_MULTI_NL) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:437:1: (lv_contents_10_0= ruleParBreak )
            	            {
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:437:1: (lv_contents_10_0= ruleParBreak )
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:438:3: lv_contents_10_0= ruleParBreak
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_7_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleParBreak_in_ruleChapter552);
            	            lv_contents_10_0=ruleParBreak();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"contents",
            	            	        		lv_contents_10_0, 
            	            	        		"ParBreak", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:460:3: ( (lv_contents_11_0= ruleSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:461:1: (lv_contents_11_0= ruleSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:461:1: (lv_contents_11_0= ruleSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:462:3: lv_contents_11_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleChapter574);
            	    lv_contents_11_0=ruleSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_11_0, 
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
    // $ANTLR end ruleChapter


    // $ANTLR start entryRuleSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:492:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:493:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:494:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection612);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection622); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:501:1: ruleSection returns [EObject current=null] : ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:506:6: ( ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:507:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:507:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:507:3: '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )*
            {
            match(input,13,FOLLOW_13_in_ruleSection657); 

                    createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:511:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==10) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:511:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection668); 

                            createLeafNode(grammarAccess.getSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:515:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:516:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:516:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:517:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection685); 

                    			createLeafNode(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection702); 

                    createLeafNode(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:543:1: ( (lv_title_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:544:1: (lv_title_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:544:1: (lv_title_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:545:3: lv_title_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection723);
            lv_title_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSection733); 

                    createLeafNode(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:571:1: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:571:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection743); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:575:3: ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_MULTI_NL) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=RULE_ID && LA18_1<=RULE_WS)||LA18_1==RULE_ANY_OTHER||LA18_1==10||(LA18_1>=17 && LA18_1<=21)||(LA18_1>=23 && LA18_1<=28)) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:575:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:575:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:575:5: ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:575:5: ( (lv_contents_7_0= ruleParBreak ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:576:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:576:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:577:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleSection767);
                    lv_contents_7_0=ruleParBreak();
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
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:599:2: ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:600:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:600:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:601:3: lv_contents_8_0= ruleTextOrMarkupLine
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection788);
                    lv_contents_8_0=ruleTextOrMarkupLine();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"TextOrMarkupLine", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:623:3: ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_MULTI_NL) ) {
                            int LA17_1 = input.LA(2);

                            if ( ((LA17_1>=RULE_ID && LA17_1<=RULE_WS)||LA17_1==RULE_ANY_OTHER||LA17_1==10||(LA17_1>=17 && LA17_1<=21)||(LA17_1>=23 && LA17_1<=28)) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:624:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:624:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:625:3: lv_contents_9_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection810);
                    	    lv_contents_9_0=ruleTextOrMarkup();
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
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:647:5: ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTI_NL) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==14) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:647:6: ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSubSection ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:647:6: ( (lv_contents_10_0= ruleParBreak ) )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_MULTI_NL) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:648:1: (lv_contents_10_0= ruleParBreak )
            	            {
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:648:1: (lv_contents_10_0= ruleParBreak )
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:649:3: lv_contents_10_0= ruleParBreak
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_7_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleParBreak_in_ruleSection835);
            	            lv_contents_10_0=ruleParBreak();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"contents",
            	            	        		lv_contents_10_0, 
            	            	        		"ParBreak", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:671:3: ( (lv_contents_11_0= ruleSubSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:672:1: (lv_contents_11_0= ruleSubSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:672:1: (lv_contents_11_0= ruleSubSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:673:3: lv_contents_11_0= ruleSubSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubSection_in_ruleSection857);
            	    lv_contents_11_0=ruleSubSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_11_0, 
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
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleSubSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:703:1: entryRuleSubSection returns [EObject current=null] : iv_ruleSubSection= ruleSubSection EOF ;
    public final EObject entryRuleSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:704:2: (iv_ruleSubSection= ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:705:2: iv_ruleSubSection= ruleSubSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection895);
            iv_ruleSubSection=ruleSubSection();
            _fsp--;

             current =iv_ruleSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection905); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:712:1: ruleSubSection returns [EObject current=null] : ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSubSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:717:6: ( ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:718:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:718:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:718:3: '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )*
            {
            match(input,14,FOLLOW_14_in_ruleSubSection940); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:722:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==10) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:722:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSubSection951); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:726:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:727:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:727:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:728:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSection968); 

                    			createLeafNode(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSubSection985); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:754:1: ( (lv_title_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:755:1: (lv_title_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:755:1: (lv_title_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:756:3: lv_title_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSubSection1006);
            lv_title_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSubSection1016); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:782:1: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:782:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSubSection1026); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:786:3: ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_MULTI_NL) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=RULE_ID && LA24_1<=RULE_WS)||LA24_1==RULE_ANY_OTHER||LA24_1==10||(LA24_1>=17 && LA24_1<=21)||(LA24_1>=23 && LA24_1<=28)) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:786:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:786:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:786:5: ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:786:5: ( (lv_contents_7_0= ruleParBreak ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:787:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:787:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:788:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleSubSection1050);
                    lv_contents_7_0=ruleParBreak();
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
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:810:2: ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:811:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:811:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:812:3: lv_contents_8_0= ruleTextOrMarkupLine
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSubSection1071);
                    lv_contents_8_0=ruleTextOrMarkupLine();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"TextOrMarkupLine", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:834:3: ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_MULTI_NL) ) {
                            int LA23_1 = input.LA(2);

                            if ( ((LA23_1>=RULE_ID && LA23_1<=RULE_WS)||LA23_1==RULE_ANY_OTHER||LA23_1==10||(LA23_1>=17 && LA23_1<=21)||(LA23_1>=23 && LA23_1<=28)) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:835:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:835:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:836:3: lv_contents_9_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection1093);
                    	    lv_contents_9_0=ruleTextOrMarkup();
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
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:858:5: ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==15) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:858:6: ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection3 ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:858:6: ( (lv_contents_10_0= ruleParBreak ) )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_MULTI_NL) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:859:1: (lv_contents_10_0= ruleParBreak )
            	            {
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:859:1: (lv_contents_10_0= ruleParBreak )
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:860:3: lv_contents_10_0= ruleParBreak
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_7_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleParBreak_in_ruleSubSection1118);
            	            lv_contents_10_0=ruleParBreak();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"contents",
            	            	        		lv_contents_10_0, 
            	            	        		"ParBreak", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:882:3: ( (lv_contents_11_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:883:1: (lv_contents_11_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:883:1: (lv_contents_11_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:884:3: lv_contents_11_0= ruleSection3
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSubSection1140);
            	    lv_contents_11_0=ruleSection3();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_11_0, 
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
            	    break loop26;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:914:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:915:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:916:2: iv_ruleSection3= ruleSection3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection3Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31178);
            iv_ruleSection3=ruleSection3();
            _fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31188); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:923:1: ruleSection3 returns [EObject current=null] : ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:928:6: ( ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:929:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:929:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:929:3: '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )*
            {
            match(input,15,FOLLOW_15_in_ruleSection31223); 

                    createLeafNode(grammarAccess.getSection3Access().getSection3Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:933:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==10) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:933:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection31234); 

                            createLeafNode(grammarAccess.getSection3Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:937:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:938:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:938:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:939:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31251); 

                    			createLeafNode(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection31268); 

                    createLeafNode(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:965:1: ( (lv_title_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:966:1: (lv_title_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:966:1: (lv_title_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:967:3: lv_title_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupLineParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection31289);
            lv_title_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSection31299); 

                    createLeafNode(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:993:1: ( RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:993:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection31309); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:997:3: ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_MULTI_NL) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_WS)||LA30_1==RULE_ANY_OTHER||LA30_1==10||(LA30_1>=17 && LA30_1<=21)||(LA30_1>=23 && LA30_1<=28)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:997:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:997:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:997:5: ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:997:5: ( (lv_contents_7_0= ruleParBreak ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:999:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_6_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleSection31333);
                    lv_contents_7_0=ruleParBreak();
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
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1021:2: ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1022:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1022:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1023:3: lv_contents_8_0= ruleTextOrMarkupLine
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection31354);
                    lv_contents_8_0=ruleTextOrMarkupLine();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"TextOrMarkupLine", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1045:3: ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_MULTI_NL) ) {
                            int LA29_1 = input.LA(2);

                            if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_WS)||LA29_1==RULE_ANY_OTHER||LA29_1==10||(LA29_1>=17 && LA29_1<=21)||(LA29_1>=23 && LA29_1<=28)) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1046:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1046:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1047:3: lv_contents_9_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31376);
                    	    lv_contents_9_0=ruleTextOrMarkup();
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
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1069:5: ( ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MULTI_NL) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==16) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1069:6: ( (lv_contents_10_0= ruleParBreak ) )? ( (lv_contents_11_0= ruleSection4 ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1069:6: ( (lv_contents_10_0= ruleParBreak ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_MULTI_NL) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1070:1: (lv_contents_10_0= ruleParBreak )
            	            {
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1070:1: (lv_contents_10_0= ruleParBreak )
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1071:3: lv_contents_10_0= ruleParBreak
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_7_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleParBreak_in_ruleSection31401);
            	            lv_contents_10_0=ruleParBreak();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"contents",
            	            	        		lv_contents_10_0, 
            	            	        		"ParBreak", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1093:3: ( (lv_contents_11_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1094:1: (lv_contents_11_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1094:1: (lv_contents_11_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1095:3: lv_contents_11_0= ruleSection4
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31423);
            	    lv_contents_11_0=ruleSection4();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_11_0, 
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
            	    break loop32;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1125:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1126:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1127:2: iv_ruleSection4= ruleSection4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection4Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41461);
            iv_ruleSection4=ruleSection4();
            _fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41471); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1134:1: ruleSection4 returns [EObject current=null] : ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1139:6: ( ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1140:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1140:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1140:3: '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkupLine ) ) ']' ( RULE_WS )* ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            {
            match(input,16,FOLLOW_16_in_ruleSection41506); 

                    createLeafNode(grammarAccess.getSection4Access().getSection4Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1144:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==10) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1144:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection41517); 

                            createLeafNode(grammarAccess.getSection4Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1148:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1149:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1149:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1150:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection41534); 

                    			createLeafNode(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection41551); 

                    createLeafNode(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1176:1: ( (lv_title_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1177:1: (lv_title_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1177:1: (lv_title_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1178:3: lv_title_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupLineParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection41572);
            lv_title_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSection41582); 

                    createLeafNode(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1204:1: ( RULE_WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1204:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection41592); 
            	     
            	        createLeafNode(grammarAccess.getSection4Access().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1208:3: ( ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_MULTI_NL) ) {
                int LA36_1 = input.LA(2);

                if ( ((LA36_1>=RULE_ID && LA36_1<=RULE_WS)||LA36_1==RULE_ANY_OTHER||LA36_1==10||(LA36_1>=17 && LA36_1<=21)||(LA36_1>=23 && LA36_1<=28)) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1208:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1208:4: ( ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1208:5: ( (lv_contents_7_0= ruleParBreak ) ) ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1208:5: ( (lv_contents_7_0= ruleParBreak ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1209:1: (lv_contents_7_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1209:1: (lv_contents_7_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1210:3: lv_contents_7_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsParBreakParserRuleCall_6_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleSection41616);
                    lv_contents_7_0=ruleParBreak();
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
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1232:2: ( (lv_contents_8_0= ruleTextOrMarkupLine ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1233:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1233:1: (lv_contents_8_0= ruleTextOrMarkupLine )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1234:3: lv_contents_8_0= ruleTextOrMarkupLine
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleSection41637);
                    lv_contents_8_0=ruleTextOrMarkupLine();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"TextOrMarkupLine", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1256:3: ( (lv_contents_9_0= ruleTextOrMarkup ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_MULTI_NL) ) {
                            int LA35_1 = input.LA(2);

                            if ( ((LA35_1>=RULE_ID && LA35_1<=RULE_WS)||LA35_1==RULE_ANY_OTHER||LA35_1==10||(LA35_1>=17 && LA35_1<=21)||(LA35_1>=23 && LA35_1<=28)) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1257:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1257:1: (lv_contents_9_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1258:3: lv_contents_9_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41659);
                    	    lv_contents_9_0=ruleTextOrMarkup();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_9_0, 
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


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
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1290:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1291:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1292:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1700);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();
            _fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup1710); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1299:1: ruleTextOrMarkup returns [EObject current=null] : ( ( (lv_contents_0_0= ruleParBreak ) ) ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ ) ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1304:6: ( ( ( (lv_contents_0_0= ruleParBreak ) ) ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1305:1: ( ( (lv_contents_0_0= ruleParBreak ) ) ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1305:1: ( ( (lv_contents_0_0= ruleParBreak ) ) ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1305:2: ( (lv_contents_0_0= ruleParBreak ) ) ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1305:2: ( (lv_contents_0_0= ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1306:1: (lv_contents_0_0= ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1306:1: (lv_contents_0_0= ruleParBreak )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1307:3: lv_contents_0_0= ruleParBreak
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsParBreakParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParBreak_in_ruleTextOrMarkup1756);
            lv_contents_0_0=ruleParBreak();
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
            	        		"ParBreak", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:2: ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_WS)||LA41_0==RULE_ANY_OTHER||LA41_0==10||(LA41_0>=27 && LA41_0<=28)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=17 && LA41_0<=21)||(LA41_0>=23 && LA41_0<=26)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1329:2: ( ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+ )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:3: ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:3: ( ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:4: ( (lv_contents_1_0= ruleTextPart ) ) ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:4: ( (lv_contents_1_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1330:1: (lv_contents_1_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1330:1: (lv_contents_1_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1331:3: lv_contents_1_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1779);
                    lv_contents_1_0=ruleTextPart();
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
                    	        		"TextPart", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1353:2: ( ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )? )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=17 && LA38_0<=21)||(LA38_0>=23 && LA38_0<=26)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1353:3: ( (lv_contents_2_0= ruleMarkUp ) ) ( (lv_contents_3_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1353:3: ( (lv_contents_2_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1354:1: (lv_contents_2_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1354:1: (lv_contents_2_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1355:3: lv_contents_2_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1801);
                    	    lv_contents_2_0=ruleMarkUp();
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
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1377:2: ( (lv_contents_3_0= ruleTextPart ) )?
                    	    int alt37=2;
                    	    int LA37_0 = input.LA(1);

                    	    if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_WS)||LA37_0==RULE_ANY_OTHER||LA37_0==10||(LA37_0>=27 && LA37_0<=28)) ) {
                    	        alt37=1;
                    	    }
                    	    switch (alt37) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1378:1: (lv_contents_3_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1378:1: (lv_contents_3_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1379:3: lv_contents_3_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1822);
                    	            lv_contents_3_0=ruleTextPart();
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
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1402:6: ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1402:6: ( ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )? )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=17 && LA40_0<=21)||(LA40_0>=23 && LA40_0<=26)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1402:7: ( (lv_contents_4_0= ruleMarkUp ) ) ( (lv_contents_5_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1402:7: ( (lv_contents_4_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1403:1: (lv_contents_4_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1403:1: (lv_contents_4_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1404:3: lv_contents_4_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1854);
                    	    lv_contents_4_0=ruleMarkUp();
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
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1426:2: ( (lv_contents_5_0= ruleTextPart ) )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_WS)||LA39_0==RULE_ANY_OTHER||LA39_0==10||(LA39_0>=27 && LA39_0<=28)) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1427:1: (lv_contents_5_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1427:1: (lv_contents_5_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1428:3: lv_contents_5_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1875);
                    	            lv_contents_5_0=ruleTextPart();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_5_0, 
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
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


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
    // $ANTLR end ruleTextOrMarkup


    // $ANTLR start entryRuleTextOrMarkupLine
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1458:1: entryRuleTextOrMarkupLine returns [EObject current=null] : iv_ruleTextOrMarkupLine= ruleTextOrMarkupLine EOF ;
    public final EObject entryRuleTextOrMarkupLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkupLine = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1459:2: (iv_ruleTextOrMarkupLine= ruleTextOrMarkupLine EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1460:2: iv_ruleTextOrMarkupLine= ruleTextOrMarkupLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_entryRuleTextOrMarkupLine1915);
            iv_ruleTextOrMarkupLine=ruleTextOrMarkupLine();
            _fsp--;

             current =iv_ruleTextOrMarkupLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkupLine1925); 

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
    // $ANTLR end entryRuleTextOrMarkupLine


    // $ANTLR start ruleTextOrMarkupLine
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1467:1: ruleTextOrMarkupLine returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkupLine() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1472:6: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_WS)||LA46_0==RULE_ANY_OTHER||LA46_0==10||(LA46_0>=27 && LA46_0<=28)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=17 && LA46_0<=21)||(LA46_0>=23 && LA46_0<=26)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1473:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1473:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1474:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1474:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1475:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine1972);
                    lv_contents_0_0=ruleTextPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTextOrMarkupLineRule().getType().getClassifier());
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1497:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=17 && LA43_0<=21)||(LA43_0>=23 && LA43_0<=26)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1497:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1497:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1498:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1498:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1499:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkupLine1994);
                    	    lv_contents_1_0=ruleMarkUp();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupLineRule().getType().getClassifier());
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1521:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_WS)||LA42_0==RULE_ANY_OTHER||LA42_0==10||(LA42_0>=27 && LA42_0<=28)) ) {
                    	        alt42=1;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1522:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1522:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1523:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine2015);
                    	            lv_contents_2_0=ruleTextPart();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupLineRule().getType().getClassifier());
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
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1546:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1546:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=17 && LA45_0<=21)||(LA45_0>=23 && LA45_0<=26)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1546:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1546:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1547:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1547:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1548:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkupLine2047);
                    	    lv_contents_3_0=ruleMarkUp();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupLineRule().getType().getClassifier());
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1570:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_WS)||LA44_0==RULE_ANY_OTHER||LA44_0==10||(LA44_0>=27 && LA44_0<=28)) ) {
                    	        alt44=1;
                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1571:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1571:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1572:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine2068);
                    	            lv_contents_4_0=ruleTextPart();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupLineRule().getType().getClassifier());
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
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
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
    // $ANTLR end ruleTextOrMarkupLine


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1602:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1603:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1604:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkUpRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp2107);
            iv_ruleMarkUp=ruleMarkUp();
            _fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp2117); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1611:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1616:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1617:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1617:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            int alt47=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt47=1;
                }
                break;
            case 18:
                {
                alt47=2;
                }
                break;
            case 19:
                {
                alt47=3;
                }
                break;
            case 20:
                {
                alt47=4;
                }
                break;
            case 21:
                {
                alt47=5;
                }
                break;
            case 26:
                {
                alt47=6;
                }
                break;
            case 23:
                {
                alt47=7;
                }
                break;
            case 24:
                {
                alt47=8;
                }
                break;
            case 25:
                {
                alt47=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1617:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1618:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2164);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1628:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2191);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1638:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2218);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1648:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2245);
                    this_OrderedList_3=ruleOrderedList();
                    _fsp--;

                     
                            current = this_OrderedList_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1658:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2272);
                    this_UnorderedList_4=ruleUnorderedList();
                    _fsp--;

                     
                            current = this_UnorderedList_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1668:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp2299);
                    this_CodeBlock_5=ruleCodeBlock();
                    _fsp--;

                     
                            current = this_CodeBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1678:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp2326);
                    this_CodeRef_6=ruleCodeRef();
                    _fsp--;

                     
                            current = this_CodeRef_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1688:5: this_Link_7= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp2353);
                    this_Link_7=ruleLink();
                    _fsp--;

                     
                            current = this_Link_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1698:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp2380);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1714:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1715:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1716:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmphasizeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize2415);
            iv_ruleEmphasize=ruleEmphasize();
            _fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize2425); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1723:1: ruleEmphasize returns [EObject current=null] : ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' ) ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1728:6: ( ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1729:1: ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1729:1: ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1729:3: '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' )
            {
            match(input,17,FOLLOW_17_in_ruleEmphasize2460); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getEmphKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1733:1: ( '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1733:3: '[' ( (lv_contents_2_0= ruleTextOrMarkupLine ) ) ']'
            {
            match(input,11,FOLLOW_11_in_ruleEmphasize2471); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1737:1: ( (lv_contents_2_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1738:1: (lv_contents_2_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1738:1: (lv_contents_2_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1739:3: lv_contents_2_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupLineParserRuleCall_1_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleEmphasize2492);
            lv_contents_2_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleEmphasize2502); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_1_2(), null); 
                

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
    // $ANTLR end ruleEmphasize


    // $ANTLR start entryRuleAnchor
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1773:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1774:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1775:2: iv_ruleAnchor= ruleAnchor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnchorRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor2539);
            iv_ruleAnchor=ruleAnchor();
            _fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor2549); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1782:1: ruleAnchor returns [EObject current=null] : ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1787:6: ( ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:3: '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )?
            {
            match(input,18,FOLLOW_18_in_ruleAnchor2584); 

                    createLeafNode(grammarAccess.getAnchorAccess().getAKeyword_0(), null); 
                
            match(input,10,FOLLOW_10_in_ruleAnchor2594); 

                    createLeafNode(grammarAccess.getAnchorAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1796:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1797:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1797:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1798:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor2611); 

            			createLeafNode(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnchorRule().getType().getClassifier());
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1820:2: ( '[' ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1820:4: '[' ']'
                    {
                    match(input,11,FOLLOW_11_in_ruleAnchor2627); 

                            createLeafNode(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleAnchor2637); 

                            createLeafNode(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1(), null); 
                        

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
    // $ANTLR end ruleAnchor


    // $ANTLR start entryRuleRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1836:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1837:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1838:2: iv_ruleRef= ruleRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef2675);
            iv_ruleRef=ruleRef();
            _fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef2685); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1845:1: ruleRef returns [EObject current=null] : ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ']' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1850:6: ( ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1851:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1851:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1851:3: '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ']'
            {
            match(input,19,FOLLOW_19_in_ruleRef2720); 

                    createLeafNode(grammarAccess.getRefAccess().getRefKeyword_0(), null); 
                
            match(input,10,FOLLOW_10_in_ruleRef2730); 

                    createLeafNode(grammarAccess.getRefAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1859:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1860:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1860:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1861:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef2748); 

            		createLeafNode(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0(), "ref"); 
            	

            }


            }

            match(input,11,FOLLOW_11_in_ruleRef2758); 

                    createLeafNode(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1877:1: ( (lv_contents_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1878:1: (lv_contents_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1878:1: (lv_contents_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1879:3: lv_contents_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupLineParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleRef2779);
            lv_contents_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleRef2789); 

                    createLeafNode(grammarAccess.getRefAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1913:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1914:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1915:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList2825);
            iv_ruleOrderedList=ruleOrderedList();
            _fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList2835); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1922:1: ruleOrderedList returns [EObject current=null] : ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1927:6: ( ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1928:1: ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1928:1: ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1928:3: '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']'
            {
            match(input,20,FOLLOW_20_in_ruleOrderedList2870); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getOlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1932:1: ( RULE_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1932:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrderedList2880); 
            	     
            	        createLeafNode(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleOrderedList2891); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1940:1: ( RULE_WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_WS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1940:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrderedList2901); 
            	     
            	        createLeafNode(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1944:3: ( (lv_items_4_0= ruleItem ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1945:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1945:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1946:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList2923);
            	    lv_items_4_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_4_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            match(input,12,FOLLOW_12_in_ruleOrderedList2934); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1980:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1981:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnorderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2970);
            iv_ruleUnorderedList=ruleUnorderedList();
            _fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList2980); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1989:1: ruleUnorderedList returns [EObject current=null] : ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1994:6: ( ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1995:1: ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1995:1: ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1995:3: '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']'
            {
            match(input,21,FOLLOW_21_in_ruleUnorderedList3015); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getUlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1999:1: ( RULE_WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_WS) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1999:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleUnorderedList3025); 
            	     
            	        createLeafNode(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleUnorderedList3036); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2007:1: ( RULE_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_WS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2007:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleUnorderedList3046); 
            	     
            	        createLeafNode(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2011:3: ( (lv_items_4_0= ruleItem ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==22) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2012:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2012:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2013:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList3068);
            	    lv_items_4_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUnorderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_4_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            match(input,12,FOLLOW_12_in_ruleUnorderedList3079); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2047:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2048:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2049:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem3115);
            iv_ruleItem=ruleItem();
            _fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem3125); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2056:1: ruleItem returns [EObject current=null] : ( '\\\\item' ( RULE_WS )* '[' ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_5_0= ruleTextOrMarkup ) )* ']' ( RULE_WS )* ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2061:6: ( ( '\\\\item' ( RULE_WS )* '[' ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_5_0= ruleTextOrMarkup ) )* ']' ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2062:1: ( '\\\\item' ( RULE_WS )* '[' ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_5_0= ruleTextOrMarkup ) )* ']' ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2062:1: ( '\\\\item' ( RULE_WS )* '[' ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_5_0= ruleTextOrMarkup ) )* ']' ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2062:3: '\\\\item' ( RULE_WS )* '[' ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) ) ( (lv_contents_5_0= ruleTextOrMarkup ) )* ']' ( RULE_WS )*
            {
            match(input,22,FOLLOW_22_in_ruleItem3160); 

                    createLeafNode(grammarAccess.getItemAccess().getItemKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2066:1: ( RULE_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_WS) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2066:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleItem3170); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleItem3181); 

                    createLeafNode(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2074:1: ( ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2074:2: ( (lv_contents_3_0= ruleParBreak ) )? ( (lv_contents_4_0= ruleTextOrMarkupLine ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2074:2: ( (lv_contents_3_0= ruleParBreak ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_MULTI_NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2075:1: (lv_contents_3_0= ruleParBreak )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2075:1: (lv_contents_3_0= ruleParBreak )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2076:3: lv_contents_3_0= ruleParBreak
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsParBreakParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParBreak_in_ruleItem3203);
                    lv_contents_3_0=ruleParBreak();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_3_0, 
                    	        		"ParBreak", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2098:3: ( (lv_contents_4_0= ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2099:1: (lv_contents_4_0= ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2099:1: (lv_contents_4_0= ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2100:3: lv_contents_4_0= ruleTextOrMarkupLine
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupLineParserRuleCall_3_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_ruleItem3225);
            lv_contents_4_0=ruleTextOrMarkupLine();
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
            	        		"TextOrMarkupLine", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2122:3: ( (lv_contents_5_0= ruleTextOrMarkup ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_MULTI_NL) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2123:1: (lv_contents_5_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2123:1: (lv_contents_5_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2124:3: lv_contents_5_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem3247);
            	    lv_contents_5_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_5_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleItem3258); 

                    createLeafNode(grammarAccess.getItemAccess().getRightSquareBracketKeyword_5(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2150:1: ( RULE_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_WS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2150:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleItem3268); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getWSTerminalRuleCall_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleCodeRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2162:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2163:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2164:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef3305);
            iv_ruleCodeRef=ruleCodeRef();
            _fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef3315); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2171:1: ruleCodeRef returns [EObject current=null] : ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2176:6: ( ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:1: ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:1: ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:3: '\\\\codeRef' '[' ( ( ruleText ) ) ']'
            {
            match(input,23,FOLLOW_23_in_ruleCodeRef3350); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleCodeRef3360); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2185:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2186:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2186:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2187:3: ruleText
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCodeRef3383);
            ruleText();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleCodeRef3393); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2213:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2214:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2215:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3429);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3439); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2222:1: ruleLink returns [EObject current=null] : ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_text_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2227:6: ( ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2228:1: ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2228:1: ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2228:3: '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']'
            {
            match(input,24,FOLLOW_24_in_ruleLink3474); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleLink3484); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2236:1: ( (lv_url_2_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2237:1: (lv_url_2_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2237:1: (lv_url_2_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2238:3: lv_url_2_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3505);
            lv_url_2_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_2_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleLink3515); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3(), null); 
                
            match(input,11,FOLLOW_11_in_ruleLink3525); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2268:1: ( (lv_text_5_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2269:1: (lv_text_5_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2269:1: (lv_text_5_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2270:3: lv_text_5_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3546);
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

            match(input,12,FOLLOW_12_in_ruleLink3556); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2304:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2305:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2306:2: iv_ruleImageRef= ruleImageRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef3592);
            iv_ruleImageRef=ruleImageRef();
            _fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef3602); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: ruleImageRef returns [EObject current=null] : ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_path_4_0 = null;

        AntlrDatatypeRuleToken lv_clazz_7_0 = null;

        AntlrDatatypeRuleToken lv_style_10_0 = null;

        AntlrDatatypeRuleToken lv_caption_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2318:6: ( ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2319:1: ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2319:1: ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2319:3: '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']'
            {
            match(input,25,FOLLOW_25_in_ruleImageRef3637); 

                    createLeafNode(grammarAccess.getImageRefAccess().getImgKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2323:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==10) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2323:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleImageRef3648); 

                            createLeafNode(grammarAccess.getImageRefAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2327:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2328:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2328:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2329:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef3665); 

                    			createLeafNode(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleImageRef3682); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2355:1: ( (lv_path_4_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2356:1: (lv_path_4_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2356:1: (lv_path_4_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2357:3: lv_path_4_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3703);
            lv_path_4_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_4_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3713); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_4(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3723); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2387:1: ( (lv_clazz_7_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2388:1: (lv_clazz_7_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2388:1: (lv_clazz_7_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2389:3: lv_clazz_7_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3744);
            lv_clazz_7_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clazz",
            	        		lv_clazz_7_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3754); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_7(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3764); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2419:1: ( (lv_style_10_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2420:1: (lv_style_10_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2420:1: (lv_style_10_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2421:3: lv_style_10_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3785);
            lv_style_10_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"style",
            	        		lv_style_10_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3795); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3805); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2451:1: ( (lv_caption_13_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2452:1: (lv_caption_13_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2452:1: (lv_caption_13_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2453:3: lv_caption_13_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3826);
            lv_caption_13_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"caption",
            	        		lv_caption_13_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3836); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2487:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2488:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2489:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3872);
            iv_ruleCodeBlock=ruleCodeBlock();
            _fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock3882); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2496:1: ruleCodeBlock returns [EObject current=null] : ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* (this_ParBreak_5= ruleParBreak )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token lv_language_2_0=null;
        EObject this_ParBreak_5 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2501:6: ( ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* (this_ParBreak_5= ruleParBreak )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2502:1: ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* (this_ParBreak_5= ruleParBreak )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2502:1: ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* (this_ParBreak_5= ruleParBreak )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2502:3: '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* (this_ParBreak_5= ruleParBreak )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']'
            {
            match(input,26,FOLLOW_26_in_ruleCodeBlock3917); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getCodeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2506:1: ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2506:3: '[' ( (lv_language_2_0= RULE_ID ) ) ']'
                    {
                    match(input,11,FOLLOW_11_in_ruleCodeBlock3928); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2510:1: ( (lv_language_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2511:1: (lv_language_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2511:1: (lv_language_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2512:3: lv_language_2_0= RULE_ID
                    {
                    lv_language_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock3945); 

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

                    match(input,12,FOLLOW_12_in_ruleCodeBlock3960); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2538:3: ( RULE_WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_WS) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2538:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeBlock3972); 
            	     
            	        createLeafNode(grammarAccess.getCodeBlockAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2542:3: (this_ParBreak_5= ruleParBreak )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_MULTI_NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2543:5: this_ParBreak_5= ruleParBreak
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getParBreakParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParBreak_in_ruleCodeBlock3996);
                    this_ParBreak_5=ruleParBreak();
                    _fsp--;

                     
                            current = this_ParBreak_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleCodeBlock4007); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2555:1: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_ANY_OTHER)||LA67_0==10||(LA67_0>=27 && LA67_0<=28)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=17 && LA67_0<=19)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2555:1: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2555:2: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2555:2: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2555:3: ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2555:3: ( (lv_contents_7_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2556:1: (lv_contents_7_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2556:1: (lv_contents_7_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2557:3: lv_contents_7_0= ruleCode
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4030);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2579:2: ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=17 && LA64_0<=19)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2579:3: ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2579:3: ( (lv_contents_8_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2580:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2580:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2581:3: lv_contents_8_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4052);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2603:2: ( (lv_contents_9_0= ruleCode ) )?
                    	    int alt63=2;
                    	    int LA63_0 = input.LA(1);

                    	    if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_ANY_OTHER)||LA63_0==10||(LA63_0>=27 && LA63_0<=28)) ) {
                    	        alt63=1;
                    	    }
                    	    switch (alt63) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2604:1: (lv_contents_9_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2604:1: (lv_contents_9_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2605:3: lv_contents_9_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4073);
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
                    	    break loop64;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2628:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2628:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=17 && LA66_0<=19)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2628:7: ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2628:7: ( (lv_contents_10_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2629:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2629:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2630:3: lv_contents_10_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4105);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2652:2: ( (lv_contents_11_0= ruleCode ) )?
                    	    int alt65=2;
                    	    int LA65_0 = input.LA(1);

                    	    if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_ANY_OTHER)||LA65_0==10||(LA65_0>=27 && LA65_0<=28)) ) {
                    	        alt65=1;
                    	    }
                    	    switch (alt65) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2653:1: (lv_contents_11_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2653:1: (lv_contents_11_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2654:3: lv_contents_11_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4126);
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
                    	    if ( cnt66 >= 1 ) break loop66;
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleCodeBlock4140); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_6(), null); 
                

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


    // $ANTLR start entryRuleParBreak
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2688:1: entryRuleParBreak returns [EObject current=null] : iv_ruleParBreak= ruleParBreak EOF ;
    public final EObject entryRuleParBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParBreak = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2689:2: (iv_ruleParBreak= ruleParBreak EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2690:2: iv_ruleParBreak= ruleParBreak EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParBreakRule(), currentNode); 
            pushFollow(FOLLOW_ruleParBreak_in_entryRuleParBreak4176);
            iv_ruleParBreak=ruleParBreak();
            _fsp--;

             current =iv_ruleParBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParBreak4186); 

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
    // $ANTLR end entryRuleParBreak


    // $ANTLR start ruleParBreak
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2697:1: ruleParBreak returns [EObject current=null] : ( (lv_c_0_0= RULE_MULTI_NL ) ) ;
    public final EObject ruleParBreak() throws RecognitionException {
        EObject current = null;

        Token lv_c_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2702:6: ( ( (lv_c_0_0= RULE_MULTI_NL ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2703:1: ( (lv_c_0_0= RULE_MULTI_NL ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2703:1: ( (lv_c_0_0= RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2704:1: (lv_c_0_0= RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2704:1: (lv_c_0_0= RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2705:3: lv_c_0_0= RULE_MULTI_NL
            {
            lv_c_0_0=(Token)input.LT(1);
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleParBreak4227); 

            			createLeafNode(grammarAccess.getParBreakAccess().getCMULTI_NLTerminalRuleCall_0(), "c"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParBreakRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"c",
            	        		lv_c_0_0, 
            	        		"MULTI_NL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleParBreak


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2735:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2736:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2737:2: iv_ruleTextPart= ruleTextPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart4267);
            iv_ruleTextPart=ruleTextPart();
            _fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart4277); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2744:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2749:6: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2750:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2750:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2751:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2751:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2752:3: lv_text_0_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart4322);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2782:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2783:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2784:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4358);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4369); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2791:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ANY_OTHER_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2796:6: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2797:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2797:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt68=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt68=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt68=3;
                    }
                    break;
                case 27:
                    {
                    alt68=4;
                    }
                    break;
                case 28:
                    {
                    alt68=5;
                    }
                    break;
                case 10:
                    {
                    alt68=6;
                    }
                    break;

                }

                switch (alt68) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2797:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText4409); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2805:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText4435); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2813:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText4461); 

            	    		current.merge(this_ANY_OTHER_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2822:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,27,FOLLOW_27_in_ruleText4485); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2829:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleText4504); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2836:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,10,FOLLOW_10_in_ruleText4523); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getColonKeyword_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
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


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2849:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2850:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2851:2: iv_ruleCodeText= ruleCodeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText4565);
            iv_ruleCodeText=ruleCodeText();
            _fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText4576); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2858:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2863:6: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2864:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2864:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt69=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt69=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt69=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt69=4;
                    }
                    break;
                case 27:
                    {
                    alt69=5;
                    }
                    break;
                case 28:
                    {
                    alt69=6;
                    }
                    break;
                case 10:
                    {
                    alt69=7;
                    }
                    break;

                }

                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2864:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText4616); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2872:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)input.LT(1);
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText4642); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2880:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText4668); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2888:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4694); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2897:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,27,FOLLOW_27_in_ruleCodeText4718); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2904:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleCodeText4737); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2911:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,10,FOLLOW_10_in_ruleCodeText4756); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getColonKeyword_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2924:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2925:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2926:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkupInCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4797);
            iv_ruleMarkupInCode=ruleMarkupInCode();
            _fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode4807); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2933:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2938:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2939:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2939:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt70=1;
                }
                break;
            case 18:
                {
                alt70=2;
                }
                break;
            case 19:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2939:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2940:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode4854);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2950:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode4881);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2960:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode4908);
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


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2976:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2977:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2978:2: iv_ruleCode= ruleCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode4943);
            iv_ruleCode=ruleCode();
            _fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode4953); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2985:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2990:6: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2991:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2991:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2992:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2992:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2993:3: lv_contents_0_0= ruleCodeText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode4998);
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


    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA60_eotS =
        "\10\uffff";
    static final String DFA60_eofS =
        "\4\uffff\3\2\1\uffff";
    static final String DFA60_minS =
        "\1\5\1\4\1\uffff\4\4\1\uffff";
    static final String DFA60_maxS =
        "\1\13\1\34\1\uffff\4\34\1\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA60_specialS =
        "\10\uffff}>";
    static final String[] DFA60_transitionS = {
            "\2\2\4\uffff\1\1",
            "\1\3\3\2\2\uffff\1\2\6\uffff\3\2\7\uffff\2\2",
            "",
            "\4\2\2\uffff\1\2\1\uffff\1\4\4\uffff\3\2\7\uffff\2\2",
            "\1\2\1\5\1\6\1\2\1\uffff\2\2\1\7\12\2\1\uffff\6\2",
            "\1\2\1\5\1\6\1\2\1\uffff\2\2\1\7\12\2\1\uffff\6\2",
            "\2\2\1\uffff\1\2\1\uffff\2\2\1\7\1\uffff\11\2\1\uffff\6\2",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "2506:1: ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleDocument142 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument164 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleDocument194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument216 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleDocument246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument268 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleDocument292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleChapter374 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleChapter385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter419 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleChapter440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChapter450 = new BitSet(new long[]{0x0000000000002062L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChapter460 = new BitSet(new long[]{0x0000000000002062L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleChapter484 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleChapter505 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter527 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleChapter552 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter574 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSection657 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection685 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection702 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection723 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection733 = new BitSet(new long[]{0x0000000000004062L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection743 = new BitSet(new long[]{0x0000000000004062L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSection767 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection788 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection810 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSection835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleSection857 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubSection940 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSubSection951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSection968 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSubSection985 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSubSection1006 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSubSection1016 = new BitSet(new long[]{0x0000000000008062L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSubSection1026 = new BitSet(new long[]{0x0000000000008062L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSubSection1050 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSubSection1071 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection1093 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSubSection1118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSubSection1140 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSection31223 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection31234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31251 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31268 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection31289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection31299 = new BitSet(new long[]{0x0000000000010062L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection31309 = new BitSet(new long[]{0x0000000000010062L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSection31333 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection31354 = new BitSet(new long[]{0x0000000000010042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31376 = new BitSet(new long[]{0x0000000000010042L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSection31401 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31423 = new BitSet(new long[]{0x0000000000010042L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSection41506 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection41517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection41534 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection41551 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection41572 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection41582 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection41592 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleSection41616 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleSection41637 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleTextOrMarkup1756 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1779 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1801 = new BitSet(new long[]{0x000000001FBE04B2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1822 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1854 = new BitSet(new long[]{0x000000001FBE04B2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1875 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_entryRuleTextOrMarkupLine1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkupLine1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine1972 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkupLine1994 = new BitSet(new long[]{0x000000001FBE04B2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine2015 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkupLine2047 = new BitSet(new long[]{0x000000001FBE04B2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkupLine2068 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEmphasize2460 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize2471 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleEmphasize2492 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmphasize2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor2539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAnchor2584 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleAnchor2594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor2611 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAnchor2627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnchor2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRef2720 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleRef2730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef2748 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef2758 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleRef2779 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRef2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrderedList2870 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrderedList2880 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList2891 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrderedList2901 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList2923 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleOrderedList2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUnorderedList3015 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleUnorderedList3025 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList3036 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleUnorderedList3046 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList3068 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleUnorderedList3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleItem3160 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleItem3170 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleItem3181 = new BitSet(new long[]{0x000000001FBE04F0L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleItem3203 = new BitSet(new long[]{0x000000001FBE04B0L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_ruleItem3225 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem3247 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_12_in_ruleItem3258 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleItem3268 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef3305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCodeRef3350 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef3360 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef3383 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCodeRef3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLink3474 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink3484 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLink3515 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink3525 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLink3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef3592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleImageRef3637 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleImageRef3648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef3665 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3682 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3703 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3713 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3723 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3744 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3754 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3764 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3785 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3795 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3805 = new BitSet(new long[]{0x00000000180004B0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3826 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCodeBlock3917 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock3928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock3945 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock3960 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeBlock3972 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_ruleParBreak_in_ruleCodeBlock3996 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock4007 = new BitSet(new long[]{0x00000000180E04F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4030 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4052 = new BitSet(new long[]{0x00000000180E14F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4073 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4105 = new BitSet(new long[]{0x00000000180E14F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4126 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_entryRuleParBreak4176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParBreak4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleParBreak4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart4267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText4409 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText4435 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText4461 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_27_in_ruleText4485 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_28_in_ruleText4504 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_10_in_ruleText4523 = new BitSet(new long[]{0x00000000180004B2L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText4565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText4616 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText4642 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText4668 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4694 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_27_in_ruleCodeText4718 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_28_in_ruleCodeText4737 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_10_in_ruleCodeText4756 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode4943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode4998 = new BitSet(new long[]{0x0000000000000002L});

}