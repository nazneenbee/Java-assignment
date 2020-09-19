import java.util.Scanner;

class PersonEligibleMarriage
{
	public static void main(String args[])
	{
		System.out.println("Enter Gender F for female and M for male");
		Scanner sc=new Scanner(System.in);
		char gender = sc.next().charAt(0);
		System.out.println("Enter The age");
		int age=sc.nextInt();
		if((gender=='F' && age>=18) || (gender=='M' && age>=21 ))
		{
			System.out.println("eligible for marriage");
		}
		else
		{
			System.out.println("Not eligible for marriage");
		}
    }
}