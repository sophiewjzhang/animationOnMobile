package com.bemy.protoMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bemy.protoMap.core.geom.*;
import com.bemy.protoMap.maps.field2DStore;

public class storeGrocery extends field2DStore{
	private Line leftLine;
	private Circle smallCircle;
	private Ellipse smallEllipse;
	private Polygon fiveSidePoly=new Polygon(5, 150);
	private int[] pixels, ctrlPixels, pixels2;
	
	public storeGrocery(){
		/*
		 * tested successfully on Dec. 15, 2014
		 */
		
		//Line leftLine=new Line(0, 0, 200, 500);
		//pixels=leftLine.getPixels();
		
		//smallCircle= new Circle(200);
		//pixels=smallCircle.getPixels();
		
		//smallEllipse=new Ellipse(175, 350);
		//pixels=smallEllipse.getPixels();
		Bezier smallCurve = new Bezier( 0, 0, 40, 200, 400, 100);
		ctrlPixels = smallCurve.getPixels();
		pixels = smallCurve.getAllPixels();
		
		Bezier smallCurve2 = new Bezier( 50, 250, 100, 700, 500, 100);
		pixels2 = smallCurve2.getAllPixels();
		//end of test case
		
	}
	
	public int[] drawPolygon(int sides, int radius){
		int[] poly_pixels;
		Polygon fiveSidePoly=new Polygon(sides, radius);
		poly_pixels=fiveSidePoly.getVertex();
		
/*		List list = new ArrayList(Arrays.asList(_pixels));
	      
		for( int i=0, l=poly_pixels.length; i<l; i+=2){
			Line _curLine=new Line(poly_pixels[i], poly_pixels[i+1], poly_pixels[i+2], poly_pixels[i+4]);
			list.addAll(Arrays.asList(_curLine.getPixels() ));
		}*/
		//Object[] _pixels=list.toArray();
		//return list.toArray();	
		//return _pixels;
		return poly_pixels;
	}
	public int[] getPixels(){
		return this.pixels; 
	}
	public int[] getPixels2(){
		return this.pixels2; 
	}
	public Line leftLine(Point p1, Point p2){
		return leftLine;		
	}	
}
