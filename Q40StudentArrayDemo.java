import java.util.Scanner;

class StudentDetail
{
	private String name;
	private int rollNo;
	private int age;
	private double score;
	
	StudentDetail()
	{
		
	}
	StudentDetail(String name,int rollNo,int age,double score)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	}
	void showDetail()
	{
		System.out.println("name = "+name);
		System.out.println("rollNo = "+rollNo);
		System.out.println("age = "+age);
		System.out.println("score = "+score);
	}
	String getName()
	{
		return name;
	}
	int getRollNo()
	{
		return rollNo;
	}
	int getAge()
	{
		return age;
	}
	double getScore()
	{
		return score;
	}
}
class Q40StudentArrayDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StudentDetail sd[]=new StudentDetail[10];
		
		for(int i=0; i<sd.length; i++)
		{
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter rollNo");
			int rollNo=sc.nextInt();
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("enter score");
			double score=sc.nextDouble();
			StudentDetail s=new StudentDetail(name,rollNo,age,score);
			sd[i]=s;
		}
		System.out.println("array elements below 50 marks");
		for(int i=0; i<sd.length; i++)
		{
			if(sd[i].getScore()<50 && sd[i].getScore()>=0)
			{
				sd[i].showDetail();
			}
		}
		
		System.out.println("array elements between 50 to 65 marks");
		for(int i=0; i<sd.length; i++)
		{
			if(sd[i].getScore()>=50 && sd[i].getScore()<65)
			{
				sd[i].showDetail();
			}
		}
		
		System.out.println("array elements between 65 to 80 marks");
		for(int i=0; i<sd.length; i++)
		{
			if(sd[i].getScore()>=65 && sd[i].getScore()<80)
			{
				sd[i].showDetail();
			}
		}
		
		System.out.println("array elements between 80 to 100 or equal 100");
		for(int i=0; i<sd.length; i++)
		{
			if(sd[i].getScore()>=80 && sd[i].getScore()<=100)
			{
				sd[i].showDetail();
			}
		}
		
	}
}