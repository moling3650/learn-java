package com.games;

public class Tetris {
	private String[][] playBoard;
	
	public Tetris(int width, int height) {
		playBoard = new String[height][width];
		for (int i = 0; i < playBoard.length; i++) {
			for (int j = 0; j < playBoard[i].length; j++) {
				playBoard[i][j] = "- ";
//				playBoard[i][j] = (i < playBoard.length - 1) ? "- " : "* ";
				
			}
		}		
	}
	
	public void printPlayBoard(Cell cell) {
		for (int row = 0; row < playBoard.length; row++) {
			for (int col = 0; col < playBoard[row].length; col++) {
				if (row == cell.getRow() && col == cell.getCol()) {
					System.out.print("* ");
				} else {					
					System.out.print(playBoard[row][col]);
				}
			}
			System.out.println();
		}		
	}

	public static void main(String[] args) {
		Tetris tetris = new Tetris(8, 20);
		Cell cell = new Cell(0, 1);
		System.out.println("------print cell-------");
		tetris.printPlayBoard(cell);
		System.out.println("------drop-------");
		cell.drop();
		tetris.printPlayBoard(cell);
		System.out.println("------move left-------");
		cell.moveLeft();
		tetris.printPlayBoard(cell);
		System.out.println("------move right-------");
		cell.moveRight();
		tetris.printPlayBoard(cell);
	}
}
