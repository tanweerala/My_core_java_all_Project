public class App 
{
	public static void main(String[] args) 
	{
		Product p1=new Product();//Non-parameterzied constructor will run
		Product p2=new Product("Mouse","Logitech",1500);//Parameterzied constructor will run
		Product p3=new Product(p2);//Copy cnstructor will run
		p1.showDetails();
		p2.showDetails();
		p3.showDetails();
	}
}
