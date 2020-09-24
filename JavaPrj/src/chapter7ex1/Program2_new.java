package chapter7ex1;

public class Program2_new {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		Lotto.init(lotto);

		// 번호를 생성 gen
		Lotto.gen(lotto);

		// 번호를 출력 print
		// Lotto.print(lotto);

		// 번호를 정렬 sort
		Lotto.sort(lotto);

		// 번호를 출력 print
		Lotto.print(lotto);

	}

}