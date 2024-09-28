import java.util.Random;

public class MyString 
{
	private String data;
	public MyString(String data)
	{
		this.data=data;
	}
	public String toString()
	{
		String[] str= {"You are fool","I am intelligent","This is CETPA","Jo dikhta hai wo hota nahi"};
		Random ra=new Random();
		int i=ra.nextInt(str.length);
		return str[i];
	}
}
