package com.bemy.protoMap.core.geom;

public class Point extends shape{
	private static final long serialVersionUID = 1120000L;
	
	public Point(){
		this.x=0;
		this.y=0;
	}	
	public void setPixels(){
		this.plotPixels(this.x, this.y);
	}
	//return in format (x,y)
	public String ToString(){
		return "("+this.x+","+this.y+")";
	}
}