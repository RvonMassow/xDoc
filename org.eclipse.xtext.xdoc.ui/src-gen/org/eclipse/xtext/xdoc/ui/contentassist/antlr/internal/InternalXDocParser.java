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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_MULTI_NL", "RULE_SL_COMMENT", "'chapter['", "'section['", "'subsection['", "'section3['", "'section4['", "'\\\\['", "'\\\\]'", "'img['", "']'", "'chapter:'", "'['", "'section:'", "'subsection:'", "'section3:'", "'section4:'", "'emph['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'code['"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=15 && LA1_0<=16)) ) {
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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_MULTI_NL)||(LA2_0>=15 && LA2_0<=16)) ) {
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
            case 10:
            case 19:
                {
                alt3=1;
                }
                break;
            case 11:
            case 21:
                {
                alt3=2;
                }
                break;
            case 12:
            case 22:
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


    // $ANTLR start rule__Chapter__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:777:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );
    public final void rule__Chapter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:781:1: ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("777:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( rule__Chapter__Group_0_0__0 )
                    {
                     before(grammarAccess.getChapterAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:1: ( rule__Chapter__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:2: rule__Chapter__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01615);
                    rule__Chapter__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( 'chapter[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( 'chapter[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:1: 'chapter['
                    {
                     before(grammarAccess.getChapterAccess().getChapterKeyword_0_1()); 
                    match(input,10,FOLLOW_10_in_rule__Chapter__Alternatives_01634); 
                     after(grammarAccess.getChapterAccess().getChapterKeyword_0_1()); 

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
    // $ANTLR end rule__Chapter__Alternatives_0


    // $ANTLR start rule__Section__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:801:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );
    public final void rule__Section__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:805:1: ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("801:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:806:1: ( ( rule__Section__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:806:1: ( ( rule__Section__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:807:1: ( rule__Section__Group_0_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:1: ( rule__Section__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:2: rule__Section__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01668);
                    rule__Section__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:6: ( 'section[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:6: ( 'section[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:813:1: 'section['
                    {
                     before(grammarAccess.getSectionAccess().getSectionKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Section__Alternatives_01687); 
                     after(grammarAccess.getSectionAccess().getSectionKeyword_0_1()); 

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
    // $ANTLR end rule__Section__Alternatives_0


    // $ANTLR start rule__SubSection__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:825:1: rule__SubSection__Alternatives_0 : ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) );
    public final void rule__SubSection__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:829:1: ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("825:1: rule__SubSection__Alternatives_0 : ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:1: ( ( rule__SubSection__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:1: ( ( rule__SubSection__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:831:1: ( rule__SubSection__Group_0_0__0 )
                    {
                     before(grammarAccess.getSubSectionAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:1: ( rule__SubSection__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:2: rule__SubSection__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__SubSection__Group_0_0__0_in_rule__SubSection__Alternatives_01721);
                    rule__SubSection__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSubSectionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( 'subsection[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( 'subsection[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:837:1: 'subsection['
                    {
                     before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__SubSection__Alternatives_01740); 
                     after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_1()); 

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
    // $ANTLR end rule__SubSection__Alternatives_0


    // $ANTLR start rule__Section3__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:849:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );
    public final void rule__Section3__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:853:1: ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("849:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:854:1: ( ( rule__Section3__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:854:1: ( ( rule__Section3__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:855:1: ( rule__Section3__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection3Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:856:1: ( rule__Section3__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:856:2: rule__Section3__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01774);
                    rule__Section3__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection3Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:6: ( 'section3[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:6: ( 'section3[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:861:1: 'section3['
                    {
                     before(grammarAccess.getSection3Access().getSection3Keyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Section3__Alternatives_01793); 
                     after(grammarAccess.getSection3Access().getSection3Keyword_0_1()); 

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
    // $ANTLR end rule__Section3__Alternatives_0


    // $ANTLR start rule__Section4__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:873:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );
    public final void rule__Section4__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:877:1: ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("873:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:878:1: ( ( rule__Section4__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:878:1: ( ( rule__Section4__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:879:1: ( rule__Section4__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection4Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:880:1: ( rule__Section4__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:880:2: rule__Section4__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01827);
                    rule__Section4__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection4Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:6: ( 'section4[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:6: ( 'section4[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:885:1: 'section4['
                    {
                     before(grammarAccess.getSection4Access().getSection4Keyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Section4__Alternatives_01846); 
                     after(grammarAccess.getSection4Access().getSection4Keyword_0_1()); 

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
    // $ANTLR end rule__Section4__Alternatives_0


    // $ANTLR start rule__TextOrMarkup__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:898:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );
    public final void rule__TextOrMarkup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:902:1: ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ANY_OTHER)||(LA10_0>=15 && LA10_0<=16)) ) {
                alt10=1;
            }
            else if ( (LA10_0==17||(LA10_0>=25 && LA10_0<=29)||(LA10_0>=31 && LA10_0<=34)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("898:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:903:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:903:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:904:1: ( rule__TextOrMarkup__Group_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:905:1: ( rule__TextOrMarkup__Group_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:905:2: rule__TextOrMarkup__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1881);
                    rule__TextOrMarkup__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:909:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:909:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:910:1: ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:910:1: ( ( rule__TextOrMarkup__Group_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:911:1: ( rule__TextOrMarkup__Group_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:1: ( rule__TextOrMarkup__Group_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:2: rule__TextOrMarkup__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1901);
                    rule__TextOrMarkup__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:915:1: ( ( rule__TextOrMarkup__Group_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:916:1: ( rule__TextOrMarkup__Group_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:917:1: ( rule__TextOrMarkup__Group_1__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17||(LA9_0>=25 && LA9_0<=29)||(LA9_0>=31 && LA9_0<=34)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:917:2: rule__TextOrMarkup__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1913);
                    	    rule__TextOrMarkup__Group_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:927:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:931:1: ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_WS:
                {
                alt11=2;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt11=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt11=4;
                }
                break;
            case 15:
                {
                alt11=5;
                }
                break;
            case 16:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("927:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:933:1: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Text__Alternatives1949); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:939:1: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Text__Alternatives1966); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:944:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:944:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:945:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1983); 
                     after(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:950:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:950:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:951:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2000); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:957:1: '\\\\['
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Text__Alternatives2018); 
                     after(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:964:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:964:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:965:1: '\\\\]'
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Text__Alternatives2038); 
                     after(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:977:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );
    public final void rule__MarkUp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:981:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            case 31:
                {
                alt12=7;
                }
                break;
            case 32:
                {
                alt12=8;
                }
                break;
            case 17:
            case 33:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("977:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:982:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:982:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:983:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2072);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:988:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:988:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:989:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2089);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:994:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:994:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:995:1: ruleRef
                    {
                     before(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2106);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:6: ( ruleOrderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:6: ( ruleOrderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1001:1: ruleOrderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2123);
                    ruleOrderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( ruleUnorderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( ruleUnorderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1007:1: ruleUnorderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2140);
                    ruleUnorderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( ruleCodeBlock )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( ruleCodeBlock )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1013:1: ruleCodeBlock
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2157);
                    ruleCodeBlock();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( ruleCodeRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( ruleCodeRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1019:1: ruleCodeRef
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2174);
                    ruleCodeRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( ruleLink )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( ruleLink )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1025:1: ruleLink
                    {
                     before(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2191);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:6: ( ruleImageRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:6: ( ruleImageRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1031:1: ruleImageRef
                    {
                     before(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2208);
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


    // $ANTLR start rule__ImageRef__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1041:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );
    public final void rule__ImageRef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1045:1: ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1041:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1046:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1046:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1047:1: ( rule__ImageRef__Group_0_0__0 )
                    {
                     before(grammarAccess.getImageRefAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1048:1: ( rule__ImageRef__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1048:2: rule__ImageRef__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02240);
                    rule__ImageRef__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getImageRefAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1052:6: ( 'img[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1052:6: ( 'img[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1053:1: 'img['
                    {
                     before(grammarAccess.getImageRefAccess().getImgKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ImageRef__Alternatives_02259); 
                     after(grammarAccess.getImageRefAccess().getImgKeyword_0_1()); 

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
    // $ANTLR end rule__ImageRef__Alternatives_0


    // $ANTLR start rule__CodeBlock__Alternatives_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1065:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );
    public final void rule__CodeBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1069:1: ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_MULTI_NL)||(LA15_0>=15 && LA15_0<=16)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=25 && LA15_0<=27)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1070:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1070:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1071:1: ( rule__CodeBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1072:1: ( rule__CodeBlock__Group_2_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1072:2: rule__CodeBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22293);
                    rule__CodeBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1076:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1076:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1077:1: ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1077:1: ( ( rule__CodeBlock__Group_2_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1078:1: ( rule__CodeBlock__Group_2_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1079:1: ( rule__CodeBlock__Group_2_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1079:2: rule__CodeBlock__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22313);
                    rule__CodeBlock__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1082:1: ( ( rule__CodeBlock__Group_2_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1083:1: ( rule__CodeBlock__Group_2_1__0 )*
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1084:1: ( rule__CodeBlock__Group_2_1__0 )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=25 && LA14_0<=27)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1084:2: rule__CodeBlock__Group_2_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22325);
                    	    rule__CodeBlock__Group_2_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__CodeBlock__Alternatives_2


    // $ANTLR start rule__MarkupInCode__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1094:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );
    public final void rule__MarkupInCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1098:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1094:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1100:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2361);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1106:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2378);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1111:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1111:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1112:1: ruleRef
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2395);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1122:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );
    public final void rule__CodeText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1126:1: ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case RULE_MULTI_NL:
                {
                alt17=2;
                }
                break;
            case RULE_WS:
                {
                alt17=3;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt17=4;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt17=5;
                }
                break;
            case 15:
                {
                alt17=6;
                }
                break;
            case 16:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1122:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1127:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1127:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1128:1: RULE_ID
                    {
                     before(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2427); 
                     after(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1133:6: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1133:6: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1134:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2444); 
                     after(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1140:1: RULE_WS
                    {
                     before(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2461); 
                     after(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1146:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2478); 
                     after(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1151:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1151:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1152:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2495); 
                     after(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1158:1: '\\\\['
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__CodeText__Alternatives2513); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1165:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1165:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1166:1: '\\\\]'
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
                    match(input,16,FOLLOW_16_in_rule__CodeText__Alternatives2533); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1178:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );
    public final void rule__ANY_WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1182:1: ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt18=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt18=2;
                }
                break;
            case RULE_WS:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1178:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1183:1: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1183:1: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1184:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2567); 
                     after(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1189:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1189:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1190:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2584); 
                     after(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1195:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1195:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1196:1: RULE_WS
                    {
                     before(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2601); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1208:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1212:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1213:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02631);
            rule__Document__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02634);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1220:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1224:1: ( ( () ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1225:1: ( () )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1225:1: ( () )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1226:1: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1227:1: ()
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1229:1: 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1239:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1243:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1244:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12692);
            rule__Document__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12695);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1251:1: rule__Document__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1255:1: ( ( ( RULE_WS )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1256:1: ( ( RULE_WS )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1256:1: ( ( RULE_WS )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1257:1: ( RULE_WS )?
            {
             before(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1258:1: ( RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1258:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2723); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1268:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1272:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1273:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22754);
            rule__Document__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22757);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1280:1: rule__Document__Group__2__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1284:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1285:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1285:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1286:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1287:1: ( RULE_MULTI_NL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_MULTI_NL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1287:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2785); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1297:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1301:1: ( rule__Document__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1302:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32816);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1308:1: rule__Document__Group__3__Impl : ( ( rule__Document__Group_3__0 )? ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1312:1: ( ( ( rule__Document__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1313:1: ( ( rule__Document__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1313:1: ( ( rule__Document__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1314:1: ( rule__Document__Group_3__0 )?
            {
             before(grammarAccess.getDocumentAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1315:1: ( rule__Document__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=10 && LA21_0<=12)||LA21_0==19||(LA21_0>=21 && LA21_0<=22)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1315:2: rule__Document__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2843);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1333:1: rule__Document__Group_3__0 : rule__Document__Group_3__0__Impl rule__Document__Group_3__1 ;
    public final void rule__Document__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1337:1: ( rule__Document__Group_3__0__Impl rule__Document__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1338:2: rule__Document__Group_3__0__Impl rule__Document__Group_3__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02882);
            rule__Document__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02885);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1345:1: rule__Document__Group_3__0__Impl : ( ( rule__Document__Alternatives_3_0 ) ) ;
    public final void rule__Document__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1349:1: ( ( ( rule__Document__Alternatives_3_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1350:1: ( ( rule__Document__Alternatives_3_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1350:1: ( ( rule__Document__Alternatives_3_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1351:1: ( rule__Document__Alternatives_3_0 )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1352:1: ( rule__Document__Alternatives_3_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1352:2: rule__Document__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2912);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1362:1: rule__Document__Group_3__1 : rule__Document__Group_3__1__Impl ;
    public final void rule__Document__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1366:1: ( rule__Document__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1367:2: rule__Document__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12942);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1373:1: rule__Document__Group_3__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1377:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1378:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1378:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1379:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1380:1: ( RULE_MULTI_NL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_MULTI_NL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1380:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2970); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1394:1: rule__Document__Group_3_0_0__0 : rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 ;
    public final void rule__Document__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1398:1: ( rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1399:2: rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03005);
            rule__Document__Group_3_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03008);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1406:1: rule__Document__Group_3_0_0__0__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) ;
    public final void rule__Document__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1410:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1411:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1411:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1412:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1413:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1413:2: rule__Document__ChaptersAssignment_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3035);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1423:1: rule__Document__Group_3_0_0__1 : rule__Document__Group_3_0_0__1__Impl ;
    public final void rule__Document__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1427:1: ( rule__Document__Group_3_0_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1428:2: rule__Document__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13065);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1434:1: rule__Document__Group_3_0_0__1__Impl : ( ( rule__Document__Group_3_0_0_1__0 )* ) ;
    public final void rule__Document__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1438:1: ( ( ( rule__Document__Group_3_0_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1439:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1439:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1440:1: ( rule__Document__Group_3_0_0_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1441:1: ( rule__Document__Group_3_0_0_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTI_NL) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==10||LA23_1==19) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1441:2: rule__Document__Group_3_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3092);
            	    rule__Document__Group_3_0_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1455:1: rule__Document__Group_3_0_0_1__0 : rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 ;
    public final void rule__Document__Group_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1459:1: ( rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1460:2: rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03127);
            rule__Document__Group_3_0_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03130);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1467:1: rule__Document__Group_3_0_0_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1471:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1472:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1472:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1473:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3157); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1484:1: rule__Document__Group_3_0_0_1__1 : rule__Document__Group_3_0_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1488:1: ( rule__Document__Group_3_0_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1489:2: rule__Document__Group_3_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13186);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1495:1: rule__Document__Group_3_0_0_1__1__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) ;
    public final void rule__Document__Group_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1499:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1500:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1500:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1501:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1502:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1502:2: rule__Document__ChaptersAssignment_3_0_0_1_1
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3213);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1516:1: rule__Document__Group_3_0_1__0 : rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 ;
    public final void rule__Document__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1520:1: ( rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1521:2: rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03247);
            rule__Document__Group_3_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03250);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1528:1: rule__Document__Group_3_0_1__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) ;
    public final void rule__Document__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1532:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1533:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1533:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1534:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1535:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1535:2: rule__Document__SectionsAssignment_3_0_1_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3277);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1545:1: rule__Document__Group_3_0_1__1 : rule__Document__Group_3_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1549:1: ( rule__Document__Group_3_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1550:2: rule__Document__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13307);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1556:1: rule__Document__Group_3_0_1__1__Impl : ( ( rule__Document__Group_3_0_1_1__0 )* ) ;
    public final void rule__Document__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1560:1: ( ( ( rule__Document__Group_3_0_1_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1561:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1561:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1562:1: ( rule__Document__Group_3_0_1_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1563:1: ( rule__Document__Group_3_0_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==11||LA24_1==21) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1563:2: rule__Document__Group_3_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3334);
            	    rule__Document__Group_3_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1577:1: rule__Document__Group_3_0_1_1__0 : rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 ;
    public final void rule__Document__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1581:1: ( rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1582:2: rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03369);
            rule__Document__Group_3_0_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03372);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1589:1: rule__Document__Group_3_0_1_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1593:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1594:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1594:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1595:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3399); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1606:1: rule__Document__Group_3_0_1_1__1 : rule__Document__Group_3_0_1_1__1__Impl ;
    public final void rule__Document__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1610:1: ( rule__Document__Group_3_0_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1611:2: rule__Document__Group_3_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13428);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1617:1: rule__Document__Group_3_0_1_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) ;
    public final void rule__Document__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1621:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1622:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1622:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1623:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1624:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1624:2: rule__Document__SectionsAssignment_3_0_1_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3455);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1638:1: rule__Document__Group_3_0_2__0 : rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 ;
    public final void rule__Document__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1642:1: ( rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1643:2: rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03489);
            rule__Document__Group_3_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03492);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1650:1: rule__Document__Group_3_0_2__0__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) ;
    public final void rule__Document__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1654:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1655:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1655:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1656:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1657:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1657:2: rule__Document__SubsectionsAssignment_3_0_2_0
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3519);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1667:1: rule__Document__Group_3_0_2__1 : rule__Document__Group_3_0_2__1__Impl ;
    public final void rule__Document__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1671:1: ( rule__Document__Group_3_0_2__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1672:2: rule__Document__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13549);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1678:1: rule__Document__Group_3_0_2__1__Impl : ( ( rule__Document__Group_3_0_2_1__0 )* ) ;
    public final void rule__Document__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1682:1: ( ( ( rule__Document__Group_3_0_2_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1683:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1683:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1684:1: ( rule__Document__Group_3_0_2_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1685:1: ( rule__Document__Group_3_0_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==12||LA25_1==22) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1685:2: rule__Document__Group_3_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3576);
            	    rule__Document__Group_3_0_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1699:1: rule__Document__Group_3_0_2_1__0 : rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 ;
    public final void rule__Document__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1703:1: ( rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1704:2: rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03611);
            rule__Document__Group_3_0_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03614);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1711:1: rule__Document__Group_3_0_2_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1715:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1716:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1716:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1717:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3641); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1728:1: rule__Document__Group_3_0_2_1__1 : rule__Document__Group_3_0_2_1__1__Impl ;
    public final void rule__Document__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1732:1: ( rule__Document__Group_3_0_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1733:2: rule__Document__Group_3_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13670);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1739:1: rule__Document__Group_3_0_2_1__1__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Document__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1743:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1744:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1744:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1745:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1746:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1746:2: rule__Document__SubsectionsAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3697);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1760:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1764:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1765:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03731);
            rule__Chapter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03734);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1772:1: rule__Chapter__Group__0__Impl : ( ( rule__Chapter__Alternatives_0 ) ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1776:1: ( ( ( rule__Chapter__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1777:1: ( ( rule__Chapter__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1777:1: ( ( rule__Chapter__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1778:1: ( rule__Chapter__Alternatives_0 )
            {
             before(grammarAccess.getChapterAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1779:1: ( rule__Chapter__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1779:2: rule__Chapter__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3761);
            rule__Chapter__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1789:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1793:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1794:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13791);
            rule__Chapter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13794);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1801:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__TitleAssignment_1 ) ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1805:1: ( ( ( rule__Chapter__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1806:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1806:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1807:1: ( rule__Chapter__TitleAssignment_1 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1808:1: ( rule__Chapter__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1808:2: rule__Chapter__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3821);
            rule__Chapter__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1818:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1822:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1823:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23851);
            rule__Chapter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23854);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1830:1: rule__Chapter__Group__2__Impl : ( ']' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1834:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1835:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1835:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1836:1: ']'
            {
             before(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Chapter__Group__2__Impl3882); 
             after(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1849:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1853:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1854:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33913);
            rule__Chapter__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33916);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1861:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__Group_3__0 )* ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1865:1: ( ( ( rule__Chapter__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1866:1: ( ( rule__Chapter__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1866:1: ( ( rule__Chapter__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1867:1: ( rule__Chapter__Group_3__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1868:1: ( rule__Chapter__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_ID && LA26_1<=RULE_ANY_OTHER)||(LA26_1>=15 && LA26_1<=17)||(LA26_1>=25 && LA26_1<=29)||(LA26_1>=31 && LA26_1<=34)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1868:2: rule__Chapter__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl3943);
            	    rule__Chapter__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1878:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1882:1: ( rule__Chapter__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1883:2: rule__Chapter__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43974);
            rule__Chapter__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1889:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__Group_4__0 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1893:1: ( ( ( rule__Chapter__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1894:1: ( ( rule__Chapter__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1894:1: ( ( rule__Chapter__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1895:1: ( rule__Chapter__Group_4__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1896:1: ( rule__Chapter__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_MULTI_NL) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==11||LA27_2==21) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1896:2: rule__Chapter__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4001);
            	    rule__Chapter__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Chapter__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1916:1: rule__Chapter__Group_0_0__0 : rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 ;
    public final void rule__Chapter__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1920:1: ( rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1921:2: rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04042);
            rule__Chapter__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04045);
            rule__Chapter__Group_0_0__1();
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
    // $ANTLR end rule__Chapter__Group_0_0__0


    // $ANTLR start rule__Chapter__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1928:1: rule__Chapter__Group_0_0__0__Impl : ( 'chapter:' ) ;
    public final void rule__Chapter__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1932:1: ( ( 'chapter:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1933:1: ( 'chapter:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1933:1: ( 'chapter:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1934:1: 'chapter:'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Chapter__Group_0_0__0__Impl4073); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__0__Impl


    // $ANTLR start rule__Chapter__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1947:1: rule__Chapter__Group_0_0__1 : rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 ;
    public final void rule__Chapter__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1951:1: ( rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1952:2: rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14104);
            rule__Chapter__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14107);
            rule__Chapter__Group_0_0__2();
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
    // $ANTLR end rule__Chapter__Group_0_0__1


    // $ANTLR start rule__Chapter__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1959:1: rule__Chapter__Group_0_0__1__Impl : ( ( rule__Chapter__NameAssignment_0_0_1 ) ) ;
    public final void rule__Chapter__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1963:1: ( ( ( rule__Chapter__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1965:1: ( rule__Chapter__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1966:1: ( rule__Chapter__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1966:2: rule__Chapter__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4134);
            rule__Chapter__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__1__Impl


    // $ANTLR start rule__Chapter__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1976:1: rule__Chapter__Group_0_0__2 : rule__Chapter__Group_0_0__2__Impl ;
    public final void rule__Chapter__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1980:1: ( rule__Chapter__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1981:2: rule__Chapter__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24164);
            rule__Chapter__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Chapter__Group_0_0__2


    // $ANTLR start rule__Chapter__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1987:1: rule__Chapter__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Chapter__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1991:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1992:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1992:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1993:1: '['
            {
             before(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Chapter__Group_0_0__2__Impl4192); 
             after(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__2__Impl


    // $ANTLR start rule__Chapter__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2012:1: rule__Chapter__Group_3__0 : rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 ;
    public final void rule__Chapter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2016:1: ( rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2017:2: rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04229);
            rule__Chapter__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04232);
            rule__Chapter__Group_3__1();
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
    // $ANTLR end rule__Chapter__Group_3__0


    // $ANTLR start rule__Chapter__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2024:1: rule__Chapter__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2028:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2029:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2029:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2030:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4259); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_3__0__Impl


    // $ANTLR start rule__Chapter__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2041:1: rule__Chapter__Group_3__1 : rule__Chapter__Group_3__1__Impl ;
    public final void rule__Chapter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2045:1: ( rule__Chapter__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2046:2: rule__Chapter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14288);
            rule__Chapter__Group_3__1__Impl();
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
    // $ANTLR end rule__Chapter__Group_3__1


    // $ANTLR start rule__Chapter__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2052:1: rule__Chapter__Group_3__1__Impl : ( ( rule__Chapter__ContentsAssignment_3_1 ) ) ;
    public final void rule__Chapter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2056:1: ( ( ( rule__Chapter__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2057:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2057:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2058:1: ( rule__Chapter__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2059:1: ( rule__Chapter__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2059:2: rule__Chapter__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4315);
            rule__Chapter__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_3__1__Impl


    // $ANTLR start rule__Chapter__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2073:1: rule__Chapter__Group_4__0 : rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 ;
    public final void rule__Chapter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2077:1: ( rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2078:2: rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04349);
            rule__Chapter__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04352);
            rule__Chapter__Group_4__1();
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
    // $ANTLR end rule__Chapter__Group_4__0


    // $ANTLR start rule__Chapter__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2085:1: rule__Chapter__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2089:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2090:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2090:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2091:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4379); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_4__0__Impl


    // $ANTLR start rule__Chapter__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2102:1: rule__Chapter__Group_4__1 : rule__Chapter__Group_4__1__Impl ;
    public final void rule__Chapter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2106:1: ( rule__Chapter__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2107:2: rule__Chapter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14408);
            rule__Chapter__Group_4__1__Impl();
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
    // $ANTLR end rule__Chapter__Group_4__1


    // $ANTLR start rule__Chapter__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2113:1: rule__Chapter__Group_4__1__Impl : ( ( rule__Chapter__ContentsAssignment_4_1 ) ) ;
    public final void rule__Chapter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2117:1: ( ( ( rule__Chapter__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2118:1: ( ( rule__Chapter__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2118:1: ( ( rule__Chapter__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2119:1: ( rule__Chapter__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2120:1: ( rule__Chapter__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2120:2: rule__Chapter__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4435);
            rule__Chapter__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_4__1__Impl


    // $ANTLR start rule__Section__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2134:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2138:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2139:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04469);
            rule__Section__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04472);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2146:1: rule__Section__Group__0__Impl : ( ( rule__Section__Alternatives_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2150:1: ( ( ( rule__Section__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2151:1: ( ( rule__Section__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2151:1: ( ( rule__Section__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2152:1: ( rule__Section__Alternatives_0 )
            {
             before(grammarAccess.getSectionAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2153:1: ( rule__Section__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2153:2: rule__Section__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4499);
            rule__Section__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2163:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2167:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2168:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14529);
            rule__Section__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14532);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2175:1: rule__Section__Group__1__Impl : ( ( rule__Section__TitleAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2179:1: ( ( ( rule__Section__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2180:1: ( ( rule__Section__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2180:1: ( ( rule__Section__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2181:1: ( rule__Section__TitleAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2182:1: ( rule__Section__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2182:2: rule__Section__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4559);
            rule__Section__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2192:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2196:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2197:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24589);
            rule__Section__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24592);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2204:1: rule__Section__Group__2__Impl : ( ']' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2208:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2209:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2209:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2210:1: ']'
            {
             before(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section__Group__2__Impl4620); 
             after(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2223:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2227:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2228:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34651);
            rule__Section__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34654);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2235:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )* ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2239:1: ( ( ( rule__Section__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2240:1: ( ( rule__Section__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2240:1: ( ( rule__Section__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2241:1: ( rule__Section__Group_3__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2242:1: ( rule__Section__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTI_NL) ) {
                    int LA28_1 = input.LA(2);

                    if ( ((LA28_1>=RULE_ID && LA28_1<=RULE_ANY_OTHER)||(LA28_1>=15 && LA28_1<=17)||(LA28_1>=25 && LA28_1<=29)||(LA28_1>=31 && LA28_1<=34)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2242:2: rule__Section__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4681);
            	    rule__Section__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2252:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2256:1: ( rule__Section__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2257:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44712);
            rule__Section__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2263:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2267:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2268:1: ( ( rule__Section__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2268:1: ( ( rule__Section__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2269:1: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2270:1: ( rule__Section__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MULTI_NL) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==12||LA29_2==22) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2270:2: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4739);
            	    rule__Section__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Section__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2290:1: rule__Section__Group_0_0__0 : rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 ;
    public final void rule__Section__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2294:1: ( rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2295:2: rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04780);
            rule__Section__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04783);
            rule__Section__Group_0_0__1();
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
    // $ANTLR end rule__Section__Group_0_0__0


    // $ANTLR start rule__Section__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2302:1: rule__Section__Group_0_0__0__Impl : ( 'section:' ) ;
    public final void rule__Section__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2306:1: ( ( 'section:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2307:1: ( 'section:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2307:1: ( 'section:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2308:1: 'section:'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Section__Group_0_0__0__Impl4811); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__0__Impl


    // $ANTLR start rule__Section__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2321:1: rule__Section__Group_0_0__1 : rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 ;
    public final void rule__Section__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2325:1: ( rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2326:2: rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__14842);
            rule__Section__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__14845);
            rule__Section__Group_0_0__2();
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
    // $ANTLR end rule__Section__Group_0_0__1


    // $ANTLR start rule__Section__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2333:1: rule__Section__Group_0_0__1__Impl : ( ( rule__Section__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2337:1: ( ( ( rule__Section__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2338:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2338:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2339:1: ( rule__Section__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2340:1: ( rule__Section__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2340:2: rule__Section__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl4872);
            rule__Section__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__1__Impl


    // $ANTLR start rule__Section__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2350:1: rule__Section__Group_0_0__2 : rule__Section__Group_0_0__2__Impl ;
    public final void rule__Section__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2354:1: ( rule__Section__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2355:2: rule__Section__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__24902);
            rule__Section__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section__Group_0_0__2


    // $ANTLR start rule__Section__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2361:1: rule__Section__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2365:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2366:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2366:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2367:1: '['
            {
             before(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section__Group_0_0__2__Impl4930); 
             after(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__2__Impl


    // $ANTLR start rule__Section__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2386:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2390:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2391:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__04967);
            rule__Section__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__04970);
            rule__Section__Group_3__1();
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
    // $ANTLR end rule__Section__Group_3__0


    // $ANTLR start rule__Section__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2398:1: rule__Section__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2402:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2403:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2403:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2404:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl4997); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_3__0__Impl


    // $ANTLR start rule__Section__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2415:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2419:1: ( rule__Section__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2420:2: rule__Section__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15026);
            rule__Section__Group_3__1__Impl();
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
    // $ANTLR end rule__Section__Group_3__1


    // $ANTLR start rule__Section__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2426:1: rule__Section__Group_3__1__Impl : ( ( rule__Section__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2430:1: ( ( ( rule__Section__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2431:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2431:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2432:1: ( rule__Section__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2433:1: ( rule__Section__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2433:2: rule__Section__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5053);
            rule__Section__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_3__1__Impl


    // $ANTLR start rule__Section__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2447:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2451:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2452:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05087);
            rule__Section__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05090);
            rule__Section__Group_4__1();
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
    // $ANTLR end rule__Section__Group_4__0


    // $ANTLR start rule__Section__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2459:1: rule__Section__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2463:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2464:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2464:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2465:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5117); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_4__0__Impl


    // $ANTLR start rule__Section__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2476:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2480:1: ( rule__Section__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2481:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15146);
            rule__Section__Group_4__1__Impl();
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
    // $ANTLR end rule__Section__Group_4__1


    // $ANTLR start rule__Section__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2487:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ContentsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2491:1: ( ( ( rule__Section__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2492:1: ( ( rule__Section__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2492:1: ( ( rule__Section__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2493:1: ( rule__Section__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2494:1: ( rule__Section__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2494:2: rule__Section__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_4_1_in_rule__Section__Group_4__1__Impl5173);
            rule__Section__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_4__1__Impl


    // $ANTLR start rule__SubSection__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2508:1: rule__SubSection__Group__0 : rule__SubSection__Group__0__Impl rule__SubSection__Group__1 ;
    public final void rule__SubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2512:1: ( rule__SubSection__Group__0__Impl rule__SubSection__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2513:2: rule__SubSection__Group__0__Impl rule__SubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05207);
            rule__SubSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05210);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2520:1: rule__SubSection__Group__0__Impl : ( ( rule__SubSection__Alternatives_0 ) ) ;
    public final void rule__SubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2524:1: ( ( ( rule__SubSection__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2525:1: ( ( rule__SubSection__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2525:1: ( ( rule__SubSection__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2526:1: ( rule__SubSection__Alternatives_0 )
            {
             before(grammarAccess.getSubSectionAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2527:1: ( rule__SubSection__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2527:2: rule__SubSection__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SubSection__Alternatives_0_in_rule__SubSection__Group__0__Impl5237);
            rule__SubSection__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2537:1: rule__SubSection__Group__1 : rule__SubSection__Group__1__Impl rule__SubSection__Group__2 ;
    public final void rule__SubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2541:1: ( rule__SubSection__Group__1__Impl rule__SubSection__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2542:2: rule__SubSection__Group__1__Impl rule__SubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15267);
            rule__SubSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15270);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2549:1: rule__SubSection__Group__1__Impl : ( ( rule__SubSection__TitleAssignment_1 ) ) ;
    public final void rule__SubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2553:1: ( ( ( rule__SubSection__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2554:1: ( ( rule__SubSection__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2554:1: ( ( rule__SubSection__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2555:1: ( rule__SubSection__TitleAssignment_1 )
            {
             before(grammarAccess.getSubSectionAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2556:1: ( rule__SubSection__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2556:2: rule__SubSection__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSection__TitleAssignment_1_in_rule__SubSection__Group__1__Impl5297);
            rule__SubSection__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2566:1: rule__SubSection__Group__2 : rule__SubSection__Group__2__Impl rule__SubSection__Group__3 ;
    public final void rule__SubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2570:1: ( rule__SubSection__Group__2__Impl rule__SubSection__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2571:2: rule__SubSection__Group__2__Impl rule__SubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25327);
            rule__SubSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25330);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2578:1: rule__SubSection__Group__2__Impl : ( ']' ) ;
    public final void rule__SubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2582:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2583:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2583:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2584:1: ']'
            {
             before(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__SubSection__Group__2__Impl5358); 
             after(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2597:1: rule__SubSection__Group__3 : rule__SubSection__Group__3__Impl rule__SubSection__Group__4 ;
    public final void rule__SubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2601:1: ( rule__SubSection__Group__3__Impl rule__SubSection__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2602:2: rule__SubSection__Group__3__Impl rule__SubSection__Group__4
            {
            pushFollow(FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35389);
            rule__SubSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35392);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2609:1: rule__SubSection__Group__3__Impl : ( ( rule__SubSection__Group_3__0 )* ) ;
    public final void rule__SubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2613:1: ( ( ( rule__SubSection__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2614:1: ( ( rule__SubSection__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2614:1: ( ( rule__SubSection__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2615:1: ( rule__SubSection__Group_3__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2616:1: ( rule__SubSection__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_ANY_OTHER)||(LA30_1>=15 && LA30_1<=17)||(LA30_1>=25 && LA30_1<=29)||(LA30_1>=31 && LA30_1<=34)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2616:2: rule__SubSection__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_3__0_in_rule__SubSection__Group__3__Impl5419);
            	    rule__SubSection__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2626:1: rule__SubSection__Group__4 : rule__SubSection__Group__4__Impl ;
    public final void rule__SubSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2630:1: ( rule__SubSection__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2631:2: rule__SubSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45450);
            rule__SubSection__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2637:1: rule__SubSection__Group__4__Impl : ( ( rule__SubSection__Group_4__0 )* ) ;
    public final void rule__SubSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2641:1: ( ( ( rule__SubSection__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2642:1: ( ( rule__SubSection__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2642:1: ( ( rule__SubSection__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2643:1: ( rule__SubSection__Group_4__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2644:1: ( rule__SubSection__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==13||LA31_2==23) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2644:2: rule__SubSection__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_4__0_in_rule__SubSection__Group__4__Impl5477);
            	    rule__SubSection__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__SubSection__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2664:1: rule__SubSection__Group_0_0__0 : rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1 ;
    public final void rule__SubSection__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2668:1: ( rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2669:2: rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__0__Impl_in_rule__SubSection__Group_0_0__05518);
            rule__SubSection__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_0_0__1_in_rule__SubSection__Group_0_0__05521);
            rule__SubSection__Group_0_0__1();
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
    // $ANTLR end rule__SubSection__Group_0_0__0


    // $ANTLR start rule__SubSection__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2676:1: rule__SubSection__Group_0_0__0__Impl : ( 'subsection:' ) ;
    public final void rule__SubSection__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2680:1: ( ( 'subsection:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2681:1: ( 'subsection:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2681:1: ( 'subsection:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2682:1: 'subsection:'
            {
             before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_0_0()); 
            match(input,22,FOLLOW_22_in_rule__SubSection__Group_0_0__0__Impl5549); 
             after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__0__Impl


    // $ANTLR start rule__SubSection__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2695:1: rule__SubSection__Group_0_0__1 : rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2 ;
    public final void rule__SubSection__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2699:1: ( rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2700:2: rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__1__Impl_in_rule__SubSection__Group_0_0__15580);
            rule__SubSection__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_0_0__2_in_rule__SubSection__Group_0_0__15583);
            rule__SubSection__Group_0_0__2();
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
    // $ANTLR end rule__SubSection__Group_0_0__1


    // $ANTLR start rule__SubSection__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2707:1: rule__SubSection__Group_0_0__1__Impl : ( ( rule__SubSection__NameAssignment_0_0_1 ) ) ;
    public final void rule__SubSection__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2711:1: ( ( ( rule__SubSection__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2712:1: ( ( rule__SubSection__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2712:1: ( ( rule__SubSection__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2713:1: ( rule__SubSection__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSubSectionAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2714:1: ( rule__SubSection__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2714:2: rule__SubSection__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__SubSection__NameAssignment_0_0_1_in_rule__SubSection__Group_0_0__1__Impl5610);
            rule__SubSection__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__1__Impl


    // $ANTLR start rule__SubSection__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2724:1: rule__SubSection__Group_0_0__2 : rule__SubSection__Group_0_0__2__Impl ;
    public final void rule__SubSection__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2728:1: ( rule__SubSection__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2729:2: rule__SubSection__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__2__Impl_in_rule__SubSection__Group_0_0__25640);
            rule__SubSection__Group_0_0__2__Impl();
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
    // $ANTLR end rule__SubSection__Group_0_0__2


    // $ANTLR start rule__SubSection__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2735:1: rule__SubSection__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__SubSection__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2739:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2740:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2740:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2741:1: '['
            {
             before(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__SubSection__Group_0_0__2__Impl5668); 
             after(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__2__Impl


    // $ANTLR start rule__SubSection__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2760:1: rule__SubSection__Group_3__0 : rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1 ;
    public final void rule__SubSection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2764:1: ( rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2765:2: rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_3__0__Impl_in_rule__SubSection__Group_3__05705);
            rule__SubSection__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_3__1_in_rule__SubSection__Group_3__05708);
            rule__SubSection__Group_3__1();
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
    // $ANTLR end rule__SubSection__Group_3__0


    // $ANTLR start rule__SubSection__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2772:1: rule__SubSection__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2776:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2777:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2777:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2778:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_3__0__Impl5735); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_3__0__Impl


    // $ANTLR start rule__SubSection__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2789:1: rule__SubSection__Group_3__1 : rule__SubSection__Group_3__1__Impl ;
    public final void rule__SubSection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2793:1: ( rule__SubSection__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2794:2: rule__SubSection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_3__1__Impl_in_rule__SubSection__Group_3__15764);
            rule__SubSection__Group_3__1__Impl();
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
    // $ANTLR end rule__SubSection__Group_3__1


    // $ANTLR start rule__SubSection__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2800:1: rule__SubSection__Group_3__1__Impl : ( ( rule__SubSection__ContentsAssignment_3_1 ) ) ;
    public final void rule__SubSection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2804:1: ( ( ( rule__SubSection__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2805:1: ( ( rule__SubSection__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2805:1: ( ( rule__SubSection__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2806:1: ( rule__SubSection__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2807:1: ( rule__SubSection__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2807:2: rule__SubSection__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_3_1_in_rule__SubSection__Group_3__1__Impl5791);
            rule__SubSection__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_3__1__Impl


    // $ANTLR start rule__SubSection__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2821:1: rule__SubSection__Group_4__0 : rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1 ;
    public final void rule__SubSection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2825:1: ( rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2826:2: rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_4__0__Impl_in_rule__SubSection__Group_4__05825);
            rule__SubSection__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_4__1_in_rule__SubSection__Group_4__05828);
            rule__SubSection__Group_4__1();
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
    // $ANTLR end rule__SubSection__Group_4__0


    // $ANTLR start rule__SubSection__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2833:1: rule__SubSection__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2837:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2838:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2838:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2839:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_4__0__Impl5855); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_4__0__Impl


    // $ANTLR start rule__SubSection__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2850:1: rule__SubSection__Group_4__1 : rule__SubSection__Group_4__1__Impl ;
    public final void rule__SubSection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2854:1: ( rule__SubSection__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2855:2: rule__SubSection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_4__1__Impl_in_rule__SubSection__Group_4__15884);
            rule__SubSection__Group_4__1__Impl();
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
    // $ANTLR end rule__SubSection__Group_4__1


    // $ANTLR start rule__SubSection__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2861:1: rule__SubSection__Group_4__1__Impl : ( ( rule__SubSection__ContentsAssignment_4_1 ) ) ;
    public final void rule__SubSection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2865:1: ( ( ( rule__SubSection__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2866:1: ( ( rule__SubSection__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2866:1: ( ( rule__SubSection__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2867:1: ( rule__SubSection__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2868:1: ( rule__SubSection__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2868:2: rule__SubSection__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_4_1_in_rule__SubSection__Group_4__1__Impl5911);
            rule__SubSection__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_4__1__Impl


    // $ANTLR start rule__Section3__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2882:1: rule__Section3__Group__0 : rule__Section3__Group__0__Impl rule__Section3__Group__1 ;
    public final void rule__Section3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2886:1: ( rule__Section3__Group__0__Impl rule__Section3__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2887:2: rule__Section3__Group__0__Impl rule__Section3__Group__1
            {
            pushFollow(FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05945);
            rule__Section3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05948);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2894:1: rule__Section3__Group__0__Impl : ( ( rule__Section3__Alternatives_0 ) ) ;
    public final void rule__Section3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2898:1: ( ( ( rule__Section3__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2899:1: ( ( rule__Section3__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2899:1: ( ( rule__Section3__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2900:1: ( rule__Section3__Alternatives_0 )
            {
             before(grammarAccess.getSection3Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2901:1: ( rule__Section3__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2901:2: rule__Section3__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl5975);
            rule__Section3__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2911:1: rule__Section3__Group__1 : rule__Section3__Group__1__Impl rule__Section3__Group__2 ;
    public final void rule__Section3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2915:1: ( rule__Section3__Group__1__Impl rule__Section3__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2916:2: rule__Section3__Group__1__Impl rule__Section3__Group__2
            {
            pushFollow(FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16005);
            rule__Section3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16008);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2923:1: rule__Section3__Group__1__Impl : ( ( rule__Section3__TitleAssignment_1 ) ) ;
    public final void rule__Section3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2927:1: ( ( ( rule__Section3__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2928:1: ( ( rule__Section3__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2928:1: ( ( rule__Section3__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2929:1: ( rule__Section3__TitleAssignment_1 )
            {
             before(grammarAccess.getSection3Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2930:1: ( rule__Section3__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2930:2: rule__Section3__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6035);
            rule__Section3__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2940:1: rule__Section3__Group__2 : rule__Section3__Group__2__Impl rule__Section3__Group__3 ;
    public final void rule__Section3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2944:1: ( rule__Section3__Group__2__Impl rule__Section3__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2945:2: rule__Section3__Group__2__Impl rule__Section3__Group__3
            {
            pushFollow(FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26065);
            rule__Section3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26068);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2952:1: rule__Section3__Group__2__Impl : ( ']' ) ;
    public final void rule__Section3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2956:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2957:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2957:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2958:1: ']'
            {
             before(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section3__Group__2__Impl6096); 
             after(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2971:1: rule__Section3__Group__3 : rule__Section3__Group__3__Impl rule__Section3__Group__4 ;
    public final void rule__Section3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2975:1: ( rule__Section3__Group__3__Impl rule__Section3__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2976:2: rule__Section3__Group__3__Impl rule__Section3__Group__4
            {
            pushFollow(FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36127);
            rule__Section3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36130);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2983:1: rule__Section3__Group__3__Impl : ( ( rule__Section3__Group_3__0 )* ) ;
    public final void rule__Section3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2987:1: ( ( ( rule__Section3__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2988:1: ( ( rule__Section3__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2988:1: ( ( rule__Section3__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2989:1: ( rule__Section3__Group_3__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2990:1: ( rule__Section3__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MULTI_NL) ) {
                    int LA32_1 = input.LA(2);

                    if ( ((LA32_1>=RULE_ID && LA32_1<=RULE_ANY_OTHER)||(LA32_1>=15 && LA32_1<=17)||(LA32_1>=25 && LA32_1<=29)||(LA32_1>=31 && LA32_1<=34)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2990:2: rule__Section3__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6157);
            	    rule__Section3__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3000:1: rule__Section3__Group__4 : rule__Section3__Group__4__Impl ;
    public final void rule__Section3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3004:1: ( rule__Section3__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3005:2: rule__Section3__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46188);
            rule__Section3__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3011:1: rule__Section3__Group__4__Impl : ( ( rule__Section3__Group_4__0 )* ) ;
    public final void rule__Section3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3015:1: ( ( ( rule__Section3__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3016:1: ( ( rule__Section3__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3016:1: ( ( rule__Section3__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3017:1: ( rule__Section3__Group_4__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3018:1: ( rule__Section3__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTI_NL) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==14||LA33_2==24) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3018:2: rule__Section3__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6215);
            	    rule__Section3__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Section3__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3038:1: rule__Section3__Group_0_0__0 : rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 ;
    public final void rule__Section3__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3042:1: ( rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3043:2: rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06256);
            rule__Section3__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06259);
            rule__Section3__Group_0_0__1();
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
    // $ANTLR end rule__Section3__Group_0_0__0


    // $ANTLR start rule__Section3__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3050:1: rule__Section3__Group_0_0__0__Impl : ( 'section3:' ) ;
    public final void rule__Section3__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3054:1: ( ( 'section3:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3055:1: ( 'section3:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3055:1: ( 'section3:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3056:1: 'section3:'
            {
             before(grammarAccess.getSection3Access().getSection3Keyword_0_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Section3__Group_0_0__0__Impl6287); 
             after(grammarAccess.getSection3Access().getSection3Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__0__Impl


    // $ANTLR start rule__Section3__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3069:1: rule__Section3__Group_0_0__1 : rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 ;
    public final void rule__Section3__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3073:1: ( rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3074:2: rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16318);
            rule__Section3__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16321);
            rule__Section3__Group_0_0__2();
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
    // $ANTLR end rule__Section3__Group_0_0__1


    // $ANTLR start rule__Section3__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3081:1: rule__Section3__Group_0_0__1__Impl : ( ( rule__Section3__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section3__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3085:1: ( ( ( rule__Section3__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3086:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3086:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3087:1: ( rule__Section3__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection3Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3088:1: ( rule__Section3__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3088:2: rule__Section3__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6348);
            rule__Section3__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__1__Impl


    // $ANTLR start rule__Section3__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3098:1: rule__Section3__Group_0_0__2 : rule__Section3__Group_0_0__2__Impl ;
    public final void rule__Section3__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3102:1: ( rule__Section3__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3103:2: rule__Section3__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26378);
            rule__Section3__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section3__Group_0_0__2


    // $ANTLR start rule__Section3__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3109:1: rule__Section3__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section3__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3113:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3114:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3114:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3115:1: '['
            {
             before(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section3__Group_0_0__2__Impl6406); 
             after(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__2__Impl


    // $ANTLR start rule__Section3__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3134:1: rule__Section3__Group_3__0 : rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 ;
    public final void rule__Section3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3138:1: ( rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3139:2: rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06443);
            rule__Section3__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06446);
            rule__Section3__Group_3__1();
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
    // $ANTLR end rule__Section3__Group_3__0


    // $ANTLR start rule__Section3__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3146:1: rule__Section3__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3150:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3151:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3151:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3152:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6473); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_3__0__Impl


    // $ANTLR start rule__Section3__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3163:1: rule__Section3__Group_3__1 : rule__Section3__Group_3__1__Impl ;
    public final void rule__Section3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3167:1: ( rule__Section3__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3168:2: rule__Section3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16502);
            rule__Section3__Group_3__1__Impl();
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
    // $ANTLR end rule__Section3__Group_3__1


    // $ANTLR start rule__Section3__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3174:1: rule__Section3__Group_3__1__Impl : ( ( rule__Section3__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3178:1: ( ( ( rule__Section3__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3179:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3179:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3180:1: ( rule__Section3__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3181:1: ( rule__Section3__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3181:2: rule__Section3__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6529);
            rule__Section3__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_3__1__Impl


    // $ANTLR start rule__Section3__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3195:1: rule__Section3__Group_4__0 : rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 ;
    public final void rule__Section3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3199:1: ( rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3200:2: rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06563);
            rule__Section3__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06566);
            rule__Section3__Group_4__1();
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
    // $ANTLR end rule__Section3__Group_4__0


    // $ANTLR start rule__Section3__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3207:1: rule__Section3__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3211:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3212:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3212:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3213:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6593); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_4__0__Impl


    // $ANTLR start rule__Section3__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3224:1: rule__Section3__Group_4__1 : rule__Section3__Group_4__1__Impl ;
    public final void rule__Section3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3228:1: ( rule__Section3__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3229:2: rule__Section3__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16622);
            rule__Section3__Group_4__1__Impl();
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
    // $ANTLR end rule__Section3__Group_4__1


    // $ANTLR start rule__Section3__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3235:1: rule__Section3__Group_4__1__Impl : ( ( rule__Section3__ContentsAssignment_4_1 ) ) ;
    public final void rule__Section3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3239:1: ( ( ( rule__Section3__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3240:1: ( ( rule__Section3__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3240:1: ( ( rule__Section3__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3241:1: ( rule__Section3__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3242:1: ( rule__Section3__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3242:2: rule__Section3__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6649);
            rule__Section3__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_4__1__Impl


    // $ANTLR start rule__Section4__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3256:1: rule__Section4__Group__0 : rule__Section4__Group__0__Impl rule__Section4__Group__1 ;
    public final void rule__Section4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3260:1: ( rule__Section4__Group__0__Impl rule__Section4__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3261:2: rule__Section4__Group__0__Impl rule__Section4__Group__1
            {
            pushFollow(FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06683);
            rule__Section4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06686);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3268:1: rule__Section4__Group__0__Impl : ( ( rule__Section4__Alternatives_0 ) ) ;
    public final void rule__Section4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3272:1: ( ( ( rule__Section4__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3273:1: ( ( rule__Section4__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3273:1: ( ( rule__Section4__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3274:1: ( rule__Section4__Alternatives_0 )
            {
             before(grammarAccess.getSection4Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3275:1: ( rule__Section4__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3275:2: rule__Section4__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6713);
            rule__Section4__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3285:1: rule__Section4__Group__1 : rule__Section4__Group__1__Impl rule__Section4__Group__2 ;
    public final void rule__Section4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3289:1: ( rule__Section4__Group__1__Impl rule__Section4__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3290:2: rule__Section4__Group__1__Impl rule__Section4__Group__2
            {
            pushFollow(FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16743);
            rule__Section4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16746);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3297:1: rule__Section4__Group__1__Impl : ( ( rule__Section4__TitleAssignment_1 ) ) ;
    public final void rule__Section4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3301:1: ( ( ( rule__Section4__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3302:1: ( ( rule__Section4__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3302:1: ( ( rule__Section4__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3303:1: ( rule__Section4__TitleAssignment_1 )
            {
             before(grammarAccess.getSection4Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3304:1: ( rule__Section4__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3304:2: rule__Section4__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6773);
            rule__Section4__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3314:1: rule__Section4__Group__2 : rule__Section4__Group__2__Impl rule__Section4__Group__3 ;
    public final void rule__Section4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3318:1: ( rule__Section4__Group__2__Impl rule__Section4__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3319:2: rule__Section4__Group__2__Impl rule__Section4__Group__3
            {
            pushFollow(FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26803);
            rule__Section4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26806);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3326:1: rule__Section4__Group__2__Impl : ( ']' ) ;
    public final void rule__Section4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3330:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3331:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3331:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3332:1: ']'
            {
             before(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section4__Group__2__Impl6834); 
             after(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3345:1: rule__Section4__Group__3 : rule__Section4__Group__3__Impl ;
    public final void rule__Section4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3349:1: ( rule__Section4__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3350:2: rule__Section4__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36865);
            rule__Section4__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3356:1: rule__Section4__Group__3__Impl : ( ( rule__Section4__Group_3__0 )* ) ;
    public final void rule__Section4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3360:1: ( ( ( rule__Section4__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3361:1: ( ( rule__Section4__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3361:1: ( ( rule__Section4__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3362:1: ( rule__Section4__Group_3__0 )*
            {
             before(grammarAccess.getSection4Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3363:1: ( rule__Section4__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MULTI_NL) ) {
                    int LA34_2 = input.LA(2);

                    if ( ((LA34_2>=RULE_ID && LA34_2<=RULE_ANY_OTHER)||(LA34_2>=15 && LA34_2<=17)||(LA34_2>=25 && LA34_2<=29)||(LA34_2>=31 && LA34_2<=34)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3363:2: rule__Section4__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl6892);
            	    rule__Section4__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSection4Access().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start rule__Section4__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3381:1: rule__Section4__Group_0_0__0 : rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 ;
    public final void rule__Section4__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3385:1: ( rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3386:2: rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__06931);
            rule__Section4__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__06934);
            rule__Section4__Group_0_0__1();
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
    // $ANTLR end rule__Section4__Group_0_0__0


    // $ANTLR start rule__Section4__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3393:1: rule__Section4__Group_0_0__0__Impl : ( 'section4:' ) ;
    public final void rule__Section4__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3397:1: ( ( 'section4:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3398:1: ( 'section4:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3398:1: ( 'section4:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3399:1: 'section4:'
            {
             before(grammarAccess.getSection4Access().getSection4Keyword_0_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Section4__Group_0_0__0__Impl6962); 
             after(grammarAccess.getSection4Access().getSection4Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__0__Impl


    // $ANTLR start rule__Section4__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3412:1: rule__Section4__Group_0_0__1 : rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 ;
    public final void rule__Section4__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3416:1: ( rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3417:2: rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__16993);
            rule__Section4__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__16996);
            rule__Section4__Group_0_0__2();
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
    // $ANTLR end rule__Section4__Group_0_0__1


    // $ANTLR start rule__Section4__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3424:1: rule__Section4__Group_0_0__1__Impl : ( ( rule__Section4__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section4__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3428:1: ( ( ( rule__Section4__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3430:1: ( rule__Section4__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection4Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3431:1: ( rule__Section4__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3431:2: rule__Section4__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7023);
            rule__Section4__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__1__Impl


    // $ANTLR start rule__Section4__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3441:1: rule__Section4__Group_0_0__2 : rule__Section4__Group_0_0__2__Impl ;
    public final void rule__Section4__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3445:1: ( rule__Section4__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3446:2: rule__Section4__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27053);
            rule__Section4__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section4__Group_0_0__2


    // $ANTLR start rule__Section4__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3452:1: rule__Section4__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section4__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3456:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3457:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3457:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3458:1: '['
            {
             before(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section4__Group_0_0__2__Impl7081); 
             after(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__2__Impl


    // $ANTLR start rule__Section4__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3477:1: rule__Section4__Group_3__0 : rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 ;
    public final void rule__Section4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3481:1: ( rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3482:2: rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07118);
            rule__Section4__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07121);
            rule__Section4__Group_3__1();
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
    // $ANTLR end rule__Section4__Group_3__0


    // $ANTLR start rule__Section4__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3489:1: rule__Section4__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3493:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3494:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3494:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3495:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7148); 
             after(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_3__0__Impl


    // $ANTLR start rule__Section4__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3506:1: rule__Section4__Group_3__1 : rule__Section4__Group_3__1__Impl ;
    public final void rule__Section4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3510:1: ( rule__Section4__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3511:2: rule__Section4__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17177);
            rule__Section4__Group_3__1__Impl();
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
    // $ANTLR end rule__Section4__Group_3__1


    // $ANTLR start rule__Section4__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3517:1: rule__Section4__Group_3__1__Impl : ( ( rule__Section4__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3521:1: ( ( ( rule__Section4__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3522:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3522:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3523:1: ( rule__Section4__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3524:1: ( rule__Section4__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3524:2: rule__Section4__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7204);
            rule__Section4__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_3__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3538:1: rule__TextOrMarkup__Group_0__0 : rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 ;
    public final void rule__TextOrMarkup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3542:1: ( rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3543:2: rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07238);
            rule__TextOrMarkup__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07241);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3550:1: rule__TextOrMarkup__Group_0__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3554:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3555:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3555:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3556:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3557:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3557:2: rule__TextOrMarkup__ContentsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7268);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3567:1: rule__TextOrMarkup__Group_0__1 : rule__TextOrMarkup__Group_0__1__Impl ;
    public final void rule__TextOrMarkup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3571:1: ( rule__TextOrMarkup__Group_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3572:2: rule__TextOrMarkup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17298);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3578:1: rule__TextOrMarkup__Group_0__1__Impl : ( ( rule__TextOrMarkup__Group_0_1__0 )* ) ;
    public final void rule__TextOrMarkup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3582:1: ( ( ( rule__TextOrMarkup__Group_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3583:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3583:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3584:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3585:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17||(LA35_0>=25 && LA35_0<=29)||(LA35_0>=31 && LA35_0<=34)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3585:2: rule__TextOrMarkup__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7325);
            	    rule__TextOrMarkup__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3599:1: rule__TextOrMarkup__Group_0_1__0 : rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 ;
    public final void rule__TextOrMarkup__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3603:1: ( rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3604:2: rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07360);
            rule__TextOrMarkup__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07363);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3611:1: rule__TextOrMarkup__Group_0_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3615:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3616:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3616:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3617:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3618:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3618:2: rule__TextOrMarkup__ContentsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7390);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3628:1: rule__TextOrMarkup__Group_0_1__1 : rule__TextOrMarkup__Group_0_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3632:1: ( rule__TextOrMarkup__Group_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3633:2: rule__TextOrMarkup__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17420);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3639:1: rule__TextOrMarkup__Group_0_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3643:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3644:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3644:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3645:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3646:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_ANY_OTHER)||(LA36_0>=15 && LA36_0<=16)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3646:2: rule__TextOrMarkup__ContentsAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7447);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3660:1: rule__TextOrMarkup__Group_1__0 : rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 ;
    public final void rule__TextOrMarkup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3664:1: ( rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3665:2: rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07482);
            rule__TextOrMarkup__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07485);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3672:1: rule__TextOrMarkup__Group_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3676:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3677:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3677:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3678:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3679:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3679:2: rule__TextOrMarkup__ContentsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7512);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3689:1: rule__TextOrMarkup__Group_1__1 : rule__TextOrMarkup__Group_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3693:1: ( rule__TextOrMarkup__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3694:2: rule__TextOrMarkup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17542);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3700:1: rule__TextOrMarkup__Group_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3704:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3705:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3705:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3706:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3707:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_ANY_OTHER)||(LA37_0>=15 && LA37_0<=16)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3707:2: rule__TextOrMarkup__ContentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7569);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3721:1: rule__Emphasize__Group__0 : rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 ;
    public final void rule__Emphasize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3725:1: ( rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3726:2: rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07604);
            rule__Emphasize__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07607);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3733:1: rule__Emphasize__Group__0__Impl : ( 'emph[' ) ;
    public final void rule__Emphasize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3737:1: ( ( 'emph[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3738:1: ( 'emph[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3738:1: ( 'emph[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3739:1: 'emph['
            {
             before(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Emphasize__Group__0__Impl7635); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3752:1: rule__Emphasize__Group__1 : rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 ;
    public final void rule__Emphasize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3756:1: ( rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3757:2: rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17666);
            rule__Emphasize__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17669);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3764:1: rule__Emphasize__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3768:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3769:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3769:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3770:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3771:1: ( RULE_MULTI_NL )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_MULTI_NL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3771:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7697); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3781:1: rule__Emphasize__Group__2 : rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 ;
    public final void rule__Emphasize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3785:1: ( rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3786:2: rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27728);
            rule__Emphasize__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27731);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3793:1: rule__Emphasize__Group__2__Impl : ( ( rule__Emphasize__ContentsAssignment_2 ) ) ;
    public final void rule__Emphasize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3797:1: ( ( ( rule__Emphasize__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3798:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3798:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3799:1: ( rule__Emphasize__ContentsAssignment_2 )
            {
             before(grammarAccess.getEmphasizeAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3800:1: ( rule__Emphasize__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3800:2: rule__Emphasize__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7758);
            rule__Emphasize__ContentsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getContentsAssignment_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3810:1: rule__Emphasize__Group__3 : rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 ;
    public final void rule__Emphasize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3814:1: ( rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3815:2: rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37788);
            rule__Emphasize__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37791);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3822:1: rule__Emphasize__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3826:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3827:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3827:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3828:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3829:1: ( RULE_MULTI_NL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_MULTI_NL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3829:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7819); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3839:1: rule__Emphasize__Group__4 : rule__Emphasize__Group__4__Impl ;
    public final void rule__Emphasize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3843:1: ( rule__Emphasize__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3844:2: rule__Emphasize__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47850);
            rule__Emphasize__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3850:1: rule__Emphasize__Group__4__Impl : ( ']' ) ;
    public final void rule__Emphasize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3854:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3855:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3855:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3856:1: ']'
            {
             before(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Emphasize__Group__4__Impl7878); 
             after(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Anchor__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3879:1: rule__Anchor__Group__0 : rule__Anchor__Group__0__Impl rule__Anchor__Group__1 ;
    public final void rule__Anchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3883:1: ( rule__Anchor__Group__0__Impl rule__Anchor__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3884:2: rule__Anchor__Group__0__Impl rule__Anchor__Group__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__07919);
            rule__Anchor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__07922);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3891:1: rule__Anchor__Group__0__Impl : ( 'a[' ) ;
    public final void rule__Anchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3895:1: ( ( 'a[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3896:1: ( 'a[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3896:1: ( 'a[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3897:1: 'a['
            {
             before(grammarAccess.getAnchorAccess().getAKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Anchor__Group__0__Impl7950); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3910:1: rule__Anchor__Group__1 : rule__Anchor__Group__1__Impl rule__Anchor__Group__2 ;
    public final void rule__Anchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3914:1: ( rule__Anchor__Group__1__Impl rule__Anchor__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3915:2: rule__Anchor__Group__1__Impl rule__Anchor__Group__2
            {
            pushFollow(FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__17981);
            rule__Anchor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__17984);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3922:1: rule__Anchor__Group__1__Impl : ( ( rule__Anchor__NameAssignment_1 ) ) ;
    public final void rule__Anchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3926:1: ( ( ( rule__Anchor__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3927:1: ( ( rule__Anchor__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3927:1: ( ( rule__Anchor__NameAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3928:1: ( rule__Anchor__NameAssignment_1 )
            {
             before(grammarAccess.getAnchorAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3929:1: ( rule__Anchor__NameAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3929:2: rule__Anchor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8011);
            rule__Anchor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3939:1: rule__Anchor__Group__2 : rule__Anchor__Group__2__Impl ;
    public final void rule__Anchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3943:1: ( rule__Anchor__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3944:2: rule__Anchor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28041);
            rule__Anchor__Group__2__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3950:1: rule__Anchor__Group__2__Impl : ( ']' ) ;
    public final void rule__Anchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3954:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3955:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3955:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3956:1: ']'
            {
             before(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Anchor__Group__2__Impl8069); 
             after(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Ref__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3975:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3979:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3980:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08106);
            rule__Ref__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08109);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3987:1: rule__Ref__Group__0__Impl : ( 'ref:' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3991:1: ( ( 'ref:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3992:1: ( 'ref:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3992:1: ( 'ref:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3993:1: 'ref:'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Ref__Group__0__Impl8137); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4006:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4010:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4011:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18168);
            rule__Ref__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18171);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4018:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__RefAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4022:1: ( ( ( rule__Ref__RefAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4023:1: ( ( rule__Ref__RefAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4023:1: ( ( rule__Ref__RefAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4024:1: ( rule__Ref__RefAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getRefAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4025:1: ( rule__Ref__RefAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4025:2: rule__Ref__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8198);
            rule__Ref__RefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getRefAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4035:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4039:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4040:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28228);
            rule__Ref__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28231);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4047:1: rule__Ref__Group__2__Impl : ( '[' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4051:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4052:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4052:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4053:1: '['
            {
             before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Ref__Group__2__Impl8259); 
             after(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4066:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4070:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4071:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38290);
            rule__Ref__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38293);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4078:1: rule__Ref__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4082:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4083:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4083:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4084:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4085:1: ( RULE_MULTI_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_MULTI_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4085:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8321); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4095:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4099:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4100:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48352);
            rule__Ref__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48355);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4107:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__ContentsAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4111:1: ( ( ( rule__Ref__ContentsAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4112:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4112:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4113:1: ( rule__Ref__ContentsAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getContentsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4114:1: ( rule__Ref__ContentsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4114:2: rule__Ref__ContentsAssignment_4
            {
            pushFollow(FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8382);
            rule__Ref__ContentsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getContentsAssignment_4()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4124:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4128:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4129:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58412);
            rule__Ref__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58415);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4136:1: rule__Ref__Group__5__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4140:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4141:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4141:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4142:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4143:1: ( RULE_MULTI_NL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_MULTI_NL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4143:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8443); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4153:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4157:1: ( rule__Ref__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4158:2: rule__Ref__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68474);
            rule__Ref__Group__6__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4164:1: rule__Ref__Group__6__Impl : ( ']' ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4168:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4169:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4169:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4170:1: ']'
            {
             before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Ref__Group__6__Impl8502); 
             after(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start rule__OrderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4197:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4201:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4202:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08547);
            rule__OrderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08550);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: rule__OrderedList__Group__0__Impl : ( 'ol[' ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4213:1: ( ( 'ol[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4214:1: ( 'ol[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4214:1: ( 'ol[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4215:1: 'ol['
            {
             before(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__OrderedList__Group__0__Impl8578); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4228:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4232:1: ( rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4233:2: rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18609);
            rule__OrderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18612);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4240:1: rule__OrderedList__Group__1__Impl : ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4244:1: ( ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4245:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4245:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4246:1: ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4246:1: ( ( rule__OrderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4247:1: ( rule__OrderedList__Group_1__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4248:1: ( rule__OrderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4248:2: rule__OrderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8641);
            rule__OrderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4251:1: ( ( rule__OrderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4252:1: ( rule__OrderedList__Group_1__0 )*
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4253:1: ( rule__OrderedList__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4253:2: rule__OrderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8653);
            	    rule__OrderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getGroup_1()); 

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
    // $ANTLR end rule__OrderedList__Group__1__Impl


    // $ANTLR start rule__OrderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4264:1: rule__OrderedList__Group__2 : rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 ;
    public final void rule__OrderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4268:1: ( rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4269:2: rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28686);
            rule__OrderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28689);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4276:1: rule__OrderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4280:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4281:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4281:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4282:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4283:1: ( ruleANY_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_WS && LA43_0<=RULE_SINGLE_NL)||LA43_0==RULE_MULTI_NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4283:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8717);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4293:1: rule__OrderedList__Group__3 : rule__OrderedList__Group__3__Impl ;
    public final void rule__OrderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4297:1: ( rule__OrderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4298:2: rule__OrderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38748);
            rule__OrderedList__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4304:1: rule__OrderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__OrderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4308:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4309:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4309:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4310:1: ']'
            {
             before(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__OrderedList__Group__3__Impl8776); 
             after(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__OrderedList__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4331:1: rule__OrderedList__Group_1__0 : rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 ;
    public final void rule__OrderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4335:1: ( rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4336:2: rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08815);
            rule__OrderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08818);
            rule__OrderedList__Group_1__1();
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
    // $ANTLR end rule__OrderedList__Group_1__0


    // $ANTLR start rule__OrderedList__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4343:1: rule__OrderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4347:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4348:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4348:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4349:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4350:1: ( ruleANY_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_SINGLE_NL)||LA44_0==RULE_MULTI_NL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4350:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl8846);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_1__0__Impl


    // $ANTLR start rule__OrderedList__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4360:1: rule__OrderedList__Group_1__1 : rule__OrderedList__Group_1__1__Impl ;
    public final void rule__OrderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4364:1: ( rule__OrderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4365:2: rule__OrderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__18877);
            rule__OrderedList__Group_1__1__Impl();
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
    // $ANTLR end rule__OrderedList__Group_1__1


    // $ANTLR start rule__OrderedList__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4371:1: rule__OrderedList__Group_1__1__Impl : ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__OrderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4375:1: ( ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4376:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4376:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4377:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4378:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4378:2: rule__OrderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl8904);
            rule__OrderedList__ItemsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_1__1__Impl


    // $ANTLR start rule__UnorderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4392:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4396:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4397:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__08938);
            rule__UnorderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__08941);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4404:1: rule__UnorderedList__Group__0__Impl : ( 'ul[' ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4408:1: ( ( 'ul[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4409:1: ( 'ul[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4409:1: ( 'ul[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4410:1: 'ul['
            {
             before(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__UnorderedList__Group__0__Impl8969); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4423:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4427:1: ( rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4428:2: rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19000);
            rule__UnorderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19003);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4435:1: rule__UnorderedList__Group__1__Impl : ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4439:1: ( ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4440:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4440:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4441:1: ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4441:1: ( ( rule__UnorderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4442:1: ( rule__UnorderedList__Group_1__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4443:1: ( rule__UnorderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4443:2: rule__UnorderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9032);
            rule__UnorderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:1: ( ( rule__UnorderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4447:1: ( rule__UnorderedList__Group_1__0 )*
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4448:1: ( rule__UnorderedList__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4448:2: rule__UnorderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9044);
            	    rule__UnorderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getGroup_1()); 

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
    // $ANTLR end rule__UnorderedList__Group__1__Impl


    // $ANTLR start rule__UnorderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4459:1: rule__UnorderedList__Group__2 : rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 ;
    public final void rule__UnorderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4463:1: ( rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4464:2: rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29077);
            rule__UnorderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29080);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4471:1: rule__UnorderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4475:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4476:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4476:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4477:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4478:1: ( ruleANY_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WS && LA46_0<=RULE_SINGLE_NL)||LA46_0==RULE_MULTI_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4478:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9108);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4488:1: rule__UnorderedList__Group__3 : rule__UnorderedList__Group__3__Impl ;
    public final void rule__UnorderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4492:1: ( rule__UnorderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4493:2: rule__UnorderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39139);
            rule__UnorderedList__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4499:1: rule__UnorderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__UnorderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4503:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4504:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4504:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4505:1: ']'
            {
             before(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__UnorderedList__Group__3__Impl9167); 
             after(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__UnorderedList__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4526:1: rule__UnorderedList__Group_1__0 : rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 ;
    public final void rule__UnorderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4530:1: ( rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4531:2: rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09206);
            rule__UnorderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09209);
            rule__UnorderedList__Group_1__1();
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
    // $ANTLR end rule__UnorderedList__Group_1__0


    // $ANTLR start rule__UnorderedList__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4538:1: rule__UnorderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4542:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4543:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4543:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4544:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4545:1: ( ruleANY_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_WS && LA47_0<=RULE_SINGLE_NL)||LA47_0==RULE_MULTI_NL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4545:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9237);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_1__0__Impl


    // $ANTLR start rule__UnorderedList__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4555:1: rule__UnorderedList__Group_1__1 : rule__UnorderedList__Group_1__1__Impl ;
    public final void rule__UnorderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4559:1: ( rule__UnorderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4560:2: rule__UnorderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19268);
            rule__UnorderedList__Group_1__1__Impl();
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
    // $ANTLR end rule__UnorderedList__Group_1__1


    // $ANTLR start rule__UnorderedList__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4566:1: rule__UnorderedList__Group_1__1__Impl : ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__UnorderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4570:1: ( ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4571:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4571:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4572:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4573:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4573:2: rule__UnorderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9295);
            rule__UnorderedList__ItemsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_1__1__Impl


    // $ANTLR start rule__Item__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4587:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4591:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4592:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09329);
            rule__Item__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09332);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4599:1: rule__Item__Group__0__Impl : ( 'item[' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4603:1: ( ( 'item[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4604:1: ( 'item[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4604:1: ( 'item[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4605:1: 'item['
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group__0__Impl9360); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4618:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4622:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4623:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19391);
            rule__Item__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19394);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4630:1: rule__Item__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4634:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4635:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4635:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4636:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4637:1: ( RULE_MULTI_NL )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_MULTI_NL) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4637:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9422); 

                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4647:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4651:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4652:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29453);
            rule__Item__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29456);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4659:1: rule__Item__Group__2__Impl : ( ( rule__Item__ContentsAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4663:1: ( ( ( rule__Item__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4664:1: ( ( rule__Item__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4664:1: ( ( rule__Item__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4665:1: ( rule__Item__ContentsAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4666:1: ( rule__Item__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4666:2: rule__Item__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9483);
            rule__Item__ContentsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4676:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4680:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4681:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39513);
            rule__Item__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39516);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4688:1: rule__Item__Group__3__Impl : ( ( rule__Item__Group_3__0 )* ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4692:1: ( ( ( rule__Item__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4693:1: ( ( rule__Item__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4693:1: ( ( rule__Item__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4694:1: ( rule__Item__Group_3__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4695:1: ( rule__Item__Group_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_MULTI_NL) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4695:2: rule__Item__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9543);
            	    rule__Item__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4705:1: rule__Item__Group__4 : rule__Item__Group__4__Impl ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4709:1: ( rule__Item__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4710:2: rule__Item__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49574);
            rule__Item__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4716:1: rule__Item__Group__4__Impl : ( ']' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4720:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4721:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4721:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4722:1: ']'
            {
             before(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Item__Group__4__Impl9602); 
             after(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Item__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4745:1: rule__Item__Group_3__0 : rule__Item__Group_3__0__Impl rule__Item__Group_3__1 ;
    public final void rule__Item__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4749:1: ( rule__Item__Group_3__0__Impl rule__Item__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4750:2: rule__Item__Group_3__0__Impl rule__Item__Group_3__1
            {
            pushFollow(FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09643);
            rule__Item__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09646);
            rule__Item__Group_3__1();
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
    // $ANTLR end rule__Item__Group_3__0


    // $ANTLR start rule__Item__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4757:1: rule__Item__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Item__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4761:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4762:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4762:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4763:1: RULE_MULTI_NL
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9673); 
             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_3__0__Impl


    // $ANTLR start rule__Item__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4774:1: rule__Item__Group_3__1 : rule__Item__Group_3__1__Impl ;
    public final void rule__Item__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4778:1: ( rule__Item__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4779:2: rule__Item__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19702);
            rule__Item__Group_3__1__Impl();
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
    // $ANTLR end rule__Item__Group_3__1


    // $ANTLR start rule__Item__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4785:1: rule__Item__Group_3__1__Impl : ( ( rule__Item__ContentsAssignment_3_1 ) ) ;
    public final void rule__Item__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4789:1: ( ( ( rule__Item__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4790:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4790:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4791:1: ( rule__Item__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4792:1: ( rule__Item__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4792:2: rule__Item__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9729);
            rule__Item__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_3__1__Impl


    // $ANTLR start rule__CodeRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4806:1: rule__CodeRef__Group__0 : rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 ;
    public final void rule__CodeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4810:1: ( rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4811:2: rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09763);
            rule__CodeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09766);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4818:1: rule__CodeRef__Group__0__Impl : ( 'codeRef[' ) ;
    public final void rule__CodeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4822:1: ( ( 'codeRef[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4823:1: ( 'codeRef[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4823:1: ( 'codeRef[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4824:1: 'codeRef['
            {
             before(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__CodeRef__Group__0__Impl9794); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4837:1: rule__CodeRef__Group__1 : rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 ;
    public final void rule__CodeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4841:1: ( rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4842:2: rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19825);
            rule__CodeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19828);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4849:1: rule__CodeRef__Group__1__Impl : ( ( rule__CodeRef__ElementAssignment_1 ) ) ;
    public final void rule__CodeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4853:1: ( ( ( rule__CodeRef__ElementAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4854:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4854:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4855:1: ( rule__CodeRef__ElementAssignment_1 )
            {
             before(grammarAccess.getCodeRefAccess().getElementAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4856:1: ( rule__CodeRef__ElementAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4856:2: rule__CodeRef__ElementAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl9855);
            rule__CodeRef__ElementAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getElementAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4866:1: rule__CodeRef__Group__2 : rule__CodeRef__Group__2__Impl ;
    public final void rule__CodeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4870:1: ( rule__CodeRef__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4871:2: rule__CodeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__29885);
            rule__CodeRef__Group__2__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4877:1: rule__CodeRef__Group__2__Impl : ( ']' ) ;
    public final void rule__CodeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4881:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4882:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4882:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4883:1: ']'
            {
             before(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__CodeRef__Group__2__Impl9913); 
             after(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Link__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4902:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4906:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4907:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__09950);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__09953);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4914:1: rule__Link__Group__0__Impl : ( 'link[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4918:1: ( ( 'link[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4919:1: ( 'link[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4919:1: ( 'link[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4920:1: 'link['
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Link__Group__0__Impl9981); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4933:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4937:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4938:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110012);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110015);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4945:1: rule__Link__Group__1__Impl : ( ( rule__Link__UrlAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4949:1: ( ( ( rule__Link__UrlAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4950:1: ( ( rule__Link__UrlAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4950:1: ( ( rule__Link__UrlAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4951:1: ( rule__Link__UrlAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4952:1: ( rule__Link__UrlAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4952:2: rule__Link__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10042);
            rule__Link__UrlAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4962:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4966:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4967:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210072);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210075);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4974:1: rule__Link__Group__2__Impl : ( ']' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4978:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4979:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4979:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4980:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Link__Group__2__Impl10103); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4993:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4997:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4998:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310134);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310137);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5005:1: rule__Link__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5009:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5010:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5010:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5011:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5012:1: ( ruleANY_WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_SINGLE_NL)||LA50_0==RULE_MULTI_NL) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5012:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10165);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5022:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5026:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5027:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410196);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410199);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5034:1: rule__Link__Group__4__Impl : ( '[' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5038:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5039:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5039:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5040:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Link__Group__4__Impl10227); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5053:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5057:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5058:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510258);
            rule__Link__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510261);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5065:1: rule__Link__Group__5__Impl : ( ( rule__Link__TextAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5069:1: ( ( ( rule__Link__TextAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5070:1: ( ( rule__Link__TextAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5070:1: ( ( rule__Link__TextAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5071:1: ( rule__Link__TextAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5072:1: ( rule__Link__TextAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5072:2: rule__Link__TextAssignment_5
            {
            pushFollow(FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10288);
            rule__Link__TextAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTextAssignment_5()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5082:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5086:1: ( rule__Link__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5087:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610318);
            rule__Link__Group__6__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5093:1: rule__Link__Group__6__Impl : ( ']' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5097:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5098:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5098:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5099:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Link__Group__6__Impl10346); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start rule__ImageRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5126:1: rule__ImageRef__Group__0 : rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 ;
    public final void rule__ImageRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5130:1: ( rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5131:2: rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010391);
            rule__ImageRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010394);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5138:1: rule__ImageRef__Group__0__Impl : ( ( rule__ImageRef__Alternatives_0 ) ) ;
    public final void rule__ImageRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5142:1: ( ( ( rule__ImageRef__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5143:1: ( ( rule__ImageRef__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5143:1: ( ( rule__ImageRef__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5144:1: ( rule__ImageRef__Alternatives_0 )
            {
             before(grammarAccess.getImageRefAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5145:1: ( rule__ImageRef__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5145:2: rule__ImageRef__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10421);
            rule__ImageRef__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5155:1: rule__ImageRef__Group__1 : rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 ;
    public final void rule__ImageRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5159:1: ( rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5160:2: rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110451);
            rule__ImageRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110454);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5167:1: rule__ImageRef__Group__1__Impl : ( ( rule__ImageRef__PathAssignment_1 ) ) ;
    public final void rule__ImageRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5171:1: ( ( ( rule__ImageRef__PathAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5172:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5172:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5173:1: ( rule__ImageRef__PathAssignment_1 )
            {
             before(grammarAccess.getImageRefAccess().getPathAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5174:1: ( rule__ImageRef__PathAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5174:2: rule__ImageRef__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10481);
            rule__ImageRef__PathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getPathAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5184:1: rule__ImageRef__Group__2 : rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 ;
    public final void rule__ImageRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5188:1: ( rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5189:2: rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210511);
            rule__ImageRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210514);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5196:1: rule__ImageRef__Group__2__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5200:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5201:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5201:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5202:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__2__Impl10542); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5215:1: rule__ImageRef__Group__3 : rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 ;
    public final void rule__ImageRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5219:1: ( rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5220:2: rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310573);
            rule__ImageRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310576);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5227:1: rule__ImageRef__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5231:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5232:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5232:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5233:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5234:1: ( ruleANY_WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_SINGLE_NL)||LA51_0==RULE_MULTI_NL) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5234:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10604);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5244:1: rule__ImageRef__Group__4 : rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 ;
    public final void rule__ImageRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5248:1: ( rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5249:2: rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410635);
            rule__ImageRef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410638);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5256:1: rule__ImageRef__Group__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5260:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5261:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5261:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5262:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__4__Impl10666); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5275:1: rule__ImageRef__Group__5 : rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 ;
    public final void rule__ImageRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5279:1: ( rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5280:2: rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510697);
            rule__ImageRef__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510700);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5287:1: rule__ImageRef__Group__5__Impl : ( ( rule__ImageRef__ClazzAssignment_5 ) ) ;
    public final void rule__ImageRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5291:1: ( ( ( rule__ImageRef__ClazzAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5292:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5292:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5293:1: ( rule__ImageRef__ClazzAssignment_5 )
            {
             before(grammarAccess.getImageRefAccess().getClazzAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5294:1: ( rule__ImageRef__ClazzAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5294:2: rule__ImageRef__ClazzAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10727);
            rule__ImageRef__ClazzAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getClazzAssignment_5()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5304:1: rule__ImageRef__Group__6 : rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 ;
    public final void rule__ImageRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5308:1: ( rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5309:2: rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610757);
            rule__ImageRef__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610760);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5316:1: rule__ImageRef__Group__6__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5320:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5321:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5321:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5322:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__6__Impl10788); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5335:1: rule__ImageRef__Group__7 : rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 ;
    public final void rule__ImageRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5339:1: ( rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5340:2: rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710819);
            rule__ImageRef__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710822);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5347:1: rule__ImageRef__Group__7__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5351:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5352:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5352:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5353:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5354:1: ( ruleANY_WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_SINGLE_NL)||LA52_0==RULE_MULTI_NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5354:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl10850);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5364:1: rule__ImageRef__Group__8 : rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 ;
    public final void rule__ImageRef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5368:1: ( rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5369:2: rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__810881);
            rule__ImageRef__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__810884);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5376:1: rule__ImageRef__Group__8__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5380:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5381:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5381:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5382:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__8__Impl10912); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5395:1: rule__ImageRef__Group__9 : rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 ;
    public final void rule__ImageRef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5399:1: ( rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5400:2: rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__910943);
            rule__ImageRef__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__910946);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5407:1: rule__ImageRef__Group__9__Impl : ( ( rule__ImageRef__StyleAssignment_9 ) ) ;
    public final void rule__ImageRef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5411:1: ( ( ( rule__ImageRef__StyleAssignment_9 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5412:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5412:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5413:1: ( rule__ImageRef__StyleAssignment_9 )
            {
             before(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5414:1: ( rule__ImageRef__StyleAssignment_9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5414:2: rule__ImageRef__StyleAssignment_9
            {
            pushFollow(FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl10973);
            rule__ImageRef__StyleAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5424:1: rule__ImageRef__Group__10 : rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 ;
    public final void rule__ImageRef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5428:1: ( rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5429:2: rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011003);
            rule__ImageRef__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011006);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5436:1: rule__ImageRef__Group__10__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5440:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5441:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5441:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5442:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__10__Impl11034); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5455:1: rule__ImageRef__Group__11 : rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 ;
    public final void rule__ImageRef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5459:1: ( rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5460:2: rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111065);
            rule__ImageRef__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111068);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5467:1: rule__ImageRef__Group__11__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5471:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5472:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5472:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5473:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5474:1: ( ruleANY_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_SINGLE_NL)||LA53_0==RULE_MULTI_NL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5474:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11096);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5484:1: rule__ImageRef__Group__12 : rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 ;
    public final void rule__ImageRef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5488:1: ( rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5489:2: rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211127);
            rule__ImageRef__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211130);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5496:1: rule__ImageRef__Group__12__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5500:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5501:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5501:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5502:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__12__Impl11158); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5515:1: rule__ImageRef__Group__13 : rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 ;
    public final void rule__ImageRef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5519:1: ( rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5520:2: rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311189);
            rule__ImageRef__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311192);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: rule__ImageRef__Group__13__Impl : ( ( rule__ImageRef__CaptionAssignment_13 ) ) ;
    public final void rule__ImageRef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5531:1: ( ( ( rule__ImageRef__CaptionAssignment_13 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5532:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5532:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5533:1: ( rule__ImageRef__CaptionAssignment_13 )
            {
             before(grammarAccess.getImageRefAccess().getCaptionAssignment_13()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5534:1: ( rule__ImageRef__CaptionAssignment_13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5534:2: rule__ImageRef__CaptionAssignment_13
            {
            pushFollow(FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11219);
            rule__ImageRef__CaptionAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getCaptionAssignment_13()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5544:1: rule__ImageRef__Group__14 : rule__ImageRef__Group__14__Impl ;
    public final void rule__ImageRef__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5548:1: ( rule__ImageRef__Group__14__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5549:2: rule__ImageRef__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411249);
            rule__ImageRef__Group__14__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5555:1: rule__ImageRef__Group__14__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5559:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5560:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5560:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5561:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__14__Impl11277); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14()); 

            }


            }

        }
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


    // $ANTLR start rule__ImageRef__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5604:1: rule__ImageRef__Group_0_0__0 : rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 ;
    public final void rule__ImageRef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5608:1: ( rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5609:2: rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011338);
            rule__ImageRef__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011341);
            rule__ImageRef__Group_0_0__1();
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
    // $ANTLR end rule__ImageRef__Group_0_0__0


    // $ANTLR start rule__ImageRef__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5616:1: rule__ImageRef__Group_0_0__0__Impl : ( 'img:' ) ;
    public final void rule__ImageRef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5620:1: ( ( 'img:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5621:1: ( 'img:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5621:1: ( 'img:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5622:1: 'img:'
            {
             before(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__ImageRef__Group_0_0__0__Impl11369); 
             after(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__0__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5635:1: rule__ImageRef__Group_0_0__1 : rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 ;
    public final void rule__ImageRef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5639:1: ( rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5640:2: rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111400);
            rule__ImageRef__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111403);
            rule__ImageRef__Group_0_0__2();
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
    // $ANTLR end rule__ImageRef__Group_0_0__1


    // $ANTLR start rule__ImageRef__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5647:1: rule__ImageRef__Group_0_0__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5651:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5652:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5652:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5653:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5654:1: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_SINGLE_NL)||LA54_0==RULE_MULTI_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5654:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11431);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__1__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5664:1: rule__ImageRef__Group_0_0__2 : rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 ;
    public final void rule__ImageRef__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5668:1: ( rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5669:2: rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211462);
            rule__ImageRef__Group_0_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211465);
            rule__ImageRef__Group_0_0__3();
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
    // $ANTLR end rule__ImageRef__Group_0_0__2


    // $ANTLR start rule__ImageRef__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5676:1: rule__ImageRef__Group_0_0__2__Impl : ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) ;
    public final void rule__ImageRef__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5680:1: ( ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5681:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5681:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5682:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            {
             before(grammarAccess.getImageRefAccess().getNameAssignment_0_0_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5683:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5683:2: rule__ImageRef__NameAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11492);
            rule__ImageRef__NameAssignment_0_0_2();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getNameAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__2__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5693:1: rule__ImageRef__Group_0_0__3 : rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 ;
    public final void rule__ImageRef__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5697:1: ( rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5698:2: rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311522);
            rule__ImageRef__Group_0_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311525);
            rule__ImageRef__Group_0_0__4();
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
    // $ANTLR end rule__ImageRef__Group_0_0__3


    // $ANTLR start rule__ImageRef__Group_0_0__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5705:1: rule__ImageRef__Group_0_0__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5709:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5710:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5710:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5711:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5712:1: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_SINGLE_NL)||LA55_0==RULE_MULTI_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5712:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11553);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__3__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5722:1: rule__ImageRef__Group_0_0__4 : rule__ImageRef__Group_0_0__4__Impl ;
    public final void rule__ImageRef__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5726:1: ( rule__ImageRef__Group_0_0__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5727:2: rule__ImageRef__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411584);
            rule__ImageRef__Group_0_0__4__Impl();
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
    // $ANTLR end rule__ImageRef__Group_0_0__4


    // $ANTLR start rule__ImageRef__Group_0_0__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5733:1: rule__ImageRef__Group_0_0__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5737:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5738:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5738:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5739:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group_0_0__4__Impl11612); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__4__Impl


    // $ANTLR start rule__CodeBlock__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5762:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5766:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5767:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011653);
            rule__CodeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011656);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5774:1: rule__CodeBlock__Group__0__Impl : ( 'code[' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5778:1: ( ( 'code[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5779:1: ( 'code[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5779:1: ( 'code[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5780:1: 'code['
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__CodeBlock__Group__0__Impl11684); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5793:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5797:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5798:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111715);
            rule__CodeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111718);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5805:1: rule__CodeBlock__Group__1__Impl : ( ( rule__CodeBlock__Group_1__0 )? ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5809:1: ( ( ( rule__CodeBlock__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5810:1: ( ( rule__CodeBlock__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5810:1: ( ( rule__CodeBlock__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5811:1: ( rule__CodeBlock__Group_1__0 )?
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5812:1: ( rule__CodeBlock__Group_1__0 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5812:2: rule__CodeBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11745);
                    rule__CodeBlock__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5822:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5826:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5827:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211776);
            rule__CodeBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211779);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5834:1: rule__CodeBlock__Group__2__Impl : ( ( rule__CodeBlock__Alternatives_2 ) ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5838:1: ( ( ( rule__CodeBlock__Alternatives_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5839:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5839:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5840:1: ( rule__CodeBlock__Alternatives_2 )
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5841:1: ( rule__CodeBlock__Alternatives_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5841:2: rule__CodeBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11806);
            rule__CodeBlock__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5851:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5855:1: ( rule__CodeBlock__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5856:2: rule__CodeBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311836);
            rule__CodeBlock__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5862:1: rule__CodeBlock__Group__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5866:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5867:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5867:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5868:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__CodeBlock__Group__3__Impl11864); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__CodeBlock__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5889:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5893:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5894:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__011903);
            rule__CodeBlock__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__011906);
            rule__CodeBlock__Group_1__1();
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
    // $ANTLR end rule__CodeBlock__Group_1__0


    // $ANTLR start rule__CodeBlock__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5901:1: rule__CodeBlock__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5905:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5906:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5906:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5907:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5908:1: ( ruleANY_WS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_SINGLE_NL)||LA57_0==RULE_MULTI_NL) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5908:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl11934);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5918:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5922:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5923:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__111965);
            rule__CodeBlock__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__111968);
            rule__CodeBlock__Group_1__2();
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
    // $ANTLR end rule__CodeBlock__Group_1__1


    // $ANTLR start rule__CodeBlock__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5930:1: rule__CodeBlock__Group_1__1__Impl : ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5934:1: ( ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5935:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5935:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5936:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5937:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5937:2: rule__CodeBlock__LanguageAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl11995);
            rule__CodeBlock__LanguageAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_1__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5947:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5951:1: ( rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5952:2: rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212025);
            rule__CodeBlock__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212028);
            rule__CodeBlock__Group_1__3();
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
    // $ANTLR end rule__CodeBlock__Group_1__2


    // $ANTLR start rule__CodeBlock__Group_1__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5959:1: rule__CodeBlock__Group_1__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5963:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5964:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5964:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5965:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5966:1: ( ruleANY_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_SINGLE_NL)||LA58_0==RULE_MULTI_NL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5966:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12056);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__2__Impl


    // $ANTLR start rule__CodeBlock__Group_1__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5976:1: rule__CodeBlock__Group_1__3 : rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 ;
    public final void rule__CodeBlock__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5980:1: ( rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5981:2: rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312087);
            rule__CodeBlock__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312090);
            rule__CodeBlock__Group_1__4();
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
    // $ANTLR end rule__CodeBlock__Group_1__3


    // $ANTLR start rule__CodeBlock__Group_1__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5988:1: rule__CodeBlock__Group_1__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5992:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5993:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5993:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5994:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,18,FOLLOW_18_in_rule__CodeBlock__Group_1__3__Impl12118); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__3__Impl


    // $ANTLR start rule__CodeBlock__Group_1__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6007:1: rule__CodeBlock__Group_1__4 : rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 ;
    public final void rule__CodeBlock__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6011:1: ( rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6012:2: rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412149);
            rule__CodeBlock__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412152);
            rule__CodeBlock__Group_1__5();
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
    // $ANTLR end rule__CodeBlock__Group_1__4


    // $ANTLR start rule__CodeBlock__Group_1__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6019:1: rule__CodeBlock__Group_1__4__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6023:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6024:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6024:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6025:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6026:1: ( ruleANY_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_WS && LA59_0<=RULE_SINGLE_NL)||LA59_0==RULE_MULTI_NL) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6026:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12180);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__4__Impl


    // $ANTLR start rule__CodeBlock__Group_1__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6036:1: rule__CodeBlock__Group_1__5 : rule__CodeBlock__Group_1__5__Impl ;
    public final void rule__CodeBlock__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6040:1: ( rule__CodeBlock__Group_1__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6041:2: rule__CodeBlock__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512211);
            rule__CodeBlock__Group_1__5__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_1__5


    // $ANTLR start rule__CodeBlock__Group_1__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6047:1: rule__CodeBlock__Group_1__5__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6051:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6052:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6052:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6053:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5()); 
            match(input,20,FOLLOW_20_in_rule__CodeBlock__Group_1__5__Impl12239); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__5__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6078:1: rule__CodeBlock__Group_2_0__0 : rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 ;
    public final void rule__CodeBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6082:1: ( rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6083:2: rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012282);
            rule__CodeBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012285);
            rule__CodeBlock__Group_2_0__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_0__0


    // $ANTLR start rule__CodeBlock__Group_2_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6090:1: rule__CodeBlock__Group_2_0__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6094:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6095:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6095:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6096:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6097:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6097:2: rule__CodeBlock__ContentsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12312);
            rule__CodeBlock__ContentsAssignment_2_0_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6107:1: rule__CodeBlock__Group_2_0__1 : rule__CodeBlock__Group_2_0__1__Impl ;
    public final void rule__CodeBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6111:1: ( rule__CodeBlock__Group_2_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6112:2: rule__CodeBlock__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112342);
            rule__CodeBlock__Group_2_0__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_0__1


    // $ANTLR start rule__CodeBlock__Group_2_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6118:1: rule__CodeBlock__Group_2_0__1__Impl : ( ( rule__CodeBlock__Group_2_0_1__0 )* ) ;
    public final void rule__CodeBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6122:1: ( ( ( rule__CodeBlock__Group_2_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6123:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6123:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6124:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_2_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6125:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=25 && LA60_0<=27)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6125:2: rule__CodeBlock__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12369);
            	    rule__CodeBlock__Group_2_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0__1__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6139:1: rule__CodeBlock__Group_2_0_1__0 : rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 ;
    public final void rule__CodeBlock__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6143:1: ( rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6144:2: rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012404);
            rule__CodeBlock__Group_2_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012407);
            rule__CodeBlock__Group_2_0_1__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_0_1__0


    // $ANTLR start rule__CodeBlock__Group_2_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6151:1: rule__CodeBlock__Group_2_0_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6155:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6156:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6156:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6157:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6158:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6158:2: rule__CodeBlock__ContentsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12434);
            rule__CodeBlock__ContentsAssignment_2_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6168:1: rule__CodeBlock__Group_2_0_1__1 : rule__CodeBlock__Group_2_0_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6172:1: ( rule__CodeBlock__Group_2_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6173:2: rule__CodeBlock__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112464);
            rule__CodeBlock__Group_2_0_1__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_0_1__1


    // $ANTLR start rule__CodeBlock__Group_2_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6179:1: rule__CodeBlock__Group_2_0_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6183:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6184:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6184:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6185:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6186:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_MULTI_NL)||(LA61_0>=15 && LA61_0<=16)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6186:2: rule__CodeBlock__ContentsAssignment_2_0_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12491);
                    rule__CodeBlock__ContentsAssignment_2_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_2_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6200:1: rule__CodeBlock__Group_2_1__0 : rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 ;
    public final void rule__CodeBlock__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6204:1: ( rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6205:2: rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012526);
            rule__CodeBlock__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012529);
            rule__CodeBlock__Group_2_1__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_1__0


    // $ANTLR start rule__CodeBlock__Group_2_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6212:1: rule__CodeBlock__Group_2_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6216:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6217:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6217:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6218:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6219:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6219:2: rule__CodeBlock__ContentsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12556);
            rule__CodeBlock__ContentsAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6229:1: rule__CodeBlock__Group_2_1__1 : rule__CodeBlock__Group_2_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6233:1: ( rule__CodeBlock__Group_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6234:2: rule__CodeBlock__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112586);
            rule__CodeBlock__Group_2_1__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_1__1


    // $ANTLR start rule__CodeBlock__Group_2_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6240:1: rule__CodeBlock__Group_2_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6244:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6245:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6245:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6246:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6247:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_MULTI_NL)||(LA62_0>=15 && LA62_0<=16)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6247:2: rule__CodeBlock__ContentsAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12613);
                    rule__CodeBlock__ContentsAssignment_2_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_1__1__Impl


    // $ANTLR start rule__Document__ChaptersAssignment_3_0_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6262:1: rule__Document__ChaptersAssignment_3_0_0_0 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6266:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6267:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6267:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6268:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_012653);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6277:1: rule__Document__ChaptersAssignment_3_0_0_1_1 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6281:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6282:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6282:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6283:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_112684);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6292:1: rule__Document__SectionsAssignment_3_0_1_0 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6296:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6297:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6297:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6298:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012715);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6307:1: rule__Document__SectionsAssignment_3_0_1_1_1 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6311:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6312:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6312:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6313:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112746);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6322:1: rule__Document__SubsectionsAssignment_3_0_2_0 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6326:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6327:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6327:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6328:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_012777);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6337:1: rule__Document__SubsectionsAssignment_3_0_2_1_1 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6341:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6342:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6342:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6343:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_112808);
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


    // $ANTLR start rule__Chapter__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6352:1: rule__Chapter__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6356:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6357:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6357:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6358:1: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112839); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__NameAssignment_0_0_1


    // $ANTLR start rule__Chapter__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6367:1: rule__Chapter__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6371:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6372:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6372:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6373:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_112870);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__TitleAssignment_1


    // $ANTLR start rule__Chapter__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6382:1: rule__Chapter__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6386:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6387:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6387:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6388:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_112901);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_3_1


    // $ANTLR start rule__Chapter__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6397:1: rule__Chapter__ContentsAssignment_4_1 : ( ruleSection ) ;
    public final void rule__Chapter__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6401:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6402:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6402:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6403:1: ruleSection
            {
             before(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_4_112932);
            ruleSection();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_4_1


    // $ANTLR start rule__Section__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6412:1: rule__Section__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6416:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6417:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6417:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6418:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_112963); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__NameAssignment_0_0_1


    // $ANTLR start rule__Section__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6427:1: rule__Section__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6431:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6432:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6432:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6433:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_112994);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__TitleAssignment_1


    // $ANTLR start rule__Section__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6442:1: rule__Section__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6446:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6447:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6447:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6448:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113025);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_3_1


    // $ANTLR start rule__Section__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6457:1: rule__Section__ContentsAssignment_4_1 : ( ruleSubSection ) ;
    public final void rule__Section__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6461:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6462:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6462:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6463:1: ruleSubSection
            {
             before(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_4_113056);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_4_1


    // $ANTLR start rule__SubSection__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6472:1: rule__SubSection__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__SubSection__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6476:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6477:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6477:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6478:1: RULE_ID
            {
             before(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_0_0_113087); 
             after(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__NameAssignment_0_0_1


    // $ANTLR start rule__SubSection__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6487:1: rule__SubSection__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6491:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6492:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6492:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6493:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_113118);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__TitleAssignment_1


    // $ANTLR start rule__SubSection__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6502:1: rule__SubSection__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6506:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6507:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6507:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6508:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_3_113149);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_3_1


    // $ANTLR start rule__SubSection__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6517:1: rule__SubSection__ContentsAssignment_4_1 : ( ruleSection3 ) ;
    public final void rule__SubSection__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6521:1: ( ( ruleSection3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6522:1: ( ruleSection3 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6522:1: ( ruleSection3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6523:1: ruleSection3
            {
             before(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_4_113180);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_4_1


    // $ANTLR start rule__Section3__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6532:1: rule__Section3__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section3__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6536:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6537:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6537:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6538:1: RULE_ID
            {
             before(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113211); 
             after(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__NameAssignment_0_0_1


    // $ANTLR start rule__Section3__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6547:1: rule__Section3__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6551:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6552:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6552:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6553:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113242);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__TitleAssignment_1


    // $ANTLR start rule__Section3__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6562:1: rule__Section3__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6566:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6567:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6567:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6568:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113273);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_3_1


    // $ANTLR start rule__Section3__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6577:1: rule__Section3__ContentsAssignment_4_1 : ( ruleSection4 ) ;
    public final void rule__Section3__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6581:1: ( ( ruleSection4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6582:1: ( ruleSection4 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6582:1: ( ruleSection4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6583:1: ruleSection4
            {
             before(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_4_113304);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_4_1


    // $ANTLR start rule__Section4__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6592:1: rule__Section4__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section4__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6596:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6597:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6597:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6598:1: RULE_ID
            {
             before(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113335); 
             after(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__NameAssignment_0_0_1


    // $ANTLR start rule__Section4__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6607:1: rule__Section4__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6611:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6612:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6612:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6613:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113366);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__TitleAssignment_1


    // $ANTLR start rule__Section4__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6622:1: rule__Section4__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6626:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6627:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6627:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6628:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113397);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_3_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6637:1: rule__TextOrMarkup__ContentsAssignment_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6641:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6642:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6642:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6643:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013428);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6652:1: rule__TextOrMarkup__ContentsAssignment_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6656:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6657:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6657:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6658:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013459);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6667:1: rule__TextOrMarkup__ContentsAssignment_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6671:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6672:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6672:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6673:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113490);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6682:1: rule__TextOrMarkup__ContentsAssignment_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6686:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6687:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6687:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6688:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013521);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6697:1: rule__TextOrMarkup__ContentsAssignment_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6701:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6702:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6702:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6703:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113552);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6712:1: rule__TextPart__TextAssignment : ( ruleText ) ;
    public final void rule__TextPart__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6716:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6717:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6717:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6718:1: ruleText
            {
             before(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__TextPart__TextAssignment13583);
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


    // $ANTLR start rule__Emphasize__ContentsAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6727:1: rule__Emphasize__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Emphasize__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6731:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6732:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6732:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6733:1: ruleTextOrMarkup
            {
             before(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213614);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__ContentsAssignment_2


    // $ANTLR start rule__Anchor__NameAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6742:1: rule__Anchor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Anchor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6746:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6747:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6747:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6748:1: RULE_ID
            {
             before(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113645); 
             after(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__NameAssignment_1


    // $ANTLR start rule__Ref__RefAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6757:1: rule__Ref__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6761:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6762:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6762:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6763:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6764:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6765:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113680); 
             after(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__RefAssignment_1


    // $ANTLR start rule__Ref__ContentsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6776:1: rule__Ref__ContentsAssignment_4 : ( ruleTextOrMarkup ) ;
    public final void rule__Ref__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6780:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6781:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6781:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6782:1: ruleTextOrMarkup
            {
             before(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413715);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__ContentsAssignment_4


    // $ANTLR start rule__OrderedList__ItemsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6791:1: rule__OrderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__OrderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6795:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6796:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6796:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6797:1: ruleItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113746);
            ruleItem();
            _fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__ItemsAssignment_1_1


    // $ANTLR start rule__UnorderedList__ItemsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6806:1: rule__UnorderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6810:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6811:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6811:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6812:1: ruleItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113777);
            ruleItem();
            _fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__ItemsAssignment_1_1


    // $ANTLR start rule__Item__ContentsAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6821:1: rule__Item__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6825:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6826:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6826:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6827:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213808);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_2


    // $ANTLR start rule__Item__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6836:1: rule__Item__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6840:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6841:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6841:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6842:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113839);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_3_1


    // $ANTLR start rule__CodeRef__ElementAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6851:1: rule__CodeRef__ElementAssignment_1 : ( ( ruleText ) ) ;
    public final void rule__CodeRef__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6855:1: ( ( ( ruleText ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6856:1: ( ( ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6856:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6857:1: ( ruleText )
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6858:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6859:1: ruleText
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_113874);
            ruleText();
            _fsp--;

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__ElementAssignment_1


    // $ANTLR start rule__Link__UrlAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6870:1: rule__Link__UrlAssignment_1 : ( ruleText ) ;
    public final void rule__Link__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6874:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6875:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6875:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6876:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__UrlAssignment_113909);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__UrlAssignment_1


    // $ANTLR start rule__Link__TextAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6885:1: rule__Link__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Link__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6889:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6890:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6890:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6891:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__TextAssignment_513940);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__TextAssignment_5


    // $ANTLR start rule__ImageRef__NameAssignment_0_0_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6900:1: rule__ImageRef__NameAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__ImageRef__NameAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6904:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6905:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6905:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6906:1: RULE_ID
            {
             before(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_213971); 
             after(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__NameAssignment_0_0_2


    // $ANTLR start rule__ImageRef__PathAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6915:1: rule__ImageRef__PathAssignment_1 : ( ruleText ) ;
    public final void rule__ImageRef__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6919:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6920:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6920:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6921:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114002);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__PathAssignment_1


    // $ANTLR start rule__ImageRef__ClazzAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6930:1: rule__ImageRef__ClazzAssignment_5 : ( ruleText ) ;
    public final void rule__ImageRef__ClazzAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6934:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6935:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6935:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6936:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514033);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__ClazzAssignment_5


    // $ANTLR start rule__ImageRef__StyleAssignment_9
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6945:1: rule__ImageRef__StyleAssignment_9 : ( ruleText ) ;
    public final void rule__ImageRef__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6949:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6950:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6950:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6951:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914064);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__StyleAssignment_9


    // $ANTLR start rule__ImageRef__CaptionAssignment_13
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6960:1: rule__ImageRef__CaptionAssignment_13 : ( ruleText ) ;
    public final void rule__ImageRef__CaptionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6964:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6965:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6965:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6966:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314095);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__CaptionAssignment_13


    // $ANTLR start rule__CodeBlock__LanguageAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6975:1: rule__CodeBlock__LanguageAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CodeBlock__LanguageAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6979:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6980:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6980:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6981:1: RULE_ID
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114126); 
             after(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__LanguageAssignment_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6990:1: rule__CodeBlock__ContentsAssignment_2_0_0 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6994:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6995:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6995:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6996:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014157);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7005:1: rule__CodeBlock__ContentsAssignment_2_0_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7009:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7010:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7010:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7011:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014188);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7020:1: rule__CodeBlock__ContentsAssignment_2_0_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7024:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7025:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7025:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7026:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114219);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7035:1: rule__CodeBlock__ContentsAssignment_2_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7039:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7040:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7040:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7041:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014250);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7050:1: rule__CodeBlock__ContentsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7054:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7055:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7055:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7056:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114281);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_1_1


    // $ANTLR start rule__Code__ContentsAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7065:1: rule__Code__ContentsAssignment : ( ruleCodeText ) ;
    public final void rule__Code__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7069:1: ( ( ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7070:1: ( ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7070:1: ( ruleCodeText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7071:1: ruleCodeText
            {
             before(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14312);
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


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA42_eotS =
        "\6\uffff";
    static final String DFA42_eofS =
        "\6\uffff";
    static final String DFA42_minS =
        "\4\5\2\uffff";
    static final String DFA42_maxS =
        "\4\36\2\uffff";
    static final String DFA42_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\6\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 4253:1: ( rule__OrderedList__Group_1__0 )*";
        }
    }
    static final String DFA45_eotS =
        "\6\uffff";
    static final String DFA45_eofS =
        "\6\uffff";
    static final String DFA45_minS =
        "\4\5\2\uffff";
    static final String DFA45_maxS =
        "\4\36\2\uffff";
    static final String DFA45_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA45_specialS =
        "\6\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 4448:1: ( rule__UnorderedList__Group_1__0 )*";
        }
    }
    static final String DFA56_eotS =
        "\31\uffff";
    static final String DFA56_eofS =
        "\15\uffff\4\5\1\uffff\7\5";
    static final String DFA56_minS =
        "\5\4\1\uffff\13\4\1\uffff\7\4";
    static final String DFA56_maxS =
        "\5\33\1\uffff\7\33\4\42\1\uffff\7\42";
    static final String DFA56_acceptS =
        "\5\uffff\1\2\13\uffff\1\1\7\uffff";
    static final String DFA56_specialS =
        "\31\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\4\1\3\1\2\1\5\1\1\6\uffff\2\5\10\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\20\1\17\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\12\5\1\21\11\5\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\10\5\1\uffff\1\5\1\21\11\5\1"+
            "\uffff\4\5"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "5812:1: ( rule__CodeBlock__Group_1__0 )?";
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
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText578 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText590 = new BitSet(new long[]{0x00000000000180F2L});
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
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Chapter__Alternatives_01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section__Alternatives_01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__0_in_rule__SubSection__Alternatives_01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SubSection__Alternatives_01740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section3__Alternatives_01793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section4__Alternatives_01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1901 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1913 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Text__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Text__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImageRef__Alternatives_02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22313 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22325 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeText__Alternatives2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CodeText__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02631 = new BitSet(new long[]{0x0000000000681D22L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12692 = new BitSet(new long[]{0x0000000000681D02L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22754 = new BitSet(new long[]{0x0000000000681C02L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02882 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03005 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3092 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03127 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03247 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3334 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03369 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03489 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3576 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03611 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03731 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13791 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23851 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Chapter__Group__2__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33913 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl3943 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4001 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Chapter__Group_0_0__0__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14104 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Chapter__Group_0_0__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04229 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04349 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04469 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24589 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section__Group__2__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34651 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4681 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4739 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section__Group_0_0__0__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__14842 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__14845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__24902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section__Group_0_0__2__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__04967 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05087 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_4_1_in_rule__Section__Group_4__1__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05207 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Alternatives_0_in_rule__SubSection__Group__0__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15267 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__TitleAssignment_1_in_rule__SubSection__Group__1__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25327 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SubSection__Group__2__Impl5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35389 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__0_in_rule__SubSection__Group__3__Impl5419 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__0_in_rule__SubSection__Group__4__Impl5477 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__0__Impl_in_rule__SubSection__Group_0_0__05518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__1_in_rule__SubSection__Group_0_0__05521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SubSection__Group_0_0__0__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__1__Impl_in_rule__SubSection__Group_0_0__15580 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__2_in_rule__SubSection__Group_0_0__15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__NameAssignment_0_0_1_in_rule__SubSection__Group_0_0__1__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__2__Impl_in_rule__SubSection__Group_0_0__25640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SubSection__Group_0_0__2__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__0__Impl_in_rule__SubSection__Group_3__05705 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__1_in_rule__SubSection__Group_3__05708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_3__0__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__1__Impl_in_rule__SubSection__Group_3__15764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_3_1_in_rule__SubSection__Group_3__1__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__0__Impl_in_rule__SubSection__Group_4__05825 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__1_in_rule__SubSection__Group_4__05828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_4__0__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__1__Impl_in_rule__SubSection__Group_4__15884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_4_1_in_rule__SubSection__Group_4__1__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05945 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16005 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26065 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section3__Group__2__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36127 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6157 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6215 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Section3__Group_0_0__0__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section3__Group_0_0__2__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06443 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06563 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06683 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16743 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26803 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section4__Group__2__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl6892 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__06931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__06934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Section4__Group_0_0__0__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__16993 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section4__Group_0_0__2__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07118 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07238 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7325 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07360 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07482 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07604 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Emphasize__Group__0__Impl7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17666 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27728 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Emphasize__Group__4__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__07919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__07922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Anchor__Group__0__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__17981 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__17984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Anchor__Group__2__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ref__Group__0__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28228 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ref__Group__2__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38290 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48352 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ref__Group__6__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08547 = new BitSet(new long[]{0x0000000040000160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OrderedList__Group__0__Impl8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18609 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8641 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8653 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28686 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8717 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OrderedList__Group__3__Impl8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08815 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl8846 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__08938 = new BitSet(new long[]{0x0000000040000160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__08941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UnorderedList__Group__0__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19000 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9032 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9044 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9108 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UnorderedList__Group__3__Impl9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09206 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9237 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09329 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group__0__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19391 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29453 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39513 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9543 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Item__Group__4__Impl9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09643 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09763 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CodeRef__Group__0__Impl9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__29885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeRef__Group__2__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__09950 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__09953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Link__Group__0__Impl9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210072 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Link__Group__2__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310134 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10165 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410196 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Link__Group__4__Impl10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510258 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Link__Group__6__Impl10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010391 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110451 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210511 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__2__Impl10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310573 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10604 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410635 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__4__Impl10666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510697 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610757 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__6__Impl10788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710819 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl10850 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__810881 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__810884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__8__Impl10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__910943 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__910946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011003 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__10__Impl11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11096 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211127 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__12__Impl11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__14__Impl11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011338 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ImageRef__Group_0_0__0__Impl11369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11431 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211462 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311522 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11553 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group_0_0__4__Impl11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011653 = new BitSet(new long[]{0x000000000E0181F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CodeBlock__Group__0__Impl11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111715 = new BitSet(new long[]{0x000000000E0181F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211776 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeBlock__Group__3__Impl11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__011903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__011906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl11934 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__111965 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__111968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl11995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212025 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12056 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312087 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeBlock__Group_1__3__Impl12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12180 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CodeBlock__Group_1__5__Impl12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012282 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12369 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012404 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012526 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_012653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_112684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_012777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_112808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_112870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_112901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_4_112932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_112963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_112994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_4_113056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_0_0_113087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_113118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_3_113149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_4_113180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_4_113304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__TextPart__TextAssignment13583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_113874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__UrlAssignment_113909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__TextAssignment_513940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_213971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14312 = new BitSet(new long[]{0x0000000000000002L});

}