package ch03;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new Scanner(System.in);
		System.out.print("Input number : ");
		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		System.out.println("end");
	}

}
