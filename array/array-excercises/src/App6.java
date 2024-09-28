public class App6 
{
	public static void main(String[] args) 
	{
		int[] x= {10,80,11,456,23,67};
		//Create a new array(name it y) of same type and same size(As x)
		//Write code to copy each value of array x into new array in reverse order
		int[] y=new int[x.length];
		
		for(int i=0,j=x.length-1;i<y.length;i++,j--)
		{
			y[i]=x[j];
		}
	}
}
