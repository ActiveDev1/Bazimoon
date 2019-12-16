package com.example.bazimoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

	Button login;
	TextView signin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		init();

		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(Login.this,MainActivity.class));
			}
		});

		signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(Login.this,SignUp.class));
			}
		});
	}

	void init(){
		login = findViewById(R.id.btn_login);
		signin = findViewById(R.id.txtGo_signin);
	}
}
