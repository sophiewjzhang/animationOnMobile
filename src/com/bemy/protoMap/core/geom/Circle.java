package com.bemy.protoMap.core.geom;

public class Circle extends shape{
	private static final long serialVersionUID = 1130000L;
	private int radius;

	public Circle(int p_radius){
		this.radius=p_radius;
		this.setPixels();
	}
	public int getRadius(){
		return this.radius;
	}
	@Override
	public void setPixels() {
		int startY=0;
		int dx=radius;
		int dp=-radius;
		this.pixels.add(new Vector2f(dx, startY));
		while( startY <= dx ){
			startY++;
			dp +=2*startY+1;
			if( dp >=0){
				dx--;
				dp -=2*dx;
			}
			this.pixels.add(new Vector2f(dx, startY));
			this.pixels.add(new Vector2f(startY, dx));
			this.pixels.add(new Vector2f(dx, -startY));
			this.pixels.add(new Vector2f(-startY, dx));
			this.pixels.add(new Vector2f(-dx, startY));
			this.pixels.add(new Vector2f(startY, -dx));
			this.pixels.add(new Vector2f(-dx, -startY));
			this.pixels.add(new Vector2f(-startY, -dx));
		}
		
	}

	
}