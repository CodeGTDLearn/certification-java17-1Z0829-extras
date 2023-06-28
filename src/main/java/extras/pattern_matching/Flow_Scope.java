package extras.pattern_matching;


public class Flow_Scope {
  public static void main(String[] args) {

    //    instanceOf_conditional_sameNames_differentBlockScopes(12.5);

  }



  public static void flow_scope_esticado_por_return_patVarName_duplicity(Object num) {
    // COMPILE-ERROR
    // - Check 'Condition', creating PatterVar:
    //   - Return + NOR-instanceOf geram um scopo1-esticado, para alem do PRIMEIRO-IF-block-scope
    //   - ATINGingo o show, na linha debaixo
    //   - O Segundo-IF 'repete' o PatVar-Name do PRIMEIRO-IF, estando dentro do "scopo1-esticado"
    //   - Repeticao de PatVar-Name, no mesmo scope, e um proibida
    if (! (num instanceof Double flow_scope_var)) return;
    show("scope-esticado-duplic: " + flow_scope_var.intValue());
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("simulation of code ");
    show("scope-esticado-duplic: " + flow_scope_var.intValue());

    /*╔════════════════════════════════════════════════════════════════╗
      ║ TENTAR CRIAR UM VARIAVEL COM O MESMO DE NOME DA flow_scope_var ║
      ╠════════════════════════════════════════════════════════════════╣
      ║ ERRO DE COMPILACAO - A "flow_scope_var"[PAtternVar] esta       ║
      ║                INDEFINIDAMENTE NO ESCOPO                       ║
      ╚════════════════════════════════════════════════════════════════╝*/
    
    
    
    // if (num instanceof Double flow_scope_var) - COMPILE-ERROR: flow_scope_var already defined
    // Double flow_scope_var; - COMPILE-ERROR: flow_scope_var already defined
  }

  public static void flowScopeWithIfStatement1(Object num) {
    var v = 0;
    if (num instanceof Double isDouble) {
      // Flow-Scope - instanceof MUST be TRUE:
      // Compiler is '100% sure' "isDouble"(Pattern-Var)
      // was created, as a Double
      v = isDouble.intValue(); // Here, Flow-Scope

    } else {
      // Flow-Scope - instanceof is FALSE:
      // Compiler is not '100% sure' that "isDouble"
      // was created, as a Double
      //v = isDouble.intValue(); // Compile-Error
    }
  }

  public static void flowScopeWithIfStatement2(Object s) {
    var v = 0;

    // Short-Circuit:  &&
    // str.length()>0  ONLY will be checked if instanceof is TRUE
    if( s instanceof String str && str.length()>0) {
      // Flow-Scope - instanceof MUST be TRUE:
      // Compiler is '100% sure' "str"(Pattern-Var)
      // was created, as a Double
      v = str.codePointAt(0); // Here, Flow-Scope

    } else {
      // Flow-Scope - instanceof is FALSE:
      // Compiler is not '100% sure' that "str"
      // was created, as a "String"
      // str.intValue(); // Compile-Error
    }
  }

  public static void flowScopeWithIfStatement3(Object s) {
    var v = 0;

    // Simple &
    // str.length()>0 will be checked if instanceof is TRUE or FALSE
//    if( s instanceof String str & str.length()>0) {
      // Flow-Scope - instanceof MUST be TRUE:
      // Compiler is '100% sure' "str"(Pattern-Var)
      // was created, as a Double
//      v = str.codePointAt(0); // Here, Flow-Scope

//    }
  }

  private static void show(String text) {

    System.out.println(text);
  }

}