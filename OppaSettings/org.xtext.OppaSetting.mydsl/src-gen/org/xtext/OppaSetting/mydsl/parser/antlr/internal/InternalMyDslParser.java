package org.xtext.OppaSetting.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.OppaSetting.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SettingsModel \\n\\t{\\n\\t\\t'", "'}\\n'", "'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= '", "'\\n\\t\\t\\t\\t '", "'} \\n'", "'Feature\\n\\t\\t\\t\\t\\t'", "'{\\n\\t\\t\\t\\t\\t\\t name= '", "'{'", "'id'", "'description'", "'type'", "'excludes'", "'('", "','", "')'", "'depends'", "'}'", "'Type'"
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
    public String getGrammarFileName() { return "../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SettingsModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSettingsModel"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleSettingsModel returns [EObject current=null] : iv_ruleSettingsModel= ruleSettingsModel EOF ;
    public final EObject entryRuleSettingsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingsModel = null;


        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleSettingsModel= ruleSettingsModel EOF )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleSettingsModel= ruleSettingsModel EOF
            {
             newCompositeNode(grammarAccess.getSettingsModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSettingsModel_in_entryRuleSettingsModel75);
            iv_ruleSettingsModel=ruleSettingsModel();

            state._fsp--;

             current =iv_ruleSettingsModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSettingsModel85); 

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
    // $ANTLR end "entryRuleSettingsModel"


    // $ANTLR start "ruleSettingsModel"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleSettingsModel returns [EObject current=null] : ( () otherlv_1= 'SettingsModel \\n\\t{\\n\\t\\t' ( (lv_sections_2_0= ruleSection ) )+ otherlv_3= '}\\n' ) ;
    public final EObject ruleSettingsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () otherlv_1= 'SettingsModel \\n\\t{\\n\\t\\t' ( (lv_sections_2_0= ruleSection ) )+ otherlv_3= '}\\n' ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'SettingsModel \\n\\t{\\n\\t\\t' ( (lv_sections_2_0= ruleSection ) )+ otherlv_3= '}\\n' )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'SettingsModel \\n\\t{\\n\\t\\t' ( (lv_sections_2_0= ruleSection ) )+ otherlv_3= '}\\n' )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () otherlv_1= 'SettingsModel \\n\\t{\\n\\t\\t' ( (lv_sections_2_0= ruleSection ) )+ otherlv_3= '}\\n'
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSettingsModelAccess().getSettingsModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSettingsModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getSettingsModelAccess().getSettingsModelKeyword_1());
                
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:90:1: ( (lv_sections_2_0= ruleSection ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:91:1: (lv_sections_2_0= ruleSection )
            	    {
            	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:91:1: (lv_sections_2_0= ruleSection )
            	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:92:3: lv_sections_2_0= ruleSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSettingsModelAccess().getSectionsSectionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSection_in_ruleSettingsModel152);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSettingsModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_2_0, 
            	            		"Section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSettingsModel165); 

                	newLeafNode(otherlv_3, grammarAccess.getSettingsModelAccess().getRightCurlyBracketLineFeedLfKeyword_3());
                

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
    // $ANTLR end "ruleSettingsModel"


    // $ANTLR start "entryRuleSection"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:121:2: (iv_ruleSection= ruleSection EOF )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:122:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSection_in_entryRuleSection201);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSection211); 

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
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:129:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )? otherlv_5= '} \\n' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:132:28: ( ( () otherlv_1= 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )? otherlv_5= '} \\n' ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: ( () otherlv_1= 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )? otherlv_5= '} \\n' )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: ( () otherlv_1= 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )? otherlv_5= '} \\n' )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:133:2: () otherlv_1= 'Section\\n\\t\\t\\t{\\n\\t\\t\\t\\t name= ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )? otherlv_5= '} \\n'
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:133:2: ()
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:134:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSectionAccess().getSectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSection257); 

                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionNameKeyword_1());
                
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:144:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:144:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:145:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection278);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:161:2: (otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:161:4: otherlv_3= '\\n\\t\\t\\t\\t ' ( (lv_features_4_0= ruleFeature ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSection291); 

                        	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:165:1: ( (lv_features_4_0= ruleFeature ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_features_4_0= ruleFeature )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_features_4_0= ruleFeature )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:167:3: lv_features_4_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getFeaturesFeatureParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleSection312);
                    lv_features_4_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_4_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSection326); 

                	newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getRightCurlyBracketSpaceLineFeedLfKeyword_4());
                

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:195:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:196:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:197:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString363);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString374); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:204:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:207:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:208:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString414); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:216:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString440); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:231:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:232:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:233:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature485);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature495); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: ruleFeature returns [EObject current=null] : ( () otherlv_1= 'Feature\\n\\t\\t\\t\\t\\t' otherlv_2= '{\\n\\t\\t\\t\\t\\t\\t name= ' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )? (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:243:28: ( ( () otherlv_1= 'Feature\\n\\t\\t\\t\\t\\t' otherlv_2= '{\\n\\t\\t\\t\\t\\t\\t name= ' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )? (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: ( () otherlv_1= 'Feature\\n\\t\\t\\t\\t\\t' otherlv_2= '{\\n\\t\\t\\t\\t\\t\\t name= ' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )? (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: ( () otherlv_1= 'Feature\\n\\t\\t\\t\\t\\t' otherlv_2= '{\\n\\t\\t\\t\\t\\t\\t name= ' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )? (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:244:2: () otherlv_1= 'Feature\\n\\t\\t\\t\\t\\t' otherlv_2= '{\\n\\t\\t\\t\\t\\t\\t name= ' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )? (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}'
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:244:2: ()
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureAccess().getFeatureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeature541); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeature553); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getNameKeyword_2());
                
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:259:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:259:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:260:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature574);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeature586); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:280:1: (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:280:3: otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeature599); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getIdKeyword_5_0());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: ( (lv_id_6_0= ruleEString ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_id_6_0= ruleEString )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_id_6_0= ruleEString )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:286:3: lv_id_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature620);
                    lv_id_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:302:4: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:302:6: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFeature635); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getDescriptionKeyword_6_0());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:306:1: ( (lv_description_8_0= ruleEString ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_description_8_0= ruleEString )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_description_8_0= ruleEString )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:308:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature656);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:324:4: (otherlv_9= 'type' ( (lv_type_10_0= ruleType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:324:6: otherlv_9= 'type' ( (lv_type_10_0= ruleType ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFeature671); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureAccess().getTypeKeyword_7_0());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:328:1: ( (lv_type_10_0= ruleType ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: (lv_type_10_0= ruleType )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: (lv_type_10_0= ruleType )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:330:3: lv_type_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFeature692);
                    lv_type_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:346:4: (otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:346:6: otherlv_11= 'excludes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFeature707); 

                        	newLeafNode(otherlv_11, grammarAccess.getFeatureAccess().getExcludesKeyword_8_0());
                        
                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFeature719); 

                        	newLeafNode(otherlv_12, grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: ( ( ruleEString ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ( ruleEString )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ( ruleEString )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:356:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature742);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:369:2: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:369:4: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFeature755); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getFeatureAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: ( ( ruleEString ) )
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: ( ruleEString )
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:375:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature778);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFeature792); 

                        	newLeafNode(otherlv_16, grammarAccess.getFeatureAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:392:3: (otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:392:5: otherlv_17= 'depends' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFeature807); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureAccess().getDependsKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFeature819); 

                        	newLeafNode(otherlv_18, grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:400:1: ( ( ruleEString ) )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:401:1: ( ruleEString )
                    {
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:401:1: ( ruleEString )
                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:402:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature842);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:415:2: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:415:4: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFeature855); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getFeatureAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:419:1: ( ( ruleEString ) )
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ( ruleEString )
                    	    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:421:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature878);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFeature892); 

                        	newLeafNode(otherlv_22, grammarAccess.getFeatureAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFeature906); 

                	newLeafNode(otherlv_23, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:450:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:451:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:452:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType943);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType954); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Type' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:462:28: (kw= 'Type' )
            // ../org.xtext.OppaSetting.mydsl/src-gen/org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.g:464:2: kw= 'Type'
            {
            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleType991); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeAccess().getTypeKeyword()); 
                

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSettingsModel_in_entryRuleSettingsModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSettingsModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSettingsModel131 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSection_in_ruleSettingsModel152 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleSettingsModel165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSection_in_entryRuleSection201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSection211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleSection257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection278 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSection291 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleSection312 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSection326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleFeature541 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeature553 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature574 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFeature586 = new BitSet(new long[]{0x000000000C780000L});
        public static final BitSet FOLLOW_19_in_ruleFeature599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature620 = new BitSet(new long[]{0x000000000C700000L});
        public static final BitSet FOLLOW_20_in_ruleFeature635 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature656 = new BitSet(new long[]{0x000000000C600000L});
        public static final BitSet FOLLOW_21_in_ruleFeature671 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleFeature692 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_22_in_ruleFeature707 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFeature719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature742 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleFeature755 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature778 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_25_in_ruleFeature792 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleFeature807 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFeature819 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature842 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleFeature855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature878 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_25_in_ruleFeature892 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleFeature906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleType991 = new BitSet(new long[]{0x0000000000000002L});
    }


}