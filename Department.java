class Employee
{
private int employee_no =10;
private String name="jeeva";
private int salary=90000;

class Department
{
 void display()
{
System.out.println("employee number"+employee_no);
System.out.println("employee name"+name);
System.out.println("employee salary"+salary);
}
}
public static void main(String args[])
{


Employee e=new Employee();
Employee.Department ed=e.new Department();
ed.display();
}
}
