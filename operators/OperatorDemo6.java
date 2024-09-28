public class OperatorDemo6
{
  public static void main(String[] args)
  {
	int x=10,y;
	y=++x - (x++ - ++x);
	System.out.println(x);
	System.out.println(y);
  }
}