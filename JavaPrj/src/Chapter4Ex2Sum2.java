import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex2Sum2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		// �迭�� ũ�� -> ������ ����� ��ϵ� ������ ���� �����´�.
		int size = scan.nextInt();

		int[] nums = new int[size];

		// �迭�� �����͸� �о�(�ε�)�´�.
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		fis.close();

		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1. �������� : ������ �� ���� ���ϸ鼭 ����
		// [60 70 90 100 75 24 23 80 90]
		// 1 pass : [60 70 90 75 24 23 80 90 100]
		// 2 pass : [60 70 75 24 23 80 90 90 100]

		// 1-1 : 1pass ����
		for (int i = 0; i < size - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				int temp;
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}

		for (int i : nums) {
			System.out.print(i + " ");
		}

		// 1-2 : �������� ��ü �ݺ� ����
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println();

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
