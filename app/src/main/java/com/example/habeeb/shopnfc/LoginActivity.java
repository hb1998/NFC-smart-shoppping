package com.example.habeeb.shopnfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends cartscreen  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText username = (EditText) findViewById(R.id.editText4);
        EditText password = (EditText) findViewById(R.id.editText5);


       Button mBtWrite = (Button) findViewById(R.id.button12);


       mBtWrite.setOnClickListener((View v) -> {

           if (username.getText().toString().equals("habeeb") || password.getText().toString().equals("habeeb1")) {


               showWriteFragment();
           } else {
               Toast.makeText(LoginActivity.this, "Invalid Id or Password", Toast.LENGTH_SHORT).show();

           }
       });
    }
}

