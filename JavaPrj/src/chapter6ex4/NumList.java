package chapter6ex4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class NumList {

	int size = 0;
	int[] nums;

	static void add(NumList list, int num) {

		// ������ ���ڶ�� ������ �÷��ִ� �۾�
		// 1. list.nums.length ���� 5�� ū �迭 temp �� �غ��Ѵ�.
		// list.nums.length;
		// list.size
		if (list.size == list.nums.length) {
			int[] temp = new int[list.size + 5];

			// 2. ���� list.nums�迭�� �ִ� ������ temp������ �ű��.
			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			// 3. temp�� �����ϴ� �迭�� list.nums�� ������Ų��.
			list.nums = temp;
		}

		list.nums[list.size] = num;
		list.size++;

	}

	public static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	public static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	public static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}

		fis.close();
	}
}
