import java.util.*;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
class Bank
{
public String name;
public Double balance;
public String pin;
public Double minimum_balance;
public Double penalty;
public Double interest;
public int transaction;
public Double fee;
public Double charge;
public String accno;
public String acc_type;
Double minimum_balance1=500.00;
Double minimum_balance2=100.00;

}
class Regular_Account extends Bank
{
public String name;
public Double balance;
public String pin;
public Double minimum_balance;
public Double penalty;
public Double interest;
public int transaction;
public Double fee;
public Double charge;
public String accno;
public String acc_type;
public String ac_no;
Double minimum_balance1=500.00;
Double minimum_balance2=100.00;
Scanner sc=new Scanner(System.in);

void create_account()
{
	System.out.print("Enter Account No: ");  
	accno = sc.next();  
	System.out.print("Enter Account type: ");  
	acc_type = sc.next();  
	System.out.print("Enter Name: ");  
	name = sc.next();  
	System.out.print("Enter Balance: ");  
	balance = sc.nextDouble(); 
}
void deposit_account()
{
        double amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextDouble();  
        balance = balance + amt; 
}
void withdraw()
{
    Double amt;  
    
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextDouble();  
        if (minimum_balance1 >amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + minimum_balance + "\tTransaction failed...!!" );  
        }  
}
void access_balance()
{
    String ac_no;
    System.out.println("enter your account number"); 
    ac_no=sc.next();
	if (accno==(ac_no)) {  
         	System.out.println("the balance in your account is "+balance);  
        	}  
	else{
		System.out.println("entered wrong account number");
	}  
    
}
void access_name()
{
	String name_input;
	System.out.println("enter your account number");
	ac_no=sc.next();
		if (accno == ac_no){
			System.out.println("the account holder is"+name);
			}
		else{
		System.out.println("entered wrong account number");
		}
}
void compute_fee()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	if(day==31){
		balance=balance-(balance*0.10);
		System.out.println("your balance after computation of fee"+balance);
	}
	else{
		System.out.println("at end of month 10% of balance will be deduct");}
	
}
void Penalty()
{
	Double penalty=10.00;
	if(balance<minimum_balance1){
		System.out.println("you have penalty of 10 rupees");
		balance=balance-penalty;
		System.out.println("the remaining balance"+balance);
}
}
void compute_interest()
{
System.out.println("no interest for this account");
}
} 

class Interest_Account extends Bank
{
public String name;
public Double balance;
public String pin;
public Double minimum_balance;
public Double penalty;
public Double interest;
public int transaction;
public Double fee;
public Double charge;
public String accno;
public String acc_type;
public String ac_no;
Double minimum_balance1=500.00;
Double minimum_balance2=100.00;
Scanner sc=new Scanner(System.in);
void create_account()
{
	System.out.print("Enter Account No: ");  
	accno = sc.next();  
	System.out.print("Enter Account type: ");  
	acc_type = sc.next();  
	System.out.print("Enter Name: ");  
	name = sc.next();  
	System.out.print("Enter Balance: ");  
	balance = sc.nextDouble();
}
void deposit_account()
{
        double amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextDouble();  
        balance = balance + amt;
}
void withdraw()
{
    Double amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextDouble();  
        if (minimum_balance1 >amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + minimum_balance + "\tTransaction failed...!!" );  
        }
}
void access_balance()
{
    String ac_no;
    System.out.println("enter your account number"); 
    ac_no=sc.next();
	if (accno==(ac_no)) {  
         	System.out.println("the balance in your account is "+balance);  
        	}  
	else
	{
	System.out.println("entered wrong account number");
	}
}
void access_name()
{
	String name_input;
	System.out.println("enter your account number");
	ac_no=sc.next();
		if (accno==(ac_no)){
			System.out.println("the account holder is"+name);
			}
		else{
			System.out.println("emtered wrong account number");
			}
}
void validate_pin()
{
}
void compute_fee()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	

	if(day==31){
		balance=balance-(balance*0.10);
	}
	System.out.println("your balance after computation of fee"+balance);
}
void compute_interest()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	if(day==31){
		balance=balance+(balance*0.07);
		
	}
	System.out.println("your updated balance"+balance);
}
}

