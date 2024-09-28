import java.time.LocalDate;
import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		String str1="cetpa";
		String str2="Cetpa";
		//boolean res=str1.equals(str2);
		boolean res=str1.equalsIgnoreCase(str2);
		System.out.println(res);
	}
}
