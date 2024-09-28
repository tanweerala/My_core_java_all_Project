public class App4 
{
	public static void main(String[] args) 
	{
		String str="rehanahmad@gmail.com";
		int i1=str.indexOf('@');
		if(i1==-1)
			System.out.println("Invalid email");
		else
		{
			int i2=str.lastIndexOf('.');
			if(i2==-1)
				System.out.println("Invalid email");
			else
			{
				if(i2<=i1+1)
					System.out.println("Invalid email");
				else
					System.out.println("Valid email");
			}
		}
			
	}
}
