import java.util.Scanner;
class CalPercent
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of five subject");
		double s1= sc.nextDouble();
		double s2= sc.nextDouble();
		double s3= sc.nextDouble();
		double s4= sc.nextDouble();
		double s5= sc.nextDouble();
		double sum=s1+s2+s3+s4+s5;
		double percent=(sum/500)*100;
		System.out.println("total marks "+sum);
		System.out.println("percentage marks = "+percent);	
	}
}
