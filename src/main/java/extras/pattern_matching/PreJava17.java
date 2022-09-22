package extras.pattern_matching;

public class PreJava17 {
  public static void main(String[] args) {
    patternMatching(12.5);
    patternMatching(12);
    patternMatching("12");
  }

  public static void patternMatching (Object number){

    if( number instanceof Integer ){

      Integer matched_number = (Integer) number;

      show("MyInteger: " + matched_number);
    }

    if(number instanceof Double){
      Double matched_number_numero_igualado = (Double) number;
      show("MyDouble: " + matched_number_numero_igualado);
    }

    if(number instanceof String){
      String matched_number_numero_igualado = (String) number;
      show("MyString: " + matched_number_numero_igualado);
    }



  }

  private static void show(String text) {

    System.out.println(text);
  }
}