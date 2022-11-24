package extras.string;

public class StringBuilderDemo {

  public static void main(String[] args) {

    StringBuilder str = new StringBuilder("ab");
    System.out.println("1) " + str);

    str.insert(2, 'c');
    System.out.println("2) "+str.toString());

     str.insert(2, 'x');
     System.out.println("3) " + str);
  }
}