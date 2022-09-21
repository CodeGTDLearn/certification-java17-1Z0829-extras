package extras.switches;

public class MultipleLabel {
  public static void main(String[] args) {
      String text = "test3";

      switch (text) {
        case "test1":
          System.out.println(text + "Multi-Label 1");
          break;
        case "test2", "test3":
          System.out.println(text + "Multi-Label 2");
          System.out.println(text + "Multi-Label 3");
          break;
        default:System.out.println(text + "Multi-Label Others");

      }
  }
}