class Checking_Account extends Bank
{
public String name;
public Double balance;
public String pin;
public Double minimum_balance;
public Double penalty;
public Double interest;
public int transaction;
public Double fee;
public Double charge;
public String accno;
public String acc_type;
public String ac_no;
Double minimum_balance1=500.00;
Double minimum_balance2=100.00;
Scanner sc=new Scanner(System.in);
void create_account()
{
	this.name=name;
	this.accno=accno;
	this.ac_no=ac_no;
	this.balance=balance;
	System.out.print("Enter Account No: ");  
	accno = sc.next();  
	System.out.print("Enter Account type: ");  
	acc_type = sc.next();  
	System.out.print("Enter Name: ");  
	name = sc.next();  
	System.out.print("Enter Balance: ");  
	balance = sc.nextDouble();
}
void deposit_account()
{
        double amt;  
	this.balance=balance;
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextDouble();  
        balance = balance + amt;
}
void withdraw()
{

    Double amt;
	this.balance=balance;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextDouble();  
        if (minimum_balance1 >amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + minimum_balance + "\tTransaction failed...!!" );  
        }
}
void access_balance()
{
    this.balance=balance;
    this.accno=accno;
    this.ac_no=ac_no;
    System.out.println("enter your account number"); 
    ac_no=sc.next();
	if (accno==(ac_no)) {  
         	System.out.println("the balance in your account is "+balance);  
        	}  
	else{	
		System.out.println("entered wrong account number");
		}
}
void access_name()
{
	this.name=name;
	this.ac_no=ac_no;
	this.balance=balance;
	System.out.println("enter your account number");
	ac_no=sc.next();
		if (accno==(ac_no)){
			System.out.println("the account holder is"+name);
			}
		else{
			System.out.println("entered wrong account number");}
}
void validate_pin()
{
}
void compute_fee()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	this.balance=balance;
	if(day==31){
		balance=balance-(balance*0.10);
	}
	System.out.println("your balance after computation fee"+balance);
}
void compute_interest()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	this.balance=balance;
	if(day==31){
		balance=balance+(balance*0.07);
	}
	System.out.println("your balance after adding interest"+balance);
}

void Penalty()
{
	minimum_balance2=100.00;
	Double penalty=10.00;
	this.balance=balance;
	if(balance<minimum_balance2){
		System.out.println("you have penalty of 10 rupees");
		balance=balance-penalty;
	}
	System.out.println("your balance after penalty"+balance);
	

}
}

class CD_Account extends Bank
{
public String name;
public Double balance;
public String pin;
public Double minimum_balance;
public Double penalty;
public Double interest;
public int transaction;
public Double fee;
public Double charge;
public String accno;
public String acc_type;
public String ac_no;
Double minimum_balance1=500.00;
Double minimum_balance2=100.00;
Scanner sc=new Scanner(System.in);
void create_account()
{
	
	System.out.print("Enter Account No: ");  
	accno = sc.next();  
	System.out.print("Enter Account type: ");  
	acc_type = sc.next();  
	System.out.print("Enter Name: ");  
	name = sc.next();  
	System.out.print("Enter Balance: ");  
	balance = sc.nextDouble();
}
void deposit_account()
{
        double amt;
	this.balance=balance;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextDouble();  
        balance = balance + amt;
}
void withdraw()
{
    Double amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextDouble();  
        if (minimum_balance1 >amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + minimum_balance + "\tTransaction failed...!!" );  
        }
}
void access_balance()
{
    this.accno=accno;
    this.ac_no=ac_no;
    this.balance=balance;
    System.out.println("enter your account number"); 
    ac_no=sc.next();
	if (accno ==(ac_no)) {  
         	System.out.println("the balance in your account is "+balance);  
        	}  
	else{
		System.out.println("entered wrong account number");
		}
}
void access_name()
{
	String name_input;
        String ac_no;
	System.out.println("enter your account number");
	ac_no=sc.next();
		if (accno==(ac_no)){
			System.out.println("the account holder is"+name);
			}
		else{
			System.out.println("emtered wrong account number");}
}
void validate_pin()
{

}
void compute_fee()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	this.balance=balance;
	if(day==31){
		balance=balance-(balance*0.10);
	}
	System.out.println("your balance after computation fee"+balance);
}
void compute_interest()
{
	LocalDate currentDate=LocalDate.now();
	DayOfWeek dow =currentDate.getDayOfWeek();
	int day=currentDate.getDayOfYear();
	Month month=currentDate.getMonth();
	int year=currentDate.getYear();
	this.balance=balance;
	if(year==12 && day==31){
		balance=balance+(balance*0.15);
	}
	System.out.println("your balance after adding interest"+balance);
}
void penalty()
{
	int transaction;

}
}



