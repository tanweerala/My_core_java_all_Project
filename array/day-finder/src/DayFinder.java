import java.util.Scanner;

public class DayFinder 
{
	public static void main(String[] args) 
	{
		String[] days= {"Thurday","Firday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any date of this month:");
		int date=sc.nextInt();
		System.out.println("Day:"+days[date%7]);
	}
}
