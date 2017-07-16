package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public class Rook implements Piece{

	@Override
	public ArrayList<Pair<Integer, Integer>> getMovesFrom(int row, int col) {
		ArrayList<Pair<Integer, Integer>> listOfMoves=new ArrayList<Pair<Integer, Integer>>();
		for(int i=0;i<8;i++)
		{
				if(i!=row)
				{
				listOfMoves.add(new Pair<Integer, Integer>(i,col));
				}
		}
		for(int i=0;i<8;i++)
		{
				if(i!=col)
				listOfMoves.add(new Pair<Integer, Integer>(row,i));
		}
		
		return listOfMoves;
	}

}
