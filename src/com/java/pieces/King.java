package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public class King extends Piece {

	
		@Override
		public ArrayList<Pair> getMovesFrom(int i, int j) {
		
			ArrayList<Pair> listOfMoves=new ArrayList<Pair>();
		
			
			listOfMoves.add(new Pair(i,j+1));
			listOfMoves.add(new Pair(i+1,j));
			listOfMoves.add(new Pair(i-1,j));
			listOfMoves.add(new Pair(i,j-1));
			listOfMoves.add(new Pair(i-1,j+1));
			listOfMoves.add(new Pair(i-1,j-1));
			listOfMoves.add(new Pair(i+1,j+1));
			listOfMoves.add(new Pair(i+1,j-1));
			return listOfMoves;
		}

	}

