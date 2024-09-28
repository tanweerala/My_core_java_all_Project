public class Product 
{
	private String name;
	private String brand;
	private int price;
	public Product()
	{
		//System.out.println("Non-parameterzied constructor");
	}
	public Product(String a1,String a2,int a3)
	{
		//System.out.println("Parameterzied constructor");
		name=a1;
		brand=a2;
		price=a3;
	}
	public Product(Product p)
	{
		name=p.name;
		brand=p.brand;
		price=p.price;
	}
	public void showDetails()
	{
		System.out.println(name+","+brand+","+price);
	}
}
