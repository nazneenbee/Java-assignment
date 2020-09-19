import java.util.Scanner;
class FindGreSmallestNumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		int arr[]=new int[5];
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
        
		for(int a:arr)
		{
			if(max<a)
			{
				max=a;
			}
			
		}
		
		int min = arr[0];
		
		for(int a1:arr)
		{
			if(min>a1)
			{
				min=a1;
			}
			
		}
		System.out.println("greatest element in array "+max);
		System.out.println("smallest element in array "+min);
	}
}