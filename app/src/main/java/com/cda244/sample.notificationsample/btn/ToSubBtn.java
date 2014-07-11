package com.cda244.sample.notificationsample.btn;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.cda244.sample.notificationsample.SubActivity;

public class ToSubBtn extends Button implements View.OnClickListener {

	public ToSubBtn(Context context) {
		super(context);
		init();
	}

	public ToSubBtn(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init();
	}

	public ToSubBtn(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}


	public void init() {
		setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		Intent i = new Intent(getContext(), SubActivity.class);
		getContext().startActivity(i);
	}
}
