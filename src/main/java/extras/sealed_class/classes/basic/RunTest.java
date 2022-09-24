package extras.sealed_class.classes.basic;

public class RunTest {
  public static void main(String[] args) {

    String circInfo = find(new Circle("white", 2.5));
    String sqrInfo = find(new Square("greyy", 2.5));

    System.out.println(circInfo);
    System.out.println(sqrInfo);

  }

  private static String find(Shape shape) {
      return switch (shape) {
        case Circle circle -> circle.toString();
        case Square square -> square.toString();
      };
  }
}