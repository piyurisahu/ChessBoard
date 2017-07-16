package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.Board;
import com.java.Pawn;

public class TestBoard 
{

	@Test
	public void checkfor_AddingAPiece()
	{
		Board board=new Board();
		board.addPiece(new Pawn(),2,1);	
		Pawn pawn=new Pawn();
		assertEquals(pawn.getClass(), board.GetPiece(2, 1).getClass());
	}

}