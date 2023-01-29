//Demo inner class
class Outer
{
private int no=20;

class Inner
{
void display()
{
System.out.println("variable of outer class"+no);
}
}
public static void main(String args[])

{
Outer obj=new Outer();
Outer.Inner in=obj.new Inner();
in.display();
}
}