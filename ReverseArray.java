import java.util.Scanner;
class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		int arr[]=new int[5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
        int j=arr.length-1;
		for(int i=0; i<j; i++)
		{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;
		}
		System.out.println("Array element in reverse order");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}