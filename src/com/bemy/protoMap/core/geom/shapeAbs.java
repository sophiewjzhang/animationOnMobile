package com.bemy.protoMap.core.geom;

import java.io.Serializable;
import java.util.ArrayList;
/*
 * Properties:
 * x
 * y
 * width
 * height
 * area
 * boundary
 */
public abstract class shapeAbs implements shapeInt, Serializable{	
	private static final long serialVersionUID = 1000000L;
	protected float x;
	protected float y;
	protected float width;
	protected float height;
	protected float area;
	protected Rectangle boundary;
	protected ArrayList<Vector2f> pixels=new ArrayList<Vector2f>();
	
	protected shapeAbs(){
	}
	public float x(){
		return x;
	}
	public float y(){
		return y;
	}
	public float width(){
		return width;
	}
	public float height(){
		return height;
	}
	public float area(){
		return area;
	}
	public Rectangle getBounds(){
		return boundary;
	}
	public void setWidth(float p_w){
		this.width=p_w;
	}
	public void setHeight(float p_h){
		this.height=p_h;
	}
	public void setPosition(float p_x, float p_y){
		this.x=p_x;
		this.y=p_y;
	}
	public abstract void setPixels();
	public ArrayList<Vector2f> getPixels(){
		return this.pixels;
	}
	public  boolean contains(Point p_p){
		return this.getBounds().contains(p_p);
	}
	public boolean contains(shape p_s){
		return this.getBounds().contains(p_s);
	}
	public boolean intersect(shape p_s){
		return this.getBounds().intersect(p_s);
	}
}