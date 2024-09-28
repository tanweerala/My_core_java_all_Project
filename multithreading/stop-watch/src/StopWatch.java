import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
public class StopWatch
{
	JFrame frame=new JFrame("Stop Watch");
	JLabel label=new JLabel("00:00:00");
	int h=0,m=0,s=0;
	public StopWatch()
	{
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
		frame.setLocationRelativeTo(null);
		frame.add(label);
		label.setFont(new Font("arial",Font.PLAIN,30));
		new WatchThread().start();
		frame.setVisible(true);
	}
	class WatchThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
				label.setText(time);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
				s++;
				if(s==60)
				{
					s=0;
					m++;
					if(m==60)
					{
						m=0;
						h++;
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new StopWatch();
	}
}
