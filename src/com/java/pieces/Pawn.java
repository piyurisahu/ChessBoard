package com.java.pieces;
import java.util.ArrayList;

import javafx.util.Pair;

public class Pawn extends Piece {
	@Override
	public ArrayList<Pair> getMovesFrom(int i, int j) {

		ArrayList<Pair> listOfMoves=new ArrayList<Pair>();
		listOfMoves.add(new Pair(i+1,j));
		return listOfMoves;
	}
}

