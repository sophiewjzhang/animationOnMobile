package com.bemy.protoMap.core.geom;

import java.io.Serializable;

public abstract class shapeAbs implements shapeInt, Serializable{	
	private static final long serialVersionUID = 1L;
	private float x;
	private float y;
	private float width;
	private float height;
	private Rectangle boundary;
	
	protected shapeAbs(){
	}
	public float X(){
		return x;
	}
	public float Y(){
		return y;
	}
	public void setLocation(float x, float y){
		this.x=x;
		this.y=y;
	}
	public float Width(){
		return width;
	}
	public float Height(){
		return height;
	}
	public void setWidth(float w){
		this.width=w;
	}
	public void setHeight(float h){
		this.height=h;
	}
	public Rectangle getBounds(){
		return boundary;
	}
	public  boolean contains(Point p){
		return this.getBounds().contains(p);
	}
	public boolean contains(shape s){
		return this.getBounds().contains(s);
	}
	public boolean intersect(shape s){
		return this.getBounds().intersect(s);
	}
}