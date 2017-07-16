package com.java;
public class Board {
	
/*	private int[][] chessBoard=new int[8][8];*/
	
	private Pawn[][] chessBoard=new Pawn[8][8];
	
	public void addPiece(Pawn pawn, int i, int j) {
		chessBoard[i][j]=pawn;
		
	}

	public Pawn GetPiece(int i, int j) {
		// TODO Auto-generated method stub
		return this.chessBoard[i][j];
	}

	
}
