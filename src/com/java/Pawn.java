package com.java;
import javafx.util.Pair;

public class Pawn {
	public void run()
	{
	Pair<Integer, Integer> p1=new Pair<Integer, Integer>(1, 2);
	}

	public  Pair<Integer, Integer> getMoveFrom(int i, int j) {
		// TODO Auto-generated method stub
		return new Pair<Integer, Integer>(i,j+1);
	}
}
