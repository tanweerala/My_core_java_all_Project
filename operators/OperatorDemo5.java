public class OperatorDemo5
{
  public static void main(String[] args)
  {
	int x=10,y;
	y=x++ - ++x;
	System.out.println(x);
	System.out.println(y);
  }
}