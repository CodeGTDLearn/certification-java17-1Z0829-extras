package extras.switches;

public class FallThrough {
  public static void main(String[] args) {

    String text = "";
    for (int i = 1; i < 4; i++) {
      System.out.println("\n");
      switch ("test" + i) {
        case "test1":
          System.out.println(text + "FallThrough 1");
          break;
        case "test2":
          System.out.println(text + "FallThrough 2");
        case "test3":
          System.out.println(text + "FallThrough 3");
          break;
        default:
          System.out.println(text + "FallThrough Others");
      }
    }

    for (long l = 1L; l < 4000000000000L; l++) {
      System.out.println("\n");
      switch ("test" + l) {
        case "test1":
          System.out.println(text + "long 1");
          break;
        case "test2":
          System.out.println(text + "long 2");
        case "test3":
          System.out.println(text + "long 3");
          break;
        default:
          System.out.println(text + "long Others");
      }
    }
  }
}