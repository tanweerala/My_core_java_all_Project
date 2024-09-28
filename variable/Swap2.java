public class Swap2
{
  public static void main(String[] args)
  {
	int num1=120;
	int num2=40;
	System.out.println("Before swapping");
	System.out.println(num1);
	System.out.println(num2);

	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;	

	System.out.println("After swapping");
	System.out.println(num1);//20
	System.out.println(num2);//20
  }
}