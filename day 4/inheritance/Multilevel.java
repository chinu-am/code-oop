class A {
  void showA() { System.out.println("A"); }
}
class B extends A {
  void showB() { System.out.println("B"); }
}
class C extends B {
  void showC() { System.out.println("C"); }
}

public class Multilevel {
  public static void main(String[] args) {
    C obj = new C();
    obj.showA();
    obj.showB();
    obj.showC();
  }
}
