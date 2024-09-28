public class App 
{
	public static void main(String[] args) 
	{
		Person p1,p2,p3;
		p1=new Person(101,"Rahul","Noida");
		p2=new Person(102,"Hemant","Delhi");
		p3=new Person(103,"imran","Lucknow");
		
		p2=p1;
		p1.showDetails();//?
		p3=p2;
		p2.showDetails();//?
		p1=p3;
		p3.showDetails();//?
	}
}
