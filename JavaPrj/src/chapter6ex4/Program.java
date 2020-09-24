package chapter6ex4;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		NumList.load(list);

		EXIT: while (true) {
			System.out.println("<<   �޴�   >>");
			System.out.println("1. �� �Է�");
			System.out.println("2. �հ� ���ϱ�");
			System.out.println("3. ¦���� ���� ���");
			System.out.println("4. ����");

			System.out.printf("���� �޴� �� �� ������ �����ϼ��� >> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1:
				// ����ڷκ��� ���� �ϳ��� �Է� �޴´�.
				System.out.print("���ڸ� �Է��ϼ��� > ");
				scan = new Scanner(System.in);
				int num = scan.nextInt();
				NumList.add(list, num);
				System.out.println();
				break;

			case 2:
				// nums �迭�� �հ踦 ���ϰ�
				int sum = NumList.sum(list);
				System.out.println("�迭�� �հ� : " + sum);
				System.out.println();
				break;

			case 3:
				// nums �� �߿��� ¦���� ������ ���ϰ�
				int count = NumList.getEvenNumberCount(list);
				System.out.println("¦���� ���� : " + count);
				System.out.println();
				break;

			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break EXIT;

			default:

				System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�. \n1~4 �� �ϳ��� �Է��ϼ���.");

			}
		}
	}

}