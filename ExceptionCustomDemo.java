//Myexception
//User defined exception to raise
//Exception Number=number

class MyException extends Exception
{
in a;
MyException(int b);
{
a=b;
}
public String toString()
{
return ("Exception Number="+a);
}
}

class ExceptionCustomDemo
{
public static void main(String args[])
{
try
{
throw new MyException(2);
}
catch(MyException e)
{
System.out.println(e);
}
