package com.bemy.protoMap.core.geom;

public abstract class Rectangle extends shape{
	private static final long serialVersionUID = 1150000L;
	public int width, height;
	
	public Rectangle(int _width, int _height){
		width=_width;
		height=_height;
		setPixels();
	}
	public int getWidth(){
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see com.bemy.protoMap.core.geom.shapeAbs#setPixels()
	 * Calculate the vertex of the polygon in integer format. 
	 * Multiply 100 of the actual number, then divide by 100 to reserve more accuracy.
	 */
	public void setPixels() {		  
		  this.vertexPixels.add(new Vector2f(0, 0));
		  this.vertexPixels.add(new Vector2f(0, width));
		  this.vertexPixels.add(new Vector2f(width, height));
		  this.vertexPixels.add(new Vector2f(height, 0));
	}
}