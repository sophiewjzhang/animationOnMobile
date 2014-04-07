package com.bemy.protoMap.core.geom;

public abstract class Point extends shapeAbs{
	private static final long serialVersionUID = 2L;
	private int size=1;
	
	public Point(float x, float y){
		this.setLocation(x, y);
		this.setWidth(size);
		this.setHeight(size);
	}
	public void setSize(int s){
		this.size=s;
	}
	public int getSize(){
		return this.size;
	}
}