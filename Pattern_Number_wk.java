/*Write a program to print the following triangle
1
12
123
1234
12345
 */

import java.util.*;
class Pattern_Number_wk
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int rows=sc.nextInt();
for(int i=1;i<=rows;i++)
{
for(int j=1 ; j<=i;j++)
{
System.out.print(j+"\t");
}
System.out.println();
}


}

}