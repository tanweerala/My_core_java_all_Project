import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		String[]arr= {"Amit","Manoj","Hemant","Imran","Kuldeep","Akash","Ravi","Neha"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(name))
			{
				System.out.println("Name exists");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Name does not exist");
	}
}
