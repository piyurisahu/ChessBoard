package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.java.pieces.King;
import com.java.pieces.Pawn;

import javafx.util.Pair;

public class TestKing {
	@Test
	public void getListOf_NextMoves()
	{
		King king=new King();
		ArrayList<Pair<Integer, Integer>> actual=king.getMovesFrom(3, 4);
	
		assertTrue(actual.contains(new Pair<Integer, Integer>(2,3)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(2,4)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(2,5)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(3,5)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(4,5)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(4,4)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(4,3)));
		assertTrue(actual.contains(new Pair<Integer, Integer>(3,3)));
		
	}

}
