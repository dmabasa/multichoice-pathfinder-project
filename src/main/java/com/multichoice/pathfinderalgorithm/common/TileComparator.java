package com.multichoice.pathfinderalgorithm.common;

import java.util.Comparator;


public class TileComparator implements Comparator<Tile>
{

	public int compare(Tile tile1, Tile tile2) {

		float f1 = tile1.getEstimatedCost() + tile1.getPathCost();
		float f2 = tile2.getEstimatedCost() + tile2.getPathCost();

		
		return Float.compare(f1, f2);
	}
}
