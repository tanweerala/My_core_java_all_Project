public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		int[] x= {10,20,30};
		int y=10;
		try
		{
			int z=x[4]/y;
			System.out.println(z);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
