public class Calculator 
{
	private int num;
	public Calculator(int n)
	{
		num=n;
	}
	public void showSquare1()
	{
		int sq=num*num;
		System.out.println("Square1:"+sq);
	}
	public static void showSquare2(int x)
	{
		int sq=x*x;
		System.out.println("Square2:"+sq);
	}
}
