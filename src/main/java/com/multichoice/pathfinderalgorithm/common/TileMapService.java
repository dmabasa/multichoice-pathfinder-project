package com.multichoice.pathfinderalgorithm.common;

public interface TileMapService
{

	public int getWidth();
	public int getHeight();
	public void searchedLocation(int x, int y);
	public boolean walkable(int x, int y);
	public float getCost(int x1, int y1, int x2, int y2);
}
