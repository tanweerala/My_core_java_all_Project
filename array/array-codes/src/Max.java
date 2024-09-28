public class Max 
{
	public static void main(String[] args) 
	{
		int[] num= {24,576,246,87,44,5787,834};
		int m=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>m)
			{
				m=num[i];
			}
		}
		System.out.println(m);
	}
}
