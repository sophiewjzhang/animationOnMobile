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
	private float radius;
	private float[] points;
	private storeGrocery store1;
	
	
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
		
	}
	
	
	@Override
	protected void onDraw(Canvas canvas){
		//canvas.drawCircle( circleX, circleY, radius, redPaint);
		canvas.translate(300, 400);
		redPaint.setColor(Color.YELLOW);
		redPaint.setStrokeWidth(5);
		for( int i=0; i<points.length; i+=2){
			//System.out.println( "i:"+ i+":"+points[i]);
			canvas.drawPoint(points[i], points[i+1], redPaint);
		}		

	}
}
