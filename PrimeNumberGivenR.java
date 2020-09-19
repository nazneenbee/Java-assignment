import java.util.Scanner;
class PrimeNumberGivenR
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first and last number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count;
		
		while(num1<num2)
		{
			count=0;
			for(int i=2; i<num1; i++)
			{
				if(num1%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(num1+" is prime");
			}
			num1++;
		}
		
	}
}