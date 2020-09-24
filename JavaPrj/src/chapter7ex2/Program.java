package chapter7ex2;

public class Program {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		// Lotto.init(lotto); => �ʱ�ȭ�� �� ���� ����Ǿ���� >> ���� �ڵ�� �ذ�

		// ��ȣ�� ���� gen
		// Lotto.gen(lotto); // function ��� �ڹٿ����� method�� �� => ������ ���� static method�� ��
		lotto.gen();// service function => method => instance method

		// ��ȣ�� ��� print
		// Lotto.print(lotto);

		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto.nums[i]);
		System.out.println();

		// ��ȣ�� ���� sort
		// Lotto.sort(lotto);
		lotto.sort();

		// ��ȣ�� ��� print
		// Lotto.print(lotto);
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto.nums[i]);
		System.out.println();

	}

}