package com.java;

import com.java.pieces.Pawn;
import com.java.pieces.Piece;

public class Board {
	
	
	private Piece[][] chessBoard=new Piece[8][8];
	
	public void addPiece(Piece piece, int i, int j) {
		chessBoard[i][j]=piece;
		
	}

	public Piece GetPiece(int i, int j) {
		// TODO Auto-generated method stub
		return this.chessBoard[i][j];
	}

	
}
