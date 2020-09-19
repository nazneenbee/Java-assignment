import java.util.Scanner;
public class SolveExpression
{
	public static void main(String args[])
	{
		int x, y;
		System.out.println("1) y = x2 + 3x - 7 (print value of y) ");
		System.out.println("Enter the value of x");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=(x*x)+(3*x)-7;
		System.out.println(y);
		
		System.out.println("2) y = x++ + ++x ");
		System.out.println("Enter the value of x");
		Scanner sc1=new Scanner(System.in);
		x=sc1.nextInt();
		y=x++ + ++x;
		System.out.println("x is ="+x+" y is = "+y);
		
		System.out.println("3) z = x++ - --y - --x  +  x++ (print value of x ,y and z)");
		System.out.println("Enter the value of x and y");
		Scanner sc2=new Scanner(System.in);
		x=sc2.nextInt();
		Scanner sc3=new Scanner(System.in);
		y=sc3.nextInt();
		int z = x++ - --y - --x  +  x++;
		System.out.println("x is ="+x+" y is = "+y+" Z is = "+z);
		
		System.out.println("4) z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]");
		System.out.println("Enter the value of x and y");
		Scanner sc4=new Scanner(System.in);
		boolean x1=sc4.nextBoolean();
		Scanner sc5=new Scanner(System.in);
		boolean y1=sc5.nextBoolean();
		boolean z1 = x1++ - --y1 - --x1  +  x1++;
		System.out.println("x1 is ="+x1+" y1 is = "+y1+" Z is = "+z1);
		
		
	} 
}