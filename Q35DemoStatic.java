import java.util.Scanner;
class MathOperation
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int subtract(int a,int b)
	{
		return a-b;
	}
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	public static int power(int a,int b)
	{
		int pow=1;
		for(int i=1; i<=b; i++)
		{
			pow=pow*a;
		}
		return pow;
	}
}
class Q35DemoStatic
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println(MathOperation.add(a,b));
		System.out.println(MathOperation.subtract(a,b));
		System.out.println(MathOperation.multiply(a,b));
		System.out.println(MathOperation.power(a,b));
	}
}