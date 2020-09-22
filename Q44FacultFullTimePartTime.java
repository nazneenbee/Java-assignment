import java.util.Scanner;
class Faculty
{
	private int facultyId;
	private double salary;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter faculty id");
		facultyId=sc.nextInt();
	}
	void printSalary(double salary)
	{
		System.out.println("salary = "+salary);
	}
}
class FullTimeFaculty extends Faculty
{
	private double basicSalary;
	private double allowance;
	private double sal;
	void input()
	{
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary");
		basicSalary=sc.nextDouble();
		System.out.println("enter allowance");
		allowance=sc.nextDouble();
		sal=basicSalary+allowance;
	}
	double getSal()
	{
		return sal;
	}
}

class PartTimeFaculty extends Faculty
{
	private double workingHours;
	private double ratePerHour;
	private double s;
	void input()
	{
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter working hour");
		workingHours=sc.nextDouble();
		System.out.println("enter rate per hour");
		ratePerHour=sc.nextDouble();
		s=workingHours*ratePerHour;
		//super.printSalary(s);
	}
	double gets()
	{
		return s;
	}
}

class Q44FacultFullTimePartTime
{
	public static void main(String args[])
	{
		System.out.println("info part time faculty");
		PartTimeFaculty p=new PartTimeFaculty();
		p.input();
		double salaryPTF=p.gets();
		System.out.println("part time faculty salary ");
		p.printSalary(salaryPTF);
		System.out.println("info full time faculty");
		FullTimeFaculty f=new FullTimeFaculty();
		f.input();
		double salaryFTF=f.getSal();
		System.out.println("full time faculty salary ");
		f.printSalary(salaryFTF);
	}
}