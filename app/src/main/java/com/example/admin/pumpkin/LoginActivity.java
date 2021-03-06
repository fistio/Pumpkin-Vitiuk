package com.example.admin.pumpkin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(new View.OnClickListener()  {

            public void onClick(View view) {

                /*
                String user = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences("MYPREF", MODE_PRIVATE);

                String userDetails = preferences.getString(user, "username");
                String userDetails1 = preferences.getString(password, "password");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("display", userDetails);
                editor.putString("display", userDetails1);
                editor.commit();
                */




                if (TextUtils.isEmpty(etUsername.getText().toString())) {
                    etUsername.setError("Enter User Name");
                    etUsername.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(etPassword.getText().toString())) {
                    etPassword.setError("Enter Password");
                    etPassword.requestFocus();
                    return;
                }



                if (etUsername.getText().toString().equals("Alex") && (etPassword.getText().toString().equals("12"))) {
                    Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
                    LoginActivity.this.startActivity(intent);
                    Toast.makeText(getBaseContext(), "Valid User", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong password or username, try again", Toast.LENGTH_LONG).show();
                }


            }


        });



        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });

        setTitle("Login");
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "Login please", Toast.LENGTH_LONG).show();
    }
}

