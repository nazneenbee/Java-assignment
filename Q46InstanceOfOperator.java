class Person
{
	void show()
	{
		System.out.println("this is Person class");
	}
}
class Student extends Person
{
	void show()
	{
		System.out.println("this is Student class");
	}
}
class Teacher extends Person
{
	void show()
	{
		System.out.println("this is Teacher");
	}
}

class Q46InstanceOfOperator
{
	public static void main(String args[])
	{
		Person p[]={new Student(),new Teacher(),new Student(),new Teacher()};
		for(Person a:p)
		{
			if(a instanceof Student)
			{
				a.show();
			}
			else if(a instanceof Teacher)
			{
				a.show();
			}
		}
	}
}