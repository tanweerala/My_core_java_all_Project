public class Frequency 
{
	public static void main(String[] args) 
	{
		int[] x= {1,23,10,3465,10,90,80,70,90,10,23,10};
		int y=1;
		int c=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==y)
			{
				c++;
			}
		}
		System.out.println("Occurrence of "+y+" inside array is "+c);
	}
}
