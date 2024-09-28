public class App3 
{
	public static void main(String[] args) 
	{
		String str="rehanahmad@gmail.com";
		int i1=str.indexOf('@');
		if(i1==-1)
			System.out.println("Invalid email");
		else
			System.out.println("Valid email");
	}
}
