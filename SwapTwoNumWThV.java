import java.util.Scanner;
class SwapTwoNumWThV
{
	public static void main(String args[])
	{
		System.out.println("enter two number you want swap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swap a = "+a+" b is = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap a = "+a+" b is = "+b);
	}
}