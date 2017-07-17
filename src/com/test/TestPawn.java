package com.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
		ArrayList<Pair> actual=pawn.getMovesFrom(2, 1);
		assertFalse(actual.contains(new Pair(2,1)));
		
		assertTrue(actual.contains(new Pair(3,1)));
		
	}
}





