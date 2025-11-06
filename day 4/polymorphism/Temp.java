class Demo {
  void show() {
    System.out.println("Temporary object created");
  }
}

public class Temp {
  public static void main(String[] args) {
    new Demo().show();  
  }
}
