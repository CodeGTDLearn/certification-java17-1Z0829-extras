package extras.switches;

public class Expression {
  public static void main(String[] args) {
    String text = "test5";

    String result1 = switch (text) {
      case "test1" -> " expression 1";
      case "test2" -> " expression  2";
      default -> " expression  Others";
    };

    System.out.println(result1);
    System.out.println(thisIsMyText("test5"));

    String text1 = "test1";
    String result2 = switch (text1) {
      case "test1" ->
        throw new
             IllegalArgumentException("test1 Exception");
      case "test2" -> " expression  2";
      default -> throw new IllegalArgumentException();
    };
    System.out.println(result2);

  }

  public static String thisIsMyText(String checkCase) {

    return switch (checkCase) {
      case "test1" -> " method expression 1";
      case "test2" -> " method expression  2";
      default -> " method expression  Others";
    };
  }
}