/*Write a program to print the following triangle
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5 */
import java.util.*;
class Pattern_Patern_wk
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of Rows");
n=sc.nextInt();
for(int i=n;i>=1;i--)
{
for(int j=n;j>=i;j--)
{
System.out.print(j);
}
System.out.println();
}
}
}