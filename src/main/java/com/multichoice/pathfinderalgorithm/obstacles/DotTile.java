package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class DotTile extends Obstacle
{

	public DotTile() {

		super(".", Cost.DOT.getCost());
	}
}
