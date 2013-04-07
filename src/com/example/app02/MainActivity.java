package com.example.app02;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
public class MainActivity extends Activity implements OnClickListener {
	
	Button btn;
	Random rand = new Random();
	RelativeLayout layout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		layout = (RelativeLayout) findViewById(R.id.main);
		btn = new Button(this);
		btn.setText("ֽאזלט לוםÿ!");
		
		btn.setOnClickListener(this);
		layout.addView(btn);
		
	}

	
	@Override
	public void onClick(View v) {
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		layout = (RelativeLayout) findViewById(R.id.main);
		
		params.leftMargin = rand.nextInt(layout.getMeasuredWidth() - btn.getWidth() ) ;
		params.topMargin = rand.nextInt(layout.getMeasuredHeight() - btn.getHeight() );
		v.setLayoutParams(params);
		
	}

}
