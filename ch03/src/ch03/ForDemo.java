package ch03;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++)
			System.out.print(i);
		System.out.println();

		for (int row = 2; row < 10; row++) {
			for (int col = 1; col < 10; col++)
				System.out.printf("%4d", row * col);
			System.out.println();
		}
	}

}
