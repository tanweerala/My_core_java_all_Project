public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		int[] x= {10,20,30};
		int y=0;
		int i=0;
		try
		{
			int z=x[i]/y;
			System.out.println(z);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array index "+i+" is not bound");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		System.out.println("Execution ends");
	}
}
