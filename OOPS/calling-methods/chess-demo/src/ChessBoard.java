import java.awt.*;
import javax.swing.*;
public class ChessBoard 
{
	JFrame fr=new JFrame("Chess Baord");
	JButton[][]bt=new JButton[8][8];
	public ChessBoard()
	{
		fr.setSize(1000,600);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		addButtons();
		fr.setVisible(true);
	}
	private void addButtons()
	{
		GridLayout layout=new GridLayout(8,8);
		fr.setLayout(layout);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				bt[i][j]=new JButton();
				fr.add(bt[i][j]);
				if((i+j)%2==0)
					bt[i][j].setBackground(Color.black);
				else
					bt[i][j].setBackground(Color.white);
			}
		}
	}
	public static void main(String[] args) 
	{
		new ChessBoard();
	}
}
