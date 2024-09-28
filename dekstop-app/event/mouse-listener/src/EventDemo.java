import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo 
{
	JFrame frame=new JFrame("Event demo");
	JLabel label=new JLabel("CETPA Infotech");
	JPanel panel=new JPanel();
	public EventDemo()
	{
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		label.addMouseListener(new LabelListener());
		frame.setVisible(true);
	}
	class LabelListener implements MouseListener
	{
		Font fo;
		public void mouseEntered(MouseEvent e)
		{
			fo=label.getFont();
			label.setFont(new Font("arial",Font.PLAIN,30));
		}
		public void mouseExited(MouseEvent e) 
		{
			label.setFont(fo);
		}
		public void mouseClicked(MouseEvent e){} 
		public void mousePressed(MouseEvent e){} 
		public void mouseReleased(MouseEvent e){} 
	}
	public static void main(String[] args) 
	{
		new EventDemo();
	}
}
