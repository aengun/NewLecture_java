import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter3Ex5StringProgram2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		int num;
		int i = 0; // �ݺ� ���������� ���������� ó���ϱ� ���� �ε���
		while (scan.hasNextInt()) {

			num = scan.nextInt();
			// �������� ������ ���� : �о�� ���� 50���� ū ���� ����Ͻÿ�
			// if (num > 50)
			// System.out.println(num);

			// �ݴ�� ������ �ۼ��ϸ�?
			// ���������� �Ǵ��� ���� : 50���� �����ų� ���� ���� ������� ���ÿ�
			// if (num <= 50)
			/// continue;

			System.out.println(num);

			i++;
		}

		fis.close();

	}

}
