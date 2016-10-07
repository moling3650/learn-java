package com.games;

public class TypeT extends Tetromino {

	public TypeT(int row, int col) {
		super();
		cells[0] = new Cell(row, col-1);
		cells[1] = new Cell(row, col);
		cells[2] = new Cell(row, col+1);
		cells[3] = new Cell(row+1, col);
	}
}
