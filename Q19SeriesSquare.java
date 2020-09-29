package B1;

import java.util.Scanner;

public class Q19SeriesSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Series you want");
		int n = sc.nextInt();
		int series=n*(n+1)*(2*n+1)/6;
		System.out.println(series);
	}

}
