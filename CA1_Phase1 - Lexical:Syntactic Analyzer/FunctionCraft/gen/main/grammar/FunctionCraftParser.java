// Generated from /Users/kourosh/Uni/PLC/CA/Phase1/Codes/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
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
		MAIN=1, DEF=2, RETURN=3, END=4, IF=5, ELSE=6, ELSEIF=7, CHOP=8, CHOMP=9, 
		PUSH=10, PUTS=11, METHOD=12, LEN=13, PATTERN=14, MATCH=15, NEXT=16, BREAK=17, 
		LOOP=18, DO=19, FOR=20, IN=21, ARROW=22, LPAR=23, RPAR=24, NOT=25, PLUS=26, 
		MINUS=27, MINUSMINUS=28, PLUSPLUS=29, MULT=30, DIV=31, GEQ=32, LEQ=33, 
		GTR=34, LES=35, EQL=36, NEQ=37, PLUSEQ=38, MINEQ=39, MULTEQ=40, DIVEQ=41, 
		MODEQ=42, AND=43, OR=44, APPEND=45, ASSIGN=46, LBRACE=47, RBRACE=48, LBRAK=49, 
		RBRAK=50, COMMA=51, DOT=52, COLON=53, SEMICOLON=54, SEPERATOR=55, INT_VAL=56, 
		FLOAT_VAL=57, STRING_VAL=58, BOOL_VAL=59, IDENTIFIER=60, COMMENT=61, WS=62;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_function = 2, RULE_functionParameters = 3, 
		RULE_functionBody = 4, RULE_statement = 5, RULE_builtIn = 6, RULE_pattern = 7, 
		RULE_puts = 8, RULE_len = 9, RULE_push = 10, RULE_match = 11, RULE_chop = 12, 
		RULE_chomp = 13, RULE_functionCall = 14, RULE_loop = 15, RULE_flowControl = 16, 
		RULE_ifstmt = 17, RULE_ifStmtParams = 18, RULE_ifBlock = 19, RULE_elseIfBlocks = 20, 
		RULE_elseBlock = 21, RULE_statementList = 22, RULE_lambdaFunction = 23, 
		RULE_expr = 24, RULE_assignExpression = 25, RULE_appendExpression = 26, 
		RULE_appendExpressionTail = 27, RULE_logicalOrExpression = 28, RULE_logicalAndExpression = 29, 
		RULE_equalExpression = 30, RULE_comparisonExpression = 31, RULE_plusMinusExpression = 32, 
		RULE_plusMinusExpressionTail = 33, RULE_multiplyDivideExpression = 34, 
		RULE_multiplyDivideExpressionTail = 35, RULE_unaryExpression = 36, RULE_unaryExpressionPost = 37, 
		RULE_unaryExpressionPostTail = 38, RULE_retrieveListExpression = 39, RULE_paranthesisExpression = 40, 
		RULE_variableExpression = 41, RULE_method = 42, RULE_matchExpr = 43, RULE_funcParameter = 44, 
		RULE_funcParameterDefault = 45, RULE_dataTypes = 46, RULE_list = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "functionParameters", "functionBody", 
			"statement", "builtIn", "pattern", "puts", "len", "push", "match", "chop", 
			"chomp", "functionCall", "loop", "flowControl", "ifstmt", "ifStmtParams", 
			"ifBlock", "elseIfBlocks", "elseBlock", "statementList", "lambdaFunction", 
			"expr", "assignExpression", "appendExpression", "appendExpressionTail", 
			"logicalOrExpression", "logicalAndExpression", "equalExpression", "comparisonExpression", 
			"plusMinusExpression", "plusMinusExpressionTail", "multiplyDivideExpression", 
			"multiplyDivideExpressionTail", "unaryExpression", "unaryExpressionPost", 
			"unaryExpressionPostTail", "retrieveListExpression", "paranthesisExpression", 
			"variableExpression", "method", "matchExpr", "funcParameter", "funcParameterDefault", 
			"dataTypes", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'def'", "'return'", "'end'", "'if'", "'else'", "'elseif'", 
			"'chop'", "'chomp'", "'push'", "'puts'", "'method'", "'len'", "'pattern'", 
			"'match'", "'next'", "'break'", "'loop'", "'do'", "'for'", "'in'", "'->'", 
			"'('", "')'", "'!'", "'+'", "'-'", "'--'", "'++'", "'*'", "'/'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", "'!='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&&'", "'||'", "'<<'", "'='", "'{'", "'}'", "'['", "']'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "DEF", "RETURN", "END", "IF", "ELSE", "ELSEIF", "CHOP", 
			"CHOMP", "PUSH", "PUTS", "METHOD", "LEN", "PATTERN", "MATCH", "NEXT", 
			"BREAK", "LOOP", "DO", "FOR", "IN", "ARROW", "LPAR", "RPAR", "NOT", "PLUS", 
			"MINUS", "MINUSMINUS", "PLUSPLUS", "MULT", "DIV", "GEQ", "LEQ", "GTR", 
			"LES", "EQL", "NEQ", "PLUSEQ", "MINEQ", "MULTEQ", "DIVEQ", "MODEQ", "AND", 
			"OR", "APPEND", "ASSIGN", "LBRACE", "RBRACE", "LBRAK", "RBRAK", "COMMA", 
			"DOT", "COLON", "SEMICOLON", "SEPERATOR", "INT_VAL", "FLOAT_VAL", "STRING_VAL", 
			"BOOL_VAL", "IDENTIFIER", "COMMENT", "WS"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(96);
						function();
						}
						break;
					case PATTERN:
						{
						setState(97);
						pattern();
						}
						break;
					case COMMENT:
						{
						setState(98);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(104);
			main();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(105);
				match(COMMENT);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
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
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DEF);
			setState(112);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(114);
			match(LPAR);
			setState(115);
			match(RPAR);
			setState(116);
			functionBody();
			setState(117);
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
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DEF);
			setState(120);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			 System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null)); 
			setState(122);
			match(LPAR);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK || _la==IDENTIFIER) {
				{
				setState(123);
				functionParameters();
				}
			}

			setState(126);
			match(RPAR);
			setState(127);
			functionBody();
			setState(128);
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
	public static class FunctionParametersContext extends ParserRuleContext {
		public FuncParameterContext funcParameter() {
			return getRuleContext(FuncParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public FuncParameterDefaultContext funcParameterDefault() {
			return getRuleContext(FuncParameterDefaultContext.class,0);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionParameters);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				funcParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(131);
				funcParameter();
				setState(132);
				match(COMMA);
				setState(133);
				funcParameterDefault();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				funcParameterDefault();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4540191374524596000L) != 0)) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case MATCH:
				case LOOP:
				case FOR:
				case ARROW:
				case LPAR:
				case NOT:
				case MINUS:
				case LBRAK:
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case BOOL_VAL:
				case IDENTIFIER:
					{
					setState(138);
					statement();
					}
					break;
				case COMMENT:
					{
					setState(139);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(145);
				match(RETURN);
				 System.out.println("RETURN"); 
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365310902048L) != 0)) {
					{
					setState(147);
					statement();
					}
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case MATCH:
			case ARROW:
			case LPAR:
			case NOT:
			case MINUS:
			case LBRAK:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOL_VAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(152);
				expr();
				}
				setState(153);
				match(SEMICOLON);
				}
				break;
			case LOOP:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				ifstmt();
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
	public static class BuiltInContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public BuiltInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuiltIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuiltIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuiltIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInContext builtIn() throws RecognitionException {
		BuiltInContext _localctx = new BuiltInContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_builtIn);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				puts();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				len();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				push();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				chop();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				chomp();
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
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(FunctionCraftParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(FunctionCraftParser.SEPERATOR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PATTERN);
			setState(168);
			((PatternContext)_localctx).name = match(IDENTIFIER);
			 System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null)); 
			setState(170);
			match(LPAR);
			{
			setState(171);
			match(IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				match(IDENTIFIER);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(179);
			match(RPAR);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				match(SEPERATOR);
				setState(181);
				match(LPAR);
				setState(182);
				expr();
				setState(183);
				match(RPAR);
				setState(184);
				match(ASSIGN);
				setState(185);
				expr();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPERATOR );
			setState(191);
			match(SEMICOLON);
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
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(PUTS);
			 System.out.println("Built-In: PUTS"); 
			setState(195);
			match(LPAR);
			{
			setState(196);
			expr();
			}
			setState(197);
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
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(FunctionCraftParser.LBRAK, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode RBRAK() { return getToken(FunctionCraftParser.RBRAK, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(LEN);
			 System.out.println("Built-In: LEN"); 
			setState(201);
			match(LPAR);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(202);
				list();
				{
				setState(203);
				match(LBRAK);
				setState(204);
				match(INT_VAL);
				setState(205);
				match(RBRAK);
				}
				}
				}
				break;
			case 2:
				{
				setState(207);
				expr();
				}
				break;
			}
			setState(210);
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
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PUSH);
			 System.out.println("Built-In: PUSH"); 
			setState(214);
			match(LPAR);
			{
			{
			setState(215);
			expr();
			setState(216);
			match(COMMA);
			setState(217);
			expr();
			}
			}
			setState(219);
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
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(MATCH);
			 System.out.println("Built-In: MATCH"); 
			setState(223);
			match(LPAR);
			{
			setState(224);
			expr();
			}
			setState(225);
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
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(CHOP);
			 System.out.println("Built-In: CHOP"); 
			setState(229);
			match(LPAR);
			{
			setState(230);
			expr();
			}
			setState(231);
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
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(CHOMP);
			 System.out.println("Built-In: CHOMP"); 
			setState(235);
			match(LPAR);
			{
			setState(236);
			expr();
			}
			setState(237);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			 System.out.println("Function Call"); 
			{
			setState(241);
			match(LPAR);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365309591296L) != 0)) {
				{
				{
				setState(242);
				expr();
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(243);
					match(COMMA);
					setState(244);
					expr();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(252);
			match(RPAR);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FlowControlContext> flowControl() {
			return getRuleContexts(FlowControlContext.class);
		}
		public FlowControlContext flowControl(int i) {
			return getRuleContext(FlowControlContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(254);
				match(LOOP);
				 System.out.println("Loop: DO"); 
				setState(256);
				match(DO);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4540191374524792608L) != 0)) {
					{
					setState(260);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case METHOD:
					case LEN:
					case MATCH:
					case LOOP:
					case FOR:
					case ARROW:
					case LPAR:
					case NOT:
					case MINUS:
					case LBRAK:
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
					case BOOL_VAL:
					case IDENTIFIER:
						{
						setState(257);
						statement();
						}
						break;
					case NEXT:
					case BREAK:
						{
						setState(258);
						flowControl();
						}
						break;
					case COMMENT:
						{
						setState(259);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(END);
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(266);
				match(FOR);
				 System.out.println("Loop: FOR"); 
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(IN);
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(270);
					match(LPAR);
					setState(271);
					_la = _input.LA(1);
					if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(272);
					match(DOT);
					setState(273);
					match(DOT);
					setState(274);
					_la = _input.LA(1);
					if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(275);
					match(RPAR);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(276);
					match(IDENTIFIER);
					}
					break;
				case LBRAK:
					{
					setState(277);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4540191374524792608L) != 0)) {
					{
					setState(283);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case METHOD:
					case LEN:
					case MATCH:
					case LOOP:
					case FOR:
					case ARROW:
					case LPAR:
					case NOT:
					case MINUS:
					case LBRAK:
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
					case BOOL_VAL:
					case IDENTIFIER:
						{
						setState(280);
						statement();
						}
						break;
					case NEXT:
					case BREAK:
						{
						setState(281);
						flowControl();
						}
						break;
					case COMMENT:
						{
						setState(282);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(END);
				}
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
	public static class FlowControlContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public FlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFlowControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFlowControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFlowControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowControlContext flowControl() throws RecognitionException {
		FlowControlContext _localctx = new FlowControlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flowControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(291);
					match(NEXT);
					 System.out.println("Control: NEXT"); 
					}
					break;
				case 2:
					{
					setState(293);
					match(NEXT);
					 System.out.println("Control: NEXT"); 
					setState(295);
					match(IF);
					setState(296);
					match(LPAR);
					setState(297);
					expr();
					setState(298);
					match(RPAR);
					}
					break;
				}
				}
				break;
			case BREAK:
				{
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(302);
					match(BREAK);
					 System.out.println("Control: BREAK"); 
					}
					break;
				case 2:
					{
					setState(304);
					match(BREAK);
					 System.out.println("Control: BREAK"); 
					setState(306);
					match(IF);
					setState(307);
					match(LPAR);
					setState(308);
					expr();
					setState(309);
					match(RPAR);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			match(SEMICOLON);
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
	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public IfStmtParamsContext ifStmtParams() {
			return getRuleContext(IfStmtParamsContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseIfBlocksContext elseIfBlocks() {
			return getRuleContext(ElseIfBlocksContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IF);
			 System.out.println("Decision: IF"); 
			setState(319);
			ifStmtParams();
			setState(320);
			ifBlock();
			setState(321);
			elseIfBlocks();
			setState(322);
			elseBlock();
			setState(323);
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
	public static class IfStmtParamsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<IfStmtParamsContext> ifStmtParams() {
			return getRuleContexts(IfStmtParamsContext.class);
		}
		public IfStmtParamsContext ifStmtParams(int i) {
			return getRuleContext(IfStmtParamsContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionCraftParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionCraftParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public IfStmtParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmtParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfStmtParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfStmtParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfStmtParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtParamsContext ifStmtParams() throws RecognitionException {
		IfStmtParamsContext _localctx = new IfStmtParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStmtParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(LPAR);
			setState(326);
			expr();
			setState(327);
			match(RPAR);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(329);
					ifStmtParams();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class IfBlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			statementList();
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
	public static class ElseIfBlocksContext extends ParserRuleContext {
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public List<IfStmtParamsContext> ifStmtParams() {
			return getRuleContexts(IfStmtParamsContext.class);
		}
		public IfStmtParamsContext ifStmtParams(int i) {
			return getRuleContext(IfStmtParamsContext.class,i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public ElseIfBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseIfBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseIfBlocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseIfBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlocksContext elseIfBlocks() throws RecognitionException {
		ElseIfBlocksContext _localctx = new ElseIfBlocksContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseIfBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(337);
				match(ELSEIF);
				setState(338);
				ifStmtParams();
				 System.out.println("Decision: ELSE IF"); 
				setState(340);
				statementList();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(347);
				match(ELSE);
				 System.out.println("Decision: ELSE"); 
				setState(349);
				statementList();
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(FunctionCraftParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(FunctionCraftParser.RETURN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<FlowControlContext> flowControl() {
			return getRuleContexts(FlowControlContext.class);
		}
		public FlowControlContext flowControl(int i) {
			return getRuleContext(FlowControlContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4540191374524792616L) != 0)) {
				{
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case MATCH:
				case LOOP:
				case FOR:
				case ARROW:
				case LPAR:
				case NOT:
				case MINUS:
				case LBRAK:
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case BOOL_VAL:
				case IDENTIFIER:
					{
					setState(352);
					statement();
					}
					break;
				case RETURN:
					{
					setState(353);
					match(RETURN);
					 System.out.println("RETURN"); 
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365309591296L) != 0)) {
						{
						setState(355);
						expr();
						}
					}

					setState(358);
					match(SEMICOLON);
					}
					break;
				case NEXT:
				case BREAK:
					{
					setState(359);
					flowControl();
					}
					break;
				case COMMENT:
					{
					setState(360);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class LambdaFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
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
		enterRule(_localctx, 46, RULE_lambdaFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ARROW);
			 System.out.println("Structure: LAMBDA"); 
			setState(368);
			match(LPAR);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(369);
				match(IDENTIFIER);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(370);
					match(COMMA);
					setState(371);
					match(IDENTIFIER);
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(379);
			match(RPAR);
			setState(380);
			match(LBRACE);
			setState(381);
			functionBody();
			setState(382);
			match(RBRACE);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(383);
				match(LPAR);
				{
				setState(384);
				match(IDENTIFIER);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(385);
					match(COMMA);
					setState(386);
					match(IDENTIFIER);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(392);
				match(RPAR);
				}
				break;
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
	public static class ExprContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			assignExpression();
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
	public static class AssignExpressionContext extends ParserRuleContext {
		public AppendExpressionContext name;
		public AppendExpressionContext appendExpression() {
			return getRuleContext(AppendExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((AssignExpressionContext)_localctx).name = appendExpression();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(398);
				match(ASSIGN);
				setState(399);
				assignExpression();
				System.out.println("Assignment: " + (((AssignExpressionContext)_localctx).name!=null?_input.getText(((AssignExpressionContext)_localctx).name.start,((AssignExpressionContext)_localctx).name.stop):null));
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
	public static class AppendExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AppendExpressionTailContext appendExpressionTail() {
			return getRuleContext(AppendExpressionTailContext.class,0);
		}
		public AppendExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendExpressionContext appendExpression() throws RecognitionException {
		AppendExpressionContext _localctx = new AppendExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_appendExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			logicalOrExpression();
			setState(405);
			appendExpressionTail();
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
	public static class AppendExpressionTailContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AppendExpressionTailContext appendExpressionTail() {
			return getRuleContext(AppendExpressionTailContext.class,0);
		}
		public AppendExpressionTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExpressionTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendExpressionTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendExpressionTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendExpressionTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendExpressionTailContext appendExpressionTail() throws RecognitionException {
		AppendExpressionTailContext _localctx = new AppendExpressionTailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_appendExpressionTail);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(APPEND);
				setState(408);
				logicalOrExpression();
				System.out.println("Operator : <<");
				setState(410);
				appendExpressionTail();
				}
				break;
			case RPAR:
			case ASSIGN:
			case RBRAK:
			case COMMA:
			case SEMICOLON:
			case SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicalOrExpression);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(LPAR);
				setState(416);
				logicalAndExpression();
				setState(417);
				match(RPAR);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(418);
					match(OR);
					setState(419);
					match(LPAR);
					setState(420);
					logicalAndExpression();
					setState(421);
					match(RPAR);
					System.out.println("Operator : ||");
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				logicalAndExpression();
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionCraftParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionCraftParser.AND, i);
		}
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_logicalAndExpression);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(LPAR);
				setState(433);
				equalExpression();
				setState(434);
				match(RPAR);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(435);
					match(AND);
					setState(436);
					match(LPAR);
					setState(437);
					logicalAndExpression();
					setState(438);
					match(RPAR);
					System.out.println("Operator : &&");
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				equalExpression();
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
	public static class EqualExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> EQL() { return getTokens(FunctionCraftParser.EQL); }
		public TerminalNode EQL(int i) {
			return getToken(FunctionCraftParser.EQL, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(FunctionCraftParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(FunctionCraftParser.NEQ, i);
		}
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			comparisonExpression();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQL || _la==NEQ) {
				{
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQL:
					{
					setState(450);
					match(EQL);
					setState(451);
					comparisonExpression();
					System.out.println("Operator : ==");
					}
					break;
				case NEQ:
					{
					setState(454);
					match(NEQ);
					setState(455);
					comparisonExpression();
					System.out.println("Operator : !=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<PlusMinusExpressionContext> plusMinusExpression() {
			return getRuleContexts(PlusMinusExpressionContext.class);
		}
		public PlusMinusExpressionContext plusMinusExpression(int i) {
			return getRuleContext(PlusMinusExpressionContext.class,i);
		}
		public List<TerminalNode> LES() { return getTokens(FunctionCraftParser.LES); }
		public TerminalNode LES(int i) {
			return getToken(FunctionCraftParser.LES, i);
		}
		public List<TerminalNode> GTR() { return getTokens(FunctionCraftParser.GTR); }
		public TerminalNode GTR(int i) {
			return getToken(FunctionCraftParser.GTR, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(FunctionCraftParser.GEQ); }
		public TerminalNode GEQ(int i) {
			return getToken(FunctionCraftParser.GEQ, i);
		}
		public List<TerminalNode> LEQ() { return getTokens(FunctionCraftParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(FunctionCraftParser.LEQ, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			plusMinusExpression();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) {
				{
				setState(480);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LES:
					{
					setState(464);
					match(LES);
					setState(465);
					plusMinusExpression();
					System.out.println("Operator : <");
					}
					break;
				case GTR:
					{
					setState(468);
					match(GTR);
					setState(469);
					plusMinusExpression();
					System.out.println("Operator : >");
					}
					break;
				case GEQ:
					{
					setState(472);
					match(GEQ);
					setState(473);
					plusMinusExpression();
					System.out.println("Operator : >=");
					}
					break;
				case LEQ:
					{
					setState(476);
					match(LEQ);
					setState(477);
					plusMinusExpression();
					System.out.println("Operator : <=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class PlusMinusExpressionContext extends ParserRuleContext {
		public MultiplyDivideExpressionContext multiplyDivideExpression() {
			return getRuleContext(MultiplyDivideExpressionContext.class,0);
		}
		public PlusMinusExpressionTailContext plusMinusExpressionTail() {
			return getRuleContext(PlusMinusExpressionTailContext.class,0);
		}
		public PlusMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusExpressionContext plusMinusExpression() throws RecognitionException {
		PlusMinusExpressionContext _localctx = new PlusMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_plusMinusExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			multiplyDivideExpression();
			setState(486);
			plusMinusExpressionTail();
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
	public static class PlusMinusExpressionTailContext extends ParserRuleContext {
		public PlusMinusExpressionTailContext plusMinusExpressionTail() {
			return getRuleContext(PlusMinusExpressionTailContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public MultiplyDivideExpressionContext multiplyDivideExpression() {
			return getRuleContext(MultiplyDivideExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode PLUSEQ() { return getToken(FunctionCraftParser.PLUSEQ, 0); }
		public TerminalNode MINEQ() { return getToken(FunctionCraftParser.MINEQ, 0); }
		public PlusMinusExpressionTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExpressionTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPlusMinusExpressionTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPlusMinusExpressionTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPlusMinusExpressionTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusExpressionTailContext plusMinusExpressionTail() throws RecognitionException {
		PlusMinusExpressionTailContext _localctx = new PlusMinusExpressionTailContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_plusMinusExpressionTail);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case PLUSEQ:
			case MINEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(488);
					match(PLUS);
					setState(489);
					multiplyDivideExpression();
					System.out.println("Operator : +");
					}
					break;
				case MINUS:
					{
					setState(492);
					match(MINUS);
					setState(493);
					multiplyDivideExpression();
					System.out.println("Operator : -");
					}
					break;
				case PLUSEQ:
					{
					setState(496);
					match(PLUSEQ);
					setState(497);
					multiplyDivideExpression();
					System.out.println("Operator : +=");
					}
					break;
				case MINEQ:
					{
					setState(500);
					match(MINEQ);
					setState(501);
					multiplyDivideExpression();
					System.out.println("Operator : -=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(506);
				plusMinusExpressionTail();
				}
				break;
			case RPAR:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case APPEND:
			case ASSIGN:
			case RBRAK:
			case COMMA:
			case SEMICOLON:
			case SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class MultiplyDivideExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplyDivideExpressionTailContext multiplyDivideExpressionTail() {
			return getRuleContext(MultiplyDivideExpressionTailContext.class,0);
		}
		public MultiplyDivideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDivideExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDivideExpressionContext multiplyDivideExpression() throws RecognitionException {
		MultiplyDivideExpressionContext _localctx = new MultiplyDivideExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplyDivideExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			unaryExpression();
			setState(512);
			multiplyDivideExpressionTail();
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
	public static class MultiplyDivideExpressionTailContext extends ParserRuleContext {
		public MultiplyDivideExpressionTailContext multiplyDivideExpressionTail() {
			return getRuleContext(MultiplyDivideExpressionTailContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MULTEQ() { return getToken(FunctionCraftParser.MULTEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(FunctionCraftParser.DIVEQ, 0); }
		public TerminalNode MODEQ() { return getToken(FunctionCraftParser.MODEQ, 0); }
		public MultiplyDivideExpressionContext multiplyDivideExpression() {
			return getRuleContext(MultiplyDivideExpressionContext.class,0);
		}
		public MultiplyDivideExpressionTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDivideExpressionTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMultiplyDivideExpressionTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMultiplyDivideExpressionTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMultiplyDivideExpressionTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDivideExpressionTailContext multiplyDivideExpressionTail() throws RecognitionException {
		MultiplyDivideExpressionTailContext _localctx = new MultiplyDivideExpressionTailContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiplyDivideExpressionTail);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(514);
					match(MULT);
					setState(515);
					unaryExpression();
					System.out.println("Operator : *");
					}
					break;
				case DIV:
					{
					setState(518);
					match(DIV);
					setState(519);
					unaryExpression();
					System.out.println("Operator : /");
					}
					break;
				case MULTEQ:
					{
					setState(522);
					match(MULTEQ);
					setState(523);
					unaryExpression();
					System.out.println("Operator : *=");
					}
					break;
				case DIVEQ:
					{
					setState(526);
					match(DIVEQ);
					setState(527);
					unaryExpression();
					System.out.println("Operator : /=");
					}
					break;
				case MODEQ:
					{
					setState(530);
					match(MODEQ);
					setState(531);
					multiplyDivideExpression();
					System.out.println("Operator : %=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(536);
				multiplyDivideExpressionTail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public UnaryExpressionPostContext unaryExpressionPost() {
			return getRuleContext(UnaryExpressionPostContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(541);
				match(NOT);
				setState(542);
				unaryExpression();
				System.out.println("Operator : !");
				}
				break;
			case MINUS:
				{
				setState(545);
				match(MINUS);
				setState(546);
				unaryExpression();
				System.out.println("Operator : -");
				}
				break;
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case MATCH:
			case ARROW:
			case LPAR:
			case LBRAK:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOL_VAL:
			case IDENTIFIER:
				{
				setState(549);
				unaryExpressionPost();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class UnaryExpressionPostContext extends ParserRuleContext {
		public RetrieveListExpressionContext retrieveListExpression() {
			return getRuleContext(RetrieveListExpressionContext.class,0);
		}
		public UnaryExpressionPostTailContext unaryExpressionPostTail() {
			return getRuleContext(UnaryExpressionPostTailContext.class,0);
		}
		public UnaryExpressionPostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUnaryExpressionPost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUnaryExpressionPost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUnaryExpressionPost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostContext unaryExpressionPost() throws RecognitionException {
		UnaryExpressionPostContext _localctx = new UnaryExpressionPostContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryExpressionPost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			retrieveListExpression();
			setState(553);
			unaryExpressionPostTail();
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
	public static class UnaryExpressionPostTailContext extends ParserRuleContext {
		public UnaryExpressionPostTailContext unaryExpressionPostTail() {
			return getRuleContext(UnaryExpressionPostTailContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(FunctionCraftParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(FunctionCraftParser.MINUSMINUS, 0); }
		public UnaryExpressionPostTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUnaryExpressionPostTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUnaryExpressionPostTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUnaryExpressionPostTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostTailContext unaryExpressionPostTail() throws RecognitionException {
		UnaryExpressionPostTailContext _localctx = new UnaryExpressionPostTailContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unaryExpressionPostTail);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUSMINUS:
			case PLUSPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUSPLUS:
					{
					setState(555);
					match(PLUSPLUS);
					System.out.println("Operator : ++");
					}
					break;
				case MINUSMINUS:
					{
					setState(557);
					match(MINUSMINUS);
					System.out.println("Operator : --");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				unaryExpressionPostTail();
				}
				break;
			case RPAR:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case PLUSEQ:
			case MINEQ:
			case MULTEQ:
			case DIVEQ:
			case MODEQ:
			case APPEND:
			case ASSIGN:
			case RBRAK:
			case COMMA:
			case SEMICOLON:
			case SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class RetrieveListExpressionContext extends ParserRuleContext {
		public ParanthesisExpressionContext paranthesisExpression() {
			return getRuleContext(ParanthesisExpressionContext.class,0);
		}
		public List<TerminalNode> LBRAK() { return getTokens(FunctionCraftParser.LBRAK); }
		public TerminalNode LBRAK(int i) {
			return getToken(FunctionCraftParser.LBRAK, i);
		}
		public List<TerminalNode> RBRAK() { return getTokens(FunctionCraftParser.RBRAK); }
		public TerminalNode RBRAK(int i) {
			return getToken(FunctionCraftParser.RBRAK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RetrieveListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieveListExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRetrieveListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRetrieveListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRetrieveListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrieveListExpressionContext retrieveListExpression() throws RecognitionException {
		RetrieveListExpressionContext _localctx = new RetrieveListExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_retrieveListExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			paranthesisExpression();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAK) {
				{
				{
				setState(566);
				match(LBRAK);
				{
				setState(567);
				expr();
				}
				setState(568);
				match(RBRAK);
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParanthesisExpressionContext extends ParserRuleContext {
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ParanthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paranthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParanthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParanthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParanthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParanthesisExpressionContext paranthesisExpression() throws RecognitionException {
		ParanthesisExpressionContext _localctx = new ParanthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_paranthesisExpression);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				dataTypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				variableExpression();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(577);
					match(LPAR);
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365309591296L) != 0)) {
						{
						setState(578);
						expr();
						setState(583);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(579);
							match(COMMA);
							setState(580);
							expr();
							}
							}
							setState(585);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(588);
					match(RPAR);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(LPAR);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365309591296L) != 0)) {
					{
					setState(595);
					expr();
					}
				}

				setState(598);
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
	public static class VariableExpressionContext extends ParserRuleContext {
		public BuiltInContext builtIn() {
			return getRuleContext(BuiltInContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MatchExprContext matchExpr() {
			return getRuleContext(MatchExprContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public VariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpressionContext variableExpression() throws RecognitionException {
		VariableExpressionContext _localctx = new VariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableExpression);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				builtIn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				method();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				matchExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				lambdaFunction();
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(METHOD);
			setState(609);
			match(LPAR);
			setState(610);
			match(COLON);
			setState(611);
			match(IDENTIFIER);
			setState(612);
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
	public static class MatchExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public MatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExprContext matchExpr() throws RecognitionException {
		MatchExprContext _localctx = new MatchExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_matchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(IDENTIFIER);
			setState(615);
			match(DOT);
			setState(616);
			match(MATCH);
			setState(617);
			match(LPAR);
			setState(618);
			expr();
			setState(619);
			match(RPAR);
			 System.out.println("Built-In: MATCH"); 
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
	public static class FuncParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public FuncParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFuncParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFuncParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFuncParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterContext funcParameter() throws RecognitionException {
		FuncParameterContext _localctx = new FuncParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_funcParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(IDENTIFIER);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					match(COMMA);
					setState(624);
					match(IDENTIFIER);
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
	public static class FuncParameterDefaultContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(FunctionCraftParser.LBRAK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRAK() { return getToken(FunctionCraftParser.RBRAK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public FuncParameterDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameterDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFuncParameterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFuncParameterDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFuncParameterDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterDefaultContext funcParameterDefault() throws RecognitionException {
		FuncParameterDefaultContext _localctx = new FuncParameterDefaultContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_funcParameterDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(LBRAK);
			setState(631);
			match(IDENTIFIER);
			setState(632);
			match(ASSIGN);
			setState(633);
			expr();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(634);
				match(COMMA);
				setState(635);
				match(IDENTIFIER);
				setState(636);
				match(ASSIGN);
				setState(637);
				expr();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			match(RBRAK);
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
	public static class DataTypesContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode BOOL_VAL() { return getToken(FunctionCraftParser.BOOL_VAL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDataTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDataTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDataTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypesContext dataTypes() throws RecognitionException {
		DataTypesContext _localctx = new DataTypesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dataTypes);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(FLOAT_VAL);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				match(STRING_VAL);
				}
				break;
			case BOOL_VAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				match(BOOL_VAL);
				}
				break;
			case LBRAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				list();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				match(IDENTIFIER);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(FunctionCraftParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(FunctionCraftParser.RBRAK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(LBRAK);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348365309591296L) != 0)) {
				{
				{
				setState(654);
				expr();
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(655);
					match(COMMA);
					setState(656);
					expr();
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(664);
			match(RBRAK);
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

	public static final String _serializedATN =
		"\u0004\u0001>\u029b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000k\b\u0000\n\u0000\f\u0000n\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"}\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0089\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004\n\u0004"+
		"\f\u0004\u0090\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0095\b\u0004\u0003\u0004\u0097\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009e\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a6"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00af\b\u0007\n\u0007\f\u0007\u00b2\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u00bc\b\u0007\u000b\u0007\f\u0007"+
		"\u00bd\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00d1\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00f6\b\u000e\n\u000e\f\u000e\u00f9\t\u000e\u0003\u000e\u00fb\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0105\b\u000f\n\u000f\f\u000f"+
		"\u0108\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0117\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u011c\b\u000f\n\u000f\f\u000f\u011f\t\u000f\u0001"+
		"\u000f\u0003\u000f\u0122\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u012d\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0138"+
		"\b\u0010\u0003\u0010\u013a\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u014b\b\u0012\n\u0012\f\u0012\u014e\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0157\b\u0014\n\u0014\f\u0014\u015a\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u015f\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0165\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u016a\b\u0016\n\u0016\f\u0016\u016d\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0175"+
		"\b\u0017\n\u0017\f\u0017\u0178\t\u0017\u0003\u0017\u017a\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0184\b\u0017\n\u0017\f\u0017\u0187\t\u0017"+
		"\u0001\u0017\u0003\u0017\u018a\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0193\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u019e\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u01a9\b\u001c\n\u001c\f\u001c\u01ac"+
		"\t\u001c\u0001\u001c\u0003\u001c\u01af\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01ba\b\u001d\n\u001d\f\u001d\u01bd\t\u001d\u0001"+
		"\u001d\u0003\u001d\u01c0\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01cb\b\u001e\n\u001e\f\u001e\u01ce\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01e1\b\u001f\n\u001f"+
		"\f\u001f\u01e4\t\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01f9\b!\u0001!\u0001!\u0001!\u0003!\u01fe\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0217\b#\u0001#\u0001#\u0001#\u0003#\u021c\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0227"+
		"\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u0230\b&\u0001"+
		"&\u0001&\u0003&\u0234\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u023b\b\'\n\'\f\'\u023e\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0246\b(\n(\f(\u0249\t(\u0003(\u024b\b(\u0001(\u0005(\u024e\b"+
		"(\n(\f(\u0251\t(\u0001(\u0001(\u0003(\u0255\b(\u0001(\u0003(\u0258\b("+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u025f\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u0272\b,\n,\f,\u0275\t,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u027f\b-\n-\f-\u0282"+
		"\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u028c"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0005/\u0292\b/\n/\f/\u0295\t/\u0003/"+
		"\u0297\b/\u0001/\u0001/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^\u0000\u0002\u0002\u000088<<\u0001\u0000+,\u02c6"+
		"\u0000e\u0001\u0000\u0000\u0000\u0002o\u0001\u0000\u0000\u0000\u0004w"+
		"\u0001\u0000\u0000\u0000\u0006\u0088\u0001\u0000\u0000\u0000\b\u008e\u0001"+
		"\u0000\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000"+
		"\u0000\u0000\u000e\u00a7\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000"+
		"\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00d4\u0001\u0000"+
		"\u0000\u0000\u0016\u00dd\u0001\u0000\u0000\u0000\u0018\u00e3\u0001\u0000"+
		"\u0000\u0000\u001a\u00e9\u0001\u0000\u0000\u0000\u001c\u00ef\u0001\u0000"+
		"\u0000\u0000\u001e\u0121\u0001\u0000\u0000\u0000 \u0139\u0001\u0000\u0000"+
		"\u0000\"\u013d\u0001\u0000\u0000\u0000$\u0145\u0001\u0000\u0000\u0000"+
		"&\u014f\u0001\u0000\u0000\u0000(\u0158\u0001\u0000\u0000\u0000*\u015e"+
		"\u0001\u0000\u0000\u0000,\u016b\u0001\u0000\u0000\u0000.\u016e\u0001\u0000"+
		"\u0000\u00000\u018b\u0001\u0000\u0000\u00002\u018d\u0001\u0000\u0000\u0000"+
		"4\u0194\u0001\u0000\u0000\u00006\u019d\u0001\u0000\u0000\u00008\u01ae"+
		"\u0001\u0000\u0000\u0000:\u01bf\u0001\u0000\u0000\u0000<\u01c1\u0001\u0000"+
		"\u0000\u0000>\u01cf\u0001\u0000\u0000\u0000@\u01e5\u0001\u0000\u0000\u0000"+
		"B\u01fd\u0001\u0000\u0000\u0000D\u01ff\u0001\u0000\u0000\u0000F\u021b"+
		"\u0001\u0000\u0000\u0000H\u0226\u0001\u0000\u0000\u0000J\u0228\u0001\u0000"+
		"\u0000\u0000L\u0233\u0001\u0000\u0000\u0000N\u0235\u0001\u0000\u0000\u0000"+
		"P\u0257\u0001\u0000\u0000\u0000R\u025e\u0001\u0000\u0000\u0000T\u0260"+
		"\u0001\u0000\u0000\u0000V\u0266\u0001\u0000\u0000\u0000X\u026e\u0001\u0000"+
		"\u0000\u0000Z\u0276\u0001\u0000\u0000\u0000\\\u028b\u0001\u0000\u0000"+
		"\u0000^\u028d\u0001\u0000\u0000\u0000`d\u0003\u0004\u0002\u0000ad\u0003"+
		"\u000e\u0007\u0000bd\u0005=\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hl\u0003\u0002\u0001\u0000ik\u0005=\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0001\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u0005\u0002\u0000\u0000pq\u0005\u0001\u0000"+
		"\u0000qr\u0006\u0001\uffff\uffff\u0000rs\u0005\u0017\u0000\u0000st\u0005"+
		"\u0018\u0000\u0000tu\u0003\b\u0004\u0000uv\u0005\u0004\u0000\u0000v\u0003"+
		"\u0001\u0000\u0000\u0000wx\u0005\u0002\u0000\u0000xy\u0005<\u0000\u0000"+
		"yz\u0006\u0002\uffff\uffff\u0000z|\u0005\u0017\u0000\u0000{}\u0003\u0006"+
		"\u0003\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u0018\u0000\u0000\u007f\u0080\u0003\b"+
		"\u0004\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0005\u0001\u0000"+
		"\u0000\u0000\u0082\u0089\u0003X,\u0000\u0083\u0084\u0003X,\u0000\u0084"+
		"\u0085\u00053\u0000\u0000\u0085\u0086\u0003Z-\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003Z-\u0000\u0088\u0082\u0001\u0000\u0000"+
		"\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u0007\u0001\u0000\u0000\u0000\u008a\u008d\u0003\n\u0005\u0000"+
		"\u008b\u008d\u0005=\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0096\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u0003\u0000\u0000\u0092\u0094\u0006\u0004\uffff\uffff\u0000"+
		"\u0093\u0095\u0003\n\u0005\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0091\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\t\u0001\u0000\u0000\u0000\u0098\u0099\u00030\u0018\u0000\u0099\u009a"+
		"\u00056\u0000\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u009e\u0003"+
		"\u001e\u000f\u0000\u009c\u009e\u0003\"\u0011\u0000\u009d\u0098\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u000b\u0001\u0000\u0000\u0000\u009f\u00a6\u0003\u0010"+
		"\b\u0000\u00a0\u00a6\u0003\u0012\t\u0000\u00a1\u00a6\u0003\u0014\n\u0000"+
		"\u00a2\u00a6\u0003\u0016\u000b\u0000\u00a3\u00a6\u0003\u0018\f\u0000\u00a4"+
		"\u00a6\u0003\u001a\r\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\r\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u000e\u0000\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9\u00aa\u0006\u0007"+
		"\uffff\uffff\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u00b0\u0005"+
		"<\u0000\u0000\u00ac\u00ad\u00053\u0000\u0000\u00ad\u00af\u0005<\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00bb\u0005\u0018\u0000\u0000\u00b4\u00b5\u00057\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b7\u00030\u0018\u0000\u00b7"+
		"\u00b8\u0005\u0018\u0000\u0000\u00b8\u00b9\u0005.\u0000\u0000\u00b9\u00ba"+
		"\u00030\u0018\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b4\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u00056\u0000\u0000\u00c0\u000f\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c3\u0006\b\uffff"+
		"\uffff\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u00c5\u00030\u0018"+
		"\u0000\u00c5\u00c6\u0005\u0018\u0000\u0000\u00c6\u0011\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\r\u0000\u0000\u00c8\u00c9\u0006\t\uffff\uffff"+
		"\u0000\u00c9\u00d0\u0005\u0017\u0000\u0000\u00ca\u00cb\u0003^/\u0000\u00cb"+
		"\u00cc\u00051\u0000\u0000\u00cc\u00cd\u00058\u0000\u0000\u00cd\u00ce\u0005"+
		"2\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00d1\u00030\u0018"+
		"\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0018\u0000"+
		"\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000"+
		"\u00d5\u00d6\u0006\n\uffff\uffff\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000"+
		"\u00d7\u00d8\u00030\u0018\u0000\u00d8\u00d9\u00053\u0000\u0000\u00d9\u00da"+
		"\u00030\u0018\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0018\u0000\u0000\u00dc\u0015\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u000f\u0000\u0000\u00de\u00df\u0006\u000b\uffff\uffff\u0000\u00df\u00e0"+
		"\u0005\u0017\u0000\u0000\u00e0\u00e1\u00030\u0018\u0000\u00e1\u00e2\u0005"+
		"\u0018\u0000\u0000\u00e2\u0017\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"\b\u0000\u0000\u00e4\u00e5\u0006\f\uffff\uffff\u0000\u00e5\u00e6\u0005"+
		"\u0017\u0000\u0000\u00e6\u00e7\u00030\u0018\u0000\u00e7\u00e8\u0005\u0018"+
		"\u0000\u0000\u00e8\u0019\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\t\u0000"+
		"\u0000\u00ea\u00eb\u0006\r\uffff\uffff\u0000\u00eb\u00ec\u0005\u0017\u0000"+
		"\u0000\u00ec\u00ed\u00030\u0018\u0000\u00ed\u00ee\u0005\u0018\u0000\u0000"+
		"\u00ee\u001b\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005<\u0000\u0000\u00f0"+
		"\u00f1\u0006\u000e\uffff\uffff\u0000\u00f1\u00fa\u0005\u0017\u0000\u0000"+
		"\u00f2\u00f7\u00030\u0018\u0000\u00f3\u00f4\u00053\u0000\u0000\u00f4\u00f6"+
		"\u00030\u0018\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0018\u0000\u0000\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0012\u0000\u0000\u00ff\u0100\u0006\u000f\uffff\uffff\u0000\u0100\u0106"+
		"\u0005\u0013\u0000\u0000\u0101\u0105\u0003\n\u0005\u0000\u0102\u0105\u0003"+
		" \u0010\u0000\u0103\u0105\u0005=\u0000\u0000\u0104\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0122\u0005\u0004\u0000"+
		"\u0000\u010a\u010b\u0005\u0014\u0000\u0000\u010b\u010c\u0006\u000f\uffff"+
		"\uffff\u0000\u010c\u010d\u0005<\u0000\u0000\u010d\u0116\u0005\u0015\u0000"+
		"\u0000\u010e\u010f\u0005\u0017\u0000\u0000\u010f\u0110\u0007\u0000\u0000"+
		"\u0000\u0110\u0111\u00054\u0000\u0000\u0111\u0112\u00054\u0000\u0000\u0112"+
		"\u0113\u0007\u0000\u0000\u0000\u0113\u0117\u0005\u0018\u0000\u0000\u0114"+
		"\u0117\u0005<\u0000\u0000\u0115\u0117\u0003^/\u0000\u0116\u010e\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u011d\u0001\u0000\u0000\u0000\u0118\u011c\u0003"+
		"\n\u0005\u0000\u0119\u011c\u0003 \u0010\u0000\u011a\u011c\u0005=\u0000"+
		"\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0122\u0005\u0004\u0000\u0000\u0121\u00fe\u0001\u0000\u0000"+
		"\u0000\u0121\u010a\u0001\u0000\u0000\u0000\u0122\u001f\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0010\u0000\u0000\u0124\u012d\u0006\u0010\uffff"+
		"\uffff\u0000\u0125\u0126\u0005\u0010\u0000\u0000\u0126\u0127\u0006\u0010"+
		"\uffff\uffff\u0000\u0127\u0128\u0005\u0005\u0000\u0000\u0128\u0129\u0005"+
		"\u0017\u0000\u0000\u0129\u012a\u00030\u0018\u0000\u012a\u012b\u0005\u0018"+
		"\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0123\u0001\u0000"+
		"\u0000\u0000\u012c\u0125\u0001\u0000\u0000\u0000\u012d\u013a\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005\u0011\u0000\u0000\u012f\u0138\u0006\u0010"+
		"\uffff\uffff\u0000\u0130\u0131\u0005\u0011\u0000\u0000\u0131\u0132\u0006"+
		"\u0010\uffff\uffff\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133\u0134"+
		"\u0005\u0017\u0000\u0000\u0134\u0135\u00030\u0018\u0000\u0135\u0136\u0005"+
		"\u0018\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u012e\u0001"+
		"\u0000\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0138\u013a\u0001"+
		"\u0000\u0000\u0000\u0139\u012c\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"6\u0000\u0000\u013c!\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0005\u0000"+
		"\u0000\u013e\u013f\u0006\u0011\uffff\uffff\u0000\u013f\u0140\u0003$\u0012"+
		"\u0000\u0140\u0141\u0003&\u0013\u0000\u0141\u0142\u0003(\u0014\u0000\u0142"+
		"\u0143\u0003*\u0015\u0000\u0143\u0144\u0005\u0004\u0000\u0000\u0144#\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005\u0017\u0000\u0000\u0146\u0147\u0003"+
		"0\u0018\u0000\u0147\u014c\u0005\u0018\u0000\u0000\u0148\u0149\u0007\u0001"+
		"\u0000\u0000\u0149\u014b\u0003$\u0012\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d%\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0003,\u0016\u0000\u0150"+
		"\'\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0007\u0000\u0000\u0152\u0153"+
		"\u0003$\u0012\u0000\u0153\u0154\u0006\u0014\uffff\uffff\u0000\u0154\u0155"+
		"\u0003,\u0016\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0151\u0001"+
		"\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159)\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0006"+
		"\u0000\u0000\u015c\u015d\u0006\u0015\uffff\uffff\u0000\u015d\u015f\u0003"+
		",\u0016\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f+\u0001\u0000\u0000\u0000\u0160\u016a\u0003\n\u0005"+
		"\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162\u0164\u0006\u0016\uffff"+
		"\uffff\u0000\u0163\u0165\u00030\u0018\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u016a\u00056\u0000\u0000\u0167\u016a\u0003 \u0010\u0000\u0168"+
		"\u016a\u0005=\u0000\u0000\u0169\u0160\u0001\u0000\u0000\u0000\u0169\u0161"+
		"\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c-\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0016\u0000\u0000\u016f\u0170\u0006\u0017\uffff\uffff\u0000\u0170\u0179"+
		"\u0005\u0017\u0000\u0000\u0171\u0176\u0005<\u0000\u0000\u0172\u0173\u0005"+
		"3\u0000\u0000\u0173\u0175\u0005<\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u0171\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005\u0018\u0000\u0000\u017c\u017d\u0005/\u0000\u0000"+
		"\u017d\u017e\u0003\b\u0004\u0000\u017e\u0189\u00050\u0000\u0000\u017f"+
		"\u0180\u0005\u0017\u0000\u0000\u0180\u0185\u0005<\u0000\u0000\u0181\u0182"+
		"\u00053\u0000\u0000\u0182\u0184\u0005<\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018a\u0005\u0018"+
		"\u0000\u0000\u0189\u017f\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a/\u0001\u0000\u0000\u0000\u018b\u018c\u00032\u0019\u0000"+
		"\u018c1\u0001\u0000\u0000\u0000\u018d\u0192\u00034\u001a\u0000\u018e\u018f"+
		"\u0005.\u0000\u0000\u018f\u0190\u00032\u0019\u0000\u0190\u0191\u0006\u0019"+
		"\uffff\uffff\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018e\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u01933\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u00038\u001c\u0000\u0195\u0196\u00036\u001b\u0000"+
		"\u01965\u0001\u0000\u0000\u0000\u0197\u0198\u0005-\u0000\u0000\u0198\u0199"+
		"\u00038\u001c\u0000\u0199\u019a\u0006\u001b\uffff\uffff\u0000\u019a\u019b"+
		"\u00036\u001b\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019e\u0001"+
		"\u0000\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019e7\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0017"+
		"\u0000\u0000\u01a0\u01a1\u0003:\u001d\u0000\u01a1\u01aa\u0005\u0018\u0000"+
		"\u0000\u01a2\u01a3\u0005,\u0000\u0000\u01a3\u01a4\u0005\u0017\u0000\u0000"+
		"\u01a4\u01a5\u0003:\u001d\u0000\u01a5\u01a6\u0005\u0018\u0000\u0000\u01a6"+
		"\u01a7\u0006\u001c\uffff\uffff\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a2\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01af\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ad\u01af\u0003:\u001d\u0000\u01ae\u019f\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af9\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005\u0017\u0000\u0000\u01b1\u01b2\u0003<\u001e\u0000\u01b2\u01bb\u0005"+
		"\u0018\u0000\u0000\u01b3\u01b4\u0005+\u0000\u0000\u01b4\u01b5\u0005\u0017"+
		"\u0000\u0000\u01b5\u01b6\u0003:\u001d\u0000\u01b6\u01b7\u0005\u0018\u0000"+
		"\u0000\u01b7\u01b8\u0006\u001d\uffff\uffff\u0000\u01b8\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b3\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01c0\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000"+
		"\u0000\u0000\u01be\u01c0\u0003<\u001e\u0000\u01bf\u01b0\u0001\u0000\u0000"+
		"\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0;\u0001\u0000\u0000\u0000"+
		"\u01c1\u01cc\u0003>\u001f\u0000\u01c2\u01c3\u0005$\u0000\u0000\u01c3\u01c4"+
		"\u0003>\u001f\u0000\u01c4\u01c5\u0006\u001e\uffff\uffff\u0000\u01c5\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005%\u0000\u0000\u01c7\u01c8\u0003"+
		">\u001f\u0000\u01c8\u01c9\u0006\u001e\uffff\uffff\u0000\u01c9\u01cb\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001"+
		"\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd=\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01e2\u0003@ \u0000"+
		"\u01d0\u01d1\u0005#\u0000\u0000\u01d1\u01d2\u0003@ \u0000\u01d2\u01d3"+
		"\u0006\u001f\uffff\uffff\u0000\u01d3\u01e1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0005\"\u0000\u0000\u01d5\u01d6\u0003@ \u0000\u01d6\u01d7\u0006"+
		"\u001f\uffff\uffff\u0000\u01d7\u01e1\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005 \u0000\u0000\u01d9\u01da\u0003@ \u0000\u01da\u01db\u0006\u001f"+
		"\uffff\uffff\u0000\u01db\u01e1\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005"+
		"!\u0000\u0000\u01dd\u01de\u0003@ \u0000\u01de\u01df\u0006\u001f\uffff"+
		"\uffff\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01d0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01d4\u0001\u0000\u0000\u0000\u01e0\u01d8\u0001\u0000"+
		"\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3?\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0003D\"\u0000\u01e6\u01e7\u0003B!\u0000\u01e7A\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0005\u001a\u0000\u0000\u01e9\u01ea\u0003"+
		"D\"\u0000\u01ea\u01eb\u0006!\uffff\uffff\u0000\u01eb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005\u001b\u0000\u0000\u01ed\u01ee\u0003D\""+
		"\u0000\u01ee\u01ef\u0006!\uffff\uffff\u0000\u01ef\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0005&\u0000\u0000\u01f1\u01f2\u0003D\"\u0000\u01f2"+
		"\u01f3\u0006!\uffff\uffff\u0000\u01f3\u01f9\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0005\'\u0000\u0000\u01f5\u01f6\u0003D\"\u0000\u01f6\u01f7\u0006"+
		"!\uffff\uffff\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01e8\u0001"+
		"\u0000\u0000\u0000\u01f8\u01ec\u0001\u0000\u0000\u0000\u01f8\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0003B!\u0000\u01fb\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01feC\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0003H$\u0000\u0200\u0201\u0003F#\u0000\u0201E\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0005\u001e\u0000\u0000\u0203\u0204\u0003H$\u0000"+
		"\u0204\u0205\u0006#\uffff\uffff\u0000\u0205\u0217\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0005\u001f\u0000\u0000\u0207\u0208\u0003H$\u0000\u0208\u0209"+
		"\u0006#\uffff\uffff\u0000\u0209\u0217\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0005(\u0000\u0000\u020b\u020c\u0003H$\u0000\u020c\u020d\u0006#\uffff"+
		"\uffff\u0000\u020d\u0217\u0001\u0000\u0000\u0000\u020e\u020f\u0005)\u0000"+
		"\u0000\u020f\u0210\u0003H$\u0000\u0210\u0211\u0006#\uffff\uffff\u0000"+
		"\u0211\u0217\u0001\u0000\u0000\u0000\u0212\u0213\u0005*\u0000\u0000\u0213"+
		"\u0214\u0003D\"\u0000\u0214\u0215\u0006#\uffff\uffff\u0000\u0215\u0217"+
		"\u0001\u0000\u0000\u0000\u0216\u0202\u0001\u0000\u0000\u0000\u0216\u0206"+
		"\u0001\u0000\u0000\u0000\u0216\u020a\u0001\u0000\u0000\u0000\u0216\u020e"+
		"\u0001\u0000\u0000\u0000\u0216\u0212\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0003F#\u0000\u0219\u021c\u0001\u0000"+
		"\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0216\u0001\u0000"+
		"\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021cG\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0005\u0019\u0000\u0000\u021e\u021f\u0003H$\u0000\u021f"+
		"\u0220\u0006$\uffff\uffff\u0000\u0220\u0227\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0005\u001b\u0000\u0000\u0222\u0223\u0003H$\u0000\u0223\u0224\u0006"+
		"$\uffff\uffff\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0227\u0003"+
		"J%\u0000\u0226\u021d\u0001\u0000\u0000\u0000\u0226\u0221\u0001\u0000\u0000"+
		"\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227I\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0003N\'\u0000\u0229\u022a\u0003L&\u0000\u022aK\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005\u001d\u0000\u0000\u022c\u0230\u0006&\uffff"+
		"\uffff\u0000\u022d\u022e\u0005\u001c\u0000\u0000\u022e\u0230\u0006&\uffff"+
		"\uffff\u0000\u022f\u022b\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0234\u0003L&\u0000"+
		"\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u022f\u0001\u0000\u0000\u0000"+
		"\u0233\u0232\u0001\u0000\u0000\u0000\u0234M\u0001\u0000\u0000\u0000\u0235"+
		"\u023c\u0003P(\u0000\u0236\u0237\u00051\u0000\u0000\u0237\u0238\u0003"+
		"0\u0018\u0000\u0238\u0239\u00052\u0000\u0000\u0239\u023b\u0001\u0000\u0000"+
		"\u0000\u023a\u0236\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023dO\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023f\u0258\u0003\\.\u0000\u0240\u024f\u0003R)\u0000\u0241\u024a\u0005"+
		"\u0017\u0000\u0000\u0242\u0247\u00030\u0018\u0000\u0243\u0244\u00053\u0000"+
		"\u0000\u0244\u0246\u00030\u0018\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000"+
		"\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u0242\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000"+
		"\u024c\u024e\u0005\u0018\u0000\u0000\u024d\u0241\u0001\u0000\u0000\u0000"+
		"\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0258\u0001\u0000\u0000\u0000"+
		"\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0254\u0005\u0017\u0000\u0000"+
		"\u0253\u0255\u00030\u0018\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0005\u0018\u0000\u0000\u0257\u023f\u0001\u0000\u0000\u0000\u0257"+
		"\u0240\u0001\u0000\u0000\u0000\u0257\u0252\u0001\u0000\u0000\u0000\u0258"+
		"Q\u0001\u0000\u0000\u0000\u0259\u025f\u0003\f\u0006\u0000\u025a\u025f"+
		"\u0003\u001c\u000e\u0000\u025b\u025f\u0003T*\u0000\u025c\u025f\u0003V"+
		"+\u0000\u025d\u025f\u0003.\u0017\u0000\u025e\u0259\u0001\u0000\u0000\u0000"+
		"\u025e\u025a\u0001\u0000\u0000\u0000\u025e\u025b\u0001\u0000\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000"+
		"\u025fS\u0001\u0000\u0000\u0000\u0260\u0261\u0005\f\u0000\u0000\u0261"+
		"\u0262\u0005\u0017\u0000\u0000\u0262\u0263\u00055\u0000\u0000\u0263\u0264"+
		"\u0005<\u0000\u0000\u0264\u0265\u0005\u0018\u0000\u0000\u0265U\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0005<\u0000\u0000\u0267\u0268\u00054\u0000\u0000"+
		"\u0268\u0269\u0005\u000f\u0000\u0000\u0269\u026a\u0005\u0017\u0000\u0000"+
		"\u026a\u026b\u00030\u0018\u0000\u026b\u026c\u0005\u0018\u0000\u0000\u026c"+
		"\u026d\u0006+\uffff\uffff\u0000\u026dW\u0001\u0000\u0000\u0000\u026e\u0273"+
		"\u0005<\u0000\u0000\u026f\u0270\u00053\u0000\u0000\u0270\u0272\u0005<"+
		"\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000"+
		"\u0000\u0000\u0274Y\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u00051\u0000\u0000\u0277\u0278\u0005<\u0000\u0000\u0278"+
		"\u0279\u0005.\u0000\u0000\u0279\u0280\u00030\u0018\u0000\u027a\u027b\u0005"+
		"3\u0000\u0000\u027b\u027c\u0005<\u0000\u0000\u027c\u027d\u0005.\u0000"+
		"\u0000\u027d\u027f\u00030\u0018\u0000\u027e\u027a\u0001\u0000\u0000\u0000"+
		"\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0284\u00052\u0000\u0000\u0284"+
		"[\u0001\u0000\u0000\u0000\u0285\u028c\u00058\u0000\u0000\u0286\u028c\u0005"+
		"9\u0000\u0000\u0287\u028c\u0005:\u0000\u0000\u0288\u028c\u0005;\u0000"+
		"\u0000\u0289\u028c\u0003^/\u0000\u028a\u028c\u0005<\u0000\u0000\u028b"+
		"\u0285\u0001\u0000\u0000\u0000\u028b\u0286\u0001\u0000\u0000\u0000\u028b"+
		"\u0287\u0001\u0000\u0000\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028b"+
		"\u0289\u0001\u0000\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c"+
		"]\u0001\u0000\u0000\u0000\u028d\u0296\u00051\u0000\u0000\u028e\u0293\u0003"+
		"0\u0018\u0000\u028f\u0290\u00053\u0000\u0000\u0290\u0292\u00030\u0018"+
		"\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000"+
		"\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000"+
		"\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000"+
		"\u0000\u0296\u028e\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u00052\u0000\u0000"+
		"\u0299_\u0001\u0000\u0000\u0000@cel|\u0088\u008c\u008e\u0094\u0096\u009d"+
		"\u00a5\u00b0\u00bd\u00d0\u00f7\u00fa\u0104\u0106\u0116\u011b\u011d\u0121"+
		"\u012c\u0137\u0139\u014c\u0158\u015e\u0164\u0169\u016b\u0176\u0179\u0185"+
		"\u0189\u0192\u019d\u01aa\u01ae\u01bb\u01bf\u01ca\u01cc\u01e0\u01e2\u01f8"+
		"\u01fd\u0216\u021b\u0226\u022f\u0233\u023c\u0247\u024a\u024f\u0254\u0257"+
		"\u025e\u0273\u0280\u028b\u0293\u0296";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}