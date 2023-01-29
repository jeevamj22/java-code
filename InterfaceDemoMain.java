interface Printable
{
public void print();
}
interface Showable
{
public void show();
}

class InterfaceDemo implements Printable,Showable
{
public void print()
{
System.out.println("Called from printable");
}
public void show()
{
System.out.println("Calling show from Showable interface");
}
}

class InterfaceDemoMain
{
public static void main(String args[])
{
InterfaceDemo a=new InterfaceDemo();
a.print();
a.show();
}
}