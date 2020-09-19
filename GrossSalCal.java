import java.util.Scanner;
class GrossSalCal
{
	public static void main(String args[])
	{
		System.out.println("enter the salary");
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		double HRA;
		double DA;
		if(salary<10000)
		{
			 HRA=salary*10/100;
			 DA=salary*90/100;
		}
		else
		{ 
	         HRA=2000;
			 DA=salary*98/100;	
		}
		
		double grossSalary=salary+HRA+DA;
		System.out.println("grossSalary = "+grossSalary);
	}
}