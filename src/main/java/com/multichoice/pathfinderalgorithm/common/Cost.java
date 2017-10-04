package com.multichoice.pathfinderalgorithm.common;

public enum Cost {
	
	WATER(0),
	DOT(1),
	FOREST(2),
	GOAL(1),
	START(1),
	MOUNTAIN(3);
	
	private int cost;
	
	Cost(int cost)
	{
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
}
