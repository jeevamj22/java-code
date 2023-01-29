import java.util.*;
class Faculty
{
private String name;
private int emp_id;
private String degree;
void display_faculty_data()
{

Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the faculty");
name=sc.next();
System.out.println("enter the employee id");
emp_id=sc.nextInt();
System.out.println("enter the Degree UG or PG");
degree=sc.next();
System.out.println("the name of the faculty"+" :"+name);
System.out.println("the employee id of the faculty"+" :"+emp_id);
System.out.println("the degree of the employee"+":"+degree);
}
class Degree
{
private String degree_name;
private String awarded_year;
private String awarded_university;

void display_degree_details()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the degree");
degree_name=sc.next();
System.out.println("enter the degree awarded year");
awarded_year=sc.next();
System.out.println("enter the degree awarded university");
awarded_university=sc.next();
System.out.println("the degree name"+" :"+degree_name);
System.out.println("the degree awarded year"+" :"+awarded_year);
System.out.println("the degree awarded university"+" :"+awarded_university);
}
}
public static void main(String args[])
{
Faculty f=new Faculty();
Faculty.Degree d=f.new Degree();
f.display_faculty_data();
d.display_degree_details();

}
}