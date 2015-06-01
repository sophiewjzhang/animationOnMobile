package com.bemy.protoMap.core.geom;
/*
 * @name shapeAbs
 * @description:  the shape family is based on Cartesian coordinate system.
 * Each shape outputs integer points. 
 * Shape list
 * *********Point
 * *********Line
 * *********Ellipse
 * *********Circle
 * *********Rectangle
 * *********Polygon
 * *********Bezier Curve
 * Public Methods:
 * ---------public void moveTo(int x, int y): move the shape to a new position.
 */
public abstract class shape extends shapeAbs implements shapeInt{
	private static final long serialVersionUID = 1100000L;
	
	public shape(){
		this.setPosition(0, 0);
	}
	public void moveTo(int x, int y){
		this.setPosition(x, y);
	}
}