package com.bemy.protoMap.core.geom;

public class Line extends shape{
	private static final long serialVersionUID = 1110000L;
	private float startX,endX,startY,endY;
	
	public Line(float p_startX,float p_endX, float p_startY,float p_endY){
		//this.startPoint=new Vector2f( startX, startY);
		//this.endPoint=new Vector2f( endX, endY);
		startX=p_startX;
		endX=p_endX;
		startY=p_startY;
		endY=p_endY;
		this.setPixels();
	}
	@Override
	public void setPixels() {
		float dx=Math.abs(endX-startX);
		float dy=Math.abs(endY-startY);
		float slope=dy/dx;
		float dp=2*dy-dx;
		float sx=(endX-startX)>0?1:-1;
		float sy=(endY-startY)>0?1:-1;
		
		this.pixels.add(new Vector2f(0, 0));
		if( slope < 1){
			while( startX != endX ){
				startX += sx;
				if( dp <0 ){
				dp +=2*dy;				
				}else{
				dp += 2*(dy-dx);
				startY += sy;
				}
				this.pixels.add(new Vector2f(startX, startY));	

			}

		}else{
			while( startY != endY ){
				startY += sy;
				if( dp <0 ){
				dp +=2*dx;				
				}else{
				dp += 2*(dx-dy);
				startX += sx;
				}
				this.pixels.add(new Vector2f(startX, startY));	

			}

		}

	}

}