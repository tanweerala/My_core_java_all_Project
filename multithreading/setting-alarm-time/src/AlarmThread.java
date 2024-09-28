public class AlarmThread extends Thread 
{
	private int time;
	public AlarmThread(int time)
	{
		this.time=time;
	}
	public void run()
	{
		try 
		{
			Thread.sleep(time*1000);
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
		for(int c=1;c<=5;c++)
		{
			Alarm.ringAlarm();
			try 
			{
				Thread.sleep(5000);
			}
			catch(Exception ex) 
			{
				System.out.println(ex);
			}
		}
	}
}
