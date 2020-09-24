package chapter6ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		// 데이터를 int nums 배열에 로드하는 코드를 작성하고
		int[] nums = load();
		System.out.println(Arrays.toString(nums));

		// nums 배열의 합계를 구하고
		printSum(nums);

		// nums 값 중에서 짝수의 개수를 구하고
		printEvenNumberCount(nums);

	}

	static int[] load() throws IOException {
		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		// 어?? 이상한데? 뭔가 비효율적인데?
		int size = scan.nextInt();
		int[] nums = new int[size];

		// 배열에 데이터를 읽어(로드)온다.
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		fis.close();
		return nums;
	}

	static void printSum(int[] nums) {
		int size = nums.length;
		int sum = 0;

		for (int i = 0; i < size; i++)
			sum += nums[i];

		System.out.println(sum);
	}

	static void printEvenNumberCount(int[] nums) {
		int size = nums.length;
		int count = 0;
		for (int i = 0; i < size; i++)
			if (nums[i] % 2 == 0)
				count++;

		System.out.println(count);
	}

}
