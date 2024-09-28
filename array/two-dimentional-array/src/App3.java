public class App3 
{
	public static void main(String[] args) 
	{
		int[][]arr= {{1,5,6,5},{19,15,96,3,1,56,34,5},{12,50,6,58,17,12}};
		//Write code to display all elements of second array using single loop
		
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr[j].length;i++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
