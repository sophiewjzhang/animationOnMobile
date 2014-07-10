package com.bemy.protoMap;
import com.bemy.protoMap.core.geom.*;
import com.bemy.protoMap.maps.field2DStore;

public class storeGrocery extends field2DStore{
	private Line leftLine;
	private Circle smallCircle;
	private float[] pixels;

	public storeGrocery(){
		Line leftLine=new Line(0, 200, 0, 1000);
		pixels=leftLine.getPixels();
		smallCircle= new Circle(200);
		//pixels=smallCircle.getPixels();
	}
	
	public float[] getPixels(){
		return this.pixels; 
	}
	public Line leftLine(Point p1, Point p2){
		return leftLine;		
	}	
}
