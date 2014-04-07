package com.bemy.protoMap.core.geom;

public abstract class pathIterator{
	//public variables
	public static final int SEG_CLOSE=0;
	public static final int SEG_CUBICTO=1;
	public static final int SEG_LINETO=2;
	public static final int SEG_MOVETO=3;
	public static final int SEG_QUADTO=4;
	public static final int WIND_EVEN_ODD=5;
	public static final int WIND_NON_ZERO=6;
	//private variables
	private boolean _isDone=false;
	//constructor
	public pathIterator(){
		
	}
	/*
	 * public methods
	 */
	/*
	 * Returns the coordinates and type of the current path segment in the iteration. 
	 * The return value is the path-segment type: SEG_MOVETO,etc. 
	 * A float array of length 6 must be passed in and can be used to store the coordinates of the point(s). 
	 * Each point is stored as a pair of float x,y coordinates. 
	 * SEG_MOVETO and SEG_LINETO types returns one point, SEG_QUADTO returns two points, SEG_CUBICTO returns 3 points and SEG_CLOSE does not return any points.
	 */
	public int currentSegment(float[] coords){
		int _curSeg=0;
		
		return _curSeg;		
	}
	public void next(){
		
	}	
	public boolean isDone(){
		return _isDone;
	}
	/*
	 * private methods
	 */
	

}