package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class Water extends Obstacle
{

	public Water() {

		super("~", Cost.WATER.getCost());
	}
}
