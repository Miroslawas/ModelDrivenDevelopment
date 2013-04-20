package org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.OppaSetting.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Type'", "'SettingsModel \\n\\t{\\n\\t\\t'", "'}\\n'", "'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= '", "'} \\n'", "'\\n\\t\\t\\t\\t '", "'Feature\\n\\t\\t\\t\\t\\t'", "'{\\n\\t\\t\\t\\t\\t\\t name= '", "'{'", "'}'", "'id'", "'description'", "'type'", "'excludes'", "'('", "')'", "','", "'depends'"
    };
    public static final int RULE_ID=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSettingsModel"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleSettingsModel : ruleSettingsModel EOF ;
    public final void entryRuleSettingsModel() throws RecognitionException {
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleSettingsModel EOF )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleSettingsModel EOF
            {
             before(grammarAccess.getSettingsModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSettingsModel_in_entryRuleSettingsModel61);
            ruleSettingsModel();

            state._fsp--;

             after(grammarAccess.getSettingsModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSettingsModel68); 

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
    // $ANTLR end "entryRuleSettingsModel"


    // $ANTLR start "ruleSettingsModel"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleSettingsModel : ( ( rule__SettingsModel__Group__0 ) ) ;
    public final void ruleSettingsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__SettingsModel__Group__0 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__SettingsModel__Group__0 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__SettingsModel__Group__0 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__SettingsModel__Group__0 )
            {
             before(grammarAccess.getSettingsModelAccess().getGroup()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__SettingsModel__Group__0 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__SettingsModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__0_in_ruleSettingsModel94);
            rule__SettingsModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingsModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSettingsModel"


    // $ANTLR start "entryRuleSection"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleSection EOF )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSection_in_entryRuleSection121);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSection128); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Section__Group__0 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Section__Group__0 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Section__Group__0 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Section__Group__0 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Section__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__0_in_ruleSection154);
            rule__Section__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleEString EOF )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__EString__Alternatives )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleFeature EOF )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature248); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Feature__Group__0 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Feature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0_in_ruleFeature274);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleType EOF )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType301);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType308); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleType : ( 'Type' ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( 'Type' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( 'Type' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( 'Type' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleType335); 
             after(grammarAccess.getTypeAccess().getTypeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: ( RULE_STRING )
                    {
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: ( RULE_STRING )
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives372); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:6: ( RULE_ID )
                    {
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:6: ( RULE_ID )
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives389); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SettingsModel__Group__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:226:1: rule__SettingsModel__Group__0 : rule__SettingsModel__Group__0__Impl rule__SettingsModel__Group__1 ;
    public final void rule__SettingsModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ( rule__SettingsModel__Group__0__Impl rule__SettingsModel__Group__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:2: rule__SettingsModel__Group__0__Impl rule__SettingsModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__0__Impl_in_rule__SettingsModel__Group__0419);
            rule__SettingsModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__1_in_rule__SettingsModel__Group__0422);
            rule__SettingsModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__0"


    // $ANTLR start "rule__SettingsModel__Group__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:238:1: rule__SettingsModel__Group__0__Impl : ( () ) ;
    public final void rule__SettingsModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( () ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( () )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( () )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ()
            {
             before(grammarAccess.getSettingsModelAccess().getSettingsModelAction_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ()
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: 
            {
            }

             after(grammarAccess.getSettingsModelAccess().getSettingsModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__0__Impl"


    // $ANTLR start "rule__SettingsModel__Group__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: rule__SettingsModel__Group__1 : rule__SettingsModel__Group__1__Impl rule__SettingsModel__Group__2 ;
    public final void rule__SettingsModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( rule__SettingsModel__Group__1__Impl rule__SettingsModel__Group__2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:2: rule__SettingsModel__Group__1__Impl rule__SettingsModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__1__Impl_in_rule__SettingsModel__Group__1480);
            rule__SettingsModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__2_in_rule__SettingsModel__Group__1483);
            rule__SettingsModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__1"


    // $ANTLR start "rule__SettingsModel__Group__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: rule__SettingsModel__Group__1__Impl : ( 'SettingsModel \\n\\t{\\n\\t\\t' ) ;
    public final void rule__SettingsModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( 'SettingsModel \\n\\t{\\n\\t\\t' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( 'SettingsModel \\n\\t{\\n\\t\\t' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( 'SettingsModel \\n\\t{\\n\\t\\t' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: 'SettingsModel \\n\\t{\\n\\t\\t'
            {
             before(grammarAccess.getSettingsModelAccess().getSettingsModelKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__SettingsModel__Group__1__Impl511); 
             after(grammarAccess.getSettingsModelAccess().getSettingsModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__1__Impl"


    // $ANTLR start "rule__SettingsModel__Group__2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: rule__SettingsModel__Group__2 : rule__SettingsModel__Group__2__Impl rule__SettingsModel__Group__3 ;
    public final void rule__SettingsModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__SettingsModel__Group__2__Impl rule__SettingsModel__Group__3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:2: rule__SettingsModel__Group__2__Impl rule__SettingsModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__2__Impl_in_rule__SettingsModel__Group__2542);
            rule__SettingsModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__3_in_rule__SettingsModel__Group__2545);
            rule__SettingsModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__2"


    // $ANTLR start "rule__SettingsModel__Group__2__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: rule__SettingsModel__Group__2__Impl : ( ( ( rule__SettingsModel__SectionsAssignment_2 ) ) ( ( rule__SettingsModel__SectionsAssignment_2 )* ) ) ;
    public final void rule__SettingsModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( ( ( rule__SettingsModel__SectionsAssignment_2 ) ) ( ( rule__SettingsModel__SectionsAssignment_2 )* ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( ( rule__SettingsModel__SectionsAssignment_2 ) ) ( ( rule__SettingsModel__SectionsAssignment_2 )* ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( ( rule__SettingsModel__SectionsAssignment_2 ) ) ( ( rule__SettingsModel__SectionsAssignment_2 )* ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( ( rule__SettingsModel__SectionsAssignment_2 ) ) ( ( rule__SettingsModel__SectionsAssignment_2 )* )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( ( rule__SettingsModel__SectionsAssignment_2 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( rule__SettingsModel__SectionsAssignment_2 )
            {
             before(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ( rule__SettingsModel__SectionsAssignment_2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:308:2: rule__SettingsModel__SectionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__SectionsAssignment_2_in_rule__SettingsModel__Group__2__Impl574);
            rule__SettingsModel__SectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); 

            }

            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( ( rule__SettingsModel__SectionsAssignment_2 )* )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( rule__SettingsModel__SectionsAssignment_2 )*
            {
             before(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( rule__SettingsModel__SectionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:2: rule__SettingsModel__SectionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__SectionsAssignment_2_in_rule__SettingsModel__Group__2__Impl586);
            	    rule__SettingsModel__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); 

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
    // $ANTLR end "rule__SettingsModel__Group__2__Impl"


    // $ANTLR start "rule__SettingsModel__Group__3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: rule__SettingsModel__Group__3 : rule__SettingsModel__Group__3__Impl ;
    public final void rule__SettingsModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__SettingsModel__Group__3__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:2: rule__SettingsModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingsModel__Group__3__Impl_in_rule__SettingsModel__Group__3619);
            rule__SettingsModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__3"


    // $ANTLR start "rule__SettingsModel__Group__3__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: rule__SettingsModel__Group__3__Impl : ( '}\\n' ) ;
    public final void rule__SettingsModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: ( ( '}\\n' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( '}\\n' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( '}\\n' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: '}\\n'
            {
             before(grammarAccess.getSettingsModelAccess().getRightCurlyBracketLineFeedLfKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__SettingsModel__Group__3__Impl647); 
             after(grammarAccess.getSettingsModelAccess().getRightCurlyBracketLineFeedLfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:367:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__0686);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__1_in_rule__Section__Group__0689);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ( ( () ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( () )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( () )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:1: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:1: ()
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__1747);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__2_in_rule__Section__Group__1750);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: rule__Section__Group__1__Impl : ( 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( ( 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= '
            {
             before(grammarAccess.getSectionAccess().getSectionNameKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Section__Group__1__Impl778); 
             after(grammarAccess.getSectionAccess().getSectionNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__2809);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__3_in_rule__Section__Group__2812);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Section__NameAssignment_2 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( rule__Section__NameAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rule__Section__NameAssignment_2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:2: rule__Section__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl839);
            rule__Section__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__3869);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__4_in_rule__Section__Group__3872);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )? ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( ( rule__Section__Group_3__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( ( rule__Section__Group_3__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( ( rule__Section__Group_3__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( rule__Section__Group_3__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: ( rule__Section__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:472:2: rule__Section__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl899);
                    rule__Section__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:1: ( rule__Section__Group__4__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:487:2: rule__Section__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__4930);
            rule__Section__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: rule__Section__Group__4__Impl : ( '} \\n' ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( '} \\n' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( '} \\n' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( '} \\n' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: '} \\n'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketSpaceLineFeedLfKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Section__Group__4__Impl958); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketSpaceLineFeedLfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group_3__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__0999);
            rule__Section__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__01002);
            rule__Section__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__0"


    // $ANTLR start "rule__Section__Group_3__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rule__Section__Group_3__0__Impl : ( '\\n\\t\\t\\t\\t ' ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ( '\\n\\t\\t\\t\\t ' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( '\\n\\t\\t\\t\\t ' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( '\\n\\t\\t\\t\\t ' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: '\\n\\t\\t\\t\\t '
            {
             before(grammarAccess.getSectionAccess().getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Section__Group_3__0__Impl1030); 
             after(grammarAccess.getSectionAccess().getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__0__Impl"


    // $ANTLR start "rule__Section__Group_3__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( rule__Section__Group_3__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:2: rule__Section__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__11061);
            rule__Section__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__1"


    // $ANTLR start "rule__Section__Group_3__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: rule__Section__Group_3__1__Impl : ( ( rule__Section__FeaturesAssignment_3_1 ) ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( ( rule__Section__FeaturesAssignment_3_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__Section__FeaturesAssignment_3_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__Section__FeaturesAssignment_3_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__Section__FeaturesAssignment_3_1 )
            {
             before(grammarAccess.getSectionAccess().getFeaturesAssignment_3_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( rule__Section__FeaturesAssignment_3_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__Section__FeaturesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Section__FeaturesAssignment_3_1_in_rule__Section__Group_3__1__Impl1088);
            rule__Section__FeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getFeaturesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01122);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01125);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( ( () ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ( () )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ( () )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ()
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: 
            {
            }

             after(grammarAccess.getFeatureAccess().getFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11183);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11186);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: rule__Feature__Group__1__Impl : ( 'Feature\\n\\t\\t\\t\\t\\t' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( 'Feature\\n\\t\\t\\t\\t\\t' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( 'Feature\\n\\t\\t\\t\\t\\t' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( 'Feature\\n\\t\\t\\t\\t\\t' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: 'Feature\\n\\t\\t\\t\\t\\t'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Feature__Group__1__Impl1214); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21245);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21248);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: rule__Feature__Group__2__Impl : ( '{\\n\\t\\t\\t\\t\\t\\t name= ' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( '{\\n\\t\\t\\t\\t\\t\\t name= ' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( '{\\n\\t\\t\\t\\t\\t\\t name= ' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( '{\\n\\t\\t\\t\\t\\t\\t name= ' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: '{\\n\\t\\t\\t\\t\\t\\t name= '
            {
             before(grammarAccess.getFeatureAccess().getNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Feature__Group__2__Impl1276); 
             after(grammarAccess.getFeatureAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:683:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31307);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31310);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( ( rule__Feature__NameAssignment_3 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( rule__Feature__NameAssignment_3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:2: rule__Feature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl1337);
            rule__Feature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41367);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41370);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Feature__Group__4__Impl : ( '{' ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( ( '{' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( '{' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( '{' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: '{'
            {
             before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Feature__Group__4__Impl1398); 
             after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51429);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51432);
            rule__Feature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( ( rule__Feature__Group_5__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( rule__Feature__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1459);
                    rule__Feature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl rule__Feature__Group__7 ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( rule__Feature__Group__6__Impl rule__Feature__Group__7 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:2: rule__Feature__Group__6__Impl rule__Feature__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61490);
            rule__Feature__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__61493);
            rule__Feature__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__Group_6__0 )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( ( ( rule__Feature__Group_6__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( ( rule__Feature__Group_6__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( ( rule__Feature__Group_6__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( rule__Feature__Group_6__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_6()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( rule__Feature__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:2: rule__Feature__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl1520);
                    rule__Feature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Feature__Group__7"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: rule__Feature__Group__7 : rule__Feature__Group__7__Impl rule__Feature__Group__8 ;
    public final void rule__Feature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( rule__Feature__Group__7__Impl rule__Feature__Group__8 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:2: rule__Feature__Group__7__Impl rule__Feature__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__71551);
            rule__Feature__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__8_in_rule__Feature__Group__71554);
            rule__Feature__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__7"


    // $ANTLR start "rule__Feature__Group__7__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: rule__Feature__Group__7__Impl : ( ( rule__Feature__Group_7__0 )? ) ;
    public final void rule__Feature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( ( ( rule__Feature__Group_7__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( ( rule__Feature__Group_7__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( ( rule__Feature__Group_7__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__Feature__Group_7__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_7()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( rule__Feature__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:2: rule__Feature__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_7__0_in_rule__Feature__Group__7__Impl1581);
                    rule__Feature__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__7__Impl"


    // $ANTLR start "rule__Feature__Group__8"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: rule__Feature__Group__8 : rule__Feature__Group__8__Impl rule__Feature__Group__9 ;
    public final void rule__Feature__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__Feature__Group__8__Impl rule__Feature__Group__9 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: rule__Feature__Group__8__Impl rule__Feature__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__8__Impl_in_rule__Feature__Group__81612);
            rule__Feature__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__9_in_rule__Feature__Group__81615);
            rule__Feature__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__8"


    // $ANTLR start "rule__Feature__Group__8__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: rule__Feature__Group__8__Impl : ( ( rule__Feature__Group_8__0 )? ) ;
    public final void rule__Feature__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( ( ( rule__Feature__Group_8__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( rule__Feature__Group_8__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( rule__Feature__Group_8__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Feature__Group_8__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_8()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( rule__Feature__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__Feature__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__0_in_rule__Feature__Group__8__Impl1642);
                    rule__Feature__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__8__Impl"


    // $ANTLR start "rule__Feature__Group__9"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__Feature__Group__9 : rule__Feature__Group__9__Impl rule__Feature__Group__10 ;
    public final void rule__Feature__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__Feature__Group__9__Impl rule__Feature__Group__10 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:2: rule__Feature__Group__9__Impl rule__Feature__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__9__Impl_in_rule__Feature__Group__91673);
            rule__Feature__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__10_in_rule__Feature__Group__91676);
            rule__Feature__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__9"


    // $ANTLR start "rule__Feature__Group__9__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: rule__Feature__Group__9__Impl : ( ( rule__Feature__Group_9__0 )? ) ;
    public final void rule__Feature__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( ( ( rule__Feature__Group_9__0 )? ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( ( rule__Feature__Group_9__0 )? )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( ( rule__Feature__Group_9__0 )? )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( rule__Feature__Group_9__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_9()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( rule__Feature__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:2: rule__Feature__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__0_in_rule__Feature__Group__9__Impl1703);
                    rule__Feature__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__9__Impl"


    // $ANTLR start "rule__Feature__Group__10"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__Feature__Group__10 : rule__Feature__Group__10__Impl ;
    public final void rule__Feature__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Feature__Group__10__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__Feature__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__10__Impl_in_rule__Feature__Group__101734);
            rule__Feature__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__10"


    // $ANTLR start "rule__Feature__Group__10__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: rule__Feature__Group__10__Impl : ( '}' ) ;
    public final void rule__Feature__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( ( '}' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( '}' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( '}' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: '}'
            {
             before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Feature__Group__10__Impl1762); 
             after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__10__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__01815);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__01818);
            rule__Feature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0"


    // $ANTLR start "rule__Feature__Group_5__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: rule__Feature__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( 'id' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( 'id' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( 'id' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: 'id'
            {
             before(grammarAccess.getFeatureAccess().getIdKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Feature__Group_5__0__Impl1846); 
             after(grammarAccess.getFeatureAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0__Impl"


    // $ANTLR start "rule__Feature__Group_5__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( rule__Feature__Group_5__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__11877);
            rule__Feature__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1"


    // $ANTLR start "rule__Feature__Group_5__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__IdAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ( ( rule__Feature__IdAssignment_5_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( ( rule__Feature__IdAssignment_5_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( ( rule__Feature__IdAssignment_5_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ( rule__Feature__IdAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getIdAssignment_5_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ( rule__Feature__IdAssignment_5_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:2: rule__Feature__IdAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__IdAssignment_5_1_in_rule__Feature__Group_5__1__Impl1904);
            rule__Feature__IdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1__Impl"


    // $ANTLR start "rule__Feature__Group_6__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: rule__Feature__Group_6__0 : rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 ;
    public final void rule__Feature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:2: rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__01938);
            rule__Feature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__01941);
            rule__Feature__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__0"


    // $ANTLR start "rule__Feature__Group_6__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: rule__Feature__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Feature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( ( 'description' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( 'description' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( 'description' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: 'description'
            {
             before(grammarAccess.getFeatureAccess().getDescriptionKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Feature__Group_6__0__Impl1969); 
             after(grammarAccess.getFeatureAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__0__Impl"


    // $ANTLR start "rule__Feature__Group_6__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: rule__Feature__Group_6__1 : rule__Feature__Group_6__1__Impl ;
    public final void rule__Feature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( rule__Feature__Group_6__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:2: rule__Feature__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__12000);
            rule__Feature__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__1"


    // $ANTLR start "rule__Feature__Group_6__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: rule__Feature__Group_6__1__Impl : ( ( rule__Feature__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Feature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( ( ( rule__Feature__DescriptionAssignment_6_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ( rule__Feature__DescriptionAssignment_6_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ( rule__Feature__DescriptionAssignment_6_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( rule__Feature__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_6_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( rule__Feature__DescriptionAssignment_6_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:2: rule__Feature__DescriptionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__DescriptionAssignment_6_1_in_rule__Feature__Group_6__1__Impl2027);
            rule__Feature__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__1__Impl"


    // $ANTLR start "rule__Feature__Group_7__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: rule__Feature__Group_7__0 : rule__Feature__Group_7__0__Impl rule__Feature__Group_7__1 ;
    public final void rule__Feature__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: ( rule__Feature__Group_7__0__Impl rule__Feature__Group_7__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:2: rule__Feature__Group_7__0__Impl rule__Feature__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_7__0__Impl_in_rule__Feature__Group_7__02061);
            rule__Feature__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_7__1_in_rule__Feature__Group_7__02064);
            rule__Feature__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_7__0"


    // $ANTLR start "rule__Feature__Group_7__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: rule__Feature__Group_7__0__Impl : ( 'type' ) ;
    public final void rule__Feature__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( ( 'type' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( 'type' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( 'type' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: 'type'
            {
             before(grammarAccess.getFeatureAccess().getTypeKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Feature__Group_7__0__Impl2092); 
             after(grammarAccess.getFeatureAccess().getTypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_7__0__Impl"


    // $ANTLR start "rule__Feature__Group_7__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: rule__Feature__Group_7__1 : rule__Feature__Group_7__1__Impl ;
    public final void rule__Feature__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( rule__Feature__Group_7__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:2: rule__Feature__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_7__1__Impl_in_rule__Feature__Group_7__12123);
            rule__Feature__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_7__1"


    // $ANTLR start "rule__Feature__Group_7__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: rule__Feature__Group_7__1__Impl : ( ( rule__Feature__TypeAssignment_7_1 ) ) ;
    public final void rule__Feature__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( ( ( rule__Feature__TypeAssignment_7_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( ( rule__Feature__TypeAssignment_7_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( ( rule__Feature__TypeAssignment_7_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( rule__Feature__TypeAssignment_7_1 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_7_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( rule__Feature__TypeAssignment_7_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:2: rule__Feature__TypeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__TypeAssignment_7_1_in_rule__Feature__Group_7__1__Impl2150);
            rule__Feature__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_7__1__Impl"


    // $ANTLR start "rule__Feature__Group_8__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Feature__Group_8__0 : rule__Feature__Group_8__0__Impl rule__Feature__Group_8__1 ;
    public final void rule__Feature__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__Feature__Group_8__0__Impl rule__Feature__Group_8__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:2: rule__Feature__Group_8__0__Impl rule__Feature__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__0__Impl_in_rule__Feature__Group_8__02184);
            rule__Feature__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__1_in_rule__Feature__Group_8__02187);
            rule__Feature__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__0"


    // $ANTLR start "rule__Feature__Group_8__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: rule__Feature__Group_8__0__Impl : ( 'excludes' ) ;
    public final void rule__Feature__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( 'excludes' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( 'excludes' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( 'excludes' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: 'excludes'
            {
             before(grammarAccess.getFeatureAccess().getExcludesKeyword_8_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Feature__Group_8__0__Impl2215); 
             after(grammarAccess.getFeatureAccess().getExcludesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__0__Impl"


    // $ANTLR start "rule__Feature__Group_8__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__Feature__Group_8__1 : rule__Feature__Group_8__1__Impl rule__Feature__Group_8__2 ;
    public final void rule__Feature__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( rule__Feature__Group_8__1__Impl rule__Feature__Group_8__2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:2: rule__Feature__Group_8__1__Impl rule__Feature__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__1__Impl_in_rule__Feature__Group_8__12246);
            rule__Feature__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__2_in_rule__Feature__Group_8__12249);
            rule__Feature__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__1"


    // $ANTLR start "rule__Feature__Group_8__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: rule__Feature__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Feature__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ( '(' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( '(' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( '(' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: '('
            {
             before(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Feature__Group_8__1__Impl2277); 
             after(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__1__Impl"


    // $ANTLR start "rule__Feature__Group_8__2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: rule__Feature__Group_8__2 : rule__Feature__Group_8__2__Impl rule__Feature__Group_8__3 ;
    public final void rule__Feature__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( rule__Feature__Group_8__2__Impl rule__Feature__Group_8__3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:2: rule__Feature__Group_8__2__Impl rule__Feature__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__2__Impl_in_rule__Feature__Group_8__22308);
            rule__Feature__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__3_in_rule__Feature__Group_8__22311);
            rule__Feature__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__2"


    // $ANTLR start "rule__Feature__Group_8__2__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__Feature__Group_8__2__Impl : ( ( rule__Feature__ExcludesAssignment_8_2 ) ) ;
    public final void rule__Feature__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( ( ( rule__Feature__ExcludesAssignment_8_2 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__Feature__ExcludesAssignment_8_2 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__Feature__ExcludesAssignment_8_2 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( rule__Feature__ExcludesAssignment_8_2 )
            {
             before(grammarAccess.getFeatureAccess().getExcludesAssignment_8_2()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__Feature__ExcludesAssignment_8_2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:2: rule__Feature__ExcludesAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__ExcludesAssignment_8_2_in_rule__Feature__Group_8__2__Impl2338);
            rule__Feature__ExcludesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getExcludesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__2__Impl"


    // $ANTLR start "rule__Feature__Group_8__3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: rule__Feature__Group_8__3 : rule__Feature__Group_8__3__Impl rule__Feature__Group_8__4 ;
    public final void rule__Feature__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( rule__Feature__Group_8__3__Impl rule__Feature__Group_8__4 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:2: rule__Feature__Group_8__3__Impl rule__Feature__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__3__Impl_in_rule__Feature__Group_8__32368);
            rule__Feature__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__4_in_rule__Feature__Group_8__32371);
            rule__Feature__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__3"


    // $ANTLR start "rule__Feature__Group_8__3__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: rule__Feature__Group_8__3__Impl : ( ( rule__Feature__Group_8_3__0 )* ) ;
    public final void rule__Feature__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ( ( rule__Feature__Group_8_3__0 )* ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Feature__Group_8_3__0 )* )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Feature__Group_8_3__0 )* )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Feature__Group_8_3__0 )*
            {
             before(grammarAccess.getFeatureAccess().getGroup_8_3()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( rule__Feature__Group_8_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Feature__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8_3__0_in_rule__Feature__Group_8__3__Impl2398);
            	    rule__Feature__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__3__Impl"


    // $ANTLR start "rule__Feature__Group_8__4"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: rule__Feature__Group_8__4 : rule__Feature__Group_8__4__Impl ;
    public final void rule__Feature__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( rule__Feature__Group_8__4__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:2: rule__Feature__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8__4__Impl_in_rule__Feature__Group_8__42429);
            rule__Feature__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__4"


    // $ANTLR start "rule__Feature__Group_8__4__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__Feature__Group_8__4__Impl : ( ')' ) ;
    public final void rule__Feature__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( ')' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ')' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ')' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ')'
            {
             before(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_8_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Feature__Group_8__4__Impl2457); 
             after(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8__4__Impl"


    // $ANTLR start "rule__Feature__Group_8_3__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: rule__Feature__Group_8_3__0 : rule__Feature__Group_8_3__0__Impl rule__Feature__Group_8_3__1 ;
    public final void rule__Feature__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__Feature__Group_8_3__0__Impl rule__Feature__Group_8_3__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:2: rule__Feature__Group_8_3__0__Impl rule__Feature__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8_3__0__Impl_in_rule__Feature__Group_8_3__02498);
            rule__Feature__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8_3__1_in_rule__Feature__Group_8_3__02501);
            rule__Feature__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8_3__0"


    // $ANTLR start "rule__Feature__Group_8_3__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: rule__Feature__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( ( ',' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ',' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ',' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_8_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Feature__Group_8_3__0__Impl2529); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_8_3__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: rule__Feature__Group_8_3__1 : rule__Feature__Group_8_3__1__Impl ;
    public final void rule__Feature__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( rule__Feature__Group_8_3__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:2: rule__Feature__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_8_3__1__Impl_in_rule__Feature__Group_8_3__12560);
            rule__Feature__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8_3__1"


    // $ANTLR start "rule__Feature__Group_8_3__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: rule__Feature__Group_8_3__1__Impl : ( ( rule__Feature__ExcludesAssignment_8_3_1 ) ) ;
    public final void rule__Feature__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( ( rule__Feature__ExcludesAssignment_8_3_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( ( rule__Feature__ExcludesAssignment_8_3_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( ( rule__Feature__ExcludesAssignment_8_3_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( rule__Feature__ExcludesAssignment_8_3_1 )
            {
             before(grammarAccess.getFeatureAccess().getExcludesAssignment_8_3_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( rule__Feature__ExcludesAssignment_8_3_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:2: rule__Feature__ExcludesAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__ExcludesAssignment_8_3_1_in_rule__Feature__Group_8_3__1__Impl2587);
            rule__Feature__ExcludesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getExcludesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_8_3__1__Impl"


    // $ANTLR start "rule__Feature__Group_9__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: rule__Feature__Group_9__0 : rule__Feature__Group_9__0__Impl rule__Feature__Group_9__1 ;
    public final void rule__Feature__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( rule__Feature__Group_9__0__Impl rule__Feature__Group_9__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:2: rule__Feature__Group_9__0__Impl rule__Feature__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__0__Impl_in_rule__Feature__Group_9__02621);
            rule__Feature__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__1_in_rule__Feature__Group_9__02624);
            rule__Feature__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__0"


    // $ANTLR start "rule__Feature__Group_9__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Feature__Group_9__0__Impl : ( 'depends' ) ;
    public final void rule__Feature__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( 'depends' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( 'depends' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( 'depends' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: 'depends'
            {
             before(grammarAccess.getFeatureAccess().getDependsKeyword_9_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Feature__Group_9__0__Impl2652); 
             after(grammarAccess.getFeatureAccess().getDependsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__0__Impl"


    // $ANTLR start "rule__Feature__Group_9__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: rule__Feature__Group_9__1 : rule__Feature__Group_9__1__Impl rule__Feature__Group_9__2 ;
    public final void rule__Feature__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rule__Feature__Group_9__1__Impl rule__Feature__Group_9__2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:2: rule__Feature__Group_9__1__Impl rule__Feature__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__1__Impl_in_rule__Feature__Group_9__12683);
            rule__Feature__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__2_in_rule__Feature__Group_9__12686);
            rule__Feature__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__1"


    // $ANTLR start "rule__Feature__Group_9__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: rule__Feature__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Feature__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( ( '(' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( '(' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( '(' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: '('
            {
             before(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Feature__Group_9__1__Impl2714); 
             after(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__1__Impl"


    // $ANTLR start "rule__Feature__Group_9__2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: rule__Feature__Group_9__2 : rule__Feature__Group_9__2__Impl rule__Feature__Group_9__3 ;
    public final void rule__Feature__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: ( rule__Feature__Group_9__2__Impl rule__Feature__Group_9__3 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:2: rule__Feature__Group_9__2__Impl rule__Feature__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__2__Impl_in_rule__Feature__Group_9__22745);
            rule__Feature__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__3_in_rule__Feature__Group_9__22748);
            rule__Feature__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__2"


    // $ANTLR start "rule__Feature__Group_9__2__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: rule__Feature__Group_9__2__Impl : ( ( rule__Feature__DependsAssignment_9_2 ) ) ;
    public final void rule__Feature__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( ( ( rule__Feature__DependsAssignment_9_2 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ( rule__Feature__DependsAssignment_9_2 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ( rule__Feature__DependsAssignment_9_2 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( rule__Feature__DependsAssignment_9_2 )
            {
             before(grammarAccess.getFeatureAccess().getDependsAssignment_9_2()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( rule__Feature__DependsAssignment_9_2 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:2: rule__Feature__DependsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__DependsAssignment_9_2_in_rule__Feature__Group_9__2__Impl2775);
            rule__Feature__DependsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDependsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__2__Impl"


    // $ANTLR start "rule__Feature__Group_9__3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__Feature__Group_9__3 : rule__Feature__Group_9__3__Impl rule__Feature__Group_9__4 ;
    public final void rule__Feature__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__Feature__Group_9__3__Impl rule__Feature__Group_9__4 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:2: rule__Feature__Group_9__3__Impl rule__Feature__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__3__Impl_in_rule__Feature__Group_9__32805);
            rule__Feature__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__4_in_rule__Feature__Group_9__32808);
            rule__Feature__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__3"


    // $ANTLR start "rule__Feature__Group_9__3__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__Feature__Group_9__3__Impl : ( ( rule__Feature__Group_9_3__0 )* ) ;
    public final void rule__Feature__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( ( rule__Feature__Group_9_3__0 )* ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__Feature__Group_9_3__0 )* )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__Feature__Group_9_3__0 )* )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( rule__Feature__Group_9_3__0 )*
            {
             before(grammarAccess.getFeatureAccess().getGroup_9_3()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( rule__Feature__Group_9_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:2: rule__Feature__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9_3__0_in_rule__Feature__Group_9__3__Impl2835);
            	    rule__Feature__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__3__Impl"


    // $ANTLR start "rule__Feature__Group_9__4"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__Feature__Group_9__4 : rule__Feature__Group_9__4__Impl ;
    public final void rule__Feature__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( rule__Feature__Group_9__4__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:2: rule__Feature__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9__4__Impl_in_rule__Feature__Group_9__42866);
            rule__Feature__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__4"


    // $ANTLR start "rule__Feature__Group_9__4__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: rule__Feature__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Feature__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( ( ')' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ')' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ')' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ')'
            {
             before(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_9_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Feature__Group_9__4__Impl2894); 
             after(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9__4__Impl"


    // $ANTLR start "rule__Feature__Group_9_3__0"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: rule__Feature__Group_9_3__0 : rule__Feature__Group_9_3__0__Impl rule__Feature__Group_9_3__1 ;
    public final void rule__Feature__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ( rule__Feature__Group_9_3__0__Impl rule__Feature__Group_9_3__1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:2: rule__Feature__Group_9_3__0__Impl rule__Feature__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9_3__0__Impl_in_rule__Feature__Group_9_3__02935);
            rule__Feature__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9_3__1_in_rule__Feature__Group_9_3__02938);
            rule__Feature__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9_3__0"


    // $ANTLR start "rule__Feature__Group_9_3__0__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: rule__Feature__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ( ',' ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( ',' )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( ',' )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_9_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Feature__Group_9_3__0__Impl2966); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_9_3__1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: rule__Feature__Group_9_3__1 : rule__Feature__Group_9_3__1__Impl ;
    public final void rule__Feature__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( rule__Feature__Group_9_3__1__Impl )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:2: rule__Feature__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_9_3__1__Impl_in_rule__Feature__Group_9_3__12997);
            rule__Feature__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9_3__1"


    // $ANTLR start "rule__Feature__Group_9_3__1__Impl"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: rule__Feature__Group_9_3__1__Impl : ( ( rule__Feature__DependsAssignment_9_3_1 ) ) ;
    public final void rule__Feature__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( ( ( rule__Feature__DependsAssignment_9_3_1 ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( ( rule__Feature__DependsAssignment_9_3_1 ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( ( rule__Feature__DependsAssignment_9_3_1 ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( rule__Feature__DependsAssignment_9_3_1 )
            {
             before(grammarAccess.getFeatureAccess().getDependsAssignment_9_3_1()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( rule__Feature__DependsAssignment_9_3_1 )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:2: rule__Feature__DependsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__DependsAssignment_9_3_1_in_rule__Feature__Group_9_3__1__Impl3024);
            rule__Feature__DependsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDependsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_9_3__1__Impl"


    // $ANTLR start "rule__SettingsModel__SectionsAssignment_2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__SettingsModel__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__SettingsModel__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( ruleSection ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ruleSection )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ruleSection )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ruleSection
            {
             before(grammarAccess.getSettingsModelAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSection_in_rule__SettingsModel__SectionsAssignment_23063);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSettingsModelAccess().getSectionsSectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsModel__SectionsAssignment_2"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: rule__Section__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Section__NameAssignment_23094);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_2"


    // $ANTLR start "rule__Section__FeaturesAssignment_3_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:1: rule__Section__FeaturesAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Section__FeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ( ruleFeature ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( ruleFeature )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( ruleFeature )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ruleFeature
            {
             before(grammarAccess.getSectionAccess().getFeaturesFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Section__FeaturesAssignment_3_13125);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getFeaturesFeatureParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__FeaturesAssignment_3_1"


    // $ANTLR start "rule__Feature__NameAssignment_3"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Feature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__NameAssignment_33156);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_3"


    // $ANTLR start "rule__Feature__IdAssignment_5_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: rule__Feature__IdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Feature__IdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__IdAssignment_5_13187);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IdAssignment_5_1"


    // $ANTLR start "rule__Feature__DescriptionAssignment_6_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: rule__Feature__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Feature__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__DescriptionAssignment_6_13218);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Feature__TypeAssignment_7_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: rule__Feature__TypeAssignment_7_1 : ( ruleType ) ;
    public final void rule__Feature__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( ( ruleType ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: ( ruleType )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: ( ruleType )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ruleType
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Feature__TypeAssignment_7_13249);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_7_1"


    // $ANTLR start "rule__Feature__ExcludesAssignment_8_2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: rule__Feature__ExcludesAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__Feature__ExcludesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( ( ruleEString ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( ruleEString )
            {
             before(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_2_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__ExcludesAssignment_8_23284);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ExcludesAssignment_8_2"


    // $ANTLR start "rule__Feature__ExcludesAssignment_8_3_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: rule__Feature__ExcludesAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Feature__ExcludesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( ruleEString ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ruleEString )
            {
             before(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_3_1_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__ExcludesAssignment_8_3_13323);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ExcludesAssignment_8_3_1"


    // $ANTLR start "rule__Feature__DependsAssignment_9_2"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: rule__Feature__DependsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__Feature__DependsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ( ( ruleEString ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( ruleEString )
            {
             before(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_2_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__DependsAssignment_9_23362);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DependsAssignment_9_2"


    // $ANTLR start "rule__Feature__DependsAssignment_9_3_1"
    // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: rule__Feature__DependsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Feature__DependsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ( ruleEString ) )
            {
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ( ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ruleEString )
            {
             before(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_3_1_0()); 
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ruleEString )
            // ../org.xtext.OppaSetting.mydsl.ui/src-gen/org/xtext/OppaSetting/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__DependsAssignment_9_3_13401);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DependsAssignment_9_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSettingsModel_in_entryRuleSettingsModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSettingsModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__0_in_ruleSettingsModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSection_in_entryRuleSection121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSection128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__0_in_ruleSection154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__0__Impl_in_rule__SettingsModel__Group__0419 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__1_in_rule__SettingsModel__Group__0422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__1__Impl_in_rule__SettingsModel__Group__1480 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__2_in_rule__SettingsModel__Group__1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SettingsModel__Group__1__Impl511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__2__Impl_in_rule__SettingsModel__Group__2542 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__3_in_rule__SettingsModel__Group__2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingsModel__SectionsAssignment_2_in_rule__SettingsModel__Group__2__Impl574 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__SettingsModel__SectionsAssignment_2_in_rule__SettingsModel__Group__2__Impl586 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__SettingsModel__Group__3__Impl_in_rule__SettingsModel__Group__3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SettingsModel__Group__3__Impl647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__0686 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__0689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__1747 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Section__Group__1__Impl778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__2809 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__3869 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__3872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__4930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Section__Group__4__Impl958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__0999 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__01002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Section__Group_3__0__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__11061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Section__FeaturesAssignment_3_1_in_rule__Section__Group_3__1__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01122 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11183 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Feature__Group__1__Impl1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Feature__Group__2__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31307 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41367 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Feature__Group__4__Impl1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51429 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61490 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__61493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__71551 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__8_in_rule__Feature__Group__71554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_7__0_in_rule__Feature__Group__7__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__8__Impl_in_rule__Feature__Group__81612 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__9_in_rule__Feature__Group__81615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__0_in_rule__Feature__Group__8__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__9__Impl_in_rule__Feature__Group__91673 = new BitSet(new long[]{0x0000000011F00000L});
        public static final BitSet FOLLOW_rule__Feature__Group__10_in_rule__Feature__Group__91676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__0_in_rule__Feature__Group__9__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__10__Impl_in_rule__Feature__Group__101734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Feature__Group__10__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__01815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__01818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Feature__Group_5__0__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__11877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__IdAssignment_5_1_in_rule__Feature__Group_5__1__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__01938 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__01941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Feature__Group_6__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__12000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_6_1_in_rule__Feature__Group_6__1__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_7__0__Impl_in_rule__Feature__Group_7__02061 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Feature__Group_7__1_in_rule__Feature__Group_7__02064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Feature__Group_7__0__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_7__1__Impl_in_rule__Feature__Group_7__12123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__TypeAssignment_7_1_in_rule__Feature__Group_7__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__0__Impl_in_rule__Feature__Group_8__02184 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__1_in_rule__Feature__Group_8__02187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Feature__Group_8__0__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__1__Impl_in_rule__Feature__Group_8__12246 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__2_in_rule__Feature__Group_8__12249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Feature__Group_8__1__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__2__Impl_in_rule__Feature__Group_8__22308 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__3_in_rule__Feature__Group_8__22311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__ExcludesAssignment_8_2_in_rule__Feature__Group_8__2__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__3__Impl_in_rule__Feature__Group_8__32368 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__4_in_rule__Feature__Group_8__32371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8_3__0_in_rule__Feature__Group_8__3__Impl2398 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8__4__Impl_in_rule__Feature__Group_8__42429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Feature__Group_8__4__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8_3__0__Impl_in_rule__Feature__Group_8_3__02498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_8_3__1_in_rule__Feature__Group_8_3__02501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Feature__Group_8_3__0__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_8_3__1__Impl_in_rule__Feature__Group_8_3__12560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__ExcludesAssignment_8_3_1_in_rule__Feature__Group_8_3__1__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__0__Impl_in_rule__Feature__Group_9__02621 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__1_in_rule__Feature__Group_9__02624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Feature__Group_9__0__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__1__Impl_in_rule__Feature__Group_9__12683 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__2_in_rule__Feature__Group_9__12686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Feature__Group_9__1__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__2__Impl_in_rule__Feature__Group_9__22745 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__3_in_rule__Feature__Group_9__22748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__DependsAssignment_9_2_in_rule__Feature__Group_9__2__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__3__Impl_in_rule__Feature__Group_9__32805 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__4_in_rule__Feature__Group_9__32808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9_3__0_in_rule__Feature__Group_9__3__Impl2835 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9__4__Impl_in_rule__Feature__Group_9__42866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Feature__Group_9__4__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9_3__0__Impl_in_rule__Feature__Group_9_3__02935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Feature__Group_9_3__1_in_rule__Feature__Group_9_3__02938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Feature__Group_9_3__0__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_9_3__1__Impl_in_rule__Feature__Group_9_3__12997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__DependsAssignment_9_3_1_in_rule__Feature__Group_9_3__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSection_in_rule__SettingsModel__SectionsAssignment_23063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Section__NameAssignment_23094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Section__FeaturesAssignment_3_13125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__NameAssignment_33156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__IdAssignment_5_13187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__DescriptionAssignment_6_13218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Feature__TypeAssignment_7_13249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__ExcludesAssignment_8_23284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__ExcludesAssignment_8_3_13323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__DependsAssignment_9_23362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__DependsAssignment_9_3_13401 = new BitSet(new long[]{0x0000000000000002L});
    }


}