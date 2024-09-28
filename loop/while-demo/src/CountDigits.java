import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		//code to accept a number from user count digits 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("It has "+count+" digits");
	}
}
