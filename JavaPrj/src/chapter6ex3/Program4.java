package chapter6ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		load(list);

		// ����ڷκ��� ���� �ϳ��� �Է� �޴´�.
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("���� �Է� > ");
			int num = scan.nextInt();
			add(list, num);

			// nums �迭�� �հ踦 ���ϰ�
			int sum = sum(list);

			System.out.println(sum);

			// nums �� �߿��� ¦���� ������ ���ϰ�
			int count = getEvenNumberCount(list);

			System.out.println(count);

		}

	}

	static void add(NumList list, int num) {

		int temp[] = new int[list.size + 5];
		for (int i = 0; i < list.size; i++)
			temp[i] = list.nums[i];
		temp[list.size] = num;
		list.nums = temp;
		list.size++;
		System.out.println(Arrays.toString(list.nums));

	}

	private static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}

		System.out.println(Arrays.toString(list.nums));
		fis.close();

	}

}