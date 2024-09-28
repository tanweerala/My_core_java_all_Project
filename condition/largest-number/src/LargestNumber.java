public class LargestNumber 
{
	public static void main(String[] args) 
	{
		int num1=70;
		int num2=70;
		int num3=41;
		//Write code to display largest number
		if(num1>=num2 && num1>=num3)
			System.out.println(num1);
		else if(num2>=num1 && num2>=num3)
			System.out.println(num2);
		else
			System.out.println(num3);
	}
}
