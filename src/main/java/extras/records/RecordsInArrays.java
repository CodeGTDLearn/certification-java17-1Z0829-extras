package extras.records;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class RecordsInArrays {
  public static void main(String[] args) {

    Book bookArray[] = {
         new Book("Record Book1", 100),
         new Book("Record MyBook2", 200)
    };

    for (Book book : bookArray) {
      System.out.printf("""
                             Arrays accept the Record %s from Array
                             %n""", book);
    }

    ArrayList<Book> bookArrayList = new ArrayList<>(asList(bookArray));
    bookArrayList.forEach(book-> {
      System.out.printf("""
                             ArrayLists accept the Record %s from Array
                             %n""", book);
    });
  }
}