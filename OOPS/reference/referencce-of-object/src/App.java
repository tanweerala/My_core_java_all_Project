public class App 
{
	public static void main(String[] args) 
	{
		Customer cust;//Command to create reference variable.
		//This variable will hold reference of object of Customer class
		cust=new Customer(101,"Amit Singh","Noida","9919875298");
		//Above code will create object and return reference of the object 
		//and variable cust will store that reference
		cust.showCustomerDetails();
	}
}
