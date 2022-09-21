package extras.textblocks;

public class Indent {
  public static void main(String[] args) {

    String basicText = """
basic boarder for "Incidental/Essencial" whiteSpaces
This is my second line
Next line will be a "emptyline", lets test
LastLine""";

    String indentation_3quotasinLine = """
              3quotasinLine boarder for "Incidental/Essencial" whiteSpaces
            This is my second line
          Next line will be a "emptyline", lets test
        LastLine""";

    String indentation_3quotasReturnLine = """
                3quotasReturnLine boarder for "Incidental/Essencial" whiteSpaces
              This is my second line
            Next line will be a "emptyline", lets test
          LastLine
        """;

    String indentation_FirstWordStartPoint = """
          FirstWordStartPoint boarder for "Incidental/Essencial" whiteSpaces
                     This is my second line
                   Next line will be a "emptyline", lets test
                 LastLine
               """;

    System.out.println(basicText);
    System.out.println(indentation_3quotasinLine);
    System.out.println(indentation_3quotasReturnLine);
    System.out.println(indentation_FirstWordStartPoint);

  }
}