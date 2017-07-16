package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import com.java.pieces.Rook;

import javafx.util.Pair;

public class TestRook {
	@Test
	public void getListOf_NextMoves()
	{
		Rook rook=new Rook();
		ArrayList<Pair<Integer, Integer>> actual=rook.getMovesFrom(3, 4);
		assertFalse(actual.contains(new Pair<Integer, Integer>(3,4)));
		System.out.println(actual);
		assertTrue(actual.contains(new Pair<Integer, Integer>(3,3)));
		
	}
}
