import java.util.Scanner;

public class BankService 
{
	Account ac=new Account("Amit",5000);
	Scanner sc=new Scanner(System.in);
	public void showBalance()
	{
		System.out.println("Control inside bank service...");
		int balance=ac.getAmount();
		String name=ac.getName();
		System.out.println("---------------------------------");
		System.out.println("Dear "+name);
		System.out.println("Your current balance is :"+balance);
		System.out.println("---------------------------------");
	}
	public void depositMoney()
	{
		System.out.println("Control inside bank service...");
		System.out.println("---------------------------------");
		System.out.print("Enter amount to be depositted:");
		int amt=sc.nextInt();
		String name=ac.getName();
		int balance=ac.getAmount();
		int total=balance+amt;
		ac.setAmount(total);
		System.out.println("Dear "+name);
		System.out.println("Amount "+amt+" credited into your account");
		System.out.println("---------------------------------");
	}
	public void withdrawMoney()
	{
		System.out.println("Control inside bank service...");
		String name=ac.getName();
		System.out.println("---------------------------------");
		System.out.print("Enter amount to be withdrawn:");
		int amt=sc.nextInt();
		int balance=ac.getAmount();
		System.out.println("Dear "+name);
		if(amt>balance)
		{
			System.out.println("Sorry you do not have sufficient amount");
		}
		else
		{
			int total=balance-amt;
			ac.setAmount(total);
			System.out.println("Amount "+amt+" debited from your account");
		}
		System.out.println("---------------------------------");
	}
}
