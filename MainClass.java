//Airline Company. Luggage check-in Department -as per rules 15Kgs
//>15Kgs ->abnormal
//new user defined exception LWeightLimtExceeds


//class UserDefinedExceptionClassName extends Exception

import java.util.*;

class LWeightLimitExceeds extends Exception
{
LWeightLimitExceeds(int x)
{
System.out.println(Math.abs(15-x)+"Kg."+" Extra Luggage." + "So Pay and Fly");
}
}

class MainClass
{
void validWeight(int weight) throws LWeightLimitExceeds
{
if(weight>15)
{
throw new LWeightLimitExceeds(weight);
}
else
{
System.out.println("you are ready to fly!");
}
}

public static void main(String args[])

{
MainClass ob=new MainClass();
Scanner sc=new Scanner(System.in);
int weight;
for(int i=0;i<=3;i++)
{
try
{
weight=sc.nextInt();
ob.validWeight(weight);
}
catch(LWeightLimitExceeds e)
{
System.out.println(e);
}
}
}
}

