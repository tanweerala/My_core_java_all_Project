public class Account 
{
	String name;//Instance variable
	int amount;//Instance variable
	
	public Account(String arg1,int arg2)//Constructor
	{
		name=arg1;
		amount=arg2;
	}
	public String getName()
	{
		return name;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setName(String arg)
	{
		name=arg;
	}
	public void setAmount(int arg)
	{
		amount=arg;
	}
}
