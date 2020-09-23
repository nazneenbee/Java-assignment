import java.util.Scanner;
abstract class Processor
{
	private int data;
	
	void setData(int data)
	{
		this.data=data;
	}
	
	void showData()
	{
		System.out.println(data);
	}
	abstract void process();
}
class Factorial extends Processor
{
	void process()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to calculate factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num; i>0; i--)
		{
			fact=fact*i;
		}
		setData(fact);
	}
}
class Circle extends Processor
{
   	void process()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		int r=sc.nextInt();
	    int area=(int)(3.14f*r*r);
        setData(area);		
	}
}
class Q48AbstractProcessor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("enter choice");
			System.out.println("1. for factorial");
			System.out.println("2. for area");
			System.out.println("3. for exit");
			int choice=sc.nextInt();
			switch(choice)
		    {
				case 1:
				Processor f=new Factorial();
				f.process();
				System.out.println("factorial of number");
				f.showData();
				break;
				
				case 2:
				Processor p=new Circle();
				p.process();
				System.out.println("Area of circle");
				p.showData();
				break;
				
				default:
				System.out.println("no matching data");
				System.exit(0);
				break;
				
		   }
		}while(true);
	}
}