import java.util.Scanner;

public class CountDigits2 
{
	public static void main(String[] args) 
	{
		//code to accept a number from user count digits 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		long num=sc.nextLong();
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("It has "+count+" digits");
	}
}
