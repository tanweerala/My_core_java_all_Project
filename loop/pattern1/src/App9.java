public class App9 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((char)(r+64));
			}
			System.out.println();
		}
	}
}
