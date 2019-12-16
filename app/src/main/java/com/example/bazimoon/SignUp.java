package com.example.bazimoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

	TextView login;
	Button signin;
	EditText phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
		init();

		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(SignUp.this,Login.class));
				finish();
			}
		});
		signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String phoneNum = phone.getText().toString();
				if(!phoneNum.startsWith("09") || phoneNum.length() < 11)
					Toast.makeText(SignUp.this, "لطفا شماره تلفن معتبر وارد نمایید!", Toast.LENGTH_SHORT).show();
				else {
					Intent intent = new Intent(getBaseContext(), SignUp_SMS.class);
					intent.putExtra("PHONE", phoneNum);
					startActivity(intent);
				}
			}
		});
	}
	void init(){
		signin = findViewById(R.id.btn_signin);
		login = findViewById(R.id.txtGo_login);
		phone = findViewById(R.id.get_phoneNum);
	}
}
