package com.bemy.protoMap;

import android.view.View;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;

import com.bemy.protoMap.core.geom.*;

public class ProtoRoom extends View {
	private Paint redPaint;
	private int circleX;
	private int circleY;
	private int radius;
	int[] points;
	int[] points_poly;
	private int[] points_circle, points_line;
	private storeGrocery store1;
	private Canvas myCanvas;
	
	
	public ProtoRoom(Context context){
		super(context);
		//initialize
		redPaint=new Paint();
		redPaint.setColor(Color.RED);
		circleX=500;
		circleY=500;
		radius=50;
		
		store1=new storeGrocery();
		points=store1.getPixels();
		//draw shapes in store1
		points_poly=store1.drawPolygon(6, 150);
	}
	
	
	@Override
	protected void onDraw(Canvas canvas){
		//canvas.drawCircle( circleX, circleY, radius, redPaint);
		myCanvas=canvas;
		myCanvas.translate(300, 400);
		redPaint.setColor(Color.YELLOW);
		redPaint.setStrokeWidth(5);
		plotPixels_room(points);	
		redPaint.setStrokeWidth(20);
		redPaint.setColor(Color.RED);
		plotPixels_room(points_poly);	

	}
	private void plotPixels_room(int[] _points){
		for( int i=0, l = _points.length; i<l; i+=2){
			//System.out.println( "i:"+ i+":"+points[i]);
			myCanvas.drawPoint(_points[i], _points[i+1], redPaint);
		}
	}
}
