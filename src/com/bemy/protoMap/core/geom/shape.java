package com.bemy.protoMap.core.geom;

public abstract class shape extends shapeAbs implements shapeInt{
	private static final long serialVersionUID = 2L;
	public shape(){
		this.setLocation(0, 0);
	}
	public shape(float x, float y){
		this.setLocation(x, y);
	}
	public void moveTo(float x, float y){
		this.setLocation(x, y);
	}
}