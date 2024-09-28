import java.util.Scanner;

public class PalinDrome 
{
	public static void main(String[] args) 
	{
		//code to accept a number from user and check whether number is palindrome or not
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
}
