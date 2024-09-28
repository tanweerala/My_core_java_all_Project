import java.io.*;
public class AA 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		try
		{
			FileReader fr=new FileReader("aaa.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
