package Q60;

import java.util.Scanner;

interface StudentFee
{
	public void getFee() throws InvalidFeeException;
}
class InvalidFeeException extends Exception
{
	InvalidFeeException()
	{
		super("enter fees is not valid");
	}
}
class StuFee implements StudentFee
{
	Scanner sc=new Scanner(System.in);
	String name;
   double fee;
	StuFee(String name,double fee)
	{
		this.name=name;
		this.fee=fee;
	}
	@Override
	public void getFee() throws InvalidFeeException {
	System.out.println("name : "+name);
	System.out.println("fee : "+fee);
	}
	
}
public class StudentFees {

	public static void main(String[] args) throws InvalidFeeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of student");
		String name=sc.next();
		System.out.println("enter fee of student");
		double fee=sc.nextDouble();
       if(fee>0)
       {
    	   StudentFee sf=new StuFee(name, fee);
    	   sf.getFee();
       }
       else
       {
    	   throw new InvalidFeeException();
       }
	}

}
