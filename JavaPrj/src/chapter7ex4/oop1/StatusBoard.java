package chapter7ex4.oop1;

public class StatusBoard {
	private int color;
	private int turn;

	public void print() {
		char imgTurn = '��';
		char imgMy = '��';

		if (color == 1) // ����̸�
			imgMy = '��';

		if (turn == 1) // ����̸�
			imgTurn = '��';

		System.out.println("������������������������������������");
		System.out.printf("       my Omok %c\tturn %c\n", imgMy, imgTurn);
		System.out.println("������������������������������������");
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

}
