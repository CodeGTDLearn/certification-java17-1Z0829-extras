package extras.records;

public class BookTests {
  public static void main(String[] args) {

    Book book = new Book("MyBook",300);
    System.out.println(book);
    System.out.println(book.title());
    System.out.println(book.toString());
    System.out.println(book.isPagesAbove100());
  }
}