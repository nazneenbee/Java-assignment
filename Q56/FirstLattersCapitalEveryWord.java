package Q56;

import java.util.Scanner;

public class FirstLattersCapitalEveryWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String str=sc.nextLine();
		String str1[]=str.split(",|;|\\.|\\?| |!|:|/");
		for(String s:str1)
		{
			System.out.println(s);
		}
		for(int i=0; i<str1.length; i++)
		{
			String s=str1[i].toString();
		    String firstLetter = s.substring(0, 1);
		    String remainingLetters = s.substring(1, s.length());
	
		    firstLetter = firstLetter.toUpperCase();
	
		    s = firstLetter + remainingLetters;
		    System.out.print(s+" ");
		}
}
}
