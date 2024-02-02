package ch03;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int n = in.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int m = in.nextInt();
		System.out.printf("%d~%d의 합 : %d\n", n, m, sum(n, m));
	}

	public static int sum(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++)
			sum += i;
		return sum;
	}

}
