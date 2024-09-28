import java.util.Scanner;

public class App3 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int c=1;c<=5;c++)
		{
			System.out.print("Enter the number"+c+":");
			int num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum="+sum);
	}
}
