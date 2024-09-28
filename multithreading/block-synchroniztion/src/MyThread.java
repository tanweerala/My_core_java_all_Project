public class MyThread extends Thread
{
	AA obj;
	public MyThread(AA obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.method1();
	}
}
