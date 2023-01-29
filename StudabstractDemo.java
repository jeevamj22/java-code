abstract class Marks
{
String coursename="Java";
abstract double getPercentage();
}
class A extends Marks
{
int mark1,mark2,mark3;
A(int mark1,int mark2,int mark3)
{
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
}
double getPercentage()
{
double percentage=(mark1+mark2+mark3)/3;
return percentage;
}
}
class B extends Marks
{
int bmark1,bmark2,bmark3,bmark4;
B(int m1,int m2,int m3,int m4)
{
bmark1=m1;
bmark2=m2;
bmark3=m3;
bmark4=m4;
}
double getPercentage()
{
double percent=(bmark1+bmark2+bmark3+bmark4)/4;
return percent;
}
}
class StudabstractDemo
{
public static void main(String args[])
{
A a=new A(60,70,80);
System.out.println("the percentage by student A is: "+a.getPercentage());
B b=new B(90,80,70,80);
System.out.println("the percentage by student B is:"+b.getPercentage());
}
}

