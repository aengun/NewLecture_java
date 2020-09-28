package chapter7ex4.oop1.copy;

public class OmokBowl {

	private int omokColor;
	private int omokSize;

	public OmokBowl() {
		this.omokColor = 0; // ����
		this.omokSize = 100;
	}

	public void print() {
		char img = '��';

		if (omokColor == 1) // ����̸�
			img = '��';

		System.out.printf("%c : [%d] ", img, omokSize);

	}

	public Omok next() {
		Omok omok = new Omok();
		
		omokSize--;

		return omok;
	}

	public int getOmokColor() {
		return omokColor;
	}

	public void setOmokColor(int omokColor) {
		this.omokColor = omokColor;
	}

	public int getOmokSize() {
		return omokSize;
	}

	public void setOmokSize(int omokSize) {
		this.omokSize = omokSize;
	}

}
