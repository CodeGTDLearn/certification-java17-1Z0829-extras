package extras.pattern_matching;

public class PatVarInheritance {
  public static void main(String args[]) {

    A ab = new B();
    A ac = new C();

    if (ac instanceof B b1 && ac instanceof C c2) {
      b1.b();
      c2.c();

      if (b1 instanceof C c1) {
        c1.c();
      }
    } else {
      ac.a();
    }
  }
}

class A {
  void a() {

    System.out.println("a");
  }
}

class B extends A {
  void b() {

    System.out.println("b");
  }
}

class C extends B {
  void c() {

    System.out.println("c");
  }
}