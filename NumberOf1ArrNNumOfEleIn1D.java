import java.util.Scanner;
class NumberOf1ArrNNumOfEleIn1D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of row");
		int row=sc.nextInt();
		int arr[][]=new int[row][];
		
		System.out.println("total number of 1-D array is = "+row);
		for(int i=0; i<arr.length; i++)
		{ 
	        int count=0;
			System.out.println("enter no of cols for "+i+" index");
			int cols=sc.nextInt();
			arr[i]=new int[cols];
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("enter "+j+"element");
				arr[i][j]=sc.nextInt();
				count++;
			}
			System.out.println("number of element in "+(i+1)+" 1-D array"+count);
		}
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
	}
}