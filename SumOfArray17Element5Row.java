import java.util.Scanner;
class SumOfArray17Element5Row
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1,2,3,4};
		int b[]={1,2,3,4};
		int c[]={1,2,3};
		int d[]={1,2,3};
		int e[]={1,2,3};
		int arr[][]=new int[5][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		System.out.println("print all element of array");
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{ 
		        System.out.print(arr[i][j]);
				sum=sum+arr[i][j];
			}
			System.out.println(" ");
			
		}
		System.out.println("sum is = "+sum);
	}	
}


/*import java.util.Scanner;
class SumOfArray17Element5Row
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter cols for "+i);
			int cols=sc.nextInt();
			arr[i]=new int[cols];
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("enter cols element");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
				sum=sum+a;
			}
		}
		System.out.println("sum is = "+sum);
	}
}*/