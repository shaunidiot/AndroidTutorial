package com.example.ionimagetest;

import com.koushikdutta.ion.Ion;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageView ionimage = (ImageView) findViewById(R.id.imageView1);
		Ion.with(ionimage).placeholder(R.drawable.ic_launcher)
				.error(R.drawable.ic_launcher).load("http://i.imgur.com/yqZ4owC.jpg");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
