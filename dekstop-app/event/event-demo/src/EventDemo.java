import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo 
{
	JFrame frame=new JFrame("Event demo");
	JPanel panel=new JPanel();
	JButton button1=new JButton("Red Background");
	JButton button2=new JButton("Blue Background");
	public EventDemo()
	{
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		button1.addActionListener(new RedListener());
		panel.add(button2);
		button2.addActionListener(new BlueListener());
		frame.setVisible(true);
	}
	class RedListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			panel.setBackground(Color.red);
		}
	}
	class BlueListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			panel.setBackground(Color.blue);
		}
	}
	public static void main(String[] args) 
	{
		new EventDemo();
	}
}
