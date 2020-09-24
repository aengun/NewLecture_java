package chapter6ex1;

public class Program {

	static int sum(int a, int b) {
		return a + b;
	}

	static String getName(int a, String s) {
		return s;
	}

	static void printSum(int x, int y) {
		int result = x + y;
		System.out.printf("%d", result);
	}

	static void print(int a, float b, char c) {
		System.out.println("int : " + a + ", float : " + b + ", char : " + c);
	}

	public static void main(String[] args) {

		int result = 0;
		int x = 3;
		int y = 4;

		// result = x+4;
		result = sum(x, y);

		System.out.printf("%d \n", result);

		String s = getName(2, "hello");

		printSum(x, y);
		System.out.println();

		print(2, 3.0f, 'a');

	}

}
