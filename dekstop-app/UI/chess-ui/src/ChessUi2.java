import javax.swing.*;
import java.awt.*;

public class ChessUi2 
{
	JFrame frame=new JFrame("Chess");
	JButton[][]buttons=new JButton[8][8];
	public ChessUi2()
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
					buttons[i][j].setBackground(Color.black);
				else
					buttons[i][j].setBackground(Color.white);
			}
		}
	}
	public static void main(String[] args) 
	{
		new ChessUi2();
	}
}
