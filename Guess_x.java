import java.util.*;
class Guess_x
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int i,n;
n=1;
for(i = N; i >= 0; i--){
	i=i/2;
	n=n+1;
	System.out.println(i);
	
}
System.out.println("it requires "+ n +" times to get the number");
}
}


