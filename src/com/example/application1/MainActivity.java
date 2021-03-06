package com.example.application1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Context context;
	
	TextView textView;
	EditText editText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		context = this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Touch", Toast.LENGTH_SHORT).show();
			}
		});

		Log.v("TAG", "v");
		Log.d("TAG", "d");
		Log.i("TAG", "i");
		Log.w("TAG", "w");
		Log.e("TAG", "e");
		
		
		textView = (TextView) findViewById(R.id.textView2);
		Button button2 = (Button) findViewById(R.id.button2);
		editText = (EditText) findViewById(R.id.editText1);
		
		button2.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				String string = editText.getText().toString();
				textView.setText(string);
			}
		});
		
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
