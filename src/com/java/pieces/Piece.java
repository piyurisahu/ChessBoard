package com.java.pieces;

import java.util.ArrayList;

import javafx.util.Pair;

public interface Piece {
	
	
	public  ArrayList<Pair<Integer,Integer>>  getMovesFrom(int i, int j) ;

}
