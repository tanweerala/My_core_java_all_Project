public class Employee 
{
	private int eid;
	private String name;
	private String department;
	private int salary;
	
	public Employee(int a1,String a2,String a3,int a4)
	{
		eid=a1;
		name=a2;
		department=a3;
		salary=a4;
	}
	public void showDetails()
	{
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+name);
		System.out.println("Employee department:"+department);
		System.out.println("Employee salary:"+salary);
		System.out.println("-------------------------------");
	}
}
