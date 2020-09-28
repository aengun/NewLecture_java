package chapter7ex5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

//		// 성적
//		int kor;
//		int eng;
//		int math;

		// exam객체를 생성

		// 성적 입력
//		exam.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("kor : ");
		int kor = scan.nextInt();
		System.out.print("eng : ");
		int eng = scan.nextInt();
		System.out.print("math : ");
		int math = scan.nextInt();

//		Exam exam = new Exam();
//		exam.setKor(kor);
//		exam.setEng(eng);
//		exam.setMath(math);

		Exam2 exam = new Exam2(kor, eng, math);
//		Exam2 exam2 = new Exam2();
		
		// 총점 계산
		int total = exam.total();
		float avg = exam.avg();

		System.out.printf("kor : %d, eng : %d, math : %d, total : %d, avg : %f\n", exam.getKor(), exam.getEng(),
				exam.getMath(), total, avg);

	}

}
