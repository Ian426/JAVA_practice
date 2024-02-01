package ch01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d = %d\n", x, y, x * y);
	}

}
