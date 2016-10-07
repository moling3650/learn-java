package com.games;

import java.util.Arrays;

abstract public class Tetromino {
	public Cell[] getCells() {
		return cells;
	}

	protected Cell[] cells;
	
	public Tetromino() {
		cells = new Cell[4];
	}
	
	public void drop() {
		for (Cell cell : cells) {
			cell.drop();
		}		
	}
	
	public void moveLeft() {
		for (Cell cell : cells) {
			cell.moveLeft();
		}
	}
	
	public void moveRight() {
		for (Cell cell : cells) {
			cell.moveRight();
		}		
	}

	@Override
	public String toString() {
		return "Tetromino [cells=" + Arrays.toString(cells) + "]";
	}
}
