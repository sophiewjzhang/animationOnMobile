package com.bemy.protoMap;
import com.bemy.protoMap.core.geom.Line;
import com.bemy.protoMap.core.geom.Point;
import com.bemy.protoMap.maps.field2DStore;

public class storeGrocery extends field2DStore{
	private Line leftLine;
	private float[] pixels;
	
	public storeGrocery(){
		Line leftLine=new Line(0, 200, 0, 1000);
		pixels=leftLine.getPixels();
	}
	
	public float[] getPixels(){
		return this.pixels; 
	}
	public Line leftLine(Point p1, Point p2){
		return leftLine;		
	}	
}
