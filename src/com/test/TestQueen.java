package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.java.pieces.Queen;

import javafx.util.Pair;

public class TestQueen {

	@Test
	public void getListOfNextMoves()
	{
		Queen queen=new Queen();
		ArrayList<Pair> actual=queen.getMovesFrom(3,3);
		ArrayList<Pair> expected=new  ArrayList<Pair>();
		queen.getListOfDiagonalMoves(3,3,expected);
		
		
		assertTrue(actual.contains(new Pair(0,0)));
		assertTrue(actual.contains(new Pair(1,1)));
		assertTrue(actual.contains(new Pair(2,2)));
		assertTrue(actual.contains(new Pair(4,4)));
		assertTrue(actual.contains(new Pair(5,5)));
		assertTrue(actual.contains(new Pair(6,6)));
		assertTrue(actual.contains(new Pair(7,7)));
		assertTrue(actual.contains(new Pair(4,2)));
		assertTrue(actual.contains(new Pair(5,1)));
		assertTrue(actual.contains(new Pair(6,0)));
		assertTrue(actual.contains(new Pair(2,4)));
		assertTrue(actual.contains(new Pair(1,5)));
		assertTrue(actual.contains(new Pair(0,6)));
		
		assertFalse(actual.contains(new Pair(3,3)));
		
		
	}

	

}
