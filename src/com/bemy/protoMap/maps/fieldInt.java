package com.bemy.protoMap.maps;
/*
 * interface field, a field or place where interaction occurs.
 * The field could be outdoor or indoor. 
 * If outdoor, it may contain objects such as tree, hill, rocks, etc. 
 * If indoor, it may contain objects such as wall, door, window, furniture, etc.
 * It uses tiles as its coordinates.
 */


public interface fieldInt{
	
	int[][] getBackMap();
	void setBackMap(int[][] backMap);


}