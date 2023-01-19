package extras.pattern_matching;


public class Scopes {
  public static void main(String[] args) {

    //    instanceOf_conditional_sameNames_differentBlockScopes(12.5);
    //    instanceOf_conditional_sameNames_differentBlockScopes(12);
    //    instanceOf_conditional_blockScope_violation(2.5);
    //    instanceOf_escopo_esticado_por_return(2.5);
    //    instanceOf_escopo_esticado_por_return(222);
    //    false_conditional_anomally(2.5);
    //    instanceOf_escopo_esticado_por_return_patVarName_duplicity(2.5);
    instanceOf_patternVar_type(2.5);
    //    instanceOf_patternVar_type(1);
  }

  public static void instanceOf_conditional_sameNames_differentBlockScopes(Object num) {
    // COMPILE-OK
    // - PatterVar: SAME NAME/TYPES, but in DIFFERENT IF-BLOCK-SCOPES
    if (num instanceof Double match1) show("patVar1: " + match1.intValue());
    if (num instanceof Double match1) show("patVar1: " + match1.intValue());
    if (num instanceof Integer match1) show("patVar1: " + match1);
  }

  public static void instanceOf_conditional_blockScope_violation(Object num) {
    // COMPILE-ERROR
    // - PatterVar is created/used inside IF-BLOCK-SCOPE
    // - PatterVar CANNOT be outside IF-BLOCK-SCOPE
    if (num instanceof Double match2) {
      show("patVar2 Type: " + match2.getClass()
                                    .getSimpleName());
      show("patVar2: " + match2.intValue());
    }
    //show("Double: " + match2.intValue()); // COMPILE-ERROR
  }

  public static void instanceOf_patternVar_type(Object num) {

    if (num instanceof Double match2) {
      show("patVar2 IF-InstanceOf: " + match2.getClass()
                                             .getSimpleName());
    }
    if (num instanceof Integer match2) {
      show("patVar2 IF-InstanceOf: " + match2.getClass()
                                             .getSimpleName());
    }

    if (! (num instanceof Integer patVarNotCreated)) {
      show("num - NOT BEING A INTEGER INSTANCE - Type: " + num.getClass()
                                                              .getSimpleName());

      /*╔══════════════════════════════════════════════════════════════════╗
        ║                       PatternVar CREATING                        ║
        ╠══════════════════════════════════════════════════════════════════╣
        ║ PatternVar ONLY IS CREATED IF, AND ONLY IF, 'instanceOf' is TRUE ║
        ║        'instanceOf' is TRUE (ex: num instanceof Integer)         ║
        ╚══════════════════════════════════════════════════════════════════╝*/
      //      show("patVar: " + patVarNotCreated.getClass()
      //                                        .getSimpleName());
    }
  }

  public static void instanceOf_escopo_esticado_por_return(Object num) {
    // COMPILE-OK
    // - O NOR(!) no IF-InstanceOf: "End" the Code, using "Return" de dentro do Loop
    // - Check 'Condition' creating PatVar:
    //  * isn't 'Double': END Code using "Return" do Loop (nao exec o show+intValue abaixo)
    //  * is    'Double':
    //    - Estica o fluxo do scope(FlowScope), p/ fora do IF, chegando ate a linha debaixo,
    /*╔══════════════════════════════════════════════════════╗
      ║ EXCESSAO DA REGRA DE CRIACAO DA PATTERN_VAR_MATHCING ║
      ╠══════════════════════════════════════════════════════╣
      ║      COMPILADOR TEM CERTEZA, QUE A PARTERN-VAR       ║
      ║               SERA DE TIPO CORRETO                   ║
      ╚══════════════════════════════════════════════════════╝*/
    if (! (num instanceof Double scopeEpatVarEsticados_praForaDo_IFBlockScope)) {
      return;
    }
    show("patVar_3_1: " + scopeEpatVarEsticados_praForaDo_IFBlockScope.intValue());
  }

  public static void false_conditional_anomally(Object num) {
    // COMPILE-ERROR
    // - Check 'Condition', creating PatterVar:
    //   * isn't 'Double':
    //     - ENTER LOOP: execute Double.intValue - COMPILE-ERROR
    //   * is    'Double':
    //     - NOT ENTER LOOP: COMPILE-ERROR
    //if (!(num instanceof Double  doubleMethod)) show("patVar_3_2: " +  doubleMethod.intValue());
  }

  public static void instanceOf_escopo_esticado_por_return_patVarName_duplicity(Object num) {
    // COMPILE-ERROR
    // - Check 'Condition', creating PatterVar:
    //   - Return + NOR-instanceOf geram um scopo1-esticado, para alem do PRIMEIRO-IF-block-scope
    //   - ATINGingo o show, na linha debaixo
    //   - O Segundo-IF 'repete' o PatVar-Name do PRIMEIRO-IF, estando dentro do "scopo1-esticado"
    //   - Repeticao de PatVar-Name, no mesmo scope, e um proibida
    if (! (num instanceof Double first_scope_name)) return;
    show("scope-esticado-duplic: " + first_scope_name.intValue());
    //if (num instanceof Double first_scope_name)
    show("scope-esticado-duplic: " + first_scope_name.intValue());
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
      //v = isDouble.intValue(); // Compile-Error
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