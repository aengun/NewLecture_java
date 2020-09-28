package chapter7ex5;

import java.util.Scanner;

public class ExamConsole {
	// input �޼ҵ�� print�޼ҵ尡 �����ϱ� ���� ������ ����
	// ��ǰ���� ��ü�� �������ν� ���� �ɷ��� ��ӹ޴� has a ���
	private Exam2 exam; // Exam2�� ExamConsole�� ����(��ǰ)�̴�.

	public ExamConsole() {
		exam = new Exam2(0, 0, 0); // composition has a ����� �����ϴ� ���
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

		exam = new Exam2(kor, eng, math); // ������ �޸𸮰� �η��ؼ� ���� �����ڿ��� ������ ��ü�� ������ ���� �����ص� �ȴ�.

	}

	public void print() {
		System.out.printf("kor : %d, eng : %d, math : %d, total : %d, avg : %f\n", exam.getKor(), exam.getEng(),
				exam.getMath(), exam.total(), exam.avg());
	}

	public void setExam(Exam2 exam) {
		this.exam = exam;
	}

}
