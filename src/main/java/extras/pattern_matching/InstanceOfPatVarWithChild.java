package extras.pattern_matching;

import java.util.ArrayList;

class Book {
}

class TextBook extends Book {
}

class BookList extends ArrayList<Book> {
  public int simpleAddCount = 0;
  public int simpleAddCountInsideInstanceOf = 0;
  public int customAddCount = 0;
  public int customAddCountInsideInstanceOf = 0;

  public boolean add(Book o) {

    if (o instanceof TextBook b) {
      simpleAddCountInsideInstanceOf++;
      return super.add(b);
    } else return simpleAddCount++ == - 1;
  }

  public boolean myCustomAdd(Object o) {

    if (o instanceof Book b) {
      customAddCountInsideInstanceOf++;
      return super.add(b);
    } else return customAddCount++ == - 1;
  }
}

public class InstanceOfPatVarWithChild {
  public static void main(String[] args) {

    BookList list = new BookList();
    list.add(new Book());
    list.add(new TextBook());
    // list.add("hello");
    System.out.println(
         "Count: " + list.simpleAddCount + "\n" +
         "myCustom: " + list.simpleAddCountInsideInstanceOf + "\n"
    );

    list.myCustomAdd(new Book());
    list.myCustomAdd(new TextBook());
    list.myCustomAdd("hello");
    list.myCustomAdd("hello 2");
    System.out.println(
         "CustomCount: " + list.customAddCount + "\n" +
         "myCustomBooks: " + list.customAddCountInsideInstanceOf + "\n"
    );
  }
}