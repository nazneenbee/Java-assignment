import java.util.Scanner;
class SumAverageArrayE
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		int arr[]=new int[10];
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a:arr)
		{
			sum=sum+a;
		}
		int avg=sum/10;
		System.out.println("sum = "+sum);
		System.out.println("average = "+avg);
	}
}