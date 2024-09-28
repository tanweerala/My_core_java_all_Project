import java.util.Scanner;

public class DayFinder2 
{
	public static void main(String[] args) 
	{
		String[] days= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thurday","Firday",};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any date of this month:");
		int date=sc.nextInt();
		System.out.println("Day:"+days[date%7]);
	}
}
