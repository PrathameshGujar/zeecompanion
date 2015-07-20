package com.spotzero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HomeActivity extends Activity implements OnClickListener{

	ImageButton video;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		video=(ImageButton) findViewById(R.id.video);
		
		video.setOnClickListener(this);
	}
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.video:
			
			startActivity(new Intent(HomeActivity.this,LanguageSelection.class));
			
			break;
		}
	}
}
