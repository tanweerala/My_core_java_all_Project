public class App 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int r=1;r<=n;r++)
		{
			//Loop to print space row wise
			//This loop will run n-r times
			for(int c=n-r;c>=1;c--)
			{
				System.out.print(" ");
			}
			//Loop to print * row wise
			//This loop will run r times
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
