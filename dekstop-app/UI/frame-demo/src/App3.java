import javax.swing.*;
public class App3 
{
	JFrame frame=new JFrame("Pass Title Here");
	//Constructor of class App2
	public App3()
	{
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new App3();
	}
}
