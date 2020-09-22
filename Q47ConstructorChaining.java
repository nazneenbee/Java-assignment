class A
{
	A()
	{
		System.out.println("A no para Constructor is call");
	}
	A(int i)
	{
		System.out.println("A parameterized Constructor is call");
	}
}
class B extends A
{ 
	B()
	{
		System.out.println("B no para Constructor is call");
	}
	B(int j)
	{
		super(10);
		System.out.println("B prameterized Constructor is call");
	}
}
class C extends B
{
	C()
	{
		super(10);
		System.out.println("C non para Constructor is call");
	}
	C(int k)
	{
		this();
		System.out.println("C parameterized Constructor is call");
	}
}
class Q47ConstructorChaining
{
	public static void main(String arg[])
	{
		C c=new C(10);
	}
}