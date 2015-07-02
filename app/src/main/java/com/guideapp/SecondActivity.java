package com.guideapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {
	ImageView imageview;
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		imageview=(ImageView)findViewById(R.id.imageview1);
		Bitmap bm=BitmapFactory.decodeFile("mnt/sdcard/Download/package/00-∑‚√Ê.jpg");
		imageview.setImageBitmap(bm);
		button=(Button)findViewById(R.id.second_button);
		 button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
				Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
				startActivity(intent);
					finish();
				}
			});
		
		
		
	}
}
