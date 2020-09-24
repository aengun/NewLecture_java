package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program_Newlec5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		Member[] list = new Member[6];

		int count;
		{
			int i = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");

				Member m = new Member();

				m.id = Integer.parseInt(tokens[0]);
				m.uid = tokens[1];
				m.name = tokens[2];
				m.age = Integer.parseInt(tokens[3]);

				list[i] = m;

				i++;
			}
			count = i;
		}
		System.out.println(list.length);
		System.out.println(count);

		scan.close();
		fis.close();

		// ����
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				// �ٲ�� ��
				System.out.println("<�ٲ�� ��>");
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (a == j || a == j + 1)
						System.out.print("*");
					if (a >= count - i)
						System.out.printf("[ ");
					System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d", m.id, m.uid, m.name, m.age);
					if (a >= count - i)
						System.out.printf(" ]");
					System.out.println();
				}

				// ��������
				boolean check = false;
				if (list[j].age < list[j + 1].age) {
					Member temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					check = true;
				}

				// ȭ�� �б�
				Thread.sleep(700);
				for (int a = 0; a < 20; a++)
					System.out.println();

				// �ٲ� ��
				System.out.println("<�ٲ� ��>");
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (check && (a == j || a == j + 1))
						System.out.print("->");
					if (a >= count - i)
						System.out.printf("[ ");
					System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d", m.id, m.uid, m.name, m.age);
					if (a >= count - i)
						System.out.printf(" ]");
					System.out.println();
				}

				// ȭ��б�
				Thread.sleep(700);
				for (int a = 0; a < 20; a++)
					System.out.println();
			}

			// (n)pass �Ϸ�
			System.out.printf("[ %d pass ] �Ϸ�\n", i + 1);
			for (int a = 0; a < count; a++) {
				Member m = list[a];
				if (a >= count - 1 - i )
					System.out.printf("[ ");
				System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d", m.id, m.uid, m.name, m.age);
				if (a >= count - 1 - i)
					System.out.printf(" ]");
				System.out.println();
			}

			// ȭ��б�
			Thread.sleep(700);
			for (int a = 0; a < 20; a++)
				System.out.println();

		}

		// ��� -----
		System.out.println("<���� ���>");
		for (int i = 0; i < count; i++) {
			Member m = list[i];
			System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d\n", m.id, m.uid, m.name, m.age);
		}
		System.out.println();
		System.out.println("<�۾��Ϸ�>");

	}

}