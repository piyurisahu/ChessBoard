package com.java.pieces;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javafx.util.Pair;

public class Rook extends Piece{

	
	public ArrayList<Pair> getMovesFrom(int row, int col) {
		ArrayList<Pair> listOfMoves=new ArrayList<Pair>();
		listOfPositionInColumn(row, col, listOfMoves);
		listOfPositionInRow(row, col, listOfMoves);
		
		return listOfMoves;
	}

	
	
}
