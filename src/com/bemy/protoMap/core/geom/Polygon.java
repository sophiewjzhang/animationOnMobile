/*
 * Polygon(int _sides, int _radius)
 * Method:
 * ******int getRadius()
 * ******int getSides()
 * ******void setPixels()
 */
package com.bemy.protoMap.core.geom;

public class Polygon extends shape{
	private static final long serialVersionUID = 1140000L;
	public int sides;
	public int radius;
	
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
	/*
	 * (non-Javadoc)
	 * @see com.bemy.protoMap.core.geom.shapeAbs#setPixels()
	 * Calculate the vertex of the polygon in integer format. 
	 * Multiply 100 of the actual number, then divide by 100 to reserve more accuracy.
	 */
	public void setPixels() {
		  if( sides <0)return;
		  int dx,dy;
		  double step=2*Math.PI/sides;
		  for( int i=0;i<sides;i++){
		    dx=(int) (Math.round( radius*Math.sin( step*i)*100)/100);
		    dy=(int) (Math.round( radius*Math.cos( step*i)*100)/100);
		    this.vertexPixels.add(new Vector2f(dx, dy));	
		  }
	}
}