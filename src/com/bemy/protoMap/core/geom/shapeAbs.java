package com.bemy.protoMap.core.geom;

import java.io.Serializable;
import java.util.ArrayList;
/*
 * @name shapeAbs
 * @description: abstract class implementing the shape interface
 * Properties:
 * ----------area
 * Public Methods:
 * ----------public abstract void setPixels(): set the points array.
 * ----------public int[] getPixels(): return points array.
 * ----------public int[] getVertex(): return vertex points array.
 * Protected Methods:
 * ----------protected void plotPixels(int dotX, int dotY): add a point to the points array.
 */
public abstract class shapeAbs implements shapeInt, Serializable{	
	private static final long serialVersionUID = 1000000L;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int area;
	protected Rectangle boundary;
	protected ArrayList<Vector2f> 
				pixels=new ArrayList<Vector2f>(),
				vertexPixels=new ArrayList<Vector2f>();
	
	protected shapeAbs(){
	}
	public int x(){
		return x;
	}
	public int y(){
		return y;
	}
	public int width(){
		return width;
	}
	public int height(){
		return height;
	}
	public int area(){
		return area;
	}
	public Rectangle getBounds(){
		return boundary;
	}
	public void setWidth(int p_w){
		this.width=p_w;
	}
	public void setHeight(int p_h){
		this.height=p_h;
	}
	public void setPosition(int p_x, int p_y){
		this.x=p_x;
		this.y=p_y;
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
	/*
	 * public functions
	 */
	public abstract void setPixels();
	//public ArrayList<Vector2f> getPixels(){
	public int[] getPixels(){	
		return flatArrayList(this.pixels);
	}
	public int[] getVertex(){
		return flatArrayList(this.vertexPixels);
	}
	public ArrayList<Vector2f> getPixelsList(){
		return this.pixels;
	}
	public ArrayList<Vector2f> getVertexList(){
		return this.vertexPixels;
	}
	/*
	 * protected functions
	 */
	protected void plotPixels(int dotX, int dotY){
		this.pixels.add(new Vector2f(dotX, dotY));
	}
	protected int[] flatArrayList(ArrayList<Vector2f> p_al ){	
		//return this.pixels.toArray();
		ArrayList<Vector2f> _dataIn=p_al;
		int _length=_dataIn.size();
		int[] _finalPixels=new int[_length*2];
		int j=0;
		for (int i = 0; i < _length; i++) {
			_finalPixels[j] = _dataIn.get(i).x;
			_finalPixels[j+1] = _dataIn.get(i).y;
			j+=2;
		}
		return _finalPixels;
	}
}