package com.cda244.sample.notificationsample.btn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.cda244.sample.notificationsample.MainActivity;

public class NotificationBtn extends Button implements View.OnClickListener {

	public NotificationBtn(Context context) {
		super(context);
		init();
	}

	public NotificationBtn(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init();
	}

	public NotificationBtn(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}


	public void init() {
		setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		((MainActivity) getContext()).sendNotification();
	}
}
