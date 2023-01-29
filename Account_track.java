import java.util.*;
class Bank
{
String name;
Double balance;
String pin;
Double minimum_balance;
Double penalty;
Double interest;
int transaction;
Double fee;
Double charge;
}
class Regular_account extends Bank
{
private String name;
private Double balance;
private String pin;
private Double minimum_balance;
private Double penalty;
private Double draw;
private Double charge;
private String check;
private Double fee;
private String new_name;

Scanner sc=new Scanner(System.in);
private static void create_account()
{
System.out.println("enter the name of the customer");
name=sc.next();
System.out.println("enter the pin");
pin=sc.next();
System.out.println("the minimum balance to be deposited is 500");
}
void deposit_account()
{
System.out.println("enter the amount you want to deposit");
balance=sc.nextDouble();
System.out.println("the amount deposited successfully");
}
void withdraw()
{
System.out.println("enter the amount you want to withdraw");
draw=sc.nextDouble();
balance=balance-draw;
System.out.println("the amount withdrawed successfully"+"--"+ "the remaining balance:"+balance);
}
void access_balance()
{
System.out.println("the current balance is"+balance);
if(balance<500){
charge=10.00;
balance=balance-charge;
System.out.println("the balance after charge for minimum balance"+balance);
}
}
void access_name()
{
System.out.println("enter the pin to access name");
check=sc.next();
if(check==pin){
System.out.println("the customer name is"+name);
new_name=sc.next();
name=new_name;
System.out.println("the new name of the account");
}
}
void check_validity_pin()
{
System.out.println("enter the pin to check");
}
 void compute_fee()
{
fee=balance*0.10;
System.out.println("the compute fee for the regular account"+"--"+fee);
}
}

class Interest_account extends Bank
{
private String name;
private Double balance;
private String pin;
private Double minimum_balance;
private Double penalty;
private Double draw;
private Double charge;
private String check;
private Double fee;
private Double interest;
private String new_name;
Scanner sc=new Scanner(System.in);


public void create_account()
{
System.out.println("enter the name of the customer");
name=sc.next();
System.out.println("enter the pin");
pin=sc.next();
System.out.println("the minimum balance to be deposited is 500");
}


public void deposit_account()
{
System.out.println("enter the amount you want to deposit");
balance=sc.nextDouble();
System.out.println("the amount deposited successfully");
}
public void withdraw()
{
System.out.println("enter the amount you want to withdraw");
draw=sc.nextDouble();
balance=balance-draw;
System.out.println("the amount withdrawed successfully"+"--"+ "the remaining balance:"+balance);
}
public void access_balance()
{
System.out.println("the current balance is"+balance);
if(balance<500){
charge=10.00;
balance=balance-charge;
System.out.println("the balance after charge for minimum balance"+balance);
}
}
public  void access_name()
{
System.out.println("enter the pin to access name");
check=sc.next();
if(check==pin){
System.out.println("the customer name is"+name);
new_name=sc.next();
name=new_name;
System.out.println("the new name of the account");
}
}
public void check_validity_pin()
{
System.out.println("enter the pin to check");
}
public void compute_fee()
{
fee=balance*0.10;
System.out.println("the compute fee for the regular account"+"--"+fee);
}
public void compute_interest()
{
interest=balance*0.07;
balance=balance+interest;
System.out.println("the balance after paying 7% of interest"+balance);
}
}

class Checking_account extends Bank
{
private String name;
private Double balance;
private String pin;
private Double minimum_balance;
private Double penalty;
private Double draw;
private Double charge;
private String check;
private Double fee;
private String new_name;
Scanner sc=new Scanner(System.in);

public void create_account()
{
System.out.println("enter the name of the customer");
name=sc.next();
System.out.println("enter the pin");
pin=sc.next();
System.out.println("the minimum balance to be deposited is 500");
}

public void deposit_account()
{
System.out.println("enter the amount you want to deposit");
balance=sc.nextDouble();
System.out.println("the amount deposited successfully");
}
public void withdraw()
{
System.out.println("enter the amount you want to withdraw");
draw=sc.nextDouble();
balance=balance-draw;
System.out.println("the amount withdrawed successfully"+"--"+ "the remaining balance:"+balance);
}
public void access_balance()
{
System.out.println("the current balance is"+balance);
if(balance<100){
charge=10.00;
balance=balance-charge;
System.out.println("the balance after charge for minimum balance"+balance);
}
}
public  void access_name()
{
System.out.println("enter the pin to access name");
check=sc.next();
if(check==pin){
System.out.println("the customer name is"+name);
new_name=sc.next();
name=new_name;
System.out.println("the new name of the account");
}
}
public void check_validity_pin()
{
System.out.println("enter the pin to check");
}
public void compute_fee()
{
fee=balance*0.10;
balance=balance-fee;
System.out.println("the compute fee for the regular account"+"--"+fee);
System.out.println("the balance after deducting fee"+balance);
}

public void compute_interest()
{
interest=balance*0.07;
balance=balance+interest;
System.out.println("the balance after paying 7% of interest"+balance);
}
}

