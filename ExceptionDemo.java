import java.util.*;
class ExceptionDemo
{
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a/b;
System.out.println("value of c is"+c);}
catch(Exception e)
{
System.out.println("error divide by zero"+e);
}

System.out.println("Successfully executed");
}
}
