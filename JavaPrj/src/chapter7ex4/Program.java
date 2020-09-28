package chapter7ex4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		
		Board board = new Board();
		System.out.printf("내꺼: %s, Turn: %s\n", board.getMyColor(), board.getTurnColor());
		
		Bowl bowl = new Bowl();
		System.out.printf("남은돌 백: %d, 흑: %d\n", bowl.getwStoneCnt(), bowl.getbStoneCnt());
		
		choiceCoordinate();
	}
	
	static void choiceCoordinate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		
		int row = scan.nextInt();
		int col = scan.nextInt();

		System.out.println(row);
		System.out.println(col);
	}

}
