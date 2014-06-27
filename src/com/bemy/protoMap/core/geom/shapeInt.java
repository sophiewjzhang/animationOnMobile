package com.bemy.protoMap.core.geom;

public interface shapeInt{	
	float x();
	float y();
	float width();
	float height();
	void setWidth(float w);
	void setHeight(float h);
	void setPosition(float x, float y);
	Rectangle getBounds();
	//test if the specified point is contained.
	boolean contains(Point p);
	//test if the specified shape is contained.
	boolean contains(shape s);
	//test if intersects with the interior of another shape
	boolean intersect(shape s);
}