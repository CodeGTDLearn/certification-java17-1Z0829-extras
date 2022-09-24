package extras.records.mutablity;

import java.util.List;

public class IMutableBookTests {
  public static void main(String[] args) {
    /*╔═══════════════════════════════════════════════════════════╗
      ║ IMMutability: "IMMUTABLE LIST" as a Constructor Parameter ║
      ╚═══════════════════════════════════════════════════════════╝*/
    List<String> immutableChapters = List.of("C1", "C2");

    MutableBook imBook = new MutableBook(
         "MyBook",
         300,
         immutableChapters     );

    show("IMMutable Phase 1: " + imBook);

    // Change the Contructor Parameter, after Instantiation
    immutableChapters.add("C3");
    show("IMMutable Phase 2: " + imBook);

    // Change the Record "Instance Variable List<String>"
    imBook.chapters().set(0,"Chapter 01");
    show("IMMutable Phase 3: " + imBook);
  }

  private static void show(String text) {

    System.out.println(text);
  }


}