package chapter7ex5;

public class Exam2 {

	private int kor;
	private int eng;
	private int math;

	public Exam2() { // 기본 생성자 => 오버로드한 생성자가 있다면 꼭 작성해야함
//		this.kor = 0;
//		this.eng = 0;
//		this.math = 0;

		// 집중화가 필요하다.
		this(0, 0, 0);
	}

	// 오버로드(OverLoad 메소드 또는 생성자)
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
