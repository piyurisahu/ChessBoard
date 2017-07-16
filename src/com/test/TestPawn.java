package com.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.Pawn;

import javafx.util.Pair;

public class TestPawn {
	@Test
	public void getNextMove()
	{
		Pawn pawn=new Pawn();
		Pair<Integer,Integer> actual=pawn.getMoveFrom(2,1);
		Pair<Integer,Integer> expected=new Pair<Integer, Integer>(2,2);
		assertEquals(expected, actual);
	}

}
