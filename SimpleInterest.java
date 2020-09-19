import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
	     System.out.println("enter principle, rate and time");
         Scanner sc=new Scanner(System.in);
         float p=sc.nextFloat();
         float r=sc.nextFloat();
         int t=sc.nextInt();
         float si= p*r*t/100;  
         System.out.println(si);		 
	}
}