import java.util.*;
class Guess
{
private int y=100;
class Find
{
void high_low()
{
Scanner sc=new Scanner(System.in);
int n1=y/2+1;
int n2=y/2-1;
System.out.println("enter your guessing");
int x=sc.nextInt();
while(x==y)
{
	if((x>n1) &&  (x<=y))
	{
		n1=x;
		high_low();
	}
	else if((x<n2) && (x>=y))
	{
		n2=x;
		high_low();
	}
	else if(x==y)
	{
	System.out.println("the guessed number "+x);
	}
}
}
}
public static void main(String args[])
{
Guess g=new Guess();
Guess.Find f=g.new Find();
f.high_low();
}
}


