noodle-pro(name might be changed later)
==========

A light framework designed to facilitate the graphic development for mobile application.  

Use this framework to draw various lines, circles, and ellipses.  All these can be done with only several lines of code. The pixel data generated can be used to animate one object in a certain geometric shape such as a circle on mobile devices as well. 

Below is an example on how to draw a single circle on Android OS. 
	
mainActivity.java
  import android.view.View;
  import android.content.Context;
  import android.graphics.Color;
  import android.graphics.Paint;
  import android.graphics.Canvas;
  import com.bemy.protoMap.core.geom.*;
  
  //generate the pixels array required for the shape.
  shape1=new Circle(200);
	points=shape1.getPixels();
	//set up the screen environment
	canvas.translate(300, 400);
	redPaint.setColor(Color.YELLOW);
	redPaint.setStrokeWidth(5);
	//print the pixels out to the screen
	for( int i=0; i<points.length; i+=2){
		canvas.drawPoint(points[i], points[i+1], redPaint);//this will print the pixels to the device screen. 
	}
	//a circle is drawn

My next step is to add in the capability to create a prototype of an interactive map.
