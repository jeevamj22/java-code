import java.util.*;
class Person
{
public String name;
public Double salary;
public int experience;
public String national_insurance;
void get_data()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the person");
name=sc.next();
}
}
class Employee_wk extends Person
{


void get_data()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the person");
name=sc.next();
System.out.println("enter the salary of the employee");
salary=sc.nextDouble();
System.out.println("enter the number of years of experience of the employee");
experience=sc.nextInt();
System.out.println("enter the national insurance number of the employee");
national_insurance=sc.next();
}
void display()
{
System.out.println("the name of the employee"+name);
System.out.println("the salary of the employee"+salary);
System.out.println("the experience of the employee"+experience);
System.out.println("the national insurance of the employee"+national_insurance);
}
public static void main(String args[])
{

Employee_wk e=new Employee_wk();
e.get_data();
e.display();
}
}
