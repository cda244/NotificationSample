package com.cda244.sample.notificationsample;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import java.util.Date;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
	}


	private int number = 0;

	public void sendNotification() {
		number++;

		Date now = new Date();
		String nowStr = now.getHours()+" : "+now.getMinutes()+" : "+now.getSeconds();

		Intent intent = new Intent(this, com.cda244.sample.notificationsample.SubActivity.class);
		intent.putExtra(Intent.EXTRA_TEXT, "今は"+nowStr);

		PendingIntent pi = PendingIntent.getActivity(this, 0, intent, 0);

		NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
		builder.setContentIntent(pi);

		builder.setSmallIcon(R.drawable.ic_launcher);
		builder.setTicker("通知 " + nowStr);
		builder.setContentTitle("タイトル");
		builder.setContentText("本文 "+nowStr);
		//builder.setNumber(number);
		//builder.setWhen(System.currentTimeMillis());
		builder.setWhen(0);

		builder.setDefaults(Notification.DEFAULT_SOUND
			| Notification.DEFAULT_VIBRATE
			| Notification.DEFAULT_LIGHTS);

		builder.setAutoCancel(true);

		NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		manager.notify(0, builder.build());
	}

	public void showToast(String message) {
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}

}
