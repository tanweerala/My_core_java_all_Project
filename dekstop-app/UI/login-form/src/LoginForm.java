import javax.swing.*;
import java.awt.*;
public class LoginForm 
{
	JFrame frame=new JFrame("Login Form");
	JLabel label1=new JLabel("Enter user id");
	JLabel label2=new JLabel("Enter password");
	JTextField textbox=new JTextField();
	JPasswordField passbox=new JPasswordField();
	JButton button1=new JButton("Submit");
	JButton button2=new JButton("Cancel");
	Font font1=new Font("arial",0,25);
	Font font2=new Font("times new roman",0,20);
	public LoginForm()
	{
		frame.setSize(600,500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addLabels();
		addInputBox();
		addButtons();
		frame.setVisible(true);
	}
	private void addLabels()
	{
		label1.setBounds(50,80,200,30);
		frame.add(label1);
		label1.setFont(font1);
		label2.setBounds(50,200,200,30);
		frame.add(label2);
		label2.setFont(font1);
	}
	private void addInputBox()
	{
		textbox.setBounds(250,80,280,33);
		frame.add(textbox);
		textbox.setFont(font2);
		passbox.setBounds(250,200,280,33);
		frame.add(passbox);
		passbox.setFont(font2);
	}
	private void addButtons()
	{
		button1.setBounds(200,320,120,33);
		frame.add(button1);
		button1.setFont(font2);
		button2.setBounds(340,320,120,33);
		frame.add(button2);
		button2.setFont(font2);
	}
	public static void main(String[] args) 
	{
		new LoginForm();
	}
}
