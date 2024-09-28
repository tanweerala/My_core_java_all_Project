import java.util.Scanner;

public class DigitsSum 
{
	public static void main(String[] args) 
	{
		//code to accept a number from user find sum of all digits
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int rem,sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of all digits is:"+sum);
	}
}
