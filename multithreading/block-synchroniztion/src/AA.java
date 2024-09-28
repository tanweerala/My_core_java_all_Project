public class AA 
{
	public void method1()
	{
		System.out.println("Method called");
		System.out.println("Method started execution");
		System.out.println("Method will print alphabets");
		synchronized(this)
		{
			for(int c=65;c<=90;c++)
			{
				System.out.print((char)c+",");
			}
			System.out.println();
		}
	}
}
