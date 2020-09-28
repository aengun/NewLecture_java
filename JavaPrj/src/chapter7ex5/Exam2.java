package chapter7ex5;

public class Exam2 {

	private int kor;
	private int eng;
	private int math;

	public Exam2() { // �⺻ ������ => �����ε��� �����ڰ� �ִٸ� �� �ۼ��ؾ���
//		this.kor = 0;
//		this.eng = 0;
//		this.math = 0;

		// ����ȭ�� �ʿ��ϴ�.
		this(0, 0, 0);
	}

	// �����ε�(OverLoad �޼ҵ� �Ǵ� ������)
	public Exam2(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f;
	}

//	public void input() {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("kor : ");
//		kor = scan.nextInt();
//
//		System.out.print("eng : ");
//		eng = scan.nextInt();
//
//		System.out.print("math : ");
//		math = scan.nextInt();
//	}

}
