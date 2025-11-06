class Variables {
  int a = 10;           
  static int b = 20;      

  void show() {
    int c = 30;         
    System.out.println("Local variable: " + c);
    System.out.println("Instance variable: " + a);
    System.out.println("Static variable: " + b);
  }
}

public class Single {
  public static void main(String[] args) {
    Example obj1 = new Example(); 
    obj1.show();

    System.out.println("Accessing static variable without object: " + Example.b);
  }
}
