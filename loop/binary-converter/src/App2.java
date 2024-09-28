import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		String res="";
		while(num!=0)
		{
			int rem=num%8;
			res=rem+res;
			num=num/8;
		}
		System.out.println(res);
	}
}
