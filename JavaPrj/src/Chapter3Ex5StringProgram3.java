import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter3Ex5StringProgram3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		int num;
		int i = 0; // �ݺ� ���������� ���������� ó���ϱ� ���� �ε���

		while (scan.hasNextInt()) {
			// i�� Ȱ���ϴ°� �򰥸���
			// int n = i+1; �̶�� ������ ����� �����ض�,, ������ i=1�� ����� ���� ����

			num = scan.nextInt();
			// 1. ¦�� ��° ���� ���
//			if (i % 2 == 1)
//				System.out.println(num);

			// 2. ¦�� ��°�鼭 50���� ū ���� ���
//			if (i % 2 == 1 && num > 50)
//				System.out.println(num);

			// 3. 4��°���� ���
			if (i < 3) {
				i++;
				continue;
			}
								
			System.out.println(num);

			// 4. 4��°���� ��� --> 5������� �ʿ� ���ٴ� ���� break���� ����� ���̴�.
//			if (i > 3)
//				break;
//			System.out.println(num); 

			i++;
		}

		fis.close();

	}

}
