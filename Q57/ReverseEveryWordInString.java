package Q57;

import java.util.Scanner;

public class ReverseEveryWordInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		String s[]=str.split(",|\\.| |:|;|\\?|/|`|'");
		/*for(String s1:s)
		{
			System.out.println(s1);
		}*/
		for(int i=0; i<s.length; i++)
		{
			String s1[]=s[i].split("");
			int k=s1.length-1;
			for(int j=0; j<s1.length; j++)
			{
				if(j<=k){
				String temp=s1[j];
				s1[j]=s1[k];
				s1[k]=temp;
				k--;
				}
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
	}

}
