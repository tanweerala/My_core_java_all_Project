import javax.swing.*;
import java.awt.*;
public class CountDown2
{
	JFrame frame=new JFrame("Count Down");
	JLabel label=new JLabel("Welcome to the CETPA");
	public CountDown2()
	{
		frame.setSize(500,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
		frame.setLocationRelativeTo(null);
		frame.add(label);
		label.setFont(new Font("arial",Font.PLAIN,30));
		new BlinkThread().start();
		frame.setVisible(true);
	}
	class BlinkThread extends Thread
	{
		public void run()
		{
			int time=100;
			while(true)
			{
				label.setVisible(true);
				try {
					Thread.sleep(time);
				}catch(Exception ex) {}
				label.setVisible(false);
				try {
					Thread.sleep(time);
				}catch(Exception ex) {}
				time+=2;
				if(time>=250)
				{
					label.setVisible(true);
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new CountDown2();
	}
}
