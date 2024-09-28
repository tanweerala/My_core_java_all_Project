import java.util.Scanner;

public class ArithmeticTask 
{
	protected int num1;
	protected int num2;
	protected int res;
	public void acceptNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		num1=sc.nextInt();
		System.out.print("Enter second number:");
		num2=sc.nextInt();
	}
	public void showResult()
	{
		System.out.println("Result="+res);
	}
}
