public class App 
{
	public static void main(String[] args) 
	{
		int ctr=10;
		while(ctr>=1)
		{
			ctr--;
			if(ctr==6)
				continue;
			if(ctr==3)
				break;
			System.out.println(ctr);
			
		}
	}
}

