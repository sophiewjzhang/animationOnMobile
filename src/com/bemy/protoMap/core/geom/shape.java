/*
 * The shape family is based on Cartesian coordinate system, and output integer points.
 * Shape list
 * *********Point
 * *********Line
 * *********Ellipse
 * *********Circle
 * *********Rectangle
 * *********Polygon
 * *********Bezier Curve
 */
package com.bemy.protoMap.core.geom;

public abstract class shape extends shapeAbs implements shapeInt{
	private static final long serialVersionUID = 1100000L;
	
	public shape(){
		this.setPosition(0, 0);
	}
	public void moveTo(int x, int y){
		this.setPosition(x, y);
	}
}