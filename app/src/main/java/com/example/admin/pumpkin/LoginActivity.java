package com.example.admin.pumpkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(new View.OnClickListener()  {

            public void onClick(View view) {
                if (etUsername.getText().toString().equals("Alex") && (etPassword.getText().toString().equals("12"))) {
                    Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
                    LoginActivity.this.startActivity(intent);
                } else {
                    Toast.makeText(getBaseContext(), "Wrong password or username, try again", Toast.LENGTH_LONG).show();
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


  /*  protected void onRestart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG).show();
    }
    */


}

