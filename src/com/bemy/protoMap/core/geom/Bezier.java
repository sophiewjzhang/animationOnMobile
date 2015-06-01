package com.bemy.protoMap.core.geom;

import java.util.ArrayList;

/*
 * @name Bezier
 * @description:  The Bezier curve with three control points implementation. 
 * Get the Bezier point from the control points.
 * Divide the control points into two segments by the Bezier point, with each segment is half of the parent Bezier curve.
 * Keep dividing until the divided bezier curve is a straight line approximately. 
 * Connects all the divided straight lines to form the original curve.
 * Public Methods:
 * ---------public void moveTo(int x, int y): move the shape to a new position.
 */
public class Bezier extends shape{
	private static final long serialVersionUID = 1150000L;
	private int numberOfCtrlPoints;
	private double accuracy = 0.5;
	private ArrayList<Vector2f> allPixels=new ArrayList<Vector2f>();
	
	public Bezier(int... points) {
		this.numberOfCtrlPoints = points.length;
		if (this.numberOfCtrlPoints != 6) {

		} else {
			for (int i = 0; i < this.numberOfCtrlPoints; i += 2) {
				this.vertexPixels.add(new Vector2f(points[i], points[i + 1]));
			}

			this.plotPixels( points[0], points[1]);
			this.plotPixels( points[4], points[5]);
			this.setPixels();
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.bemy.protoMap.core.geom.shapeAbs#setPixels()
	 */

	@Override
	public void setPixels() {
		this.divideSegment( this.vertexPixels.get(0), this.vertexPixels.get(1), this.vertexPixels.get(2));
	}
	public int[] getAllPixels(){
		if( this.allPixels.size() <= 0 ){
			getAllPixels( this.pixels);
		}		
		return flatArrayList( allPixels);
	}
	/*
	 * private functions
	 */
	/*
	 * Calculate a point with the control points.
	 */
	private Vector2f findCtrlPoint( int pointIndex, Vector2f p0, Vector2f p1,Vector2f p2){
		ArrayList<Vector2f> workArray =new ArrayList<Vector2f>();
		
		workArray.add( p0);
		workArray.add( p1);
		workArray.add( p2);
		
		int i=0, l= workArray.size(), l0;
		l0 = l - pointIndex;
		
		while( l > l0 ){
			for( i=0; i< (l -1); i ++){
				Vector2f midPoint= getMidPoint( workArray.get(i), workArray.get(i+1));
				workArray.set(i, midPoint);
			}
			workArray.remove ( i);
			l = workArray.size();
		}
		
		return workArray.get(0);
	}
	/*
	 * Return the middle point of two points.
	 */
	private Vector2f getMidPoint ( Vector2f p0, Vector2f p1 ){
		double midX= ( p0.dx + p1.dx) *0.5;
		double midY= ( p0.dy + p1.dy) *0.5;
		
		return new Vector2f( midX, midY);
	}
	/*
	 * Return the length of two points.
	 */
	private double lengthOfSegment ( Vector2f p0, Vector2f p1){
		double dx= Math.abs(p0.dx - p1.dx );
		double dy= Math.abs(p0.dy - p1.dy );
		return Math.sqrt( dx*dx + dy*dy);
	}
	/*
	 * Return true/false if the points are in one straight line
	 */
	private boolean isConlinear(Vector2f p0, Vector2f p1,Vector2f p2){
		boolean isLinear= false;
		double length1=lengthOfSegment(p0, p1);
		double length2=lengthOfSegment(p1, p2);
		double lineLength=lengthOfSegment(p0, p2);
		double diffLength = Math.abs( lineLength - length1 - length2) ;
		
		if( diffLength <= this.accuracy){
			isLinear = true;
		}
		return isLinear;
	}
	/*
	 * divide one Bezier curve into two Bezier curve by the Bezier point
	 */
	private void divideSegment(Vector2f p0, Vector2f p1,Vector2f p2){
		Vector2f BP0, BP1, BP2, BP3, bezierPoint ;
		//check if the input points are in one line. 
		boolean isOneLine= this.isConlinear( p0, p1, p2 );
		if( isOneLine){
			//end of the recursive
			this.plotPixels( (int)Math.round( p0.dx), (int)Math.round( p0.dy));
			this.plotPixels( (int)Math.round( p2.dx), (int)Math.round( p2.dy));
		}else{
			//continue dividing
			BP0 =  p0;
			BP1 =  this.findCtrlPoint(1, p0, p1,p2);
			bezierPoint =  this.findCtrlPoint(2, p0, p1,p2);		
			BP2 =  this.findCtrlPoint(1, p2, p1,p0);
			BP3 = p2;
			this.divideSegment ( BP0, BP1, bezierPoint);
			this.divideSegment ( BP3, BP2, bezierPoint);
		}	
	}
	/**
	 * @get pixels for all line segments of the curve.
	 * @param ctrlPixels, the start and end points of all line segments.
	 * @return a flattened integer array.
	 */
	public int[] getInts(){
		ArrayList<Vector2f> ctrlPixels = this.pixels;
		int[] _all=new int[0];
		for( int i =0, l= ctrlPixels.size(); i< l-1; i+=2){
			Line _line= new Line(ctrlPixels.get(i).x, ctrlPixels.get(i).y, ctrlPixels.get(i+1).x, ctrlPixels.get(i+1).y );	
			int[] _new= _line.getPixels();
			System.arraycopy( _new, 0, _all, _all.length, _new.length);
		}
		
		return _all;
	}
	private void getAllPixels(ArrayList<Vector2f> ctrlPixels){
		for( int i =0, l= ctrlPixels.size(); i< l-1; i+=2){
			Line _line= new Line(ctrlPixels.get(i).x, ctrlPixels.get(i).y, ctrlPixels.get(i+1).x, ctrlPixels.get(i+1).y );	
			ArrayList<Vector2f> _list= _line.getPixelsList();
			allPixels.addAll( _list );
		}
	}
}