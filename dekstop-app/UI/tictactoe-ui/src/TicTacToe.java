import javax.swing.*;
import java.awt.*;
public class TicTacToe 
{
	JFrame frame=new JFrame("Tic Tac Toe");
	JPanel[] panels=new JPanel[3];
	JLabel label=new JLabel("First player turn...");
	JButton[] buttons=new JButton[9];
	JButton reset=new JButton("RESET");
	public TicTacToe()
	{
		frame.setSize(500,580);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		addPanels();
		frame.setVisible(true);
	}
	private void addPanels()
	{
		for(int i=0;i<3;i++)
		{
			panels[i]=new JPanel();
			frame.add(panels[i]);
		}
		panels[0].setBounds(50,30,400,40);
		panels[1].setBounds(50,100,400,350);
		panels[2].setBounds(50,480,400,40);
		panels[0].setBackground(Color.cyan);
		panels[2].setOpaque(false);
		addLabel();
	}
	private void addLabel()
	{
		panels[0].add(label);
		label.setFont(new Font("elephant",Font.PLAIN,30));
		label.setForeground(Color.blue);
		addButtons();
	}
	private void addButtons()
	{
		panels[1].setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			buttons[i]=new JButton();
			panels[1].add(buttons[i]);
			buttons[i].setBackground(Color.yellow);
		}
		addResetButton();
	}
	private void addResetButton()
	{
		panels[2].add(reset);
		reset.setFont(new Font("arial",Font.PLAIN,20));
	}
	public static void main(String[] args) 
	{
		new TicTacToe();
	}
}
