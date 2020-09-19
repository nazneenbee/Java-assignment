class Student
{
	private int rno;
	private String name;
	
	void setData(int r,String n)
	{
		rno=r;
		name=n;
	}
	
	void showData()
	{
		System.out.println("roll no = "+rno);
		System.out.println("name = "+name);
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setData(1,"naaz");
		s.showData();
	}
}