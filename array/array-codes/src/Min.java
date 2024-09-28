public class Min 
{
	public static void main(String[] args) 
	{
		int[] num= {24,576,246,87,4,5787,834};
		int s=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<s)
			{
				s=num[i];
			}
		}
		System.out.println(s);
	}
}
