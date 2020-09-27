package countvowel;

import java.util.Scanner;

public class CountVowelUsingStringClassFun {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a String");
	  String str=sc.nextLine();
	  Count c=new Count(str);
	  System.out.println("number of vowel = "+c.checkVowel());
	}

}
