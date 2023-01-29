//Find the average of set of marks got as input from user
import java.io.*;
class Student_AverageCalc_wk
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] marks=new int[5];
System.out.println("enter the 5 subjects marks");
int sum=0;
for(int i=0;i<=4;i++)
{
marks[i]=Integer.parseInt(br.readLine());
sum=sum+marks[i];
}
double average=sum/marks.length;
System.out.println("Average Score is"+average);
}
}