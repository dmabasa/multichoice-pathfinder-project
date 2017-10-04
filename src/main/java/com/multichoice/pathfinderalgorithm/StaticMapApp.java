package com.multichoice.pathfinderalgorithm;

import com.multichoice.pathfinderalgorithm.factory.MapFactory;

public class StaticMapApp
{
	public static void main(String[] args) {

		MapFactory factory = new MapFactory();
		factory.getMapBuilder("STATIC").findPath(0, 0, 4, 4);
	}
}
