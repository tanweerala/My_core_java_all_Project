import java.util.Scanner;

public class App3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		String res="";
		while(num!=0)
		{
			int rem=num%16;
			if(rem>=10 && rem<=15)
				res=(char)(55+rem)+res;
			else
				res=rem+res;
			num=num/16;
		}
		System.out.println(res);
	}
}
