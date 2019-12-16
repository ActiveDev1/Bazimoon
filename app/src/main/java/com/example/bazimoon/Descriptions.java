package com.example.bazimoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Descriptions extends AppCompatActivity {

	ImageView close;
	int i = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_descriptions);


		close = findViewById(R.id.descrip_close);

		loadFragment(new Description());

		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(Descriptions.this,Login.class));
				finish();
			}
		});

	}

	 void loadFragment(Fragment fragment) {
		if (fragment != null) {
			getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.frameLayout, fragment)
					.commit();
		}

	}
}
