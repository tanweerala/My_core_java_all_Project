public class App5 
{
	public static void main(String[] args) 
	{
		int[] x= {10,80,11,456,23,67};
		//Create a new array(name it y) of same type and same size(As x)
		//Write code to copy each value of array x into new array in reverse order.Do it without using loop
		int[] y=new int[x.length];
		int j=x.length-1;
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[j];
			j--;
		}
	}
}
