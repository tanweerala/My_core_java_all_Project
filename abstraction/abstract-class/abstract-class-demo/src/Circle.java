public class Circle extends Shape 
{
	private int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public void findShapeArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle is:"+area);
	}
}
