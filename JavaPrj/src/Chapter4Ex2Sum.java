import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex2Sum {

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

		// =========������ ����=============================
		// 1. �������� ������ ���Ͻÿ�
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += nums[i];
		}
		System.out.println(sum);

		// 1-2. �ۼ��� �ո� ���ϱ�
		int sum2 = 0;
		for (int i = 0; i < size; i++) {
			if (nums[i] % 2 == 0)
				sum2 += nums[i];
		}
		System.out.println(sum2);

		// 2. ¦���� ������ ����Ͻÿ�.
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (nums[i] % 2 == 0)
				count++;
		}
		System.out.println(count);

		// =========����=============================
		// ���
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", nums[i]);

		// [60 70 90 100 75 24 23 80 90]
		// [23 24 60 70 75 80 90 90 100]
		// ����
		// �ӽ� ������ ������ Ȱ���Ѵ�!!!!!!

		System.out.println();
		int temp = nums[0];
		nums[0] = nums[6];
		nums[6] = temp;

		// �ٽ� ����ؼ� Ȯ��
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", nums[i]);

		// =========������ ����=============================
		FileOutputStream fos = new FileOutputStream("res/result.txt");
		fos.write(count);
		fos.flush();
		fos.close();

	}

}