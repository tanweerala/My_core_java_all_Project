public class Employee 
{
	//Command to created instance variables
	private int eid;
	private String name;
	private String department;
	private int salary;
	
	public Employee(int arg1,String arg2,String arg3,int arg4)
	{
		eid=arg1;
		name=arg2;
		department=arg3;
		salary=arg4;
	}
	public void showDetails()
	{
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+name);
		System.out.println("Employee department:"+department);
		System.out.println("Employee salary:"+salary);
		System.out.println("-------------------------");
	}
}
