public class App 
{
	public static void main(String[] args) 
	{
		Employee[] emp=new Employee[6];
		emp[0]=new Employee(101,"Rahul","Sales",70000);
		emp[1]=new Employee(102,"Amit","Sales",71000);
		emp[2]=new Employee(103,"Hemant","Marketing",89000);
		emp[3]=new Employee(104,"Imran","Accounts",60000);
		emp[4]=new Employee(105,"Kuldeep","HR",77000);
		emp[5]=new Employee(106,"Suman","Training",90000);
		for(int i=0;i<emp.length;i++)
		{
			emp[i].showDetails();
		}
	}
}
