package extras.pattern_matching;

public class Conditionals {
  public static void main(String[] args) {

    patternMatching(12);
    patternMatching("1233");
  }

  public static void patternMatching(Object number) {

    if (number instanceof Integer matched && matched > 3) {
      show("MyInteger > 3: " + matched.doubleValue());
    }

    /*╔════════════════════════════════════════════════════════════════════╗
      ║    "||"  and  "&&"  Short-Circuits(Only accept Short-Circuits)     ║
      ╠════════════════════════════════════════════════════════════════════╣
      ║ && ->                                                              ║
      ║ * The 'instanceOf' TRUE, can ENSURE(100%) to THE Compiler          ║
      ║ * That the PatterVar has the same type than 'instanceOf'           ║
      ║ * FlowScope -> The 'instanceOf' TRUE, the PatterVar is created     ║
      ║                                                                    ║
      ║ || ->                                                              ║
      ║ * First Condition(instanceof) NOT-ENSURE to THE Compiler the TYPE  ║
      ║ * FlowScope -> The 'instanceOf' not TRUE, the PatterVar not created║
      ╚════════════════════════════════════════════════════════════════════╝*/
    if (number instanceof Integer matched && matched > 3) {
      show("MyInteger > 3: " + matched.doubleValue());
    }

    if (number instanceof String matched && matched.length() > 2) {
      show("MyString length > 2: " + matched.length());
    }
  }

  private static void show(String text) {

    System.out.println(text);
  }
}