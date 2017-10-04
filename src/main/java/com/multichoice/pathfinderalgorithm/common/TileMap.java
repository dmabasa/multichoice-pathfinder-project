package com.multichoice.pathfinderalgorithm.common;

import java.util.HashMap;
import java.util.Map;

import com.multichoice.pathfinderalgorithm.obstacles.DotTile;
import com.multichoice.pathfinderalgorithm.obstacles.Forest;
import com.multichoice.pathfinderalgorithm.obstacles.GoalTile;
import com.multichoice.pathfinderalgorithm.obstacles.Mountain;
import com.multichoice.pathfinderalgorithm.obstacles.UserStartTile;
import com.multichoice.pathfinderalgorithm.obstacles.Water;

public class TileMap {

	private static Map<String, Class<? extends Obstacle>> obstacles;

	static {

		obstacles = new HashMap<String, Class<? extends Obstacle>>();
		obstacles.put("~", Water.class); 
		obstacles.put("@", UserStartTile.class);
		obstacles.put("X", GoalTile.class);
		obstacles.put(".", DotTile.class);
		obstacles.put("*", Forest.class);
		obstacles.put("^", Mountain.class);
	}

	
	public static <T extends Obstacle> T getInstance(String symbol) {

		T instance = null;
		
		if (instance == null) {
			synchronized (Obstacle.class) {
				if (instance == null) {
					try {
						instance = (T) obstacles.get(symbol).newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return instance;
	}
}
