package com.java.pieces;
import java.util.ArrayList;

import javafx.util.Pair;

public class Pawn implements Piece {
	

	public  Pair<Integer, Integer> getMoveFrom(int i, int j) {
		// TODO Auto-generated method stub
		return new Pair<Integer, Integer>(i+1,j);
	}

	@Override
	public ArrayList<Pair<Integer, Integer>> getMovesFrom(int i, int j) {
	
		ArrayList<Pair<Integer, Integer>> listOfMoves=new ArrayList<Pair<Integer, Integer>>();
	
		
		listOfMoves.add(new Pair<Integer,Integer>(i,j+1));
		listOfMoves.add(new Pair<Integer,Integer>(i+1,j));
		listOfMoves.add(new Pair<Integer,Integer>(i-1,j));
		listOfMoves.add(new Pair<Integer,Integer>(i,j-1));
		listOfMoves.add(new Pair<Integer,Integer>(i-1,j+1));
		listOfMoves.add(new Pair<Integer,Integer>(i-1,j-1));
		listOfMoves.add(new Pair<Integer,Integer>(i+1,j+1));
		listOfMoves.add(new Pair<Integer,Integer>(i+1,j-1));
		return listOfMoves;
	}

	
	}

