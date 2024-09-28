import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		String res="";
		while(num!=0)
		{
			int rem=num%2;
			res=rem+res;
			num=num/2;
		}
		System.out.println(res);
	}
}
