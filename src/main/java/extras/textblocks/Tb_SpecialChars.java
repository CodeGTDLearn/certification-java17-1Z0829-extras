package extras.textblocks;

public class Tb_SpecialChars {
  public static void main(String[] args) {

    String joinNExtLine= """
              3quotasinLine boarder for "Incidental/Essencial" whiteSpaces \
            This is my second line
          Next line will be a "emptyline", lets test
        LastLine""";


    String uptoHEre = """
              3quotasinLine boarder for "Incidental/Essencial" whiteSpaces
            This is my second line                      \s
          Next line will be a "emptyline", lets test
        LastLine""";

    String newLine1 = """
              3quotasinLine boarder for "Incidental/Essencial" whiteSpaces
            This is my second line \n
          Next line will be a "emptyline", lets test
        LastLine
        """;

    String newLine2 = """
              3quotasinLine boarder for "Incidental/Essencial" whiteSpaces
            This is my second \n line
          Next line will be a "emptyline", lets test
        LastLine""";

    System.out.println(joinNExtLine);
    System.out.println(uptoHEre);
    System.out.println(newLine1);
    System.out.println(newLine2);

  }
}