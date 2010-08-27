package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.xdoc.services.XDocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_MULTI_NL", "RULE_SL_COMMENT", "'\\\\['", "'\\\\]'", "':'", "'\\\\chapter'", "'['", "']'", "'\\\\section'", "'\\\\subsection'", "'\\\\section3'", "'\\\\section4'", "'\\\\emph'", "'\\\\a'", "'\\\\ref'", "'\\\\ol'", "'\\\\ul'", "'\\\\item'", "'\\\\codeRef'", "'\\\\link'", "'\\\\img'", "'\\\\code'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_MULTI_NL=8;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_SL_COMMENT=9;

        public InternalXDocParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g"; }


     
     	private XDocGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XDocGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleDocument
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:61:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:62:1: ( ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:63:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();
            _fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDocument


    // $ANTLR start ruleDocument
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:70:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:74:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:75:1: ( ( rule__Document__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:75:1: ( ( rule__Document__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:76:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:77:1: ( rule__Document__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:77:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDocument


    // $ANTLR start entryRuleChapter
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:89:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:90:1: ( ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:91:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter121);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getChapterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleChapter


    // $ANTLR start ruleChapter
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:98:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:102:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:103:1: ( ( rule__Chapter__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:103:1: ( ( rule__Chapter__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:104:1: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:105:1: ( rule__Chapter__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:105:2: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0_in_ruleChapter154);
            rule__Chapter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleChapter


    // $ANTLR start entryRuleSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:117:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:118:1: ( ruleSection EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:119:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection181);
            ruleSection();
            _fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection


    // $ANTLR start ruleSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:126:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:130:2: ( ( ( rule__Section__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:131:1: ( ( rule__Section__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:131:1: ( ( rule__Section__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:132:1: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:133:1: ( rule__Section__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:133:2: rule__Section__Group__0
            {
            pushFollow(FOLLOW_rule__Section__Group__0_in_ruleSection214);
            rule__Section__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleSubSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:145:1: entryRuleSubSection : ruleSubSection EOF ;
    public final void entryRuleSubSection() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:146:1: ( ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:147:1: ruleSubSection EOF
            {
             before(grammarAccess.getSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection241);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSubSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSubSection


    // $ANTLR start ruleSubSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:154:1: ruleSubSection : ( ( rule__SubSection__Group__0 ) ) ;
    public final void ruleSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:158:2: ( ( ( rule__SubSection__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__SubSection__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__SubSection__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:160:1: ( rule__SubSection__Group__0 )
            {
             before(grammarAccess.getSubSectionAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:1: ( rule__SubSection__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:2: rule__SubSection__Group__0
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274);
            rule__SubSection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSubSection


    // $ANTLR start entryRuleSection3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:173:1: entryRuleSection3 : ruleSection3 EOF ;
    public final void entryRuleSection3() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:174:1: ( ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:175:1: ruleSection3 EOF
            {
             before(grammarAccess.getSection3Rule()); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection3301);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSection3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection3308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection3


    // $ANTLR start ruleSection3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:182:1: ruleSection3 : ( ( rule__Section3__Group__0 ) ) ;
    public final void ruleSection3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:186:2: ( ( ( rule__Section3__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:187:1: ( ( rule__Section3__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:187:1: ( ( rule__Section3__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:188:1: ( rule__Section3__Group__0 )
            {
             before(grammarAccess.getSection3Access().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:189:1: ( rule__Section3__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:189:2: rule__Section3__Group__0
            {
            pushFollow(FOLLOW_rule__Section3__Group__0_in_ruleSection3334);
            rule__Section3__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection3


    // $ANTLR start entryRuleSection4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:201:1: entryRuleSection4 : ruleSection4 EOF ;
    public final void entryRuleSection4() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:202:1: ( ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:203:1: ruleSection4 EOF
            {
             before(grammarAccess.getSection4Rule()); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection4361);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection4368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection4


    // $ANTLR start ruleSection4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:210:1: ruleSection4 : ( ( rule__Section4__Group__0 ) ) ;
    public final void ruleSection4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:214:2: ( ( ( rule__Section4__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:215:1: ( ( rule__Section4__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:215:1: ( ( rule__Section4__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:216:1: ( rule__Section4__Group__0 )
            {
             before(grammarAccess.getSection4Access().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:217:1: ( rule__Section4__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:217:2: rule__Section4__Group__0
            {
            pushFollow(FOLLOW_rule__Section4__Group__0_in_ruleSection4394);
            rule__Section4__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:231:1: entryRuleTextOrMarkup : ruleTextOrMarkup EOF ;
    public final void entryRuleTextOrMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:232:1: ( ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:233:1: ruleTextOrMarkup EOF
            {
             before(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup423);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getTextOrMarkupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextOrMarkup


    // $ANTLR start ruleTextOrMarkup
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:240:1: ruleTextOrMarkup : ( ( rule__TextOrMarkup__Alternatives ) ) ;
    public final void ruleTextOrMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:244:2: ( ( ( rule__TextOrMarkup__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:246:1: ( rule__TextOrMarkup__Alternatives )
            {
             before(grammarAccess.getTextOrMarkupAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:1: ( rule__TextOrMarkup__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:2: rule__TextOrMarkup__Alternatives
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup456);
            rule__TextOrMarkup__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextOrMarkup


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:259:1: entryRuleTextPart : ruleTextPart EOF ;
    public final void entryRuleTextPart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:260:1: ( ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:261:1: ruleTextPart EOF
            {
             before(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart483);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextPart


    // $ANTLR start ruleTextPart
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:268:1: ruleTextPart : ( ( rule__TextPart__TextAssignment ) ) ;
    public final void ruleTextPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:272:2: ( ( ( rule__TextPart__TextAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextPart__TextAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextPart__TextAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:274:1: ( rule__TextPart__TextAssignment )
            {
             before(grammarAccess.getTextPartAccess().getTextAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:1: ( rule__TextPart__TextAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:2: rule__TextPart__TextAssignment
            {
            pushFollow(FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart516);
            rule__TextPart__TextAssignment();
            _fsp--;


            }

             after(grammarAccess.getTextPartAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextPart


    // $ANTLR start entryRuleText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:287:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:288:1: ( ruleText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:289:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText543);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:296:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:300:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( ( rule__Text__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:1: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:304:1: ( rule__Text__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:304:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText578);
            rule__Text__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:307:1: ( ( rule__Text__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:308:1: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:309:1: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=10 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:309:2: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText590);
            	    rule__Text__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleText


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:322:1: entryRuleMarkUp : ruleMarkUp EOF ;
    public final void entryRuleMarkUp() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:323:1: ( ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:324:1: ruleMarkUp EOF
            {
             before(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp620);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getMarkUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp627); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMarkUp


    // $ANTLR start ruleMarkUp
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:331:1: ruleMarkUp : ( ( rule__MarkUp__Alternatives ) ) ;
    public final void ruleMarkUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:335:2: ( ( ( rule__MarkUp__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:336:1: ( ( rule__MarkUp__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:336:1: ( ( rule__MarkUp__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:337:1: ( rule__MarkUp__Alternatives )
            {
             before(grammarAccess.getMarkUpAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:338:1: ( rule__MarkUp__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:338:2: rule__MarkUp__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp653);
            rule__MarkUp__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMarkUpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMarkUp


    // $ANTLR start entryRuleEmphasize
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:350:1: entryRuleEmphasize : ruleEmphasize EOF ;
    public final void entryRuleEmphasize() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:351:1: ( ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:352:1: ruleEmphasize EOF
            {
             before(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize680);
            ruleEmphasize();
            _fsp--;

             after(grammarAccess.getEmphasizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEmphasize


    // $ANTLR start ruleEmphasize
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:359:1: ruleEmphasize : ( ( rule__Emphasize__Group__0 ) ) ;
    public final void ruleEmphasize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:363:2: ( ( ( rule__Emphasize__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__Emphasize__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__Emphasize__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:365:1: ( rule__Emphasize__Group__0 )
            {
             before(grammarAccess.getEmphasizeAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:1: ( rule__Emphasize__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:2: rule__Emphasize__Group__0
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize713);
            rule__Emphasize__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEmphasize


    // $ANTLR start entryRuleAnchor
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:378:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:379:1: ( ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:380:1: ruleAnchor EOF
            {
             before(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor740);
            ruleAnchor();
            _fsp--;

             after(grammarAccess.getAnchorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor747); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAnchor


    // $ANTLR start ruleAnchor
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:387:1: ruleAnchor : ( ( rule__Anchor__Group__0 ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:391:2: ( ( ( rule__Anchor__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Anchor__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Anchor__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:393:1: ( rule__Anchor__Group__0 )
            {
             before(grammarAccess.getAnchorAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:1: ( rule__Anchor__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:2: rule__Anchor__Group__0
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0_in_ruleAnchor773);
            rule__Anchor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnchor


    // $ANTLR start entryRuleRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:406:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:407:1: ( ruleRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:408:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef800);
            ruleRef();
            _fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef807); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRef


    // $ANTLR start ruleRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:415:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:419:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Ref__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:421:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:1: ( rule__Ref__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:2: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_rule__Ref__Group__0_in_ruleRef833);
            rule__Ref__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRef


    // $ANTLR start entryRuleOrderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:434:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:435:1: ( ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:436:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList860);
            ruleOrderedList();
            _fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList867); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOrderedList


    // $ANTLR start ruleOrderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:443:1: ruleOrderedList : ( ( rule__OrderedList__Group__0 ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:447:2: ( ( ( rule__OrderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__OrderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__OrderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:449:1: ( rule__OrderedList__Group__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:1: ( rule__OrderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:2: rule__OrderedList__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList893);
            rule__OrderedList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrderedList


    // $ANTLR start entryRuleUnorderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:462:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:463:1: ( ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:464:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList920);
            ruleUnorderedList();
            _fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList927); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUnorderedList


    // $ANTLR start ruleUnorderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:471:1: ruleUnorderedList : ( ( rule__UnorderedList__Group__0 ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:475:2: ( ( ( rule__UnorderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__UnorderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__UnorderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:477:1: ( rule__UnorderedList__Group__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:1: ( rule__UnorderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:2: rule__UnorderedList__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList953);
            rule__UnorderedList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnorderedList


    // $ANTLR start entryRuleItem
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:490:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:491:1: ( ruleItem EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:492:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem980);
            ruleItem();
            _fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem987); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleItem


    // $ANTLR start ruleItem
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:499:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:503:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__Item__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__Item__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:505:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:1: ( rule__Item__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem1013);
            rule__Item__Group__0();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleCodeRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:518:1: entryRuleCodeRef : ruleCodeRef EOF ;
    public final void entryRuleCodeRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:519:1: ( ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:520:1: ruleCodeRef EOF
            {
             before(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef1040);
            ruleCodeRef();
            _fsp--;

             after(grammarAccess.getCodeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef1047); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeRef


    // $ANTLR start ruleCodeRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:527:1: ruleCodeRef : ( ( rule__CodeRef__Group__0 ) ) ;
    public final void ruleCodeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:531:2: ( ( ( rule__CodeRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__CodeRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__CodeRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:533:1: ( rule__CodeRef__Group__0 )
            {
             before(grammarAccess.getCodeRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:1: ( rule__CodeRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:2: rule__CodeRef__Group__0
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1073);
            rule__CodeRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeRef


    // $ANTLR start entryRuleLink
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:546:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:547:1: ( ruleLink EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:548:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1100);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1107); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:555:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:559:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:561:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:1: ( rule__Link__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1133);
            rule__Link__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleImageRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:574:1: entryRuleImageRef : ruleImageRef EOF ;
    public final void entryRuleImageRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:575:1: ( ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:576:1: ruleImageRef EOF
            {
             before(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef1160);
            ruleImageRef();
            _fsp--;

             after(grammarAccess.getImageRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef1167); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImageRef


    // $ANTLR start ruleImageRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:583:1: ruleImageRef : ( ( rule__ImageRef__Group__0 ) ) ;
    public final void ruleImageRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:587:2: ( ( ( rule__ImageRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__ImageRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__ImageRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:589:1: ( rule__ImageRef__Group__0 )
            {
             before(grammarAccess.getImageRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:1: ( rule__ImageRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:2: rule__ImageRef__Group__0
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1193);
            rule__ImageRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImageRef


    // $ANTLR start entryRuleCodeBlock
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:602:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:603:1: ( ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:604:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1220);
            ruleCodeBlock();
            _fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock1227); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeBlock


    // $ANTLR start ruleCodeBlock
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:611:1: ruleCodeBlock : ( ( rule__CodeBlock__Group__0 ) ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:615:2: ( ( ( rule__CodeBlock__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__CodeBlock__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__CodeBlock__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:617:1: ( rule__CodeBlock__Group__0 )
            {
             before(grammarAccess.getCodeBlockAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:1: ( rule__CodeBlock__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:2: rule__CodeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1253);
            rule__CodeBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeBlock


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:630:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:631:1: ( ruleCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:632:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode1280);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode1287); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCode


    // $ANTLR start ruleCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:639:1: ruleCode : ( ( rule__Code__ContentsAssignment ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:643:2: ( ( ( rule__Code__ContentsAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__Code__ContentsAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__Code__ContentsAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:645:1: ( rule__Code__ContentsAssignment )
            {
             before(grammarAccess.getCodeAccess().getContentsAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:1: ( rule__Code__ContentsAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:2: rule__Code__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1313);
            rule__Code__ContentsAssignment();
            _fsp--;


            }

             after(grammarAccess.getCodeAccess().getContentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCode


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:658:1: entryRuleMarkupInCode : ruleMarkupInCode EOF ;
    public final void entryRuleMarkupInCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:659:1: ( ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:660:1: ruleMarkupInCode EOF
            {
             before(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1340);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getMarkupInCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode1347); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMarkupInCode


    // $ANTLR start ruleMarkupInCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:667:1: ruleMarkupInCode : ( ( rule__MarkupInCode__Alternatives ) ) ;
    public final void ruleMarkupInCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:671:2: ( ( ( rule__MarkupInCode__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__MarkupInCode__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__MarkupInCode__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:673:1: ( rule__MarkupInCode__Alternatives )
            {
             before(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:1: ( rule__MarkupInCode__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:2: rule__MarkupInCode__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1373);
            rule__MarkupInCode__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMarkupInCode


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:686:1: entryRuleCodeText : ruleCodeText EOF ;
    public final void entryRuleCodeText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:687:1: ( ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:688:1: ruleCodeText EOF
            {
             before(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText1400);
            ruleCodeText();
            _fsp--;

             after(grammarAccess.getCodeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText1407); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeText


    // $ANTLR start ruleCodeText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:695:1: ruleCodeText : ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) ;
    public final void ruleCodeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:699:2: ( ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:701:1: ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:701:1: ( ( rule__CodeText__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:702:1: ( rule__CodeText__Alternatives )
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:703:1: ( rule__CodeText__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:703:2: rule__CodeText__Alternatives
            {
            pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435);
            rule__CodeText__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCodeTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:706:1: ( ( rule__CodeText__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:707:1: ( rule__CodeText__Alternatives )*
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:708:1: ( rule__CodeText__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_MULTI_NL)||(LA2_0>=10 && LA2_0<=12)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:708:2: rule__CodeText__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447);
            	    rule__CodeText__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCodeTextAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeText


    // $ANTLR start entryRuleANY_WS
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:721:1: entryRuleANY_WS : ruleANY_WS EOF ;
    public final void entryRuleANY_WS() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:722:1: ( ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:723:1: ruleANY_WS EOF
            {
             before(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS1477);
            ruleANY_WS();
            _fsp--;

             after(grammarAccess.getANY_WSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS1484); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleANY_WS


    // $ANTLR start ruleANY_WS
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:730:1: ruleANY_WS : ( ( rule__ANY_WS__Alternatives ) ) ;
    public final void ruleANY_WS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:734:2: ( ( ( rule__ANY_WS__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__ANY_WS__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__ANY_WS__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:736:1: ( rule__ANY_WS__Alternatives )
            {
             before(grammarAccess.getANY_WSAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:1: ( rule__ANY_WS__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:2: rule__ANY_WS__Alternatives
            {
            pushFollow(FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1510);
            rule__ANY_WS__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getANY_WSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleANY_WS


    // $ANTLR start rule__Document__Alternatives_3_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:749:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );
    public final void rule__Document__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:753:1: ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("749:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:754:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:754:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:755:1: ( rule__Document__Group_3_0_0__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:756:1: ( rule__Document__Group_3_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:756:2: rule__Document__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01546);
                    rule__Document__Group_3_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:760:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:760:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:761:1: ( rule__Document__Group_3_0_1__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:1: ( rule__Document__Group_3_0_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:2: rule__Document__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01564);
                    rule__Document__Group_3_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:766:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:766:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:767:1: ( rule__Document__Group_3_0_2__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_2()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:768:1: ( rule__Document__Group_3_0_2__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:768:2: rule__Document__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01582);
                    rule__Document__Group_3_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Alternatives_3_0


    // $ANTLR start rule__TextOrMarkup__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:778:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );
    public final void rule__TextOrMarkup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_ANY_OTHER)||(LA5_0>=10 && LA5_0<=12)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=20 && LA5_0<=24)||(LA5_0>=26 && LA5_0<=29)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("778:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:1: ( rule__TextOrMarkup__Group_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:785:1: ( rule__TextOrMarkup__Group_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:785:2: rule__TextOrMarkup__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1616);
                    rule__TextOrMarkup__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:1: ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:1: ( ( rule__TextOrMarkup__Group_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:791:1: ( rule__TextOrMarkup__Group_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:792:1: ( rule__TextOrMarkup__Group_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:792:2: rule__TextOrMarkup__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1636);
                    rule__TextOrMarkup__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:795:1: ( ( rule__TextOrMarkup__Group_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:796:1: ( rule__TextOrMarkup__Group_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:797:1: ( rule__TextOrMarkup__Group_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=20 && LA4_0<=24)||(LA4_0>=26 && LA4_0<=29)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:797:2: rule__TextOrMarkup__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1648);
                    	    rule__TextOrMarkup__Group_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Alternatives


    // $ANTLR start rule__Text__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:807:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:811:1: ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_WS:
                {
                alt6=2;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt6=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=4;
                }
                break;
            case 10:
                {
                alt6=5;
                }
                break;
            case 11:
                {
                alt6=6;
                }
                break;
            case 12:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("807:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:813:1: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Text__Alternatives1684); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:818:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:818:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:819:1: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Text__Alternatives1701); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:824:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:824:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:825:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1718); 
                     after(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:831:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives1735); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:837:1: '\\\\['
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
                    match(input,10,FOLLOW_10_in_rule__Text__Alternatives1753); 
                     after(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:844:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:844:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:845:1: '\\\\]'
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
                    match(input,11,FOLLOW_11_in_rule__Text__Alternatives1773); 
                     after(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:852:6: ( ':' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:852:6: ( ':' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:853:1: ':'
                    {
                     before(grammarAccess.getTextAccess().getColonKeyword_6()); 
                    match(input,12,FOLLOW_12_in_rule__Text__Alternatives1793); 
                     after(grammarAccess.getTextAccess().getColonKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Alternatives


    // $ANTLR start rule__MarkUp__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:865:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );
    public final void rule__MarkUp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:869:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 26:
                {
                alt7=7;
                }
                break;
            case 27:
                {
                alt7=8;
                }
                break;
            case 28:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("865:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:870:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:870:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:871:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives1827);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:876:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:876:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:877:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives1844);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:882:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:882:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:883:1: ruleRef
                    {
                     before(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkUp__Alternatives1861);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:888:6: ( ruleOrderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:888:6: ( ruleOrderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:889:1: ruleOrderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives1878);
                    ruleOrderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:894:6: ( ruleUnorderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:894:6: ( ruleUnorderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:895:1: ruleUnorderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives1895);
                    ruleUnorderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:900:6: ( ruleCodeBlock )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:900:6: ( ruleCodeBlock )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:901:1: ruleCodeBlock
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives1912);
                    ruleCodeBlock();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:906:6: ( ruleCodeRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:906:6: ( ruleCodeRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:907:1: ruleCodeRef
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives1929);
                    ruleCodeRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:6: ( ruleLink )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:6: ( ruleLink )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:913:1: ruleLink
                    {
                     before(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__MarkUp__Alternatives1946);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:918:6: ( ruleImageRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:918:6: ( ruleImageRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:919:1: ruleImageRef
                    {
                     before(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives1963);
                    ruleImageRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkUp__Alternatives


    // $ANTLR start rule__CodeBlock__Alternatives_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:929:1: rule__CodeBlock__Alternatives_4 : ( ( ( rule__CodeBlock__Group_4_0__0 ) ) | ( ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* ) ) );
    public final void rule__CodeBlock__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:933:1: ( ( ( rule__CodeBlock__Group_4_0__0 ) ) | ( ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_MULTI_NL)||(LA9_0>=10 && LA9_0<=12)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=20 && LA9_0<=22)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("929:1: rule__CodeBlock__Alternatives_4 : ( ( ( rule__CodeBlock__Group_4_0__0 ) ) | ( ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:934:1: ( ( rule__CodeBlock__Group_4_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:934:1: ( ( rule__CodeBlock__Group_4_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:935:1: ( rule__CodeBlock__Group_4_0__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_4_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:936:1: ( rule__CodeBlock__Group_4_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:936:2: rule__CodeBlock__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_4_0__0_in_rule__CodeBlock__Alternatives_41995);
                    rule__CodeBlock__Group_4_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:940:6: ( ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:940:6: ( ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:941:1: ( ( rule__CodeBlock__Group_4_1__0 ) ) ( ( rule__CodeBlock__Group_4_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:941:1: ( ( rule__CodeBlock__Group_4_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:942:1: ( rule__CodeBlock__Group_4_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_4_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:943:1: ( rule__CodeBlock__Group_4_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:943:2: rule__CodeBlock__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_4_1__0_in_rule__CodeBlock__Alternatives_42015);
                    rule__CodeBlock__Group_4_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_4_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:946:1: ( ( rule__CodeBlock__Group_4_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:947:1: ( rule__CodeBlock__Group_4_1__0 )*
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_4_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:948:1: ( rule__CodeBlock__Group_4_1__0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=20 && LA8_0<=22)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:948:2: rule__CodeBlock__Group_4_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__CodeBlock__Group_4_1__0_in_rule__CodeBlock__Alternatives_42027);
                    	    rule__CodeBlock__Group_4_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getCodeBlockAccess().getGroup_4_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Alternatives_4


    // $ANTLR start rule__MarkupInCode__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:958:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );
    public final void rule__MarkupInCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:962:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("958:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:963:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:963:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:964:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2063);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:969:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:969:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:970:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2080);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:975:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:975:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:976:1: ruleRef
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2097);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupInCode__Alternatives


    // $ANTLR start rule__CodeText__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:986:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );
    public final void rule__CodeText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:990:1: ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_MULTI_NL:
                {
                alt11=2;
                }
                break;
            case RULE_WS:
                {
                alt11=3;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt11=4;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt11=5;
                }
                break;
            case 10:
                {
                alt11=6;
                }
                break;
            case 11:
                {
                alt11=7;
                }
                break;
            case 12:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("986:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:991:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:991:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:992:1: RULE_ID
                    {
                     before(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2129); 
                     after(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:997:6: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:997:6: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:998:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2146); 
                     after(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1003:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1003:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1004:1: RULE_WS
                    {
                     before(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2163); 
                     after(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1009:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1009:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1010:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2180); 
                     after(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1015:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1015:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1016:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2197); 
                     after(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1021:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1021:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1022:1: '\\\\['
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
                    match(input,10,FOLLOW_10_in_rule__CodeText__Alternatives2215); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1029:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1029:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:1: '\\\\]'
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
                    match(input,11,FOLLOW_11_in_rule__CodeText__Alternatives2235); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1037:6: ( ':' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1037:6: ( ':' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1038:1: ':'
                    {
                     before(grammarAccess.getCodeTextAccess().getColonKeyword_7()); 
                    match(input,12,FOLLOW_12_in_rule__CodeText__Alternatives2255); 
                     after(grammarAccess.getCodeTextAccess().getColonKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeText__Alternatives


    // $ANTLR start rule__ANY_WS__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1050:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );
    public final void rule__ANY_WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1054:1: ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt12=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt12=2;
                }
                break;
            case RULE_WS:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1050:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1055:1: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1055:1: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1056:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2289); 
                     after(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1061:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1061:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1062:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2306); 
                     after(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1067:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1067:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1068:1: RULE_WS
                    {
                     before(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2323); 
                     after(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ANY_WS__Alternatives


    // $ANTLR start rule__Document__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1080:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1084:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1085:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02353);
            rule__Document__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02356);
            rule__Document__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__0


    // $ANTLR start rule__Document__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1092:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1096:1: ( ( () ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1097:1: ( () )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1097:1: ( () )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1098:1: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ()
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1101:1: 
            {
            }

             after(grammarAccess.getDocumentAccess().getDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__0__Impl


    // $ANTLR start rule__Document__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1111:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1115:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1116:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12414);
            rule__Document__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12417);
            rule__Document__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__1


    // $ANTLR start rule__Document__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1123:1: rule__Document__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1127:1: ( ( ( RULE_WS )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1128:1: ( ( RULE_WS )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1128:1: ( ( RULE_WS )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1129:1: ( RULE_WS )?
            {
             before(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1130:1: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1130:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2445); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__1__Impl


    // $ANTLR start rule__Document__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1140:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1144:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22476);
            rule__Document__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22479);
            rule__Document__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__2


    // $ANTLR start rule__Document__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1152:1: rule__Document__Group__2__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1156:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1158:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1159:1: ( RULE_MULTI_NL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_MULTI_NL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1159:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2507); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__2__Impl


    // $ANTLR start rule__Document__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1169:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1173:1: ( rule__Document__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1174:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32538);
            rule__Document__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__3


    // $ANTLR start rule__Document__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1180:1: rule__Document__Group__3__Impl : ( ( rule__Document__Group_3__0 )? ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1184:1: ( ( ( rule__Document__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1185:1: ( ( rule__Document__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1185:1: ( ( rule__Document__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1186:1: ( rule__Document__Group_3__0 )?
            {
             before(grammarAccess.getDocumentAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1187:1: ( rule__Document__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13||(LA15_0>=16 && LA15_0<=17)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1187:2: rule__Document__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2565);
                    rule__Document__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__3__Impl


    // $ANTLR start rule__Document__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1205:1: rule__Document__Group_3__0 : rule__Document__Group_3__0__Impl rule__Document__Group_3__1 ;
    public final void rule__Document__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1209:1: ( rule__Document__Group_3__0__Impl rule__Document__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1210:2: rule__Document__Group_3__0__Impl rule__Document__Group_3__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02604);
            rule__Document__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02607);
            rule__Document__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__0


    // $ANTLR start rule__Document__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1217:1: rule__Document__Group_3__0__Impl : ( ( rule__Document__Alternatives_3_0 ) ) ;
    public final void rule__Document__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1221:1: ( ( ( rule__Document__Alternatives_3_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1222:1: ( ( rule__Document__Alternatives_3_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1222:1: ( ( rule__Document__Alternatives_3_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1223:1: ( rule__Document__Alternatives_3_0 )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1224:1: ( rule__Document__Alternatives_3_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1224:2: rule__Document__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2634);
            rule__Document__Alternatives_3_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__0__Impl


    // $ANTLR start rule__Document__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1234:1: rule__Document__Group_3__1 : rule__Document__Group_3__1__Impl ;
    public final void rule__Document__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1238:1: ( rule__Document__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1239:2: rule__Document__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12664);
            rule__Document__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__1


    // $ANTLR start rule__Document__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1245:1: rule__Document__Group_3__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1249:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1250:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1250:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1251:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1252:1: ( RULE_MULTI_NL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_MULTI_NL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1252:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2692); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__1__Impl


    // $ANTLR start rule__Document__Group_3_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1266:1: rule__Document__Group_3_0_0__0 : rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 ;
    public final void rule__Document__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1270:1: ( rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1271:2: rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__02727);
            rule__Document__Group_3_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__02730);
            rule__Document__Group_3_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__0


    // $ANTLR start rule__Document__Group_3_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1278:1: rule__Document__Group_3_0_0__0__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) ;
    public final void rule__Document__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1282:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1283:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1283:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1284:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1285:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1285:2: rule__Document__ChaptersAssignment_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl2757);
            rule__Document__ChaptersAssignment_3_0_0_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__0__Impl


    // $ANTLR start rule__Document__Group_3_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1295:1: rule__Document__Group_3_0_0__1 : rule__Document__Group_3_0_0__1__Impl ;
    public final void rule__Document__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1299:1: ( rule__Document__Group_3_0_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1300:2: rule__Document__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__12787);
            rule__Document__Group_3_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__1


    // $ANTLR start rule__Document__Group_3_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1306:1: rule__Document__Group_3_0_0__1__Impl : ( ( rule__Document__Group_3_0_0_1__0 )* ) ;
    public final void rule__Document__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1310:1: ( ( ( rule__Document__Group_3_0_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1311:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1311:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1312:1: ( rule__Document__Group_3_0_0_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1313:1: ( rule__Document__Group_3_0_0_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_MULTI_NL) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==13) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1313:2: rule__Document__Group_3_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl2814);
            	    rule__Document__Group_3_0_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__1__Impl


    // $ANTLR start rule__Document__Group_3_0_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1327:1: rule__Document__Group_3_0_0_1__0 : rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 ;
    public final void rule__Document__Group_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1331:1: ( rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1332:2: rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__02849);
            rule__Document__Group_3_0_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__02852);
            rule__Document__Group_3_0_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__0


    // $ANTLR start rule__Document__Group_3_0_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1339:1: rule__Document__Group_3_0_0_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1343:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1344:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1344:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1345:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl2879); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1356:1: rule__Document__Group_3_0_0_1__1 : rule__Document__Group_3_0_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1360:1: ( rule__Document__Group_3_0_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1361:2: rule__Document__Group_3_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__12908);
            rule__Document__Group_3_0_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__1


    // $ANTLR start rule__Document__Group_3_0_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1367:1: rule__Document__Group_3_0_0_1__1__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) ;
    public final void rule__Document__Group_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1371:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1372:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1372:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1373:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1374:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1374:2: rule__Document__ChaptersAssignment_3_0_0_1_1
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl2935);
            rule__Document__ChaptersAssignment_3_0_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1388:1: rule__Document__Group_3_0_1__0 : rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 ;
    public final void rule__Document__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1392:1: ( rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1393:2: rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__02969);
            rule__Document__Group_3_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__02972);
            rule__Document__Group_3_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__0


    // $ANTLR start rule__Document__Group_3_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1400:1: rule__Document__Group_3_0_1__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) ;
    public final void rule__Document__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1404:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1405:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1405:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1406:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1407:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1407:2: rule__Document__SectionsAssignment_3_0_1_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl2999);
            rule__Document__SectionsAssignment_3_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1417:1: rule__Document__Group_3_0_1__1 : rule__Document__Group_3_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1421:1: ( rule__Document__Group_3_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1422:2: rule__Document__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13029);
            rule__Document__Group_3_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__1


    // $ANTLR start rule__Document__Group_3_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1428:1: rule__Document__Group_3_0_1__1__Impl : ( ( rule__Document__Group_3_0_1_1__0 )* ) ;
    public final void rule__Document__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1432:1: ( ( ( rule__Document__Group_3_0_1_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1433:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1433:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1434:1: ( rule__Document__Group_3_0_1_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1435:1: ( rule__Document__Group_3_0_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_MULTI_NL) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==16) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1435:2: rule__Document__Group_3_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3056);
            	    rule__Document__Group_3_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_1_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1449:1: rule__Document__Group_3_0_1_1__0 : rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 ;
    public final void rule__Document__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1453:1: ( rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1454:2: rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03091);
            rule__Document__Group_3_0_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03094);
            rule__Document__Group_3_0_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__0


    // $ANTLR start rule__Document__Group_3_0_1_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1461:1: rule__Document__Group_3_0_1_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1465:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1466:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1466:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1467:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3121); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_1_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1478:1: rule__Document__Group_3_0_1_1__1 : rule__Document__Group_3_0_1_1__1__Impl ;
    public final void rule__Document__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1482:1: ( rule__Document__Group_3_0_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1483:2: rule__Document__Group_3_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13150);
            rule__Document__Group_3_0_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__1


    // $ANTLR start rule__Document__Group_3_0_1_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1489:1: rule__Document__Group_3_0_1_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) ;
    public final void rule__Document__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1493:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1494:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1494:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1495:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1496:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1496:2: rule__Document__SectionsAssignment_3_0_1_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3177);
            rule__Document__SectionsAssignment_3_0_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_2__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1510:1: rule__Document__Group_3_0_2__0 : rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 ;
    public final void rule__Document__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1514:1: ( rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1515:2: rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03211);
            rule__Document__Group_3_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03214);
            rule__Document__Group_3_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__0


    // $ANTLR start rule__Document__Group_3_0_2__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1522:1: rule__Document__Group_3_0_2__0__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) ;
    public final void rule__Document__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1526:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1527:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1527:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1528:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1529:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1529:2: rule__Document__SubsectionsAssignment_3_0_2_0
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3241);
            rule__Document__SubsectionsAssignment_3_0_2_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__0__Impl


    // $ANTLR start rule__Document__Group_3_0_2__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1539:1: rule__Document__Group_3_0_2__1 : rule__Document__Group_3_0_2__1__Impl ;
    public final void rule__Document__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1543:1: ( rule__Document__Group_3_0_2__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1544:2: rule__Document__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13271);
            rule__Document__Group_3_0_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__1


    // $ANTLR start rule__Document__Group_3_0_2__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1550:1: rule__Document__Group_3_0_2__1__Impl : ( ( rule__Document__Group_3_0_2_1__0 )* ) ;
    public final void rule__Document__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1554:1: ( ( ( rule__Document__Group_3_0_2_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1555:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1555:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1556:1: ( rule__Document__Group_3_0_2_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1557:1: ( rule__Document__Group_3_0_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MULTI_NL) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==17) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1557:2: rule__Document__Group_3_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3298);
            	    rule__Document__Group_3_0_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__1__Impl


    // $ANTLR start rule__Document__Group_3_0_2_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1571:1: rule__Document__Group_3_0_2_1__0 : rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 ;
    public final void rule__Document__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1575:1: ( rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1576:2: rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03333);
            rule__Document__Group_3_0_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03336);
            rule__Document__Group_3_0_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__0


    // $ANTLR start rule__Document__Group_3_0_2_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1583:1: rule__Document__Group_3_0_2_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1587:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1588:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1588:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1589:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3363); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_2_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1600:1: rule__Document__Group_3_0_2_1__1 : rule__Document__Group_3_0_2_1__1__Impl ;
    public final void rule__Document__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1604:1: ( rule__Document__Group_3_0_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1605:2: rule__Document__Group_3_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13392);
            rule__Document__Group_3_0_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__1


    // $ANTLR start rule__Document__Group_3_0_2_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1611:1: rule__Document__Group_3_0_2_1__1__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Document__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1615:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1616:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1616:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1617:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1618:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1618:2: rule__Document__SubsectionsAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3419);
            rule__Document__SubsectionsAssignment_3_0_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__1__Impl


    // $ANTLR start rule__Chapter__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1632:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1636:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1637:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03453);
            rule__Chapter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03456);
            rule__Chapter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__0


    // $ANTLR start rule__Chapter__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1644:1: rule__Chapter__Group__0__Impl : ( '\\\\chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1648:1: ( ( '\\\\chapter' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1649:1: ( '\\\\chapter' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1649:1: ( '\\\\chapter' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1650:1: '\\\\chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Chapter__Group__0__Impl3484); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__0__Impl


    // $ANTLR start rule__Chapter__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1663:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1667:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1668:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13515);
            rule__Chapter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13518);
            rule__Chapter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__1


    // $ANTLR start rule__Chapter__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1675:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__Group_1__0 )? ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1679:1: ( ( ( rule__Chapter__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1680:1: ( ( rule__Chapter__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1680:1: ( ( rule__Chapter__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1681:1: ( rule__Chapter__Group_1__0 )?
            {
             before(grammarAccess.getChapterAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1682:1: ( rule__Chapter__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1682:2: rule__Chapter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_1__0_in_rule__Chapter__Group__1__Impl3545);
                    rule__Chapter__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__1__Impl


    // $ANTLR start rule__Chapter__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1692:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1696:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1697:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23576);
            rule__Chapter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23579);
            rule__Chapter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__2


    // $ANTLR start rule__Chapter__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1704:1: rule__Chapter__Group__2__Impl : ( '[' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1708:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1709:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1709:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1710:1: '['
            {
             before(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Chapter__Group__2__Impl3607); 
             after(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__2__Impl


    // $ANTLR start rule__Chapter__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1723:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1727:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1728:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33638);
            rule__Chapter__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33641);
            rule__Chapter__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__3


    // $ANTLR start rule__Chapter__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1735:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__TitleAssignment_3 ) ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1739:1: ( ( ( rule__Chapter__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1740:1: ( ( rule__Chapter__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1740:1: ( ( rule__Chapter__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1741:1: ( rule__Chapter__TitleAssignment_3 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1742:1: ( rule__Chapter__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1742:2: rule__Chapter__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Chapter__TitleAssignment_3_in_rule__Chapter__Group__3__Impl3668);
            rule__Chapter__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__3__Impl


    // $ANTLR start rule__Chapter__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1752:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1756:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1757:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43698);
            rule__Chapter__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__5_in_rule__Chapter__Group__43701);
            rule__Chapter__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__4


    // $ANTLR start rule__Chapter__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1764:1: rule__Chapter__Group__4__Impl : ( ']' ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1768:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1769:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1769:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1770:1: ']'
            {
             before(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Chapter__Group__4__Impl3729); 
             after(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__4__Impl


    // $ANTLR start rule__Chapter__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1783:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1787:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1788:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_rule__Chapter__Group__5__Impl_in_rule__Chapter__Group__53760);
            rule__Chapter__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__6_in_rule__Chapter__Group__53763);
            rule__Chapter__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__5


    // $ANTLR start rule__Chapter__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1795:1: rule__Chapter__Group__5__Impl : ( ( rule__Chapter__Group_5__0 )* ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1799:1: ( ( ( rule__Chapter__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1800:1: ( ( rule__Chapter__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1800:1: ( ( rule__Chapter__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1801:1: ( rule__Chapter__Group_5__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1802:1: ( rule__Chapter__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTI_NL) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=RULE_ID && LA21_1<=RULE_ANY_OTHER)||(LA21_1>=10 && LA21_1<=12)||(LA21_1>=20 && LA21_1<=24)||(LA21_1>=26 && LA21_1<=29)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1802:2: rule__Chapter__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_5__0_in_rule__Chapter__Group__5__Impl3790);
            	    rule__Chapter__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__5__Impl


    // $ANTLR start rule__Chapter__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1812:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1816:1: ( rule__Chapter__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1817:2: rule__Chapter__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group__6__Impl_in_rule__Chapter__Group__63821);
            rule__Chapter__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__6


    // $ANTLR start rule__Chapter__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1823:1: rule__Chapter__Group__6__Impl : ( ( rule__Chapter__Group_6__0 )* ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1827:1: ( ( ( rule__Chapter__Group_6__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1828:1: ( ( rule__Chapter__Group_6__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1828:1: ( ( rule__Chapter__Group_6__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1829:1: ( rule__Chapter__Group_6__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1830:1: ( rule__Chapter__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MULTI_NL) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==16) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1830:2: rule__Chapter__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_6__0_in_rule__Chapter__Group__6__Impl3848);
            	    rule__Chapter__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__6__Impl


    // $ANTLR start rule__Chapter__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1854:1: rule__Chapter__Group_1__0 : rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1 ;
    public final void rule__Chapter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1858:1: ( rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1859:2: rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_1__0__Impl_in_rule__Chapter__Group_1__03893);
            rule__Chapter__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_1__1_in_rule__Chapter__Group_1__03896);
            rule__Chapter__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__0


    // $ANTLR start rule__Chapter__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1866:1: rule__Chapter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Chapter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1870:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1871:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1871:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1872:1: ':'
            {
             before(grammarAccess.getChapterAccess().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Chapter__Group_1__0__Impl3924); 
             after(grammarAccess.getChapterAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__0__Impl


    // $ANTLR start rule__Chapter__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1885:1: rule__Chapter__Group_1__1 : rule__Chapter__Group_1__1__Impl ;
    public final void rule__Chapter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1889:1: ( rule__Chapter__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1890:2: rule__Chapter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_1__1__Impl_in_rule__Chapter__Group_1__13955);
            rule__Chapter__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__1


    // $ANTLR start rule__Chapter__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1896:1: rule__Chapter__Group_1__1__Impl : ( ( rule__Chapter__NameAssignment_1_1 ) ) ;
    public final void rule__Chapter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1900:1: ( ( ( rule__Chapter__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1901:1: ( ( rule__Chapter__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1901:1: ( ( rule__Chapter__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1902:1: ( rule__Chapter__NameAssignment_1_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1903:1: ( rule__Chapter__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1903:2: rule__Chapter__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Chapter__NameAssignment_1_1_in_rule__Chapter__Group_1__1__Impl3982);
            rule__Chapter__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__1__Impl


    // $ANTLR start rule__Chapter__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1917:1: rule__Chapter__Group_5__0 : rule__Chapter__Group_5__0__Impl rule__Chapter__Group_5__1 ;
    public final void rule__Chapter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1921:1: ( rule__Chapter__Group_5__0__Impl rule__Chapter__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1922:2: rule__Chapter__Group_5__0__Impl rule__Chapter__Group_5__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_5__0__Impl_in_rule__Chapter__Group_5__04016);
            rule__Chapter__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_5__1_in_rule__Chapter__Group_5__04019);
            rule__Chapter__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_5__0


    // $ANTLR start rule__Chapter__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1929:1: rule__Chapter__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1933:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1934:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1934:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1935:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_5__0__Impl4046); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_5__0__Impl


    // $ANTLR start rule__Chapter__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1946:1: rule__Chapter__Group_5__1 : rule__Chapter__Group_5__1__Impl ;
    public final void rule__Chapter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1950:1: ( rule__Chapter__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1951:2: rule__Chapter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_5__1__Impl_in_rule__Chapter__Group_5__14075);
            rule__Chapter__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_5__1


    // $ANTLR start rule__Chapter__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1957:1: rule__Chapter__Group_5__1__Impl : ( ( rule__Chapter__ContentsAssignment_5_1 ) ) ;
    public final void rule__Chapter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1961:1: ( ( ( rule__Chapter__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1962:1: ( ( rule__Chapter__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1962:1: ( ( rule__Chapter__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1963:1: ( rule__Chapter__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:1: ( rule__Chapter__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:2: rule__Chapter__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_5_1_in_rule__Chapter__Group_5__1__Impl4102);
            rule__Chapter__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_5__1__Impl


    // $ANTLR start rule__Chapter__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1978:1: rule__Chapter__Group_6__0 : rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1 ;
    public final void rule__Chapter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1982:1: ( rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1983:2: rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6__0__Impl_in_rule__Chapter__Group_6__04136);
            rule__Chapter__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_6__1_in_rule__Chapter__Group_6__04139);
            rule__Chapter__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__0


    // $ANTLR start rule__Chapter__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1990:1: rule__Chapter__Group_6__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1994:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1995:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1995:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1996:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_6_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_6__0__Impl4166); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__0__Impl


    // $ANTLR start rule__Chapter__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2007:1: rule__Chapter__Group_6__1 : rule__Chapter__Group_6__1__Impl ;
    public final void rule__Chapter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2011:1: ( rule__Chapter__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2012:2: rule__Chapter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6__1__Impl_in_rule__Chapter__Group_6__14195);
            rule__Chapter__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__1


    // $ANTLR start rule__Chapter__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2018:1: rule__Chapter__Group_6__1__Impl : ( ( rule__Chapter__ContentsAssignment_6_1 ) ) ;
    public final void rule__Chapter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2022:1: ( ( ( rule__Chapter__ContentsAssignment_6_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2023:1: ( ( rule__Chapter__ContentsAssignment_6_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2023:1: ( ( rule__Chapter__ContentsAssignment_6_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2024:1: ( rule__Chapter__ContentsAssignment_6_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2025:1: ( rule__Chapter__ContentsAssignment_6_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2025:2: rule__Chapter__ContentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_6_1_in_rule__Chapter__Group_6__1__Impl4222);
            rule__Chapter__ContentsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__1__Impl


    // $ANTLR start rule__Section__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2039:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2043:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2044:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04256);
            rule__Section__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04259);
            rule__Section__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__0


    // $ANTLR start rule__Section__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2051:1: rule__Section__Group__0__Impl : ( '\\\\section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2055:1: ( ( '\\\\section' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2056:1: ( '\\\\section' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2056:1: ( '\\\\section' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2057:1: '\\\\section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Section__Group__0__Impl4287); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__0__Impl


    // $ANTLR start rule__Section__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2070:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2074:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2075:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14318);
            rule__Section__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14321);
            rule__Section__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__1


    // $ANTLR start rule__Section__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2082:1: rule__Section__Group__1__Impl : ( ( rule__Section__Group_1__0 )? ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2086:1: ( ( ( rule__Section__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2087:1: ( ( rule__Section__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2087:1: ( ( rule__Section__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2088:1: ( rule__Section__Group_1__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2089:1: ( rule__Section__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2089:2: rule__Section__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_1__0_in_rule__Section__Group__1__Impl4348);
                    rule__Section__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__1__Impl


    // $ANTLR start rule__Section__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2099:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2103:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2104:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24379);
            rule__Section__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24382);
            rule__Section__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__2


    // $ANTLR start rule__Section__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2111:1: rule__Section__Group__2__Impl : ( '[' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2115:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2116:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2116:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2117:1: '['
            {
             before(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Section__Group__2__Impl4410); 
             after(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__2__Impl


    // $ANTLR start rule__Section__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2130:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2134:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2135:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34441);
            rule__Section__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34444);
            rule__Section__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__3


    // $ANTLR start rule__Section__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2142:1: rule__Section__Group__3__Impl : ( ( rule__Section__TitleAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2146:1: ( ( ( rule__Section__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2147:1: ( ( rule__Section__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2147:1: ( ( rule__Section__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2148:1: ( rule__Section__TitleAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2149:1: ( rule__Section__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2149:2: rule__Section__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl4471);
            rule__Section__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__3__Impl


    // $ANTLR start rule__Section__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2159:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2163:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2164:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44501);
            rule__Section__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44504);
            rule__Section__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__4


    // $ANTLR start rule__Section__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2171:1: rule__Section__Group__4__Impl : ( ']' ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2175:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2176:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2176:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2177:1: ']'
            {
             before(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Section__Group__4__Impl4532); 
             after(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__4__Impl


    // $ANTLR start rule__Section__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2190:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2194:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2195:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54563);
            rule__Section__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54566);
            rule__Section__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__5


    // $ANTLR start rule__Section__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2202:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )* ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2206:1: ( ( ( rule__Section__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2207:1: ( ( rule__Section__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2207:1: ( ( rule__Section__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2208:1: ( rule__Section__Group_5__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2209:1: ( rule__Section__Group_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1>=RULE_ID && LA24_1<=RULE_ANY_OTHER)||(LA24_1>=10 && LA24_1<=12)||(LA24_1>=20 && LA24_1<=24)||(LA24_1>=26 && LA24_1<=29)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2209:2: rule__Section__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl4593);
            	    rule__Section__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__5__Impl


    // $ANTLR start rule__Section__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2219:1: rule__Section__Group__6 : rule__Section__Group__6__Impl ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2223:1: ( rule__Section__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2224:2: rule__Section__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64624);
            rule__Section__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__6


    // $ANTLR start rule__Section__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2230:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )* ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2234:1: ( ( ( rule__Section__Group_6__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2235:1: ( ( rule__Section__Group_6__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2235:1: ( ( rule__Section__Group_6__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2236:1: ( rule__Section__Group_6__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2237:1: ( rule__Section__Group_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==17) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2237:2: rule__Section__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl4651);
            	    rule__Section__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__6__Impl


    // $ANTLR start rule__Section__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2261:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2265:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2266:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section__Group_1__0__Impl_in_rule__Section__Group_1__04696);
            rule__Section__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_1__1_in_rule__Section__Group_1__04699);
            rule__Section__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__0


    // $ANTLR start rule__Section__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2273:1: rule__Section__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2277:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2278:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2278:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2279:1: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Section__Group_1__0__Impl4727); 
             after(grammarAccess.getSectionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__0__Impl


    // $ANTLR start rule__Section__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2292:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2296:1: ( rule__Section__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2297:2: rule__Section__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_1__1__Impl_in_rule__Section__Group_1__14758);
            rule__Section__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__1


    // $ANTLR start rule__Section__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2303:1: rule__Section__Group_1__1__Impl : ( ( rule__Section__NameAssignment_1_1 ) ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2307:1: ( ( ( rule__Section__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2308:1: ( ( rule__Section__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2308:1: ( ( rule__Section__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2309:1: ( rule__Section__NameAssignment_1_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2310:1: ( rule__Section__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2310:2: rule__Section__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_1_1_in_rule__Section__Group_1__1__Impl4785);
            rule__Section__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__1__Impl


    // $ANTLR start rule__Section__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2324:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2328:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2329:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__04819);
            rule__Section__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__04822);
            rule__Section__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_5__0


    // $ANTLR start rule__Section__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2336:1: rule__Section__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2340:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2341:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2341:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2342:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_5__0__Impl4849); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_5__0__Impl


    // $ANTLR start rule__Section__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2353:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2357:1: ( rule__Section__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2358:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__14878);
            rule__Section__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_5__1


    // $ANTLR start rule__Section__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2364:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__ContentsAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2368:1: ( ( ( rule__Section__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2369:1: ( ( rule__Section__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2369:1: ( ( rule__Section__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2370:1: ( rule__Section__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2371:1: ( rule__Section__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2371:2: rule__Section__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_5_1_in_rule__Section__Group_5__1__Impl4905);
            rule__Section__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_5__1__Impl


    // $ANTLR start rule__Section__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2385:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2389:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2390:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__04939);
            rule__Section__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__04942);
            rule__Section__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__0


    // $ANTLR start rule__Section__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2397:1: rule__Section__Group_6__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2401:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2402:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2402:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2403:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_6_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_6__0__Impl4969); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__0__Impl


    // $ANTLR start rule__Section__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2414:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2418:1: ( rule__Section__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2419:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__14998);
            rule__Section__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__1


    // $ANTLR start rule__Section__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2425:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__ContentsAssignment_6_1 ) ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2429:1: ( ( ( rule__Section__ContentsAssignment_6_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2430:1: ( ( rule__Section__ContentsAssignment_6_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2430:1: ( ( rule__Section__ContentsAssignment_6_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2431:1: ( rule__Section__ContentsAssignment_6_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2432:1: ( rule__Section__ContentsAssignment_6_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2432:2: rule__Section__ContentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_6_1_in_rule__Section__Group_6__1__Impl5025);
            rule__Section__ContentsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__1__Impl


    // $ANTLR start rule__SubSection__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2446:1: rule__SubSection__Group__0 : rule__SubSection__Group__0__Impl rule__SubSection__Group__1 ;
    public final void rule__SubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2450:1: ( rule__SubSection__Group__0__Impl rule__SubSection__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2451:2: rule__SubSection__Group__0__Impl rule__SubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05059);
            rule__SubSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05062);
            rule__SubSection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__0


    // $ANTLR start rule__SubSection__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2458:1: rule__SubSection__Group__0__Impl : ( '\\\\subsection' ) ;
    public final void rule__SubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2462:1: ( ( '\\\\subsection' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2463:1: ( '\\\\subsection' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2463:1: ( '\\\\subsection' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2464:1: '\\\\subsection'
            {
             before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SubSection__Group__0__Impl5090); 
             after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__0__Impl


    // $ANTLR start rule__SubSection__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2477:1: rule__SubSection__Group__1 : rule__SubSection__Group__1__Impl rule__SubSection__Group__2 ;
    public final void rule__SubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2481:1: ( rule__SubSection__Group__1__Impl rule__SubSection__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2482:2: rule__SubSection__Group__1__Impl rule__SubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15121);
            rule__SubSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15124);
            rule__SubSection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__1


    // $ANTLR start rule__SubSection__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2489:1: rule__SubSection__Group__1__Impl : ( ( rule__SubSection__Group_1__0 )? ) ;
    public final void rule__SubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2493:1: ( ( ( rule__SubSection__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2494:1: ( ( rule__SubSection__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2494:1: ( ( rule__SubSection__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2495:1: ( rule__SubSection__Group_1__0 )?
            {
             before(grammarAccess.getSubSectionAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2496:1: ( rule__SubSection__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2496:2: rule__SubSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubSection__Group_1__0_in_rule__SubSection__Group__1__Impl5151);
                    rule__SubSection__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__1__Impl


    // $ANTLR start rule__SubSection__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2506:1: rule__SubSection__Group__2 : rule__SubSection__Group__2__Impl rule__SubSection__Group__3 ;
    public final void rule__SubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2510:1: ( rule__SubSection__Group__2__Impl rule__SubSection__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2511:2: rule__SubSection__Group__2__Impl rule__SubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25182);
            rule__SubSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25185);
            rule__SubSection__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__2


    // $ANTLR start rule__SubSection__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2518:1: rule__SubSection__Group__2__Impl : ( '[' ) ;
    public final void rule__SubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2522:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2523:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2523:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2524:1: '['
            {
             before(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SubSection__Group__2__Impl5213); 
             after(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__2__Impl


    // $ANTLR start rule__SubSection__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2537:1: rule__SubSection__Group__3 : rule__SubSection__Group__3__Impl rule__SubSection__Group__4 ;
    public final void rule__SubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2541:1: ( rule__SubSection__Group__3__Impl rule__SubSection__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2542:2: rule__SubSection__Group__3__Impl rule__SubSection__Group__4
            {
            pushFollow(FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35244);
            rule__SubSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35247);
            rule__SubSection__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__3


    // $ANTLR start rule__SubSection__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2549:1: rule__SubSection__Group__3__Impl : ( ( rule__SubSection__TitleAssignment_3 ) ) ;
    public final void rule__SubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2553:1: ( ( ( rule__SubSection__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2554:1: ( ( rule__SubSection__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2554:1: ( ( rule__SubSection__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2555:1: ( rule__SubSection__TitleAssignment_3 )
            {
             before(grammarAccess.getSubSectionAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2556:1: ( rule__SubSection__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2556:2: rule__SubSection__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__SubSection__TitleAssignment_3_in_rule__SubSection__Group__3__Impl5274);
            rule__SubSection__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__3__Impl


    // $ANTLR start rule__SubSection__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2566:1: rule__SubSection__Group__4 : rule__SubSection__Group__4__Impl rule__SubSection__Group__5 ;
    public final void rule__SubSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2570:1: ( rule__SubSection__Group__4__Impl rule__SubSection__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2571:2: rule__SubSection__Group__4__Impl rule__SubSection__Group__5
            {
            pushFollow(FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45304);
            rule__SubSection__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__5_in_rule__SubSection__Group__45307);
            rule__SubSection__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__4


    // $ANTLR start rule__SubSection__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2578:1: rule__SubSection__Group__4__Impl : ( ']' ) ;
    public final void rule__SubSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2582:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2583:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2583:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2584:1: ']'
            {
             before(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__SubSection__Group__4__Impl5335); 
             after(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__4__Impl


    // $ANTLR start rule__SubSection__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2597:1: rule__SubSection__Group__5 : rule__SubSection__Group__5__Impl rule__SubSection__Group__6 ;
    public final void rule__SubSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2601:1: ( rule__SubSection__Group__5__Impl rule__SubSection__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2602:2: rule__SubSection__Group__5__Impl rule__SubSection__Group__6
            {
            pushFollow(FOLLOW_rule__SubSection__Group__5__Impl_in_rule__SubSection__Group__55366);
            rule__SubSection__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__6_in_rule__SubSection__Group__55369);
            rule__SubSection__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__5


    // $ANTLR start rule__SubSection__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2609:1: rule__SubSection__Group__5__Impl : ( ( rule__SubSection__Group_5__0 )* ) ;
    public final void rule__SubSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2613:1: ( ( ( rule__SubSection__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2614:1: ( ( rule__SubSection__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2614:1: ( ( rule__SubSection__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2615:1: ( rule__SubSection__Group_5__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2616:1: ( rule__SubSection__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_MULTI_NL) ) {
                    int LA27_1 = input.LA(2);

                    if ( ((LA27_1>=RULE_ID && LA27_1<=RULE_ANY_OTHER)||(LA27_1>=10 && LA27_1<=12)||(LA27_1>=20 && LA27_1<=24)||(LA27_1>=26 && LA27_1<=29)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2616:2: rule__SubSection__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_5__0_in_rule__SubSection__Group__5__Impl5396);
            	    rule__SubSection__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__5__Impl


    // $ANTLR start rule__SubSection__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2626:1: rule__SubSection__Group__6 : rule__SubSection__Group__6__Impl ;
    public final void rule__SubSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2630:1: ( rule__SubSection__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2631:2: rule__SubSection__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group__6__Impl_in_rule__SubSection__Group__65427);
            rule__SubSection__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__6


    // $ANTLR start rule__SubSection__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2637:1: rule__SubSection__Group__6__Impl : ( ( rule__SubSection__Group_6__0 )* ) ;
    public final void rule__SubSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2641:1: ( ( ( rule__SubSection__Group_6__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2642:1: ( ( rule__SubSection__Group_6__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2642:1: ( ( rule__SubSection__Group_6__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2643:1: ( rule__SubSection__Group_6__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2644:1: ( rule__SubSection__Group_6__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTI_NL) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==18) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2644:2: rule__SubSection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_6__0_in_rule__SubSection__Group__6__Impl5454);
            	    rule__SubSection__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__6__Impl


    // $ANTLR start rule__SubSection__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2668:1: rule__SubSection__Group_1__0 : rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1 ;
    public final void rule__SubSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2672:1: ( rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2673:2: rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_1__0__Impl_in_rule__SubSection__Group_1__05499);
            rule__SubSection__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_1__1_in_rule__SubSection__Group_1__05502);
            rule__SubSection__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__0


    // $ANTLR start rule__SubSection__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2680:1: rule__SubSection__Group_1__0__Impl : ( ':' ) ;
    public final void rule__SubSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2684:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2685:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2685:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2686:1: ':'
            {
             before(grammarAccess.getSubSectionAccess().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__SubSection__Group_1__0__Impl5530); 
             after(grammarAccess.getSubSectionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__0__Impl


    // $ANTLR start rule__SubSection__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2699:1: rule__SubSection__Group_1__1 : rule__SubSection__Group_1__1__Impl ;
    public final void rule__SubSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2703:1: ( rule__SubSection__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2704:2: rule__SubSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_1__1__Impl_in_rule__SubSection__Group_1__15561);
            rule__SubSection__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__1


    // $ANTLR start rule__SubSection__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2710:1: rule__SubSection__Group_1__1__Impl : ( ( rule__SubSection__NameAssignment_1_1 ) ) ;
    public final void rule__SubSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2714:1: ( ( ( rule__SubSection__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2715:1: ( ( rule__SubSection__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2715:1: ( ( rule__SubSection__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2716:1: ( rule__SubSection__NameAssignment_1_1 )
            {
             before(grammarAccess.getSubSectionAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2717:1: ( rule__SubSection__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2717:2: rule__SubSection__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubSection__NameAssignment_1_1_in_rule__SubSection__Group_1__1__Impl5588);
            rule__SubSection__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__1__Impl


    // $ANTLR start rule__SubSection__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2731:1: rule__SubSection__Group_5__0 : rule__SubSection__Group_5__0__Impl rule__SubSection__Group_5__1 ;
    public final void rule__SubSection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2735:1: ( rule__SubSection__Group_5__0__Impl rule__SubSection__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2736:2: rule__SubSection__Group_5__0__Impl rule__SubSection__Group_5__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_5__0__Impl_in_rule__SubSection__Group_5__05622);
            rule__SubSection__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_5__1_in_rule__SubSection__Group_5__05625);
            rule__SubSection__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_5__0


    // $ANTLR start rule__SubSection__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2743:1: rule__SubSection__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2747:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2748:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2748:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2749:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_5__0__Impl5652); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_5__0__Impl


    // $ANTLR start rule__SubSection__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2760:1: rule__SubSection__Group_5__1 : rule__SubSection__Group_5__1__Impl ;
    public final void rule__SubSection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2764:1: ( rule__SubSection__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2765:2: rule__SubSection__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_5__1__Impl_in_rule__SubSection__Group_5__15681);
            rule__SubSection__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_5__1


    // $ANTLR start rule__SubSection__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2771:1: rule__SubSection__Group_5__1__Impl : ( ( rule__SubSection__ContentsAssignment_5_1 ) ) ;
    public final void rule__SubSection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2775:1: ( ( ( rule__SubSection__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2776:1: ( ( rule__SubSection__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2776:1: ( ( rule__SubSection__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2777:1: ( rule__SubSection__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2778:1: ( rule__SubSection__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2778:2: rule__SubSection__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_5_1_in_rule__SubSection__Group_5__1__Impl5708);
            rule__SubSection__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_5__1__Impl


    // $ANTLR start rule__SubSection__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2792:1: rule__SubSection__Group_6__0 : rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1 ;
    public final void rule__SubSection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2796:1: ( rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2797:2: rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6__0__Impl_in_rule__SubSection__Group_6__05742);
            rule__SubSection__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_6__1_in_rule__SubSection__Group_6__05745);
            rule__SubSection__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__0


    // $ANTLR start rule__SubSection__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2804:1: rule__SubSection__Group_6__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2808:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2809:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2809:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2810:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_6_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_6__0__Impl5772); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__0__Impl


    // $ANTLR start rule__SubSection__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2821:1: rule__SubSection__Group_6__1 : rule__SubSection__Group_6__1__Impl ;
    public final void rule__SubSection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2825:1: ( rule__SubSection__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2826:2: rule__SubSection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6__1__Impl_in_rule__SubSection__Group_6__15801);
            rule__SubSection__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__1


    // $ANTLR start rule__SubSection__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2832:1: rule__SubSection__Group_6__1__Impl : ( ( rule__SubSection__ContentsAssignment_6_1 ) ) ;
    public final void rule__SubSection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2836:1: ( ( ( rule__SubSection__ContentsAssignment_6_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2837:1: ( ( rule__SubSection__ContentsAssignment_6_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2837:1: ( ( rule__SubSection__ContentsAssignment_6_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2838:1: ( rule__SubSection__ContentsAssignment_6_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2839:1: ( rule__SubSection__ContentsAssignment_6_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2839:2: rule__SubSection__ContentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_6_1_in_rule__SubSection__Group_6__1__Impl5828);
            rule__SubSection__ContentsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__1__Impl


    // $ANTLR start rule__Section3__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2853:1: rule__Section3__Group__0 : rule__Section3__Group__0__Impl rule__Section3__Group__1 ;
    public final void rule__Section3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2857:1: ( rule__Section3__Group__0__Impl rule__Section3__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2858:2: rule__Section3__Group__0__Impl rule__Section3__Group__1
            {
            pushFollow(FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05862);
            rule__Section3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05865);
            rule__Section3__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__0


    // $ANTLR start rule__Section3__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2865:1: rule__Section3__Group__0__Impl : ( '\\\\section3' ) ;
    public final void rule__Section3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2869:1: ( ( '\\\\section3' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2870:1: ( '\\\\section3' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2870:1: ( '\\\\section3' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2871:1: '\\\\section3'
            {
             before(grammarAccess.getSection3Access().getSection3Keyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Section3__Group__0__Impl5893); 
             after(grammarAccess.getSection3Access().getSection3Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__0__Impl


    // $ANTLR start rule__Section3__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2884:1: rule__Section3__Group__1 : rule__Section3__Group__1__Impl rule__Section3__Group__2 ;
    public final void rule__Section3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2888:1: ( rule__Section3__Group__1__Impl rule__Section3__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2889:2: rule__Section3__Group__1__Impl rule__Section3__Group__2
            {
            pushFollow(FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__15924);
            rule__Section3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__15927);
            rule__Section3__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__1


    // $ANTLR start rule__Section3__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2896:1: rule__Section3__Group__1__Impl : ( ( rule__Section3__Group_1__0 )? ) ;
    public final void rule__Section3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2900:1: ( ( ( rule__Section3__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2901:1: ( ( rule__Section3__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2901:1: ( ( rule__Section3__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2902:1: ( rule__Section3__Group_1__0 )?
            {
             before(grammarAccess.getSection3Access().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2903:1: ( rule__Section3__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==12) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2903:2: rule__Section3__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_1__0_in_rule__Section3__Group__1__Impl5954);
                    rule__Section3__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection3Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__1__Impl


    // $ANTLR start rule__Section3__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2913:1: rule__Section3__Group__2 : rule__Section3__Group__2__Impl rule__Section3__Group__3 ;
    public final void rule__Section3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2917:1: ( rule__Section3__Group__2__Impl rule__Section3__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2918:2: rule__Section3__Group__2__Impl rule__Section3__Group__3
            {
            pushFollow(FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__25985);
            rule__Section3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__25988);
            rule__Section3__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__2


    // $ANTLR start rule__Section3__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2925:1: rule__Section3__Group__2__Impl : ( '[' ) ;
    public final void rule__Section3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2929:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2930:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2930:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2931:1: '['
            {
             before(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Section3__Group__2__Impl6016); 
             after(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__2__Impl


    // $ANTLR start rule__Section3__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2944:1: rule__Section3__Group__3 : rule__Section3__Group__3__Impl rule__Section3__Group__4 ;
    public final void rule__Section3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2948:1: ( rule__Section3__Group__3__Impl rule__Section3__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2949:2: rule__Section3__Group__3__Impl rule__Section3__Group__4
            {
            pushFollow(FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36047);
            rule__Section3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36050);
            rule__Section3__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__3


    // $ANTLR start rule__Section3__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2956:1: rule__Section3__Group__3__Impl : ( ( rule__Section3__TitleAssignment_3 ) ) ;
    public final void rule__Section3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2960:1: ( ( ( rule__Section3__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2961:1: ( ( rule__Section3__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2961:1: ( ( rule__Section3__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2962:1: ( rule__Section3__TitleAssignment_3 )
            {
             before(grammarAccess.getSection3Access().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2963:1: ( rule__Section3__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2963:2: rule__Section3__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section3__TitleAssignment_3_in_rule__Section3__Group__3__Impl6077);
            rule__Section3__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__3__Impl


    // $ANTLR start rule__Section3__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2973:1: rule__Section3__Group__4 : rule__Section3__Group__4__Impl rule__Section3__Group__5 ;
    public final void rule__Section3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2977:1: ( rule__Section3__Group__4__Impl rule__Section3__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2978:2: rule__Section3__Group__4__Impl rule__Section3__Group__5
            {
            pushFollow(FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46107);
            rule__Section3__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__5_in_rule__Section3__Group__46110);
            rule__Section3__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__4


    // $ANTLR start rule__Section3__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2985:1: rule__Section3__Group__4__Impl : ( ']' ) ;
    public final void rule__Section3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2989:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2990:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2990:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2991:1: ']'
            {
             before(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Section3__Group__4__Impl6138); 
             after(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__4__Impl


    // $ANTLR start rule__Section3__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3004:1: rule__Section3__Group__5 : rule__Section3__Group__5__Impl rule__Section3__Group__6 ;
    public final void rule__Section3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3008:1: ( rule__Section3__Group__5__Impl rule__Section3__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3009:2: rule__Section3__Group__5__Impl rule__Section3__Group__6
            {
            pushFollow(FOLLOW_rule__Section3__Group__5__Impl_in_rule__Section3__Group__56169);
            rule__Section3__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__6_in_rule__Section3__Group__56172);
            rule__Section3__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__5


    // $ANTLR start rule__Section3__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3016:1: rule__Section3__Group__5__Impl : ( ( rule__Section3__Group_5__0 )* ) ;
    public final void rule__Section3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3020:1: ( ( ( rule__Section3__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3021:1: ( ( rule__Section3__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3021:1: ( ( rule__Section3__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3022:1: ( rule__Section3__Group_5__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3023:1: ( rule__Section3__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_ANY_OTHER)||(LA30_1>=10 && LA30_1<=12)||(LA30_1>=20 && LA30_1<=24)||(LA30_1>=26 && LA30_1<=29)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3023:2: rule__Section3__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_5__0_in_rule__Section3__Group__5__Impl6199);
            	    rule__Section3__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__5__Impl


    // $ANTLR start rule__Section3__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3033:1: rule__Section3__Group__6 : rule__Section3__Group__6__Impl ;
    public final void rule__Section3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3037:1: ( rule__Section3__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3038:2: rule__Section3__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group__6__Impl_in_rule__Section3__Group__66230);
            rule__Section3__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__6


    // $ANTLR start rule__Section3__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3044:1: rule__Section3__Group__6__Impl : ( ( rule__Section3__Group_6__0 )* ) ;
    public final void rule__Section3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3048:1: ( ( ( rule__Section3__Group_6__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3049:1: ( ( rule__Section3__Group_6__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3049:1: ( ( rule__Section3__Group_6__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3050:1: ( rule__Section3__Group_6__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3051:1: ( rule__Section3__Group_6__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==19) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3051:2: rule__Section3__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_6__0_in_rule__Section3__Group__6__Impl6257);
            	    rule__Section3__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__6__Impl


    // $ANTLR start rule__Section3__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3075:1: rule__Section3__Group_1__0 : rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1 ;
    public final void rule__Section3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3079:1: ( rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3080:2: rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_1__0__Impl_in_rule__Section3__Group_1__06302);
            rule__Section3__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_1__1_in_rule__Section3__Group_1__06305);
            rule__Section3__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__0


    // $ANTLR start rule__Section3__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3087:1: rule__Section3__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3091:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3092:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3092:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3093:1: ':'
            {
             before(grammarAccess.getSection3Access().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Section3__Group_1__0__Impl6333); 
             after(grammarAccess.getSection3Access().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__0__Impl


    // $ANTLR start rule__Section3__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3106:1: rule__Section3__Group_1__1 : rule__Section3__Group_1__1__Impl ;
    public final void rule__Section3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3110:1: ( rule__Section3__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3111:2: rule__Section3__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_1__1__Impl_in_rule__Section3__Group_1__16364);
            rule__Section3__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__1


    // $ANTLR start rule__Section3__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3117:1: rule__Section3__Group_1__1__Impl : ( ( rule__Section3__NameAssignment_1_1 ) ) ;
    public final void rule__Section3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3121:1: ( ( ( rule__Section3__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3122:1: ( ( rule__Section3__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3122:1: ( ( rule__Section3__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3123:1: ( rule__Section3__NameAssignment_1_1 )
            {
             before(grammarAccess.getSection3Access().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3124:1: ( rule__Section3__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3124:2: rule__Section3__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section3__NameAssignment_1_1_in_rule__Section3__Group_1__1__Impl6391);
            rule__Section3__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__1__Impl


    // $ANTLR start rule__Section3__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3138:1: rule__Section3__Group_5__0 : rule__Section3__Group_5__0__Impl rule__Section3__Group_5__1 ;
    public final void rule__Section3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3142:1: ( rule__Section3__Group_5__0__Impl rule__Section3__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3143:2: rule__Section3__Group_5__0__Impl rule__Section3__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_5__0__Impl_in_rule__Section3__Group_5__06425);
            rule__Section3__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_5__1_in_rule__Section3__Group_5__06428);
            rule__Section3__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_5__0


    // $ANTLR start rule__Section3__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3150:1: rule__Section3__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3154:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3155:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3155:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3156:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_5__0__Impl6455); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_5__0__Impl


    // $ANTLR start rule__Section3__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3167:1: rule__Section3__Group_5__1 : rule__Section3__Group_5__1__Impl ;
    public final void rule__Section3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3171:1: ( rule__Section3__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3172:2: rule__Section3__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_5__1__Impl_in_rule__Section3__Group_5__16484);
            rule__Section3__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_5__1


    // $ANTLR start rule__Section3__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3178:1: rule__Section3__Group_5__1__Impl : ( ( rule__Section3__ContentsAssignment_5_1 ) ) ;
    public final void rule__Section3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3182:1: ( ( ( rule__Section3__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3183:1: ( ( rule__Section3__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3183:1: ( ( rule__Section3__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3184:1: ( rule__Section3__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3185:1: ( rule__Section3__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3185:2: rule__Section3__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_5_1_in_rule__Section3__Group_5__1__Impl6511);
            rule__Section3__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_5__1__Impl


    // $ANTLR start rule__Section3__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3199:1: rule__Section3__Group_6__0 : rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1 ;
    public final void rule__Section3__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3203:1: ( rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3204:2: rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_6__0__Impl_in_rule__Section3__Group_6__06545);
            rule__Section3__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_6__1_in_rule__Section3__Group_6__06548);
            rule__Section3__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__0


    // $ANTLR start rule__Section3__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3211:1: rule__Section3__Group_6__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3215:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3216:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3216:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3217:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_6_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_6__0__Impl6575); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__0__Impl


    // $ANTLR start rule__Section3__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3228:1: rule__Section3__Group_6__1 : rule__Section3__Group_6__1__Impl ;
    public final void rule__Section3__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3232:1: ( rule__Section3__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3233:2: rule__Section3__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_6__1__Impl_in_rule__Section3__Group_6__16604);
            rule__Section3__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__1


    // $ANTLR start rule__Section3__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3239:1: rule__Section3__Group_6__1__Impl : ( ( rule__Section3__ContentsAssignment_6_1 ) ) ;
    public final void rule__Section3__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3243:1: ( ( ( rule__Section3__ContentsAssignment_6_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3244:1: ( ( rule__Section3__ContentsAssignment_6_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3244:1: ( ( rule__Section3__ContentsAssignment_6_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3245:1: ( rule__Section3__ContentsAssignment_6_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3246:1: ( rule__Section3__ContentsAssignment_6_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3246:2: rule__Section3__ContentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_6_1_in_rule__Section3__Group_6__1__Impl6631);
            rule__Section3__ContentsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__1__Impl


    // $ANTLR start rule__Section4__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3260:1: rule__Section4__Group__0 : rule__Section4__Group__0__Impl rule__Section4__Group__1 ;
    public final void rule__Section4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3264:1: ( rule__Section4__Group__0__Impl rule__Section4__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3265:2: rule__Section4__Group__0__Impl rule__Section4__Group__1
            {
            pushFollow(FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06665);
            rule__Section4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06668);
            rule__Section4__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__0


    // $ANTLR start rule__Section4__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3272:1: rule__Section4__Group__0__Impl : ( '\\\\section4' ) ;
    public final void rule__Section4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3276:1: ( ( '\\\\section4' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3277:1: ( '\\\\section4' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3277:1: ( '\\\\section4' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3278:1: '\\\\section4'
            {
             before(grammarAccess.getSection4Access().getSection4Keyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Section4__Group__0__Impl6696); 
             after(grammarAccess.getSection4Access().getSection4Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__0__Impl


    // $ANTLR start rule__Section4__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3291:1: rule__Section4__Group__1 : rule__Section4__Group__1__Impl rule__Section4__Group__2 ;
    public final void rule__Section4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3295:1: ( rule__Section4__Group__1__Impl rule__Section4__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3296:2: rule__Section4__Group__1__Impl rule__Section4__Group__2
            {
            pushFollow(FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16727);
            rule__Section4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16730);
            rule__Section4__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__1


    // $ANTLR start rule__Section4__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3303:1: rule__Section4__Group__1__Impl : ( ( rule__Section4__Group_1__0 )? ) ;
    public final void rule__Section4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3307:1: ( ( ( rule__Section4__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3308:1: ( ( rule__Section4__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3308:1: ( ( rule__Section4__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3309:1: ( rule__Section4__Group_1__0 )?
            {
             before(grammarAccess.getSection4Access().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:1: ( rule__Section4__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:2: rule__Section4__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_1__0_in_rule__Section4__Group__1__Impl6757);
                    rule__Section4__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection4Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__1__Impl


    // $ANTLR start rule__Section4__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3320:1: rule__Section4__Group__2 : rule__Section4__Group__2__Impl rule__Section4__Group__3 ;
    public final void rule__Section4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3324:1: ( rule__Section4__Group__2__Impl rule__Section4__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3325:2: rule__Section4__Group__2__Impl rule__Section4__Group__3
            {
            pushFollow(FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26788);
            rule__Section4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26791);
            rule__Section4__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__2


    // $ANTLR start rule__Section4__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3332:1: rule__Section4__Group__2__Impl : ( '[' ) ;
    public final void rule__Section4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3336:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3337:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3337:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3338:1: '['
            {
             before(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Section4__Group__2__Impl6819); 
             after(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__2__Impl


    // $ANTLR start rule__Section4__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3351:1: rule__Section4__Group__3 : rule__Section4__Group__3__Impl rule__Section4__Group__4 ;
    public final void rule__Section4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3355:1: ( rule__Section4__Group__3__Impl rule__Section4__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3356:2: rule__Section4__Group__3__Impl rule__Section4__Group__4
            {
            pushFollow(FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36850);
            rule__Section4__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__4_in_rule__Section4__Group__36853);
            rule__Section4__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__3


    // $ANTLR start rule__Section4__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3363:1: rule__Section4__Group__3__Impl : ( ( rule__Section4__TitleAssignment_3 ) ) ;
    public final void rule__Section4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3367:1: ( ( ( rule__Section4__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3368:1: ( ( rule__Section4__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3368:1: ( ( rule__Section4__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3369:1: ( rule__Section4__TitleAssignment_3 )
            {
             before(grammarAccess.getSection4Access().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:1: ( rule__Section4__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:2: rule__Section4__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section4__TitleAssignment_3_in_rule__Section4__Group__3__Impl6880);
            rule__Section4__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__3__Impl


    // $ANTLR start rule__Section4__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3380:1: rule__Section4__Group__4 : rule__Section4__Group__4__Impl rule__Section4__Group__5 ;
    public final void rule__Section4__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3384:1: ( rule__Section4__Group__4__Impl rule__Section4__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3385:2: rule__Section4__Group__4__Impl rule__Section4__Group__5
            {
            pushFollow(FOLLOW_rule__Section4__Group__4__Impl_in_rule__Section4__Group__46910);
            rule__Section4__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__5_in_rule__Section4__Group__46913);
            rule__Section4__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__4


    // $ANTLR start rule__Section4__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3392:1: rule__Section4__Group__4__Impl : ( ']' ) ;
    public final void rule__Section4__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3396:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3397:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3397:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3398:1: ']'
            {
             before(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Section4__Group__4__Impl6941); 
             after(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__4__Impl


    // $ANTLR start rule__Section4__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3411:1: rule__Section4__Group__5 : rule__Section4__Group__5__Impl ;
    public final void rule__Section4__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3415:1: ( rule__Section4__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3416:2: rule__Section4__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group__5__Impl_in_rule__Section4__Group__56972);
            rule__Section4__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__5


    // $ANTLR start rule__Section4__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3422:1: rule__Section4__Group__5__Impl : ( ( rule__Section4__Group_5__0 )* ) ;
    public final void rule__Section4__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3426:1: ( ( ( rule__Section4__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3427:1: ( ( rule__Section4__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3427:1: ( ( rule__Section4__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3428:1: ( rule__Section4__Group_5__0 )*
            {
             before(grammarAccess.getSection4Access().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:1: ( rule__Section4__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTI_NL) ) {
                    int LA33_2 = input.LA(2);

                    if ( ((LA33_2>=RULE_ID && LA33_2<=RULE_ANY_OTHER)||(LA33_2>=10 && LA33_2<=12)||(LA33_2>=20 && LA33_2<=24)||(LA33_2>=26 && LA33_2<=29)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:2: rule__Section4__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Section4__Group_5__0_in_rule__Section4__Group__5__Impl6999);
            	    rule__Section4__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSection4Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__5__Impl


    // $ANTLR start rule__Section4__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3451:1: rule__Section4__Group_1__0 : rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1 ;
    public final void rule__Section4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3455:1: ( rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3456:2: rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_1__0__Impl_in_rule__Section4__Group_1__07042);
            rule__Section4__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_1__1_in_rule__Section4__Group_1__07045);
            rule__Section4__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__0


    // $ANTLR start rule__Section4__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3463:1: rule__Section4__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3467:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3468:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3468:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3469:1: ':'
            {
             before(grammarAccess.getSection4Access().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Section4__Group_1__0__Impl7073); 
             after(grammarAccess.getSection4Access().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__0__Impl


    // $ANTLR start rule__Section4__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3482:1: rule__Section4__Group_1__1 : rule__Section4__Group_1__1__Impl ;
    public final void rule__Section4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3486:1: ( rule__Section4__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3487:2: rule__Section4__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_1__1__Impl_in_rule__Section4__Group_1__17104);
            rule__Section4__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__1


    // $ANTLR start rule__Section4__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3493:1: rule__Section4__Group_1__1__Impl : ( ( rule__Section4__NameAssignment_1_1 ) ) ;
    public final void rule__Section4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3497:1: ( ( ( rule__Section4__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3498:1: ( ( rule__Section4__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3498:1: ( ( rule__Section4__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3499:1: ( rule__Section4__NameAssignment_1_1 )
            {
             before(grammarAccess.getSection4Access().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3500:1: ( rule__Section4__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3500:2: rule__Section4__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section4__NameAssignment_1_1_in_rule__Section4__Group_1__1__Impl7131);
            rule__Section4__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__1__Impl


    // $ANTLR start rule__Section4__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3514:1: rule__Section4__Group_5__0 : rule__Section4__Group_5__0__Impl rule__Section4__Group_5__1 ;
    public final void rule__Section4__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3518:1: ( rule__Section4__Group_5__0__Impl rule__Section4__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3519:2: rule__Section4__Group_5__0__Impl rule__Section4__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_5__0__Impl_in_rule__Section4__Group_5__07165);
            rule__Section4__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_5__1_in_rule__Section4__Group_5__07168);
            rule__Section4__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_5__0


    // $ANTLR start rule__Section4__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3526:1: rule__Section4__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section4__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3530:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3531:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3531:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3532:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_5__0__Impl7195); 
             after(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_5__0__Impl


    // $ANTLR start rule__Section4__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3543:1: rule__Section4__Group_5__1 : rule__Section4__Group_5__1__Impl ;
    public final void rule__Section4__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3547:1: ( rule__Section4__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3548:2: rule__Section4__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_5__1__Impl_in_rule__Section4__Group_5__17224);
            rule__Section4__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_5__1


    // $ANTLR start rule__Section4__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3554:1: rule__Section4__Group_5__1__Impl : ( ( rule__Section4__ContentsAssignment_5_1 ) ) ;
    public final void rule__Section4__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3558:1: ( ( ( rule__Section4__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3559:1: ( ( rule__Section4__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3559:1: ( ( rule__Section4__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3560:1: ( rule__Section4__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3561:1: ( rule__Section4__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3561:2: rule__Section4__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_5_1_in_rule__Section4__Group_5__1__Impl7251);
            rule__Section4__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_5__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3575:1: rule__TextOrMarkup__Group_0__0 : rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 ;
    public final void rule__TextOrMarkup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3579:1: ( rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3580:2: rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07285);
            rule__TextOrMarkup__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07288);
            rule__TextOrMarkup__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__0


    // $ANTLR start rule__TextOrMarkup__Group_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3587:1: rule__TextOrMarkup__Group_0__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3591:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3592:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3592:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3593:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3594:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3594:2: rule__TextOrMarkup__ContentsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7315);
            rule__TextOrMarkup__ContentsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3604:1: rule__TextOrMarkup__Group_0__1 : rule__TextOrMarkup__Group_0__1__Impl ;
    public final void rule__TextOrMarkup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3608:1: ( rule__TextOrMarkup__Group_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3609:2: rule__TextOrMarkup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17345);
            rule__TextOrMarkup__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__1


    // $ANTLR start rule__TextOrMarkup__Group_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3615:1: rule__TextOrMarkup__Group_0__1__Impl : ( ( rule__TextOrMarkup__Group_0_1__0 )* ) ;
    public final void rule__TextOrMarkup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3619:1: ( ( ( rule__TextOrMarkup__Group_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3620:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3620:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3621:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3622:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=20 && LA34_0<=24)||(LA34_0>=26 && LA34_0<=29)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3622:2: rule__TextOrMarkup__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7372);
            	    rule__TextOrMarkup__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3636:1: rule__TextOrMarkup__Group_0_1__0 : rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 ;
    public final void rule__TextOrMarkup__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3640:1: ( rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3641:2: rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07407);
            rule__TextOrMarkup__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07410);
            rule__TextOrMarkup__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__0


    // $ANTLR start rule__TextOrMarkup__Group_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3648:1: rule__TextOrMarkup__Group_0_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3652:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3653:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3653:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3654:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3655:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3655:2: rule__TextOrMarkup__ContentsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7437);
            rule__TextOrMarkup__ContentsAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3665:1: rule__TextOrMarkup__Group_0_1__1 : rule__TextOrMarkup__Group_0_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3669:1: ( rule__TextOrMarkup__Group_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3670:2: rule__TextOrMarkup__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17467);
            rule__TextOrMarkup__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__1


    // $ANTLR start rule__TextOrMarkup__Group_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3676:1: rule__TextOrMarkup__Group_0_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3680:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3681:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3681:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3682:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3683:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_ANY_OTHER)||(LA35_0>=10 && LA35_0<=12)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3683:2: rule__TextOrMarkup__ContentsAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7494);
                    rule__TextOrMarkup__ContentsAssignment_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3697:1: rule__TextOrMarkup__Group_1__0 : rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 ;
    public final void rule__TextOrMarkup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3701:1: ( rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3702:2: rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07529);
            rule__TextOrMarkup__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07532);
            rule__TextOrMarkup__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__0


    // $ANTLR start rule__TextOrMarkup__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3709:1: rule__TextOrMarkup__Group_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3713:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3714:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3714:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3715:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3716:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3716:2: rule__TextOrMarkup__ContentsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7559);
            rule__TextOrMarkup__ContentsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3726:1: rule__TextOrMarkup__Group_1__1 : rule__TextOrMarkup__Group_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3730:1: ( rule__TextOrMarkup__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3731:2: rule__TextOrMarkup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17589);
            rule__TextOrMarkup__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__1


    // $ANTLR start rule__TextOrMarkup__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3737:1: rule__TextOrMarkup__Group_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3741:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3742:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3742:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3743:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3744:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_ANY_OTHER)||(LA36_0>=10 && LA36_0<=12)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3744:2: rule__TextOrMarkup__ContentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7616);
                    rule__TextOrMarkup__ContentsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__1__Impl


    // $ANTLR start rule__Emphasize__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3758:1: rule__Emphasize__Group__0 : rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 ;
    public final void rule__Emphasize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3762:1: ( rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3763:2: rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07651);
            rule__Emphasize__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07654);
            rule__Emphasize__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__0


    // $ANTLR start rule__Emphasize__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3770:1: rule__Emphasize__Group__0__Impl : ( '\\\\emph' ) ;
    public final void rule__Emphasize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3774:1: ( ( '\\\\emph' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3775:1: ( '\\\\emph' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3775:1: ( '\\\\emph' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3776:1: '\\\\emph'
            {
             before(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Emphasize__Group__0__Impl7682); 
             after(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__0__Impl


    // $ANTLR start rule__Emphasize__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3789:1: rule__Emphasize__Group__1 : rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 ;
    public final void rule__Emphasize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3793:1: ( rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3794:2: rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17713);
            rule__Emphasize__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17716);
            rule__Emphasize__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__1


    // $ANTLR start rule__Emphasize__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3801:1: rule__Emphasize__Group__1__Impl : ( '[' ) ;
    public final void rule__Emphasize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3805:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3807:1: '['
            {
             before(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Emphasize__Group__1__Impl7744); 
             after(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__1__Impl


    // $ANTLR start rule__Emphasize__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3820:1: rule__Emphasize__Group__2 : rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 ;
    public final void rule__Emphasize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3824:1: ( rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3825:2: rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27775);
            rule__Emphasize__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27778);
            rule__Emphasize__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__2


    // $ANTLR start rule__Emphasize__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3832:1: rule__Emphasize__Group__2__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3836:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3838:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3839:1: ( RULE_MULTI_NL )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_MULTI_NL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3839:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__2__Impl7806); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__2__Impl


    // $ANTLR start rule__Emphasize__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3849:1: rule__Emphasize__Group__3 : rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 ;
    public final void rule__Emphasize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3853:1: ( rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3854:2: rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37837);
            rule__Emphasize__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37840);
            rule__Emphasize__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__3


    // $ANTLR start rule__Emphasize__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3861:1: rule__Emphasize__Group__3__Impl : ( ( rule__Emphasize__ContentsAssignment_3 ) ) ;
    public final void rule__Emphasize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3865:1: ( ( ( rule__Emphasize__ContentsAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3866:1: ( ( rule__Emphasize__ContentsAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3866:1: ( ( rule__Emphasize__ContentsAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3867:1: ( rule__Emphasize__ContentsAssignment_3 )
            {
             before(grammarAccess.getEmphasizeAccess().getContentsAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3868:1: ( rule__Emphasize__ContentsAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3868:2: rule__Emphasize__ContentsAssignment_3
            {
            pushFollow(FOLLOW_rule__Emphasize__ContentsAssignment_3_in_rule__Emphasize__Group__3__Impl7867);
            rule__Emphasize__ContentsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__3__Impl


    // $ANTLR start rule__Emphasize__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3878:1: rule__Emphasize__Group__4 : rule__Emphasize__Group__4__Impl rule__Emphasize__Group__5 ;
    public final void rule__Emphasize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3882:1: ( rule__Emphasize__Group__4__Impl rule__Emphasize__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3883:2: rule__Emphasize__Group__4__Impl rule__Emphasize__Group__5
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47897);
            rule__Emphasize__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__5_in_rule__Emphasize__Group__47900);
            rule__Emphasize__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__4


    // $ANTLR start rule__Emphasize__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3890:1: rule__Emphasize__Group__4__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3894:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3895:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3895:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3896:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3897:1: ( RULE_MULTI_NL )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_MULTI_NL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3897:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__4__Impl7928); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__4__Impl


    // $ANTLR start rule__Emphasize__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3907:1: rule__Emphasize__Group__5 : rule__Emphasize__Group__5__Impl ;
    public final void rule__Emphasize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3911:1: ( rule__Emphasize__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3912:2: rule__Emphasize__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__5__Impl_in_rule__Emphasize__Group__57959);
            rule__Emphasize__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__5


    // $ANTLR start rule__Emphasize__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3918:1: rule__Emphasize__Group__5__Impl : ( ']' ) ;
    public final void rule__Emphasize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3922:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3923:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3923:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3924:1: ']'
            {
             before(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Emphasize__Group__5__Impl7987); 
             after(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__5__Impl


    // $ANTLR start rule__Anchor__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3949:1: rule__Anchor__Group__0 : rule__Anchor__Group__0__Impl rule__Anchor__Group__1 ;
    public final void rule__Anchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3953:1: ( rule__Anchor__Group__0__Impl rule__Anchor__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3954:2: rule__Anchor__Group__0__Impl rule__Anchor__Group__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08030);
            rule__Anchor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08033);
            rule__Anchor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__0


    // $ANTLR start rule__Anchor__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3961:1: rule__Anchor__Group__0__Impl : ( '\\\\a' ) ;
    public final void rule__Anchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3965:1: ( ( '\\\\a' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3966:1: ( '\\\\a' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3966:1: ( '\\\\a' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3967:1: '\\\\a'
            {
             before(grammarAccess.getAnchorAccess().getAKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Anchor__Group__0__Impl8061); 
             after(grammarAccess.getAnchorAccess().getAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__0__Impl


    // $ANTLR start rule__Anchor__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3980:1: rule__Anchor__Group__1 : rule__Anchor__Group__1__Impl rule__Anchor__Group__2 ;
    public final void rule__Anchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3984:1: ( rule__Anchor__Group__1__Impl rule__Anchor__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3985:2: rule__Anchor__Group__1__Impl rule__Anchor__Group__2
            {
            pushFollow(FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18092);
            rule__Anchor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18095);
            rule__Anchor__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__1


    // $ANTLR start rule__Anchor__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3992:1: rule__Anchor__Group__1__Impl : ( ':' ) ;
    public final void rule__Anchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3996:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3997:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3997:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3998:1: ':'
            {
             before(grammarAccess.getAnchorAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Anchor__Group__1__Impl8123); 
             after(grammarAccess.getAnchorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__1__Impl


    // $ANTLR start rule__Anchor__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4011:1: rule__Anchor__Group__2 : rule__Anchor__Group__2__Impl rule__Anchor__Group__3 ;
    public final void rule__Anchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4015:1: ( rule__Anchor__Group__2__Impl rule__Anchor__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4016:2: rule__Anchor__Group__2__Impl rule__Anchor__Group__3
            {
            pushFollow(FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28154);
            rule__Anchor__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__3_in_rule__Anchor__Group__28157);
            rule__Anchor__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__2


    // $ANTLR start rule__Anchor__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4023:1: rule__Anchor__Group__2__Impl : ( ( rule__Anchor__NameAssignment_2 ) ) ;
    public final void rule__Anchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4027:1: ( ( ( rule__Anchor__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4028:1: ( ( rule__Anchor__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4028:1: ( ( rule__Anchor__NameAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4029:1: ( rule__Anchor__NameAssignment_2 )
            {
             before(grammarAccess.getAnchorAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4030:1: ( rule__Anchor__NameAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4030:2: rule__Anchor__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Anchor__NameAssignment_2_in_rule__Anchor__Group__2__Impl8184);
            rule__Anchor__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__2__Impl


    // $ANTLR start rule__Anchor__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4040:1: rule__Anchor__Group__3 : rule__Anchor__Group__3__Impl ;
    public final void rule__Anchor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4044:1: ( rule__Anchor__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4045:2: rule__Anchor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group__3__Impl_in_rule__Anchor__Group__38214);
            rule__Anchor__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__3


    // $ANTLR start rule__Anchor__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4051:1: rule__Anchor__Group__3__Impl : ( ( rule__Anchor__Group_3__0 )? ) ;
    public final void rule__Anchor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4055:1: ( ( ( rule__Anchor__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4056:1: ( ( rule__Anchor__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4056:1: ( ( rule__Anchor__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4057:1: ( rule__Anchor__Group_3__0 )?
            {
             before(grammarAccess.getAnchorAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4058:1: ( rule__Anchor__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4058:2: rule__Anchor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Anchor__Group_3__0_in_rule__Anchor__Group__3__Impl8241);
                    rule__Anchor__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnchorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__3__Impl


    // $ANTLR start rule__Anchor__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4076:1: rule__Anchor__Group_3__0 : rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1 ;
    public final void rule__Anchor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4080:1: ( rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4081:2: rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group_3__0__Impl_in_rule__Anchor__Group_3__08280);
            rule__Anchor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group_3__1_in_rule__Anchor__Group_3__08283);
            rule__Anchor__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__0


    // $ANTLR start rule__Anchor__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4088:1: rule__Anchor__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Anchor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4092:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4094:1: '['
            {
             before(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Anchor__Group_3__0__Impl8311); 
             after(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__0__Impl


    // $ANTLR start rule__Anchor__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4107:1: rule__Anchor__Group_3__1 : rule__Anchor__Group_3__1__Impl ;
    public final void rule__Anchor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4111:1: ( rule__Anchor__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4112:2: rule__Anchor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group_3__1__Impl_in_rule__Anchor__Group_3__18342);
            rule__Anchor__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__1


    // $ANTLR start rule__Anchor__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4118:1: rule__Anchor__Group_3__1__Impl : ( ']' ) ;
    public final void rule__Anchor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4122:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4123:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4123:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4124:1: ']'
            {
             before(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1()); 
            match(input,15,FOLLOW_15_in_rule__Anchor__Group_3__1__Impl8370); 
             after(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__1__Impl


    // $ANTLR start rule__Ref__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4141:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4145:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4146:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08405);
            rule__Ref__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08408);
            rule__Ref__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__0


    // $ANTLR start rule__Ref__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4153:1: rule__Ref__Group__0__Impl : ( '\\\\ref' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4157:1: ( ( '\\\\ref' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4158:1: ( '\\\\ref' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4158:1: ( '\\\\ref' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4159:1: '\\\\ref'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Ref__Group__0__Impl8436); 
             after(grammarAccess.getRefAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__0__Impl


    // $ANTLR start rule__Ref__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4172:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4176:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4177:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18467);
            rule__Ref__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18470);
            rule__Ref__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__1


    // $ANTLR start rule__Ref__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4184:1: rule__Ref__Group__1__Impl : ( ':' ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4188:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4189:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4189:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4190:1: ':'
            {
             before(grammarAccess.getRefAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Ref__Group__1__Impl8498); 
             after(grammarAccess.getRefAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__1__Impl


    // $ANTLR start rule__Ref__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4203:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4207:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4208:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28529);
            rule__Ref__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28532);
            rule__Ref__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__2


    // $ANTLR start rule__Ref__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4215:1: rule__Ref__Group__2__Impl : ( ( rule__Ref__RefAssignment_2 ) ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4219:1: ( ( ( rule__Ref__RefAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4220:1: ( ( rule__Ref__RefAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4220:1: ( ( rule__Ref__RefAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4221:1: ( rule__Ref__RefAssignment_2 )
            {
             before(grammarAccess.getRefAccess().getRefAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4222:1: ( rule__Ref__RefAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4222:2: rule__Ref__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__Ref__RefAssignment_2_in_rule__Ref__Group__2__Impl8559);
            rule__Ref__RefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__2__Impl


    // $ANTLR start rule__Ref__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4232:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4236:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4237:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38589);
            rule__Ref__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38592);
            rule__Ref__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__3


    // $ANTLR start rule__Ref__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4244:1: rule__Ref__Group__3__Impl : ( '[' ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4248:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4249:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4249:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4250:1: '['
            {
             before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Ref__Group__3__Impl8620); 
             after(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__3__Impl


    // $ANTLR start rule__Ref__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4263:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4267:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4268:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48651);
            rule__Ref__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48654);
            rule__Ref__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__4


    // $ANTLR start rule__Ref__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4275:1: rule__Ref__Group__4__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4279:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4280:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4280:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4281:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4282:1: ( RULE_MULTI_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_MULTI_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4282:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__4__Impl8682); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__4__Impl


    // $ANTLR start rule__Ref__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4292:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4296:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4297:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58713);
            rule__Ref__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58716);
            rule__Ref__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__5


    // $ANTLR start rule__Ref__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4304:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__ContentsAssignment_5 ) ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4308:1: ( ( ( rule__Ref__ContentsAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4309:1: ( ( rule__Ref__ContentsAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4309:1: ( ( rule__Ref__ContentsAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4310:1: ( rule__Ref__ContentsAssignment_5 )
            {
             before(grammarAccess.getRefAccess().getContentsAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4311:1: ( rule__Ref__ContentsAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4311:2: rule__Ref__ContentsAssignment_5
            {
            pushFollow(FOLLOW_rule__Ref__ContentsAssignment_5_in_rule__Ref__Group__5__Impl8743);
            rule__Ref__ContentsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getContentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__5__Impl


    // $ANTLR start rule__Ref__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4321:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl rule__Ref__Group__7 ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4325:1: ( rule__Ref__Group__6__Impl rule__Ref__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4326:2: rule__Ref__Group__6__Impl rule__Ref__Group__7
            {
            pushFollow(FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68773);
            rule__Ref__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__68776);
            rule__Ref__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__6


    // $ANTLR start rule__Ref__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4333:1: rule__Ref__Group__6__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4337:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4338:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4338:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4339:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4340:1: ( RULE_MULTI_NL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_MULTI_NL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4340:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__6__Impl8804); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__6__Impl


    // $ANTLR start rule__Ref__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4350:1: rule__Ref__Group__7 : rule__Ref__Group__7__Impl ;
    public final void rule__Ref__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4354:1: ( rule__Ref__Group__7__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4355:2: rule__Ref__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__78835);
            rule__Ref__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__7


    // $ANTLR start rule__Ref__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4361:1: rule__Ref__Group__7__Impl : ( ']' ) ;
    public final void rule__Ref__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4365:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4366:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4366:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4367:1: ']'
            {
             before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Ref__Group__7__Impl8863); 
             after(grammarAccess.getRefAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__7__Impl


    // $ANTLR start rule__OrderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4396:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4400:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4401:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08910);
            rule__OrderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08913);
            rule__OrderedList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__0


    // $ANTLR start rule__OrderedList__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4408:1: rule__OrderedList__Group__0__Impl : ( '\\\\ol' ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4412:1: ( ( '\\\\ol' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4413:1: ( '\\\\ol' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4413:1: ( '\\\\ol' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4414:1: '\\\\ol'
            {
             before(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__OrderedList__Group__0__Impl8941); 
             after(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__0__Impl


    // $ANTLR start rule__OrderedList__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4427:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4431:1: ( rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4432:2: rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18972);
            rule__OrderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18975);
            rule__OrderedList__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__1


    // $ANTLR start rule__OrderedList__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4439:1: rule__OrderedList__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4443:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4444:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4444:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4445:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:1: ( ruleANY_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_WS && LA42_0<=RULE_SINGLE_NL)||LA42_0==RULE_MULTI_NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__1__Impl9003);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__1__Impl


    // $ANTLR start rule__OrderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4456:1: rule__OrderedList__Group__2 : rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 ;
    public final void rule__OrderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4460:1: ( rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4461:2: rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__29034);
            rule__OrderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__29037);
            rule__OrderedList__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__2


    // $ANTLR start rule__OrderedList__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4468:1: rule__OrderedList__Group__2__Impl : ( '[' ) ;
    public final void rule__OrderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4472:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4473:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4473:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4474:1: '['
            {
             before(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__OrderedList__Group__2__Impl9065); 
             after(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__2__Impl


    // $ANTLR start rule__OrderedList__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4487:1: rule__OrderedList__Group__3 : rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4 ;
    public final void rule__OrderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4491:1: ( rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4492:2: rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__39096);
            rule__OrderedList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__4_in_rule__OrderedList__Group__39099);
            rule__OrderedList__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__3


    // $ANTLR start rule__OrderedList__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4499:1: rule__OrderedList__Group__3__Impl : ( ( ( rule__OrderedList__Group_3__0 ) ) ( ( rule__OrderedList__Group_3__0 )* ) ) ;
    public final void rule__OrderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4503:1: ( ( ( ( rule__OrderedList__Group_3__0 ) ) ( ( rule__OrderedList__Group_3__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4504:1: ( ( ( rule__OrderedList__Group_3__0 ) ) ( ( rule__OrderedList__Group_3__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4504:1: ( ( ( rule__OrderedList__Group_3__0 ) ) ( ( rule__OrderedList__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4505:1: ( ( rule__OrderedList__Group_3__0 ) ) ( ( rule__OrderedList__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4505:1: ( ( rule__OrderedList__Group_3__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4506:1: ( rule__OrderedList__Group_3__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4507:1: ( rule__OrderedList__Group_3__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4507:2: rule__OrderedList__Group_3__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_3__0_in_rule__OrderedList__Group__3__Impl9128);
            rule__OrderedList__Group_3__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup_3()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4510:1: ( ( rule__OrderedList__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4511:1: ( rule__OrderedList__Group_3__0 )*
            {
             before(grammarAccess.getOrderedListAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4512:1: ( rule__OrderedList__Group_3__0 )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4512:2: rule__OrderedList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__Group_3__0_in_rule__OrderedList__Group__3__Impl9140);
            	    rule__OrderedList__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__3__Impl


    // $ANTLR start rule__OrderedList__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4523:1: rule__OrderedList__Group__4 : rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5 ;
    public final void rule__OrderedList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4527:1: ( rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4528:2: rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__4__Impl_in_rule__OrderedList__Group__49173);
            rule__OrderedList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__5_in_rule__OrderedList__Group__49176);
            rule__OrderedList__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__4


    // $ANTLR start rule__OrderedList__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4535:1: rule__OrderedList__Group__4__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4539:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4540:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4540:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4541:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4542:1: ( ruleANY_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_SINGLE_NL)||LA44_0==RULE_MULTI_NL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4542:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__4__Impl9204);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__4__Impl


    // $ANTLR start rule__OrderedList__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4552:1: rule__OrderedList__Group__5 : rule__OrderedList__Group__5__Impl ;
    public final void rule__OrderedList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4556:1: ( rule__OrderedList__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4557:2: rule__OrderedList__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__5__Impl_in_rule__OrderedList__Group__59235);
            rule__OrderedList__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__5


    // $ANTLR start rule__OrderedList__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4563:1: rule__OrderedList__Group__5__Impl : ( ']' ) ;
    public final void rule__OrderedList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4567:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4568:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4568:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4569:1: ']'
            {
             before(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__OrderedList__Group__5__Impl9263); 
             after(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__5__Impl


    // $ANTLR start rule__OrderedList__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4594:1: rule__OrderedList__Group_3__0 : rule__OrderedList__Group_3__0__Impl rule__OrderedList__Group_3__1 ;
    public final void rule__OrderedList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4598:1: ( rule__OrderedList__Group_3__0__Impl rule__OrderedList__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4599:2: rule__OrderedList__Group_3__0__Impl rule__OrderedList__Group_3__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_3__0__Impl_in_rule__OrderedList__Group_3__09306);
            rule__OrderedList__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group_3__1_in_rule__OrderedList__Group_3__09309);
            rule__OrderedList__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_3__0


    // $ANTLR start rule__OrderedList__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4606:1: rule__OrderedList__Group_3__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4610:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4612:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4613:1: ( ruleANY_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_WS && LA45_0<=RULE_SINGLE_NL)||LA45_0==RULE_MULTI_NL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4613:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_3__0__Impl9337);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_3__0__Impl


    // $ANTLR start rule__OrderedList__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4623:1: rule__OrderedList__Group_3__1 : rule__OrderedList__Group_3__1__Impl ;
    public final void rule__OrderedList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4627:1: ( rule__OrderedList__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4628:2: rule__OrderedList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_3__1__Impl_in_rule__OrderedList__Group_3__19368);
            rule__OrderedList__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_3__1


    // $ANTLR start rule__OrderedList__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4634:1: rule__OrderedList__Group_3__1__Impl : ( ( rule__OrderedList__ItemsAssignment_3_1 ) ) ;
    public final void rule__OrderedList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4638:1: ( ( ( rule__OrderedList__ItemsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4639:1: ( ( rule__OrderedList__ItemsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4639:1: ( ( rule__OrderedList__ItemsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4640:1: ( rule__OrderedList__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4641:1: ( rule__OrderedList__ItemsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4641:2: rule__OrderedList__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_3_1_in_rule__OrderedList__Group_3__1__Impl9395);
            rule__OrderedList__ItemsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_3__1__Impl


    // $ANTLR start rule__UnorderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4655:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4659:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4660:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__09429);
            rule__UnorderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__09432);
            rule__UnorderedList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__0


    // $ANTLR start rule__UnorderedList__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4667:1: rule__UnorderedList__Group__0__Impl : ( '\\\\ul' ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4671:1: ( ( '\\\\ul' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( '\\\\ul' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( '\\\\ul' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4673:1: '\\\\ul'
            {
             before(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UnorderedList__Group__0__Impl9460); 
             after(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__0__Impl


    // $ANTLR start rule__UnorderedList__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4686:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4690:1: ( rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4691:2: rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19491);
            rule__UnorderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19494);
            rule__UnorderedList__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__1


    // $ANTLR start rule__UnorderedList__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4698:1: rule__UnorderedList__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4702:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4704:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4705:1: ( ruleANY_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WS && LA46_0<=RULE_SINGLE_NL)||LA46_0==RULE_MULTI_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4705:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__1__Impl9522);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__1__Impl


    // $ANTLR start rule__UnorderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4715:1: rule__UnorderedList__Group__2 : rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 ;
    public final void rule__UnorderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4719:1: ( rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4720:2: rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29553);
            rule__UnorderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29556);
            rule__UnorderedList__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__2


    // $ANTLR start rule__UnorderedList__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4727:1: rule__UnorderedList__Group__2__Impl : ( '[' ) ;
    public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4731:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4732:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4732:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4733:1: '['
            {
             before(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__UnorderedList__Group__2__Impl9584); 
             after(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__2__Impl


    // $ANTLR start rule__UnorderedList__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4746:1: rule__UnorderedList__Group__3 : rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4 ;
    public final void rule__UnorderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4750:1: ( rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4751:2: rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39615);
            rule__UnorderedList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__4_in_rule__UnorderedList__Group__39618);
            rule__UnorderedList__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__3


    // $ANTLR start rule__UnorderedList__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4758:1: rule__UnorderedList__Group__3__Impl : ( ( ( rule__UnorderedList__Group_3__0 ) ) ( ( rule__UnorderedList__Group_3__0 )* ) ) ;
    public final void rule__UnorderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4762:1: ( ( ( ( rule__UnorderedList__Group_3__0 ) ) ( ( rule__UnorderedList__Group_3__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4763:1: ( ( ( rule__UnorderedList__Group_3__0 ) ) ( ( rule__UnorderedList__Group_3__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4763:1: ( ( ( rule__UnorderedList__Group_3__0 ) ) ( ( rule__UnorderedList__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4764:1: ( ( rule__UnorderedList__Group_3__0 ) ) ( ( rule__UnorderedList__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4764:1: ( ( rule__UnorderedList__Group_3__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4765:1: ( rule__UnorderedList__Group_3__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4766:1: ( rule__UnorderedList__Group_3__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4766:2: rule__UnorderedList__Group_3__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_3__0_in_rule__UnorderedList__Group__3__Impl9647);
            rule__UnorderedList__Group_3__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup_3()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4769:1: ( ( rule__UnorderedList__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4770:1: ( rule__UnorderedList__Group_3__0 )*
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4771:1: ( rule__UnorderedList__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4771:2: rule__UnorderedList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__Group_3__0_in_rule__UnorderedList__Group__3__Impl9659);
            	    rule__UnorderedList__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__3__Impl


    // $ANTLR start rule__UnorderedList__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4782:1: rule__UnorderedList__Group__4 : rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5 ;
    public final void rule__UnorderedList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4786:1: ( rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4787:2: rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__4__Impl_in_rule__UnorderedList__Group__49692);
            rule__UnorderedList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__5_in_rule__UnorderedList__Group__49695);
            rule__UnorderedList__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__4


    // $ANTLR start rule__UnorderedList__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4794:1: rule__UnorderedList__Group__4__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4798:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4799:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4799:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4800:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4801:1: ( ruleANY_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_WS && LA48_0<=RULE_SINGLE_NL)||LA48_0==RULE_MULTI_NL) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4801:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__4__Impl9723);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__4__Impl


    // $ANTLR start rule__UnorderedList__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4811:1: rule__UnorderedList__Group__5 : rule__UnorderedList__Group__5__Impl ;
    public final void rule__UnorderedList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4815:1: ( rule__UnorderedList__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4816:2: rule__UnorderedList__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__5__Impl_in_rule__UnorderedList__Group__59754);
            rule__UnorderedList__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__5


    // $ANTLR start rule__UnorderedList__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4822:1: rule__UnorderedList__Group__5__Impl : ( ']' ) ;
    public final void rule__UnorderedList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4826:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4827:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4827:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4828:1: ']'
            {
             before(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__UnorderedList__Group__5__Impl9782); 
             after(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__5__Impl


    // $ANTLR start rule__UnorderedList__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4853:1: rule__UnorderedList__Group_3__0 : rule__UnorderedList__Group_3__0__Impl rule__UnorderedList__Group_3__1 ;
    public final void rule__UnorderedList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4857:1: ( rule__UnorderedList__Group_3__0__Impl rule__UnorderedList__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4858:2: rule__UnorderedList__Group_3__0__Impl rule__UnorderedList__Group_3__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_3__0__Impl_in_rule__UnorderedList__Group_3__09825);
            rule__UnorderedList__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group_3__1_in_rule__UnorderedList__Group_3__09828);
            rule__UnorderedList__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_3__0


    // $ANTLR start rule__UnorderedList__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4865:1: rule__UnorderedList__Group_3__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4869:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4870:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4870:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4871:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4872:1: ( ruleANY_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_WS && LA49_0<=RULE_SINGLE_NL)||LA49_0==RULE_MULTI_NL) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4872:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_3__0__Impl9856);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_3__0__Impl


    // $ANTLR start rule__UnorderedList__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4882:1: rule__UnorderedList__Group_3__1 : rule__UnorderedList__Group_3__1__Impl ;
    public final void rule__UnorderedList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4886:1: ( rule__UnorderedList__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4887:2: rule__UnorderedList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_3__1__Impl_in_rule__UnorderedList__Group_3__19887);
            rule__UnorderedList__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_3__1


    // $ANTLR start rule__UnorderedList__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4893:1: rule__UnorderedList__Group_3__1__Impl : ( ( rule__UnorderedList__ItemsAssignment_3_1 ) ) ;
    public final void rule__UnorderedList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4897:1: ( ( ( rule__UnorderedList__ItemsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4898:1: ( ( rule__UnorderedList__ItemsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4898:1: ( ( rule__UnorderedList__ItemsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4899:1: ( rule__UnorderedList__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4900:1: ( rule__UnorderedList__ItemsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4900:2: rule__UnorderedList__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_3_1_in_rule__UnorderedList__Group_3__1__Impl9914);
            rule__UnorderedList__ItemsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_3__1__Impl


    // $ANTLR start rule__Item__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4914:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4918:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4919:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09948);
            rule__Item__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09951);
            rule__Item__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__0


    // $ANTLR start rule__Item__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4926:1: rule__Item__Group__0__Impl : ( '\\\\item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4930:1: ( ( '\\\\item' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4931:1: ( '\\\\item' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4931:1: ( '\\\\item' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4932:1: '\\\\item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Item__Group__0__Impl9979); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__0__Impl


    // $ANTLR start rule__Item__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4945:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4949:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4950:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__110010);
            rule__Item__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__110013);
            rule__Item__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__1


    // $ANTLR start rule__Item__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4957:1: rule__Item__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4961:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4962:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4962:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4963:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getItemAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4964:1: ( ruleANY_WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_SINGLE_NL)||LA50_0==RULE_MULTI_NL) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4964:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Item__Group__1__Impl10041);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__1__Impl


    // $ANTLR start rule__Item__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4974:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4978:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4979:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__210072);
            rule__Item__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__3_in_rule__Item__Group__210075);
            rule__Item__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__2


    // $ANTLR start rule__Item__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4986:1: rule__Item__Group__2__Impl : ( '[' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4990:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4991:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4991:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4992:1: '['
            {
             before(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Item__Group__2__Impl10103); 
             after(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__2__Impl


    // $ANTLR start rule__Item__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5005:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5009:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5010:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__310134);
            rule__Item__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__4_in_rule__Item__Group__310137);
            rule__Item__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__3


    // $ANTLR start rule__Item__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5017:1: rule__Item__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5021:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5022:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5022:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5023:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5024:1: ( RULE_MULTI_NL )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_MULTI_NL) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5024:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__3__Impl10165); 

                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__3__Impl


    // $ANTLR start rule__Item__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5034:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5038:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5039:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__410196);
            rule__Item__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__5_in_rule__Item__Group__410199);
            rule__Item__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__4


    // $ANTLR start rule__Item__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5046:1: rule__Item__Group__4__Impl : ( ( rule__Item__ContentsAssignment_4 ) ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5050:1: ( ( ( rule__Item__ContentsAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5051:1: ( ( rule__Item__ContentsAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5051:1: ( ( rule__Item__ContentsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5052:1: ( rule__Item__ContentsAssignment_4 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5053:1: ( rule__Item__ContentsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5053:2: rule__Item__ContentsAssignment_4
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_4_in_rule__Item__Group__4__Impl10226);
            rule__Item__ContentsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__4__Impl


    // $ANTLR start rule__Item__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5063:1: rule__Item__Group__5 : rule__Item__Group__5__Impl rule__Item__Group__6 ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5067:1: ( rule__Item__Group__5__Impl rule__Item__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5068:2: rule__Item__Group__5__Impl rule__Item__Group__6
            {
            pushFollow(FOLLOW_rule__Item__Group__5__Impl_in_rule__Item__Group__510256);
            rule__Item__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__6_in_rule__Item__Group__510259);
            rule__Item__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__5


    // $ANTLR start rule__Item__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5075:1: rule__Item__Group__5__Impl : ( ( rule__Item__Group_5__0 )* ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5079:1: ( ( ( rule__Item__Group_5__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:1: ( ( rule__Item__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:1: ( ( rule__Item__Group_5__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5081:1: ( rule__Item__Group_5__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5082:1: ( rule__Item__Group_5__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_MULTI_NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5082:2: rule__Item__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_5__0_in_rule__Item__Group__5__Impl10286);
            	    rule__Item__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__5__Impl


    // $ANTLR start rule__Item__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5092:1: rule__Item__Group__6 : rule__Item__Group__6__Impl ;
    public final void rule__Item__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5096:1: ( rule__Item__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5097:2: rule__Item__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__6__Impl_in_rule__Item__Group__610317);
            rule__Item__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__6


    // $ANTLR start rule__Item__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5103:1: rule__Item__Group__6__Impl : ( ']' ) ;
    public final void rule__Item__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5108:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5108:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5109:1: ']'
            {
             before(grammarAccess.getItemAccess().getRightSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Item__Group__6__Impl10345); 
             after(grammarAccess.getItemAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__6__Impl


    // $ANTLR start rule__Item__Group_5__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5136:1: rule__Item__Group_5__0 : rule__Item__Group_5__0__Impl rule__Item__Group_5__1 ;
    public final void rule__Item__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5140:1: ( rule__Item__Group_5__0__Impl rule__Item__Group_5__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5141:2: rule__Item__Group_5__0__Impl rule__Item__Group_5__1
            {
            pushFollow(FOLLOW_rule__Item__Group_5__0__Impl_in_rule__Item__Group_5__010390);
            rule__Item__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group_5__1_in_rule__Item__Group_5__010393);
            rule__Item__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_5__0


    // $ANTLR start rule__Item__Group_5__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5148:1: rule__Item__Group_5__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Item__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5152:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5153:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5153:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5154:1: RULE_MULTI_NL
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_5__0__Impl10420); 
             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_5__0__Impl


    // $ANTLR start rule__Item__Group_5__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5165:1: rule__Item__Group_5__1 : rule__Item__Group_5__1__Impl ;
    public final void rule__Item__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5169:1: ( rule__Item__Group_5__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5170:2: rule__Item__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_5__1__Impl_in_rule__Item__Group_5__110449);
            rule__Item__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_5__1


    // $ANTLR start rule__Item__Group_5__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5176:1: rule__Item__Group_5__1__Impl : ( ( rule__Item__ContentsAssignment_5_1 ) ) ;
    public final void rule__Item__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5180:1: ( ( ( rule__Item__ContentsAssignment_5_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5181:1: ( ( rule__Item__ContentsAssignment_5_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5181:1: ( ( rule__Item__ContentsAssignment_5_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5182:1: ( rule__Item__ContentsAssignment_5_1 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_5_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5183:1: ( rule__Item__ContentsAssignment_5_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5183:2: rule__Item__ContentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_5_1_in_rule__Item__Group_5__1__Impl10476);
            rule__Item__ContentsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_5__1__Impl


    // $ANTLR start rule__CodeRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5197:1: rule__CodeRef__Group__0 : rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 ;
    public final void rule__CodeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5201:1: ( rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5202:2: rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__010510);
            rule__CodeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__010513);
            rule__CodeRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__0


    // $ANTLR start rule__CodeRef__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5209:1: rule__CodeRef__Group__0__Impl : ( '\\\\codeRef' ) ;
    public final void rule__CodeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5213:1: ( ( '\\\\codeRef' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5214:1: ( '\\\\codeRef' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5214:1: ( '\\\\codeRef' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5215:1: '\\\\codeRef'
            {
             before(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__CodeRef__Group__0__Impl10541); 
             after(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__0__Impl


    // $ANTLR start rule__CodeRef__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5228:1: rule__CodeRef__Group__1 : rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 ;
    public final void rule__CodeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5232:1: ( rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5233:2: rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__110572);
            rule__CodeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__110575);
            rule__CodeRef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__1


    // $ANTLR start rule__CodeRef__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5240:1: rule__CodeRef__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5244:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5245:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5245:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5246:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeRefAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5247:1: ( ruleANY_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_SINGLE_NL)||LA53_0==RULE_MULTI_NL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5247:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeRef__Group__1__Impl10603);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getCodeRefAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__1__Impl


    // $ANTLR start rule__CodeRef__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5257:1: rule__CodeRef__Group__2 : rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3 ;
    public final void rule__CodeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5261:1: ( rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5262:2: rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__210634);
            rule__CodeRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__3_in_rule__CodeRef__Group__210637);
            rule__CodeRef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__2


    // $ANTLR start rule__CodeRef__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5269:1: rule__CodeRef__Group__2__Impl : ( '[' ) ;
    public final void rule__CodeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5273:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5274:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5274:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5275:1: '['
            {
             before(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__CodeRef__Group__2__Impl10665); 
             after(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__2__Impl


    // $ANTLR start rule__CodeRef__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5288:1: rule__CodeRef__Group__3 : rule__CodeRef__Group__3__Impl rule__CodeRef__Group__4 ;
    public final void rule__CodeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5292:1: ( rule__CodeRef__Group__3__Impl rule__CodeRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5293:2: rule__CodeRef__Group__3__Impl rule__CodeRef__Group__4
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__3__Impl_in_rule__CodeRef__Group__310696);
            rule__CodeRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__4_in_rule__CodeRef__Group__310699);
            rule__CodeRef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__3


    // $ANTLR start rule__CodeRef__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5300:1: rule__CodeRef__Group__3__Impl : ( ( rule__CodeRef__ElementAssignment_3 ) ) ;
    public final void rule__CodeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5304:1: ( ( ( rule__CodeRef__ElementAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5305:1: ( ( rule__CodeRef__ElementAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5305:1: ( ( rule__CodeRef__ElementAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5306:1: ( rule__CodeRef__ElementAssignment_3 )
            {
             before(grammarAccess.getCodeRefAccess().getElementAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5307:1: ( rule__CodeRef__ElementAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5307:2: rule__CodeRef__ElementAssignment_3
            {
            pushFollow(FOLLOW_rule__CodeRef__ElementAssignment_3_in_rule__CodeRef__Group__3__Impl10726);
            rule__CodeRef__ElementAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__3__Impl


    // $ANTLR start rule__CodeRef__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5317:1: rule__CodeRef__Group__4 : rule__CodeRef__Group__4__Impl ;
    public final void rule__CodeRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5321:1: ( rule__CodeRef__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5322:2: rule__CodeRef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__4__Impl_in_rule__CodeRef__Group__410756);
            rule__CodeRef__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__4


    // $ANTLR start rule__CodeRef__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5328:1: rule__CodeRef__Group__4__Impl : ( ']' ) ;
    public final void rule__CodeRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5332:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5333:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5333:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5334:1: ']'
            {
             before(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__CodeRef__Group__4__Impl10784); 
             after(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__4__Impl


    // $ANTLR start rule__Link__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5357:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5361:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__010825);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__010828);
            rule__Link__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0


    // $ANTLR start rule__Link__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5369:1: rule__Link__Group__0__Impl : ( '\\\\link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5373:1: ( ( '\\\\link' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5374:1: ( '\\\\link' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5374:1: ( '\\\\link' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5375:1: '\\\\link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group__0__Impl10856); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0__Impl


    // $ANTLR start rule__Link__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5388:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5392:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5393:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110887);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110890);
            rule__Link__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1


    // $ANTLR start rule__Link__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5400:1: rule__Link__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5404:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5405:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5405:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5406:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5407:1: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_SINGLE_NL)||LA54_0==RULE_MULTI_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5407:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Link__Group__1__Impl10918);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1__Impl


    // $ANTLR start rule__Link__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5417:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5421:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5422:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210949);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210952);
            rule__Link__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2


    // $ANTLR start rule__Link__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5429:1: rule__Link__Group__2__Impl : ( '[' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5433:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5434:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5434:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5435:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Link__Group__2__Impl10980); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2__Impl


    // $ANTLR start rule__Link__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5448:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5452:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5453:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__311011);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__311014);
            rule__Link__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3


    // $ANTLR start rule__Link__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5460:1: rule__Link__Group__3__Impl : ( ( rule__Link__UrlAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5464:1: ( ( ( rule__Link__UrlAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5465:1: ( ( rule__Link__UrlAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5465:1: ( ( rule__Link__UrlAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5466:1: ( rule__Link__UrlAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5467:1: ( rule__Link__UrlAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5467:2: rule__Link__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_3_in_rule__Link__Group__3__Impl11041);
            rule__Link__UrlAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3__Impl


    // $ANTLR start rule__Link__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5477:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5481:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5482:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__411071);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__411074);
            rule__Link__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__4


    // $ANTLR start rule__Link__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5489:1: rule__Link__Group__4__Impl : ( ']' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5493:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5494:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5494:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5495:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Link__Group__4__Impl11102); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__4__Impl


    // $ANTLR start rule__Link__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5508:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5512:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5513:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__511133);
            rule__Link__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__6_in_rule__Link__Group__511136);
            rule__Link__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5


    // $ANTLR start rule__Link__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5520:1: rule__Link__Group__5__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5524:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5525:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5525:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5526:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_SINGLE_NL)||LA55_0==RULE_MULTI_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Link__Group__5__Impl11164);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5__Impl


    // $ANTLR start rule__Link__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5537:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5541:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5542:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__611195);
            rule__Link__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__7_in_rule__Link__Group__611198);
            rule__Link__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__6


    // $ANTLR start rule__Link__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5549:1: rule__Link__Group__6__Impl : ( '[' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5553:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5554:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5554:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5555:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Link__Group__6__Impl11226); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__6__Impl


    // $ANTLR start rule__Link__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5568:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5572:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5573:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_rule__Link__Group__7__Impl_in_rule__Link__Group__711257);
            rule__Link__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__8_in_rule__Link__Group__711260);
            rule__Link__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__7


    // $ANTLR start rule__Link__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5580:1: rule__Link__Group__7__Impl : ( ( rule__Link__TextAssignment_7 ) ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5584:1: ( ( ( rule__Link__TextAssignment_7 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5585:1: ( ( rule__Link__TextAssignment_7 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5585:1: ( ( rule__Link__TextAssignment_7 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5586:1: ( rule__Link__TextAssignment_7 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5587:1: ( rule__Link__TextAssignment_7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5587:2: rule__Link__TextAssignment_7
            {
            pushFollow(FOLLOW_rule__Link__TextAssignment_7_in_rule__Link__Group__7__Impl11287);
            rule__Link__TextAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTextAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__7__Impl


    // $ANTLR start rule__Link__Group__8
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5597:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5601:1: ( rule__Link__Group__8__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5602:2: rule__Link__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__8__Impl_in_rule__Link__Group__811317);
            rule__Link__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__8


    // $ANTLR start rule__Link__Group__8__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5608:1: rule__Link__Group__8__Impl : ( ']' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5612:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5613:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5613:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5614:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Link__Group__8__Impl11345); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__8__Impl


    // $ANTLR start rule__ImageRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5645:1: rule__ImageRef__Group__0 : rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 ;
    public final void rule__ImageRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5649:1: ( rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5650:2: rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__011394);
            rule__ImageRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__011397);
            rule__ImageRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__0


    // $ANTLR start rule__ImageRef__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5657:1: rule__ImageRef__Group__0__Impl : ( '\\\\img' ) ;
    public final void rule__ImageRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5661:1: ( ( '\\\\img' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5662:1: ( '\\\\img' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5662:1: ( '\\\\img' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5663:1: '\\\\img'
            {
             before(grammarAccess.getImageRefAccess().getImgKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ImageRef__Group__0__Impl11425); 
             after(grammarAccess.getImageRefAccess().getImgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__0__Impl


    // $ANTLR start rule__ImageRef__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5676:1: rule__ImageRef__Group__1 : rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 ;
    public final void rule__ImageRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5680:1: ( rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5681:2: rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__111456);
            rule__ImageRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__111459);
            rule__ImageRef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__1


    // $ANTLR start rule__ImageRef__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5688:1: rule__ImageRef__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5692:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5693:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5693:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5694:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5695:1: ( ruleANY_WS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_WS && LA56_0<=RULE_SINGLE_NL)||LA56_0==RULE_MULTI_NL) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5695:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__1__Impl11487);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__1__Impl


    // $ANTLR start rule__ImageRef__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5705:1: rule__ImageRef__Group__2 : rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 ;
    public final void rule__ImageRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5709:1: ( rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5710:2: rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__211518);
            rule__ImageRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__211521);
            rule__ImageRef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__2


    // $ANTLR start rule__ImageRef__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5717:1: rule__ImageRef__Group__2__Impl : ( ( rule__ImageRef__Group_2__0 )? ) ;
    public final void rule__ImageRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5721:1: ( ( ( rule__ImageRef__Group_2__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5722:1: ( ( rule__ImageRef__Group_2__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5722:1: ( ( rule__ImageRef__Group_2__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5723:1: ( rule__ImageRef__Group_2__0 )?
            {
             before(grammarAccess.getImageRefAccess().getGroup_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5724:1: ( rule__ImageRef__Group_2__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==12) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5724:2: rule__ImageRef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ImageRef__Group_2__0_in_rule__ImageRef__Group__2__Impl11548);
                    rule__ImageRef__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageRefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__2__Impl


    // $ANTLR start rule__ImageRef__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5734:1: rule__ImageRef__Group__3 : rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 ;
    public final void rule__ImageRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5738:1: ( rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5739:2: rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__311579);
            rule__ImageRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__311582);
            rule__ImageRef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__3


    // $ANTLR start rule__ImageRef__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5746:1: rule__ImageRef__Group__3__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5750:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5751:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5751:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5752:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__3__Impl11610); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__3__Impl


    // $ANTLR start rule__ImageRef__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5765:1: rule__ImageRef__Group__4 : rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 ;
    public final void rule__ImageRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5769:1: ( rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5770:2: rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__411641);
            rule__ImageRef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__411644);
            rule__ImageRef__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__4


    // $ANTLR start rule__ImageRef__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5777:1: rule__ImageRef__Group__4__Impl : ( ( rule__ImageRef__PathAssignment_4 ) ) ;
    public final void rule__ImageRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5781:1: ( ( ( rule__ImageRef__PathAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5782:1: ( ( rule__ImageRef__PathAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5782:1: ( ( rule__ImageRef__PathAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5783:1: ( rule__ImageRef__PathAssignment_4 )
            {
             before(grammarAccess.getImageRefAccess().getPathAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5784:1: ( rule__ImageRef__PathAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5784:2: rule__ImageRef__PathAssignment_4
            {
            pushFollow(FOLLOW_rule__ImageRef__PathAssignment_4_in_rule__ImageRef__Group__4__Impl11671);
            rule__ImageRef__PathAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__4__Impl


    // $ANTLR start rule__ImageRef__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5794:1: rule__ImageRef__Group__5 : rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 ;
    public final void rule__ImageRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5798:1: ( rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5799:2: rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__511701);
            rule__ImageRef__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__511704);
            rule__ImageRef__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__5


    // $ANTLR start rule__ImageRef__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5806:1: rule__ImageRef__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5810:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5811:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5811:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5812:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ImageRef__Group__5__Impl11732); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__5__Impl


    // $ANTLR start rule__ImageRef__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5825:1: rule__ImageRef__Group__6 : rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 ;
    public final void rule__ImageRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5829:1: ( rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5830:2: rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__611763);
            rule__ImageRef__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__611766);
            rule__ImageRef__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__6


    // $ANTLR start rule__ImageRef__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5837:1: rule__ImageRef__Group__6__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5841:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5842:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5842:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5843:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5844:1: ( ruleANY_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_SINGLE_NL)||LA58_0==RULE_MULTI_NL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5844:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__6__Impl11794);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__6__Impl


    // $ANTLR start rule__ImageRef__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5854:1: rule__ImageRef__Group__7 : rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 ;
    public final void rule__ImageRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5858:1: ( rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5859:2: rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__711825);
            rule__ImageRef__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__711828);
            rule__ImageRef__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__7


    // $ANTLR start rule__ImageRef__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5866:1: rule__ImageRef__Group__7__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5870:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5871:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5871:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5872:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__7__Impl11856); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__7__Impl


    // $ANTLR start rule__ImageRef__Group__8
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5885:1: rule__ImageRef__Group__8 : rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 ;
    public final void rule__ImageRef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5889:1: ( rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5890:2: rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__811887);
            rule__ImageRef__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__811890);
            rule__ImageRef__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__8


    // $ANTLR start rule__ImageRef__Group__8__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5897:1: rule__ImageRef__Group__8__Impl : ( ( rule__ImageRef__ClazzAssignment_8 ) ) ;
    public final void rule__ImageRef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5901:1: ( ( ( rule__ImageRef__ClazzAssignment_8 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5902:1: ( ( rule__ImageRef__ClazzAssignment_8 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5902:1: ( ( rule__ImageRef__ClazzAssignment_8 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5903:1: ( rule__ImageRef__ClazzAssignment_8 )
            {
             before(grammarAccess.getImageRefAccess().getClazzAssignment_8()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5904:1: ( rule__ImageRef__ClazzAssignment_8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5904:2: rule__ImageRef__ClazzAssignment_8
            {
            pushFollow(FOLLOW_rule__ImageRef__ClazzAssignment_8_in_rule__ImageRef__Group__8__Impl11917);
            rule__ImageRef__ClazzAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getClazzAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__8__Impl


    // $ANTLR start rule__ImageRef__Group__9
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5914:1: rule__ImageRef__Group__9 : rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 ;
    public final void rule__ImageRef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5918:1: ( rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5919:2: rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__911947);
            rule__ImageRef__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__911950);
            rule__ImageRef__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__9


    // $ANTLR start rule__ImageRef__Group__9__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5926:1: rule__ImageRef__Group__9__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5930:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5931:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5931:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5932:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__ImageRef__Group__9__Impl11978); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__9__Impl


    // $ANTLR start rule__ImageRef__Group__10
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5945:1: rule__ImageRef__Group__10 : rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 ;
    public final void rule__ImageRef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5949:1: ( rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5950:2: rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1012009);
            rule__ImageRef__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1012012);
            rule__ImageRef__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__10


    // $ANTLR start rule__ImageRef__Group__10__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5957:1: rule__ImageRef__Group__10__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5961:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5962:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5962:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5963:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_10()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5964:1: ( ruleANY_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_WS && LA59_0<=RULE_SINGLE_NL)||LA59_0==RULE_MULTI_NL) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5964:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__10__Impl12040);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__10__Impl


    // $ANTLR start rule__ImageRef__Group__11
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5974:1: rule__ImageRef__Group__11 : rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 ;
    public final void rule__ImageRef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5978:1: ( rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5979:2: rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1112071);
            rule__ImageRef__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1112074);
            rule__ImageRef__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__11


    // $ANTLR start rule__ImageRef__Group__11__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5986:1: rule__ImageRef__Group__11__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5990:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5991:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5991:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5992:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__11__Impl12102); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__11__Impl


    // $ANTLR start rule__ImageRef__Group__12
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6005:1: rule__ImageRef__Group__12 : rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 ;
    public final void rule__ImageRef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6009:1: ( rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6010:2: rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1212133);
            rule__ImageRef__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1212136);
            rule__ImageRef__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__12


    // $ANTLR start rule__ImageRef__Group__12__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6017:1: rule__ImageRef__Group__12__Impl : ( ( rule__ImageRef__StyleAssignment_12 ) ) ;
    public final void rule__ImageRef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6021:1: ( ( ( rule__ImageRef__StyleAssignment_12 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6022:1: ( ( rule__ImageRef__StyleAssignment_12 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6022:1: ( ( rule__ImageRef__StyleAssignment_12 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6023:1: ( rule__ImageRef__StyleAssignment_12 )
            {
             before(grammarAccess.getImageRefAccess().getStyleAssignment_12()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6024:1: ( rule__ImageRef__StyleAssignment_12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6024:2: rule__ImageRef__StyleAssignment_12
            {
            pushFollow(FOLLOW_rule__ImageRef__StyleAssignment_12_in_rule__ImageRef__Group__12__Impl12163);
            rule__ImageRef__StyleAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getStyleAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__12__Impl


    // $ANTLR start rule__ImageRef__Group__13
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6034:1: rule__ImageRef__Group__13 : rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 ;
    public final void rule__ImageRef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6038:1: ( rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6039:2: rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1312193);
            rule__ImageRef__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1312196);
            rule__ImageRef__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__13


    // $ANTLR start rule__ImageRef__Group__13__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6046:1: rule__ImageRef__Group__13__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6050:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6051:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6051:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6052:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13()); 
            match(input,15,FOLLOW_15_in_rule__ImageRef__Group__13__Impl12224); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__13__Impl


    // $ANTLR start rule__ImageRef__Group__14
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6065:1: rule__ImageRef__Group__14 : rule__ImageRef__Group__14__Impl rule__ImageRef__Group__15 ;
    public final void rule__ImageRef__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6069:1: ( rule__ImageRef__Group__14__Impl rule__ImageRef__Group__15 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6070:2: rule__ImageRef__Group__14__Impl rule__ImageRef__Group__15
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1412255);
            rule__ImageRef__Group__14__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__15_in_rule__ImageRef__Group__1412258);
            rule__ImageRef__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__14


    // $ANTLR start rule__ImageRef__Group__14__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6077:1: rule__ImageRef__Group__14__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6081:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6082:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6082:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6083:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_14()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6084:1: ( ruleANY_WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_WS && LA60_0<=RULE_SINGLE_NL)||LA60_0==RULE_MULTI_NL) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6084:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__14__Impl12286);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__14__Impl


    // $ANTLR start rule__ImageRef__Group__15
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6094:1: rule__ImageRef__Group__15 : rule__ImageRef__Group__15__Impl rule__ImageRef__Group__16 ;
    public final void rule__ImageRef__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6098:1: ( rule__ImageRef__Group__15__Impl rule__ImageRef__Group__16 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6099:2: rule__ImageRef__Group__15__Impl rule__ImageRef__Group__16
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__15__Impl_in_rule__ImageRef__Group__1512317);
            rule__ImageRef__Group__15__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__16_in_rule__ImageRef__Group__1512320);
            rule__ImageRef__Group__16();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__15


    // $ANTLR start rule__ImageRef__Group__15__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6106:1: rule__ImageRef__Group__15__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6110:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6111:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6111:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6112:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_15()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__15__Impl12348); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__15__Impl


    // $ANTLR start rule__ImageRef__Group__16
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6125:1: rule__ImageRef__Group__16 : rule__ImageRef__Group__16__Impl rule__ImageRef__Group__17 ;
    public final void rule__ImageRef__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6129:1: ( rule__ImageRef__Group__16__Impl rule__ImageRef__Group__17 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6130:2: rule__ImageRef__Group__16__Impl rule__ImageRef__Group__17
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__16__Impl_in_rule__ImageRef__Group__1612379);
            rule__ImageRef__Group__16__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__17_in_rule__ImageRef__Group__1612382);
            rule__ImageRef__Group__17();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__16


    // $ANTLR start rule__ImageRef__Group__16__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6137:1: rule__ImageRef__Group__16__Impl : ( ( rule__ImageRef__CaptionAssignment_16 ) ) ;
    public final void rule__ImageRef__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6141:1: ( ( ( rule__ImageRef__CaptionAssignment_16 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6142:1: ( ( rule__ImageRef__CaptionAssignment_16 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6142:1: ( ( rule__ImageRef__CaptionAssignment_16 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6143:1: ( rule__ImageRef__CaptionAssignment_16 )
            {
             before(grammarAccess.getImageRefAccess().getCaptionAssignment_16()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6144:1: ( rule__ImageRef__CaptionAssignment_16 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6144:2: rule__ImageRef__CaptionAssignment_16
            {
            pushFollow(FOLLOW_rule__ImageRef__CaptionAssignment_16_in_rule__ImageRef__Group__16__Impl12409);
            rule__ImageRef__CaptionAssignment_16();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getCaptionAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__16__Impl


    // $ANTLR start rule__ImageRef__Group__17
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6154:1: rule__ImageRef__Group__17 : rule__ImageRef__Group__17__Impl ;
    public final void rule__ImageRef__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6158:1: ( rule__ImageRef__Group__17__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6159:2: rule__ImageRef__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__17__Impl_in_rule__ImageRef__Group__1712439);
            rule__ImageRef__Group__17__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__17


    // $ANTLR start rule__ImageRef__Group__17__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6165:1: rule__ImageRef__Group__17__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6169:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6170:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6170:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6171:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_17()); 
            match(input,15,FOLLOW_15_in_rule__ImageRef__Group__17__Impl12467); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__17__Impl


    // $ANTLR start rule__ImageRef__Group_2__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6220:1: rule__ImageRef__Group_2__0 : rule__ImageRef__Group_2__0__Impl rule__ImageRef__Group_2__1 ;
    public final void rule__ImageRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6224:1: ( rule__ImageRef__Group_2__0__Impl rule__ImageRef__Group_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6225:2: rule__ImageRef__Group_2__0__Impl rule__ImageRef__Group_2__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_2__0__Impl_in_rule__ImageRef__Group_2__012534);
            rule__ImageRef__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_2__1_in_rule__ImageRef__Group_2__012537);
            rule__ImageRef__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__0


    // $ANTLR start rule__ImageRef__Group_2__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6232:1: rule__ImageRef__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ImageRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6236:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6237:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6237:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6238:1: ':'
            {
             before(grammarAccess.getImageRefAccess().getColonKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__ImageRef__Group_2__0__Impl12565); 
             after(grammarAccess.getImageRefAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__0__Impl


    // $ANTLR start rule__ImageRef__Group_2__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6251:1: rule__ImageRef__Group_2__1 : rule__ImageRef__Group_2__1__Impl rule__ImageRef__Group_2__2 ;
    public final void rule__ImageRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6255:1: ( rule__ImageRef__Group_2__1__Impl rule__ImageRef__Group_2__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6256:2: rule__ImageRef__Group_2__1__Impl rule__ImageRef__Group_2__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_2__1__Impl_in_rule__ImageRef__Group_2__112596);
            rule__ImageRef__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_2__2_in_rule__ImageRef__Group_2__112599);
            rule__ImageRef__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__1


    // $ANTLR start rule__ImageRef__Group_2__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6263:1: rule__ImageRef__Group_2__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6267:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6268:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6268:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6269:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6270:1: ( ruleANY_WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_WS && LA61_0<=RULE_SINGLE_NL)||LA61_0==RULE_MULTI_NL) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6270:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_2__1__Impl12627);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__1__Impl


    // $ANTLR start rule__ImageRef__Group_2__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6280:1: rule__ImageRef__Group_2__2 : rule__ImageRef__Group_2__2__Impl rule__ImageRef__Group_2__3 ;
    public final void rule__ImageRef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6284:1: ( rule__ImageRef__Group_2__2__Impl rule__ImageRef__Group_2__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6285:2: rule__ImageRef__Group_2__2__Impl rule__ImageRef__Group_2__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_2__2__Impl_in_rule__ImageRef__Group_2__212658);
            rule__ImageRef__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_2__3_in_rule__ImageRef__Group_2__212661);
            rule__ImageRef__Group_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__2


    // $ANTLR start rule__ImageRef__Group_2__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6292:1: rule__ImageRef__Group_2__2__Impl : ( ( rule__ImageRef__NameAssignment_2_2 ) ) ;
    public final void rule__ImageRef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6296:1: ( ( ( rule__ImageRef__NameAssignment_2_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6297:1: ( ( rule__ImageRef__NameAssignment_2_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6297:1: ( ( rule__ImageRef__NameAssignment_2_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6298:1: ( rule__ImageRef__NameAssignment_2_2 )
            {
             before(grammarAccess.getImageRefAccess().getNameAssignment_2_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6299:1: ( rule__ImageRef__NameAssignment_2_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6299:2: rule__ImageRef__NameAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ImageRef__NameAssignment_2_2_in_rule__ImageRef__Group_2__2__Impl12688);
            rule__ImageRef__NameAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__2__Impl


    // $ANTLR start rule__ImageRef__Group_2__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6309:1: rule__ImageRef__Group_2__3 : rule__ImageRef__Group_2__3__Impl ;
    public final void rule__ImageRef__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6313:1: ( rule__ImageRef__Group_2__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6314:2: rule__ImageRef__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_2__3__Impl_in_rule__ImageRef__Group_2__312718);
            rule__ImageRef__Group_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__3


    // $ANTLR start rule__ImageRef__Group_2__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6320:1: rule__ImageRef__Group_2__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6324:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6325:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6325:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6326:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6327:1: ( ruleANY_WS )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_WS && LA62_0<=RULE_SINGLE_NL)||LA62_0==RULE_MULTI_NL) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6327:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_2__3__Impl12746);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_2__3__Impl


    // $ANTLR start rule__CodeBlock__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6345:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6349:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6350:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__012785);
            rule__CodeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__012788);
            rule__CodeBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__0


    // $ANTLR start rule__CodeBlock__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6357:1: rule__CodeBlock__Group__0__Impl : ( '\\\\code' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6361:1: ( ( '\\\\code' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6362:1: ( '\\\\code' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6362:1: ( '\\\\code' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6363:1: '\\\\code'
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CodeBlock__Group__0__Impl12816); 
             after(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__0__Impl


    // $ANTLR start rule__CodeBlock__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6376:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6380:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6381:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__112847);
            rule__CodeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__112850);
            rule__CodeBlock__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__1


    // $ANTLR start rule__CodeBlock__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6388:1: rule__CodeBlock__Group__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6392:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6393:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6393:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6394:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( ruleANY_WS )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_WS && LA63_0<=RULE_SINGLE_NL)||LA63_0==RULE_MULTI_NL) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group__1__Impl12878);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__1__Impl


    // $ANTLR start rule__CodeBlock__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6405:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6409:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__212909);
            rule__CodeBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__212912);
            rule__CodeBlock__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__2


    // $ANTLR start rule__CodeBlock__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6417:1: rule__CodeBlock__Group__2__Impl : ( ( rule__CodeBlock__Group_2__0 )? ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6421:1: ( ( ( rule__CodeBlock__Group_2__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6422:1: ( ( rule__CodeBlock__Group_2__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6422:1: ( ( rule__CodeBlock__Group_2__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6423:1: ( rule__CodeBlock__Group_2__0 )?
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6424:1: ( rule__CodeBlock__Group_2__0 )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6424:2: rule__CodeBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2__0_in_rule__CodeBlock__Group__2__Impl12939);
                    rule__CodeBlock__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__2__Impl


    // $ANTLR start rule__CodeBlock__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6434:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6438:1: ( rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6439:2: rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__312970);
            rule__CodeBlock__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__4_in_rule__CodeBlock__Group__312973);
            rule__CodeBlock__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__3


    // $ANTLR start rule__CodeBlock__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6446:1: rule__CodeBlock__Group__3__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6450:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6451:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6451:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6452:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__CodeBlock__Group__3__Impl13001); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__3__Impl


    // $ANTLR start rule__CodeBlock__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6465:1: rule__CodeBlock__Group__4 : rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 ;
    public final void rule__CodeBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6469:1: ( rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:2: rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__4__Impl_in_rule__CodeBlock__Group__413032);
            rule__CodeBlock__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__5_in_rule__CodeBlock__Group__413035);
            rule__CodeBlock__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__4


    // $ANTLR start rule__CodeBlock__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6477:1: rule__CodeBlock__Group__4__Impl : ( ( rule__CodeBlock__Alternatives_4 ) ) ;
    public final void rule__CodeBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6481:1: ( ( ( rule__CodeBlock__Alternatives_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6482:1: ( ( rule__CodeBlock__Alternatives_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6482:1: ( ( rule__CodeBlock__Alternatives_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6483:1: ( rule__CodeBlock__Alternatives_4 )
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6484:1: ( rule__CodeBlock__Alternatives_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6484:2: rule__CodeBlock__Alternatives_4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Alternatives_4_in_rule__CodeBlock__Group__4__Impl13062);
            rule__CodeBlock__Alternatives_4();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__4__Impl


    // $ANTLR start rule__CodeBlock__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6494:1: rule__CodeBlock__Group__5 : rule__CodeBlock__Group__5__Impl ;
    public final void rule__CodeBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6498:1: ( rule__CodeBlock__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6499:2: rule__CodeBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__5__Impl_in_rule__CodeBlock__Group__513092);
            rule__CodeBlock__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__5


    // $ANTLR start rule__CodeBlock__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6505:1: rule__CodeBlock__Group__5__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6509:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6510:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6510:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6511:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__CodeBlock__Group__5__Impl13120); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__5__Impl


    // $ANTLR start rule__CodeBlock__Group_2__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6536:1: rule__CodeBlock__Group_2__0 : rule__CodeBlock__Group_2__0__Impl rule__CodeBlock__Group_2__1 ;
    public final void rule__CodeBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6540:1: ( rule__CodeBlock__Group_2__0__Impl rule__CodeBlock__Group_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6541:2: rule__CodeBlock__Group_2__0__Impl rule__CodeBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__0__Impl_in_rule__CodeBlock__Group_2__013163);
            rule__CodeBlock__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2__1_in_rule__CodeBlock__Group_2__013166);
            rule__CodeBlock__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__0


    // $ANTLR start rule__CodeBlock__Group_2__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6548:1: rule__CodeBlock__Group_2__0__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6552:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6553:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6553:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6554:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__CodeBlock__Group_2__0__Impl13194); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6567:1: rule__CodeBlock__Group_2__1 : rule__CodeBlock__Group_2__1__Impl rule__CodeBlock__Group_2__2 ;
    public final void rule__CodeBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6571:1: ( rule__CodeBlock__Group_2__1__Impl rule__CodeBlock__Group_2__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6572:2: rule__CodeBlock__Group_2__1__Impl rule__CodeBlock__Group_2__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__1__Impl_in_rule__CodeBlock__Group_2__113225);
            rule__CodeBlock__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2__2_in_rule__CodeBlock__Group_2__113228);
            rule__CodeBlock__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__1


    // $ANTLR start rule__CodeBlock__Group_2__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6579:1: rule__CodeBlock__Group_2__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6583:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6584:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6584:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6585:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6586:1: ( ruleANY_WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_WS && LA65_0<=RULE_SINGLE_NL)||LA65_0==RULE_MULTI_NL) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6586:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__1__Impl13256);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__1__Impl


    // $ANTLR start rule__CodeBlock__Group_2__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6596:1: rule__CodeBlock__Group_2__2 : rule__CodeBlock__Group_2__2__Impl rule__CodeBlock__Group_2__3 ;
    public final void rule__CodeBlock__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6600:1: ( rule__CodeBlock__Group_2__2__Impl rule__CodeBlock__Group_2__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6601:2: rule__CodeBlock__Group_2__2__Impl rule__CodeBlock__Group_2__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__2__Impl_in_rule__CodeBlock__Group_2__213287);
            rule__CodeBlock__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2__3_in_rule__CodeBlock__Group_2__213290);
            rule__CodeBlock__Group_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__2


    // $ANTLR start rule__CodeBlock__Group_2__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6608:1: rule__CodeBlock__Group_2__2__Impl : ( ( rule__CodeBlock__LanguageAssignment_2_2 ) ) ;
    public final void rule__CodeBlock__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6612:1: ( ( ( rule__CodeBlock__LanguageAssignment_2_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6613:1: ( ( rule__CodeBlock__LanguageAssignment_2_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6613:1: ( ( rule__CodeBlock__LanguageAssignment_2_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6614:1: ( rule__CodeBlock__LanguageAssignment_2_2 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_2_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:1: ( rule__CodeBlock__LanguageAssignment_2_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:2: rule__CodeBlock__LanguageAssignment_2_2
            {
            pushFollow(FOLLOW_rule__CodeBlock__LanguageAssignment_2_2_in_rule__CodeBlock__Group_2__2__Impl13317);
            rule__CodeBlock__LanguageAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getLanguageAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__2__Impl


    // $ANTLR start rule__CodeBlock__Group_2__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6625:1: rule__CodeBlock__Group_2__3 : rule__CodeBlock__Group_2__3__Impl rule__CodeBlock__Group_2__4 ;
    public final void rule__CodeBlock__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6629:1: ( rule__CodeBlock__Group_2__3__Impl rule__CodeBlock__Group_2__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6630:2: rule__CodeBlock__Group_2__3__Impl rule__CodeBlock__Group_2__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__3__Impl_in_rule__CodeBlock__Group_2__313347);
            rule__CodeBlock__Group_2__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2__4_in_rule__CodeBlock__Group_2__313350);
            rule__CodeBlock__Group_2__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__3


    // $ANTLR start rule__CodeBlock__Group_2__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6637:1: rule__CodeBlock__Group_2__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6641:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6642:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6642:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6643:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6644:1: ( ruleANY_WS )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_WS && LA66_0<=RULE_SINGLE_NL)||LA66_0==RULE_MULTI_NL) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6644:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__3__Impl13378);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__3__Impl


    // $ANTLR start rule__CodeBlock__Group_2__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6654:1: rule__CodeBlock__Group_2__4 : rule__CodeBlock__Group_2__4__Impl rule__CodeBlock__Group_2__5 ;
    public final void rule__CodeBlock__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6658:1: ( rule__CodeBlock__Group_2__4__Impl rule__CodeBlock__Group_2__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6659:2: rule__CodeBlock__Group_2__4__Impl rule__CodeBlock__Group_2__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__4__Impl_in_rule__CodeBlock__Group_2__413409);
            rule__CodeBlock__Group_2__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2__5_in_rule__CodeBlock__Group_2__413412);
            rule__CodeBlock__Group_2__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__4


    // $ANTLR start rule__CodeBlock__Group_2__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6666:1: rule__CodeBlock__Group_2__4__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6670:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6671:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6671:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6672:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,15,FOLLOW_15_in_rule__CodeBlock__Group_2__4__Impl13440); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__4__Impl


    // $ANTLR start rule__CodeBlock__Group_2__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6685:1: rule__CodeBlock__Group_2__5 : rule__CodeBlock__Group_2__5__Impl ;
    public final void rule__CodeBlock__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6689:1: ( rule__CodeBlock__Group_2__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6690:2: rule__CodeBlock__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2__5__Impl_in_rule__CodeBlock__Group_2__513471);
            rule__CodeBlock__Group_2__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__5


    // $ANTLR start rule__CodeBlock__Group_2__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6696:1: rule__CodeBlock__Group_2__5__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6700:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6701:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6701:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6702:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6703:1: ( ruleANY_WS )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_WS && LA67_0<=RULE_SINGLE_NL)||LA67_0==RULE_MULTI_NL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6703:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__5__Impl13499);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2__5__Impl


    // $ANTLR start rule__CodeBlock__Group_4_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: rule__CodeBlock__Group_4_0__0 : rule__CodeBlock__Group_4_0__0__Impl rule__CodeBlock__Group_4_0__1 ;
    public final void rule__CodeBlock__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6729:1: ( rule__CodeBlock__Group_4_0__0__Impl rule__CodeBlock__Group_4_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6730:2: rule__CodeBlock__Group_4_0__0__Impl rule__CodeBlock__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0__0__Impl_in_rule__CodeBlock__Group_4_0__013542);
            rule__CodeBlock__Group_4_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0__1_in_rule__CodeBlock__Group_4_0__013545);
            rule__CodeBlock__Group_4_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0__0


    // $ANTLR start rule__CodeBlock__Group_4_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6737:1: rule__CodeBlock__Group_4_0__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_4_0_0 ) ) ;
    public final void rule__CodeBlock__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6741:1: ( ( ( rule__CodeBlock__ContentsAssignment_4_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6742:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6742:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6743:1: ( rule__CodeBlock__ContentsAssignment_4_0_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6744:1: ( rule__CodeBlock__ContentsAssignment_4_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6744:2: rule__CodeBlock__ContentsAssignment_4_0_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_0_in_rule__CodeBlock__Group_4_0__0__Impl13572);
            rule__CodeBlock__ContentsAssignment_4_0_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0__0__Impl


    // $ANTLR start rule__CodeBlock__Group_4_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6754:1: rule__CodeBlock__Group_4_0__1 : rule__CodeBlock__Group_4_0__1__Impl ;
    public final void rule__CodeBlock__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6758:1: ( rule__CodeBlock__Group_4_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6759:2: rule__CodeBlock__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0__1__Impl_in_rule__CodeBlock__Group_4_0__113602);
            rule__CodeBlock__Group_4_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0__1


    // $ANTLR start rule__CodeBlock__Group_4_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6765:1: rule__CodeBlock__Group_4_0__1__Impl : ( ( rule__CodeBlock__Group_4_0_1__0 )* ) ;
    public final void rule__CodeBlock__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6769:1: ( ( ( rule__CodeBlock__Group_4_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ( rule__CodeBlock__Group_4_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ( rule__CodeBlock__Group_4_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6771:1: ( rule__CodeBlock__Group_4_0_1__0 )*
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_4_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6772:1: ( rule__CodeBlock__Group_4_0_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=20 && LA68_0<=22)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6772:2: rule__CodeBlock__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CodeBlock__Group_4_0_1__0_in_rule__CodeBlock__Group_4_0__1__Impl13629);
            	    rule__CodeBlock__Group_4_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getGroup_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0__1__Impl


    // $ANTLR start rule__CodeBlock__Group_4_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6786:1: rule__CodeBlock__Group_4_0_1__0 : rule__CodeBlock__Group_4_0_1__0__Impl rule__CodeBlock__Group_4_0_1__1 ;
    public final void rule__CodeBlock__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6790:1: ( rule__CodeBlock__Group_4_0_1__0__Impl rule__CodeBlock__Group_4_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6791:2: rule__CodeBlock__Group_4_0_1__0__Impl rule__CodeBlock__Group_4_0_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0_1__0__Impl_in_rule__CodeBlock__Group_4_0_1__013664);
            rule__CodeBlock__Group_4_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0_1__1_in_rule__CodeBlock__Group_4_0_1__013667);
            rule__CodeBlock__Group_4_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0_1__0


    // $ANTLR start rule__CodeBlock__Group_4_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6798:1: rule__CodeBlock__Group_4_0_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_4_0_1_0 ) ) ;
    public final void rule__CodeBlock__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6802:1: ( ( ( rule__CodeBlock__ContentsAssignment_4_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6803:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6803:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6804:1: ( rule__CodeBlock__ContentsAssignment_4_0_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6805:1: ( rule__CodeBlock__ContentsAssignment_4_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6805:2: rule__CodeBlock__ContentsAssignment_4_0_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_1_0_in_rule__CodeBlock__Group_4_0_1__0__Impl13694);
            rule__CodeBlock__ContentsAssignment_4_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_4_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6815:1: rule__CodeBlock__Group_4_0_1__1 : rule__CodeBlock__Group_4_0_1__1__Impl ;
    public final void rule__CodeBlock__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6819:1: ( rule__CodeBlock__Group_4_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6820:2: rule__CodeBlock__Group_4_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_0_1__1__Impl_in_rule__CodeBlock__Group_4_0_1__113724);
            rule__CodeBlock__Group_4_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0_1__1


    // $ANTLR start rule__CodeBlock__Group_4_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6826:1: rule__CodeBlock__Group_4_0_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )? ) ;
    public final void rule__CodeBlock__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6830:1: ( ( ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6831:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6831:1: ( ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6832:1: ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6833:1: ( rule__CodeBlock__ContentsAssignment_4_0_1_1 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_MULTI_NL)||(LA69_0>=10 && LA69_0<=12)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6833:2: rule__CodeBlock__ContentsAssignment_4_0_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_1_1_in_rule__CodeBlock__Group_4_0_1__1__Impl13751);
                    rule__CodeBlock__ContentsAssignment_4_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_0_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_4_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6847:1: rule__CodeBlock__Group_4_1__0 : rule__CodeBlock__Group_4_1__0__Impl rule__CodeBlock__Group_4_1__1 ;
    public final void rule__CodeBlock__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6851:1: ( rule__CodeBlock__Group_4_1__0__Impl rule__CodeBlock__Group_4_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6852:2: rule__CodeBlock__Group_4_1__0__Impl rule__CodeBlock__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_1__0__Impl_in_rule__CodeBlock__Group_4_1__013786);
            rule__CodeBlock__Group_4_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_4_1__1_in_rule__CodeBlock__Group_4_1__013789);
            rule__CodeBlock__Group_4_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_1__0


    // $ANTLR start rule__CodeBlock__Group_4_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6859:1: rule__CodeBlock__Group_4_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_4_1_0 ) ) ;
    public final void rule__CodeBlock__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6863:1: ( ( ( rule__CodeBlock__ContentsAssignment_4_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ( rule__CodeBlock__ContentsAssignment_4_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ( rule__CodeBlock__ContentsAssignment_4_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6865:1: ( rule__CodeBlock__ContentsAssignment_4_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6866:1: ( rule__CodeBlock__ContentsAssignment_4_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6866:2: rule__CodeBlock__ContentsAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_4_1_0_in_rule__CodeBlock__Group_4_1__0__Impl13816);
            rule__CodeBlock__ContentsAssignment_4_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_4_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6876:1: rule__CodeBlock__Group_4_1__1 : rule__CodeBlock__Group_4_1__1__Impl ;
    public final void rule__CodeBlock__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6880:1: ( rule__CodeBlock__Group_4_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6881:2: rule__CodeBlock__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_4_1__1__Impl_in_rule__CodeBlock__Group_4_1__113846);
            rule__CodeBlock__Group_4_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_1__1


    // $ANTLR start rule__CodeBlock__Group_4_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6887:1: rule__CodeBlock__Group_4_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_4_1_1 )? ) ;
    public final void rule__CodeBlock__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6891:1: ( ( ( rule__CodeBlock__ContentsAssignment_4_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6892:1: ( ( rule__CodeBlock__ContentsAssignment_4_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6892:1: ( ( rule__CodeBlock__ContentsAssignment_4_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6893:1: ( rule__CodeBlock__ContentsAssignment_4_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6894:1: ( rule__CodeBlock__ContentsAssignment_4_1_1 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_MULTI_NL)||(LA70_0>=10 && LA70_0<=12)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6894:2: rule__CodeBlock__ContentsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_4_1_1_in_rule__CodeBlock__Group_4_1__1__Impl13873);
                    rule__CodeBlock__ContentsAssignment_4_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_4_1__1__Impl


    // $ANTLR start rule__Document__ChaptersAssignment_3_0_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6909:1: rule__Document__ChaptersAssignment_3_0_0_0 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6913:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6914:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6914:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6915:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_013913);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ChaptersAssignment_3_0_0_0


    // $ANTLR start rule__Document__ChaptersAssignment_3_0_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6924:1: rule__Document__ChaptersAssignment_3_0_0_1_1 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6928:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6929:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6929:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6930:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_113944);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ChaptersAssignment_3_0_0_1_1


    // $ANTLR start rule__Document__SectionsAssignment_3_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6939:1: rule__Document__SectionsAssignment_3_0_1_0 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6945:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_013975);
            ruleSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_1_0


    // $ANTLR start rule__Document__SectionsAssignment_3_0_1_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6954:1: rule__Document__SectionsAssignment_3_0_1_1_1 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6960:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_114006);
            ruleSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_1_1_1


    // $ANTLR start rule__Document__SubsectionsAssignment_3_0_2_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6969:1: rule__Document__SubsectionsAssignment_3_0_2_0 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6975:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_014037);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SubsectionsAssignment_3_0_2_0


    // $ANTLR start rule__Document__SubsectionsAssignment_3_0_2_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6984:1: rule__Document__SubsectionsAssignment_3_0_2_1_1 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6990:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_114068);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SubsectionsAssignment_3_0_2_1_1


    // $ANTLR start rule__Chapter__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6999:1: rule__Chapter__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7005:1: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_1_114099); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__NameAssignment_1_1


    // $ANTLR start rule__Chapter__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7014:1: rule__Chapter__TitleAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7020:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_314130);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__TitleAssignment_3


    // $ANTLR start rule__Chapter__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7029:1: rule__Chapter__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7035:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_5_114161);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_5_1


    // $ANTLR start rule__Chapter__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7044:1: rule__Chapter__ContentsAssignment_6_1 : ( ruleSection ) ;
    public final void rule__Chapter__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7050:1: ruleSection
            {
             before(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_6_114192);
            ruleSection();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_6_1


    // $ANTLR start rule__Section__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7059:1: rule__Section__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7065:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_1_114223); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__NameAssignment_1_1


    // $ANTLR start rule__Section__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7074:1: rule__Section__TitleAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7080:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_314254);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__TitleAssignment_3


    // $ANTLR start rule__Section__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7089:1: rule__Section__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7093:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7094:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7094:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7095:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_5_114285);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_5_1


    // $ANTLR start rule__Section__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7104:1: rule__Section__ContentsAssignment_6_1 : ( ruleSubSection ) ;
    public final void rule__Section__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7108:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7109:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7109:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7110:1: ruleSubSection
            {
             before(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_6_114316);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_6_1


    // $ANTLR start rule__SubSection__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7119:1: rule__SubSection__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SubSection__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7123:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7124:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7124:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7125:1: RULE_ID
            {
             before(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_1_114347); 
             after(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__NameAssignment_1_1


    // $ANTLR start rule__SubSection__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7134:1: rule__SubSection__TitleAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7138:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7139:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7139:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7140:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_314378);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__TitleAssignment_3


    // $ANTLR start rule__SubSection__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7149:1: rule__SubSection__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7154:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7154:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_5_114409);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_5_1


    // $ANTLR start rule__SubSection__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7164:1: rule__SubSection__ContentsAssignment_6_1 : ( ruleSection3 ) ;
    public final void rule__SubSection__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7168:1: ( ( ruleSection3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7169:1: ( ruleSection3 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7169:1: ( ruleSection3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7170:1: ruleSection3
            {
             before(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_6_114440);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_6_1


    // $ANTLR start rule__Section3__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7179:1: rule__Section3__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section3__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7183:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7184:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7184:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7185:1: RULE_ID
            {
             before(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_1_114471); 
             after(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__NameAssignment_1_1


    // $ANTLR start rule__Section3__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7194:1: rule__Section3__TitleAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7198:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7199:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7199:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7200:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_314502);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__TitleAssignment_3


    // $ANTLR start rule__Section3__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7209:1: rule__Section3__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7213:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7214:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7214:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7215:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_5_114533);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_5_1


    // $ANTLR start rule__Section3__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7224:1: rule__Section3__ContentsAssignment_6_1 : ( ruleSection4 ) ;
    public final void rule__Section3__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7228:1: ( ( ruleSection4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7229:1: ( ruleSection4 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7229:1: ( ruleSection4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7230:1: ruleSection4
            {
             before(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_6_114564);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_6_1


    // $ANTLR start rule__Section4__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7239:1: rule__Section4__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section4__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7243:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7244:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7244:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7245:1: RULE_ID
            {
             before(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_1_114595); 
             after(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__NameAssignment_1_1


    // $ANTLR start rule__Section4__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7254:1: rule__Section4__TitleAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7258:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7259:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7259:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7260:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_314626);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__TitleAssignment_3


    // $ANTLR start rule__Section4__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7269:1: rule__Section4__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7273:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7274:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7274:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7275:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_5_114657);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_5_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7284:1: rule__TextOrMarkup__ContentsAssignment_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7288:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7289:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7289:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7290:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_014688);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7299:1: rule__TextOrMarkup__ContentsAssignment_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7303:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7304:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7304:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7305:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_014719);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7314:1: rule__TextOrMarkup__ContentsAssignment_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7318:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7319:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7319:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7320:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_114750);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_1_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7329:1: rule__TextOrMarkup__ContentsAssignment_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7333:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7334:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7334:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7335:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_014781);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7344:1: rule__TextOrMarkup__ContentsAssignment_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7348:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7349:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7349:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7350:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_114812);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_1


    // $ANTLR start rule__TextPart__TextAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7359:1: rule__TextPart__TextAssignment : ( ruleText ) ;
    public final void rule__TextPart__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7363:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7364:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7364:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7365:1: ruleText
            {
             before(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__TextPart__TextAssignment14843);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextPart__TextAssignment


    // $ANTLR start rule__Emphasize__ContentsAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7374:1: rule__Emphasize__ContentsAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Emphasize__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7378:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7379:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7379:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7380:1: ruleTextOrMarkup
            {
             before(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_314874);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__ContentsAssignment_3


    // $ANTLR start rule__Anchor__NameAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7389:1: rule__Anchor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Anchor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7393:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7394:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7394:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7395:1: RULE_ID
            {
             before(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_214905); 
             after(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__NameAssignment_2


    // $ANTLR start rule__Ref__RefAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7404:1: rule__Ref__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7408:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7409:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7409:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7410:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7411:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7412:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_214940); 
             after(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__RefAssignment_2


    // $ANTLR start rule__Ref__ContentsAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7423:1: rule__Ref__ContentsAssignment_5 : ( ruleTextOrMarkup ) ;
    public final void rule__Ref__ContentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7427:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7428:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7428:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7429:1: ruleTextOrMarkup
            {
             before(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_514975);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__ContentsAssignment_5


    // $ANTLR start rule__OrderedList__ItemsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7438:1: rule__OrderedList__ItemsAssignment_3_1 : ( ruleItem ) ;
    public final void rule__OrderedList__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7442:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7443:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7443:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7444:1: ruleItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_3_115006);
            ruleItem();
            _fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__ItemsAssignment_3_1


    // $ANTLR start rule__UnorderedList__ItemsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7453:1: rule__UnorderedList__ItemsAssignment_3_1 : ( ruleItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7457:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7458:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7458:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7459:1: ruleItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_3_115037);
            ruleItem();
            _fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__ItemsAssignment_3_1


    // $ANTLR start rule__Item__ContentsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7468:1: rule__Item__ContentsAssignment_4 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7472:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7473:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7473:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7474:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_415068);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_4


    // $ANTLR start rule__Item__ContentsAssignment_5_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7483:1: rule__Item__ContentsAssignment_5_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7487:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7488:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7488:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7489:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_5_115099);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_5_1


    // $ANTLR start rule__CodeRef__ElementAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7498:1: rule__CodeRef__ElementAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__CodeRef__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7502:1: ( ( ( ruleText ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7503:1: ( ( ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7503:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7504:1: ( ruleText )
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7505:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7506:1: ruleText
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_315134);
            ruleText();
            _fsp--;

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__ElementAssignment_3


    // $ANTLR start rule__Link__UrlAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7517:1: rule__Link__UrlAssignment_3 : ( ruleText ) ;
    public final void rule__Link__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7521:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7522:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7522:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7523:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__UrlAssignment_315169);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__UrlAssignment_3


    // $ANTLR start rule__Link__TextAssignment_7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7532:1: rule__Link__TextAssignment_7 : ( ruleText ) ;
    public final void rule__Link__TextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7536:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7537:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7537:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7538:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getTextTextParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__TextAssignment_715200);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getTextTextParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__TextAssignment_7


    // $ANTLR start rule__ImageRef__NameAssignment_2_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7547:1: rule__ImageRef__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__ImageRef__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7551:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7552:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7552:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7553:1: RULE_ID
            {
             before(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_2_215231); 
             after(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__NameAssignment_2_2


    // $ANTLR start rule__ImageRef__PathAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7562:1: rule__ImageRef__PathAssignment_4 : ( ruleText ) ;
    public final void rule__ImageRef__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7566:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7567:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7567:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7568:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_415262);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__PathAssignment_4


    // $ANTLR start rule__ImageRef__ClazzAssignment_8
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7577:1: rule__ImageRef__ClazzAssignment_8 : ( ruleText ) ;
    public final void rule__ImageRef__ClazzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7581:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7582:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7582:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7583:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_815293);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__ClazzAssignment_8


    // $ANTLR start rule__ImageRef__StyleAssignment_12
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7592:1: rule__ImageRef__StyleAssignment_12 : ( ruleText ) ;
    public final void rule__ImageRef__StyleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7596:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7597:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7597:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7598:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_1215324);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__StyleAssignment_12


    // $ANTLR start rule__ImageRef__CaptionAssignment_16
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7607:1: rule__ImageRef__CaptionAssignment_16 : ( ruleText ) ;
    public final void rule__ImageRef__CaptionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7611:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7612:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7612:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7613:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_16_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1615355);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__CaptionAssignment_16


    // $ANTLR start rule__CodeBlock__LanguageAssignment_2_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7622:1: rule__CodeBlock__LanguageAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__CodeBlock__LanguageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7626:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7627:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7627:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7628:1: RULE_ID
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_2_215386); 
             after(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__LanguageAssignment_2_2


    // $ANTLR start rule__CodeBlock__ContentsAssignment_4_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7637:1: rule__CodeBlock__ContentsAssignment_4_0_0 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7641:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7642:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7642:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7643:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_0_015417);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_4_0_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_4_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7652:1: rule__CodeBlock__ContentsAssignment_4_0_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7656:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7657:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7657:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7658:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_4_0_1_015448);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_4_0_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_4_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7667:1: rule__CodeBlock__ContentsAssignment_4_0_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7671:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7672:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7672:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7673:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_0_1_115479);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_4_0_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_4_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7682:1: rule__CodeBlock__ContentsAssignment_4_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7686:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7687:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7687:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7688:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_4_1_015510);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_4_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_4_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7697:1: rule__CodeBlock__ContentsAssignment_4_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7701:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7702:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7702:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7703:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_1_115541);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_4_1_1


    // $ANTLR start rule__Code__ContentsAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7712:1: rule__Code__ContentsAssignment : ( ruleCodeText ) ;
    public final void rule__Code__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7716:1: ( ( ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7717:1: ( ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7717:1: ( ruleCodeText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7718:1: ruleCodeText
            {
             before(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment15572);
            ruleCodeText();
            _fsp--;

             after(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Code__ContentsAssignment


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA43_eotS =
        "\6\uffff";
    static final String DFA43_eofS =
        "\6\uffff";
    static final String DFA43_minS =
        "\4\5\2\uffff";
    static final String DFA43_maxS =
        "\4\31\2\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA43_specialS =
        "\6\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 4512:1: ( rule__OrderedList__Group_3__0 )*";
        }
    }
    static final String DFA47_eotS =
        "\6\uffff";
    static final String DFA47_eofS =
        "\6\uffff";
    static final String DFA47_minS =
        "\4\5\2\uffff";
    static final String DFA47_maxS =
        "\4\31\2\uffff";
    static final String DFA47_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA47_specialS =
        "\6\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\6\uffff\1\4\11\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 4771:1: ( rule__UnorderedList__Group_3__0 )*";
        }
    }
    static final String DFA64_eotS =
        "\32\uffff";
    static final String DFA64_eofS =
        "\12\uffff\1\6\4\uffff\3\6\1\uffff\7\6";
    static final String DFA64_minS =
        "\1\16\5\4\1\uffff\13\4\1\uffff\7\4";
    static final String DFA64_maxS =
        "\1\16\5\26\1\uffff\3\26\1\35\4\26\3\35\1\uffff\7\35";
    static final String DFA64_acceptS =
        "\6\uffff\1\2\13\uffff\1\1\7\uffff";
    static final String DFA64_specialS =
        "\32\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1",
            "\1\2\1\4\1\5\1\6\1\3\1\uffff\3\6\7\uffff\3\6",
            "\1\6\1\10\1\11\1\6\1\7\1\uffff\3\6\2\uffff\1\12\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "",
            "\1\6\1\10\1\11\1\6\1\7\1\uffff\3\6\2\uffff\1\12\4\uffff\3\6",
            "\1\6\1\10\1\11\1\6\1\7\1\uffff\3\6\2\uffff\1\12\4\uffff\3\6",
            "\1\6\1\10\1\11\1\6\1\7\1\uffff\3\6\2\uffff\1\12\4\uffff\3\6",
            "\1\6\1\17\1\20\1\6\1\21\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\10\1\11\1\6\1\7\1\uffff\3\6\2\uffff\1\12\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "\1\13\1\16\1\15\1\6\1\14\1\uffff\3\6\2\uffff\1\6\4\uffff\3\6",
            "\1\6\1\23\1\24\1\6\1\21\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\23\1\24\1\6\1\21\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\26\1\25\1\6\1\22\1\uffff\4\6\1\22\12\6\1\uffff\4\6",
            "",
            "\1\6\1\23\1\24\1\6\1\21\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\23\1\24\1\6\1\21\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\27\1\30\1\6\1\31\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\27\1\30\1\6\1\31\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\27\1\30\1\6\1\31\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\27\1\30\1\6\1\31\1\uffff\3\6\1\uffff\1\22\1\6\4\uffff"+
            "\5\6\1\uffff\4\6",
            "\1\6\1\26\1\25\1\6\1\22\1\uffff\4\6\1\22\1\uffff\11\6\1\uffff"+
            "\4\6"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "6424:1: ( rule__CodeBlock__Group_2__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0_in_ruleChapter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0_in_ruleSection214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0_in_ruleSection3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0_in_ruleSection4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText578 = new BitSet(new long[]{0x0000000000001CF2L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText590 = new BitSet(new long[]{0x0000000000001CF2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0_in_ruleAnchor773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435 = new BitSet(new long[]{0x0000000000001DF2L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447 = new BitSet(new long[]{0x0000000000001DF2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1636 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1648 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Text__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Text__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Text__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Text__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Text__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkUp__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__MarkUp__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0__0_in_rule__CodeBlock__Alternatives_41995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_1__0_in_rule__CodeBlock__Alternatives_42015 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_1__0_in_rule__CodeBlock__Alternatives_42027 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__CodeText__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CodeText__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CodeText__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02353 = new BitSet(new long[]{0x0000000000032122L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12414 = new BitSet(new long[]{0x0000000000032102L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22476 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02604 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__02727 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__02730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl2814 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__02849 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__02852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__12908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__02969 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__02972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3056 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03091 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03211 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3298 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03333 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03453 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chapter__Group__0__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13515 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__0_in_rule__Chapter__Group__1__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23576 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chapter__Group__2__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33638 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__TitleAssignment_3_in_rule__Chapter__Group__3__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43698 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__5_in_rule__Chapter__Group__43701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Chapter__Group__4__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__5__Impl_in_rule__Chapter__Group__53760 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__6_in_rule__Chapter__Group__53763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_5__0_in_rule__Chapter__Group__5__Impl3790 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__6__Impl_in_rule__Chapter__Group__63821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__0_in_rule__Chapter__Group__6__Impl3848 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__0__Impl_in_rule__Chapter__Group_1__03893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__1_in_rule__Chapter__Group_1__03896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Chapter__Group_1__0__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__1__Impl_in_rule__Chapter__Group_1__13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__NameAssignment_1_1_in_rule__Chapter__Group_1__1__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_5__0__Impl_in_rule__Chapter__Group_5__04016 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Chapter__Group_5__1_in_rule__Chapter__Group_5__04019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_5__0__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_5__1__Impl_in_rule__Chapter__Group_5__14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_5_1_in_rule__Chapter__Group_5__1__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__0__Impl_in_rule__Chapter__Group_6__04136 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__1_in_rule__Chapter__Group_6__04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_6__0__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__1__Impl_in_rule__Chapter__Group_6__14195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_6_1_in_rule__Chapter__Group_6__1__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04256 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group__0__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14318 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_1__0_in_rule__Section__Group__1__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24379 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section__Group__2__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44501 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group__4__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54563 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl4593 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl4651 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group_1__0__Impl_in_rule__Section__Group_1__04696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group_1__1_in_rule__Section__Group_1__04699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Section__Group_1__0__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_1__1__Impl_in_rule__Section__Group_1__14758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_1_1_in_rule__Section__Group_1__1__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__04819 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__04822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_5__0__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__14878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_5_1_in_rule__Section__Group_5__1__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__04939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__04942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_6__0__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__14998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_6_1_in_rule__Section__Group_6__1__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05059 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubSection__Group__0__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15121 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__0_in_rule__SubSection__Group__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25182 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubSection__Group__2__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35244 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__TitleAssignment_3_in_rule__SubSection__Group__3__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45304 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__5_in_rule__SubSection__Group__45307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubSection__Group__4__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__5__Impl_in_rule__SubSection__Group__55366 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__6_in_rule__SubSection__Group__55369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_5__0_in_rule__SubSection__Group__5__Impl5396 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__6__Impl_in_rule__SubSection__Group__65427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__0_in_rule__SubSection__Group__6__Impl5454 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__0__Impl_in_rule__SubSection__Group_1__05499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__1_in_rule__SubSection__Group_1__05502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SubSection__Group_1__0__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__1__Impl_in_rule__SubSection__Group_1__15561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__NameAssignment_1_1_in_rule__SubSection__Group_1__1__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_5__0__Impl_in_rule__SubSection__Group_5__05622 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__SubSection__Group_5__1_in_rule__SubSection__Group_5__05625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_5__0__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_5__1__Impl_in_rule__SubSection__Group_5__15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_5_1_in_rule__SubSection__Group_5__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__0__Impl_in_rule__SubSection__Group_6__05742 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__1_in_rule__SubSection__Group_6__05745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_6__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__1__Impl_in_rule__SubSection__Group_6__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_6_1_in_rule__SubSection__Group_6__1__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05862 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section3__Group__0__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__15924 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__15927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__0_in_rule__Section3__Group__1__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__25985 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__25988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section3__Group__2__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__TitleAssignment_3_in_rule__Section3__Group__3__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46107 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__5_in_rule__Section3__Group__46110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section3__Group__4__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__5__Impl_in_rule__Section3__Group__56169 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__6_in_rule__Section3__Group__56172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_5__0_in_rule__Section3__Group__5__Impl6199 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__6__Impl_in_rule__Section3__Group__66230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__0_in_rule__Section3__Group__6__Impl6257 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__0__Impl_in_rule__Section3__Group_1__06302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__1_in_rule__Section3__Group_1__06305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Section3__Group_1__0__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__1__Impl_in_rule__Section3__Group_1__16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__NameAssignment_1_1_in_rule__Section3__Group_1__1__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_5__0__Impl_in_rule__Section3__Group_5__06425 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section3__Group_5__1_in_rule__Section3__Group_5__06428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_5__0__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_5__1__Impl_in_rule__Section3__Group_5__16484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_5_1_in_rule__Section3__Group_5__1__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__0__Impl_in_rule__Section3__Group_6__06545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__1_in_rule__Section3__Group_6__06548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_6__0__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__1__Impl_in_rule__Section3__Group_6__16604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_6_1_in_rule__Section3__Group_6__1__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06665 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section4__Group__0__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__0_in_rule__Section4__Group__1__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26788 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section4__Group__2__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section4__Group__4_in_rule__Section4__Group__36853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__TitleAssignment_3_in_rule__Section4__Group__3__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__4__Impl_in_rule__Section4__Group__46910 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group__5_in_rule__Section4__Group__46913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section4__Group__4__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__5__Impl_in_rule__Section4__Group__56972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_5__0_in_rule__Section4__Group__5__Impl6999 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__0__Impl_in_rule__Section4__Group_1__07042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__1_in_rule__Section4__Group_1__07045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Section4__Group_1__0__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__1__Impl_in_rule__Section4__Group_1__17104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__NameAssignment_1_1_in_rule__Section4__Group_1__1__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_5__0__Impl_in_rule__Section4__Group_5__07165 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Section4__Group_5__1_in_rule__Section4__Group_5__07168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_5__0__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_5__1__Impl_in_rule__Section4__Group_5__17224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_5_1_in_rule__Section4__Group_5__1__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07285 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7372 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07407 = new BitSet(new long[]{0x0000000000001CF2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07529 = new BitSet(new long[]{0x0000000000001CF2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Emphasize__Group__0__Impl7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17713 = new BitSet(new long[]{0x000000003DF01DF0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Emphasize__Group__1__Impl7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27775 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__2__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37837 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__ContentsAssignment_3_in_rule__Emphasize__Group__3__Impl7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47897 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__5_in_rule__Emphasize__Group__47900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__4__Impl7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__5__Impl_in_rule__Emphasize__Group__57959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Emphasize__Group__5__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08030 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Anchor__Group__0__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Anchor__Group__1__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28154 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__3_in_rule__Anchor__Group__28157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__NameAssignment_2_in_rule__Anchor__Group__2__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__3__Impl_in_rule__Anchor__Group__38214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__0_in_rule__Anchor__Group__3__Impl8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__0__Impl_in_rule__Anchor__Group_3__08280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__1_in_rule__Anchor__Group_3__08283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Anchor__Group_3__0__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__1__Impl_in_rule__Anchor__Group_3__18342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Anchor__Group_3__1__Impl8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Ref__Group__0__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Ref__Group__1__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__RefAssignment_2_in_rule__Ref__Group__2__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38589 = new BitSet(new long[]{0x000000003DF01DF0L});
    public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Ref__Group__3__Impl8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48651 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__4__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58713 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__ContentsAssignment_5_in_rule__Ref__Group__5__Impl8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68773 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__68776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__6__Impl8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__78835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Ref__Group__7__Impl8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08910 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OrderedList__Group__0__Impl8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__1__Impl9003 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__29034 = new BitSet(new long[]{0x0000000002000160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__29037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OrderedList__Group__2__Impl9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__39096 = new BitSet(new long[]{0x0000000000008160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__4_in_rule__OrderedList__Group__39099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_3__0_in_rule__OrderedList__Group__3__Impl9128 = new BitSet(new long[]{0x0000000002000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_3__0_in_rule__OrderedList__Group__3__Impl9140 = new BitSet(new long[]{0x0000000002000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__4__Impl_in_rule__OrderedList__Group__49173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__5_in_rule__OrderedList__Group__49176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__4__Impl9204 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__5__Impl_in_rule__OrderedList__Group__59235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OrderedList__Group__5__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_3__0__Impl_in_rule__OrderedList__Group_3__09306 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_3__1_in_rule__OrderedList__Group_3__09309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_3__0__Impl9337 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_3__1__Impl_in_rule__OrderedList__Group_3__19368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_3_1_in_rule__OrderedList__Group_3__1__Impl9395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__09429 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__09432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UnorderedList__Group__0__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19491 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__1__Impl9522 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29553 = new BitSet(new long[]{0x0000000002000160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnorderedList__Group__2__Impl9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39615 = new BitSet(new long[]{0x0000000000008160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__4_in_rule__UnorderedList__Group__39618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_3__0_in_rule__UnorderedList__Group__3__Impl9647 = new BitSet(new long[]{0x0000000002000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_3__0_in_rule__UnorderedList__Group__3__Impl9659 = new BitSet(new long[]{0x0000000002000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__4__Impl_in_rule__UnorderedList__Group__49692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__5_in_rule__UnorderedList__Group__49695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__4__Impl9723 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__5__Impl_in_rule__UnorderedList__Group__59754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UnorderedList__Group__5__Impl9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_3__0__Impl_in_rule__UnorderedList__Group_3__09825 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_3__1_in_rule__UnorderedList__Group_3__09828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_3__0__Impl9856 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_3__1__Impl_in_rule__UnorderedList__Group_3__19887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_3_1_in_rule__UnorderedList__Group_3__1__Impl9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09948 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Item__Group__0__Impl9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__110010 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Item__Group__1__Impl10041 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__210072 = new BitSet(new long[]{0x000000003DF01DF0L});
    public static final BitSet FOLLOW_rule__Item__Group__3_in_rule__Item__Group__210075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Item__Group__2__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__310134 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Item__Group__4_in_rule__Item__Group__310137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__3__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__410196 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_rule__Item__Group__5_in_rule__Item__Group__410199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_4_in_rule__Item__Group__4__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__5__Impl_in_rule__Item__Group__510256 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Item__Group__6_in_rule__Item__Group__510259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_5__0_in_rule__Item__Group__5__Impl10286 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Item__Group__6__Impl_in_rule__Item__Group__610317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Item__Group__6__Impl10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_5__0__Impl_in_rule__Item__Group_5__010390 = new BitSet(new long[]{0x000000003DF01CF0L});
    public static final BitSet FOLLOW_rule__Item__Group_5__1_in_rule__Item__Group_5__010393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_5__0__Impl10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_5__1__Impl_in_rule__Item__Group_5__110449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_5_1_in_rule__Item__Group_5__1__Impl10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__010510 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__010513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CodeRef__Group__0__Impl10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__110572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__110575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeRef__Group__1__Impl10603 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__210634 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__3_in_rule__CodeRef__Group__210637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeRef__Group__2__Impl10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__3__Impl_in_rule__CodeRef__Group__310696 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__4_in_rule__CodeRef__Group__310699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__ElementAssignment_3_in_rule__CodeRef__Group__3__Impl10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__4__Impl_in_rule__CodeRef__Group__410756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeRef__Group__4__Impl10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__010825 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__010828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group__0__Impl10856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110887 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Link__Group__1__Impl10918 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210949 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Link__Group__2__Impl10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__311011 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__311014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_3_in_rule__Link__Group__3__Impl11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__411071 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__411074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Link__Group__4__Impl11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__511133 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Link__Group__6_in_rule__Link__Group__511136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Link__Group__5__Impl11164 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__611195 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__Link__Group__7_in_rule__Link__Group__611198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Link__Group__6__Impl11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__7__Impl_in_rule__Link__Group__711257 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Link__Group__8_in_rule__Link__Group__711260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TextAssignment_7_in_rule__Link__Group__7__Impl11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__8__Impl_in_rule__Link__Group__811317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Link__Group__8__Impl11345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__011394 = new BitSet(new long[]{0x0000000000005160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__011397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ImageRef__Group__0__Impl11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__111456 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__111459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__1__Impl11487 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__211518 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__211521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__0_in_rule__ImageRef__Group__2__Impl11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__311579 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__311582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__3__Impl11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__411641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__411644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__PathAssignment_4_in_rule__ImageRef__Group__4__Impl11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__511701 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__511704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImageRef__Group__5__Impl11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__611763 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__611766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__6__Impl11794 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__711825 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__711828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__7__Impl11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__811887 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__811890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__ClazzAssignment_8_in_rule__ImageRef__Group__8__Impl11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__911947 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__911950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImageRef__Group__9__Impl11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1012009 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1012012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__10__Impl12040 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1112071 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1112074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__11__Impl12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1212133 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1212136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__StyleAssignment_12_in_rule__ImageRef__Group__12__Impl12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1312193 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1312196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImageRef__Group__13__Impl12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1412255 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__15_in_rule__ImageRef__Group__1412258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__14__Impl12286 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__15__Impl_in_rule__ImageRef__Group__1512317 = new BitSet(new long[]{0x0000000000001CF0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__16_in_rule__ImageRef__Group__1512320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__15__Impl12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__16__Impl_in_rule__ImageRef__Group__1612379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__17_in_rule__ImageRef__Group__1612382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__CaptionAssignment_16_in_rule__ImageRef__Group__16__Impl12409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__17__Impl_in_rule__ImageRef__Group__1712439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImageRef__Group__17__Impl12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__0__Impl_in_rule__ImageRef__Group_2__012534 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__1_in_rule__ImageRef__Group_2__012537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ImageRef__Group_2__0__Impl12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__1__Impl_in_rule__ImageRef__Group_2__112596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__2_in_rule__ImageRef__Group_2__112599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_2__1__Impl12627 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__2__Impl_in_rule__ImageRef__Group_2__212658 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__3_in_rule__ImageRef__Group_2__212661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__NameAssignment_2_2_in_rule__ImageRef__Group_2__2__Impl12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_2__3__Impl_in_rule__ImageRef__Group_2__312718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_2__3__Impl12746 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__012785 = new BitSet(new long[]{0x0000000000004160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__012788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CodeBlock__Group__0__Impl12816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__112847 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__112850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group__1__Impl12878 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__212909 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__212912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__0_in_rule__CodeBlock__Group__2__Impl12939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__312970 = new BitSet(new long[]{0x0000000000701DF0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__4_in_rule__CodeBlock__Group__312973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeBlock__Group__3__Impl13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__4__Impl_in_rule__CodeBlock__Group__413032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__5_in_rule__CodeBlock__Group__413035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Alternatives_4_in_rule__CodeBlock__Group__4__Impl13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__5__Impl_in_rule__CodeBlock__Group__513092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeBlock__Group__5__Impl13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__0__Impl_in_rule__CodeBlock__Group_2__013163 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__1_in_rule__CodeBlock__Group_2__013166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeBlock__Group_2__0__Impl13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__1__Impl_in_rule__CodeBlock__Group_2__113225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__2_in_rule__CodeBlock__Group_2__113228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__1__Impl13256 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__2__Impl_in_rule__CodeBlock__Group_2__213287 = new BitSet(new long[]{0x0000000000008160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__3_in_rule__CodeBlock__Group_2__213290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__LanguageAssignment_2_2_in_rule__CodeBlock__Group_2__2__Impl13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__3__Impl_in_rule__CodeBlock__Group_2__313347 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__4_in_rule__CodeBlock__Group_2__313350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__3__Impl13378 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__4__Impl_in_rule__CodeBlock__Group_2__413409 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__5_in_rule__CodeBlock__Group_2__413412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeBlock__Group_2__4__Impl13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2__5__Impl_in_rule__CodeBlock__Group_2__513471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_2__5__Impl13499 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0__0__Impl_in_rule__CodeBlock__Group_4_0__013542 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0__1_in_rule__CodeBlock__Group_4_0__013545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_0_in_rule__CodeBlock__Group_4_0__0__Impl13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0__1__Impl_in_rule__CodeBlock__Group_4_0__113602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0_1__0_in_rule__CodeBlock__Group_4_0__1__Impl13629 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0_1__0__Impl_in_rule__CodeBlock__Group_4_0_1__013664 = new BitSet(new long[]{0x0000000000001DF2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0_1__1_in_rule__CodeBlock__Group_4_0_1__013667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_1_0_in_rule__CodeBlock__Group_4_0_1__0__Impl13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_0_1__1__Impl_in_rule__CodeBlock__Group_4_0_1__113724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_4_0_1_1_in_rule__CodeBlock__Group_4_0_1__1__Impl13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_1__0__Impl_in_rule__CodeBlock__Group_4_1__013786 = new BitSet(new long[]{0x0000000000001DF2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_1__1_in_rule__CodeBlock__Group_4_1__013789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_4_1_0_in_rule__CodeBlock__Group_4_1__0__Impl13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_4_1__1__Impl_in_rule__CodeBlock__Group_4_1__113846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_4_1_1_in_rule__CodeBlock__Group_4_1__1__Impl13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_013913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_113944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_013975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_114006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_014037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_114068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_1_114099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_314130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_5_114161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_6_114192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_1_114223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_314254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_5_114285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_6_114316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_1_114347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_314378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_5_114409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_6_114440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_1_114471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_314502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_5_114533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_6_114564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_1_114595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_314626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_5_114657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_014688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_014719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_114750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_014781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_114812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__TextPart__TextAssignment14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_314874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_214905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_214940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_514975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_3_115006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_3_115037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_415068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_5_115099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_315134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__UrlAssignment_315169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__TextAssignment_715200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_2_215231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_415262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_815293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_1215324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1615355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_2_215386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_0_015417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_4_0_1_015448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_0_1_115479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_4_1_015510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_4_1_115541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment15572 = new BitSet(new long[]{0x0000000000000002L});

}