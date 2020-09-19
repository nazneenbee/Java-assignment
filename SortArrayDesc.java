import java.util.Scanner;
class SortArrayDesc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array element are descending order");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}