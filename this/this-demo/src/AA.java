public class AA 
{
	private int num=60;
	public void show()
	{
		int num=10;
		System.out.println(num);
		System.out.println(this.num);
	}
	public static void main(String[] args) 
	{
		//AA obj=new AA();
		//obj.show();
		new AA().show();
	}
}
