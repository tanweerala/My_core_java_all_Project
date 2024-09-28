public class App11 
{
	public static void main(String[] args) 
	{
		int[] x= {10,80,1,456,23,67,302,57,34,56,67,4,23,456,3,5,11,89,78};
		//Count total number of evens and odds
		int evens=0;
		for(int i=0;i<x.length;i++)
		{
			int y=x[i];
			if(y%2==0)
			{
				evens++;
			}
		}
		int odds=x.length-evens;
		System.out.println("Array has total "+evens+" evens and "+odds+" odds");
	}
}
