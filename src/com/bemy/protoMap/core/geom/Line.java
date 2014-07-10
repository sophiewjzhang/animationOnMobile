package com.bemy.protoMap.core.geom;

public class Line extends shape{
	private static final long serialVersionUID = 1110000L;
	private int startX,endX,startY,endY;
	
	public Line(int p_startX,int p_endX, int p_startY,int p_endY){
		//this.startPoint=new Vector2f( startX, startY);
		//this.endPoint=new Vector2f( endX, endY);
		startX=p_startX;
		endX=p_endX;
		startY=p_startY;
		endY=p_endY;
		this.setPixels();
	}
<<<<<<< HEAD
	@Override
	public void setPixels() {
=======
	public void setPixels(int startX,int endX, int startY,int endY){
>>>>>>> f298cd54fe4f7f9e481f73bc9bd3f960d3ab053d
		int dx=Math.abs(endX-startX);
		int dy=Math.abs(endY-startY);
		float slope=dy/dx;
		int dp=2*dy-dx;
		int sx=(endX-startX)>0?1:-1;
<<<<<<< HEAD
		int sy=(endY-startY)>0?1:-1;
=======
		int sy=(endy-starty)>0?1:-1;
>>>>>>> f298cd54fe4f7f9e481f73bc9bd3f960d3ab053d
		
		this.pixels.add(new Vector2f(0, 0));
		if( slope < 1){
			while( startX != endX ){
				startX += sx;
				if( dp <0 ){
				dp +=2*dy;				
				}else{
				dp += 2*(dy-dx);
<<<<<<< HEAD
				startY += sy;
				}
				this.pixels.add(new Vector2f(startX, startY));	
=======
				starty += sy;
				}
				this.pixels.add(new Vector2f(startX, starty));	
>>>>>>> f298cd54fe4f7f9e481f73bc9bd3f960d3ab053d

			}

		}else{
<<<<<<< HEAD
			while( startY != endY ){
				startY += sy;
=======
			while( starty != endy ){
				starty += sy;
>>>>>>> f298cd54fe4f7f9e481f73bc9bd3f960d3ab053d
				if( dp <0 ){
				dp +=2*dx;				
				}else{
				dp += 2*(dx-dy);
<<<<<<< HEAD
				startX += sx;
				}
				this.pixels.add(new Vector2f(startX, startY));	
=======
				startx += sx;
				}
				this.pixels.add(new Vector2f(startX, starty));	
>>>>>>> f298cd54fe4f7f9e481f73bc9bd3f960d3ab053d

			}

		}

	}

}