
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Jun 04 00:53:55 CST 2016
//----------------------------------------------------

package pythoncompiler;

import java_cup.runtime.*;
import java.io.FileReader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Jun 04 00:53:55 CST 2016
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\010\003\000\002\003\013\000\002\007\005" +
    "\000\002\007\003\000\002\005\004\000\002\005\003\000" +
    "\002\006\004\000\002\006\004\000\002\006\004\000\002" +
    "\006\004\000\002\006\004\000\002\006\004\000\002\011" +
    "\002\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\004\016\006\001\002\000\004\002\001\001" +
    "\002\000\004\002\045\001\002\000\004\050\010\001\002" +
    "\000\004\002\uffff\001\002\000\004\007\011\001\002\000" +
    "\020\003\021\035\013\036\012\037\014\040\017\041\020" +
    "\042\023\001\002\000\004\050\044\001\002\000\004\050" +
    "\043\001\002\000\004\050\042\001\002\000\022\003\021" +
    "\035\013\036\012\037\014\040\017\041\020\042\023\060" +
    "\040\001\002\000\004\010\031\001\002\000\004\050\030" +
    "\001\002\000\004\050\027\001\002\000\004\050\ufff2\001" +
    "\002\000\024\003\ufff9\010\ufffb\035\ufff9\036\ufff9\037\ufff9" +
    "\040\ufff9\041\ufff9\042\ufff9\060\ufff9\001\002\000\004\050" +
    "\024\001\002\000\026\003\ufff4\010\ufff4\035\ufff4\036\ufff4" +
    "\037\ufff4\040\ufff4\041\ufff4\042\ufff4\056\ufff4\060\ufff4\001" +
    "\002\000\004\050\026\001\002\000\026\003\ufff1\010\ufff1" +
    "\035\ufff1\036\ufff1\037\ufff1\040\ufff1\041\ufff1\042\ufff1\056" +
    "\ufff1\060\ufff1\001\002\000\026\003\ufff5\010\ufff5\035\ufff5" +
    "\036\ufff5\037\ufff5\040\ufff5\041\ufff5\042\ufff5\056\ufff5\060" +
    "\ufff5\001\002\000\026\003\ufff3\010\ufff3\035\ufff3\036\ufff3" +
    "\037\ufff3\040\ufff3\041\ufff3\042\ufff3\056\ufff3\060\ufff3\001" +
    "\002\000\004\047\032\001\002\000\020\003\021\035\013" +
    "\036\012\037\014\040\017\041\020\042\023\001\002\000" +
    "\022\003\021\035\013\036\012\037\014\040\017\041\020" +
    "\042\023\056\035\001\002\000\022\003\ufff9\035\ufff9\036" +
    "\ufff9\037\ufff9\040\ufff9\041\ufff9\042\ufff9\056\ufff9\001\002" +
    "\000\004\005\037\001\002\000\024\003\ufffa\035\ufffa\036" +
    "\ufffa\037\ufffa\040\ufffa\041\ufffa\042\ufffa\056\ufffa\060\ufffa" +
    "\001\002\000\004\002\ufffd\001\002\000\020\003\021\035" +
    "\013\036\012\037\014\040\017\041\020\042\023\001\002" +
    "\000\004\010\ufffc\001\002\000\026\003\ufff7\010\ufff7\035" +
    "\ufff7\036\ufff7\037\ufff7\040\ufff7\041\ufff7\042\ufff7\056\ufff7" +
    "\060\ufff7\001\002\000\026\003\ufff6\010\ufff6\035\ufff6\036" +
    "\ufff6\037\ufff6\040\ufff6\041\ufff6\042\ufff6\056\ufff6\060\ufff6" +
    "\001\002\000\026\003\ufff8\010\ufff8\035\ufff8\036\ufff8\037" +
    "\ufff8\040\ufff8\041\ufff8\042\ufff8\056\ufff8\060\ufff8\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\010\002\004\003\003\004\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\005\014\006\021\007" +
    "\015\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\024\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\032\006\033\001" +
    "\001\000\004\006\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\040\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("ERROR");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {
                m.append(" in line "+(s.left+1));
                if (s.right >= 0)
                    m.append(", column "+(s.right+1));
            }
        }
        m.append(" : "+message);
        System.err.println(m);
    }

    /* Cuando se encuentra un error de donde el sistema no puede
        recuperarse, se lanza un error fatal. Se despliega el mensaje
        de error y se finaliza la ejecucion. */
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

    /* Metodo main para garantizar la ejecucion del analizador
       lexico y sintactico, ademas que se pase como parametro la tabla
       de simbolos correspondiente. */
    public static void main(String[] args){
        try {
            Parser asin = new Parser(
                    new Lexer( new FileReader(args[0])));
            Object result = asin.parse().value;
            System.out.println("\n*** Resultados finales ***");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // var_decl ::= error NT$0 IDENTIFIER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$0 ::= 
            {
              Object RESULT =null;
System.err.println(" Type not specified!! \n");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // var_decl ::= TYPE_CHAR IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // var_decl ::= TYPE_BOOLEAN IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // var_decl ::= TYPE_STRING IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // var_decl ::= TYPE_LIST IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // var_decl ::= TYPE_FLOAT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // var_decl ::= TYPE_INT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // list_var_decl ::= var_decl 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list_var_decl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // list_var_decl ::= list_var_decl var_decl 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list_var_decl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // par_var_decl ::= var_decl 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("par_var_decl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // par_var_decl ::= list_var_decl COMMA var_decl 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("par_var_decl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // fun ::= DEF IDENTIFIER L_PARENTHESIS_OP par_var_decl R_PARENTHESIS_OP COLON_OP list_var_decl BLOCK SEMICOLON_OP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // block_stmt ::= BLOCK 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("block_stmt",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= class 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= fun 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

