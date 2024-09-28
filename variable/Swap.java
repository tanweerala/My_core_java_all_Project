public class Swap
{
  public static void main(String[] args)
  {
	int num1=90;
	int num2=20;
	System.out.println("Before assigning");
	System.out.println(num1);//90
	System.out.println(num2);//20
	num1=num2;
	num2=num1;
	System.out.println("After assigning");
	System.out.println(num1);//20
	System.out.println(num2);//20
  }
}