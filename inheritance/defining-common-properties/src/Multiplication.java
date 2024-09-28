import java.util.Scanner;

public class Multiplication 
{
	private int num1;
	private int num2;
	private int res;
	public void acceptNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		num1=sc.nextInt();
		System.out.print("Enter second number:");
		num2=sc.nextInt();
	}
	public void multiply()
	{
		res=num1*num2;
	}
	public void showResult()
	{
		System.out.println("Result="+res);
	}
}
