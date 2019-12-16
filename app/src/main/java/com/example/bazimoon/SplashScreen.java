package com.example.bazimoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		/*Window window =getWindow();
		window.setFlags(Window.FEATURE_NO_TITLE,Window.FEATURE_NO_TITLE);*/


		final SharedPreferences shared = getSharedPreferences("Prefs", MODE_PRIVATE);
		final SharedPreferences.Editor editor = shared.edit();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				boolean isFirstRun = shared.getBoolean("FIRSTRUN1", true);
				if (isFirstRun){
					startActivity(new Intent(SplashScreen.this,Descriptions.class));
					finish();
					editor.putBoolean("FIRSTRUN1", false);
					editor.apply();
				} else {
					startActivity(new Intent(SplashScreen.this, SignUp.class));
					finish();
				}
			}
		}, 2000);

	}

}
