import java.util.*;
class MultiDimension_Demo_wk
{
public static void main(String args[])
{
int[][] data=new int[3][3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
data[i][j]=sc.nextInt();
}
}
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
System.out.println(data[i][j]+"\t");
}
System.out.println();
}
}
}