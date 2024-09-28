public class LargestNumber3 
{
	public static void main(String[] args) 
	{
		int num1=170;
		int num2=80;
		int num3=166;
		int max=num1>=num2?num1:num2;
		max=max>=num3?max:num3;
		System.out.println(max);
	}
}