class CD_account extends Bank
{
private String name;
private Double balance;
private String pin;
private Double minimum_balance;
private Double penalty;
private Double draw;
private Double charge;
private String check;
private Double fee;
private String new_name;
Scanner sc=new Scanner(System.in);
public void create_account()
{
System.out.println("enter the name of the customer");
name=sc.next();
System.out.println("enter the pin");
pin=sc.next();
System.out.println("the minimum balance to be deposited is 500");
}
public void deposit_account()
{
System.out.println("enter the amount you want to deposit");
balance=sc.nextDouble();
System.out.println("the amount deposited successfully");
}
public void withdraw()
{
System.out.println("enter the amount you want to withdraw");
draw=sc.nextDouble();
balance=balance-draw;
System.out.println("the amount withdrawed successfully"+"--"+ "the remaining balance:"+balance);
}
public void access_balance()
{
System.out.println("the current balance is"+balance);
if(balance<100){
charge=10.00;
balance=balance-charge;
System.out.println("the balance after charge for minimum balance"+balance);
}
}
public  void access_name()
{
System.out.println("enter the pin to access name");
check=sc.next();
if(check==pin){
System.out.println("the customer name is"+name);
new_name=sc.next();
name=new_name;
System.out.println("the new name of the account");
}
}
public void check_validity_pin()
{
System.out.println("enter the pin to check");
}
public void compute_fee()
{
fee=balance*0.10;
balance=balance-fee;
System.out.println("the compute fee for the regular account"+"--"+fee);
System.out.println("the balance after deducting fee"+balance);
}

public void compute_interest()
{
interest=balance*0.15;
balance=balance+interest;
System.out.println("the balance after paying 7% of interest"+balance);
}
}

class Account_track extends Bank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1-Regular account/t 2-Interest account/t 3-Checking account /t 4-CD account");
int choice1=sc.nextInt();
switch(choice1){
	case 1:
		Regular_account r=new Regular_account();
		System.out.println("enter  1-create account 2-deposit_account 3-withdraw 4-access_balance 5-access_name 6-check_validity_pin  7-compute fee  0-exit");
		int choice2=sc.nextInt();
while(choice2!=0){
		switch(choice2){
			case 1:
				r.create_account();
			
			case 2:
				r.deposit_account();
			
			case 3:
				r.withdraw();
			
			case 4:
				r.access_balance();
				
			case 5:
				r.access_name();
				
			case 6:
				r.check_validity_pin();
				
			case 7:
				r.compute_fee();
				
			}
}
	case 2:
		Interest_account i=new Interest_account();
		System.out.println("enter 1-create account 2-deposit_account 3-withdraw 4-access_balance 5-access_name 6-check_validity_pin  7-compute fee  0-exit");
		int choice3=sc.nextInt();
		switch(choice3){
			case 1:
				i.create_account();
			
			case 2:
				i.deposit_account();
				
			case 3:
				i.withdraw();
				
			case 4:
				i.access_balance();
				
			case 5:
				i.access_name();
				
			case 6:
				i.check_validity_pin();
				
			case 7:
				i.compute_fee();
				
			}while(choice3!=0);
	case 3:
		Checking_account c=new Checking_account();
		System.out.println("enter 1-create account 2-deposit_account 3-withdraw 4-access_balance 5-access_name 6-check_validity_pin  7-compute fee 0-exit");
		int choice4=sc.nextInt();
		switch(choice4){
			case 1:
				c.create_account();
				
			case 2:
				c.deposit_account();
			
			case 3:
				c.withdraw();
				
			case 4:
				c.access_balance();
				
			case 5:
				c.access_name();
			
			case 6:
				c.check_validity_pin();
			
			case 7:
				c.compute_fee();
				
			}while(choice4!=0);

	case 4:
		CD_account d=new CD_account();
		System.out.println("enter 1-create account 2-deposit_account 3-withdraw 4-access_balance 5-access_name 6-check_validity_pin  7-compute fee 0-exit");
		int choice5=sc.nextInt();
		switch(choice5){
			case 1:
				d.create_account();
			case 2:
				d.deposit_account();
			case 3:
				d.withdraw();
			case 4:
				d.access_balance();
			case 5:
				d.access_name();
			case 6:
				d.check_validity_pin();
			case 7:
				d.compute_fee();
			}while(choice5!=0);
}
}
}	  