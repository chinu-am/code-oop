class Calculator {
  void add(int a, int b) {
    System.out.println("Sum: " + (a + b));
  }

  int multiply(int a, int b) {
    return a * b;
  }
}

public class Basics {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    calc.add(10, 20);                
    int result = calc.multiply(5, 4);
    System.out.println("Product: " + result);
  }
}
