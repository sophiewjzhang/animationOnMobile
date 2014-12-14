package com.bemy.protoMap.core.geom;

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