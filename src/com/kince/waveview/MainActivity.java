package com.kince.waveview;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	private WaterWaveView mWaterWaveView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mWaterWaveView = (WaterWaveView) findViewById(R.id.wave_view);
        mWaterWaveView.setmWaterLevel(0.8F);
		mWaterWaveView.startWave();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		mWaterWaveView.stopWave();
		mWaterWaveView=null;
		super.onDestroy();
	}
}
