import java.time.LocalDate;
import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username:");
		String user=sc.nextLine();
		user=user.trim();
		if(user.equals("admin"))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
	}
}
