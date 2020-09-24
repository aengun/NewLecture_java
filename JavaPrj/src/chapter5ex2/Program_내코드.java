package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program_내코드 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

//      회원(Member) 이수철회원;
//      묶어서->그룹화->데이터형식
//      구조화(=그룹화), 구조적인, 구조

		// 인원 수 세기
		int num = 0;
		while (scan.hasNextLine()) {
			scan.nextLine();
			num++;
		}

		scan.close();
		fis.close();

		// 로드 ------------------------------------------

		fis = new FileInputStream("res/data5.txt");
		scan = new Scanner(fis, "UTF-8");

		Member[] m = new Member[num];

		{
			int i = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");

				m[i] = new Member();

				m[i].id = Integer.parseInt(tokens[0]);
				m[i].uid = tokens[1];
				m[i].name = tokens[2];
				m[i].age = Integer.parseInt(tokens[3]);

				i++;
			}
		}

		scan.close();
		fis.close();

		// 출력------------------------------------------

		for (int i = 0; i < m.length; i++) {
			System.out.printf("[id] : %2d,  [uid] : %10s,  [name] : %3s,  [age] : %3d\n", m[i].id, m[i].uid, m[i].name,
					m[i].age);
		}
		System.out.println();
		System.out.println("작업완료");
	}

}