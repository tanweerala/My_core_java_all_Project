public class Calculator 
{
	public int add(int num1,int num2)
	{
		if(num1<=0 || num2<=0)
		{
			NumberException ex=new NumberException("Number are not positive");
			throw ex;
		}
		return num1+num2;
	}
}
