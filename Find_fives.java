import  java.util.*;
class Five
{
public int n_num;
public  void get_input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the nth number");
n_num=sc.nextInt();
}
}

class Find_fives extends Five
{
public void get_num()
{
for(int i=0;i<=n_num-1;i++)
{
if( i%5==0){
System.out.println(i);

}
}
System.out.println("the number of fives in nth number"+n_num/5);
}
public static void main(String args[])
{
Find_fives f=new Find_fives();

f.get_input();
f.get_num();

}
}


