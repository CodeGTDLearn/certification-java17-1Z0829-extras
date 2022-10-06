package extras.pattern_matching;

public class PosJava17 {
  public static void main(String[] args) {
    patternMatching(12.5);
    patternMatching(12);
    patternMatching("12");
  }

  public static void patternMatching (Object number){

    if( number instanceof Integer     matched_number){
        show("MyInteger: " + matched_number);
    }

    if(number instanceof Double matching_igualado_number){
//      Double matched_number = (Double) number;
      show("MyDouble: " + matching_igualado_number);
    }

    if(number instanceof String matching_igualado_number){
//      String matched_number = (String) number;
      show("MyString: " + matching_igualado_number);
    }

  }

  private static void show(String text) {

    System.out.println(text);
  }
}