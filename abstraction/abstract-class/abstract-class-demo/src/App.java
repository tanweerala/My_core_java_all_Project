public class App 
{
	public static void main(String[] args) 
	{
		Shape sh;
		sh=new Circle(10);
		sh.findShapeArea();
		sh=new Rectangle(40,50);
		sh.findShapeArea();
		sh=new Triangle(30,20);
		sh.findShapeArea();
	}
}
