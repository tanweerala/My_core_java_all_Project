public class DiscountFinder3
{
  public static void main(String[] args)
  {
	int amount=7000;
	double discount=0.0;
	if(amount>8000)
	{
  	  System.out.println("You are eligible for 20% discount"); 
	  discount=amount*.20;
	}
	else if(amount>6000)	
	{
	  System.out.println("You are eligible for 15% discount"); 
	  discount=amount*.15;
	}
        else if(amount>4000)
	{
	  System.out.println("You are eligible for 10% discount"); 
	  discount=amount*.10;
	}
	else if(amount>2000)
	{
	  System.out.println("You are eligible for 5% discount"); 
	  discount=amount*.05;
	}
	System.out.println("Discount value is:"+discount);
  }
}