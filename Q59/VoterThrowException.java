package Q59;
import java.util.Scanner;

class Voter 
{
	 int voterId;
	 String candidateName;
	 int age;
	 Voter(int voterId,String candidateName,int age)
	 {
		 this.voterId=voterId;
		 this.candidateName=candidateName;
		 this.age=age;
	 }
}
class WrongAgeException extends Exception
{
WrongAgeException(){
	super("invalid age for voter ");
}
}
public class VoterThrowException {
      public static void main(String[] args) throws WrongAgeException
      {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter voterId");
		int voterId=sc.nextInt();
		System.out.println("enter candidate name");
		String candidateName=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18)
		{
			Voter v=new Voter(voterId,candidateName,age);
			System.out.println("you are eligible for voting");
		}
		else
		{
			throw new WrongAgeException();
		}
	}
}
