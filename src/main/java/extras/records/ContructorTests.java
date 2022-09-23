package extras.records;

public class ContructorTests {
  public static void main(String[] args) {

    System.out.println(new Constructor("AllArgs", 15));
//    System.out.println(new Constructor);
    System.out.println(new Constructor(12));
    Constructor recordName = new Constructor("onlyName");
    System.out.println(recordName);
    System.out.println(recordName.name());
  }
}