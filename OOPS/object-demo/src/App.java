public class App 
{
	public static void main(String[] args) 
	{
		Account ac=new Account("Rahul",5000);
		
		int x=ac.getAmount();
		System.out.println("You current balance is:"+x);
		
		ac.setAmount(x-2000);
		x=ac.getAmount();
		System.out.println("You current balance is:"+x);
	}
}
