package com.java.pieces;
import java.util.ArrayList;

import javafx.util.Pair;

public class Pawn implements Piece {
	@Override
	public ArrayList<Pair<Integer, Integer>> getMovesFrom(int i, int j) {

		ArrayList<Pair<Integer, Integer>> listOfMoves=new ArrayList<Pair<Integer, Integer>>();
		listOfMoves.add(new Pair<Integer,Integer>(i+1,j));
		return listOfMoves;
	}
}

