class A {
  void parent() { System.out.println("Parent class"); }
}
class B extends A {
  void child1() { System.out.println("Child 1"); }
}
class C extends A {
  void child2() { System.out.println("Child 2"); }
}

public class Hierarchial {
  public static void main(String[] args) {
    B obj1 = new B();
    C obj2 = new C();
    obj1.parent();
    obj1.child1();
    obj2.parent();
    obj2.child2();
  }
}
