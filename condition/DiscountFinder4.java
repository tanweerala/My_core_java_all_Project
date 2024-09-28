public class DiscountFinder4
{
  public static void main(String[] args)
  {
	int amount=8970;
	if(amount<=2000)
	{
	  System.out.println("Your are not eligible for any discount");
	}
	else
	{
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
          System.out.println("Payable value is:"+(amount-discount));
	}
  }
}