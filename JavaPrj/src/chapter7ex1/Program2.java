package chapter7ex1;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * 1. �˸��� : ���� ������ �׸�(��������� �׸�)-��ƼƼ:��ü 2. ���� : �˸��̵��� ������ �ִ��� ����������..�ؼ� �˸��̵���
		 * �������ִ� ���� 3. ������ : ������� �Է�/����� �����ִ� ����� �������̽�
		 */

		// �˸���
//		int[] lotto = new int[6];
//		chapter6ex5.entity.Lotto lo1 = new chapter6ex5.entity.Lotto();
//		chapter7ex1.entity.Lotto lotto = new chapter7ex1.entity.Lotto();
		// ���� ���� entity �̸��� ���� ���, �ּҸ� �̿��� �������Ѵ�.
		// �� ���� ����ϴ°� �׳� import�� �ֱ�
		Lotto lotto = new Lotto();

		// �ʱ�ȭ
		Lotto.init(lotto);

		// ��ȣ�� ���� gen
		Lotto.gen(lotto);

		// ��ȣ�� ��� print
		Lotto.print(lotto);

		// ��ȣ�� ���� sort
		Lotto.sort(lotto);

		// ��ȣ�� ��� print
		Lotto.print(lotto);

	}

}