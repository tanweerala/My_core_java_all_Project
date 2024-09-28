public class AlarmThread extends Thread 
{
	private int time;
	public AlarmThread(int time)
	{
		this.time=time;
	}
	public void run()
	{
		Alarm alarm=new Alarm();
		pause(time);
		for(int c=1;c<=5;c++)
		{
			alarm.ringAlarm();
			pause(5);
		}
	}
	public void pause(int time)
	{
		try 
		{
			Thread.sleep(time*1000);
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
