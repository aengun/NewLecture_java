package chapter7ex4.oop1.copy;

public class StatusBoard {

	private int myOmokColor;
	private int turnOmokColor;

	public void print() {
		char myOmokImg = '��'; // 0
		char turnOmokImg = '��';

		if (myOmokColor == 1)
			myOmokImg = '��';

		if (turnOmokColor == 1)
			turnOmokImg = '��';

		System.out.println("������������������������������������");
		System.out.printf("       my Omok %c\tturn %c\n", myOmokImg, turnOmokImg);
		System.out.println("������������������������������������");
	}

	public void setMyOmokColor(int myOmokColor) {
		this.myOmokColor = myOmokColor;
	}

	public int getMyOmokColor() {
		return myOmokColor;
	}

	public int getTurnOmokColor() {
		return turnOmokColor;
	}

	public void setTurnOmokColor(int turnOmokColor) {
		this.turnOmokColor = turnOmokColor;
	}

}
