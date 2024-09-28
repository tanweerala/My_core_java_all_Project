public class App 
{
	public static void main(String[] args) 
	{
		AA obj1=new AA();
		AA obj2=new AA();
		AA obj3=new AA();
		obj1.x=10;
		obj1.y=10;
		obj2.x=40;
		obj2.y=40;
		obj3.x=4;
		obj3.y=4;
		int sum1=obj1.x+obj2.x+obj3.x;
		int sum2=obj1.y+obj2.y+obj3.y;
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
