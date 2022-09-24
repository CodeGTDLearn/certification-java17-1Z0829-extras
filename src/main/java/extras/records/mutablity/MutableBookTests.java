package extras.records.mutablity;

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
  }

  private static void show(String text) {

    System.out.println(text);
  }


}