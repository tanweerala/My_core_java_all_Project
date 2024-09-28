public class Account 
{
	private String name;
	private int amount;
	
	public Account(String arg1,int arg2)
	{
		name=arg1;
		amount=arg2;
	}
	public String getName()
	{
		System.out.println("Control inside account...");
		return name;
	}
	public int getAmount()
	{
		System.out.println("Control inside account...");
		return amount;
	}
	public void setAmount(int arg)
	{
		System.out.println("Control inside account...");
		amount=arg;
	}
}
