package com.example.simpleui;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button button;
	private EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText = (EditText) findViewById(R.id.editText1);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sendMessage();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void sendMessage() {
		String text = editText.getText().toString();
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

	}

	public void sendMessage2(View view) {
		String text = editText.getText().toString();
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}

	OnClickListener clickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			sendMessage();
		}
	};
}
