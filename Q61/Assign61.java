package Q61;

import java.util.Scanner;
public class Assign61 {

	public static void main(String[] args) {

		MyThread m = new MyThread();
		Thread th = new Thread(m);
		th.start();
	}
}

class MyThread extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		for (int row = 0; row < n; row++) {
			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("*");
		}
	}
}
