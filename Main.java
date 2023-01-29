class Car
{
Car()
{
System.out.println("Inside Car");
}
void display_details()
{
System.out.println("Car details");
}
}
class Maruthi extends Car
{
Maruthi()
{
super();
display_details();
System.out.println("Inside maruthi");
}
void display()
{
System.out.println("Maruthi car");
System.out.println("Speed 25 KM/Hr");
}
}
class Maruthi800 extends Maruthi
{
Maruthi800()
{
super();
System.out.println("Maruthi800");
}
void display()
{
super.display();
System.out.println("Maruthi 800 Details");
System.out.println("Speed 30 KM/Hr");
}
}
public class Main
{
public static void main(String args[])
{
Maruthi800 m=new Maruthi800();
//maruthi mi=new Maruthi();
m.display();
//mi.display();
}
}