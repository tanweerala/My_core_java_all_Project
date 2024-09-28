public class All 
{
	public static void main(String[] args) 
	{
		int[] num= {10,20,300,40,5,60};
		int sum=num[0];
		int max=num[0];
		int min=num[0];
		for(int i=1;i<num.length;i++)
		{
			sum=sum+num[i];
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}
		System.out.println("Sum="+sum);
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		float avg=(float)sum/num.length;
		System.out.println("Avg="+avg);
	}
}
