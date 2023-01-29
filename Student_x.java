import java.util.*;
public class Student_x{
void Name(){
Scanner sc=new Scanner(System.in);
String name;
System.out.println("enter student name");
name=sc.next();
if(name==null){
System.out.println("unknown");
}
else{
System.out.println("the student name"+name);
}
}
public static void main(String args[])
{
Student_x s=new Student_x();
s.Name();
System.gc();
}
}