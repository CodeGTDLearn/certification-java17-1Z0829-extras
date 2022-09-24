package extras.sealed_class.classes.advanced;

public class RunTest {
  public static void main(String[] args) {

    String dog = define(new Dog("hair", "walk"));
    String chicken = define(new Chicken("feather", "fly","domestic"));
    String falcon = define(new Falcon("feather", "fly","wild"));

    System.out.println(dog);
    System.out.println(chicken);
    System.out.println(falcon);

  }

  private static String define(Animal animal) {
      return switch (animal) {
        case Dog d -> d.toString();
        case Chicken c -> c.toString();
        case Falcon f -> f.toString();
        default -> throw new IllegalStateException("Unexpected value: " + animal);
      };
  }
}