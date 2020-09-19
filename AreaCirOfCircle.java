import java.util.Scanner;
class AreaCirOfCircle
{
	public static void main(String args[])
	{
		float pi=3.14F;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		float r= sc.nextFloat();
		float area= pi*r*r;
		System.out.println("circle area is "+area);
		float circumference=2*pi*r;
		System.out.println("circle circumference = "+circumference);
	}
}
