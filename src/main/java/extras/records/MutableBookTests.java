package extras.records;

import java.util.ArrayList;
import java.util.List;

public class MutableBookTests {
  public static void main(String[] args) {

    /*╔═══════════════════════════════════════════════════════╗
      ║ Mutability: "MUTABLE LIST" as a Constructor Parameter ║
      ╚═══════════════════════════════════════════════════════╝*/
    List<String> mutableChapters = new ArrayList<>(List.of("C1", "C2"));

    MutableBook mBook = new MutableBook(
         "MyBook",
         300,
         mutableChapters     );

    show("Mutable Phase 1: " + mBook);

    // Changing, the Constructor Param, after Instantiation
    mutableChapters.add("C3");
    show("Mutable Phase 2: " + mBook);

    // Changing the Record, using its "Instance Variable List<String>"
    mBook.chapters().set(0,"Chapter 01");
    show("Mutable Phase 3: " + mBook + "\n");


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