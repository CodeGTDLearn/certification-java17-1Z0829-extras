package extras.pattern_matching;

public class Scopes {
  public static void main(String[] args) {

    instanceOf_conditional_sameNames_differentBlockScopes(12.5);
    instanceOf_conditional_blockScope_violation(2.5);
    instanceOf_escopo_esticado_por_return(2.5);
    false_conditional_anomally(2.5);
    instanceOf_escopo_esticado_por_return_patVarName_duplicity(2.5);
  }

  public static void instanceOf_conditional_sameNames_differentBlockScopes(Object num) {
    // COMPILE-OK
    // - PatterVar: SAME NAME, but DIFFERENT IF-BLOCK-SCOPES
    if (num instanceof Double  match1) show("patVar1: " + match1.intValue());
    if (num instanceof Double  match1) show("patVar1: " + match1.intValue());
  }

  public static void instanceOf_conditional_blockScope_violation(Object num) {
    // COMPILE-ERROR
    // - PatterVar is created/used inside IF-BLOCK-SCOPE
    // - PatterVar CANNOT be outside IF-BLOCK-SCOPE
    if (num instanceof Double  match2) show("patVar2: " +  match2.intValue());
    //show("Integer: " + match3); // COMPILE-ERROR
  }

  public static void instanceOf_escopo_esticado_por_return(Object num) {
    // COMPILE-OK
    // O Return + instanceOf-Negado, no FIRST-IF: "End" the Code(Loop) with Return
    // - Check 'Condition', creating PatVar:
    //   * isn't 'Double': END/INTERRUPT/RETURN (nao atinge o show+intValue da linha abaixo)
    //   * is    'Double': Estica o scope pra linha debaixo, 'run' Double.intValue
    if (!(num instanceof Double  match3))  return;
    show("patVar_3_1: " + match3.intValue());
  }

  public static void false_conditional_anomally(Object num) {
    // COMPILE-ERROR
    // IF instanceOf-Negado:
    // - Check 'Condition', creating PatterVar:
    //   * isn't 'Double':
    //     - ENTER LOOP: execute Double.intValue - COMPILE-ERROR
    //   * is    'Double':
    //     - NOT ENTER LOOP: to execute Double.intValue - COMPILE-ERROR
    //if (!(num instanceof Double  doubleMethod)) show("patVar_3_2: " +  doubleMethod.intValue());
  }

  public static void instanceOf_escopo_esticado_por_return_patVarName_duplicity(Object num) {
    // COMPILE-ERROR
    // - Check 'Condition', creating PatterVar:
    //   - O Return + instanceOf-Negado 'esticam' o scopo1, p/ metodo de baixo (show)
    //   - O Segundo-IF 'repete' o PatVar-Name usado no scopo 1, DENTRO do "scopo1 esticado"
    //   - Repeticao de PatVar-Name, no mesmo scope, e forbidden
    if (!(num instanceof Double  patVarScope1))  return;
    show("patVar_3_3: " + patVarScope1.intValue());
    if (num instanceof Double  first_scope_name)
      show("patVar_3_3: " +  first_scope_name.intValue());
  }

  private static void show(String text) {

    System.out.println(text);
  }
}