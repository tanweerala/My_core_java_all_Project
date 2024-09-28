public class App2 
{
	char ch;
	public static void main(String[] args) 
	{
		App2 obj=new App2();
		if(obj.ch=='\u0000')
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
	}
}
