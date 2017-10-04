package com.multichoice.pathfinderalgorithm;

import com.multichoice.pathfinderalgorithm.factory.MapFactory;


public class FileMapApp
{
	public static void main(String[] args) {

		MapFactory factory = new MapFactory();
		factory.getMapBuilder("FILE").findPath(0, 0, 49, 49);
	}
}
