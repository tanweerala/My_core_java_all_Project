import java.util.Scanner;

public class App4 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers do you want to add:");
		int x=sc.nextInt();
		int sum=0;
		for(int c=1;c<=x;c++)
		{
			System.out.print("Enter the number"+c+":");
			int num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum="+sum);
	}
}
