package chapter7ex1;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * 1. 알맹이 : 값을 가지는 그릇(개념단위의 그릇)-엔티티:개체 2. 서비스 : 알맹이들을 가지고 있던지 가져오던지..해서 알맹이들을
		 * 제공해주는 서비스 3. 껍데기 : 사용자의 입력/출력을 도와주는 사용자 인터페이스
		 */

		// 알맹이
//		int[] lotto = new int[6];
//		chapter6ex5.entity.Lotto lo1 = new chapter6ex5.entity.Lotto();
//		chapter7ex1.entity.Lotto lotto = new chapter7ex1.entity.Lotto();
		// 위와 같이 entity 이름이 같은 경우, 주소를 이용해 쓴구분한다.
		// 더 자주 사용하는건 그냥 import에 넣기
		Lotto lotto = new Lotto();

		// 초기화
		Lotto.init(lotto);

		// 번호를 생성 gen
		Lotto.gen(lotto);

		// 번호를 출력 print
		Lotto.print(lotto);

		// 번호를 정렬 sort
		Lotto.sort(lotto);

		// 번호를 출력 print
		Lotto.print(lotto);

	}

}