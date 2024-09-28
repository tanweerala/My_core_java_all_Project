public class LargestNumber
{
	public void max(int x,int y,int z)
	{
		int m=x>y?x:y;
		m=z>m?z:m;
		System.out.println(m);
	}
	public void max(int x,int y)
	{
		int m=x>y?x:y;
		System.out.println(m);
	}
	public void max(float x,float y)
	{
		float m=x>y?x:y;
		System.out.println(m);
	}
	public void max(int x,float y)
	{
		float m=x>y?x:y;
		System.out.println(m);
	}
	public void max(float x,int y)
	{
		float m=x>y?x:y;
		System.out.println(m);
	}
}
