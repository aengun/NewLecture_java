package chapter7ex4.oop1.copy;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int turnOmokColor = 0;
		int x, y;

		OmokBoard omokBoard = new OmokBoard();
		OmokBowl blackBowl = new OmokBowl();
		OmokBowl whiteBowl = new OmokBowl();
		blackBowl.setOmokColor(0);
		whiteBowl.setOmokColor(1);
		StatusBoard statusBoard = new StatusBoard();
		statusBoard.setMyOmokColor(0); // ��� ����
		statusBoard.setTurnOmokColor(turnOmokColor); // ��� ����,, ��Ʈ�ѷ��� �� ��Ȳ�� �˱� ���� �� ���� �ڵ� �߰�

		Scanner scan = new Scanner(System.in);

		while (true) {
			// �ʱ� ȭ�� ���
			omokBoard.print();
			statusBoard.print();
			blackBowl.print();
			whiteBowl.print();

			System.out.println();

			System.out.print("(x sp y) > ");
			String line = scan.nextLine();
			String[] tokens = line.split(" ");
			x = Integer.parseInt(tokens[0]);
			y = Integer.parseInt(tokens[1]);

			// ���� ���ʿ� �ش�Ǵ� �׸����� �޶�� �Ѵ�.
			Omok omok;
			if (turnOmokColor == 0)
				omok = blackBowl.next();
			else
				omok = whiteBowl.next();

			omok.setX(x);
			omok.setY(y);
			omok.setColor(turnOmokColor);

			omokBoard.put(omok);

			if (turnOmokColor == 0)
				turnOmokColor = 1;
			else
				turnOmokColor = 0;
		}

	}

}
