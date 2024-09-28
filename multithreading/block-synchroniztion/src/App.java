public class App 
{
	public static void main(String[] args) 
	{
		AA ref=new AA();
		MyThread th1=new MyThread(ref);
		MyThread th2=new MyThread(ref);
		MyThread th3=new MyThread(ref);
		th1.start();
		th2.start();
		th3.start();
	}
}
