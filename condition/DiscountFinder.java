public class DiscountFinder
{
  public static void main(String[] args)
  {
	int amount=1000;
	double discount=0.0;
	if(amount>8000)
	{
	  discount=amount*.20;
	}
	if(amount>6000 && amount<=8000)
	{
	  discount=amount*.15;
	}
	if(amount>4000 && amount<=6000)
	{
	  discount=amount*.10;
	}
	if(amount>2000 && amount<=4000)
	{
	   discount=amount*.05;
        }
	System.out.println("Discount value is:"+discount);
  }
}