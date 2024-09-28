public class App2 
{
	public static void main(String[] args) 
	{
		Person p1,p2,p3,o1,o2,o3;
		o1=p1=new Person(101,"Rahul","Noida");
		o2=p2=new Person(102,"Hemant","Delhi");
		o3=p3=new Person(103,"imran","Lucknow");
		
		p2=p1;
		p3=p2;
		p1=p3;
		o1.showDetails();//?101
		o2.showDetails();//?102
		o3.showDetails();//?103
		
	}
}
