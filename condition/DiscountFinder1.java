public class DiscountFinder1
{
  public static void main(String[] args)
  {
	int amount=9000;
	double discount=0.0;
	if(amount>8000)
	{
	  discount=amount*.20;
	}
	else
	{
	  if(amount>6000)
	  {
	    discount=amount*.15;
	  }
	  else
	  {
	     if(amount>4000)
	     {
	        discount=amount*.10;
	     }
	     else
	     {
		if(amount>2000)
		{
		   discount=amount*.05;
        	}
             }//end of third if else
           }//end of second if else 
        }//end of first if else 
	System.out.println("Discount value is:"+discount);
  }
}