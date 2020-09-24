package chapter6ex5;

import chapter6ex5.controller.LottoController;
import chapter6ex5.entity.Lotto;

public class Program {

	public static void main(String[] args) {

		// 껍데기
		// 껍데기 안에 심을 코드 => 서비스
		// 껍데기 안의 자료구조(데이터) => 알맹이

		// 로또
		// 로또 서비스
		// 로또 컨트롤 => 웹/안드로이드/윈도우 등 껍데기


		EXIT: while (true)
			switch (inputMenu()) {
			case 1:
				LottoController.inputLottoCount();
				break;
			case 2:
				LottoController.inputLotto();
				break;
			case 3:
				LottoController.listLotto();
				break;
			case 4:
				System.out.println("Bye~~");
				break EXIT;
			}

	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
