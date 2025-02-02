import javax.swing.*;
import java.awt.*;

public class ChessUi3 
{
	JFrame frame=new JFrame("Chess");
	JButton[][]buttons=new JButton[8][8];
	public ChessUi3()
	{
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		addButtons();
		frame.setVisible(true);
	}
	private void addButtons()
	{
		GridLayout layout=new GridLayout(8,8);
		frame.setLayout(layout);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				buttons[i][j]=new JButton();
				frame.add(buttons[i][j]);
				if((i+j)%2==0)
					buttons[i][j].setBackground(Color.cyan);
				else
					buttons[i][j].setBackground(Color.white);
			}
		}
		setImages();
	}
	private void setImages()
	{
		ImageIcon icon3=new ImageIcon(getClass().getResource("image/bp.gif"));
		ImageIcon icon4=new ImageIcon(getClass().getResource("image/wp.gif"));
		for(int i=0;i<8;i++)
		{
			ImageIcon icon1=new ImageIcon(getClass().getResource("image/b"+i+".gif"));
			buttons[0][i].setIcon(icon1);
			ImageIcon icon2=new ImageIcon(getClass().getResource("image/w"+i+".gif"));
			buttons[7][i].setIcon(icon2);
			buttons[1][i].setIcon(icon3);
			buttons[6][i].setIcon(icon4);
		}
	}
	public static void main(String[] args) 
	{
		new ChessUi3();
	}
}
