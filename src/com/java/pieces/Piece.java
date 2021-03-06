package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public abstract class  Piece {


	public abstract  ArrayList<Pair>  getMovesFrom(int i, int j) ;
	
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
	
	public  void listOfPositionInRow(int row, int col, ArrayList<Pair> listOfMoves) {
		for(int i=0;i<8;i++)
		{
				if(i!=col)
				listOfMoves.add(new Pair(row,i));
		}
	}

	public void listOfPositionInColumn(int row, int col, ArrayList<Pair> listOfMoves) {
		for(int i=0;i<8;i++)
		{
				if(i!=row)
				{
				listOfMoves.add(new Pair(i,col));
				}
		}
	}


}
