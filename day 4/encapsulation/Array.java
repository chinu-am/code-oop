class Student {
  private int[] marks;

  void setMarks(int[] m) {
    marks = m;
  }

  void showMarks() {
    for (int x : marks)
      System.out.println(x);
  }
}

public class Array {
  public static void main(String[] args) {
    Student s = new Student();
    int[] data = {80, 85, 90};
    s.setMarks(data);
    s.showMarks();
  }
}
