class Person
{
	private String name;
	private int age;
	Person()
	{
		age=18;
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
}
class Q37PersonDemo
{
	public static void main(String args[])
	{
		Person p=new Person();
		Person p1=new Person("naaz",22);
		p.display();
		p1.display();
	}
}