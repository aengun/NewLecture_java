package chapter7ex4.oop1;

public class OmokBowl {
	private int color;
	private Omok[] omoks;
	private int size;

	public OmokBowl() {
		color = 0; // black
		size = 100;
		omoks = new Omok[size];
		for (int i = 0; i < 100; i++) {
			omoks[i] = new Omok();
			omoks[i].setColor(color);
		}
	}

	public void print() {
		char img = '��';

		if (color == 1) // ����̸�
			img = '��';

		System.out.printf("%c [%d]", img, size);
	}
}
