package Q62;

import java.util.Scanner;

public class CheckPrimeUsingThread {

	public static void main(String[] args) {
		System.out.println("main started");
		Prime p=new Prime();
		Thread t=new Thread(p);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main close");
	}
}
class Prime implements Runnable {

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want check prime or not");
		int num=sc.nextInt();
		int count=0;
				for(int i=2; i<num; i++)
				{
					if(num==2)
					{
						count=0;
					}
					else if(num%i==0)
					{
						count++;
					}
					else
					{}
				}
		if(count==0)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}
