package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class GoalTile extends Obstacle
{

	public GoalTile() {

		super("X", Cost.GOAL.getCost());
	}
}
