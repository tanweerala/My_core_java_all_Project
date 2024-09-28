import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{	
		//Code to create object from Scanner class 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		//nextInt() method accepts value from user and returns that value to the program
		int num=sc.nextInt();
		int sq=num*num;
		System.out.println("Square of "+num+":"+sq);
	}
}
