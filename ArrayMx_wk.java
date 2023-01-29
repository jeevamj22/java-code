//Find the maximum element present in the array
import java.util.*;
class ArrayMax_wk
{
public static void main(String args[])
{
int[] arr={10,5,20,15,6,7};
int max=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("Maximum Element is "+max);
}
}