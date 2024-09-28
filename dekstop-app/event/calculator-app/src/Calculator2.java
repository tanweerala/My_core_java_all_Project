import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator2 
{
	JFrame frame=new JFrame("Calculator");
	JTextField textbox=new JTextField("0");
	JPanel panel=new JPanel();
	JButton[] buttons=new JButton[20];
	public Calculator2()
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
		CalListener listener=new CalListener();
		for(int i=0;i<20;i++)
		{
			buttons[i]=new JButton(str[i]);
			buttons[i].addActionListener(listener);
			buttons[i].setFont(fo);
			panel.add(buttons[i]);
			if(i==3 || i==7 || i==11|| i==15|| i==19)
				buttons[i].setForeground(Color.red);
			else
				buttons[i].setForeground(Color.blue);
		}
		buttons[17].setFont(new Font("arial",Font.BOLD,30));
	}
	class CalListener implements ActionListener
	{
		private int ab=0;
		private int num1;
		private String op=null;
		public void actionPerformed(ActionEvent evt) 
		{
			JButton bb=(JButton)evt.getSource();
			//Arithmetic buttons(+,-,*,/) condition
			if(bb==buttons[7]||bb==buttons[11]||bb==buttons[15]||bb==buttons[19])
			{
				if(op!=null)
				{
					cal();
				}
				ab=1;
				num1=Integer.parseInt(textbox.getText());
				op=bb.getText();
			}
			//Digit buttons condition
			if(bb==buttons[4]||bb==buttons[5]||bb==buttons[6]||bb==buttons[8]||bb==buttons[9]||bb==buttons[10]||bb==buttons[12]||bb==buttons[13]||bb==buttons[14]||bb==buttons[16])
			{
				String btext=bb.getText();
				String ttext=textbox.getText();
				if(ttext.equals("0") || ab==1)
				{
					textbox.setText(btext);
					ab=0;
				}
				else
					textbox.setText(ttext+btext);
			}
			// C button code
			if(bb==buttons[2])
			{
				op=null;
				ab=0;
				textbox.setText("0");
			}
			//== button condition
			if(bb==buttons[18])
			{
				cal();
			}
		}//end of actionPerformed
		private void cal()
		{
			System.out.println("cal method called");
			int num2=Integer.parseInt(textbox.getText());
			if(num2==0)
			{
				return;
			}
			if(op.equals("+"))
			{
				int res=num1+num2;
				textbox.setText(String.valueOf(res));
			}
			else if(op.equals("-"))
			{
				int res=num1-num2;
				textbox.setText(String.valueOf(res));
			}
			else if(op.equals("*"))
			{
				int res=num1*num2;
				textbox.setText(String.valueOf(res));
			}
			else if(op.equals("/"))
			{
				int res=num1/num2;
				textbox.setText(String.valueOf(res));
			}
		}
	}//end of CalListener
	public static void main(String[] args) 
	{
		new Calculator2();
	}
}
