package chapter6ex5;

import chapter6ex5.controller.LottoController;
import chapter6ex5.entity.Lotto;

public class Program {

	public static void main(String[] args) {

		// ������
		// ������ �ȿ� ���� �ڵ� => ����
		// ������ ���� �ڷᱸ��(������) => �˸���

		// �ζ�
		// �ζ� ����
		// �ζ� ��Ʈ�� => ��/�ȵ���̵�/������ �� ������


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
