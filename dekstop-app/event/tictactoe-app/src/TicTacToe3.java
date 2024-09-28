import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class TicTacToe3 
{
	JFrame frame=new JFrame("Tic Tac Toe");
	JPanel[] panels=new JPanel[3];
	JLabel label=new JLabel("First player turn...");
	JButton[] buttons=new JButton[9];
	JButton reset=new JButton("RESET");
	ImageIcon icon1=new ImageIcon(getClass().getResource("images/user1.png"));
	ImageIcon icon2=new ImageIcon(getClass().getResource("images/user2.png"));
	int player,winner=0,count=0;
	Random ra=new Random();
	public TicTacToe3()
	{
		frame.setSize(500,580);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		addPanels();
		player=ra.nextInt(2)+1;
;		frame.setVisible(true);
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
		TicListener listener=new TicListener();
		for(int i=0;i<9;i++)
		{
			buttons[i]=new JButton();
			buttons[i].addActionListener(listener);
			panels[1].add(buttons[i]);
			buttons[i].setBackground(Color.yellow);
		}
		addResetButton();
	}
	private void addResetButton()
	{
		panels[2].add(reset);
		reset.setFont(new Font("arial",Font.PLAIN,20));
		reset.addActionListener(new ResetListener());
		reset.setEnabled(false);
	}
	class TicListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			JButton bb=(JButton)evt.getSource();
			if(bb.getIcon()!=null ||winner==1)
			{
				JOptionPane.showMessageDialog(frame,"Wrong clicked");
				return;//It terminates execution of method
			}
			//code to set image on button that would be clicked
			if(player==1)
			{
				bb.setIcon(icon1);
				player=2;
				messagePanel("Second player turn...",Color.orange,Color.white);
			}
			else if(player==2)
			{
				bb.setIcon(icon2);
				player=1;
				messagePanel("First player turn...",Color.cyan,Color.blue);
			}
			findWinner();
			count++;
			if(count==9 && winner==0)
			{
				messagePanel("Game over...",Color.red,Color.white);
				reset.setEnabled(true);
				JOptionPane.showMessageDialog(frame,"No one is winner...");
			}
		}//end of actionPerformed method
		private void findWinner()
		{
			if(buttons[0].getIcon()==icon1 && buttons[1].getIcon()==icon1 && buttons[2].getIcon()==icon1)
				announceWinner(0,1,2);
			else if(buttons[0].getIcon()==icon2 && buttons[1].getIcon()==icon2 && buttons[2].getIcon()==icon2)
				announceWinner(0,1,2);
			if(buttons[3].getIcon()==icon1 && buttons[4].getIcon()==icon1 && buttons[5].getIcon()==icon1)
				announceWinner(3,4,5);
			else if(buttons[3].getIcon()==icon2 && buttons[4].getIcon()==icon2 && buttons[5].getIcon()==icon2)
				announceWinner(3,4,5);
			if(buttons[6].getIcon()==icon1 && buttons[7].getIcon()==icon1 && buttons[8].getIcon()==icon1)
				announceWinner(6,7,8);
			else if(buttons[6].getIcon()==icon2 && buttons[7].getIcon()==icon2 && buttons[8].getIcon()==icon2)
				announceWinner(6,7,8);
			if(buttons[0].getIcon()==icon1 && buttons[3].getIcon()==icon1 && buttons[6].getIcon()==icon1)
				announceWinner(0,3,6);
			else if(buttons[0].getIcon()==icon2 && buttons[3].getIcon()==icon2 && buttons[6].getIcon()==icon2)
				announceWinner(0,3,6);
			if(buttons[1].getIcon()==icon1 && buttons[4].getIcon()==icon1 && buttons[7].getIcon()==icon1)
				announceWinner(1,4,7);
			else if(buttons[1].getIcon()==icon2 && buttons[4].getIcon()==icon2 && buttons[7].getIcon()==icon2)
				announceWinner(1,4,7);
			if(buttons[2].getIcon()==icon1 && buttons[5].getIcon()==icon1 && buttons[8].getIcon()==icon1)
				announceWinner(2,5,8);
			else if(buttons[2].getIcon()==icon2 && buttons[5].getIcon()==icon2 && buttons[8].getIcon()==icon2)
				announceWinner(2,5,8);
			if(buttons[0].getIcon()==icon1 && buttons[4].getIcon()==icon1 && buttons[8].getIcon()==icon1)
				announceWinner(0,4,8);
			else if(buttons[0].getIcon()==icon2 && buttons[4].getIcon()==icon2 && buttons[8].getIcon()==icon2)
				announceWinner(0,4,8);
			if(buttons[2].getIcon()==icon1 && buttons[4].getIcon()==icon1 && buttons[6].getIcon()==icon1)
				announceWinner(2,4,6);
			else if(buttons[2].getIcon()==icon2 && buttons[4].getIcon()==icon2 && buttons[6].getIcon()==icon2)
				announceWinner(2,4,6);
		}//end of findWinner method
		private void announceWinner(int i,int j,int k)
		{
			reset.setEnabled(true);
			winner=1;
			messagePanel("Game over...",Color.red,Color.white);
			buttons[i].setBackground(Color.green);
			buttons[j].setBackground(Color.green);
			buttons[k].setBackground(Color.green);
			if(player==2)
				JOptionPane.showMessageDialog(frame,"First player won...");
			else
				JOptionPane.showMessageDialog(frame,"Second player won...");
		}
	}//end of TicListener class
	class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			messagePanel("First player turn...",Color.cyan,Color.blue);
			player=ra.nextInt(2)+1;
			count=0;
			winner=0;
			for(int i=0;i<9;i++)
			{
				buttons[i].setBackground(Color.yellow);
				buttons[i].setIcon(null);
			}
			reset.setEnabled(false);
		}
	}//end of ResetListener
	private void messagePanel(String msg,Color bg,Color fg)
	{
		label.setText(msg);
		panels[0].setBackground(bg);
		label.setForeground(fg);
	}
	public static void main(String[] rehan) 
	{
		new TicTacToe3();
	}
}//end of outer class
