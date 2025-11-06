public class Objects {
  String color = "Red";
  int speed = 100;

  void drive() {
    System.out.println("The car is driving...");
  }

  public static void main(String args[]) {
    Car myCar = new Car();

    System.out.println("Car color: " + myCar.color);
    System.out.println("Car speed: " + myCar.speed);

    myCar.drive();
  }
}
