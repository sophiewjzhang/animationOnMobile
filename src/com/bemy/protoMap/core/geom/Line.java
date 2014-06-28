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
		int dx=Math.abs(endX-startX);
		int dy=Math.abs(endY-startY);
		float slope=dy/dx;
		int dp=2*dy-dx;
		int sx=(endX-startX)>0?1:-1;
		int sy=(endy-starty)>0?1:-1;
		
		this.pixels.add(new Vector2f(0, 0));
		if( slope < 1){
			while( startX != endX ){
				startX += sx;
				if( dp <0 ){
				dp +=2*dy;				
				}else{
				dp += 2*(dy-dx);
				starty += sy;
				}
				this.pixels.add(new Vector2f(startX, starty));	

			}

		}else{
			while( starty != endy ){
				starty += sy;
				if( dp <0 ){
				dp +=2*dx;				
				}else{
				dp += 2*(dx-dy);
				startx += sx;
				}
				this.pixels.add(new Vector2f(startX, starty));	

			}

		}

	}
}