package chapter7ex1;

public class Program2_new {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		Lotto.init(lotto);

		// ��ȣ�� ���� gen
		Lotto.gen(lotto);

		// ��ȣ�� ��� print
		// Lotto.print(lotto);

		// ��ȣ�� ���� sort
		Lotto.sort(lotto);

		// ��ȣ�� ��� print
		Lotto.print(lotto);

	}

}