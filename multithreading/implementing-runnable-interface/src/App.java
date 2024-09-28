public class App 
{
	public static void main(String[] args) 
	{
		Task task=new Task();
		Thread th=new Thread(task);//This code will create a thread
		th.start();//This code will send thread into runnable state
	}
}
