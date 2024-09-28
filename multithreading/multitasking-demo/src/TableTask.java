public class TableTask extends Thread 
{
	private int num;
	public TableTask(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Run method is started...");
		for(int ctr=1;ctr<=10;ctr++)
		{
			int res=num*ctr;
			System.out.println(num+"*"+ctr+"="+res);
		}
	}
}
