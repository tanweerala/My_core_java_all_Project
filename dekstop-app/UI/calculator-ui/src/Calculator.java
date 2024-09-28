import javax.swing.*;
import java.awt.*;
public class Calculator 
{
	JFrame frame=new JFrame("Calculator");
	JTextField textbox=new JTextField("0");
	JPanel panel=new JPanel();
	JButton[] buttons=new JButton[20];
	public Calculator()
	{
		frame.setSize(400,480);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addTextBox();
		frame.setVisible(true);
	}
	private void addTextBox()
	{
		textbox.setBounds(20,30,360,40);
		frame.add(textbox);
		textbox.setFont(new Font("arial",Font.PLAIN,25));
		textbox.setHorizontalAlignment(JTextField.RIGHT);
		textbox.setEditable(false);
		textbox.setBackground(Color.white);
		textbox.setBorder(BorderFactory.createLineBorder(Color.black,1));
		addButtons();
	}
	private void addButtons()
	{
		panel.setBounds(20,100,360,320);
		frame.add(panel);
		//panel.setBackground(Color.yellow);
		panel.setLayout(new GridLayout(5,4,5,5));
		Font fo=new Font("arial",Font.PLAIN,20);
		String[] str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		for(int i=0;i<20;i++)
		{
			buttons[i]=new JButton(str[i]);
			buttons[i].setFont(fo);
			panel.add(buttons[i]);
			if(i==3 || i==7 || i==11|| i==15|| i==19)
				buttons[i].setForeground(Color.red);
			else
				buttons[i].setForeground(Color.blue);
		}
		buttons[17].setFont(new Font("arial",Font.BOLD,30));
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
}
