package com.games;

public class Tetris {
	private String[][] playBoard;

	public Tetris(int height, int width) {
		playBoard = new String[height + 1][width + 2];
		for (int row = 0; row < playBoard.length; row++) {
			for (int col = 0; col < playBoard[row].length; col++) {
				if (row == height || col == 0 || col == width + 1) {
					playBoard[row][col] = "■ ";
				} else {
					playBoard[row][col] = "□ ";
				}
			}
		}
	}

	public void printPlayBoard(Cell cell) {
		for (int row = 0; row < playBoard.length - 1; row++) {
			for (int col = 1; col < playBoard[row].length - 1; col++) {
				if (row == cell.getRow() && col == cell.getCol()) {
					System.out.print("■ ");
				} else {
					System.out.print(playBoard[row][col]);
				}
			}
			System.out.println();
		}
	}
	
	public void printPlayBoard(Tetromino tetromino) {
		System.out.println("===== 打印画面 =====");
		for (int row = 0; row < playBoard.length - 1; row++) {
			for (int col = 1; col < playBoard[row].length - 1; col++) {
				String temp = "□ ";
				for (Cell cell : tetromino.getCells()) {
					if (row == cell.getRow() && col == cell.getCol()) {
						temp = "■ ";
					} 					
				}
				System.out.print(temp);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Tetris tetris = new Tetris(10, 5);
//		Cell cell = new Cell(0, 1);
//		System.out.println("------print cell-------");
//		tetris.printPlayBoard(cell);
//		System.out.println("------drop-------");
//		cell.drop();
//		tetris.printPlayBoard(cell);
//		System.out.println("------move left-------");
//		cell.moveLeft();
//		tetris.printPlayBoard(cell);
//		System.out.println("------move right-------");
//		cell.moveRight();
//		tetris.printPlayBoard(cell);
		TypeT t = new TypeT(0, 3);
		tetris.printPlayBoard(t);
		t.drop();
		tetris.printPlayBoard(t);
		t.moveLeft();
		tetris.printPlayBoard(t);
		t.moveRight();
		tetris.printPlayBoard(t);
		
	}
}
