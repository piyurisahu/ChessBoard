package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.java.Board;
import com.java.pieces.King;
import com.java.pieces.Pawn;

public class TestBoard 
{

	Board board;
	@Before
	public void setUp()
	{
		
		board=new Board();
	}
	@Test
	public void checkfor_AddingPawn()
	{
		board.addPiece(new Pawn(),2,1);	
		Pawn pawn=new Pawn();
		assertEquals(pawn.getClass(), board.GetPiece(2, 1).getClass());
	}
	
	@Test
	public void checkFor_AddingKing()
	{
		board.addPiece(new King(),3,4);
		King king=new King();
		assertEquals(king.getClass(), board.GetPiece(3, 4).getClass());
	}
	
	


}