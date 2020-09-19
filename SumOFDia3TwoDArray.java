import java.util.Scanner;
class SumOFDia3TwoDArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter element of "+i+" index");
			for(int j=0; j<arr[i].length; j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("print array element");
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("sum of diagonal is = "+sum);
	}
}