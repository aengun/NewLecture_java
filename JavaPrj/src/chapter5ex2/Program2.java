package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		Member[] list = new Member[10];

		int count = 0;
		{
			int i = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");

				// 사용자 형식
				// User Type
				// 개념상의 그룹핑명: 개체명
				// Member : 개체(Entity)명 <-> m : 객체(Object)명
				Member m = new Member();
				m = new Member();

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

		// 정렬... -----
		for (int j = 0; j < count - 1; j++) {
			for (int i = 0; i < count - 1 - j; i++) {
				System.out.println("정렬 전");
				for (int a = 0; a < count - j; a++) {
					Member m = list[a];

					if (a == i || a == i + 1)
						System.out.print("*");

					System.out.printf(" id : %3d, uid : %5s, name : %3s, age %3d\n", m.id, m.uid, m.name, m.age);
				}

				for (int a = count - j; a < count; a++) {
					Member m = list[a];
					System.out.printf("[ id : %3d, uid : %5s, name : %3s, age %3d ]\n", m.id, m.uid, m.name, m.age);
				}

//				for (int a = 0; a < j; a++) {
//					Member m = list[count - j + a];
//					System.out.printf("[ id : %3d, uid : %5s, name : %3s, age %3d ]\n", m.id, m.uid, m.name, m.age);
//				}

				Thread.sleep(300);

				boolean changed = false;
				if (list[i].age > list[i + 1].age) {
					Member temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					changed = true;
				}

				for (int a = 0; a < 100; a++)
					System.out.println();

				System.out.println("정렬 후");
				for (int a = 0; a < count - j; a++) {
					Member m = list[a];

					if (changed && (a == i || a == i + 1))
						System.out.print("->");

					System.out.printf(" id : %3d, uid : %5s, name : %3s, age %3d\n", m.id, m.uid, m.name, m.age);

				}

				for (int a = count - j; a < count; a++) {
					Member m = list[a];
					System.out.printf("[ id : %3d, uid : %5s, name : %3s, age %3d ]\n", m.id, m.uid, m.name, m.age);
				}

//				for (int a = 0; a < j; a++) {
//					Member m = list[count-j+a];
//					System.out.printf("[ id : %3d, uid : %5s, name : %3s, age %3d ]\n", m.id, m.uid, m.name, m.age);
//				}

				Thread.sleep(300);
				for (int a = 0; a < 100; a++)
					System.out.println();

			}
		}

		// 출력 -----
		System.out.println("작업완료");
		for (int i = 0; i < count; i++) {
			Member m = list[i];
			System.out.printf("[ id : %3d, uid : %5s, name : %3s, age %3d ]\n", m.id, m.uid, m.name, m.age);
		}

	}

}