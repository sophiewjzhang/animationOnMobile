package com.bemy.protoMap.core.geom;

public abstract class shape extends shapeAbs implements shapeInt{
	private static final long serialVersionUID = 1100000L;
	
	public shape(){
		this.setPosition(0, 0);
	}
	public void moveTo(float x, float y){
		this.setPosition(x, y);
	}
}