package com.java.pieces;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javafx.util.Pair;

public class Rook implements Piece{

	
	public ArrayList<Pair> getMovesFrom(int row, int col) {
		ArrayList<Pair> listOfMoves=new ArrayList<Pair>();
		listOfPositionInColumn(row, col, listOfMoves);
		listOfPositionInRow(row, col, listOfMoves);
		
		return listOfMoves;
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
	
	public Set<Pair> getMovesFrom2(int row, int col) {
		Set<Pair> listOfMoves=new TreeSet<Pair>();
		for(int i=0;i<8;i++)
		{
				if(i!=row)
				{
				listOfMoves.add(new Pair(i,col));
				}
		}
		for(int i=0;i<8;i++)
		{
				if(i!=col)
				listOfMoves.add(new Pair(row,i));
		}
		
		return listOfMoves;
	}
	
	
	
	
	

}
