import java.util.*;
class Pattern_demo_wk
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows of the pyramid");
int no=sc.nextInt();
for(int i=1;i<=no;i++)
{
for(int j=1;j<=i;j++)
{
System.out.println("*");
}
System.out.println();
}
}
}