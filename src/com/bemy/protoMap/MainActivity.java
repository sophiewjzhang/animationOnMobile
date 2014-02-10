package com.bemy.protoMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE ="initialize";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//set full screen
		//requestWindowFeature(Window.FEATURE_NO_TITLE);  		
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//set title screen
		//setContentView(R.layout.activity_main);
		//set play screen
		ProtoRoom room1=new ProtoRoom(this);
		setContentView( room1 );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void createNewGame(View view){
/*		Intent intent = new Intent(this, DisplayMessageActivity.class);
		intent.putExtra(EXTRA_MESSAGE, "create a new game!!");
		startActivity( intent);*/
		
		
	}

}
