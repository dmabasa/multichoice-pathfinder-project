package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class Forest extends Obstacle
{

	public Forest() {

		super("*", Cost.FOREST.getCost());
	}
}
