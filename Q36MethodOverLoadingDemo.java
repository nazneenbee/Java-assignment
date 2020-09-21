class MathOperation
{
	static int multiply(int a,int b)
	{
		return a*b;
	}
	static float multiply(float a,float b,float c)
	{
		return a*b*c;
	}
	static int multiply(int arr[])
	{
		int mul=1;
		for(int a:arr)
		{
			mul=mul*a;
		}
		return mul;
	}
	static double multiply(double a,int b)
	{
		return a*b;
	}
}

class Q36MethodOverLoadingDemo
{
	public static void main(String args[])
	{ 
	int arr[]=new int[]{3,4,5,6};
		System.out.println(MathOperation.multiply(10,20));
		System.out.println(MathOperation.multiply(10,20,30));
		System.out.println(MathOperation.multiply(10.5,20));
		System.out.println(MathOperation.multiply(arr));
	}
}