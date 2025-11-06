class Calculator {

  
  void add(int a, int b) {
    System.out.println("Sum of two numbers: " + (a + b));
  }

  
  void add(int a, int b, int c) {
    System.out.println("Sum of three numbers: " + (a + b + c));
  }

  
  void add(double a, double b) {
    System.out.println("Sum of doubles: " + (a + b));
  }
}

public class Overloading {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    calc.add(10, 20);          
    calc.add(10, 20, 30);      
    calc.add(5.5, 4.5);        
  }
}
