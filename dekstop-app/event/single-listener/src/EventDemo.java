import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo 
{
	JFrame frame=new JFrame("Event demo");
	JPanel panel=new JPanel();
	JButton button1=new JButton("Red Background");
	JButton button2=new JButton("Blue Background");
	JButton button3=new JButton("Black Background");
	public EventDemo()
	{
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		ColorListener listener=new ColorListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		frame.setVisible(true);
	}
	class ColorListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			//getSource() is a method of ActionEvent class
			//It returns reference of event source
			//Event source can be button clicked by user,label touched by user,etc
			JButton bb=(JButton)evt.getSource();
			//Run this code when event source is button1
			if(bb==button1)
				panel.setBackground(Color.red);
			//Run this code when event source is button2
			else if(bb==button2)
				panel.setBackground(Color.blue);
			//Run this code when event source is button3
			else if(bb==button3)
				panel.setBackground(Color.black);
		}
	}
	public static void main(String[] args) 
	{
		new EventDemo();
	}
}