class Bank_track extends Bank
{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int ch_a;
int ch_b;
int ch_c;
int ch_d;
int ch_e;

Regular_Account r=new Regular_Account();
Interest_Account i=new Interest_Account();
Checking_Account c=new Checking_Account();
CD_Account cd=new CD_Account();


do{
	System.out.println("enter which account you want to open");
	System.out.println("1 -regular account.... 2-Interest account.... 3-checking account.... 4-CD account....0 to exit");
	System.out.println("enter your option");
	ch_a=sc.nextInt();

	
	switch(ch_a){
		case 1:
			System.out.println("you opened a regular account");
			do{
				
				
				System.out.println("1-create account... 2-deposit account... 3-withdraw... 4-access balance...5-access name..6-check validity pin..7-show compute fee...8-show compute interest...9-penalty...0 to exit");
				System.out.println("enter your option");
				ch_b=sc.nextInt();
				switch(ch_b){
					case 1:
						r.create_account();
						break;
					case 2:
						r.deposit_account();
						break;
					case 3:
						r.withdraw();
						break;
					case 4:
						r.access_balance();
						break;
					case 5:
						r.access_name();
						break;
					case 6:
						
						break;
					case 7:
						r.compute_fee();
						break;
					case 8:
						r.compute_interest();
						break;
					case 9:
						
						break;
						}
				}while(ch_b !=0);
				break;
		case 2:
			System.out.println("you opened a Interested account");
			do{
				
				
				System.out.println("1-create account... 2-deposit account... 3-withdraw... 4-access balance...5-access name..6-check validity pin..7-show compute fee...8-show compute interest...9-penalty...0 to exit");
				System.out.println("enter your option");
				ch_c=sc.nextInt();
				switch(ch_c){
					case 1:
						i.create_account();
						break;
					case 2:
						i.deposit_account();
						break;
					case 3:
						i.withdraw();
						break;
					case 4:
						i.access_balance();
						break;
					case 5:
						i.access_name();
						break;
					case 6:
						i.validate_pin();
						break;
					case 7:
						i.compute_fee();
						break;
					case 8:
						i.compute_interest();
						break;
					case 9:
						
						break;
						}
				}while(ch_c !=0);
				break;
		case 3:
			System.out.println("you opened a checking account");
			do{
				
				
				System.out.println("1-create account... 2-deposit account... 3-withdraw... 4-access balance...5-access name..6-check validity pin..7-show compute fee...8-show compute interest...9-penalty...0 to exit");
				System.out.println("enter your option");
				ch_d=sc.nextInt();
				switch(ch_d){
					case 1:
						c.create_account();
						break;
					case 2:
						c.deposit_account();
						break;
					case 3:
						c.withdraw();
						break;
					case 4:
						c.access_balance();
						break;
					case 5:
						c.access_name();
						break;
					case 6:
						c.validate_pin();
						break;
					case 7:
						c.compute_fee();
						break;
					case 8:
						c.compute_interest();
						break;
					case 9:
						
						break;
						}
				}while(ch_d !=0);
				break;
		case 4:
			System.out.println("you opened a CD account");
			do{
				
				
				System.out.println("1-create account... 2-deposit account... 3-withdraw... 4-access balance...5-access name..6-check validity pin..7-show compute fee...8-show compute interest...9-penalty...0 to exit");
				System.out.println("enter your option");
				ch_e=sc.nextInt();
				switch(ch_e){
					case 1:
						cd.create_account();
						break;
					case 2:
						cd.deposit_account();
						break;
					case 3:
						cd.withdraw();
						break;
					case 4:
						cd.access_balance();
						break;
					case 5:
						cd.access_name();
						break;
					case 6:
						cd.validate_pin();
						break;
					case 7:
						cd.compute_fee();
						break;
					case 8:
						cd.compute_interest();
						break;
					case 9:
						cd.penalty();
						break;
						}
				}while(ch_e !=0);
				break;
			}

}while(ch_a !=0);
}
}
