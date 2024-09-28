public class Person 
{
	private int pid;
	private String name;
	private String address;
	public Person(int arg1,String arg2,String arg3)
	{
		pid=arg1;
		name=arg2;
		address=arg3;
	}
	public void showDetails()
	{
		System.out.println(pid+","+name+","+address);
	}
}
