public class Calculator 
{
	private int num1;
	private int num2;
	public Calculator(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	//method to add value of num1 and num2
	public void add()
	{
		int res=num1+num2;
		System.out.println(res);
	}
	//method to subtract value of num2 from num1
	public void subtract()
	{
		int res=num1-num2;
		System.out.println(res);
	}
	//method to multiply value of num2 and num1
	public void multiply()
	{
		int res=num1*num2;
		System.out.println(res);
	}
	public void divide()
	{
		int res=num1/num2;
		System.out.println(res);
	}
	//method to divide value of num2 by num1
}
