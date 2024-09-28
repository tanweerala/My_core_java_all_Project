public class AdditionPlus extends Addition 
{ 
	private int num3;
	public AdditionPlus(int a1,int a2,int a3)
	{
		super(a1,a2);
		num3=a3;
	}
	public int add()
	{
		int sum=super.add();
		sum=sum+num3;
		return sum;
	}
}
