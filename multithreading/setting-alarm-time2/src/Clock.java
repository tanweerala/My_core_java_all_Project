public class Clock 
{
	public static void main(String[] args) 
	{
		new AlarmThread(10).start();
	}
}
