public class App4 
{
	public static void main(String[] args) 
	{
		String str="Amit Pandey,Hemant Hadav,Manoj Pandey";
		String[] res=str.split(",");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
}
