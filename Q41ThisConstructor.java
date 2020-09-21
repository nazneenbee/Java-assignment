class ThisDemo
{
	private String name;
	private int rollNo;
	ThisDemo()
	{
		this("naaz",1);
	}
	ThisDemo(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}

	void show()
	{
		System.out.println("name = "+name);
		System.out.println("roll Number = "+rollNo);
	}
}
class Q41ThisConstructor
{
	public static void main(String args[])
	{
		ThisDemo t=new ThisDemo();
		t.show();
	}
}