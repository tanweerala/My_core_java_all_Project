import java.time.LocalDate;

public class App 
{
	public static void main(String[] args) 
	{
		LocalDate ld=LocalDate.now();
		String date=ld.toString();
		System.out.println(date);
		String[] x=date.split("-");
		date=x[2]+"-"+x[1]+"-"+x[0];
		System.out.println(date);
	}
}
