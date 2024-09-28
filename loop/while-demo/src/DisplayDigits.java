import java.util.Scanner;

public class DisplayDigits 
{
	public static void main(String[] args) 
	{
		//code to accept a number from user and display digits of that number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int rem;
		while(num!=0)
		{
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}
}
