package extras.string;

public class ObjectsCallBySharing {
  static String str = """
       Hello""";

  static StringBuilder mySB = new StringBuilder("mySbText");

  public static void changeString(String s) {

    System.out.printf("""
    Original String Pointer: %s - Original Content: %s
    """, s.hashCode(), s);

    s = "Changed";

    System.out.printf("""
    New String Pointer: %s - New Content: %s
    """, s.hashCode(), s);

    System.out.printf("""
    Original String Pointer: %s - Original Content: %s %n
    """, str.hashCode(), str);
  }

  public static void changeStringBuilder(StringBuilder sb) {

    System.out.printf("""
    Original SB Pointer: %s - Original Content: %s
    """, sb.hashCode(), sb);

    sb.append("newSB");

    System.out.printf("""
    New SB Pointer: %s - New Content: %s
    """, sb.hashCode(), sb);

    System.out.printf("""
    Original SB Pointer: %s - Original Content: %s
    """, mySB.hashCode(), mySB);
  }

  public static void main(String[] args) {

    changeString(str);

    changeStringBuilder(mySB);
  }
}