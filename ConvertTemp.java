import java.util.Scanner;
class ConvertTemp
{
	public static void main(String args[])
	{
		System.out.println("enter the Fahrenheit temp");
		Scanner sc=new Scanner(System.in);
		int tempF=sc.nextInt();
		float C= 5*((float)tempF-32)/9;
		System.out.println(C);
	}
}
		