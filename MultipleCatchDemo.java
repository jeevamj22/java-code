//write a program to catch exception when i try to array element with
//divide by zero exception
class MultipleCatchDemo
{
public static void main(String args[])
{
try
{
int a[]=new int[5];
int d=30/0;
a[10]=d;
System.out.println("inside try block");
}
catch(ArithmeticException e1)
{
System.out.println("Arithmetic exception has been caught");
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("Array Index is wrongly indicated");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Outside try and catch");
}
}

