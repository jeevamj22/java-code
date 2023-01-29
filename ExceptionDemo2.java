//write a program to catch null pointer exception
class ExceptionDemo2
{
public static void main(String args[])
{
String s;
try
{
s=null;
System.out.println(s.length());
}
catch(Exception e)
{System.out.println(e);
}
finally
{
s="welcome";
System.out.println(s.length());
}
}
}
