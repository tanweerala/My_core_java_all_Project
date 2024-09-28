public class App 
{
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		try
		{
			int sum=cal.add(90,20);
			System.out.println(sum);
		}
		catch(NumberException ex)
		{
			System.out.println(ex);
		}
	}
}
