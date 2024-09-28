import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		int[]arr= {101,34,71,29,890,15,1888,78,456,24,100,59};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Number exists");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Number does not exist");
	}
}
