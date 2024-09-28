public class App2 
{
	public static void main(String[] args) 
	{
		String str="ABHISHEK";
		int x=str.length();
		for(int r=0;r<x;r++)
		{
			for(int c=0;c<=r;c++)
			{
				//char ch=str.charAt(c);
				//System.out.print(ch);
				System.out.println(str.charAt(c));
			}
			System.out.println();
		}
	}
}
