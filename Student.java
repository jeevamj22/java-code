
import java.util.*;
class Student
{
int no;
public static void main (String args[])
{
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to print in words")
s.no=sc.nextInt();
switch(s.no){
case 0:
System.out.println("Zero");
break;
case 1:
System.out.println("one");
break;
case 2:
System.out.println("Three");
break;
default:
System.out.println(s.no);
break;
}
}

