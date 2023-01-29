import java.util.*;
class ArrayMin_wk
{
public static void main(String args[])
{
int[] arr={10,20,30,40,50};
int min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("Minimum element"+min);
}
}