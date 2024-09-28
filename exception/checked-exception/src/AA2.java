import java.io.*;
public class AA2 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		try
		{
			FileReader fr=new FileReader("aa.txt");
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();
			while(str!=null)
			{
				System.out.println(str);
				str=br.readLine();
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
