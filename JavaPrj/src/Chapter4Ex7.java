import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex7 {

	public static void main(String[] args) throws IOException {

		// scan.nextInt(); //������ ��ȯ�� ������ �ֱ� ������ �� ������� ����(�������� �ƴϸ� ������, �����̽��� ���е� ��츸����)

		// ��ü ������ ���
		// �� ���� ������ ���
		// ��������������������������������������
		// �� ����ǥ ��
		// ��������������������������������������
		// [1��] ���� : 802, ��� : 80
		// [2��] ���� : ....
		// ..
		// ��ü ���� : 1023, ��� : 75...

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		// ������ �ε�
		int classes = 3;
		int students = 9;
		int[][] kors = new int[classes][students];

		int index = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			for (int j = 0; j < students; j++) {
				kors[index][j] = Integer.parseInt(tokens[j]);
			}
			index++;
		}

		scan.close();
		fis.close();

		// ���� �� ��� ���ϱ�
		float[][] scores = new float[classes+1][2];

		for (int i = 0; i < classes; i++) {
			int sum = 0;
			float avg = 0;
			for (int j = 0; j < students; j++) {
				sum += kors[i][j];
			}
			scores[i][0] = sum; // ����
			avg = (float) sum / students;
			scores[i][1] = avg; // ���
		}

		// ��ü ����, ���
		scores[3][0] = scores[0][0] + scores[1][0] + scores[2][0];
		scores[3][1] = scores[3][0] / (classes * students);

		// ���
		System.out.println("����������������������������������������");
		System.out.println("��			����ǥ			��");
		System.out.println("����������������������������������������");

		for (int i = 0; i < scores.length; i++) {
			if (i == 3)
				System.out.printf("[ ��ü ] ���� : %4.0f, ��� %6.2f\n", scores[i][0], scores[i][1]);
			else
				System.out.printf("[ %d�� ] ���� : %4.0f, ��� %6.2f\n", i + 1, scores[i][0], scores[i][1]);
		}

	}

}
