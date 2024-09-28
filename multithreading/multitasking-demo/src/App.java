public class App 
{
	public static void main(String[] args) 
	{
		TableTask task1=new TableTask(12);
		TableTask task2=new TableTask(19);
		TableTask task3=new TableTask(7);
		task1.start();
		task2.start();
		task3.start();
	}
}
