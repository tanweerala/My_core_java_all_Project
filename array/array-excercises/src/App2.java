public class App2 
{
	public static void main(String[] args) 
	{
		int[] x= new int[]{10,80,11,456,23,67};
		//Create a new array(name it y) of same type and same size(As x)
		//Write code to copy each value of array x into new array.Do it using loop
		int[] y=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
		x[0]=100;
		System.out.println(y[0]);
	}
}
