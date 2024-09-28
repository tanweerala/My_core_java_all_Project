public class App 
{
	public static void main(String[] args) 
	{
		char[] str= {'a','b','C','d','e'};
		System.out.println(str);
		for(int i=0;i<str.length;i++)
		{
			char ch=str[i];
			if(ch>=97 && ch<=122)
			{
				str[i]=(char)(ch-32);
			}
		}
		System.out.println(str);
	}
}
