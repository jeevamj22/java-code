class ContinueExample
{
public static void main(String args[])
{
for(int i=0;i<=2;i++)
{
for(int j=i;j<=5;j++)
{
if(j==4){
continue;//skip 4 from printing
}
System.out.println(j);
}
}
}
}
