public class DiscountFinder2
{
  public static void main(String[] args)
  {
	int amount=4000;
	double discount=0.0;
	if(amount>8000)
	  discount=amount*.20;
	else if(amount>6000)
	  discount=amount*.15;
        else if(amount>4000)
	  discount=amount*.10;
	else if(amount>2000)
	  discount=amount*.05;
	System.out.println("Discount value is:"+discount);
  }
}