package com.Issing.android.ss13;


import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class SS13_GuideActivity extends Activity implements OnTouchListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SetLayout();
    }
    Button btnGuide,btnJob,btnMainBack,btnCap,btnHOP,btnHOS,btnBack;
    
    public void SetLayout() {
		setContentView(R.layout.main);
		btnGuide = (Button) findViewById(R.id.btnGuide);
		btnGuide.setOnTouchListener(this);
		btnJob = (Button) findViewById(R.id.btnJob);
		btnJob.setOnTouchListener(this);

	}

    public boolean onTouch(View v, MotionEvent event) {
		if (v.getId() == R.id.btnJob) {
			setContentView(R.layout.jobs);
			btnMainBack = (Button) findViewById(R.id.bntMainBack);
			btnMainBack.setOnTouchListener(this);
			
			btnCap = (Button) findViewById(R.id.btnCAP);
			btnCap.setOnTouchListener(this);
			
			btnHOS = (Button) findViewById(R.id.btnHOS);
			btnHOS.setOnTouchListener(this);
			
			btnHOP = (Button) findViewById(R.id.btnHOP);
			btnHOP.setOnTouchListener(this);
		}
		if (v.getId()==R.id.bntMainBack)
		{
			SetLayout();
		}
		if (v.getId()==R.id.b)
		{
			setContentView(R.layout.jobs);
			btnMainBack = (Button) findViewById(R.id.bntMainBack);
			btnMainBack.setOnTouchListener(this);
			
			btnCap = (Button) findViewById(R.id.btnCAP);
			btnCap.setOnTouchListener(this);
			
			btnHOS = (Button) findViewById(R.id.btnHOS);
			btnHOS.setOnTouchListener(this);
			
			btnHOP = (Button) findViewById(R.id.btnHOP);
			btnHOP.setOnTouchListener(this);
		}
		if (v.getId()==R.id.btnCAP)
		{
			setContentView(R.layout.cap);
			btnBack = (Button) findViewById(R.id.b);
			btnBack.setOnTouchListener(this);
		}
		return true;
	}
}