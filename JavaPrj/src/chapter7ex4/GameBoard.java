package chapter7ex4;

public class GameBoard {
	
	private String[][] gameBoard = new String[20][20];
	
	GameBoard() {
		for (int i = 0; i < 20; i++)  {
			for (int j = 0; j < 20; j++) {
				System.out.print("┼");
			}
			System.out.println();
		}
			
	}

	public String[][] getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(String[][] gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	
}
