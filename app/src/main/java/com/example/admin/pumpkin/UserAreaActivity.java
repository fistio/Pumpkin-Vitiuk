package com.example.admin.pumpkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        setTitle("Welcome");


        EditText etUsername = (EditText) findViewById(R.id.etUsername);


        Intent intent = getIntent();

          String name = intent.getStringExtra("Username");

          etUsername.setText(name);


        final TextView registerLink = (TextView) findViewById(R.id.bFragments);
        registerLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent registerIntent = new Intent(UserAreaActivity.this, MainMenuActivity1.class);
                UserAreaActivity.this.startActivity(registerIntent);
            }
        });



    }
    }

