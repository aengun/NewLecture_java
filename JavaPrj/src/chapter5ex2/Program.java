package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

//      회원(Member) 이수철회원;
//      묶어서->그룹화->데이터형식
//      구조화(=그룹화), 구조적인, 구조

		Member m1 = new Member();

		String line = scan.nextLine();
		String[] tokens = line.split(",");

		m1.id = Integer.parseInt(tokens[0]);
		m1.uid = tokens[1];
		m1.name = tokens[2];
		m1.age = Integer.parseInt(tokens[3]);

		// 로드 ------------------------------------------

		scan.close();
		fis.close();

		// 바꾸기-----------------------------------------

		// 출력------------------------------------------

		System.out.printf("[id] : %d,  [uid] : %s,  [name] : %s,  [age] : %d", m1.id, m1.uid, m1.name, m1.age);
		System.out.println("작업완료");
	}

}