class Five
{
int n_num;
void get_input()
{
Scanner sc=new Scanner(System.in);
this.n_num=n_num;
System.out.println("enter the nth number");
int n_num=sc.nextInt();
}
}

class Find_num extends Five
{
public static void main(String args[])
{
for(int i=0;i<=n_num;i++)
{
if( i%5==0){
System.out.println(i);
}
}
}



