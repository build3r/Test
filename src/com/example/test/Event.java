package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Event extends Activity {

	Button b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
		b2=(Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k = new Intent(Event.this,About.class);
				startActivity(k);
				
			}
		});
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event, menu);
		return true;
	}

}
