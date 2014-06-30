package com.bemy.protoMap.core.geom;

import java.io.Serializable;

public class Vector2f implements Serializable{
	private static final long serialVersionUID = -2000000L;
	public float x;
	public float y;
	
	public Vector2f(){
		this.x = 0;
		this.y = 0;
	}
	public Vector2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float x(){
		return this.x;
	}
	public float y(){
		return this.y;
	}
	//return in format (x,y)
	public String ToString(){
		return "("+this.x+","+this.y+")";
	}
}
