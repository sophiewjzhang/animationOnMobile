package com.bemy.protoMap.core.geom;

public class Polygon extends shape{
	private static final long serialVersionUID = 1140000L;
	public int sides, radius;
	
	public Polygon(int _sides, int _radius){
		sides=_sides;
		radius=_radius;
		setPixels();
	}
	public int getRadius(){
		return this.radius;
	}
	public int getSides(){
		return this.sides;
	}
	@Override
	public void setPixels() {
		  if( sides <0)return;
		  float dx,dy;
		  double step=2*Math.PI/sides;
		  for( int i=0;i<sides;i++){
		    dx=radius*Math.round(Math.sin( step*i)*100)/100;
		    dy=radius*Math.round(Math.cos( step*i)*100)/100;
		    this.pixels.add(new Vector2f(dx, dy));	
		  }
	}
}