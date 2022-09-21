package extras.switches;

public class Expression {
  public static void main(String[] args) {

    String text = "test5";
    String result1;

    result1 =
         switch (text) {
      case "test1" -> text + " expression 1";
      case "test2" -> text + " expression  2";
      default -> text + " expression  Others";
    };

    System.out.println(result1);
    System.out.println(thisIsMyText("test5"));

  }

  public static String thisIsMyText(String checkCase){
    return switch (checkCase) {
      case "test1" -> checkCase + " method expression 1";
      case "test2" -> checkCase + " method expression  2";
      default -> checkCase + " method expression  Others";
    };
  }
}