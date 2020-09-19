import java.util.Scanner;
class DaysConYMD
{
	public static void main(String args[])
	{
		System.out.println("enter the days");
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		int year=days/365;
		int month=days%365;
		int month1=month/30;
		month1++;
		int day=days%365;
		int day1=day%30;
		System.out.println("year = "+year+" month = "+month1+" days = "+day1);
	}
}