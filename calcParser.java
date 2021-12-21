// Generated from .\calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FuncType=17, 
		Ident=18, Orfunc=19, Andfunc=20, Comfunc=21, Judgefunc=22, Idigit=23, 
		Nondigit=24, Addfunc=25, Mulfunc=26, Number=27, Decimalconst=28, Octalconst=29, 
		Hexadecimalconst=30, Hexadecimalprefix=31, Nonzerodigit=32, Octaldigit=33, 
		Digit=34, Hexadecimaldigit=35, WHITE_SPACE=36;
	public static final int
		RULE_compUnit = 0, RULE_funcDef = 1, RULE_decl = 2, RULE_constDecl = 3, 
		RULE_constDef = 4, RULE_constInitVal = 5, RULE_constExp = 6, RULE_varDecl = 7, 
		RULE_varDef = 8, RULE_initVal = 9, RULE_block = 10, RULE_blockItem = 11, 
		RULE_stmt = 12, RULE_cond = 13, RULE_lorexp = 14, RULE_landexp = 15, RULE_eqexp = 16, 
		RULE_relexp = 17, RULE_exp = 18, RULE_lval = 19, RULE_primaryexp = 20, 
		RULE_addexp = 21, RULE_mulexp = 22, RULE_unaryexp = 23, RULE_funcrParams = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "funcDef", "decl", "constDecl", "constDef", "constInitVal", 
			"constExp", "varDecl", "varDef", "initVal", "block", "blockItem", "stmt", 
			"cond", "lorexp", "landexp", "eqexp", "relexp", "exp", "lval", "primaryexp", 
			"addexp", "mulexp", "unaryexp", "funcrParams"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'const'", "','", "';'", "'['", "']'", "'='", "'{'", 
			"'}'", "'if'", "'else'", "'while'", "'break'", "'continue'", "'return'", 
			"'int'", "'main'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "FuncType", "Ident", "Orfunc", "Andfunc", 
			"Comfunc", "Judgefunc", "Idigit", "Nondigit", "Addfunc", "Mulfunc", "Number", 
			"Decimalconst", "Octalconst", "Hexadecimalconst", "Hexadecimalprefix", 
			"Nonzerodigit", "Octaldigit", "Digit", "Hexadecimaldigit", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					decl();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(56);
			funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode FuncType() { return getToken(calcParser.FuncType, 0); }
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FuncType);
			setState(59);
			match(Ident);
			setState(60);
			match(T__0);
			setState(61);
			match(T__1);
			setState(62);
			block();
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

	public static class DeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				constDecl();
				}
				break;
			case FuncType:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode FuncType() { return getToken(calcParser.FuncType, 0); }
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			match(FuncType);
			setState(70);
			constDef();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(71);
				match(T__3);
				setState(72);
				constDef();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__4);
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

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Idigit() { return getToken(calcParser.Idigit, 0); }
		public ConstInitValContext constInitVal() {
			return getRuleContext(ConstInitValContext.class,0);
		}
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Idigit);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(81);
				match(T__5);
				setState(82);
				constExp();
				setState(83);
				match(T__6);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__7);
			setState(91);
			constInitVal();
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

	public static class ConstInitValContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public List<ConstInitValContext> constInitVal() {
			return getRuleContexts(ConstInitValContext.class);
		}
		public ConstInitValContext constInitVal(int i) {
			return getRuleContext(ConstInitValContext.class,i);
		}
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitConstInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constInitVal);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Idigit:
			case Addfunc:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				constExp();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__8);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << Idigit) | (1L << Addfunc) | (1L << Number))) != 0)) {
					{
					setState(95);
					constInitVal();
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(96);
						match(T__3);
						setState(97);
						constInitVal();
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105);
				match(T__9);
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

	public static class ConstExpContext extends ParserRuleContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			addexp(0);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode FuncType() { return getToken(calcParser.FuncType, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FuncType);
			setState(111);
			varDef();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(112);
				match(T__3);
				setState(113);
				varDef();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__4);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode Idigit() { return getToken(calcParser.Idigit, 0); }
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDef);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Idigit);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(122);
					match(T__5);
					setState(123);
					constExp();
					setState(124);
					match(T__6);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Idigit);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(132);
					match(T__5);
					setState(133);
					constExp();
					setState(134);
					match(T__6);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__7);
				setState(142);
				initVal();
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

	public static class InitValContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<InitValContext> initVal() {
			return getRuleContexts(InitValContext.class);
		}
		public InitValContext initVal(int i) {
			return getRuleContext(InitValContext.class,i);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initVal);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Idigit:
			case Addfunc:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				exp();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__8);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << Idigit) | (1L << Addfunc) | (1L << Number))) != 0)) {
					{
					setState(147);
					initVal();
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(148);
						match(T__3);
						setState(149);
						initVal();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(T__9);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__8);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << FuncType) | (1L << Idigit) | (1L << Addfunc) | (1L << Number))) != 0)) {
				{
				{
				setState(161);
				blockItem();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(T__9);
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

	public static class BlockItemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockItem);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case FuncType:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				decl();
				}
				break;
			case T__0:
			case T__4:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case Idigit:
			case Addfunc:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				lval();
				setState(174);
				match(T__7);
				setState(175);
				exp();
				setState(176);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Idigit) | (1L << Addfunc) | (1L << Number))) != 0)) {
					{
					setState(179);
					exp();
					}
				}

				setState(182);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__10);
				setState(184);
				match(T__0);
				setState(185);
				cond();
				setState(186);
				match(T__1);
				setState(187);
				stmt();
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(188);
					match(T__11);
					setState(189);
					stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(T__12);
				setState(193);
				match(T__0);
				setState(194);
				cond();
				setState(195);
				match(T__1);
				setState(196);
				stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(T__13);
				setState(199);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(T__14);
				setState(201);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				match(T__15);
				setState(203);
				exp();
				setState(204);
				match(T__4);
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

	public static class CondContext extends ParserRuleContext {
		public LorexpContext lorexp() {
			return getRuleContext(LorexpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			lorexp(0);
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

	public static class LorexpContext extends ParserRuleContext {
		public LandexpContext landexp() {
			return getRuleContext(LandexpContext.class,0);
		}
		public LorexpContext lorexp() {
			return getRuleContext(LorexpContext.class,0);
		}
		public TerminalNode Orfunc() { return getToken(calcParser.Orfunc, 0); }
		public LorexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lorexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitLorexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LorexpContext lorexp() throws RecognitionException {
		return lorexp(0);
	}

	private LorexpContext lorexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LorexpContext _localctx = new LorexpContext(_ctx, _parentState);
		LorexpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lorexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			landexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LorexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lorexp);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(Orfunc);
					setState(215);
					landexp(0);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class LandexpContext extends ParserRuleContext {
		public EqexpContext eqexp() {
			return getRuleContext(EqexpContext.class,0);
		}
		public LandexpContext landexp() {
			return getRuleContext(LandexpContext.class,0);
		}
		public TerminalNode Andfunc() { return getToken(calcParser.Andfunc, 0); }
		public LandexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitLandexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LandexpContext landexp() throws RecognitionException {
		return landexp(0);
	}

	private LandexpContext landexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LandexpContext _localctx = new LandexpContext(_ctx, _parentState);
		LandexpContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_landexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			eqexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LandexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_landexp);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(Andfunc);
					setState(226);
					eqexp(0);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class EqexpContext extends ParserRuleContext {
		public RelexpContext relexp() {
			return getRuleContext(RelexpContext.class,0);
		}
		public EqexpContext eqexp() {
			return getRuleContext(EqexpContext.class,0);
		}
		public TerminalNode Judgefunc() { return getToken(calcParser.Judgefunc, 0); }
		public EqexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitEqexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqexpContext eqexp() throws RecognitionException {
		return eqexp(0);
	}

	private EqexpContext eqexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqexpContext _localctx = new EqexpContext(_ctx, _parentState);
		EqexpContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_eqexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			relexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqexp);
					setState(235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(236);
					match(Judgefunc);
					setState(237);
					relexp(0);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class RelexpContext extends ParserRuleContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public RelexpContext relexp() {
			return getRuleContext(RelexpContext.class,0);
		}
		public TerminalNode Comfunc() { return getToken(calcParser.Comfunc, 0); }
		public RelexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitRelexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelexpContext relexp() throws RecognitionException {
		return relexp(0);
	}

	private RelexpContext relexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelexpContext _localctx = new RelexpContext(_ctx, _parentState);
		RelexpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			addexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relexp);
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(Comfunc);
					setState(248);
					addexp(0);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			addexp(0);
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

	public static class LvalContext extends ParserRuleContext {
		public TerminalNode Idigit() { return getToken(calcParser.Idigit, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitLval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalContext lval() throws RecognitionException {
		LvalContext _localctx = new LvalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Idigit);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					match(T__5);
					setState(258);
					exp();
					setState(259);
					match(T__6);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PrimaryexpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public TerminalNode Number() { return getToken(calcParser.Number, 0); }
		public PrimaryexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitPrimaryexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryexpContext primaryexp() throws RecognitionException {
		PrimaryexpContext _localctx = new PrimaryexpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primaryexp);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__0);
				setState(267);
				exp();
				setState(268);
				match(T__1);
				}
				break;
			case Idigit:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				lval();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(Number);
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

	public static class AddexpContext extends ParserRuleContext {
		public MulexpContext mulexp() {
			return getRuleContext(MulexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public TerminalNode Addfunc() { return getToken(calcParser.Addfunc, 0); }
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitAddexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexpContext addexp() throws RecognitionException {
		return addexp(0);
	}

	private AddexpContext addexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddexpContext _localctx = new AddexpContext(_ctx, _parentState);
		AddexpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_addexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			mulexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(277);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(278);
					match(Addfunc);
					setState(279);
					mulexp(0);
					}
					} 
				}
				setState(284);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulexpContext extends ParserRuleContext {
		public UnaryexpContext unaryexp() {
			return getRuleContext(UnaryexpContext.class,0);
		}
		public MulexpContext mulexp() {
			return getRuleContext(MulexpContext.class,0);
		}
		public TerminalNode Mulfunc() { return getToken(calcParser.Mulfunc, 0); }
		public MulexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitMulexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulexpContext mulexp() throws RecognitionException {
		return mulexp(0);
	}

	private MulexpContext mulexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulexpContext _localctx = new MulexpContext(_ctx, _parentState);
		MulexpContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_mulexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			unaryexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulexp);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(289);
					match(Mulfunc);
					setState(290);
					unaryexp();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class UnaryexpContext extends ParserRuleContext {
		public PrimaryexpContext primaryexp() {
			return getRuleContext(PrimaryexpContext.class,0);
		}
		public TerminalNode Idigit() { return getToken(calcParser.Idigit, 0); }
		public FuncrParamsContext funcrParams() {
			return getRuleContext(FuncrParamsContext.class,0);
		}
		public TerminalNode Addfunc() { return getToken(calcParser.Addfunc, 0); }
		public UnaryexpContext unaryexp() {
			return getRuleContext(UnaryexpContext.class,0);
		}
		public UnaryexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitUnaryexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpContext unaryexp() throws RecognitionException {
		UnaryexpContext _localctx = new UnaryexpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryexp);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				primaryexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(Idigit);
				setState(298);
				match(T__0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Idigit) | (1L << Addfunc) | (1L << Number))) != 0)) {
					{
					setState(299);
					funcrParams();
					}
				}

				setState(302);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(Addfunc);
				setState(304);
				unaryexp();
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

	public static class FuncrParamsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncrParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcrParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return (T) ((calcVisitor<? extends T>)visitor).visitFuncrParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncrParamsContext funcrParams() throws RecognitionException {
		FuncrParamsContext _localctx = new FuncrParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcrParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			exp();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(308);
				match(T__3);
				setState(309);
				exp();
				}
				}
				setState(314);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return lorexp_sempred((LorexpContext)_localctx, predIndex);
		case 15:
			return landexp_sempred((LandexpContext)_localctx, predIndex);
		case 16:
			return eqexp_sempred((EqexpContext)_localctx, predIndex);
		case 17:
			return relexp_sempred((RelexpContext)_localctx, predIndex);
		case 21:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 22:
			return mulexp_sempred((MulexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lorexp_sempred(LorexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean landexp_sempred(LandexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqexp_sempred(EqexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relexp_sempred(RelexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addexp_sempred(AddexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulexp_sempred(MulexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\5\7j\n\7\3\7\5\7m\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e"+
		"\13\n\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0099\n\13\f"+
		"\13\16\13\u009c\13\13\5\13\u009e\n\13\3\13\5\13\u00a1\n\13\3\f\3\f\7\f"+
		"\u00a5\n\f\f\f\16\f\u00a8\13\f\3\f\3\f\3\r\3\r\5\r\u00ae\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00db\n\20\f\20\16\20\u00de\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00e6\n\21\f\21\16\21\u00e9\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00f1\n\22\f\22\16\22\u00f4\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00fc\n\23\f\23\16\23\u00ff\13\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0108\n\25\f\25\16\25\u010b\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0113\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u011b"+
		"\n\27\f\27\16\27\u011e\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0126"+
		"\n\30\f\30\16\30\u0129\13\30\3\31\3\31\3\31\3\31\5\31\u012f\n\31\3\31"+
		"\3\31\3\31\5\31\u0134\n\31\3\32\3\32\3\32\7\32\u0139\n\32\f\32\16\32\u013c"+
		"\13\32\3\32\2\b\36 \"$,.\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\2\2\u014a\2\67\3\2\2\2\4<\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2"+
		"\nR\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22\u0091\3\2\2\2\24\u00a0"+
		"\3\2\2\2\26\u00a2\3\2\2\2\30\u00ad\3\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3"+
		"\2\2\2\36\u00d4\3\2\2\2 \u00df\3\2\2\2\"\u00ea\3\2\2\2$\u00f5\3\2\2\2"+
		"&\u0100\3\2\2\2(\u0102\3\2\2\2*\u0112\3\2\2\2,\u0114\3\2\2\2.\u011f\3"+
		"\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\4\3\2;\3"+
		"\3\2\2\2<=\7\23\2\2=>\7\24\2\2>?\7\3\2\2?@\7\4\2\2@A\5\26\f\2A\5\3\2\2"+
		"\2BE\5\b\5\2CE\5\20\t\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\7\5\2\2GH\7\23"+
		"\2\2HM\5\n\6\2IJ\7\6\2\2JL\5\n\6\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\7\2\2Q\t\3\2\2\2RY\7\31\2\2ST\7\b\2\2TU\5"+
		"\16\b\2UV\7\t\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\"+
		"\3\2\2\2[Y\3\2\2\2\\]\7\n\2\2]^\5\f\7\2^\13\3\2\2\2_m\5\16\b\2`i\7\13"+
		"\2\2af\5\f\7\2bc\7\6\2\2ce\5\f\7\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\f\2\2l_\3\2"+
		"\2\2l`\3\2\2\2m\r\3\2\2\2no\5,\27\2o\17\3\2\2\2pq\7\23\2\2qv\5\22\n\2"+
		"rs\7\6\2\2su\5\22\n\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2yz\7\7\2\2z\21\3\2\2\2{\u0082\7\31\2\2|}\7\b\2\2}~\5\16\b"+
		"\2~\177\7\t\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0092\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u008c\7\31\2\2\u0086\u0087\7\b\2\2\u0087\u0088\5\16\b\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\n\2\2\u0090\u0092\5\24\13\2\u0091{\3\2\2"+
		"\2\u0091\u0085\3\2\2\2\u0092\23\3\2\2\2\u0093\u00a1\5&\24\2\u0094\u009d"+
		"\7\13\2\2\u0095\u009a\5\24\13\2\u0096\u0097\7\6\2\2\u0097\u0099\5\24\13"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\f\2\2\u00a0\u0093\3\2"+
		"\2\2\u00a0\u0094\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a6\7\13\2\2\u00a3\u00a5"+
		"\5\30\r\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\27\3\2\2\2\u00ab\u00ae\5\6\4\2\u00ac\u00ae\5\32\16\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\5(\25"+
		"\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7\7\2\2\u00b3\u00d1"+
		"\3\2\2\2\u00b4\u00d1\5\26\f\2\u00b5\u00b7\5&\24\2\u00b6\u00b5\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00d1\7\7\2\2\u00b9\u00ba"+
		"\7\r\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\4\2\2"+
		"\u00bd\u00c0\5\32\16\2\u00be\u00bf\7\16\2\2\u00bf\u00c1\5\32\16\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3\7\17"+
		"\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00c6\7\4\2\2\u00c6"+
		"\u00c7\5\32\16\2\u00c7\u00d1\3\2\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00d1"+
		"\7\7\2\2\u00ca\u00cb\7\21\2\2\u00cb\u00d1\7\7\2\2\u00cc\u00cd\7\22\2\2"+
		"\u00cd\u00ce\5&\24\2\u00ce\u00cf\7\7\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00af"+
		"\3\2\2\2\u00d0\u00b4\3\2\2\2\u00d0\u00b6\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0"+
		"\u00c2\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cc\3\2"+
		"\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\5\36\20\2\u00d3\35\3\2\2\2\u00d4\u00d5"+
		"\b\20\1\2\u00d5\u00d6\5 \21\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\f\3\2\2"+
		"\u00d8\u00d9\7\25\2\2\u00d9\u00db\5 \21\2\u00da\u00d7\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\37\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\b\21\1\2\u00e0\u00e1\5\"\22\2\u00e1\u00e7\3"+
		"\2\2\2\u00e2\u00e3\f\3\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00e6\5\"\22\2\u00e5"+
		"\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8!\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b\22\1\2\u00eb\u00ec"+
		"\5$\23\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\f\3\2\2\u00ee\u00ef\7\30\2\2"+
		"\u00ef\u00f1\5$\23\2\u00f0\u00ed\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\b\23\1\2\u00f6\u00f7\5,\27\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9\f"+
		"\3\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fc\5,\27\2\u00fb\u00f8\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe%\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0101\5,\27\2\u0101\'\3\2\2\2\u0102\u0109\7"+
		"\31\2\2\u0103\u0104\7\b\2\2\u0104\u0105\5&\24\2\u0105\u0106\7\t\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a)\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d"+
		"\7\3\2\2\u010d\u010e\5&\24\2\u010e\u010f\7\4\2\2\u010f\u0113\3\2\2\2\u0110"+
		"\u0113\5(\25\2\u0111\u0113\7\35\2\2\u0112\u010c\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0111\3\2\2\2\u0113+\3\2\2\2\u0114\u0115\b\27\1\2\u0115\u0116"+
		"\5.\30\2\u0116\u011c\3\2\2\2\u0117\u0118\f\3\2\2\u0118\u0119\7\33\2\2"+
		"\u0119\u011b\5.\30\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d-\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\b\30\1\2\u0120\u0121\5\60\31\2\u0121\u0127\3\2\2\2\u0122\u0123"+
		"\f\3\2\2\u0123\u0124\7\34\2\2\u0124\u0126\5\60\31\2\u0125\u0122\3\2\2"+
		"\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128/"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0134\5*\26\2\u012b\u012c\7\31\2\2"+
		"\u012c\u012e\7\3\2\2\u012d\u012f\5\62\32\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\7\4\2\2\u0131\u0132\7\33\2\2"+
		"\u0132\u0134\5\60\31\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\61\3\2\2\2\u0135\u013a\5&\24\2\u0136\u0137\7\6\2\2\u0137"+
		"\u0139\5&\24\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\63\3\2\2\2\u013c\u013a\3\2\2\2 \67DMYf"+
		"ilv\u0082\u008c\u0091\u009a\u009d\u00a0\u00a6\u00ad\u00b6\u00c0\u00d0"+
		"\u00dc\u00e7\u00f2\u00fd\u0109\u0112\u011c\u0127\u012e\u0133\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}