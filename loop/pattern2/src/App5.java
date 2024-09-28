public class App5 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int r=n;r>=1;r--)
		{
			for(int c=n-r;c>=1;c--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=2;r<=n;r++)
		{
			for(int c=n-r;c>=1;c--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
