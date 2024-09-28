public class Calculator 
{
	private int num1;
	private int num2;
	public Calculator(int a1,int a2)
	{
		num1=a1;
		num2=a2;
	}
	public void add()
	{
		int res=num1+num2;
		System.out.println("Result="+res);
	}
	public void multiply()
	{
		int res=num1*num2;
		System.out.println("Result="+res);
	}
}
