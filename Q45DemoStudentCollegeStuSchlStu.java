import java.util.Scanner;
class Student
{
	private int rollNo;
	private double percentage;
	Student()
	{
		rollNo=-1;
		percentage=-100;
	}
	Student(int rollNo,double percentage)
	{
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
	void show()
	{
		System.out.println("rollNo = "+rollNo);
		System.out.println("percentage = "+percentage);
	}
	int getRollNo()
	{
		return rollNo;
	}
	double getPercentage()
	{
		return percentage;
	}
}
class CollegeStudent extends Student
{
	private int semester;
	CollegeStudent()
	{
		semester=-1;
	}
	CollegeStudent(int rollNo,double percentage,int semester)
	{
		super(rollNo,percentage);
		this.semester=semester;
	}
	void show()
	{
		super.show();
		System.out.println("semester = "+semester);
	}
}
class SchoolStudent extends Student
{
	private int className;
	SchoolStudent()
	{
		className=-1;
	}
	SchoolStudent(int rollNo,double percentage,int className)
	{
		super(rollNo,percentage);
		this.className=className;
	}
	void show()
	{
		super.show();
		System.out.println("className = "+className);
	}
}
class Q45DemoStudentCollegeStuSchlStu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student stuarr[]={new CollegeStudent(10,70.8,1),new CollegeStudent(20,78,2),new SchoolStudent(30,87,10),new SchoolStudent(40,52,11),new SchoolStudent(50,98,12)};
		for(Student s:stuarr)
		{
			s.show();
		}
		System.out.println("enter the roll no you want search");
		int searchRoll=sc.nextInt();
		int count=0;
		for(Student s:stuarr)
		{
			if(s.getRollNo()==searchRoll)
			{
				if(s instanceof CollegeStudent)
				{
					System.out.println("this is college student with detil :");
				}
				else if(s instanceof SchoolStudent)
				{
					System.out.println("this is school student with detail :");
				}
				
				s.show();
			}
		}
		
		for(Student s:stuarr)
		{
			if(s.getPercentage()>75)
			{
				System.out.println("");
				System.out.println("A GRADE");
				s.show();
				count++;
			}
		}
		System.out.println("A grade student = "+count);
	}
}