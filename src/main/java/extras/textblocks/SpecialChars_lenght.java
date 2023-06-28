package extras.textblocks;

import static java.lang.String.*;
import static java.lang.System.out;

public class SpecialChars_lenght {
  public static void main(String[] args) {

    String joiner_5 = """
         1   \
         2""";
    sout("joiner_5", valueOf(joiner_5.length()));
    out.println(joiner_5);
//-----------------------------------------------------------------------------

    String next_trailing_8 = """
         1    \n
         2""";
    sout("next_trailing_8", valueOf(next_trailing_8.length()));
    out.println(next_trailing_8);

    String next_implic_4 = """
         1      
         2
         """;
    sout("next_implic_4", valueOf(next_implic_4.length()));
    out.println(next_implic_4);
//-----------------------------------------------------------------------------

    String trailing_single_10 = """
         1      \s
         2""";
    sout("trailing_single_10", valueOf(trailing_single_10.length()));
    out.println(trailing_single_10);
//-----------------------------------------------------------------------------

    String tab_single_4 = """
         1\t
         2""";
    sout("tab_single_4", valueOf(tab_single_4.length()));
    out.println(tab_single_4);

    String trailing_tab_single_6 = """
         1 \t\t
         2""";
    sout("trailing_tab_single_6", valueOf(trailing_tab_single_6.length()));
    out.println(trailing_tab_single_6);
  }

  private static void sout(String... text) {

    out.println("%s: %s".formatted(text[0], text[1]));
  }
}