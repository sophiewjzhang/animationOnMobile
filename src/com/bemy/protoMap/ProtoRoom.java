package com.bemy.protoMap;

import android.view.View;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;

public class ProtoRoom extends View {
	private Paint redPaint;
	private int circleX;
	private int circleY;
	private float radius;
	
	public ProtoRoom(Context context){
		super(context);
		//initialize
		redPaint=new Paint();
		redPaint.setColor(Color.RED);
		circleX=500;
		circleY=500;
		radius=50;
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		canvas.drawCircle( circleX, circleY, radius, redPaint);
	}
}
