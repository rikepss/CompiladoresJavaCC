/* LALG.java */
/* Generated By:JavaCC: Do not edit this line. LALG.java */
import java.io.*;

public class LALG implements LALGConstants {
  public static void main(String args [])
  {
        try
        {
           LALG parser = new LALG(System.in);
           parser.start();
    }
     catch (ParseException e)
     {
        System.out.println(e.getMessage());
                return;
      }
      catch (TokenMgrError e)
      {
        System.out.println(e.getMessage());
                return;
          }
  }

  final public void start() throws ParseException {Token token;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LPAREN:
      case RPAREN:
      case COMMA:
      case DOT:
      case PROGRAM:
      case VAR:
      case CONST:
      case REAL:
      case INTEGER:
      case PROCEDURE:
      case BEGIN:
      case END:
      case NUM:
      case COLON:
      case SEMICOLON:
      case READ:
      case WRITE:
      case DO:
      case IF:
      case THEN:
      case ELSE:
      case WHILE:
      case FOR:
      case TO:
      case ID:
      case PLUS:
      case MINUS:
      case MUL:
      case DIV:
      case ASSIGN:
      case EQUALS:
      case GREATEREQUAL:
      case LESSEREQUAL:
      case NOTEQUAL:
      case GREATER:
      case LESSER:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LPAREN:{
        token = jj_consume_token(LPAREN);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case RPAREN:{
        token = jj_consume_token(RPAREN);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case COMMA:{
        token = jj_consume_token(COMMA);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case DOT:{
        token = jj_consume_token(DOT);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case PROGRAM:{
        token = jj_consume_token(PROGRAM);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case VAR:{
        token = jj_consume_token(VAR);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case CONST:{
        token = jj_consume_token(CONST);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case REAL:{
        token = jj_consume_token(REAL);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case INTEGER:{
        token = jj_consume_token(INTEGER);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case PROCEDURE:{
        token = jj_consume_token(PROCEDURE);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case BEGIN:{
        token = jj_consume_token(BEGIN);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case END:{
        token = jj_consume_token(END);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case ID:{
        token = jj_consume_token(ID);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case NUM:{
        token = jj_consume_token(NUM);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case COLON:{
        token = jj_consume_token(COLON);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case SEMICOLON:{
        token = jj_consume_token(SEMICOLON);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case READ:{
        token = jj_consume_token(READ);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case WRITE:{
        token = jj_consume_token(WRITE);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case DO:{
        token = jj_consume_token(DO);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case IF:{
        token = jj_consume_token(IF);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case THEN:{
        token = jj_consume_token(THEN);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case ELSE:{
        token = jj_consume_token(ELSE);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case WHILE:{
        token = jj_consume_token(WHILE);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case FOR:{
        token = jj_consume_token(FOR);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case TO:{
        token = jj_consume_token(TO);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case PLUS:{
        token = jj_consume_token(PLUS);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case MINUS:{
        token = jj_consume_token(MINUS);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case MUL:{
        token = jj_consume_token(MUL);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case DIV:{
        token = jj_consume_token(DIV);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case ASSIGN:{
        token = jj_consume_token(ASSIGN);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case EQUALS:{
        token = jj_consume_token(EQUALS);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case GREATEREQUAL:{
        token = jj_consume_token(GREATEREQUAL);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case LESSEREQUAL:{
        token = jj_consume_token(LESSEREQUAL);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case NOTEQUAL:{
        token = jj_consume_token(NOTEQUAL);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case GREATER:{
        token = jj_consume_token(GREATER);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      case LESSER:{
        token = jj_consume_token(LESSER);
System.out.println("@(" + token.beginLine + "," + token.beginColumn + ")" + "  " + tokenImage[token.kind] + " - " + token.image);
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  /** Generated Token Manager. */
  public LALGTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xfffdffe0,0xfffdffe0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x3ff,0x3ff,};
   }

  /** Constructor with InputStream. */
  public LALG(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public LALG(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LALGTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public LALG(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LALGTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public LALG(LALGTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LALGTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[42];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 42; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
