import java.util.Scanner;
class CheckPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int count=0;
		for(int i=2; i<num-1; i++)
		{
			if(num==2)
			{
				count++;
				break;
			}
			if(num%i==0)
			{
			     count++;	
			}
		}
		if(count>0)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}
}