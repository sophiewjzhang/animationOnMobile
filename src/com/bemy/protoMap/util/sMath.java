package com.bemy.protoMap.util;

public class sMath {
	static public final float min(float a, float b) {
		return (a <= b) ? a : b;
	}
	public static final double random(){
		return Math.random();
	}
	public static float distance(float x, float y){
		return Math.abs(y-x);
	}
	public static float area(float width, float height){
		return width*height;
	}
/*	public static float area(Point p1, Point p2){
		return Math.abs( (p2.X()-p1.X())*(p2.Y()-p1.Y()) );
	}*/
}
