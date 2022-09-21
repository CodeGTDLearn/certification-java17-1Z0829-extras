package extras.switches;

public class YieldKey {
  public static void main(String[] args) {

    String text = "test5";
    String result1;

    result1 =
         switch (text) {
           case "test1":
             yield text + " expression yield 1";
           case "test2":
             yield text + " expression yield 2";
           default:
             yield text + " expression yield Others";
         };
    System.out.println(result1);

    String text2 = "test5";
    var result2 =
         switch (text2) {
           case "test1" -> text2 + " expression yield compound 1";

           case "test2" -> {
             var temp = text2 + " expression yield compound  2";
             yield temp;
           }

           default -> text2 + " expression yield compound  Others";
         };
    System.out.println(result2);
  }
}