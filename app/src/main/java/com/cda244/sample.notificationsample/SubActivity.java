package com.cda244.sample.notificationsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.sub);
	}

	public void showToast(String message) {
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}

}
