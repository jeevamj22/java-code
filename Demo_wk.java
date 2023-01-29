//Demo constructor overloading concept
class Bank
{
int bid;
String name;
public Bank()
{
bid=1;
name="Ram";
}
public Bank(int bid,String name)
{
this.bid=bid;
this.name=name;
}
}
class Demo_wk
{
public static void main(String args[])
{
Bank b=new Bank();
Bank b1=new Bank(10,"Raman");
System.out.println(b.bid+"\t"+b1.bid);
}
}
