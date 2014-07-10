package com.bemy.protoMap.core.geom;

public class Circle extends shape{
	private static final long serialVersionUID = 1130000L;
	
	public Circle(){
		this.x=0;
		this.y=0;
	}	
	public Circle(int x, int y){
		this.setPosition(x, y);
	}
	@Override
	public void setPixels() {
		// TODO Auto-generated method stub
		
	}
	
}