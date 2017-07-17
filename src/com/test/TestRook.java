package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import com.java.pieces.Rook;

import javafx.util.Pair;

public class TestRook {
	@Test
	public void getListOf_NextMoves()
	{
		Rook rook=new Rook();
		ArrayList<Pair> actual=rook.getMovesFrom(3, 4);
		assertFalse(actual.contains(new Pair(3,4)));
		
		ArrayList<Pair> expected=new ArrayList<Pair>();
		rook.listOfPositionInColumn(3, 4, expected);
		rook.listOfPositionInRow(3, 4, expected);
		assertEquals(expected, actual);	
	}
}
