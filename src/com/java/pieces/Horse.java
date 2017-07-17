package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public class Horse extends Piece{

	@Override
	public ArrayList<Pair> getMovesFrom(int i, int j) {
		// TODO Auto-generated method stub
		ArrayList<Pair> listOfMoves=new ArrayList<Pair>();
		listOfMoves.add(new Pair(i-2,j-1));
		listOfMoves.add(new Pair(i-2,j+1));
		listOfMoves.add(new Pair(i+2,j-1));
		listOfMoves.add(new Pair(i+2,j+1));
		listOfMoves.add(new Pair(i-1,j-2));
		listOfMoves.add(new Pair(i+1,j-2));
		listOfMoves.add(new Pair(i+1,j+2));
		listOfMoves.add(new Pair(i-1,j+2));
		return listOfMoves;
	}

}
