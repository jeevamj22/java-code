abstract class Bank
{
abstract void getBalance();
}
class BankA extends Bank
{
void getBalance()
{
System.out.println("Bank A has $100 deposit");
}
}
class BankB extends Bank
{
void getBalance()
{
System.out.println("Bank B has $150 deposit");
}
}
class BankC extends Bank
{
void getBalance()
{
System.out.println("Bank C has $200 deposit");
}
}
class AbstractDemo
{
public static void main(String args[])
{
BankA a=new BankA();
a.getBalance();
BankB b=new BankB();
b.getBalance();
BankC c=new BankC();
c.getBalance();
}
}


