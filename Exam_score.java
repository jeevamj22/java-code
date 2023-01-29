import java.util.*;
class Exam
{
int mark;
String Subject;
String Totalmark;
}
public class Exam_score
{
public static void main(String args[])
{
Exam[] e=new Exam[3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
e[i]=new Exam();
e[i].mark=sc.nextInt();
e[i].Subject=sc.next();
e[i].Totalmark=sc.next();
}
for(int i=0;i<2;i++)
{
System.out.println(e[i].mark);
}
}
}
