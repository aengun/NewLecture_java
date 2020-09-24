package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program_Newlec3 {

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

		scan.close();
		fis.close();

		// ����
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {

				System.out.println("<�ٲ�� ��>");
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (a == j || a == j + 1)
						System.out.print("*");

					System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d\n", m.id, m.uid, m.name, m.age);
				}

				// ��������
				boolean check = false;
				int cnt = 0;
				if (list[j].age < list[j + 1].age) {
					check = true;
					cnt = j;
					Member temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}

				// ȭ�� �б�
				Thread.sleep(700);
				for (int a = 0; a < 100; a++)
					System.out.println();

				System.out.println("<�ٲ� ��>");
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (check) {
						if (a == cnt || a == cnt + 1)
							System.out.printf("[ <id> : %d, <uid> : %s, <name> : %s, <age> : %d ]\n", m.id, m.uid,
									m.name, m.age);
						else
							System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d\n", m.id, m.uid, m.name,
									m.age);
					} else
						System.out.printf("<id> : %d, <uid> : %s, <name> : %s, <age> : %d\n", m.id, m.uid, m.name,
								m.age);
				}

				// 1�ʸ��� ����ǵ��� threadȰ��
				Thread.sleep(700);
				for (int a = 0; a < 100; a++)
					System.out.println();
			}

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