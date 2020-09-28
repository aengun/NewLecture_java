package chapter7ex5;

import java.util.Scanner;

public class ExamConsole {
	// input 메소드와 print메소드가 공유하기 위해 변수로 선언
	// 부품으로 객체를 가짐으로써 그의 능력을 상속받는 has a 상속
	private Exam2 exam; // Exam2는 ExamConsole의 구성(부품)이다.

	public ExamConsole() {
		exam = new Exam2(0, 0, 0); // composition has a 관계로 생성하는 방법
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("kor : ");
		int kor = scan.nextInt();
		System.out.print("eng : ");
		int eng = scan.nextInt();
		System.out.print("math : ");
		int math = scan.nextInt();

//		exam.setEng(kor);
//		exam.setEng(eng);
//		exam.setEng(math);

		exam = new Exam2(kor, eng, math); // 요즘은 메모리가 널럴해서 위의 생성자에서 생성한 객체와 별개로 새로 생성해도 된다.

	}

	public void print() {
		System.out.printf("kor : %d, eng : %d, math : %d, total : %d, avg : %f\n", exam.getKor(), exam.getEng(),
				exam.getMath(), exam.total(), exam.avg());
	}

	public void setExam(Exam2 exam) {
		this.exam = exam;
	}

}
