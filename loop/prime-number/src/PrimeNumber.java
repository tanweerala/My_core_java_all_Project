import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Divided by 2 so it is not prime");
		}
		else
		{
			int sr=(int)Math.sqrt(num);
			int flag=0;
			for(int ctr=3;ctr<=sr;ctr+=2)
			{
				if(num%ctr==0)
				{
					System.out.println("Divided by "+ctr+" so it is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is prime");
			}
		}
	}
}
