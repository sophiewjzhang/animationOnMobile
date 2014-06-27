package com.bemy.protoMap.core.geom;

public abstract class Line extends shape{
	private static final long serialVersionUID = 1110000L;
	private Vector2f startPoint, endPoint;
	
	public Line(int startX,int endX, int startY,int endY){
		this.startPoint=new Vector2f( startX, startY);
		this.endPoint=new Vector2f( endX, endY);
		this.setPixels();
	}
	public void setPixels(int startX,int endX, int startY,int endY){
		int dx=endX-startX;
		int dy=endY-startY;
		
		Vector2f _point=new Vector2f(this.x, this.y);
		this.pixels.add(_point);
	}
}