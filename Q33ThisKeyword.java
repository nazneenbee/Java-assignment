class StudentInfo
{
	public int rollNo;
	public String name;
	void setData(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	void showData()
	{
		System.out.println(rollNo);
		System.out.println(name);
	}
}
class Q33ThisKeyword
{
	public static void main(String args[])
	{
		StudentInfo si=new StudentInfo();
		si.setData(1,"nazneen");
		si.showData();
	}
}