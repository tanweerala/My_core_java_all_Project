import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
public class ExamTimer
{
	JFrame frame=new JFrame("Stop Watch");
	JLabel label=new JLabel();
	int m,s,q=3;
	public ExamTimer()
	{
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
		frame.setLocationRelativeTo(null);
		frame.add(label);
		label.setFont(new Font("arial",Font.PLAIN,30));
		setTime();
		new ExamThread().start();
		frame.setVisible(true);
	}
	private void setTime()
	{
		m=q/2;
		s=q%2==0?0:30;
		String time=(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
		label.setText(time);
	}
	class ExamThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				String time=(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
				label.setText(time);
				try {
					Thread.sleep(100);
				}catch(Exception ex) {}
				if(s==0)
				{
					if(m==0)
						break;
					s=60;
					m--;
				}
				s--;
			}
		}
	}
	public static void main(String[] args) 
	{
		new ExamTimer();
	}
}
