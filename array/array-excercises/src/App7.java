public class App7 
{
	public static void main(String[] args) 
	{
		int[] x= {10,80,11,456,23,67};
		int[] y=new int[x.length];
		
		//code to copy value of array x into y in reverse order
		int n=x.length-1;
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[n-i];
		}
		
		//code to display each value of array y
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
