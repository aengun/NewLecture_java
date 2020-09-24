package chapter7ex2;

public class Program {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		// Lotto.init(lotto); => 초기화는 한 번만 실행되어야함 >> 위의 코드로 해결

		// 번호를 생성 gen
		// Lotto.gen(lotto); // function 사실 자바에서는 method라 함 => 구분을 위해 static method라 함
		lotto.gen();// service function => method => instance method

		// 번호를 출력 print
		// Lotto.print(lotto);

		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto.nums[i]);
		System.out.println();

		// 번호를 정렬 sort
		// Lotto.sort(lotto);
		lotto.sort();

		// 번호를 출력 print
		// Lotto.print(lotto);
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto.nums[i]);
		System.out.println();

	}

}