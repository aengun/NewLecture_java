package chapter7ex4.oop1;

public class StatusBoard {
	private int color;
	private int turn;

	public void print() {
		char imgTurn = '≒';
		char imgMy = '≒';

		if (color == 1) // �羃鶺抶�
			imgMy = '≒';

		if (turn == 1) // �羃鶺抶�
			imgTurn = '∞';

		System.out.println("忙式式式式式式式式式式式式式式式式忖");
		System.out.printf("       my Omok %c\tturn %c\n", imgMy, imgTurn);
		System.out.println("戌式式式式式式式式式式式式式式式式戎");
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
