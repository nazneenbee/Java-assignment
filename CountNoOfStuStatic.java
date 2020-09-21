class StudentSecond
{
	private int rno;
	private String name;
	private static int totalstu;
	
	void setData(int r,String n,int ts)
	{
		rno=r;
		name=n;
		totalstu=ts;
	}
	
	void showData()
	{
		System.out.println("roll no = "+rno);
		System.out.println("name = "+name);
		System.out.println("total student = "+totalstu);
	}
}
class CountNoOfStuStatic
{
	public static void main(String args[])
	{
		StudentSecond s=new StudentSecond();
		StudentSecond s1=new StudentSecond();
		s.setData(1,"naaz",1);
		s.showData();
		s1.setData(2,"mukki",2);
		s1.showData();
		s.showData();
		s1.showData();
		
		
	}
}