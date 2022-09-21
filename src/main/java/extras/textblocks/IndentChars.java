package extras.textblocks;

public class IndentChars {
  public static void main(String[] args) {

    String option1 = "  a\n b\n";
    String option2 = "a\nb\n".indent(3);

    String option3 = """
         a\nb\n
         """.indent(3);

    String option4 = """
         a
         b
         """.indent(2);

    String option5 = """
         a
         b
         """.indent(1);

    String option6 = """
         a
         b
         """;

    System.out.println(option1);
    System.out.println(option2);
    System.out.println(option3);
    System.out.println(option4);
    System.out.println(option5);
    System.out.println(option6);

  }
}