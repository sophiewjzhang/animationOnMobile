package com.bemy.protoMap.core.geom;

public interface shapeInt{
	Rectangle getBounds();	
	//test if the specified point is contained.
	boolean contains(Point p);
	//test if the specified shape is contained.
	boolean contains(shape s);
	//test if intersects with the interior of another shape
	boolean intersect(shape s);
	float X();
	float Y();
	void setLocation(float x, float y);
	float Width();
	float Height();
	void setWidth(float w);
	void setHeight(float h);
	void setLocation(int x,int y);
}