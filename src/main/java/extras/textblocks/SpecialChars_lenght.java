package extras.textblocks;

import static java.lang.String.valueOf;
import static java.lang.System.out;

public class SpecialChars_lenght {
  public static void main(String[] args) {

    String joiner_5 = """
         1   \
         2""";
    sout("joiner_5", valueOf(joiner_5.length()));
    out.println(joiner_5 + "\n---------------------------------");

    String next_trailing_8 = """
         1    \n
         2""";
    sout("next_trailing_8", valueOf(next_trailing_8.length()));
    out.println(next_trailing_8 + "\n---------------------------------");

    String next_implic_4 = """
         1      
         2
         """;
    sout("next_implic_4", valueOf(next_implic_4.length()));
    out.println(next_implic_4 + "\n---------------------------------");

    // '/n' is implicity resulting in 6
    String trailing_singleSpace_6 = """
         1\s\s\s
         2""";
    sout("trailing_singleSpace_6", valueOf(trailing_singleSpace_6.length()));
    out.println(trailing_singleSpace_6 + "\n---------------------------------");

    // '/n' is implicity resulting in 10
    String trailing_singleSpace_10 = """
         1      \s
         2""";
    sout("trailing_singleSpace_10", valueOf(trailing_singleSpace_10.length()));
    out.println(trailing_singleSpace_10 + "\n---------------------------------");

    String tab_4 = """
         1\t
         2""";
    sout("tab_4", valueOf(tab_4.length()));
    out.println(tab_4 + "\n---------------------------------");

    String trailing_tab_single_7 = """
         1  \t\t
         2""";
    sout("trailing_tab_single_7", valueOf(trailing_tab_single_7.length()));
    out.println(trailing_tab_single_7 + "\n---------------------------------");
  }

  private static void sout(String... text) {

    out.println("%s: %s".formatted(text[0], text[1]));
  }
}