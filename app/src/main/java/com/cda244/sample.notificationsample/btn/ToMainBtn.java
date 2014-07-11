package com.cda244.sample.notificationsample.btn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.cda244.sample.notificationsample.SubActivity;

public class ToMainBtn extends Button implements View.OnClickListener {

	public ToMainBtn(Context context) {
		super(context);
		init();
	}

	public ToMainBtn(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init();
	}

	public ToMainBtn(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}


	public void init() {
		setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		//Intent i = new Intent(getContext(), MainActivity.class);
		//getContext().startActivity(i);

		((SubActivity) getContext()).finish();
	}
}
