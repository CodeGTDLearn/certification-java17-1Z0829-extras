package extras.pattern_matching;

public class Scopes {
  public static void main(String[] args) {

    instanceOf_conditional_sameNames_differentBlockScopes(12.5);
    instanceOf_conditional_sameNames_differentBlockScopes(12);
    instanceOf_conditional_blockScope_violation(2.5);
    instanceOf_escopo_esticado_por_return(2.5);
    instanceOf_escopo_esticado_por_return(222);
    false_conditional_anomally(2.5);
    instanceOf_escopo_esticado_por_return_patVarName_duplicity(2.5);
  }

  public static void instanceOf_conditional_sameNames_differentBlockScopes(Object num) {
    // COMPILE-OK
    // - PatterVar: SAME NAME/TYPES, but in DIFFERENT IF-BLOCK-SCOPES
    if (num instanceof Double  match1) show("patVar1: " + match1.intValue());
    if (num instanceof Double  match1) show("patVar1: " + match1.intValue());
    if (num instanceof Integer match1) show("patVar1: " + match1);
  }

  public static void instanceOf_conditional_blockScope_violation(Object num) {
    // COMPILE-ERROR
    // - PatterVar is created/used inside IF-BLOCK-SCOPE
    // - PatterVar CANNOT be outside IF-BLOCK-SCOPE
    if (num instanceof Double   match2){
      show("patVar2 Type: " +match2.getClass().getSimpleName());
      show("patVar2: " +  match2.intValue());
    }
    //show("Double: " + match2.intValue()); // COMPILE-ERROR
  }

  public static void instanceOf_escopo_esticado_por_return(Object num) {
  // COMPILE-OK
  // - O NOR(!) no IF-InstanceOf: "End" the Code, using "Return" de dentro do Loop
  // - Check 'Condition' creating PatVar:
  //  * isn't 'Double': END Code using "Return" do Loop (nao exec o show+intValue abaixo)
  //  * is    'Double':
  //    - Estica o fluxo do scope(FlowScope), p/ fora do IF, chegando ate a linha debaixo,
  //    - Usando a patVar criada no IF-InstanceOf fora dele, EXECUTING o show+intValue
  //    - Compiler has 100% certainty there will be a Double in lastLine(out block-scope, in FlowScope)
    if (!(num instanceof Double  scopeEpatVarEsticados_praForaDo_IFBlockScope)) {
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
    if (!(num instanceof Double  first_scope_name))  return;
    show("scope-esticado-duplic: " + first_scope_name.intValue());
    //if (num instanceof Double first_scope_name)
      show("scope-esticado-duplic: " +  first_scope_name.intValue());
  }

  private static void show(String text) {

    System.out.println(text);
  }

}