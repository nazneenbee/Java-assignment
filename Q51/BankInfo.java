package B1;

import java.util.Scanner;

class Account
{
     int accountNo;
     String name;
     static double balance;
     String branch;
     double depAmount;
     double withdrawal;
     String accountType;
	public Account(int accountNo, String name, double balance, String branch,String accountType) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		this.accountType=accountType;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public String getBranch() {
		return branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getDepToAmount() {
		balance=balance+depAmount;
		return balance;
	}
	public void setDepAmount(double depAmount) {
		this.depAmount = depAmount;
	}
	public double bankBalance()
	{
		return balance;
	}
	public double getWithdrawal() {
		balance=balance-withdrawal;
		return balance;
	}
	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
	}
	 
}
class AmmountLessException extends Exception
{
	AmmountLessException()
	{
		super("not possible to withdrawn because current balance is less");
	}
}
public class BankInfo {

	public static void main(String[] args) throws AmmountLessException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter account number");
		int accountNo=sc.nextInt();
		System.out.println("enter account holder name");
		String name=sc.next();
		System.out.println("enter account balance");
		double balance=sc.nextDouble();
		System.out.println("enter your branch");
		String branch=sc.next();
		System.out.println("enter your account type current or saving");
		String accountType=sc.next();
		
		Account a=new Account(accountNo,name,balance,branch,accountType);
		
		if(accountType.equals("current") && balance>=1000)
		{
			System.out.println("show account detail");
			System.out.println("Account no = "+a.getAccountNo());
			System.out.println("Account holder name = "+a.getName());
			System.out.println("Account Balance = "+a.getBalance());
			System.out.println("Branch Name = "+a.getBranch());
			
			System.out.println("enter amount you want deposite");
			double depAmount =sc.nextDouble();
			a.setDepAmount(depAmount);
			System.out.println("balnce after diposite : "+a.getDepToAmount());
			
			System.out.println("enter amount you want withdrawal");
			double withdrawal =sc.nextDouble();
			a.setWithdrawal(withdrawal);
			if(a.getWithdrawal()>=1000)
			{
			System.out.println("balnce after withdrawal : "+a.bankBalance());
			}
			else
			{
				throw new AmmountLessException();
			}
		}
		else if(accountType.equals("saving") && balance>=5000)
		{
			System.out.println("show account detail");
			System.out.println("Account no = "+a.getAccountNo());
			System.out.println("Account holder name = "+a.getName());
			System.out.println("Account Balance = "+a.getBalance());
			System.out.println("Branch Name = "+a.getBranch());
			
			System.out.println("enter amount you want deposite");
			double depAmount =sc.nextDouble();
			a.setDepAmount(depAmount);
			System.out.println("balnce after diposite : "+a.getDepToAmount());
			
			System.out.println("enter amount you want withdrawal");
			double withdrawal =sc.nextDouble();
			a.setWithdrawal(withdrawal);
			if(a.getWithdrawal()>=5000)
			{
			System.out.println("balnce after withdrawal : "+a.bankBalance());
			}
			else
			{
				throw new AmmountLessException();
			}
		}
		else
		{
			System.out.println("not valid detail account type should be saving or current and balance greater 5000 or 1000 respectly");
		}
		
	}

}
