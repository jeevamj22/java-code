//switch statement
import java.util.*;
class Student_wk
{
int no;
public static void main(String arrgs[])
{
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to print in words");
s.no=sc.nextInt();
switch(s.no){
case 0:
System.out.println("zero");
break;
case 1:
System.out.println("one");
break;
case 2:
System.out.println("Two");
break;
default:
System.out.println(s.no);
}
}
}