import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex9 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/img1.cmp");
		Scanner scan = new Scanner(fis, "utf-8");

		// �ε�
		String line = scan.nextLine();
		char[] arr = line.toCharArray();
		System.out.println(Arrays.toString(arr));

		// �ٲٱ�
		int length = arr.length;
		for (int i = 0; i < length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));

		// ����
		FileOutputStream fos = new FileOutputStream("res/img1-reverse.cmp");
		for (int i = 0; i < length; i++) {
			fos.write(arr[i]);

		}

		fis.close();
		scan.close();
		fos.close();

		System.out.println("�۾� �Ϸ�");
	}

}
