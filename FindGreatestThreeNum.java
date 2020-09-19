/*import java.util.Scanner;
class FindGreatestThreeNum
{
	public static void main(String args[])
	{
		System.out.println("enter three number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int greatest=(num1>num2 && num1>num3)?num1:((num2>num1 && num2>num3)?num2:num3);
		System.out.println("Greatest number = "+greatest);
	}
}*/


import java.util.Scanner;
class FindGreatestThreeNum
{
	public static void main(String args[])
	{
		System.out.println("enter three number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("greater num = "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("greater num = "+num2);
		}
		else{
		System.out.println("Greatest number = "+num3);
	     }
	}
}