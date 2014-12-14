package com.bemy.protoMap.core.geom;

import java.io.Serializable;

public class Vector2f implements Serializable{
	private static final long serialVersionUID = -2000000L;
	public int x;
	public int y;
	
	public Vector2f(){
		this.x = 0;
		this.y = 0;
	}
	public Vector2f(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int x(){
		return this.x;
	}
	public int y(){
		return this.y;
	}
	//return in format (x,y)
	public String ToString(){
		return "("+this.x+","+this.y+")";
	}
}
