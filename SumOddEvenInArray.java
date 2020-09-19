import java.util.Scanner;
class SumOddEvenInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		int arr[]=new int[5];
		int sumOdd=0;
		int sumEven=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
        for(int a:arr)
		{
			if(a%2==0)
			{
				sumEven=sumEven+a;
			}
			else
			{
				sumOdd=sumOdd+a;
			}
		}
		System.out.println("Sum of even number = "+sumEven);
		System.out.println("Sum of odd number = "+sumOdd);
	}
}