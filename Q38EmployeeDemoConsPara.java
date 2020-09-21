import java.util.Scanner;
class Employee
{
    private int empNo;
	private double salary;
	static private double totalSalary=0;
	static int totalEmpl=0;
     
	Employee(int empNo,double salary)
	{
		this.empNo=empNo;
		this.salary=salary;
		totalSalary=totalSalary+salary;
		totalEmpl++;
	}
	void show()
	{
		System.out.println("empNo = "+empNo);
		System.out.println("Salary = "+salary);
		System.out.println("totalSalary = "+totalSalary);
	}
	void displayTotal()
	{
		System.out.println("totalEmployee = "+totalEmpl);
		System.out.println("total salary of all employee = "+totalSalary);
	}
	
}
class Q38EmployeeDemoConsPara
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employee");
		int n=sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			System.out.println("enter your salary");
			double sal=sc.nextDouble();
			Employee e=new Employee(i,sal);
		    e.show();
			if(i==n)
			{
				e.displayTotal();
			}
		}
		
	}
}