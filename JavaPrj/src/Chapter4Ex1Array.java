import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex1Array {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		FileOutputStream fos = new FileOutputStream("res/result.txt");
		Scanner scan = new Scanner(fis);

		// 1. ����(int) �迭 nums��� �̸����� ���� 10��¥�� �迭�� �������ּ���

		int[] nums = new int[10];

		for (int i = 0; i < 8; i++) {
			// 2. nums �迭�� ù��° ��ġ�� data.txt���� ù��° ��(60)�� �о ��������
			// 3. ���ϴ� ���� : �о�� ���� nums �迭�� i��° ��ġ�� �����Ͻÿ�.
			nums[i] = scan.nextInt();
		}
		System.out.println(nums[0]);
		System.out.println(nums[1]);

		fis.close();
		fos.close();

	}

}