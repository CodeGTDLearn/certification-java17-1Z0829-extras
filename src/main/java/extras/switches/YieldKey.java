package extras.switches;

public class YieldKey {
  public static void main(String[] args) {

    String text = "test5";
    String result1;

    result1 =
         switch (text) {
           case "test1": yield " expression yield 1";
           case "test2": yield " expression yield 2";
           default     : yield " expression yield Others";
         };
    System.out.println(result1);

    String text2 = "test1";
    var result2 =
         switch (text2) {
           case "test1" -> {
             final String exp = "expression";
             var temp = " yield compound  2";
             yield exp + temp;
           }// Yield dispensa ";" no BLock-Code

           default -> text2 + " yield Others";
         };
    System.out.println(result2);
  }
}