public class App3 
{
	public static void main(String[] args) 
	{
		int x=1,y=1,z;
		System.out.println(x);
		while(y<=50)
		{
			System.out.println(y);
			z=x+y;
			x=y;
			y=z;
		}
	}
}
