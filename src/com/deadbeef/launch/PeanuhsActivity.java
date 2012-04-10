package com.deadbeef.launch;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PeanuhsActivity extends Activity implements OnClickListener{

	private Button  ookayButton, awhededButton, romantisimismButton, livingButtton,
	rectumButton, heatButton, closeButton;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ookayButton = (Button) findViewById(R.id.ookayButton);
		awhededButton = (Button) findViewById(R.id.awhededButton);
		romantisimismButton = (Button) findViewById(R.id.romantisimismButton);
		livingButtton = (Button) findViewById(R.id.livingButtton);        
		rectumButton = (Button) findViewById(R.id.rectumButton);
		heatButton = (Button) findViewById(R.id.heatButton);
		closeButton = (Button) findViewById(R.id.closeButton);

		ookayButton.setOnClickListener(this);
		awhededButton.setOnClickListener(this);
		romantisimismButton.setOnClickListener(this);
		livingButtton.setOnClickListener(this);        
		rectumButton.setOnClickListener(this);
		heatButton.setOnClickListener(this);
		closeButton.setOnClickListener(this);


	}

	public void onClick(View v) {
		switch (v.getId()) { 
		case R.id.ookayButton: 
			/*
			 * 			MediaPlayer mp = MediaPlayer.create(this, R.raw.a);   
			mp.start();
			mp.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					mp.release();
				}
			}
					);
			 */
			break;
		case R.id.awhededButton: ;break;
		case R.id.romantisimismButton: ;break;
		case R.id.livingButtton: ;break; 
		case R.id.rectumButton: ;break;
		case R.id.heatButton: ;break;
		case R.id.closeButton: finish() ;break;

		}

	}
}