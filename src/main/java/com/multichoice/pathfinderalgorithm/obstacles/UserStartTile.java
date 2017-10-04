package com.multichoice.pathfinderalgorithm.obstacles;

import com.multichoice.pathfinderalgorithm.common.Cost;
import com.multichoice.pathfinderalgorithm.common.Obstacle;

public class UserStartTile extends Obstacle
{

	public UserStartTile() {

		super("@", Cost.START.getCost());
	}
}
