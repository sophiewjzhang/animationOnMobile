package com.bemy.protoMap.core.geom;

import java.io.Serializable;

public class Vector2f implements Serializable{
	private static final long serialVersionUID = -2000000L;
	public int x;
	public int y;
	public double dx, dy;
	
	public Vector2f(){
		this.x = 0;
		this.y = 0;
	}
	public Vector2f(int x, int y) {
		this.x = x;
		this.y = y;
		this.dx = x;
		this.dy = y;
	}
	public Vector2f( double x, double y){
		this.dx = x;
		this.dy = y;
	}
	public int x(){
		return this.x;
	}
	public int y(){
		return this.y;
	}
	public double dx(){
		return this.dx;
	}
	public double dy(){
		return this.dy;
	}
	//return in format (x,y)
	public String ToString(){
		return "("+this.x+","+this.y+")";
	}
}
