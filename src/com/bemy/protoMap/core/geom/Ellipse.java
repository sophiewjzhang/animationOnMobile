package com.bemy.protoMap.core.geom;

public class Ellipse extends shape{
	private static final long serialVersionUID = 1140000L;
	private int radiusX,radiusY;

	public Ellipse(int rx, int ry){
		this.radiusX=rx;
		this.radiusY=ry;
		this.setPixels();
	}
	public int getRadiusX(){
		return this.radiusX;
	}
	public int getRadiusY(){
		return this.radiusY;
	}
	@Override
	public void setPixels() {
		int dotX=0, dotY=radiusY;
		int rxSRT= radiusX*radiusX, rySRT= radiusY*radiusY; 
		int dp=4*rySRT-4*rxSRT*radiusY+rxSRT;
		this.pixels.add(new Vector2f(dotX, dotY));
		this.pixels.add(new Vector2f(dotX, -dotY));
		while( dotX*rySRT <= dotY*rxSRT ){
			dotX++;
			dp +=4*rySRT*(2*dotX+1);
			if( dp >=0){
				dotY--;
				dp +=-4*rxSRT*2*dotY;
			}
			plotPixels_ellipse(dotX, dotY);
		}
		while( dotY >= 1 ){
			dotY--;
			dp +=4*rxSRT*(-2*dotY+1);
			if( dp <=0){
				dotX++;
				dp +=4*rySRT*2*dotX;
			}
			plotPixels_ellipse(dotX, dotY);
		}
	}
	
	private void plotPixels_ellipse(int dotX, int dotY){
		this.pixels.add(new Vector2f(dotX, dotY));
		this.pixels.add(new Vector2f(dotX, -dotY));
		this.pixels.add(new Vector2f(-dotX, dotY));
		this.pixels.add(new Vector2f(-dotX, -dotY));
	}

	
}