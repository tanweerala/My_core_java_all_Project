import java.util.Scanner;

public class DayFinder3 
{
	public static void main(String[] args) 
	{
		String[] days= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thurday","Firday",};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any month of this year:");
		int month=sc.nextInt();
		System.out.print("Enter any date of entered month:");
		int date=sc.nextInt();
		int[] nod= {31,28,31,30,31,30,31,31,30,31,30};
		for(int i=0;i<month-1;i++)
		{
			date+=nod[i];
		}
		System.out.println("Day:"+days[date%7]);
	}
}
