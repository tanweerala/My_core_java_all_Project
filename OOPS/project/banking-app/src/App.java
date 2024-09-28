import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		BankService service=new BankService();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("-----------------------------");
			System.out.println("1:Enter 1 to view balance");
			System.out.println("2:Enter 2 to deposit money");
			System.out.println("3:Enter 3 to withdraw balance");
			System.out.println("4:Enter 4 to terminate program");
			System.out.println("-----------------------------");
			System.out.print("Enter your choice:");
			ch=sc.nextInt();
			if(ch==1)
			{
				service.showBalance();
			}
			else if(ch==2)
			{
				service.depositMoney();
			}
			else if(ch==3)
			{
				service.withdrawMoney();
			}
			else if(ch==4)
			{
				System.out.println("---------------------");
				System.out.println("Program is terminated");
				System.out.println("Thank you user");
				System.out.println("---------------------");
				break;
			}
			else
			{
				System.out.println("---------------------");
				System.out.println("Wrong choice");
				System.out.println("---------------------");
			}
		}
	}
}
