package Q55;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string you want reverse");
		String str=sc.nextLine();
		int worldCount=1;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==',' || str.charAt(i) == ' ' ||str.charAt(i)=='\n' ||str.charAt(i)=='`')
			{
				worldCount++;
			}
		}
		System.out.println(worldCount);

	}

}
