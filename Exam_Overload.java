import java.util.*;
class Exam{
public int add(int m1,int m2)
{
return(m1+m2);
}
public int add(int m3,int m4,int m5)
{
return(m3+m4+m5);
}
public double mul(double m6,double m7)
{
return(m6*m7);
}
}
class Exam_Overload
{
public static void main(String args[])
{
Exam e=new Exam();
System.out.println(e.add(25,50));
System.out.println(e.add(2,4,6));
System.out.println(e.mul(2.3,4.3));
}
}
