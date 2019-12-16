package com.example.bazimoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp_SMS extends AppCompatActivity {

	TextView phone;
	EditText edtPasscode1,edtPasscode2,edtPasscode3,edtPasscode4;
	Button signin;
	StringBuilder sb = new StringBuilder();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up__sms);
		init();

		Bundle phoneNum = getIntent().getExtras();
		if (phoneNum != null) {
			phone.setText(phoneNum.getString("PHONE"));
		}

		edtPasscode1.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(sb.length()==0&edtPasscode1.length()==1) {
					sb.append(s);
					edtPasscode1.clearFocus();
					edtPasscode2.requestFocus();
					edtPasscode2.setCursorVisible(true);
				}
			}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				if(sb.length()==1) {
					sb.deleteCharAt(0);
				}
			}
			public void afterTextChanged(Editable s) {
				if(sb.length()==0) {
					edtPasscode1.requestFocus();
				}
			}
		});

		edtPasscode2.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(sb.length()==0&edtPasscode2.length()==1) {
					sb.append(s);
					edtPasscode2.clearFocus();
					edtPasscode3.requestFocus();
					edtPasscode3.setCursorVisible(true);
				}
			}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				if(sb.length()==1) {
					sb.deleteCharAt(0);
				}
			}
			public void afterTextChanged(Editable s) {
				if(sb.length()==0) {
					edtPasscode2.requestFocus();
				}
			}
		});

		edtPasscode3.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(sb.length()==0&edtPasscode3.length()==1) {
					sb.append(s);
					edtPasscode3.clearFocus();
					edtPasscode4.requestFocus();
					edtPasscode4.setCursorVisible(true);
				}
			}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				if(sb.length()==1) {
					sb.deleteCharAt(0);
				}
			}
			public void afterTextChanged(Editable s) {
				if(sb.length()==0) {
					edtPasscode3.requestFocus();
				}
			}
		});

		/*
		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(SignUp_SMS.this,Login.class));
				finish();
			}
		});
*/
		signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(SignUp_SMS.this,SignUp_Main.class));
			}
		});

	}

	void init(){
		edtPasscode1 = findViewById(R.id.code0);
		edtPasscode2 = findViewById(R.id.code1);
		edtPasscode3 = findViewById(R.id.code2);
		edtPasscode4 = findViewById(R.id.code3);
		phone = findViewById(R.id.txt_phone);
		signin = findViewById(R.id.btn_signin);
	}
}
