package chapter7ex5;

public class Exam {

	private int kor;
	private int eng;
	private int math;

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
