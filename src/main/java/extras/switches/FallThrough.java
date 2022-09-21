package extras.switches;

public class FallThrough {
  public static void main(String[] args) {
      String text = "test2";

      switch (text) {
        case "test1":
          System.out.println(text + "FallThrough 1");
          break;
        case "test2":
          System.out.println(text + "FallThrough 2");
        case "test3":
          System.out.println(text + "FallThrough 3");
          break;
        default:System.out.println(text + "FallThrough Others");
      }

  }
}