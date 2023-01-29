import java.io.*;
class ArrayDemo_wk
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] age=new int[10];
for(int i=0;i<=9;i++)

{
System.out.println("Enter the value of "+i);
//Double.parseDouble(br.readline());
//br.readline();
age[i]=Integer.parseInt(br.readLine());
}
System.out.println("enter the index position to find the element");
int k=Integer.parseInt(br.readLine());
if(k<=9)
{
System.out.println("element at the index position of:"+k+"is :"+age[k]);
}
System.out.println("Length of array is:"+age.length);
}
}