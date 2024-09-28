public class App 
{
	public static void main(String[] args) 
	{
		//Command to create object from class Employee
		Employee emp1=new Employee(101,"Amit Singh","Sales",70000);
		Employee emp2=new Employee(102,"Imran Ahmad","Marketing",60000);
		Employee emp3=new Employee(103,"Kapil Mishra","Accounts",56000);
		emp2.showDetails();
		emp3.showDetails();
		emp1.showDetails();
	}
}
