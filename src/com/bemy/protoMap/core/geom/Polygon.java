package com.bemy.protoMap.core.geom;

public class Polygon extends shape{
	private static final long serialVersionUID = 1140000L;
	
	public Polygon(int sides){
		
	}	
	public Polygon(int x, int y){
		this.setPosition(x, y);
	}
	@Override
	public void setPixels(int sides, int radius) {
		// TODO Auto-generated method stub
		  if( sides <0)return;
		  var dx,dy;
		  var n=sides, step=2*Math.PI/n;
		  for( var i=0;i<n;i++){
		    dx=radius*Math.round(Math.sin( step*i)*100)/100;
		    dy=radius*Math.round(Math.cos( step*i)*100)/100;
		    this.pixels.add(new Vector2f(dx, dy);	
		  }
	}
}