
public class Chapter3Ex4LoopProgram {

	public static void main(String[] args) {

		// 10�� �ݺ��ϴ� �ڵ� ����� ����� �ּ���
		// for�� ����
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// ���� 1. 0 ~ 9 >> 1 ~ 10
		// ���� 2. 10 ~ 1
		// ���� 3. 1 ~ 51 ~ 5
		System.out.println();
		System.out.println("=====����  1=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		System.out.println();
		System.out.println("=====����  2=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}

		System.out.println();
		System.out.println("=====����  3=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(i % 5 + 1);
		}

	}

}
