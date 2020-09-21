import java.util.Scanner;
class Circle
{
	float radius;
	float area;
	
	void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		radius=sc.nextInt();
	}
	void calculateArea() 
	{
		area=3.14f*radius*radius;
	}
	void display()
	{
		System.out.println("radius of circle = "+radius);
		System.out.println("area of circle = "+area);
	}	
}
class Q34CircleDemo
{
	public static void main(String args[])
	{
	   Circle c=new Circle();
        c.init();
        c.calculateArea();
        c.display();		
	}
}