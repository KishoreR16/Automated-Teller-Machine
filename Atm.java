//Create a Automated Teller Machine Backend Logic using Encapsulation technique in Java
import java.util.*;
public class Atm
{
	int balance;
	Atm(int balance)
	{
		this.balance=balance;
	}
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	void withdraw(int amount)
	{
		balance-=amount;
	}
	int getBalance()
	{
		return balance;
	}
	public static void main(String args[])
	{
		System.out.println(String.format("%30s", "AUTOMATED TELLER MACHINE"));
		Atm a=new Atm(500);
		while(true)
		{	
			System.out.println("Choose 1 for Deposit");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for balance");
			System.out.println("Choose 4 for exit");
			Scanner sc=new Scanner(System.in);
			int choice,amount;
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println(String.format("%30s", "DEPOSIT"));
					   System.out.println("enter the amount to be deposited");
					   amount=sc.nextInt();
					   a.deposit(amount);
					   System.out.println("Amount has been deposited...");
					   System.out.println();
					   break;
				case 2:System.out.println(String.format("%30s", "WITHDRAW"));
					   System.out.println("enter the amount to be withdrawn");
					   amount=sc.nextInt();
					   if(a.balance<amount)
					   {
						   System.out.println("Insufficient Balance");
						   System.out.println();
						   break;
					   }
					   a.withdraw(amount);
					   System.out.println("Amount withdrawn...");
					   System.out.println();
					   break;
				case 3:System.out.println(String.format("%30s", "BALANCE ENQUIRY"));
					   System.out.println("Balance:"+a.getBalance());
					   System.out.println();
					   break;
				case 4:System.exit(0);
					   break;
			}
		}
	}
}