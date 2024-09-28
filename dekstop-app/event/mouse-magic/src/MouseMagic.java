import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class MouseMagic 
{
	JFrame frame=new JFrame("Mouse Magic");
	JLabel label=new JLabel("TOUCH ME TO SEE MAGIC");
	int x=200,y=100;
	Random ra=new Random();
	boolean move=true;
	public MouseMagic()
	{
		frame.setSize(1200,630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		label.setBounds(x,y,300,33);
		label.setFont(new Font("arial",0,20));
		frame.add(label);
		label.addMouseListener(new MagicListener());
		frame.addKeyListener(new MagicStopListener());
		frame.setVisible(true);
	}
	class MagicListener implements MouseListener
	{
		public void mouseEntered(MouseEvent e)
		{
			if(move)
			{
				x=ra.nextInt(1000);
				y=ra.nextInt(550);
				label.setLocation(x,y);
			}
			move=true;
		}
		public void mouseExited(MouseEvent e){}
		public void mouseClicked(MouseEvent e){} 
		public void mousePressed(MouseEvent e){} 
		public void mouseReleased(MouseEvent e){} 
	}
	class MagicStopListener implements KeyListener
	{
		public void keyPressed(KeyEvent e) 
		{
			char ch=e.getKeyChar();
			if(ch=='a')
				move=false;
		}
		public void keyReleased(KeyEvent e){} 
		public void keyTyped(KeyEvent e) {}		
	}
	public static void main(String[] args) 
	{
		new MouseMagic();
	}
}
