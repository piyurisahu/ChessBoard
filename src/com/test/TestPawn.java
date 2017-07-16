package com.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.java.pieces.Pawn;

import javafx.util.Pair;

public class TestPawn {
	
	@Test
	public void getNextMoves()
	{
		Pawn pawn=new Pawn();
		ArrayList<Pair<Integer, Integer>> actual=pawn.getMovesFrom(2, 1);
		assertTrue(actual.contains(new Pair<Integer,Integer>(3,1)));
		
	}
}





