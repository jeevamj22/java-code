class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }

  public Student() {
    this.name = "Unknown";
  }

  public String getName() {
    return this.name;
  }
}

public class Student_main{
  public static void main(String[] args) {
    // Create a new Student object with a name
    Student student1 = new Student("Jeeva");
    System.out.println(student1.getName()); // prints "Jeeva"

    // Create a new Student object with no name
    Student student2 = new Student();
    System.out.println(student2.getName()); // prints "Unknown"

    // Perform garbage collection
    System.gc();
  }
}
