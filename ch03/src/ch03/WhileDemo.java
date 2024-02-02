package ch03;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 5) {
			System.out.print(i);
			i++;
		}
		System.out.println();

		int row = 2;
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			}
			System.out.println();
			row++;
		}
	}

}
