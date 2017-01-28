package com.example.admin.pumpkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        setTitle("Welcome");

        EditText etUsername = (EditText) findViewById(R.id.etUsername);
         EditText etAge = (EditText) findViewById(R.id.etAge);


        Intent intent = getIntent();

        String age = intent.getStringExtra("age");
        String name = intent.getStringExtra("name");


        etAge.setText(age);
        etUsername.setText(name);

    }
}
