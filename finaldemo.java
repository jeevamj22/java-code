import java.util.*;
final class Employee
{
final double PI=3.14;
public double area;
final void calculate()//it cannot be overrided
{
area=PI*2*2;
}
}
//class finaldemo extends Employee->throw error because final class cannot be inherited

class finaldemo
{
public static void main(String args[])
{
Employee e=new Employee();
//e.PI=4.25; variable with final keyword cannot be changed
e.calculate();
System.out.println("Area is:"+e.area);
}
}
