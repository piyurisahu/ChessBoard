package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.java.pieces.Horse;

import javafx.util.Pair;

public class TestHorse {

	@Test
	public void getListOfNextMoves()
	{
	Horse horse=new Horse();
	ArrayList<Pair> listOfMoves=horse.getMovesFrom(3, 4);
	
	assertFalse(listOfMoves.contains(new Pair(3,4)));
	
	assertTrue(listOfMoves.contains(new Pair(1,3)));
	assertTrue(listOfMoves.contains(new Pair(1,5)));
	assertTrue(listOfMoves.contains(new Pair(5,3)));
	assertTrue(listOfMoves.contains(new Pair(5,5)));
	assertTrue(listOfMoves.contains(new Pair(2,2)));
	assertTrue(listOfMoves.contains(new Pair(4,2)));
	assertTrue(listOfMoves.contains(new Pair(2,6)));
	assertTrue(listOfMoves.contains(new Pair(4,6)));
	
	}
	
	

}
