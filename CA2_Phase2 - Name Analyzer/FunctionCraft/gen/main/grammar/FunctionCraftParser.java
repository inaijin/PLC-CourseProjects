// Generated from /Users/kourosh/Uni/PLC/CA/Phase2/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.value.primitive.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, END=2, MAIN=3, PUTS=4, PUSH=5, LEN=6, RETURN=7, IF=8, ELSE=9, ELSEIF=10, 
		METHOD=11, PATTERN=12, MATCH=13, LOOP=14, FOR=15, IN=16, DO=17, CHOP=18, 
		CHOMP=19, PLUS=20, MINUS=21, MULT=22, DIVIDE=23, EQUAL=24, NOT_EQUAL=25, 
		LESS_EQUAL_THAN=26, GREATER_EQUAL_THAN=27, GREATER_THAN=28, LESS_THAN=29, 
		AND=30, OR=31, NOT=32, INCREMENT=33, DECREMENT=34, PATTERN_MATCHING_SEPARATOR=35, 
		SEPARATOR=36, APPEND=37, TRUE=38, FALSE=39, BREAK=40, NEXT=41, ARROW=42, 
		PLUS_ASSIGN=43, MINUS_ASSIGN=44, MULT_ASSIGN=45, DIVIDE_ASSIGN=46, MOD_ASSIGN=47, 
		ASSIGN=48, LPAR=49, RPAR=50, LBRACK=51, RBRACK=52, LBRACE=53, RBRACE=54, 
		COMMA=55, DOT=56, DOUBLEDOT=57, COLON=58, SEMICOLLON=59, INT_VALUE=60, 
		FLOAT_VALUE=61, IDENTIFIER=62, STRING_VALUE=63, COMMENT=64, WS=65;
	public static final int
		RULE_program = 0, RULE_functionDeclaration = 1, RULE_functionArgumentsDeclaration = 2, 
		RULE_patternMatching = 3, RULE_main = 4, RULE_functionArguments = 5, RULE_returnStatement = 6, 
		RULE_ifStatement = 7, RULE_condition = 8, RULE_putsStatement = 9, RULE_lenStatement = 10, 
		RULE_pushStatement = 11, RULE_loopDoStatement = 12, RULE_loopBody = 13, 
		RULE_forStatement = 14, RULE_range = 15, RULE_matchPatternStatement = 16, 
		RULE_chopStatement = 17, RULE_chompStatement = 18, RULE_assignment = 19, 
		RULE_accessList = 20, RULE_statement = 21, RULE_body = 22, RULE_expression = 23, 
		RULE_eqaulityExpression = 24, RULE_relationalExpression = 25, RULE_additiveExpression = 26, 
		RULE_multiplicativeExpression = 27, RULE_preUnaryExpression = 28, RULE_accessExpression = 29, 
		RULE_otherExpression = 30, RULE_lambdaFunction = 31, RULE_values = 32, 
		RULE_listValue = 33, RULE_boolValue = 34, RULE_functionPointer = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDeclaration", "functionArgumentsDeclaration", "patternMatching", 
			"main", "functionArguments", "returnStatement", "ifStatement", "condition", 
			"putsStatement", "lenStatement", "pushStatement", "loopDoStatement", 
			"loopBody", "forStatement", "range", "matchPatternStatement", "chopStatement", 
			"chompStatement", "assignment", "accessList", "statement", "body", "expression", 
			"eqaulityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "accessExpression", "otherExpression", "lambdaFunction", 
			"values", "listValue", "boolValue", "functionPointer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'end'", "'main'", "'puts'", "'push'", "'len'", "'return'", 
			"'if'", "'else'", "'elseif'", "'method'", "'pattern'", "'match'", "'loop'", 
			"'for'", "'in'", "'do'", "'chop'", "'chomp'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'&&'", "'||'", "'!'", 
			"'++'", "'--'", "'    |'", "'|'", "'<<'", "'true'", "'false'", "'break'", 
			"'next'", "'->'", "'+='", "'-='", "'*='", "'/='", "'%='", "'='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "'..'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "END", "MAIN", "PUTS", "PUSH", "LEN", "RETURN", "IF", "ELSE", 
			"ELSEIF", "METHOD", "PATTERN", "MATCH", "LOOP", "FOR", "IN", "DO", "CHOP", 
			"CHOMP", "PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "NOT_EQUAL", "LESS_EQUAL_THAN", 
			"GREATER_EQUAL_THAN", "GREATER_THAN", "LESS_THAN", "AND", "OR", "NOT", 
			"INCREMENT", "DECREMENT", "PATTERN_MATCHING_SEPARATOR", "SEPARATOR", 
			"APPEND", "TRUE", "FALSE", "BREAK", "NEXT", "ARROW", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIVIDE_ASSIGN", "MOD_ASSIGN", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "DOUBLEDOT", 
			"COLON", "SEMICOLLON", "INT_VALUE", "FLOAT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program flProgram;
		public FunctionDeclarationContext f;
		public PatternMatchingContext p;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<PatternMatchingContext> patternMatching() {
			return getRuleContexts(PatternMatchingContext.class);
		}
		public PatternMatchingContext patternMatching(int i) {
			return getRuleContext(PatternMatchingContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((ProgramContext)_localctx).flProgram =  new Program();
			        _localctx.flProgram.setLine(1);
			    
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(73);
						((ProgramContext)_localctx).f = functionDeclaration();
						_localctx.flProgram.addFunctionDeclaration(((ProgramContext)_localctx).f.functionDeclarationRet);
						}
						break;
					case PATTERN:
						{
						setState(76);
						((ProgramContext)_localctx).p = patternMatching();
						_localctx.flProgram.addPatternDeclaration(((ProgramContext)_localctx).p.patternRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(84);
			((ProgramContext)_localctx).m = main();
			_localctx.flProgram.setMain(((ProgramContext)_localctx).m.mainRet);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public Token def;
		public Token id;
		public FunctionArgumentsDeclarationContext f;
		public BodyContext b;
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public FunctionArgumentsDeclarationContext functionArgumentsDeclaration() {
			return getRuleContext(FunctionArgumentsDeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((FunctionDeclarationContext)_localctx).def = match(DEF);
			setState(88);
			((FunctionDeclarationContext)_localctx).id = match(IDENTIFIER);
			setState(89);
			((FunctionDeclarationContext)_localctx).f = functionArgumentsDeclaration();
			setState(90);
			((FunctionDeclarationContext)_localctx).b = body();
			setState(91);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsDeclarationContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> argRet;
		public Token id1;
		public Token id2;
		public Token id3;
		public ExpressionContext e1;
		public Token id4;
		public ExpressionContext e2;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionArgumentsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionArgumentsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionArgumentsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionArgumentsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsDeclarationContext functionArgumentsDeclaration() throws RecognitionException {
		FunctionArgumentsDeclarationContext _localctx = new FunctionArgumentsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionArgumentsDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((FunctionArgumentsDeclarationContext)_localctx).argRet =  new ArrayList<VarDeclaration>();
			    
			setState(94);
			match(LPAR);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(95);
				((FunctionArgumentsDeclarationContext)_localctx).id1 = match(IDENTIFIER);

				        Identifier id_ = new Identifier((((FunctionArgumentsDeclarationContext)_localctx).id1!=null?((FunctionArgumentsDeclarationContext)_localctx).id1.getText():null));
				        id_.setLine((((FunctionArgumentsDeclarationContext)_localctx).id1!=null?((FunctionArgumentsDeclarationContext)_localctx).id1.getLine():0));
				        VarDeclaration newVarDec = new VarDeclaration(id_);
				        newVarDec.setLine((((FunctionArgumentsDeclarationContext)_localctx).id1!=null?((FunctionArgumentsDeclarationContext)_localctx).id1.getLine():0));
				        _localctx.argRet.add(newVarDec);
				    
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(97);
						match(COMMA);
						setState(98);
						((FunctionArgumentsDeclarationContext)_localctx).id2 = match(IDENTIFIER);

						            Identifier id_2 = new Identifier((((FunctionArgumentsDeclarationContext)_localctx).id2!=null?((FunctionArgumentsDeclarationContext)_localctx).id2.getText():null));
						            id_2.setLine((((FunctionArgumentsDeclarationContext)_localctx).id2!=null?((FunctionArgumentsDeclarationContext)_localctx).id2.getLine():0));
						            VarDeclaration newVarDec2 = new VarDeclaration(id_2);
						            newVarDec2.setLine((((FunctionArgumentsDeclarationContext)_localctx).id2!=null?((FunctionArgumentsDeclarationContext)_localctx).id2.getLine():0));
						            _localctx.argRet.add(newVarDec2);
						        
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(105);
					match(COMMA);
					setState(106);
					match(LBRACK);
					setState(107);
					((FunctionArgumentsDeclarationContext)_localctx).id3 = match(IDENTIFIER);

					        Identifier id_3 = new Identifier((((FunctionArgumentsDeclarationContext)_localctx).id3!=null?((FunctionArgumentsDeclarationContext)_localctx).id3.getText():null));
					        id_.setLine((((FunctionArgumentsDeclarationContext)_localctx).id3!=null?((FunctionArgumentsDeclarationContext)_localctx).id3.getLine():0));
					        VarDeclaration newVarDec3 = new VarDeclaration(id_3);
					        newVarDec3.setLine((((FunctionArgumentsDeclarationContext)_localctx).id3!=null?((FunctionArgumentsDeclarationContext)_localctx).id3.getLine():0));
					     
					setState(109);
					match(ASSIGN);
					setState(110);
					((FunctionArgumentsDeclarationContext)_localctx).e1 = expression(0);

					        newVarDec3.setDefaultVal(((FunctionArgumentsDeclarationContext)_localctx).e1.expRet);
					        _localctx.argRet.add(newVarDec3);
					      
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(112);
						match(COMMA);
						setState(113);
						((FunctionArgumentsDeclarationContext)_localctx).id4 = match(IDENTIFIER);

						            Identifier id_4 = new Identifier((((FunctionArgumentsDeclarationContext)_localctx).id4!=null?((FunctionArgumentsDeclarationContext)_localctx).id4.getText():null));
						            id_4.setLine((((FunctionArgumentsDeclarationContext)_localctx).id4!=null?((FunctionArgumentsDeclarationContext)_localctx).id4.getLine():0));
						            VarDeclaration newVarDec4 = new VarDeclaration(id_);
						            newVarDec4.setLine((((FunctionArgumentsDeclarationContext)_localctx).id4!=null?((FunctionArgumentsDeclarationContext)_localctx).id4.getLine():0));
						       
						setState(115);
						match(ASSIGN);
						setState(116);
						((FunctionArgumentsDeclarationContext)_localctx).e2 = expression(0);

						            newVarDec4.setDefaultVal(((FunctionArgumentsDeclarationContext)_localctx).e2.expRet);
						            _localctx.argRet.add(newVarDec4);
						       
						}
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(124);
					match(RBRACK);
					}
				}

				}
			}

			setState(130);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternMatchingContext extends ParserRuleContext {
		public PatternDeclaration patternRet;
		public Token pat;
		public Token patternName;
		public Token targetVar;
		public ConditionContext c;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> PATTERN_MATCHING_SEPARATOR() { return getTokens(FunctionCraftParser.PATTERN_MATCHING_SEPARATOR); }
		public TerminalNode PATTERN_MATCHING_SEPARATOR(int i) {
			return getToken(FunctionCraftParser.PATTERN_MATCHING_SEPARATOR, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternMatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPatternMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPatternMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPatternMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternMatchingContext patternMatching() throws RecognitionException {
		PatternMatchingContext _localctx = new PatternMatchingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_patternMatching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((PatternMatchingContext)_localctx).pat = match(PATTERN);
			setState(133);
			((PatternMatchingContext)_localctx).patternName = match(IDENTIFIER);
			setState(134);
			match(LPAR);
			setState(135);
			((PatternMatchingContext)_localctx).targetVar = match(IDENTIFIER);
			setState(136);
			match(RPAR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATTERN_MATCHING_SEPARATOR) {
				{
				{
				setState(137);
				match(PATTERN_MATCHING_SEPARATOR);
				setState(138);
				((PatternMatchingContext)_localctx).c = condition();
				setState(139);
				match(ASSIGN);
				setState(140);
				((PatternMatchingContext)_localctx).e = expression(0);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token m;
		public BodyContext b;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((MainContext)_localctx).mainRet =  new MainDeclaration();
			    
			setState(150);
			match(DEF);
			setState(151);
			((MainContext)_localctx).m = match(MAIN);

			        _localctx.mainRet.setLine((((MainContext)_localctx).m!=null?((MainContext)_localctx).m.getLine():0));
			    
			setState(153);
			match(LPAR);
			setState(154);
			match(RPAR);
			setState(155);
			((MainContext)_localctx).b = body();
			_localctx.mainRet.setBody(((MainContext)_localctx).b.bodyRet);
			setState(157);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> funcArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((FunctionArgumentsContext)_localctx).funcArgsRet =  new ArrayList<Expression>();
			    
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1150101502091851712L) != 0)) {
				{
				setState(160);
				((FunctionArgumentsContext)_localctx).e1 = expression(0);

				       _localctx.funcArgsRet.add(((FunctionArgumentsContext)_localctx).e1.expRet);
				    
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					((FunctionArgumentsContext)_localctx).e2 = expression(0);

					       _localctx.funcArgsRet.add(((FunctionArgumentsContext)_localctx).e2.expRet);
					    
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatement returnStmtRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStatement();
			    
			setState(174);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1150101502091851712L) != 0)) {
				{
				setState(175);
				((ReturnStatementContext)_localctx).e = expression(0);

				        _localctx.returnStmtRet.setReturnExp(((ReturnStatementContext)_localctx).e.expRet);
				    
				}
			}

			_localctx.returnStmtRet.setLine((((ReturnStatementContext)_localctx).r!=null?((ReturnStatementContext)_localctx).r.getLine():0));
			setState(181);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatement ifRet;
		public Token i;
		public ConditionContext c1;
		public ConditionContext c2;
		public LoopBodyContext b;
		public LoopBodyContext b1;
		public LoopBodyContext b2;
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<LoopBodyContext> loopBody() {
			return getRuleContexts(LoopBodyContext.class);
		}
		public LoopBodyContext loopBody(int i) {
			return getRuleContext(LoopBodyContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((IfStatementContext)_localctx).ifRet =  new IfStatement();
			        ArrayList<Statement> tempThenStmts = new ArrayList<>();
			        ArrayList<Statement> tempElseStmts = new ArrayList<>();
			    
			setState(184);
			((IfStatementContext)_localctx).i = match(IF);

			        _localctx.ifRet.setLine((((IfStatementContext)_localctx).i!=null?((IfStatementContext)_localctx).i.getLine():0));
			    
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(186);
				((IfStatementContext)_localctx).c1 = condition();
				_localctx.ifRet.addCondition(((IfStatementContext)_localctx).c1.conditionRet);
				}
				break;
			case 2:
				{
				setState(189);
				match(LPAR);
				setState(190);
				((IfStatementContext)_localctx).c2 = condition();
				setState(191);
				match(RPAR);
				_localctx.ifRet.addCondition(((IfStatementContext)_localctx).c2.conditionRet);
				}
				break;
			}
			setState(196);
			((IfStatementContext)_localctx).b = loopBody();

			        tempThenStmts.addAll(((IfStatementContext)_localctx).b.loopStmts);
			        _localctx.ifRet.addCondition(((IfStatementContext)_localctx).b.loopExps);
			        if(((IfStatementContext)_localctx).b.loopRetStmt != null){
			            tempThenStmts.add(((IfStatementContext)_localctx).b.loopRetStmt);
			        }
			    
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(198);
				match(ELSEIF);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(199);
					match(LPAR);
					setState(200);
					((IfStatementContext)_localctx).c2 = condition();
					setState(201);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(203);
					((IfStatementContext)_localctx).c2 = condition();
					}
					break;
				}

				        _localctx.ifRet.addCondition(((IfStatementContext)_localctx).c2.conditionRet);
				     
				setState(207);
				((IfStatementContext)_localctx).b1 = loopBody();

				        tempElseStmts.addAll(((IfStatementContext)_localctx).b1.loopStmts);
				        _localctx.ifRet.addCondition(((IfStatementContext)_localctx).b1.loopExps);
				        if(((IfStatementContext)_localctx).b1.loopRetStmt != null){
				            tempThenStmts.add(((IfStatementContext)_localctx).b1.loopRetStmt);
				        }
				     
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(215);
				match(ELSE);
				setState(216);
				((IfStatementContext)_localctx).b2 = loopBody();

				        tempElseStmts.addAll(((IfStatementContext)_localctx).b2.loopStmts);
				        _localctx.ifRet.addCondition(((IfStatementContext)_localctx).b2.loopExps);
				        if(((IfStatementContext)_localctx).b2.loopRetStmt != null){
				            tempThenStmts.add(((IfStatementContext)_localctx).b2.loopRetStmt);
				        }
				     
				}
			}


			        _localctx.ifRet.setThenBody(tempThenStmts);
			        _localctx.ifRet.setElseBody(tempElseStmts);
			     
			setState(222);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ArrayList<Expression> conditionRet;
		public ExpressionContext e;
		public ConditionContext c;
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionCraftParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionCraftParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((ConditionContext)_localctx).conditionRet =  new ArrayList<Expression>();
			    
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(LPAR);
					setState(226);
					((ConditionContext)_localctx).e = expression(0);
					_localctx.conditionRet.add(((ConditionContext)_localctx).e.expRet);
					setState(228);
					match(RPAR);
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(229);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(231);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
							case 1:
								{
								setState(230);
								match(LPAR);
								}
								break;
							}
							setState(233);
							((ConditionContext)_localctx).c = condition();

							        _localctx.conditionRet.addAll(((ConditionContext)_localctx).c.conditionRet);
							     
							setState(236);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
							case 1:
								{
								setState(235);
								match(RPAR);
								}
								break;
							}
							}
							} 
						}
						setState(242);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutsStatementContext extends ParserRuleContext {
		public PutStatement putRet;
		public Token p;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PutsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPutsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPutsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPutsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsStatementContext putsStatement() throws RecognitionException {
		PutsStatementContext _localctx = new PutsStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_putsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((PutsStatementContext)_localctx).p = match(PUTS);
			setState(249);
			match(LPAR);
			setState(250);
			((PutsStatementContext)_localctx).e = expression(0);
			setState(251);
			match(RPAR);
			setState(252);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenStatementContext extends ParserRuleContext {
		public LenStatement lenRet;
		public Token l;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenStatementContext lenStatement() throws RecognitionException {
		LenStatementContext _localctx = new LenStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((LenStatementContext)_localctx).l = match(LEN);
			setState(255);
			match(LPAR);
			setState(256);
			((LenStatementContext)_localctx).e = expression(0);
			setState(257);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushStatementContext extends ParserRuleContext {
		public PushStatement pushRet;
		public Token p;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PushStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPushStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPushStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPushStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushStatementContext pushStatement() throws RecognitionException {
		PushStatementContext _localctx = new PushStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pushStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((PushStatementContext)_localctx).p = match(PUSH);
			setState(260);
			match(LPAR);
			setState(261);
			((PushStatementContext)_localctx).e1 = expression(0);
			setState(262);
			match(COMMA);
			setState(263);
			((PushStatementContext)_localctx).e2 = expression(0);
			setState(264);
			match(RPAR);
			setState(265);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopDoStatementContext extends ParserRuleContext {
		public LoopDoStatement loopDoRet;
		public Token l1;
		public LoopBodyContext l2;
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public LoopDoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDoStatementContext loopDoStatement() throws RecognitionException {
		LoopDoStatementContext _localctx = new LoopDoStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopDoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((LoopDoStatementContext)_localctx).l1 = match(LOOP);
			setState(268);
			match(DO);
			setState(269);
			((LoopDoStatementContext)_localctx).l2 = loopBody();

			        ((LoopDoStatementContext)_localctx).loopDoRet =  new LoopDoStatement(((LoopDoStatementContext)_localctx).l2.loopStmts, ((LoopDoStatementContext)_localctx).l2.loopExps, ((LoopDoStatementContext)_localctx).l2.loopRetStmt);
			        _localctx.loopDoRet.setLine((((LoopDoStatementContext)_localctx).l1!=null?((LoopDoStatementContext)_localctx).l1.getLine():0));
			    
			setState(271);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopBodyContext extends ParserRuleContext {
		public ArrayList<Statement> loopStmts;
		public ArrayList<Expression> loopExps;
		public ReturnStatement loopRetStmt;
		public StatementContext s;
		public ConditionContext c1;
		public ConditionContext c2;
		public ReturnStatementContext r;
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<TerminalNode> SEMICOLLON() { return getTokens(FunctionCraftParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLLON, i);
		}
		public List<TerminalNode> NEXT() { return getTokens(FunctionCraftParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(FunctionCraftParser.NEXT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(FunctionCraftParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(FunctionCraftParser.IF, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((LoopBodyContext)_localctx).loopStmts =  new ArrayList<Statement>();
			        ((LoopBodyContext)_localctx).loopExps =  new ArrayList<Expression>();
			        ((LoopBodyContext)_localctx).loopRetStmt =  null;
			    
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1150098203556918928L) != 0)) {
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUTS:
				case PUSH:
				case LEN:
				case IF:
				case METHOD:
				case LOOP:
				case FOR:
				case CHOP:
				case CHOMP:
				case MINUS:
				case NOT:
				case INCREMENT:
				case DECREMENT:
				case TRUE:
				case FALSE:
				case ARROW:
				case LPAR:
				case LBRACK:
				case INT_VALUE:
				case FLOAT_VALUE:
				case IDENTIFIER:
				case STRING_VALUE:
					{
					setState(274);
					((LoopBodyContext)_localctx).s = statement();
					_localctx.loopStmts.add(((LoopBodyContext)_localctx).s.stmtRet);
					}
					break;
				case BREAK:
					{
					setState(277);
					match(BREAK);
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(278);
						match(IF);
						setState(279);
						((LoopBodyContext)_localctx).c1 = condition();
						_localctx.loopExps.addAll(((LoopBodyContext)_localctx).c1.conditionRet);
						}
					}

					setState(284);
					match(SEMICOLLON);
					}
					break;
				case NEXT:
					{
					setState(285);
					match(NEXT);
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(286);
						match(IF);
						setState(287);
						((LoopBodyContext)_localctx).c2 = condition();
						_localctx.loopExps.addAll(((LoopBodyContext)_localctx).c2.conditionRet);
						}
					}

					setState(292);
					match(SEMICOLLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(298);
				((LoopBodyContext)_localctx).r = returnStatement();
				((LoopBodyContext)_localctx).loopRetStmt =  ((LoopBodyContext)_localctx).r.returnStmtRet;_localctx.loopRetStmt.setLine(((LoopBodyContext)_localctx).r.returnStmtRet.getLine());
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatement forStRet;
		public Token f;
		public Token id;
		public RangeContext r;
		public LoopBodyContext l;
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((ForStatementContext)_localctx).f = match(FOR);
			setState(304);
			((ForStatementContext)_localctx).id = match(IDENTIFIER);
			setState(305);
			match(IN);
			setState(306);
			((ForStatementContext)_localctx).r = range();
			setState(307);
			((ForStatementContext)_localctx).l = loopBody();
			setState(308);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public ArrayList<Expression> rangeRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public Token id;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(FunctionCraftParser.DOUBLEDOT, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_range);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(310);
				match(LPAR);
				setState(311);
				((RangeContext)_localctx).e1 = expression(0);
				setState(312);
				match(DOUBLEDOT);
				setState(313);
				((RangeContext)_localctx).e2 = expression(0);
				setState(314);
				match(RPAR);
				}
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(316);
				match(LBRACK);
				{
				setState(317);
				((RangeContext)_localctx).e3 = expression(0);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(318);
					match(COMMA);
					setState(319);
					((RangeContext)_localctx).e4 = expression(0);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(325);
				match(RBRACK);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				((RangeContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchPatternStatementContext extends ParserRuleContext {
		public MatchPatternStatement matchPatRet;
		public Token id;
		public Token m;
		public ExpressionContext e;
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchPatternStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchPatternStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatchPatternStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatchPatternStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatchPatternStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchPatternStatementContext matchPatternStatement() throws RecognitionException {
		MatchPatternStatementContext _localctx = new MatchPatternStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matchPatternStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((MatchPatternStatementContext)_localctx).id = match(IDENTIFIER);
			setState(331);
			match(DOT);
			setState(332);
			((MatchPatternStatementContext)_localctx).m = match(MATCH);
			setState(333);
			match(LPAR);
			setState(334);
			((MatchPatternStatementContext)_localctx).e = expression(0);
			setState(335);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChopStatementContext extends ParserRuleContext {
		public ChopStatement chopRet;
		public Token c;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopStatementContext chopStatement() throws RecognitionException {
		ChopStatementContext _localctx = new ChopStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((ChopStatementContext)_localctx).c = match(CHOP);
			setState(338);
			match(LPAR);
			setState(339);
			((ChopStatementContext)_localctx).e = expression(0);
			setState(340);
			match(RPAR);

			        ((ChopStatementContext)_localctx).chopRet =  new ChopStatement(((ChopStatementContext)_localctx).e.expRet);
			        _localctx.chopRet.setLine((((ChopStatementContext)_localctx).c!=null?((ChopStatementContext)_localctx).c.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChompStatementContext extends ParserRuleContext {
		public ChompStatement chompRet;
		public Token c;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChompStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chompStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChompStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChompStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChompStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompStatementContext chompStatement() throws RecognitionException {
		ChompStatementContext _localctx = new ChompStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chompStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((ChompStatementContext)_localctx).c = match(CHOMP);
			setState(344);
			match(LPAR);
			setState(345);
			((ChompStatementContext)_localctx).e = expression(0);
			setState(346);
			match(RPAR);

			        ((ChompStatementContext)_localctx).chompRet =  new ChompStatement(((ChompStatementContext)_localctx).e.expRet);
			        _localctx.chompRet.setLine((((ChompStatementContext)_localctx).c!=null?((ChompStatementContext)_localctx).c.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignStatement assignRet;
		public Token id;
		public AccessListContext a;
		public Token as;
		public Token pl;
		public Token mi;
		public Token di;
		public Token mu;
		public Token mo;
		public ExpressionContext e;
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode DIVIDE_ASSIGN() { return getToken(FunctionCraftParser.DIVIDE_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public AccessListContext accessList() {
			return getRuleContext(AccessListContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        boolean access = false;
			        int line;
			        AssignOperator op;
			    
			setState(350);
			((AssignmentContext)_localctx).id = match(IDENTIFIER);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(351);
				((AssignmentContext)_localctx).a = accessList();
				access = true;
				}
			}

			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(356);
				((AssignmentContext)_localctx).as = match(ASSIGN);
				op = AssignOperator.ASSIGN;line = (((AssignmentContext)_localctx).as!=null?((AssignmentContext)_localctx).as.getLine():0);
				}
				break;
			case PLUS_ASSIGN:
				{
				setState(358);
				((AssignmentContext)_localctx).pl = match(PLUS_ASSIGN);
				op = AssignOperator.PLUS_ASSIGN;line = (((AssignmentContext)_localctx).pl!=null?((AssignmentContext)_localctx).pl.getLine():0);
				}
				break;
			case MINUS_ASSIGN:
				{
				setState(360);
				((AssignmentContext)_localctx).mi = match(MINUS_ASSIGN);
				op = AssignOperator.MINUS_ASSIGN;line = (((AssignmentContext)_localctx).mi!=null?((AssignmentContext)_localctx).mi.getLine():0);
				}
				break;
			case DIVIDE_ASSIGN:
				{
				setState(362);
				((AssignmentContext)_localctx).di = match(DIVIDE_ASSIGN);
				op = AssignOperator.DIVIDE_ASSIGN;line = (((AssignmentContext)_localctx).di!=null?((AssignmentContext)_localctx).di.getLine():0);
				}
				break;
			case MULT_ASSIGN:
				{
				setState(364);
				((AssignmentContext)_localctx).mu = match(MULT_ASSIGN);
				op = AssignOperator.MULT_ASSIGN;line = (((AssignmentContext)_localctx).mu!=null?((AssignmentContext)_localctx).mu.getLine():0);
				}
				break;
			case MOD_ASSIGN:
				{
				setState(366);
				((AssignmentContext)_localctx).mo = match(MOD_ASSIGN);
				op = AssignOperator.MOD_ASSIGN;line = (((AssignmentContext)_localctx).mo!=null?((AssignmentContext)_localctx).mo.getLine():0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370);
			((AssignmentContext)_localctx).e = expression(0);
			setState(371);
			match(SEMICOLLON);

			          Identifier id_ = new Identifier((((AssignmentContext)_localctx).id!=null?((AssignmentContext)_localctx).id.getText():null));
			          id_.setLine((((AssignmentContext)_localctx).id!=null?((AssignmentContext)_localctx).id.getLine():0));
			          ((AssignmentContext)_localctx).assignRet =  new AssignStatement(access, id_, ((AssignmentContext)_localctx).e.expRet, op);
			          if(access){
			            _localctx.assignRet.setAccessListExpression(((AssignmentContext)_localctx).a.accessListExp);
			          }
			          _localctx.assignRet.setLine(line);
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessListContext extends ParserRuleContext {
		public Expression accessListExp;
		public ExpressionContext e;
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AccessListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAccessList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAccessList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAccessList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessListContext accessList() throws RecognitionException {
		AccessListContext _localctx = new AccessListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_accessList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LBRACK);
			setState(375);
			((AccessListContext)_localctx).e = expression(0);
			((AccessListContext)_localctx).accessListExp =  ((AccessListContext)_localctx).e.expRet;
			setState(377);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement stmtRet;
		public IfStatementContext i;
		public LoopDoStatementContext loop;
		public ForStatementContext f;
		public PutsStatementContext puts;
		public PushStatementContext push;
		public ExpressionContext e;
		public AssignmentContext as;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopDoStatementContext loopDoStatement() {
			return getRuleContext(LoopDoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public PutsStatementContext putsStatement() {
			return getRuleContext(PutsStatementContext.class,0);
		}
		public PushStatementContext pushStatement() {
			return getRuleContext(PushStatementContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(FunctionCraftParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				((StatementContext)_localctx).i = ifStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).i.ifRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				((StatementContext)_localctx).loop = loopDoStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).loop.loopDoRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((StatementContext)_localctx).f = forStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).f.forStRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				((StatementContext)_localctx).puts = putsStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).puts.putRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				((StatementContext)_localctx).push = pushStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).push.pushRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				((StatementContext)_localctx).e = expression(0);
				((StatementContext)_localctx).stmtRet =  new ExpressionStatement(((StatementContext)_localctx).e.expRet);

				        ExpressionStatement expStmt = new ExpressionStatement(((StatementContext)_localctx).e.expRet);
				        ((StatementContext)_localctx).stmtRet =  expStmt;
				        _localctx.stmtRet.setLine(((StatementContext)_localctx).e.expRet.getLine());
				     
				setState(397);
				match(SEMICOLLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				((StatementContext)_localctx).as = assignment();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).as.assignRet;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public ArrayList<Statement> bodyRet;
		public StatementContext s;
		public ReturnStatementContext r;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((BodyContext)_localctx).bodyRet =  new ArrayList<Statement>();
			    
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1150101502091802256L) != 0)) {
				{
				{
				setState(405);
				((BodyContext)_localctx).s = statement();
				_localctx.bodyRet.add(((BodyContext)_localctx).s.stmtRet);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(413);
				((BodyContext)_localctx).r = returnStatement();
				_localctx.bodyRet.add(((BodyContext)_localctx).r.returnStmtRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public ExpressionContext e1;
		public EqaulityExpressionContext e3;
		public Token a;
		public EqaulityExpressionContext e2;
		public EqaulityExpressionContext eqaulityExpression() {
			return getRuleContext(EqaulityExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(419);
			((ExpressionContext)_localctx).e3 = eqaulityExpression();
			((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).e3.expRet;
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(422);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(423);
					((ExpressionContext)_localctx).a = match(APPEND);
					setState(424);
					((ExpressionContext)_localctx).e2 = eqaulityExpression();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqaulityExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public RelationalExpressionContext e1;
		public Token op1;
		public Token op2;
		public RelationalExpressionContext r1;
		public RelationalExpressionContext r2;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(FunctionCraftParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(FunctionCraftParser.NOT_EQUAL, 0); }
		public EqaulityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqaulityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEqaulityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEqaulityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEqaulityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqaulityExpressionContext eqaulityExpression() throws RecognitionException {
		EqaulityExpressionContext _localctx = new EqaulityExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eqaulityExpression);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				((EqaulityExpressionContext)_localctx).e1 = relationalExpression(0);

				        BinaryOperator op;
				        int line;
				    
				setState(436);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(432);
					((EqaulityExpressionContext)_localctx).op1 = match(EQUAL);
					op = BinaryOperator.EQUAL;line = (((EqaulityExpressionContext)_localctx).op1!=null?((EqaulityExpressionContext)_localctx).op1.getLine():0);
					}
					break;
				case NOT_EQUAL:
					{
					setState(434);
					((EqaulityExpressionContext)_localctx).op2 = match(NOT_EQUAL);
					op = BinaryOperator.NOT_EQUAL;line = (((EqaulityExpressionContext)_localctx).op2!=null?((EqaulityExpressionContext)_localctx).op2.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(438);
				((EqaulityExpressionContext)_localctx).r1 = relationalExpression(0);
				((EqaulityExpressionContext)_localctx).expRet =  new BinaryExpression(((EqaulityExpressionContext)_localctx).e1.expRet, ((EqaulityExpressionContext)_localctx).r1.expRet, op);_localctx.expRet.setLine(line);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((EqaulityExpressionContext)_localctx).r2 = relationalExpression(0);
				((EqaulityExpressionContext)_localctx).expRet =  ((EqaulityExpressionContext)_localctx).r2.expRet;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public RelationalExpressionContext r1;
		public AdditiveExpressionContext a2;
		public Token gt;
		public Token lt;
		public Token let;
		public Token get;
		public AdditiveExpressionContext a1;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(FunctionCraftParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(FunctionCraftParser.LESS_THAN, 0); }
		public TerminalNode LESS_EQUAL_THAN() { return getToken(FunctionCraftParser.LESS_EQUAL_THAN, 0); }
		public TerminalNode GREATER_EQUAL_THAN() { return getToken(FunctionCraftParser.GREATER_EQUAL_THAN, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			((RelationalExpressionContext)_localctx).a2 = additiveExpression(0);
			((RelationalExpressionContext)_localctx).expRet =  ((RelationalExpressionContext)_localctx).a2.expRet;
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					_localctx.r1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(450);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");

					                  BinaryOperator op;
					                  int line;
					              
					setState(460);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GREATER_THAN:
						{
						setState(452);
						((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);
						op = BinaryOperator.GREATER_THAN;line = (((RelationalExpressionContext)_localctx).gt!=null?((RelationalExpressionContext)_localctx).gt.getLine():0);
						}
						break;
					case LESS_THAN:
						{
						setState(454);
						((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);
						op = BinaryOperator.LESS_THAN;line = (((RelationalExpressionContext)_localctx).lt!=null?((RelationalExpressionContext)_localctx).lt.getLine():0);
						}
						break;
					case LESS_EQUAL_THAN:
						{
						setState(456);
						((RelationalExpressionContext)_localctx).let = match(LESS_EQUAL_THAN);
						op = BinaryOperator.LESS_EQUAL_THAN;line = (((RelationalExpressionContext)_localctx).let!=null?((RelationalExpressionContext)_localctx).let.getLine():0);
						}
						break;
					case GREATER_EQUAL_THAN:
						{
						setState(458);
						((RelationalExpressionContext)_localctx).get = match(GREATER_EQUAL_THAN);
						op = BinaryOperator.GREATER_EQUAL_THAN;line = (((RelationalExpressionContext)_localctx).get!=null?((RelationalExpressionContext)_localctx).get.getLine():0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(462);
					((RelationalExpressionContext)_localctx).a1 = additiveExpression(0);
					((RelationalExpressionContext)_localctx).expRet =  new BinaryExpression(((RelationalExpressionContext)_localctx).r1.expRet, ((RelationalExpressionContext)_localctx).a1.expRet, op);_localctx.expRet.setLine(line);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public AdditiveExpressionContext a1;
		public MultiplicativeExpressionContext m2;
		public Token p;
		public Token m;
		public MultiplicativeExpressionContext m1;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471);
			((AdditiveExpressionContext)_localctx).m2 = multiplicativeExpression(0);

			        ((AdditiveExpressionContext)_localctx).expRet =  ((AdditiveExpressionContext)_localctx).m2.expRet;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					_localctx.a1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(474);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");

					                      BinaryOperator op;
					                      int line;
					              
					setState(480);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(476);
						((AdditiveExpressionContext)_localctx).p = match(PLUS);
						op = BinaryOperator.PLUS;line = (((AdditiveExpressionContext)_localctx).p!=null?((AdditiveExpressionContext)_localctx).p.getLine():0);
						}
						break;
					case MINUS:
						{
						setState(478);
						((AdditiveExpressionContext)_localctx).m = match(MINUS);
						op = BinaryOperator.MINUS;line = (((AdditiveExpressionContext)_localctx).m!=null?((AdditiveExpressionContext)_localctx).m.getLine():0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(482);
					((AdditiveExpressionContext)_localctx).m1 = multiplicativeExpression(0);
					((AdditiveExpressionContext)_localctx).expRet =  new BinaryExpression(((AdditiveExpressionContext)_localctx).a1.expRet, ((AdditiveExpressionContext)_localctx).m1.expRet, op);_localctx.expRet.setLine(line);
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public MultiplicativeExpressionContext m1;
		public PreUnaryExpressionContext p2;
		public Token m;
		public Token d;
		public PreUnaryExpressionContext p1;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(FunctionCraftParser.DIVIDE, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(491);
			((MultiplicativeExpressionContext)_localctx).p2 = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).expRet =  ((MultiplicativeExpressionContext)_localctx).p2.expRet;
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					_localctx.m1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(494);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");

					                      BinaryOperator op;
					                      int line;
					              
					setState(500);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(496);
						((MultiplicativeExpressionContext)_localctx).m = match(MULT);
						op = BinaryOperator.MULT;line = (((MultiplicativeExpressionContext)_localctx).m!=null?((MultiplicativeExpressionContext)_localctx).m.getLine():0);
						}
						break;
					case DIVIDE:
						{
						setState(498);
						((MultiplicativeExpressionContext)_localctx).d = match(DIVIDE);
						op = BinaryOperator.DIVIDE;line = (((MultiplicativeExpressionContext)_localctx).d!=null?((MultiplicativeExpressionContext)_localctx).d.getLine():0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(502);
					((MultiplicativeExpressionContext)_localctx).p1 = preUnaryExpression();
					((MultiplicativeExpressionContext)_localctx).expRet =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).m1.expRet, ((MultiplicativeExpressionContext)_localctx).p1.expRet, op);_localctx.expRet.setLine(line);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public Token n;
		public Token m;
		public Token i;
		public Token d;
		public AccessExpressionContext a1;
		public AccessExpressionContext a2;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(FunctionCraftParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FunctionCraftParser.DECREMENT, 0); }
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_preUnaryExpression);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{

				        UnaryOperator op;
				        int line;
				    
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(511);
					((PreUnaryExpressionContext)_localctx).n = match(NOT);
					op = UnaryOperator.NOT;line = (((PreUnaryExpressionContext)_localctx).n!=null?((PreUnaryExpressionContext)_localctx).n.getLine():0);
					}
					break;
				case MINUS:
					{
					setState(513);
					((PreUnaryExpressionContext)_localctx).m = match(MINUS);
					op = UnaryOperator.MINUS;line = (((PreUnaryExpressionContext)_localctx).m!=null?((PreUnaryExpressionContext)_localctx).m.getLine():0);
					}
					break;
				case INCREMENT:
					{
					setState(515);
					((PreUnaryExpressionContext)_localctx).i = match(INCREMENT);
					op = UnaryOperator.INC;line = (((PreUnaryExpressionContext)_localctx).i!=null?((PreUnaryExpressionContext)_localctx).i.getLine():0);
					}
					break;
				case DECREMENT:
					{
					setState(517);
					((PreUnaryExpressionContext)_localctx).d = match(DECREMENT);
					op = UnaryOperator.DEC;line = (((PreUnaryExpressionContext)_localctx).d!=null?((PreUnaryExpressionContext)_localctx).d.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(521);
				((PreUnaryExpressionContext)_localctx).a1 = accessExpression();
				((PreUnaryExpressionContext)_localctx).expRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).a1.expRet, op);_localctx.expRet.setLine(line);
				}
				break;
			case LEN:
			case METHOD:
			case CHOP:
			case CHOMP:
			case TRUE:
			case FALSE:
			case ARROW:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case FLOAT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				((PreUnaryExpressionContext)_localctx).a2 = accessExpression();
				((PreUnaryExpressionContext)_localctx).expRet =  ((PreUnaryExpressionContext)_localctx).a2.expRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public OtherExpressionContext o;
		public FunctionArgumentsContext f;
		public AccessListContext a;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<AccessListContext> accessList() {
			return getRuleContexts(AccessListContext.class);
		}
		public AccessListContext accessList(int i) {
			return getRuleContext(AccessListContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_accessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        boolean isAccessExpression = false;
			        boolean isMultiDimentional = false;
			        ArrayList<Expression> args = new ArrayList<Expression>();
			        ArrayList<Expression> dimentions = new ArrayList<Expression>();
			    
			setState(530);
			((AccessExpressionContext)_localctx).o = otherExpression();
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(531);
					match(LPAR);
					setState(532);
					((AccessExpressionContext)_localctx).f = functionArguments();

					        isAccessExpression = true;
					        args.addAll(((AccessExpressionContext)_localctx).f.funcArgsRet);
					    
					setState(534);
					match(RPAR);
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					((AccessExpressionContext)_localctx).a = accessList();

					        isMultiDimentional = true;
					        dimentions.add(((AccessExpressionContext)_localctx).a.accessListExp);
					    
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}

			        if(!isAccessExpression){
			            ((AccessExpressionContext)_localctx).expRet =  ((AccessExpressionContext)_localctx).o.expRet;
			        }
			        else{
			            AccessExpression accessExp = new AccessExpression(((AccessExpressionContext)_localctx).o.expRet, args);
			            accessExp.setIsFunctionCall(isAccessExpression);
			            if(isMultiDimentional){

			                accessExp.setDimentionalAccess(dimentions);
			            }
			            ((AccessExpressionContext)_localctx).expRet =  accessExp;
			            _localctx.expRet.setLine(((AccessExpressionContext)_localctx).o.expRet.getLine());

			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public ValuesContext v;
		public Token id;
		public LambdaFunctionContext lambda;
		public ChopStatementContext chop;
		public ChompStatementContext chomp;
		public MatchPatternStatementContext match;
		public LenStatementContext len_;
		public ExpressionContext e;
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public ChopStatementContext chopStatement() {
			return getRuleContext(ChopStatementContext.class,0);
		}
		public ChompStatementContext chompStatement() {
			return getRuleContext(ChompStatementContext.class,0);
		}
		public MatchPatternStatementContext matchPatternStatement() {
			return getRuleContext(MatchPatternStatementContext.class,0);
		}
		public LenStatementContext lenStatement() {
			return getRuleContext(LenStatementContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_otherExpression);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				((OtherExpressionContext)_localctx).v = values();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).v.valRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				((OtherExpressionContext)_localctx).id = match(IDENTIFIER);

				        ((OtherExpressionContext)_localctx).expRet =  new Identifier((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null));
				        _localctx.expRet.setLine((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getLine():0));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				((OtherExpressionContext)_localctx).lambda = lambdaFunction();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).lambda.lambdaRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				((OtherExpressionContext)_localctx).chop = chopStatement();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).chop.chopRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				((OtherExpressionContext)_localctx).chomp = chompStatement();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).chomp.chompRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(565);
				((OtherExpressionContext)_localctx).match = matchPatternStatement();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).match.matchPatRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(568);
				((OtherExpressionContext)_localctx).len_ = lenStatement();
				((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).len_.lenRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(571);
				match(LPAR);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1150101502091851712L) != 0)) {
					{
					setState(572);
					((OtherExpressionContext)_localctx).e = expression(0);
					((OtherExpressionContext)_localctx).expRet =  ((OtherExpressionContext)_localctx).e.expRet;
					}
				}

				setState(577);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionContext extends ParserRuleContext {
		public Expression lambdaRet;
		public Token a;
		public FunctionArgumentsDeclarationContext fd;
		public BodyContext b;
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public FunctionArgumentsDeclarationContext functionArgumentsDeclaration() {
			return getRuleContext(FunctionArgumentsDeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			((LambdaFunctionContext)_localctx).a = match(ARROW);
			setState(581);
			((LambdaFunctionContext)_localctx).fd = functionArgumentsDeclaration();
			setState(582);
			match(LBRACE);
			setState(583);
			((LambdaFunctionContext)_localctx).b = body();
			setState(584);
			match(RBRACE);

			        ((LambdaFunctionContext)_localctx).lambdaRet =  new LambdaExpression(((LambdaFunctionContext)_localctx).fd.argRet, ((LambdaFunctionContext)_localctx).b.bodyRet);
			        _localctx.lambdaRet.setLine((((LambdaFunctionContext)_localctx).a!=null?((LambdaFunctionContext)_localctx).a.getLine():0));
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public Value valRet;
		public BoolValueContext b;
		public Token s;
		public Token i;
		public Token float_;
		public ListValueContext l;
		public FunctionPointerContext f;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(FunctionCraftParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(FunctionCraftParser.INT_VALUE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(FunctionCraftParser.FLOAT_VALUE, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public FunctionPointerContext functionPointer() {
			return getRuleContext(FunctionPointerContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_values);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				((ValuesContext)_localctx).b = boolValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).b.boolValRet;
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				((ValuesContext)_localctx).s = match(STRING_VALUE);
				((ValuesContext)_localctx).valRet =  new StringValue((((ValuesContext)_localctx).s!=null?((ValuesContext)_localctx).s.getText():null)); _localctx.valRet.setLine((((ValuesContext)_localctx).s!=null?((ValuesContext)_localctx).s.getLine():0));
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				((ValuesContext)_localctx).i = match(INT_VALUE);
				((ValuesContext)_localctx).valRet =  new IntValue((((ValuesContext)_localctx).i!=null?Integer.valueOf(((ValuesContext)_localctx).i.getText()):0));_localctx.valRet.setLine((((ValuesContext)_localctx).i!=null?((ValuesContext)_localctx).i.getLine():0));
				}
				break;
			case FLOAT_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				((ValuesContext)_localctx).float_ = match(FLOAT_VALUE);
				((ValuesContext)_localctx).valRet =  new FloatValue(Float.parseFloat((((ValuesContext)_localctx).float_!=null?((ValuesContext)_localctx).float_.getText():null)));_localctx.valRet.setLine((((ValuesContext)_localctx).float_!=null?((ValuesContext)_localctx).float_.getLine():0));
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				((ValuesContext)_localctx).l = listValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).l.listValRet;
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				((ValuesContext)_localctx).f = functionPointer();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).f.fpRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListValueContext extends ParserRuleContext {
		public ListValue listValRet;
		public Token l;
		public FunctionArgumentsContext f;
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			((ListValueContext)_localctx).l = match(LBRACK);
			setState(605);
			((ListValueContext)_localctx).f = functionArguments();
			setState(606);
			match(RBRACK);

			        ((ListValueContext)_localctx).listValRet =  new ListValue(((ListValueContext)_localctx).f.funcArgsRet);
			        _localctx.listValRet.setLine((((ListValueContext)_localctx).l!=null?((ListValueContext)_localctx).l.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValRet;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolValue);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				((BoolValueContext)_localctx).t = match(TRUE);
				((BoolValueContext)_localctx).boolValRet =  new BoolValue(true); _localctx.boolValRet.setLine((((BoolValueContext)_localctx).t!=null?((BoolValueContext)_localctx).t.getLine():0));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				((BoolValueContext)_localctx).f = match(FALSE);
				((BoolValueContext)_localctx).boolValRet =  new BoolValue(false); _localctx.boolValRet.setLine((((BoolValueContext)_localctx).f!=null?((BoolValueContext)_localctx).f.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPointerContext extends ParserRuleContext {
		public FunctionPointer fpRet;
		public Token m;
		public Token id;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public FunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerContext functionPointer() throws RecognitionException {
		FunctionPointerContext _localctx = new FunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionPointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			((FunctionPointerContext)_localctx).m = match(METHOD);
			setState(616);
			match(LPAR);
			setState(617);
			match(COLON);
			setState(618);
			((FunctionPointerContext)_localctx).id = match(IDENTIFIER);
			setState(619);
			match(RPAR);

			        Identifier id_ = new Identifier((((FunctionPointerContext)_localctx).id!=null?((FunctionPointerContext)_localctx).id.getText():null));
			        id_.setLine((((FunctionPointerContext)_localctx).id!=null?((FunctionPointerContext)_localctx).id.getLine():0));
			        ((FunctionPointerContext)_localctx).fpRet =  new FunctionPointer(id_);
			        _localctx.fpRet.setLine((((FunctionPointerContext)_localctx).m!=null?((FunctionPointerContext)_localctx).m.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 26:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 27:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u026f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002\n\u0002"+
		"\f\u0002h\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002"+
		"\f\u0002{\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u007f\b\u0002\u0003"+
		"\u0002\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n\u0003\f\u0003\u0092\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa\t\u0005\u0003"+
		"\u0005\u00ac\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c3"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d3\b\u0007\n\u0007\f\u0007"+
		"\u00d6\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00dc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e8\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ed\b\b\u0005\b\u00ef\b\b\n\b\f\b\u00f2\t\b\u0005\b\u00f4"+
		"\b\b\n\b\f\b\u00f7\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u011b\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0123\b\r\u0001\r\u0005\r\u0126"+
		"\b\r\n\r\f\r\u0129\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u012e\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0141"+
		"\b\u000f\n\u000f\f\u000f\u0144\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0149\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0163\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0171\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0193\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0199\b\u0016\n\u0016\f\u0016\u019c"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a1\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01aa\b\u0017\n\u0017\f\u0017\u01ad\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01b5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01bd\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01cd\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01d2"+
		"\b\u0019\n\u0019\f\u0019\u01d5\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01e1\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01e6\b\u001a\n\u001a\f\u001a\u01e9\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01f5\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01fa\b\u001b\n\u001b\f\u001b\u01fd\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0208\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0210\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0219\b\u001d\n\u001d\f\u001d\u021c"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0221\b\u001d"+
		"\n\u001d\f\u001d\u0224\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0240"+
		"\b\u001e\u0001\u001e\u0003\u001e\u0243\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u025b\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0266\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0000\u0004.246$\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDF\u0000\u0001\u0001\u0000\u001e\u001f\u0292\u0000H\u0001"+
		"\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004]\u0001\u0000\u0000"+
		"\u0000\u0006\u0084\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000\u0000\u0000"+
		"\n\u009f\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e"+
		"\u00b7\u0001\u0000\u0000\u0000\u0010\u00e0\u0001\u0000\u0000\u0000\u0012"+
		"\u00f8\u0001\u0000\u0000\u0000\u0014\u00fe\u0001\u0000\u0000\u0000\u0016"+
		"\u0103\u0001\u0000\u0000\u0000\u0018\u010b\u0001\u0000\u0000\u0000\u001a"+
		"\u0111\u0001\u0000\u0000\u0000\u001c\u012f\u0001\u0000\u0000\u0000\u001e"+
		"\u0148\u0001\u0000\u0000\u0000 \u014a\u0001\u0000\u0000\u0000\"\u0151"+
		"\u0001\u0000\u0000\u0000$\u0157\u0001\u0000\u0000\u0000&\u015d\u0001\u0000"+
		"\u0000\u0000(\u0176\u0001\u0000\u0000\u0000*\u0192\u0001\u0000\u0000\u0000"+
		",\u0194\u0001\u0000\u0000\u0000.\u01a2\u0001\u0000\u0000\u00000\u01bc"+
		"\u0001\u0000\u0000\u00002\u01be\u0001\u0000\u0000\u00004\u01d6\u0001\u0000"+
		"\u0000\u00006\u01ea\u0001\u0000\u0000\u00008\u020f\u0001\u0000\u0000\u0000"+
		":\u0211\u0001\u0000\u0000\u0000<\u0242\u0001\u0000\u0000\u0000>\u0244"+
		"\u0001\u0000\u0000\u0000@\u025a\u0001\u0000\u0000\u0000B\u025c\u0001\u0000"+
		"\u0000\u0000D\u0265\u0001\u0000\u0000\u0000F\u0267\u0001\u0000\u0000\u0000"+
		"HQ\u0006\u0000\uffff\uffff\u0000IJ\u0003\u0002\u0001\u0000JK\u0006\u0000"+
		"\uffff\uffff\u0000KP\u0001\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000"+
		"MN\u0006\u0000\uffff\uffff\u0000NP\u0001\u0000\u0000\u0000OI\u0001\u0000"+
		"\u0000\u0000OL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000UV\u0006\u0000\uffff\uffff"+
		"\u0000V\u0001\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005"+
		">\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0003,\u0016\u0000[\\\u0005"+
		"\u0002\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000]^\u0006\u0002\uffff"+
		"\uffff\u0000^\u0080\u00051\u0000\u0000_`\u0005>\u0000\u0000`f\u0006\u0002"+
		"\uffff\uffff\u0000ab\u00057\u0000\u0000bc\u0005>\u0000\u0000ce\u0006\u0002"+
		"\uffff\uffff\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g~\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u00057\u0000\u0000jk\u00053\u0000\u0000"+
		"kl\u0005>\u0000\u0000lm\u0006\u0002\uffff\uffff\u0000mn\u00050\u0000\u0000"+
		"no\u0003.\u0017\u0000oy\u0006\u0002\uffff\uffff\u0000pq\u00057\u0000\u0000"+
		"qr\u0005>\u0000\u0000rs\u0006\u0002\uffff\uffff\u0000st\u00050\u0000\u0000"+
		"tu\u0003.\u0017\u0000uv\u0006\u0002\uffff\uffff\u0000vx\u0001\u0000\u0000"+
		"\u0000wp\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u00054\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~i\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080_\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"2\u0000\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0085\u0005\f"+
		"\u0000\u0000\u0085\u0086\u0005>\u0000\u0000\u0086\u0087\u00051\u0000\u0000"+
		"\u0087\u0088\u0005>\u0000\u0000\u0088\u0090\u00052\u0000\u0000\u0089\u008a"+
		"\u0005#\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c\u0005"+
		"0\u0000\u0000\u008c\u008d\u0003.\u0017\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005;\u0000\u0000\u0094\u0007\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0006\u0004\uffff\uffff\u0000\u0096\u0097\u0005\u0001\u0000"+
		"\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0006\u0004\uffff"+
		"\uffff\u0000\u0099\u009a\u00051\u0000\u0000\u009a\u009b\u00052\u0000\u0000"+
		"\u009b\u009c\u0003,\u0016\u0000\u009c\u009d\u0006\u0004\uffff\uffff\u0000"+
		"\u009d\u009e\u0005\u0002\u0000\u0000\u009e\t\u0001\u0000\u0000\u0000\u009f"+
		"\u00ab\u0006\u0005\uffff\uffff\u0000\u00a0\u00a1\u0003.\u0017\u0000\u00a1"+
		"\u00a8\u0006\u0005\uffff\uffff\u0000\u00a2\u00a3\u00057\u0000\u0000\u00a3"+
		"\u00a4\u0003.\u0017\u0000\u00a4\u00a5\u0006\u0005\uffff\uffff\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a0\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0006\u0006\uffff\uffff\u0000\u00ae\u00b2\u0005\u0007\u0000\u0000"+
		"\u00af\u00b0\u0003.\u0017\u0000\u00b0\u00b1\u0006\u0006\uffff\uffff\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0006\u0006\uffff\uffff\u0000\u00b5\u00b6\u0005;\u0000\u0000"+
		"\u00b6\r\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u0007\uffff\uffff\u0000"+
		"\u00b8\u00b9\u0005\b\u0000\u0000\u00b9\u00c2\u0006\u0007\uffff\uffff\u0000"+
		"\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00bc\u0006\u0007\uffff\uffff\u0000"+
		"\u00bc\u00c3\u0001\u0000\u0000\u0000\u00bd\u00be\u00051\u0000\u0000\u00be"+
		"\u00bf\u0003\u0010\b\u0000\u00bf\u00c0\u00052\u0000\u0000\u00c0\u00c1"+
		"\u0006\u0007\uffff\uffff\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u001a\r\u0000\u00c5\u00d4"+
		"\u0006\u0007\uffff\uffff\u0000\u00c6\u00cc\u0005\n\u0000\u0000\u00c7\u00c8"+
		"\u00051\u0000\u0000\u00c8\u00c9\u0003\u0010\b\u0000\u00c9\u00ca\u0005"+
		"2\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00cd\u0003\u0010"+
		"\b\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u0007\uffff"+
		"\uffff\u0000\u00cf\u00d0\u0003\u001a\r\u0000\u00d0\u00d1\u0006\u0007\uffff"+
		"\uffff\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00db\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\t\u0000"+
		"\u0000\u00d8\u00d9\u0003\u001a\r\u0000\u00d9\u00da\u0006\u0007\uffff\uffff"+
		"\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0006\u0007\uffff\uffff\u0000\u00de\u00df\u0005\u0002"+
		"\u0000\u0000\u00df\u000f\u0001\u0000\u0000\u0000\u00e0\u00f5\u0006\b\uffff"+
		"\uffff\u0000\u00e1\u00e2\u00051\u0000\u0000\u00e2\u00e3\u0003.\u0017\u0000"+
		"\u00e3\u00e4\u0006\b\uffff\uffff\u0000\u00e4\u00f0\u00052\u0000\u0000"+
		"\u00e5\u00e7\u0007\u0000\u0000\u0000\u00e6\u00e8\u00051\u0000\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\u0010\b\u0000\u00ea\u00ec"+
		"\u0006\b\uffff\uffff\u0000\u00eb\u00ed\u00052\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00e1\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u0011\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0004\u0000\u0000\u00f9\u00fa"+
		"\u00051\u0000\u0000\u00fa\u00fb\u0003.\u0017\u0000\u00fb\u00fc\u00052"+
		"\u0000\u0000\u00fc\u00fd\u0005;\u0000\u0000\u00fd\u0013\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0006\u0000\u0000\u00ff\u0100\u00051\u0000\u0000"+
		"\u0100\u0101\u0003.\u0017\u0000\u0101\u0102\u00052\u0000\u0000\u0102\u0015"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0005\u0000\u0000\u0104\u0105"+
		"\u00051\u0000\u0000\u0105\u0106\u0003.\u0017\u0000\u0106\u0107\u00057"+
		"\u0000\u0000\u0107\u0108\u0003.\u0017\u0000\u0108\u0109\u00052\u0000\u0000"+
		"\u0109\u010a\u0005;\u0000\u0000\u010a\u0017\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\u000e\u0000\u0000\u010c\u010d\u0005\u0011\u0000\u0000\u010d"+
		"\u010e\u0003\u001a\r\u0000\u010e\u010f\u0006\f\uffff\uffff\u0000\u010f"+
		"\u0110\u0005\u0002\u0000\u0000\u0110\u0019\u0001\u0000\u0000\u0000\u0111"+
		"\u0127\u0006\r\uffff\uffff\u0000\u0112\u0113\u0003*\u0015\u0000\u0113"+
		"\u0114\u0006\r\uffff\uffff\u0000\u0114\u0126\u0001\u0000\u0000\u0000\u0115"+
		"\u011a\u0005(\u0000\u0000\u0116\u0117\u0005\b\u0000\u0000\u0117\u0118"+
		"\u0003\u0010\b\u0000\u0118\u0119\u0006\r\uffff\uffff\u0000\u0119\u011b"+
		"\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0126"+
		"\u0005;\u0000\u0000\u011d\u0122\u0005)\u0000\u0000\u011e\u011f\u0005\b"+
		"\u0000\u0000\u011f\u0120\u0003\u0010\b\u0000\u0120\u0121\u0006\r\uffff"+
		"\uffff\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0005;\u0000\u0000\u0125\u0112\u0001\u0000\u0000"+
		"\u0000\u0125\u0115\u0001\u0000\u0000\u0000\u0125\u011d\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012d\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0003\f\u0006\u0000"+
		"\u012b\u012c\u0006\r\uffff\uffff\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
		"\u012d\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u001b\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u000f\u0000\u0000"+
		"\u0130\u0131\u0005>\u0000\u0000\u0131\u0132\u0005\u0010\u0000\u0000\u0132"+
		"\u0133\u0003\u001e\u000f\u0000\u0133\u0134\u0003\u001a\r\u0000\u0134\u0135"+
		"\u0005\u0002\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u00051\u0000\u0000\u0137\u0138\u0003.\u0017\u0000\u0138\u0139\u00059"+
		"\u0000\u0000\u0139\u013a\u0003.\u0017\u0000\u013a\u013b\u00052\u0000\u0000"+
		"\u013b\u0149\u0001\u0000\u0000\u0000\u013c\u013d\u00053\u0000\u0000\u013d"+
		"\u0142\u0003.\u0017\u0000\u013e\u013f\u00057\u0000\u0000\u013f\u0141\u0003"+
		".\u0017\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u00054\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0005>\u0000\u0000\u0148\u0136\u0001\u0000\u0000\u0000"+
		"\u0148\u013c\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u001f\u0001\u0000\u0000\u0000\u014a\u014b\u0005>\u0000\u0000\u014b"+
		"\u014c\u00058\u0000\u0000\u014c\u014d\u0005\r\u0000\u0000\u014d\u014e"+
		"\u00051\u0000\u0000\u014e\u014f\u0003.\u0017\u0000\u014f\u0150\u00052"+
		"\u0000\u0000\u0150!\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0012\u0000"+
		"\u0000\u0152\u0153\u00051\u0000\u0000\u0153\u0154\u0003.\u0017\u0000\u0154"+
		"\u0155\u00052\u0000\u0000\u0155\u0156\u0006\u0011\uffff\uffff\u0000\u0156"+
		"#\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0013\u0000\u0000\u0158\u0159"+
		"\u00051\u0000\u0000\u0159\u015a\u0003.\u0017\u0000\u015a\u015b\u00052"+
		"\u0000\u0000\u015b\u015c\u0006\u0012\uffff\uffff\u0000\u015c%\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0006\u0013\uffff\uffff\u0000\u015e\u0162\u0005"+
		">\u0000\u0000\u015f\u0160\u0003(\u0014\u0000\u0160\u0161\u0006\u0013\uffff"+
		"\uffff\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0170\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u00050\u0000\u0000\u0165\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u0166\u0167\u0005+\u0000\u0000\u0167\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u0168\u0169\u0005,\u0000\u0000\u0169\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u016a\u016b\u0005.\u0000\u0000\u016b\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u016c\u016d\u0005-\u0000\u0000\u016d\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u016e\u016f\u0005/\u0000\u0000\u016f\u0171\u0006\u0013\uffff"+
		"\uffff\u0000\u0170\u0164\u0001\u0000\u0000\u0000\u0170\u0166\u0001\u0000"+
		"\u0000\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000"+
		"\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0003.\u0017"+
		"\u0000\u0173\u0174\u0005;\u0000\u0000\u0174\u0175\u0006\u0013\uffff\uffff"+
		"\u0000\u0175\'\u0001\u0000\u0000\u0000\u0176\u0177\u00053\u0000\u0000"+
		"\u0177\u0178\u0003.\u0017\u0000\u0178\u0179\u0006\u0014\uffff\uffff\u0000"+
		"\u0179\u017a\u00054\u0000\u0000\u017a)\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0003\u000e\u0007\u0000\u017c\u017d\u0006\u0015\uffff\uffff\u0000\u017d"+
		"\u0193\u0001\u0000\u0000\u0000\u017e\u017f\u0003\u0018\f\u0000\u017f\u0180"+
		"\u0006\u0015\uffff\uffff\u0000\u0180\u0193\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0003\u001c\u000e\u0000\u0182\u0183\u0006\u0015\uffff\uffff\u0000"+
		"\u0183\u0193\u0001\u0000\u0000\u0000\u0184\u0185\u0003\u0012\t\u0000\u0185"+
		"\u0186\u0006\u0015\uffff\uffff\u0000\u0186\u0193\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0003\u0016\u000b\u0000\u0188\u0189\u0006\u0015\uffff\uffff"+
		"\u0000\u0189\u0193\u0001\u0000\u0000\u0000\u018a\u018b\u0003.\u0017\u0000"+
		"\u018b\u018c\u0006\u0015\uffff\uffff\u0000\u018c\u018d\u0006\u0015\uffff"+
		"\uffff\u0000\u018d\u018e\u0005;\u0000\u0000\u018e\u0193\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0003&\u0013\u0000\u0190\u0191\u0006\u0015\uffff\uffff"+
		"\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u017b\u0001\u0000\u0000"+
		"\u0000\u0192\u017e\u0001\u0000\u0000\u0000\u0192\u0181\u0001\u0000\u0000"+
		"\u0000\u0192\u0184\u0001\u0000\u0000\u0000\u0192\u0187\u0001\u0000\u0000"+
		"\u0000\u0192\u018a\u0001\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000"+
		"\u0000\u0193+\u0001\u0000\u0000\u0000\u0194\u019a\u0006\u0016\uffff\uffff"+
		"\u0000\u0195\u0196\u0003*\u0015\u0000\u0196\u0197\u0006\u0016\uffff\uffff"+
		"\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000"+
		"\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a0\u0001\u0000\u0000"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u0003\f\u0006\u0000"+
		"\u019e\u019f\u0006\u0016\uffff\uffff\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1-\u0001\u0000\u0000\u0000\u01a2\u01a3\u0006\u0017\uffff\uffff"+
		"\u0000\u01a3\u01a4\u00030\u0018\u0000\u01a4\u01a5\u0006\u0017\uffff\uffff"+
		"\u0000\u01a5\u01ab\u0001\u0000\u0000\u0000\u01a6\u01a7\n\u0002\u0000\u0000"+
		"\u01a7\u01a8\u0005%\u0000\u0000\u01a8\u01aa\u00030\u0018\u0000\u01a9\u01a6"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac/\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0003"+
		"2\u0019\u0000\u01af\u01b4\u0006\u0018\uffff\uffff\u0000\u01b0\u01b1\u0005"+
		"\u0018\u0000\u0000\u01b1\u01b5\u0006\u0018\uffff\uffff\u0000\u01b2\u01b3"+
		"\u0005\u0019\u0000\u0000\u01b3\u01b5\u0006\u0018\uffff\uffff\u0000\u01b4"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u00032\u0019\u0000\u01b7\u01b8"+
		"\u0006\u0018\uffff\uffff\u0000\u01b8\u01bd\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u00032\u0019\u0000\u01ba\u01bb\u0006\u0018\uffff\uffff\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ae\u0001\u0000\u0000\u0000\u01bc"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bd1\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0006\u0019\uffff\uffff\u0000\u01bf\u01c0\u00034\u001a\u0000\u01c0\u01c1"+
		"\u0006\u0019\uffff\uffff\u0000\u01c1\u01d3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\n\u0002\u0000\u0000\u01c3\u01cc\u0006\u0019\uffff\uffff\u0000\u01c4"+
		"\u01c5\u0005\u001c\u0000\u0000\u01c5\u01cd\u0006\u0019\uffff\uffff\u0000"+
		"\u01c6\u01c7\u0005\u001d\u0000\u0000\u01c7\u01cd\u0006\u0019\uffff\uffff"+
		"\u0000\u01c8\u01c9\u0005\u001a\u0000\u0000\u01c9\u01cd\u0006\u0019\uffff"+
		"\uffff\u0000\u01ca\u01cb\u0005\u001b\u0000\u0000\u01cb\u01cd\u0006\u0019"+
		"\uffff\uffff\u0000\u01cc\u01c4\u0001\u0000\u0000\u0000\u01cc\u01c6\u0001"+
		"\u0000\u0000\u0000\u01cc\u01c8\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003"+
		"4\u001a\u0000\u01cf\u01d0\u0006\u0019\uffff\uffff\u0000\u01d0\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d1\u01c2\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d43\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0006\u001a\uffff\uffff\u0000\u01d7\u01d8\u0003"+
		"6\u001b\u0000\u01d8\u01d9\u0006\u001a\uffff\uffff\u0000\u01d9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\n\u0002\u0000\u0000\u01db\u01e0\u0006\u001a"+
		"\uffff\uffff\u0000\u01dc\u01dd\u0005\u0014\u0000\u0000\u01dd\u01e1\u0006"+
		"\u001a\uffff\uffff\u0000\u01de\u01df\u0005\u0015\u0000\u0000\u01df\u01e1"+
		"\u0006\u001a\uffff\uffff\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u00036\u001b\u0000\u01e3\u01e4\u0006\u001a\uffff\uffff\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01da\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e85\u0001\u0000\u0000\u0000\u01e9\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0006\u001b\uffff\uffff\u0000\u01eb"+
		"\u01ec\u00038\u001c\u0000\u01ec\u01ed\u0006\u001b\uffff\uffff\u0000\u01ed"+
		"\u01fb\u0001\u0000\u0000\u0000\u01ee\u01ef\n\u0002\u0000\u0000\u01ef\u01f4"+
		"\u0006\u001b\uffff\uffff\u0000\u01f0\u01f1\u0005\u0016\u0000\u0000\u01f1"+
		"\u01f5\u0006\u001b\uffff\uffff\u0000\u01f2\u01f3\u0005\u0017\u0000\u0000"+
		"\u01f3\u01f5\u0006\u001b\uffff\uffff\u0000\u01f4\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u00038\u001c\u0000\u01f7\u01f8\u0006\u001b\uffff\uffff"+
		"\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01ee\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc7\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0207\u0006\u001c\uffff\uffff"+
		"\u0000\u01ff\u0200\u0005 \u0000\u0000\u0200\u0208\u0006\u001c\uffff\uffff"+
		"\u0000\u0201\u0202\u0005\u0015\u0000\u0000\u0202\u0208\u0006\u001c\uffff"+
		"\uffff\u0000\u0203\u0204\u0005!\u0000\u0000\u0204\u0208\u0006\u001c\uffff"+
		"\uffff\u0000\u0205\u0206\u0005\"\u0000\u0000\u0206\u0208\u0006\u001c\uffff"+
		"\uffff\u0000\u0207\u01ff\u0001\u0000\u0000\u0000\u0207\u0201\u0001\u0000"+
		"\u0000\u0000\u0207\u0203\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0003:\u001d"+
		"\u0000\u020a\u020b\u0006\u001c\uffff\uffff\u0000\u020b\u0210\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0003:\u001d\u0000\u020d\u020e\u0006\u001c\uffff"+
		"\uffff\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u01fe\u0001\u0000"+
		"\u0000\u0000\u020f\u020c\u0001\u0000\u0000\u0000\u02109\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0006\u001d\uffff\uffff\u0000\u0212\u021a\u0003<\u001e"+
		"\u0000\u0213\u0214\u00051\u0000\u0000\u0214\u0215\u0003\n\u0005\u0000"+
		"\u0215\u0216\u0006\u001d\uffff\uffff\u0000\u0216\u0217\u00052\u0000\u0000"+
		"\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0213\u0001\u0000\u0000\u0000"+
		"\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u0222\u0001\u0000\u0000\u0000"+
		"\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u021e\u0003(\u0014\u0000\u021e"+
		"\u021f\u0006\u001d\uffff\uffff\u0000\u021f\u0221\u0001\u0000\u0000\u0000"+
		"\u0220\u021d\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000"+
		"\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0006\u001d\uffff\uffff\u0000\u0226;\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0003@ \u0000\u0228\u0229\u0006\u001e\uffff\uffff\u0000\u0229"+
		"\u0243\u0001\u0000\u0000\u0000\u022a\u022b\u0005>\u0000\u0000\u022b\u0243"+
		"\u0006\u001e\uffff\uffff\u0000\u022c\u022d\u0003>\u001f\u0000\u022d\u022e"+
		"\u0006\u001e\uffff\uffff\u0000\u022e\u0243\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0003\"\u0011\u0000\u0230\u0231\u0006\u001e\uffff\uffff\u0000\u0231"+
		"\u0243\u0001\u0000\u0000\u0000\u0232\u0233\u0003$\u0012\u0000\u0233\u0234"+
		"\u0006\u001e\uffff\uffff\u0000\u0234\u0243\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\u0003 \u0010\u0000\u0236\u0237\u0006\u001e\uffff\uffff\u0000\u0237"+
		"\u0243\u0001\u0000\u0000\u0000\u0238\u0239\u0003\u0014\n\u0000\u0239\u023a"+
		"\u0006\u001e\uffff\uffff\u0000\u023a\u0243\u0001\u0000\u0000\u0000\u023b"+
		"\u023f\u00051\u0000\u0000\u023c\u023d\u0003.\u0017\u0000\u023d\u023e\u0006"+
		"\u001e\uffff\uffff\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023c"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0001\u0000\u0000\u0000\u0241\u0243\u00052\u0000\u0000\u0242\u0227\u0001"+
		"\u0000\u0000\u0000\u0242\u022a\u0001\u0000\u0000\u0000\u0242\u022c\u0001"+
		"\u0000\u0000\u0000\u0242\u022f\u0001\u0000\u0000\u0000\u0242\u0232\u0001"+
		"\u0000\u0000\u0000\u0242\u0235\u0001\u0000\u0000\u0000\u0242\u0238\u0001"+
		"\u0000\u0000\u0000\u0242\u023b\u0001\u0000\u0000\u0000\u0243=\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0005*\u0000\u0000\u0245\u0246\u0003\u0004\u0002"+
		"\u0000\u0246\u0247\u00055\u0000\u0000\u0247\u0248\u0003,\u0016\u0000\u0248"+
		"\u0249\u00056\u0000\u0000\u0249\u024a\u0006\u001f\uffff\uffff\u0000\u024a"+
		"?\u0001\u0000\u0000\u0000\u024b\u024c\u0003D\"\u0000\u024c\u024d\u0006"+
		" \uffff\uffff\u0000\u024d\u025b\u0001\u0000\u0000\u0000\u024e\u024f\u0005"+
		"?\u0000\u0000\u024f\u025b\u0006 \uffff\uffff\u0000\u0250\u0251\u0005<"+
		"\u0000\u0000\u0251\u025b\u0006 \uffff\uffff\u0000\u0252\u0253\u0005=\u0000"+
		"\u0000\u0253\u025b\u0006 \uffff\uffff\u0000\u0254\u0255\u0003B!\u0000"+
		"\u0255\u0256\u0006 \uffff\uffff\u0000\u0256\u025b\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0003F#\u0000\u0258\u0259\u0006 \uffff\uffff\u0000\u0259"+
		"\u025b\u0001\u0000\u0000\u0000\u025a\u024b\u0001\u0000\u0000\u0000\u025a"+
		"\u024e\u0001\u0000\u0000\u0000\u025a\u0250\u0001\u0000\u0000\u0000\u025a"+
		"\u0252\u0001\u0000\u0000\u0000\u025a\u0254\u0001\u0000\u0000\u0000\u025a"+
		"\u0257\u0001\u0000\u0000\u0000\u025bA\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u00053\u0000\u0000\u025d\u025e\u0003\n\u0005\u0000\u025e\u025f\u0005"+
		"4\u0000\u0000\u025f\u0260\u0006!\uffff\uffff\u0000\u0260C\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0005&\u0000\u0000\u0262\u0266\u0006\"\uffff"+
		"\uffff\u0000\u0263\u0264\u0005\'\u0000\u0000\u0264\u0266\u0006\"\uffff"+
		"\uffff\u0000\u0265\u0261\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000"+
		"\u0000\u0000\u0266E\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u000b\u0000"+
		"\u0000\u0268\u0269\u00051\u0000\u0000\u0269\u026a\u0005:\u0000\u0000\u026a"+
		"\u026b\u0005>\u0000\u0000\u026b\u026c\u00052\u0000\u0000\u026c\u026d\u0006"+
		"#\uffff\uffff\u0000\u026dG\u0001\u0000\u0000\u0000/OQfy~\u0080\u0090\u00a8"+
		"\u00ab\u00b2\u00c2\u00cc\u00d4\u00db\u00e7\u00ec\u00f0\u00f5\u011a\u0122"+
		"\u0125\u0127\u012d\u0142\u0148\u0162\u0170\u0192\u019a\u01a0\u01ab\u01b4"+
		"\u01bc\u01cc\u01d3\u01e0\u01e7\u01f4\u01fb\u0207\u020f\u021a\u0222\u023f"+
		"\u0242\u025a\u0265";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}