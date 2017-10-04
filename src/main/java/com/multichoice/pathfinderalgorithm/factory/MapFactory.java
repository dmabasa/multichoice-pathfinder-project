package com.multichoice.pathfinderalgorithm.factory;

import com.multichoice.pathfinderalgorithm.common.MapBuilder;
import com.multichoice.pathfinderalgorithm.map.FileMap;
import com.multichoice.pathfinderalgorithm.map.StaticMap;

public class MapFactory {
	
	public MapBuilder getMapBuilder(String builder)
	{
		if (builder == null) {
			return null;
		}
		if (builder.equalsIgnoreCase("FILE")) {
			String filepath = "./large_map.txt";
			FileMap fileMap = new FileMap(filepath);
			fileMap.beforeInit();
			fileMap.init();
			fileMap.buildMap();
			fileMap.afterInit();
			return fileMap;

		} else if (builder.equalsIgnoreCase("STATIC")) {
			StaticMap staticMap = new StaticMap();
			staticMap.beforeInit();
			staticMap.init();
			staticMap.buildMap();
			staticMap.afterInit();
			return staticMap;
		}
		return null;
	}
}
