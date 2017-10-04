package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class Mountain extends Obstacle
{

	public Mountain() {

		super("^", Cost.MOUNTAIN.getCost());
	}
}
