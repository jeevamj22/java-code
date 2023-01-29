import java.util.*;
class Member
{
String name;
int age;
String ph_no;
String address;
int salary;
void get_data()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.next();
System.out.println("enter the age");
age=sc.nextInt();
System.out.println("enter the phone number");
ph_no=sc.next();
System.out.println("enter the address");
address=sc.next();

}
void print_salary()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary of the person");
salary=sc.nextInt();
System.out.println("the salary of the person"+salary);
}
}
class Employee extends Member
{
String specialization;
String department;
void position_employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the specialization of the employee");
specialization=sc.next();
System.out.println("enter the department of the employee");
department=sc.next();
}
void display()
{
System.out.println("the name of the employee"+name);
System.out.println("the age of the employee"+age);
System.out.println("the mobile number of the employee"+ph_no);
System.out.println("the address of the employee"+address);
System.out.println("the specialization of the employee"+specialization);
System.out.println("the department of the employee"+department);
}
}
class Manager extends Member
{
String specialization;
String department;
void position_manager()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the specialization of the manager");
specialization=sc.next();
System.out.println("enter the department of the manager");
department=sc.next();
}
void display()
{
System.out.println("the name of the manager"+name);
System.out.println("the age of the manager"+age);
System.out.println("the mobile number of the manager"+ph_no);
System.out.println("the address of the manager"+address);
System.out.println("the specialization of the manager"+specialization);
System.out.println("the department of the manager"+department); 
}
}
class Member_detail
{
public static void main(String args[])
{
Employee e=new Employee();
e.get_data();
e.position_employee();
e.print_salary();
e.display();
Manager m=new Manager();
m.get_data();
m.position_manager();
m.print_salary();
m.display();
}
}
