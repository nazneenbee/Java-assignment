package Q54;

import java.util.Scanner;

public class Q54ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string you want reverse");
		String str=sc.next();
		String str1[]=str.split("");
		int j=str1.length-1;
		for(int i=0; i<=j; i++)
		{
			
			String temp = str1[i];
			str1[i]=str1[j];
			str1[j]=temp;
			j--;	
		}
		System.out.print("reverse : ");
		for(int i=0; i<str1.length; i++)
		{
		System.out.print(str1[i]);
		}
	}

}
