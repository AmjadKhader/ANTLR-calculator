// Generated from /Users/amjad/IdeaProjects/ANTLR-demo/src/main/java/antlr/CalculatorParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, ONE=2, TWO=3, THREE=4, FOUR=5, FIVE=6, SIX=7, SEVEN=8, EIGHT=9, 
		NINE=10, PLUS=11, MINUS=12, MULTIPLY=13, DIVIDE=14, DOT=15, WHITESPACE=16;
	public static final int
		RULE_calculator = 0, RULE_first_number = 1, RULE_second_number = 2, RULE_number_rule = 3, 
		RULE_number1 = 4, RULE_number2 = 5, RULE_process = 6, RULE_num = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculator", "first_number", "second_number", "number_rule", "number1", 
			"number2", "process", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", 
			"EIGHT", "NINE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "DOT", "WHITESPACE"
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
	public String getGrammarFileName() { return "CalculatorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculatorContext extends ParserRuleContext {
		public CalculatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculator; }
	 
		public CalculatorContext() { }
		public void copyFrom(CalculatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Main_ruleContext extends CalculatorContext {
		public First_numberContext first_number() {
			return getRuleContext(First_numberContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public Second_numberContext second_number() {
			return getRuleContext(Second_numberContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculatorParserParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParserParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParserParser.WHITESPACE, i);
		}
		public Main_ruleContext(CalculatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterMain_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitMain_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitMain_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculatorContext calculator() throws RecognitionException {
		CalculatorContext _localctx = new CalculatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculator);
		int _la;
		try {
			_localctx = new Main_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			first_number();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(17);
				match(WHITESPACE);
				}
			}

			setState(20);
			process();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(21);
				match(WHITESPACE);
				}
			}

			setState(24);
			second_number();
			setState(25);
			match(EOF);
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

	public static class First_numberContext extends ParserRuleContext {
		public Number_ruleContext number_rule() {
			return getRuleContext(Number_ruleContext.class,0);
		}
		public First_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterFirst_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitFirst_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitFirst_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_numberContext first_number() throws RecognitionException {
		First_numberContext _localctx = new First_numberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_first_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			number_rule();
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

	public static class Second_numberContext extends ParserRuleContext {
		public Number_ruleContext number_rule() {
			return getRuleContext(Number_ruleContext.class,0);
		}
		public Second_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterSecond_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitSecond_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitSecond_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_numberContext second_number() throws RecognitionException {
		Second_numberContext _localctx = new Second_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_second_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			number_rule();
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

	public static class Number_ruleContext extends ParserRuleContext {
		public Number1Context number1() {
			return getRuleContext(Number1Context.class,0);
		}
		public TerminalNode DOT() { return getToken(CalculatorParserParser.DOT, 0); }
		public Number2Context number2() {
			return getRuleContext(Number2Context.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParserParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParserParser.WHITESPACE, i);
		}
		public Number_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterNumber_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitNumber_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitNumber_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_ruleContext number_rule() throws RecognitionException {
		Number_ruleContext _localctx = new Number_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number_rule);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				number1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				number1();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(33);
					match(WHITESPACE);
					}
				}

				setState(36);
				match(DOT);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(37);
					match(WHITESPACE);
					}
				}

				setState(40);
				number2();
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

	public static class Number1Context extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Number1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterNumber1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitNumber1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitNumber1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number1Context number1() throws RecognitionException {
		Number1Context _localctx = new Number1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_number1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			num();
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

	public static class Number2Context extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Number2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterNumber2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitNumber2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitNumber2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number2Context number2() throws RecognitionException {
		Number2Context _localctx = new Number2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_number2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			num();
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CalculatorParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParserParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(CalculatorParserParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(CalculatorParserParser.DIVIDE, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(CalculatorParserParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(CalculatorParserParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(CalculatorParserParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(CalculatorParserParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(CalculatorParserParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(CalculatorParserParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(CalculatorParserParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(CalculatorParserParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(CalculatorParserParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(CalculatorParserParser.NINE, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u00105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0017\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003#\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000"+
		"\u000b\u000e\u0001\u0000\u0001\n1\u0000\u0010\u0001\u0000\u0000\u0000"+
		"\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000"+
		"\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n.\u0001\u0000"+
		"\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e2\u0001\u0000\u0000\u0000"+
		"\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0013\u0005\u0010\u0000\u0000"+
		"\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0003\f\u0006\u0000\u0015"+
		"\u0017\u0005\u0010\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a"+
		"\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c"+
		"\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e"+
		"\u0005\u0001\u0000\u0000\u0000\u001f+\u0003\b\u0004\u0000 \"\u0003\b\u0004"+
		"\u0000!#\u0005\u0010\u0000\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0005\u000f\u0000\u0000%\'\u0005"+
		"\u0010\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000()\u0003\n\u0005\u0000)+\u0001\u0000\u0000"+
		"\u0000*\u001f\u0001\u0000\u0000\u0000* \u0001\u0000\u0000\u0000+\u0007"+
		"\u0001\u0000\u0000\u0000,-\u0003\u000e\u0007\u0000-\t\u0001\u0000\u0000"+
		"\u0000./\u0003\u000e\u0007\u0000/\u000b\u0001\u0000\u0000\u000001\u0007"+
		"\u0000\u0000\u00001\r\u0001\u0000\u0000\u000023\u0007\u0001\u0000\u0000"+
		"3\u000f\u0001\u0000\u0000\u0000\u0005\u0012\u0016\"&*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}