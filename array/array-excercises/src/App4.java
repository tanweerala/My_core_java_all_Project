public class App4 
{
	public static void main(String[] args) 
	{
		int[] x= {10,80,11,456,23,67};
		//Create a new array(name it y) of same type and same size(As x)
		//Write code to copy each value of array x into new array in reverse order.Do it without using loop
		int[] y=new int[x.length];
		y[0]=x[5];
		y[1]=x[4];
		y[2]=x[3];
		y[3]=x[2];
		y[4]=x[1];
		y[5]=x[0];
	}
}
