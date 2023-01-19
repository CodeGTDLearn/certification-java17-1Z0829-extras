package extras.pattern_matching;

public class HibridClassWithPatVar {


  public static void main(String args[]) {

    SuperClass objComp = new SubClass();
    // if (objComp instanceof Super_Class pat_var) pat_var.a();   // Compile-Error
    if (objComp instanceof SubClass pat_var) pat_var.a();

    SuperClass objComp2 = new SuperClass();
    // if (objComp2 instanceof Super_Class pat_var) pat_var.a();  // Compile-Error
    if (objComp2 instanceof SubClass pat_var) pat_var.a();

  }
}

class SuperClass {
  void a() {

    System.out.println("a");
  }
}

class SubClass extends SuperClass {
  void b() {

    System.out.println("b");
  }
}

class LastClass extends SubClass {
  void c() {

    System.out.println("c");
  }
}