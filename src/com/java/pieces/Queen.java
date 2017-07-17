package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public class Queen extends Piece{

	@Override
	public ArrayList<Pair> getMovesFrom(int row, int col) {
		ArrayList<Pair> listOfMoves=new ArrayList<>();
		getListOfDiagonalMoves(row, col, listOfMoves);
		return listOfMoves;
	}

	public void getListOfDiagonalMoves(int row, int col, ArrayList<Pair> expected) {
		
		for(int i=0,j=0;i<8&&j<8;i++,j++)
		{
			if(isLegal(row, col, i, j))
			{
				expected.add(new Pair(i,j));
			}
			
		}
		
		for(int i=row,j=col;i<8 && j>=0;i++,j--)
		{
			if(isLegal(row, col, i, j))
			{
				expected.add(new Pair(i, j));
				
			}
		}
		
		for(int i=row,j=col;j<8 && i>=0;i--,j++)
		{
			if(isLegal(row, col, i, j))
			{
				expected.add(new Pair(i, j));
				
			}
		}
		
		
	}

	private boolean isLegal(int row, int col, int i, int j) {
		return i!=row && j!=col;
	}

	

}
