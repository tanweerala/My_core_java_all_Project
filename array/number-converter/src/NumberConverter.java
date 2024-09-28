import java.util.Scanner;

public class NumberConverter 
{
	static String[] x= {"","one","two","three","four","five","six","seven","eight","nine","ten","elven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightreen","nineteen"};
	static String[] y= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	static void convert(int num)
	{
		if(num>=1 && num<=19)
		{
			System.out.print(x[num]+" ");
		}
		if(num>=20 && num<=99)
		{
			System.out.print(y[num/10]+" "+x[num%10]+" ");
		}
		if(num>=100 && num<=999)
		{
			convert(num/100);
			System.out.print("hundred ");
			convert(num%100);
		}
		if(num>=1000 && num<=99999)
		{
			convert(num/1000);
			System.out.print("thousand ");
			convert(num%1000);
		}
		if(num>=100000 && num<=9999999)
		{
			convert(num/100000);
			System.out.print("lakh ");
			convert(num%100000);
		}
		if(num>=10000000 && num<=999999999)
		{
			convert(num/10000000);
			System.out.print("caror ");
			convert(num%10000000);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		convert(num);
	}
}
