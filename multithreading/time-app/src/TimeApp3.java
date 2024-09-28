import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
public class TimeApp3
{
	JFrame frame=new JFrame("Time App");
	JLabel label=new JLabel();
	public TimeApp3()
	{
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
		frame.setLocationRelativeTo(null);
		frame.add(label);
		label.setFont(new Font("arial",Font.PLAIN,30));
		new TimeThread().start();
		frame.setVisible(true);
	}
	class TimeThread extends Thread
	{
		public void run()
		{
			String x="AM";
			while(true)
			{
				LocalTime tm=LocalTime.now();
				int h=tm.getHour();
				if(h>12)
				{
					x="PM";
					h-=12;
				}
				else
					x="AM";
				int m=tm.getMinute();
				int s=tm.getSecond();
				String time=h+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s)+" "+x;
				label.setText(time);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
			}
		}
	}
	public static void main(String[] args) 
	{
		new TimeApp3();
	}
}
