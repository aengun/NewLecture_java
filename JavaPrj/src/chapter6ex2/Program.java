package chapter6ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		// �����͸� int nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		int[] nums = load();
		System.out.println(Arrays.toString(nums));

		// nums �迭�� �հ踦 ���ϰ�
		int total = sum(nums);
		System.out.println(total);

		// nums �� �߿��� ¦���� ������ ���ϰ�
		int count = getEvenNumberCount(nums);
		System.out.println(count);

	}

	static int[] load() throws IOException {
		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		// ��?? �̻��ѵ�? ���� ��ȿ�����ε�?
		int size = scan.nextInt();
		int[] nums = new int[size];

		// �迭�� �����͸� �о�(�ε�)�´�.
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		fis.close();
		return nums;
	}

	static int sum(int[] nums) {
		int size = nums.length;
		int sum = 0;

		for (int i = 0; i < size; i++)
			sum += nums[i];
		return sum;
	}

	static int getEvenNumberCount(int[] nums) {
		int size = nums.length;
		int count = 0;
		for (int i = 0; i < size; i++)
			if (nums[i] % 2 == 0)
				count++;
		return count;
	}

}
