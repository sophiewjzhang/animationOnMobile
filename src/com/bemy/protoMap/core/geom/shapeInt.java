package com.bemy.protoMap.core.geom;
/*
 * @name: shapeInt
 * @description: shape interface
 * Properties:
 * ----------x
 * ----------y
 * ----------width
 * ----------height
 * Methods:
 * ----------void setWidth(int w): set the width.
 * ----------void setHeight(int h): set the height.
 * ----------void setPosition(int x, int y): set the position.
 * ----------Rectangle getBounds(): get the boundary.
 * ----------boolean contains(Point p): if contains a point.
 * ----------boolean contains(shape s): if contains a shape.
 * ----------boolean intersect(shape s): if intersect with a shape.
 */
public interface shapeInt{	
	int x();
	int y();
	int width();
	int height();
	void setWidth(int w);
	void setHeight(int h);
	void setPosition(int x, int y);
	Rectangle getBounds();
	//test if the specified point is contained.
	boolean contains(Point p);
	//test if the specified shape is contained.
	boolean contains(shape s);
	//test if intersects with the interior of another shape
	boolean intersect(shape s);
}